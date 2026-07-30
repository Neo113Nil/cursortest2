package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.container.CreationTime;
import com.google.android.exoplayer2.container.Mp4LocationData;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DolbyVisionConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final String TAG = "AtomParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    private static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z7) {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z7;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            int i8 = this.index + 1;
            this.index = i8;
            if (i8 == this.length) {
                return false;
            }
            this.offset = this.chunkOffsetsAreLongs ? this.chunkOffsets.readUnsignedLongToLong() : this.chunkOffsets.readUnsignedInt();
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i9 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i9;
                this.nextSamplesPerChunkChangeIndex = i9 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    private static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j8, long j9) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j8;
            this.peakBitrate = j9;
        }
    }

    public static final class MvhdInfo {
        public final Metadata metadata;
        public final long timescale;

        public MvhdInfo(Metadata metadata, long j8) {
            this.metadata = metadata;
            this.timescale = j8;
        }
    }

    private interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    private static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;

        @Nullable
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i8) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i8];
        }
    }

    static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom, Format format) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (readUnsignedIntToInt == 0 || readUnsignedIntToInt % pcmFrameSize != 0) {
                    Log.w(AtomParsers.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + readUnsignedIntToInt);
                    readUnsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = readUnsignedIntToInt == 0 ? -1 : readUnsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i8 = this.fixedSampleSize;
            return i8 == -1 ? this.data.readUnsignedIntToInt() : i8;
        }
    }

    static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i8 = this.fieldSize;
            if (i8 == 8) {
                return this.data.readUnsignedByte();
            }
            if (i8 == 16) {
                return this.data.readUnsignedShort();
            }
            int i9 = this.sampleIndex;
            this.sampleIndex = i9 + 1;
            if (i9 % 2 != 0) {
                return this.currentByte & 15;
            }
            int readUnsignedByte = this.data.readUnsignedByte();
            this.currentByte = readUnsignedByte;
            return (readUnsignedByte & 240) >> 4;
        }
    }

    private static final class TkhdData {
        private final long duration;
        private final int id;
        private final int rotationDegrees;

        public TkhdData(int i8, long j8, int i9) {
            this.id = i8;
            this.duration = j8;
            this.rotationDegrees = i9;
        }
    }

    public static final class UdtaInfo {

        @Nullable
        public final Metadata metaMetadata;

        @Nullable
        public final Metadata smtaMetadata;

        @Nullable
        public final Metadata xyzMetadata;

        public UdtaInfo(@Nullable Metadata metadata, @Nullable Metadata metadata2, @Nullable Metadata metadata3) {
            this.metaMetadata = metadata;
            this.smtaMetadata = metadata2;
            this.xyzMetadata = metadata3;
        }
    }

    private AtomParsers() {
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j8, long j9, long j10) {
        int length = jArr.length - 1;
        return jArr[0] <= j9 && j9 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j10 && j10 <= j8;
    }

    private static boolean canTrimSamplesWithTimestampChange(int i8) {
        return i8 != 1;
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i8, int i9, int i10) {
        int position = parsableByteArray.getPosition();
        ExtractorUtil.checkContainerInput(position >= i9, null);
        while (position - i9 < i10) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i8) {
                return position;
            }
            position += readInt;
        }
        return -1;
    }

    private static int getTrackTypeForHdlr(int i8) {
        if (i8 == TYPE_soun) {
            return 1;
        }
        if (i8 == TYPE_vide) {
            return 2;
        }
        if (i8 == TYPE_text || i8 == TYPE_sbtl || i8 == TYPE_subt || i8 == TYPE_clcp) {
            return 3;
        }
        return i8 == 1835365473 ? 5 : -1;
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i8, int i9, int i10, int i11, String str, boolean z7, @Nullable DrmInitData drmInitData, StsdData stsdData, int i12) {
        int i13;
        int readUnsignedFixedPoint1616;
        int readInt;
        int i14;
        String str2;
        String str3;
        int i15;
        int i16 = i9;
        int i17 = i10;
        DrmInitData drmInitData2 = drmInitData;
        parsableByteArray.setPosition(i16 + 16);
        if (z7) {
            i13 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            i13 = 0;
        }
        if (i13 == 0 || i13 == 1) {
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            readUnsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            readInt = parsableByteArray.readInt();
            if (i13 == 1) {
                parsableByteArray.skipBytes(16);
            }
            i14 = readUnsignedShort;
        } else {
            if (i13 != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            readUnsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            i14 = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(20);
            readInt = 0;
        }
        int position = parsableByteArray.getPosition();
        int i18 = i8;
        if (i18 == 1701733217) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i16, i17);
            if (parseSampleEntryEncryptionData != null) {
                i18 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData2 = drmInitData2 == null ? null : drmInitData2.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i12] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        if (i18 == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (i18 == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (i18 == 1633889588) {
            str2 = MimeTypes.AUDIO_AC4;
        } else if (i18 == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (i18 == 1685353320 || i18 == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (i18 == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (i18 == 1685353336) {
            str2 = MimeTypes.AUDIO_DTS_X;
        } else if (i18 == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else {
            if (i18 != 1935767394) {
                str3 = MimeTypes.AUDIO_RAW;
                if (i18 == 1819304813 || i18 == 1936684916) {
                    i15 = 2;
                } else if (i18 == 1953984371) {
                    i15 = 268435456;
                } else if (i18 == 778924082 || i18 == 778924083) {
                    str2 = MimeTypes.AUDIO_MPEG;
                } else if (i18 == 1835557169) {
                    str2 = MimeTypes.AUDIO_MPEGH_MHA1;
                } else if (i18 == 1835560241) {
                    str2 = MimeTypes.AUDIO_MPEGH_MHM1;
                } else if (i18 == 1634492771) {
                    str2 = MimeTypes.AUDIO_ALAC;
                } else if (i18 == 1634492791) {
                    str2 = MimeTypes.AUDIO_ALAW;
                } else if (i18 == 1970037111) {
                    str2 = MimeTypes.AUDIO_MLAW;
                } else if (i18 == 1332770163) {
                    str2 = MimeTypes.AUDIO_OPUS;
                } else if (i18 == 1716281667) {
                    str2 = MimeTypes.AUDIO_FLAC;
                } else if (i18 == 1835823201) {
                    str2 = MimeTypes.AUDIO_TRUEHD;
                } else {
                    i15 = -1;
                    str3 = null;
                }
                String str4 = str3;
                EsdsData esdsData = null;
                String str5 = null;
                List<byte[]> list = null;
                while (position - i16 < i17) {
                    parsableByteArray.setPosition(position);
                    int readInt2 = parsableByteArray.readInt();
                    ExtractorUtil.checkContainerInput(readInt2 > 0, "childAtomSize must be positive");
                    int readInt3 = parsableByteArray.readInt();
                    if (readInt3 == 1835557187) {
                        int i19 = readInt2 - 13;
                        byte[] bArr = new byte[i19];
                        parsableByteArray.setPosition(position + 13);
                        parsableByteArray.readBytes(bArr, 0, i19);
                        list = ImmutableList.of(bArr);
                    } else {
                        if (readInt3 == 1702061171 || (z7 && readInt3 == 2002876005)) {
                            int findBoxPosition = readInt3 == 1702061171 ? position : findBoxPosition(parsableByteArray, Atom.TYPE_esds, position, readInt2);
                            if (findBoxPosition != -1) {
                                esdsData = parseEsdsFromParent(parsableByteArray, findBoxPosition);
                                str4 = esdsData.mimeType;
                                byte[] bArr2 = esdsData.initializationData;
                                if (bArr2 != null) {
                                    if (MimeTypes.AUDIO_AAC.equals(str4)) {
                                        AacUtil.Config parseAudioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr2);
                                        readUnsignedFixedPoint1616 = parseAudioSpecificConfig.sampleRateHz;
                                        i14 = parseAudioSpecificConfig.channelCount;
                                        str5 = parseAudioSpecificConfig.codecs;
                                    }
                                    list = ImmutableList.of(bArr2);
                                }
                            }
                        } else if (readInt3 == 1684103987) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i11), str, drmInitData2);
                        } else if (readInt3 == 1684366131) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i11), str, drmInitData2);
                        } else if (readInt3 == 1684103988) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac4Util.parseAc4AnnexEFormat(parsableByteArray, Integer.toString(i11), str, drmInitData2);
                        } else if (readInt3 == 1684892784) {
                            if (readInt <= 0) {
                                throw ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + readInt, null);
                            }
                            readUnsignedFixedPoint1616 = readInt;
                            i14 = 2;
                        } else if (readInt3 == 1684305011 || readInt3 == 1969517683) {
                            stsdData.format = new Format.Builder().setId(i11).setSampleMimeType(str4).setChannelCount(i14).setSampleRate(readUnsignedFixedPoint1616).setDrmInitData(drmInitData2).setLanguage(str).build();
                        } else if (readInt3 == 1682927731) {
                            int i20 = readInt2 - 8;
                            byte[] bArr3 = opusMagic;
                            byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i20);
                            parsableByteArray.setPosition(position + 8);
                            parsableByteArray.readBytes(copyOf, bArr3.length, i20);
                            list = OpusUtil.buildInitializationData(copyOf);
                        } else if (readInt3 == 1684425825) {
                            byte[] bArr4 = new byte[readInt2 - 8];
                            bArr4[0] = a4.a.f23c1;
                            bArr4[1] = 76;
                            bArr4[2] = a4.a.X0;
                            bArr4[3] = 67;
                            parsableByteArray.setPosition(position + 12);
                            parsableByteArray.readBytes(bArr4, 4, readInt2 - 12);
                            list = ImmutableList.of(bArr4);
                        } else if (readInt3 == 1634492771) {
                            int i21 = readInt2 - 12;
                            byte[] bArr5 = new byte[i21];
                            parsableByteArray.setPosition(position + 12);
                            parsableByteArray.readBytes(bArr5, 0, i21);
                            Pair<Integer, Integer> parseAlacAudioSpecificConfig = CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr5);
                            int intValue = ((Integer) parseAlacAudioSpecificConfig.first).intValue();
                            int intValue2 = ((Integer) parseAlacAudioSpecificConfig.second).intValue();
                            list = ImmutableList.of(bArr5);
                            i14 = intValue2;
                            readUnsignedFixedPoint1616 = intValue;
                        }
                        position += readInt2;
                        i16 = i9;
                        i17 = i10;
                    }
                    position += readInt2;
                    i16 = i9;
                    i17 = i10;
                }
                if (stsdData.format == null || str4 == null) {
                }
                Format.Builder language = new Format.Builder().setId(i11).setSampleMimeType(str4).setCodecs(str5).setChannelCount(i14).setSampleRate(readUnsignedFixedPoint1616).setPcmEncoding(i15).setInitializationData(list).setDrmInitData(drmInitData2).setLanguage(str);
                if (esdsData != null) {
                    language.setAverageBitrate(Ints.saturatedCast(esdsData.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsData.peakBitrate));
                }
                stsdData.format = language.build();
                return;
            }
            str2 = MimeTypes.AUDIO_AMR_WB;
        }
        str3 = str2;
        i15 = -1;
        String str42 = str3;
        EsdsData esdsData2 = null;
        String str52 = null;
        List<byte[]> list2 = null;
        while (position - i16 < i17) {
        }
        if (stsdData.format == null) {
        }
    }

    @Nullable
    static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i8, int i9) {
        int i10 = i8 + 8;
        String str = null;
        Integer num = null;
        int i11 = -1;
        int i12 = 0;
        while (i10 - i8 < i9) {
            parsableByteArray.setPosition(i10);
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1718775137) {
                num = Integer.valueOf(parsableByteArray.readInt());
            } else if (readInt2 == 1935894637) {
                parsableByteArray.skipBytes(4);
                str = parsableByteArray.readString(4);
            } else if (readInt2 == 1935894633) {
                i11 = i10;
                i12 = readInt;
            }
            i10 += readInt;
        }
        if (!C.CENC_TYPE_cenc.equals(str) && !C.CENC_TYPE_cbc1.equals(str) && !C.CENC_TYPE_cens.equals(str) && !C.CENC_TYPE_cbcs.equals(str)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(num != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i11 != -1, "schi atom is mandatory");
        TrackEncryptionBox parseSchiFromParent = parseSchiFromParent(parsableByteArray, i11, i12, str);
        ExtractorUtil.checkContainerInput(parseSchiFromParent != null, "tenc atom is mandatory");
        return Pair.create(num, (TrackEncryptionBox) Util.castNonNull(parseSchiFromParent));
    }

    @Nullable
    private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_elst);
        if (leafAtomOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[readUnsignedIntToInt];
        long[] jArr2 = new long[readUnsignedIntToInt];
        for (int i8 = 0; i8 < readUnsignedIntToInt; i8++) {
            jArr[i8] = parseFullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i8] = parseFullAtomVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i8) {
        parsableByteArray.setPosition(i8 + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((readUnsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if (MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int parseExpandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[parseExpandableClassSize];
        parsableByteArray.readBytes(bArr, 0, parseExpandableClassSize);
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, readUnsignedInt2 > 0 ? readUnsignedInt2 : -1L, readUnsignedInt > 0 ? readUnsignedInt : -1L);
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i8 = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = parsableByteArray.readUnsignedByte();
            i8 = (i8 << 7) | (readUnsignedByte & 127);
        }
        return i8;
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    @Nullable
    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i8) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i8) {
            Metadata.Entry parseIlstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (parseIlstElement != null) {
                arrayList.add(parseIlstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 4 : 8);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(readUnsignedInt), "" + ((char) (((readUnsignedShort >> 10) & 31) + 96)) + ((char) (((readUnsignedShort >> 5) & 31) + 96)) + ((char) ((readUnsignedShort & 31) + 96)));
    }

    @Nullable
    public static Metadata parseMdtaFromMeta(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_hdlr);
        Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_keys);
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_ilst);
        if (leafAtomOfType == null || leafAtomOfType2 == null || leafAtomOfType3 == null || parseHdlr(leafAtomOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType2.data;
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        String[] strArr = new String[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            int readInt2 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i8] = parsableByteArray.readString(readInt2 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int readInt3 = parsableByteArray2.readInt();
            int readInt4 = parsableByteArray2.readInt() - 1;
            if (readInt4 < 0 || readInt4 >= readInt) {
                Log.w(TAG, "Skipped metadata with unknown key index: " + readInt4);
            } else {
                MdtaMetadataEntry parseMdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + readInt3, strArr[readInt4]);
                if (parseMdtaMetadataEntryFromIlst != null) {
                    arrayList.add(parseMdtaMetadataEntryFromIlst);
                }
            }
            parsableByteArray2.setPosition(position + readInt3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i8, int i9, int i10, StsdData stsdData) {
        parsableByteArray.setPosition(i9 + 16);
        if (i8 == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String readNullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (readNullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i10).setSampleMimeType(readNullTerminatedString).build();
            }
        }
    }

    public static MvhdInfo parseMvhd(ParsableByteArray parsableByteArray) {
        long j8;
        parsableByteArray.setPosition(8);
        if (Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 0) {
            j8 = parsableByteArray.readUnsignedInt();
            parsableByteArray.skipBytes(4);
        } else {
            long readLong = parsableByteArray.readLong();
            parsableByteArray.skipBytes(8);
            j8 = readLong;
        }
        return new MvhdInfo(new Metadata(new CreationTime((j8 - 2082844800) * 1000)), parsableByteArray.readUnsignedInt());
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i8) {
        parsableByteArray.setPosition(i8 + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    @Nullable
    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i8, int i9) {
        int i10 = i8 + 8;
        while (i10 - i8 < i9) {
            parsableByteArray.setPosition(i10);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i10, readInt + i10);
            }
            i10 += readInt;
        }
        return null;
    }

    @Nullable
    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i8, int i9) {
        Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i8 < i9) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (parseCommonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, readInt)) != null) {
                return parseCommonEncryptionSinfFromParent;
            }
            position += readInt;
        }
        return null;
    }

    @Nullable
    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i8, int i9, String str) {
        int i10;
        int i11;
        int i12 = i8 + 8;
        while (true) {
            byte[] bArr = null;
            if (i12 - i8 >= i9) {
                return null;
            }
            parsableByteArray.setPosition(i12);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (parseFullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i11 = 0;
                    i10 = 0;
                } else {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    i10 = readUnsignedByte & 15;
                    i11 = (readUnsignedByte & 240) >> 4;
                }
                boolean z7 = parsableByteArray.readUnsignedByte() == 1;
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z7 && readUnsignedByte2 == 0) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[readUnsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, readUnsignedByte3);
                }
                return new TrackEncryptionBox(z7, str, readUnsignedByte2, bArr2, i11, i10, bArr);
            }
            i12 += readInt;
        }
    }

    @Nullable
    private static Metadata parseSmta(ParsableByteArray parsableByteArray, int i8) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i8) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1935766900) {
                if (readInt < 14) {
                    return null;
                }
                parsableByteArray.skipBytes(5);
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                if (readUnsignedByte != 12 && readUnsignedByte != 13) {
                    return null;
                }
                float f8 = readUnsignedByte == 12 ? 240.0f : 120.0f;
                parsableByteArray.skipBytes(1);
                return new Metadata(new SmtaMetadataEntry(f8, parsableByteArray.readUnsignedByte()));
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0428 A[EDGE_INSN: B:97:0x0428->B:98:0x0428 BREAK  A[LOOP:2: B:76:0x03c7->B:92:0x0421], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TrackSampleTable parseStbl(Track track, Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder) {
        SampleSizeBox stz2SampleSizeBox;
        boolean z7;
        int i8;
        int i9;
        int i10;
        int fixedSampleSize;
        int i11;
        boolean z8;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z9;
        int i16;
        Track track2;
        int i17;
        long[] jArr;
        int[] iArr;
        int i18;
        long j8;
        long[] jArr2;
        int[] iArr2;
        int i19;
        int i20;
        long[] jArr3;
        int i21;
        int i22;
        long[] jArr4;
        int i23;
        boolean z10;
        int i24;
        long[] jArr5;
        int i25;
        long[] jArr6;
        int[] iArr3;
        int i26;
        boolean z11;
        int i27;
        int i28;
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_stsz);
        if (leafAtomOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafAtomOfType, track.format);
        } else {
            Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_stz2);
            if (leafAtomOfType2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafAtomOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_stco);
        if (leafAtomOfType3 == null) {
            leafAtomOfType3 = (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_co64));
            z7 = true;
        } else {
            z7 = false;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType3.data;
        ParsableByteArray parsableByteArray2 = ((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_stsc))).data;
        ParsableByteArray parsableByteArray3 = ((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_stts))).data;
        Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(Atom.TYPE_stss);
        ParsableByteArray parsableByteArray4 = leafAtomOfType4 != null ? leafAtomOfType4.data : null;
        Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(Atom.TYPE_ctts);
        ParsableByteArray parsableByteArray5 = leafAtomOfType5 != null ? leafAtomOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray2, parsableByteArray, z7);
        parsableByteArray3.setPosition(12);
        int readUnsignedIntToInt = parsableByteArray3.readUnsignedIntToInt() - 1;
        int readUnsignedIntToInt2 = parsableByteArray3.readUnsignedIntToInt();
        int readUnsignedIntToInt3 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            i8 = parsableByteArray5.readUnsignedIntToInt();
        } else {
            i8 = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            i9 = parsableByteArray4.readUnsignedIntToInt();
            if (i9 > 0) {
                i10 = parsableByteArray4.readUnsignedIntToInt() - 1;
                fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
                String str = track.format.sampleMimeType;
                if (fixedSampleSize == -1 && ((MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && readUnsignedIntToInt == 0 && i8 == 0 && i9 == 0)) {
                    i11 = i9;
                    z8 = true;
                } else {
                    i11 = i9;
                    z8 = false;
                }
                if (z8) {
                    long[] jArr7 = new long[sampleCount];
                    int[] iArr4 = new int[sampleCount];
                    long[] jArr8 = new long[sampleCount];
                    int[] iArr5 = new int[sampleCount];
                    int i29 = i10;
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 0;
                    long j9 = 0;
                    long j10 = 0;
                    int i35 = i8;
                    int i36 = readUnsignedIntToInt3;
                    int i37 = readUnsignedIntToInt2;
                    int i38 = readUnsignedIntToInt;
                    int i39 = i11;
                    while (true) {
                        i12 = i38;
                        if (i30 >= sampleCount) {
                            i13 = i37;
                            i14 = i32;
                            i15 = i33;
                            break;
                        }
                        long j11 = j10;
                        int i40 = i33;
                        boolean z12 = true;
                        while (i40 == 0) {
                            z12 = chunkIterator.moveNext();
                            if (!z12) {
                                break;
                            }
                            int i41 = i37;
                            long j12 = chunkIterator.offset;
                            i40 = chunkIterator.numSamples;
                            j11 = j12;
                            i37 = i41;
                            i36 = i36;
                            sampleCount = sampleCount;
                        }
                        int i42 = sampleCount;
                        i13 = i37;
                        int i43 = i36;
                        if (!z12) {
                            Log.w(TAG, "Unexpected end of chunk data");
                            jArr7 = Arrays.copyOf(jArr7, i30);
                            iArr4 = Arrays.copyOf(iArr4, i30);
                            jArr8 = Arrays.copyOf(jArr8, i30);
                            iArr5 = Arrays.copyOf(iArr5, i30);
                            sampleCount = i30;
                            i14 = i32;
                            i15 = i40;
                            break;
                        }
                        if (parsableByteArray5 != null) {
                            while (i34 == 0 && i35 > 0) {
                                i34 = parsableByteArray5.readUnsignedIntToInt();
                                i32 = parsableByteArray5.readInt();
                                i35--;
                            }
                            i34--;
                        }
                        int i44 = i32;
                        jArr7[i30] = j11;
                        int readNextSampleSize = stz2SampleSizeBox.readNextSampleSize();
                        iArr4[i30] = readNextSampleSize;
                        if (readNextSampleSize > i31) {
                            i31 = readNextSampleSize;
                        }
                        jArr8[i30] = j9 + i44;
                        iArr5[i30] = parsableByteArray4 == null ? 1 : 0;
                        if (i30 == i29) {
                            iArr5[i30] = 1;
                            i39--;
                            if (i39 > 0) {
                                i29 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray4)).readUnsignedIntToInt() - 1;
                            }
                        }
                        int i45 = i29;
                        j9 += i43;
                        int i46 = i13 - 1;
                        if (i46 != 0 || i12 <= 0) {
                            i19 = i43;
                            i20 = i12;
                        } else {
                            i46 = parsableByteArray3.readUnsignedIntToInt();
                            i19 = parsableByteArray3.readInt();
                            i20 = i12 - 1;
                        }
                        int i47 = i46;
                        long j13 = j11 + iArr4[i30];
                        i33 = i40 - 1;
                        i30++;
                        j10 = j13;
                        i29 = i45;
                        i36 = i19;
                        sampleCount = i42;
                        i32 = i44;
                        i38 = i20;
                        i37 = i47;
                    }
                    long j14 = j9 + i14;
                    if (parsableByteArray5 != null) {
                        while (i35 > 0) {
                            if (parsableByteArray5.readUnsignedIntToInt() != 0) {
                                z9 = false;
                                break;
                            }
                            parsableByteArray5.readInt();
                            i35--;
                        }
                    }
                    z9 = true;
                    if (i39 == 0 && i13 == 0 && i15 == 0 && i12 == 0) {
                        i16 = i34;
                        if (i16 == 0 && z9) {
                            track2 = track;
                            i17 = sampleCount;
                            jArr = jArr7;
                            iArr = iArr4;
                            i18 = i31;
                            j8 = j14;
                            jArr2 = jArr8;
                            iArr2 = iArr5;
                        }
                    } else {
                        i16 = i34;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Inconsistent stbl box for track ");
                    track2 = track;
                    sb.append(track2.id);
                    sb.append(": remainingSynchronizationSamples ");
                    sb.append(i39);
                    sb.append(", remainingSamplesAtTimestampDelta ");
                    sb.append(i13);
                    sb.append(", remainingSamplesInChunk ");
                    sb.append(i15);
                    sb.append(", remainingTimestampDeltaChanges ");
                    sb.append(i12);
                    sb.append(", remainingSamplesAtTimestampOffset ");
                    sb.append(i16);
                    sb.append(!z9 ? ", ctts invalid" : "");
                    Log.w(TAG, sb.toString());
                    i17 = sampleCount;
                    jArr = jArr7;
                    iArr = iArr4;
                    i18 = i31;
                    j8 = j14;
                    jArr2 = jArr8;
                    iArr2 = iArr5;
                } else {
                    int i48 = chunkIterator.length;
                    long[] jArr9 = new long[i48];
                    int[] iArr6 = new int[i48];
                    while (chunkIterator.moveNext()) {
                        int i49 = chunkIterator.index;
                        jArr9[i49] = chunkIterator.offset;
                        iArr6[i49] = chunkIterator.numSamples;
                    }
                    FixedSampleSizeRechunker.Results rechunk = FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr9, iArr6, readUnsignedIntToInt3);
                    long[] jArr10 = rechunk.offsets;
                    int[] iArr7 = rechunk.sizes;
                    int i50 = rechunk.maximumSize;
                    long[] jArr11 = rechunk.timestamps;
                    int[] iArr8 = rechunk.flags;
                    long j15 = rechunk.duration;
                    track2 = track;
                    i17 = sampleCount;
                    jArr = jArr10;
                    iArr = iArr7;
                    i18 = i50;
                    iArr2 = iArr8;
                    j8 = j15;
                    jArr2 = jArr11;
                }
                long scaleLargeTimestamp = Util.scaleLargeTimestamp(j8, 1000000L, track2.timescale);
                jArr3 = track2.editListDurations;
                if (jArr3 != null) {
                    Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
                    return new TrackSampleTable(track, jArr, iArr, i18, jArr2, iArr2, scaleLargeTimestamp);
                }
                if (jArr3.length == 1 && track2.type == 1 && jArr2.length >= 2) {
                    long j16 = ((long[]) Assertions.checkNotNull(track2.editListMediaTimes))[0];
                    long scaleLargeTimestamp2 = j16 + Util.scaleLargeTimestamp(track2.editListDurations[0], track2.timescale, track2.movieTimescale);
                    i21 = i17;
                    if (canApplyEditWithGaplessInfo(jArr2, j8, j16, scaleLargeTimestamp2)) {
                        long scaleLargeTimestamp3 = Util.scaleLargeTimestamp(j16 - jArr2[0], track2.format.sampleRate, track2.timescale);
                        i22 = i18;
                        long scaleLargeTimestamp4 = Util.scaleLargeTimestamp(j8 - scaleLargeTimestamp2, track2.format.sampleRate, track2.timescale);
                        if ((scaleLargeTimestamp3 != 0 || scaleLargeTimestamp4 != 0) && scaleLargeTimestamp3 <= 2147483647L && scaleLargeTimestamp4 <= 2147483647L) {
                            gaplessInfoHolder.encoderDelay = (int) scaleLargeTimestamp3;
                            gaplessInfoHolder.encoderPadding = (int) scaleLargeTimestamp4;
                            Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
                            return new TrackSampleTable(track, jArr, iArr, i22, jArr2, iArr2, Util.scaleLargeTimestamp(track2.editListDurations[0], 1000000L, track2.movieTimescale));
                        }
                        jArr4 = track2.editListDurations;
                        if (jArr4.length != 1 && jArr4[0] == 0) {
                            long j17 = ((long[]) Assertions.checkNotNull(track2.editListMediaTimes))[0];
                            for (int i51 = 0; i51 < jArr2.length; i51++) {
                                jArr2[i51] = Util.scaleLargeTimestamp(jArr2[i51] - j17, 1000000L, track2.timescale);
                            }
                            return new TrackSampleTable(track, jArr, iArr, i22, jArr2, iArr2, Util.scaleLargeTimestamp(j8 - j17, 1000000L, track2.timescale));
                        }
                        boolean z13 = track2.type != 1;
                        int[] iArr9 = new int[jArr4.length];
                        int[] iArr10 = new int[jArr4.length];
                        long[] jArr12 = (long[]) Assertions.checkNotNull(track2.editListMediaTimes);
                        i23 = 0;
                        z10 = false;
                        int i52 = 0;
                        i24 = 0;
                        while (true) {
                            jArr5 = track2.editListDurations;
                            if (i23 < jArr5.length) {
                                break;
                            }
                            long[] jArr13 = jArr;
                            int[] iArr11 = iArr;
                            long j18 = jArr12[i23];
                            if (j18 != -1) {
                                int i53 = i24;
                                boolean z14 = z10;
                                int i54 = i52;
                                long scaleLargeTimestamp5 = Util.scaleLargeTimestamp(jArr5[i23], track2.timescale, track2.movieTimescale);
                                iArr9[i23] = Util.binarySearchFloor(jArr2, j18, true, true);
                                iArr10[i23] = Util.binarySearchCeil(jArr2, j18 + scaleLargeTimestamp5, z13, false);
                                while (true) {
                                    i28 = iArr9[i23];
                                    i27 = iArr10[i23];
                                    if (i28 >= i27 || (iArr2[i28] & 1) != 0) {
                                        break;
                                    }
                                    iArr9[i23] = i28 + 1;
                                }
                                i52 = i54 + (i27 - i28);
                                z11 = z14 | (i53 != i28);
                            } else {
                                z11 = z10;
                                i27 = i24;
                            }
                            i23++;
                            z10 = z11;
                            i24 = i27;
                            jArr = jArr13;
                            iArr = iArr11;
                        }
                        long[] jArr14 = jArr;
                        int[] iArr12 = iArr;
                        boolean z15 = z10;
                        i25 = 0;
                        boolean z16 = z15 | (i52 != i21);
                        long[] jArr15 = !z16 ? new long[i52] : jArr14;
                        int[] iArr13 = !z16 ? new int[i52] : iArr12;
                        int i55 = !z16 ? 0 : i22;
                        int[] iArr14 = !z16 ? new int[i52] : iArr2;
                        long[] jArr16 = new long[i52];
                        int i56 = i55;
                        int[] iArr15 = iArr12;
                        long j19 = 0;
                        int i57 = 0;
                        while (i25 < track2.editListDurations.length) {
                            long j20 = track2.editListMediaTimes[i25];
                            int i58 = iArr9[i25];
                            int[] iArr16 = iArr9;
                            int i59 = iArr10[i25];
                            int[] iArr17 = iArr10;
                            if (z16) {
                                int i60 = i59 - i58;
                                System.arraycopy(jArr14, i58, jArr15, i57, i60);
                                jArr6 = jArr14;
                                iArr3 = iArr15;
                                System.arraycopy(iArr3, i58, iArr13, i57, i60);
                                System.arraycopy(iArr2, i58, iArr14, i57, i60);
                            } else {
                                jArr6 = jArr14;
                                iArr3 = iArr15;
                            }
                            int i61 = i56;
                            while (i58 < i59) {
                                int i62 = i61;
                                int i63 = i59;
                                long scaleLargeTimestamp6 = Util.scaleLargeTimestamp(j19, 1000000L, track2.movieTimescale);
                                long[] jArr17 = jArr2;
                                int[] iArr18 = iArr2;
                                long scaleLargeTimestamp7 = Util.scaleLargeTimestamp(jArr2[i58] - j20, 1000000L, track2.timescale);
                                int[] iArr19 = iArr14;
                                long j21 = j19;
                                if (canTrimSamplesWithTimestampChange(track2.type)) {
                                    scaleLargeTimestamp7 = Math.max(0L, scaleLargeTimestamp7);
                                }
                                jArr16[i57] = scaleLargeTimestamp6 + scaleLargeTimestamp7;
                                if (z16) {
                                    i26 = i62;
                                    if (iArr13[i57] > i26) {
                                        i61 = iArr3[i58];
                                        i57++;
                                        i58++;
                                        i59 = i63;
                                        jArr2 = jArr17;
                                        iArr2 = iArr18;
                                        j19 = j21;
                                        iArr14 = iArr19;
                                    }
                                } else {
                                    i26 = i62;
                                }
                                i61 = i26;
                                i57++;
                                i58++;
                                i59 = i63;
                                jArr2 = jArr17;
                                iArr2 = iArr18;
                                j19 = j21;
                                iArr14 = iArr19;
                            }
                            long[] jArr18 = jArr2;
                            long j22 = j19 + track2.editListDurations[i25];
                            i25++;
                            i56 = i61;
                            iArr15 = iArr3;
                            j19 = j22;
                            iArr9 = iArr16;
                            jArr2 = jArr18;
                            iArr2 = iArr2;
                            iArr10 = iArr17;
                            jArr14 = jArr6;
                            iArr14 = iArr14;
                        }
                        return new TrackSampleTable(track, jArr15, iArr13, i56, jArr16, iArr14, Util.scaleLargeTimestamp(j19, 1000000L, track2.movieTimescale));
                    }
                } else {
                    i21 = i17;
                }
                i22 = i18;
                jArr4 = track2.editListDurations;
                if (jArr4.length != 1) {
                }
                if (track2.type != 1) {
                }
                int[] iArr92 = new int[jArr4.length];
                int[] iArr102 = new int[jArr4.length];
                long[] jArr122 = (long[]) Assertions.checkNotNull(track2.editListMediaTimes);
                i23 = 0;
                z10 = false;
                int i522 = 0;
                i24 = 0;
                while (true) {
                    jArr5 = track2.editListDurations;
                    if (i23 < jArr5.length) {
                    }
                    i23++;
                    z10 = z11;
                    i24 = i27;
                    jArr = jArr13;
                    iArr = iArr11;
                }
                long[] jArr142 = jArr;
                int[] iArr122 = iArr;
                boolean z152 = z10;
                i25 = 0;
                boolean z162 = z152 | (i522 != i21);
                if (!z162) {
                }
                if (!z162) {
                }
                if (!z162) {
                }
                if (!z162) {
                }
                long[] jArr162 = new long[i522];
                int i562 = i55;
                int[] iArr152 = iArr122;
                long j192 = 0;
                int i572 = 0;
                while (i25 < track2.editListDurations.length) {
                }
                return new TrackSampleTable(track, jArr15, iArr13, i562, jArr162, iArr14, Util.scaleLargeTimestamp(j192, 1000000L, track2.movieTimescale));
            }
            parsableByteArray4 = null;
        } else {
            i9 = 0;
        }
        i10 = -1;
        fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
        String str2 = track.format.sampleMimeType;
        if (fixedSampleSize == -1) {
        }
        i11 = i9;
        z8 = false;
        if (z8) {
        }
        long scaleLargeTimestamp8 = Util.scaleLargeTimestamp(j8, 1000000L, track2.timescale);
        jArr3 = track2.editListDurations;
        if (jArr3 != null) {
        }
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i8, int i9, String str, @Nullable DrmInitData drmInitData, boolean z7) {
        int i10;
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            int position = parsableByteArray.getPosition();
            int readInt2 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt2 > 0, "childAtomSize must be positive");
            int readInt3 = parsableByteArray.readInt();
            if (readInt3 == 1635148593 || readInt3 == 1635148595 || readInt3 == 1701733238 || readInt3 == 1831958048 || readInt3 == 1836070006 || readInt3 == 1752589105 || readInt3 == 1751479857 || readInt3 == 1932670515 || readInt3 == 1211250227 || readInt3 == 1987063864 || readInt3 == 1987063865 || readInt3 == 1635135537 || readInt3 == 1685479798 || readInt3 == 1685479729 || readInt3 == 1685481573 || readInt3 == 1685481521) {
                i10 = position;
                parseVideoSampleEntry(parsableByteArray, readInt3, i10, readInt2, i8, i9, drmInitData, stsdData, i11);
            } else if (readInt3 == 1836069985 || readInt3 == 1701733217 || readInt3 == 1633889587 || readInt3 == 1700998451 || readInt3 == 1633889588 || readInt3 == 1835823201 || readInt3 == 1685353315 || readInt3 == 1685353317 || readInt3 == 1685353320 || readInt3 == 1685353324 || readInt3 == 1685353336 || readInt3 == 1935764850 || readInt3 == 1935767394 || readInt3 == 1819304813 || readInt3 == 1936684916 || readInt3 == 1953984371 || readInt3 == 778924082 || readInt3 == 778924083 || readInt3 == 1835557169 || readInt3 == 1835560241 || readInt3 == 1634492771 || readInt3 == 1634492791 || readInt3 == 1970037111 || readInt3 == 1332770163 || readInt3 == 1716281667) {
                i10 = position;
                parseAudioSampleEntry(parsableByteArray, readInt3, position, readInt2, i8, str, z7, drmInitData, stsdData, i11);
            } else {
                if (readInt3 == 1414810956 || readInt3 == 1954034535 || readInt3 == 2004251764 || readInt3 == 1937010800 || readInt3 == 1664495672) {
                    parseTextSampleEntry(parsableByteArray, readInt3, position, readInt2, i8, str, stsdData);
                } else if (readInt3 == 1835365492) {
                    parseMetaDataSampleEntry(parsableByteArray, readInt3, position, i8, stsdData);
                } else if (readInt3 == 1667329389) {
                    stsdData.format = new Format.Builder().setId(i8).setSampleMimeType(MimeTypes.APPLICATION_CAMERA_MOTION).build();
                }
                i10 = position;
            }
            parsableByteArray.setPosition(i10 + readInt2);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i8, int i9, int i10, int i11, String str, StsdData stsdData) {
        parsableByteArray.setPosition(i9 + 16);
        String str2 = MimeTypes.APPLICATION_TTML;
        ImmutableList immutableList = null;
        long j8 = Long.MAX_VALUE;
        if (i8 != 1414810956) {
            if (i8 == 1954034535) {
                int i12 = i10 - 16;
                byte[] bArr = new byte[i12];
                parsableByteArray.readBytes(bArr, 0, i12);
                immutableList = ImmutableList.of(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i8 == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i8 == 1937010800) {
                j8 = 0;
            } else {
                if (i8 != 1664495672) {
                    throw new IllegalStateException();
                }
                stsdData.requiredSampleTransformation = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            }
        }
        stsdData.format = new Format.Builder().setId(i11).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j8).setInitializationData(immutableList).build();
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j8;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        int readInt = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i8 = parseFullAtomVersion == 0 ? 4 : 8;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            j8 = C.TIME_UNSET;
            if (i10 >= i8) {
                parsableByteArray.skipBytes(i8);
                break;
            }
            if (parsableByteArray.getData()[position + i10] != -1) {
                long readUnsignedInt = parseFullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (readUnsignedInt != 0) {
                    j8 = readUnsignedInt;
                }
            } else {
                i10++;
            }
        }
        parsableByteArray.skipBytes(16);
        int readInt2 = parsableByteArray.readInt();
        int readInt3 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int readInt4 = parsableByteArray.readInt();
        int readInt5 = parsableByteArray.readInt();
        if (readInt2 == 0 && readInt3 == 65536 && readInt4 == -65536 && readInt5 == 0) {
            i9 = 90;
        } else if (readInt2 == 0 && readInt3 == -65536 && readInt4 == 65536 && readInt5 == 0) {
            i9 = 270;
        } else if (readInt2 == -65536 && readInt3 == 0 && readInt4 == 0 && readInt5 == -65536) {
            i9 = com.crrepa.band.my.device.customkey.util.c.MAX_GOAL_TIME;
        }
        return new TkhdData(readInt, j8, i9);
    }

    @Nullable
    private static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j8, @Nullable DrmInitData drmInitData, boolean z7, boolean z8) {
        Atom.LeafAtom leafAtom2;
        long j9;
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType;
        Pair<long[], long[]> parseEdts;
        Atom.ContainerAtom containerAtom2 = (Atom.ContainerAtom) Assertions.checkNotNull(containerAtom.getContainerAtomOfType(Atom.TYPE_mdia));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(Atom.TYPE_hdlr))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData parseTkhd = parseTkhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_tkhd))).data);
        long j10 = C.TIME_UNSET;
        if (j8 == C.TIME_UNSET) {
            leafAtom2 = leafAtom;
            j9 = parseTkhd.duration;
        } else {
            leafAtom2 = leafAtom;
            j9 = j8;
        }
        long j11 = parseMvhd(leafAtom2.data).timescale;
        if (j9 != C.TIME_UNSET) {
            j10 = Util.scaleLargeTimestamp(j9, 1000000L, j11);
        }
        long j12 = j10;
        Atom.ContainerAtom containerAtom3 = (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(Atom.TYPE_minf))).getContainerAtomOfType(Atom.TYPE_stbl));
        Pair<Long, String> parseMdhd = parseMdhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(Atom.TYPE_mdhd))).data);
        Atom.LeafAtom leafAtomOfType = containerAtom3.getLeafAtomOfType(Atom.TYPE_stsd);
        if (leafAtomOfType == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        StsdData parseStsd = parseStsd(leafAtomOfType.data, parseTkhd.id, parseTkhd.rotationDegrees, (String) parseMdhd.second, drmInitData, z8);
        if (z7 || (containerAtomOfType = containerAtom.getContainerAtomOfType(Atom.TYPE_edts)) == null || (parseEdts = parseEdts(containerAtomOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) parseEdts.first;
            jArr2 = (long[]) parseEdts.second;
            jArr = jArr3;
        }
        if (parseStsd.format == null) {
            return null;
        }
        return new Track(parseTkhd.id, trackTypeForHdlr, ((Long) parseMdhd.first).longValue(), j11, j12, parseStsd.format, parseStsd.requiredSampleTransformation, parseStsd.trackEncryptionBoxes, parseStsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    public static List<TrackSampleTable> parseTraks(Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder, long j8, @Nullable DrmInitData drmInitData, boolean z7, boolean z8, Function<Track, Track> function) {
        Track apply;
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < containerAtom.containerChildren.size(); i8++) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i8);
            if (containerAtom2.type == 1953653099 && (apply = function.apply(parseTrak(containerAtom2, (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_mvhd)), j8, drmInitData, z7, z8))) != null) {
                arrayList.add(parseStbl(apply, (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(Atom.TYPE_mdia))).getContainerAtomOfType(Atom.TYPE_minf))).getContainerAtomOfType(Atom.TYPE_stbl)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    public static UdtaInfo parseUdta(Atom.LeafAtom leafAtom) {
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = null;
        Metadata metadata2 = null;
        Metadata metadata3 = null;
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = parseUdtaMeta(parsableByteArray, position + readInt);
            } else if (readInt2 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata2 = parseSmta(parsableByteArray, position + readInt);
            } else if (readInt2 == -1451722374) {
                metadata3 = parseXyz(parsableByteArray);
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return new UdtaInfo(metadata, metadata2, metadata3);
    }

    @Nullable
    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i8) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaAtomHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i8) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + readInt);
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return null;
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i8, int i9, int i10, int i11, int i12, @Nullable DrmInitData drmInitData, StsdData stsdData, int i13) {
        String str;
        DrmInitData drmInitData2;
        int i14;
        int i15;
        float f8;
        List<byte[]> list;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        int i20;
        String str3;
        int i21 = i9;
        int i22 = i10;
        DrmInitData drmInitData3 = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i21 + 16);
        parsableByteArray.skipBytes(16);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int i23 = i8;
        if (i23 == 1701733238) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i21, i22);
            if (parseSampleEntryEncryptionData != null) {
                i23 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData3 = drmInitData3 == null ? null : drmInitData3.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i13] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str4 = MimeTypes.VIDEO_H263;
        String str5 = i23 == 1831958048 ? MimeTypes.VIDEO_MPEG : i23 == 1211250227 ? MimeTypes.VIDEO_H263 : null;
        float f9 = 1.0f;
        String str6 = null;
        List<byte[]> list2 = null;
        byte[] bArr = null;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        ByteBuffer byteBuffer = null;
        EsdsData esdsData = null;
        boolean z7 = false;
        while (position - i21 < i22) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (readInt == 0) {
                str = str4;
                if (parsableByteArray.getPosition() - i21 == i22) {
                    break;
                }
            } else {
                str = str4;
            }
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1635148611) {
                ExtractorUtil.checkContainerInput(str5 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig parse = AvcConfig.parse(parsableByteArray);
                list2 = parse.initializationData;
                stsdData2.nalUnitLengthFieldLength = parse.nalUnitLengthFieldLength;
                if (!z7) {
                    f9 = parse.pixelWidthHeightRatio;
                }
                str6 = parse.codecs;
                i18 = parse.colorSpace;
                i19 = parse.colorRange;
                i20 = parse.colorTransfer;
                str3 = MimeTypes.VIDEO_H264;
            } else if (readInt2 == 1752589123) {
                ExtractorUtil.checkContainerInput(str5 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                HevcConfig parse2 = HevcConfig.parse(parsableByteArray);
                list2 = parse2.initializationData;
                stsdData2.nalUnitLengthFieldLength = parse2.nalUnitLengthFieldLength;
                if (!z7) {
                    f9 = parse2.pixelWidthHeightRatio;
                }
                str6 = parse2.codecs;
                i18 = parse2.colorSpace;
                i19 = parse2.colorRange;
                i20 = parse2.colorTransfer;
                str3 = MimeTypes.VIDEO_H265;
            } else {
                if (readInt2 == 1685480259 || readInt2 == 1685485123) {
                    drmInitData2 = drmInitData3;
                    i14 = readUnsignedShort2;
                    i15 = i23;
                    f8 = f9;
                    list = list2;
                    i16 = i25;
                    i17 = i27;
                    DolbyVisionConfig parse3 = DolbyVisionConfig.parse(parsableByteArray);
                    if (parse3 != null) {
                        str6 = parse3.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                } else {
                    if (readInt2 == 1987076931) {
                        ExtractorUtil.checkContainerInput(str5 == null, null);
                        str2 = i23 == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                        parsableByteArray.setPosition(position2 + 12);
                        parsableByteArray.skipBytes(2);
                        boolean z8 = (parsableByteArray.readUnsignedByte() & 1) != 0;
                        int readUnsignedByte = parsableByteArray.readUnsignedByte();
                        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                        i25 = ColorInfo.isoColorPrimariesToColorSpace(readUnsignedByte);
                        i26 = z8 ? 1 : 2;
                        i27 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readUnsignedByte2);
                    } else if (readInt2 == 1635135811) {
                        ExtractorUtil.checkContainerInput(str5 == null, null);
                        str2 = MimeTypes.VIDEO_AV1;
                    } else if (readInt2 == 1668050025) {
                        if (byteBuffer == null) {
                            byteBuffer = allocateHdrStaticInfo();
                        }
                        ByteBuffer byteBuffer2 = byteBuffer;
                        byteBuffer2.position(21);
                        byteBuffer2.putShort(parsableByteArray.readShort());
                        byteBuffer2.putShort(parsableByteArray.readShort());
                        byteBuffer = byteBuffer2;
                        drmInitData2 = drmInitData3;
                        i14 = readUnsignedShort2;
                        i15 = i23;
                        position += readInt;
                        i21 = i9;
                        i22 = i10;
                        stsdData2 = stsdData;
                        str4 = str;
                        i23 = i15;
                        drmInitData3 = drmInitData2;
                        readUnsignedShort2 = i14;
                    } else if (readInt2 == 1835295606) {
                        if (byteBuffer == null) {
                            byteBuffer = allocateHdrStaticInfo();
                        }
                        ByteBuffer byteBuffer3 = byteBuffer;
                        short readShort = parsableByteArray.readShort();
                        short readShort2 = parsableByteArray.readShort();
                        short readShort3 = parsableByteArray.readShort();
                        i15 = i23;
                        short readShort4 = parsableByteArray.readShort();
                        short readShort5 = parsableByteArray.readShort();
                        drmInitData2 = drmInitData3;
                        short readShort6 = parsableByteArray.readShort();
                        List<byte[]> list3 = list2;
                        short readShort7 = parsableByteArray.readShort();
                        float f10 = f9;
                        short readShort8 = parsableByteArray.readShort();
                        long readUnsignedInt = parsableByteArray.readUnsignedInt();
                        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
                        i14 = readUnsignedShort2;
                        byteBuffer3.position(1);
                        byteBuffer3.putShort(readShort5);
                        byteBuffer3.putShort(readShort6);
                        byteBuffer3.putShort(readShort);
                        byteBuffer3.putShort(readShort2);
                        byteBuffer3.putShort(readShort3);
                        byteBuffer3.putShort(readShort4);
                        byteBuffer3.putShort(readShort7);
                        byteBuffer3.putShort(readShort8);
                        byteBuffer3.putShort((short) (readUnsignedInt / 10000));
                        byteBuffer3.putShort((short) (readUnsignedInt2 / 10000));
                        byteBuffer = byteBuffer3;
                        list2 = list3;
                        f9 = f10;
                        position += readInt;
                        i21 = i9;
                        i22 = i10;
                        stsdData2 = stsdData;
                        str4 = str;
                        i23 = i15;
                        drmInitData3 = drmInitData2;
                        readUnsignedShort2 = i14;
                    } else {
                        drmInitData2 = drmInitData3;
                        i14 = readUnsignedShort2;
                        i15 = i23;
                        f8 = f9;
                        list = list2;
                        if (readInt2 == 1681012275) {
                            ExtractorUtil.checkContainerInput(str5 == null, null);
                            str5 = str;
                        } else if (readInt2 == 1702061171) {
                            ExtractorUtil.checkContainerInput(str5 == null, null);
                            esdsData = parseEsdsFromParent(parsableByteArray, position2);
                            String str7 = esdsData.mimeType;
                            byte[] bArr2 = esdsData.initializationData;
                            list2 = bArr2 != null ? ImmutableList.of(bArr2) : list;
                            str5 = str7;
                            f9 = f8;
                            position += readInt;
                            i21 = i9;
                            i22 = i10;
                            stsdData2 = stsdData;
                            str4 = str;
                            i23 = i15;
                            drmInitData3 = drmInitData2;
                            readUnsignedShort2 = i14;
                        } else if (readInt2 == 1885434736) {
                            f9 = parsePaspFromParent(parsableByteArray, position2);
                            list2 = list;
                            z7 = true;
                            position += readInt;
                            i21 = i9;
                            i22 = i10;
                            stsdData2 = stsdData;
                            str4 = str;
                            i23 = i15;
                            drmInitData3 = drmInitData2;
                            readUnsignedShort2 = i14;
                        } else if (readInt2 == 1937126244) {
                            bArr = parseProjFromParent(parsableByteArray, position2, readInt);
                        } else if (readInt2 == 1936995172) {
                            int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                            parsableByteArray.skipBytes(3);
                            if (readUnsignedByte3 == 0) {
                                int readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                                if (readUnsignedByte4 == 0) {
                                    i24 = 0;
                                } else if (readUnsignedByte4 == 1) {
                                    i24 = 1;
                                } else if (readUnsignedByte4 == 2) {
                                    i24 = 2;
                                } else if (readUnsignedByte4 == 3) {
                                    i24 = 3;
                                }
                            }
                        } else {
                            i16 = i25;
                            if (readInt2 == 1668246642) {
                                i17 = i27;
                                if (i16 == -1 && i17 == -1) {
                                    int readInt3 = parsableByteArray.readInt();
                                    if (readInt3 == TYPE_nclx || readInt3 == TYPE_nclc) {
                                        int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                                        int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                                        parsableByteArray.skipBytes(2);
                                        boolean z9 = readInt == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                        i25 = ColorInfo.isoColorPrimariesToColorSpace(readUnsignedShort3);
                                        i26 = z9 ? 1 : 2;
                                        i27 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readUnsignedShort4);
                                    } else {
                                        Log.w(TAG, "Unsupported color type: " + Atom.getAtomTypeString(readInt3));
                                    }
                                }
                            } else {
                                i17 = i27;
                            }
                        }
                        list2 = list;
                        f9 = f8;
                        position += readInt;
                        i21 = i9;
                        i22 = i10;
                        stsdData2 = stsdData;
                        str4 = str;
                        i23 = i15;
                        drmInitData3 = drmInitData2;
                        readUnsignedShort2 = i14;
                    }
                    str5 = str2;
                    drmInitData2 = drmInitData3;
                    i14 = readUnsignedShort2;
                    i15 = i23;
                    position += readInt;
                    i21 = i9;
                    i22 = i10;
                    stsdData2 = stsdData;
                    str4 = str;
                    i23 = i15;
                    drmInitData3 = drmInitData2;
                    readUnsignedShort2 = i14;
                }
                i27 = i17;
                i25 = i16;
                list2 = list;
                f9 = f8;
                position += readInt;
                i21 = i9;
                i22 = i10;
                stsdData2 = stsdData;
                str4 = str;
                i23 = i15;
                drmInitData3 = drmInitData2;
                readUnsignedShort2 = i14;
            }
            i27 = i20;
            drmInitData2 = drmInitData3;
            i14 = readUnsignedShort2;
            i25 = i18;
            i15 = i23;
            i26 = i19;
            str5 = str3;
            position += readInt;
            i21 = i9;
            i22 = i10;
            stsdData2 = stsdData;
            str4 = str;
            i23 = i15;
            drmInitData3 = drmInitData2;
            readUnsignedShort2 = i14;
        }
        DrmInitData drmInitData4 = drmInitData3;
        int i28 = readUnsignedShort2;
        float f11 = f9;
        List<byte[]> list4 = list2;
        int i29 = i25;
        int i30 = i27;
        if (str5 == null) {
            return;
        }
        Format.Builder drmInitData5 = new Format.Builder().setId(i11).setSampleMimeType(str5).setCodecs(str6).setWidth(readUnsignedShort).setHeight(i28).setPixelWidthHeightRatio(f11).setRotationDegrees(i12).setProjectionData(bArr).setStereoMode(i24).setInitializationData(list4).setDrmInitData(drmInitData4);
        int i31 = i26;
        if (i29 != -1 || i31 != -1 || i30 != -1 || byteBuffer != null) {
            drmInitData5.setColorInfo(new ColorInfo(i29, i31, i30, byteBuffer != null ? byteBuffer.array() : null));
        }
        if (esdsData != null) {
            drmInitData5.setAverageBitrate(Ints.saturatedCast(esdsData.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsData.peakBitrate));
        }
        stsdData.format = drmInitData5.build();
    }

    @Nullable
    private static Metadata parseXyz(ParsableByteArray parsableByteArray) {
        short readShort = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        String readString = parsableByteArray.readString(readShort);
        int max = Math.max(readString.lastIndexOf(43), readString.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(readString.substring(0, max)), Float.parseFloat(readString.substring(max, readString.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }
}
