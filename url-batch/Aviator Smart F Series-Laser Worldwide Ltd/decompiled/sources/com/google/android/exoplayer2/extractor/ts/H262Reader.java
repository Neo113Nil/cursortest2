package com.google.android.exoplayer2.extractor.ts;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Collections;

@Deprecated
/* loaded from: classes3.dex */
public final class H262Reader implements ElementaryStreamReader {
    private static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private static final int START_EXTENSION = 181;
    private static final int START_GROUP = 184;
    private static final int START_PICTURE = 0;
    private static final int START_SEQUENCE_HEADER = 179;
    private static final int START_USER_DATA = 178;
    private final CsdBuffer csdBuffer;
    private String formatId;
    private long frameDurationUs;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private boolean sampleHasPicture;
    private boolean sampleIsKeyframe;
    private long samplePosition;
    private long sampleTimeUs;
    private boolean startedFirstSample;
    private long totalBytesWritten;

    @Nullable
    private final NalUnitTargetBuffer userData;

    @Nullable
    private final ParsableByteArray userDataParsable;

    @Nullable
    private final UserDataReader userDataReader;

    private static final class CsdBuffer {
        private static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        private boolean isFilling;
        public int length;
        public int sequenceExtensionPosition;

        public CsdBuffer(int i8) {
            this.data = new byte[i8];
        }

        public void onData(byte[] bArr, int i8, int i9) {
            if (this.isFilling) {
                int i10 = i9 - i8;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i11 = this.length;
                if (length < i11 + i10) {
                    this.data = Arrays.copyOf(bArr2, (i11 + i10) * 2);
                }
                System.arraycopy(bArr, i8, this.data, this.length, i10);
                this.length += i10;
            }
        }

        public boolean onStartCode(int i8, int i9) {
            if (this.isFilling) {
                int i10 = this.length - i9;
                this.length = i10;
                if (this.sequenceExtensionPosition != 0 || i8 != H262Reader.START_EXTENSION) {
                    this.isFilling = false;
                    return true;
                }
                this.sequenceExtensionPosition = i10;
            } else if (i8 == H262Reader.START_SEQUENCE_HEADER) {
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void reset() {
            this.isFilling = false;
            this.length = 0;
            this.sequenceExtensionPosition = 0;
        }
    }

    public H262Reader() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Pair<Format, Long> parseCsdBuffer(CsdBuffer csdBuffer, String str) {
        float f8;
        int i8;
        float f9;
        int i9;
        long j8;
        byte[] copyOf = Arrays.copyOf(csdBuffer.data, csdBuffer.length);
        int i10 = copyOf[4] & 255;
        byte b8 = copyOf[5];
        int i11 = (i10 << 4) | ((b8 & 255) >> 4);
        int i12 = ((b8 & 15) << 8) | (copyOf[6] & 255);
        int i13 = (copyOf[7] & 240) >> 4;
        if (i13 == 2) {
            f8 = i12 * 4;
            i8 = i11 * 3;
        } else if (i13 == 3) {
            f8 = i12 * 16;
            i8 = i11 * 9;
        } else {
            if (i13 != 4) {
                f9 = 1.0f;
                Format build = new Format.Builder().setId(str).setSampleMimeType(MimeTypes.VIDEO_MPEG2).setWidth(i11).setHeight(i12).setPixelWidthHeightRatio(f9).setInitializationData(Collections.singletonList(copyOf)).build();
                i9 = (copyOf[7] & 15) - 1;
                if (i9 >= 0) {
                    double[] dArr = FRAME_RATE_VALUES;
                    if (i9 < dArr.length) {
                        double d8 = dArr[i9];
                        byte b9 = copyOf[csdBuffer.sequenceExtensionPosition + 9];
                        int i14 = (b9 & a4.a.W0) >> 5;
                        if (i14 != (b9 & 31)) {
                            d8 *= (i14 + 1.0d) / (r8 + 1);
                        }
                        j8 = (long) (1000000.0d / d8);
                        return Pair.create(build, Long.valueOf(j8));
                    }
                }
                j8 = 0;
                return Pair.create(build, Long.valueOf(j8));
            }
            f8 = i12 * 121;
            i8 = i11 * 100;
        }
        f9 = f8 / i8;
        Format build2 = new Format.Builder().setId(str).setSampleMimeType(MimeTypes.VIDEO_MPEG2).setWidth(i11).setHeight(i12).setPixelWidthHeightRatio(f9).setInitializationData(Collections.singletonList(copyOf)).build();
        i9 = (copyOf[7] & 15) - 1;
        if (i9 >= 0) {
        }
        j8 = 0;
        return Pair.create(build2, Long.valueOf(j8));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void consume(ParsableByteArray parsableByteArray) {
        int i8;
        long j8;
        int i9;
        Assertions.checkStateNotNull(this.output);
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int findNalUnit = NalUnitUtil.findNalUnit(data, position, limit, this.prefixFlags);
            if (findNalUnit == limit) {
                break;
            }
            int i10 = findNalUnit + 3;
            int i11 = parsableByteArray.getData()[i10] & 255;
            int i12 = findNalUnit - position;
            if (!this.hasOutputFormat) {
                if (i12 > 0) {
                    this.csdBuffer.onData(data, position, findNalUnit);
                }
                if (this.csdBuffer.onStartCode(i11, i12 < 0 ? -i12 : 0)) {
                    Pair<Format, Long> parseCsdBuffer = parseCsdBuffer(this.csdBuffer, (String) Assertions.checkNotNull(this.formatId));
                    this.output.format((Format) parseCsdBuffer.first);
                    this.frameDurationUs = ((Long) parseCsdBuffer.second).longValue();
                    this.hasOutputFormat = true;
                }
            }
            NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
            if (nalUnitTargetBuffer != null) {
                if (i12 > 0) {
                    nalUnitTargetBuffer.appendToNalUnit(data, position, findNalUnit);
                    i9 = 0;
                } else {
                    i9 = -i12;
                }
                if (this.userData.endNalUnit(i9)) {
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.userData;
                    ((ParsableByteArray) Util.castNonNull(this.userDataParsable)).reset(this.userData.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
                    ((UserDataReader) Util.castNonNull(this.userDataReader)).consume(this.sampleTimeUs, this.userDataParsable);
                }
                if (i11 == START_USER_DATA && parsableByteArray.getData()[findNalUnit + 2] == 1) {
                    this.userData.startNalUnit(i11);
                }
            }
            if (i11 == 0 || i11 == START_SEQUENCE_HEADER) {
                int i13 = limit - findNalUnit;
                if (this.sampleHasPicture && this.hasOutputFormat) {
                    long j9 = this.sampleTimeUs;
                    if (j9 != C.TIME_UNSET) {
                        i8 = i11;
                        this.output.sampleMetadata(j9, this.sampleIsKeyframe ? 1 : 0, ((int) (this.totalBytesWritten - this.samplePosition)) - i13, i13, null);
                        if (this.startedFirstSample || this.sampleHasPicture) {
                            this.samplePosition = this.totalBytesWritten - i13;
                            j8 = this.pesTimeUs;
                            if (j8 == C.TIME_UNSET) {
                                long j10 = this.sampleTimeUs;
                                j8 = j10 != C.TIME_UNSET ? j10 + this.frameDurationUs : -9223372036854775807L;
                            }
                            this.sampleTimeUs = j8;
                            this.sampleIsKeyframe = false;
                            this.pesTimeUs = C.TIME_UNSET;
                            this.startedFirstSample = true;
                        }
                        this.sampleHasPicture = i8 == 0;
                    }
                }
                i8 = i11;
                if (this.startedFirstSample) {
                }
                this.samplePosition = this.totalBytesWritten - i13;
                j8 = this.pesTimeUs;
                if (j8 == C.TIME_UNSET) {
                }
                this.sampleTimeUs = j8;
                this.sampleIsKeyframe = false;
                this.pesTimeUs = C.TIME_UNSET;
                this.startedFirstSample = true;
                this.sampleHasPicture = i8 == 0;
            } else if (i11 == START_GROUP) {
                this.sampleIsKeyframe = true;
            }
            position = i10;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.onData(data, position, limit);
        }
        NalUnitTargetBuffer nalUnitTargetBuffer3 = this.userData;
        if (nalUnitTargetBuffer3 != null) {
            nalUnitTargetBuffer3.appendToNalUnit(data, position, limit);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        UserDataReader userDataReader = this.userDataReader;
        if (userDataReader != null) {
            userDataReader.createTracks(extractorOutput, trackIdGenerator);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j8, int i8) {
        this.pesTimeUs = j8;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.reset();
        }
        this.totalBytesWritten = 0L;
        this.startedFirstSample = false;
        this.pesTimeUs = C.TIME_UNSET;
        this.sampleTimeUs = C.TIME_UNSET;
    }

    H262Reader(@Nullable UserDataReader userDataReader) {
        this.userDataReader = userDataReader;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new CsdBuffer(128);
        if (userDataReader != null) {
            this.userData = new NalUnitTargetBuffer(START_USER_DATA, 128);
            this.userDataParsable = new ParsableByteArray();
        } else {
            this.userData = null;
            this.userDataParsable = null;
        }
        this.pesTimeUs = C.TIME_UNSET;
        this.sampleTimeUs = C.TIME_UNSET;
    }
}
