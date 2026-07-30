package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.baidu.ar.auth.FeatureCodes;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.nio.ByteBuffer;

@Deprecated
/* loaded from: classes3.dex */
public final class Ac4Util {
    public static final int AC40_SYNCWORD = 44096;
    public static final int AC41_SYNCWORD = 44097;
    private static final int CHANNEL_COUNT_2 = 2;
    public static final int HEADER_SIZE_FOR_PARSER = 16;
    public static final int MAX_RATE_BYTES_PER_SECOND = 336000;
    private static final int[] SAMPLE_COUNT = {2002, 2000, 1920, 1601, FeatureCodes.ADVANCE_BEAUTY, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int SAMPLE_HEADER_SIZE = 7;

    public static final class SyncFrameInfo {
        public final int bitstreamVersion;
        public final int channelCount;
        public final int frameSize;
        public final int sampleCount;
        public final int sampleRate;

        private SyncFrameInfo(int i8, int i9, int i10, int i11, int i12) {
            this.bitstreamVersion = i8;
            this.channelCount = i9;
            this.sampleRate = i10;
            this.frameSize = i11;
            this.sampleCount = i12;
        }
    }

    private Ac4Util() {
    }

    public static void getAc4SampleHeader(int i8, ParsableByteArray parsableByteArray) {
        parsableByteArray.reset(7);
        byte[] data = parsableByteArray.getData();
        data[0] = a4.a.T1;
        data[1] = 64;
        data[2] = -1;
        data[3] = -1;
        data[4] = (byte) ((i8 >> 16) & 255);
        data[5] = (byte) ((i8 >> 8) & 255);
        data[6] = (byte) (i8 & 255);
    }

    public static Format parseAc4AnnexEFormat(ParsableByteArray parsableByteArray, String str, String str2, @Nullable DrmInitData drmInitData) {
        parsableByteArray.skipBytes(1);
        return new Format.Builder().setId(str).setSampleMimeType(MimeTypes.AUDIO_AC4).setChannelCount(2).setSampleRate(((parsableByteArray.readUnsignedByte() & 32) >> 5) == 1 ? OpusUtil.SAMPLE_RATE : 44100).setDrmInitData(drmInitData).setLanguage(str2).build();
    }

    public static int parseAc4SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return parseAc4SyncframeInfo(new ParsableBitArray(bArr)).sampleCount;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
    
        if (r11 != 11) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
    
        if (r11 != 11) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
    
        if (r11 != 8) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SyncFrameInfo parseAc4SyncframeInfo(ParsableBitArray parsableBitArray) {
        int i8;
        int i9;
        int readBits = parsableBitArray.readBits(16);
        int readBits2 = parsableBitArray.readBits(16);
        if (readBits2 == 65535) {
            readBits2 = parsableBitArray.readBits(24);
            i8 = 7;
        } else {
            i8 = 4;
        }
        int i10 = readBits2 + i8;
        if (readBits == 44097) {
            i10 += 2;
        }
        int i11 = i10;
        int readBits3 = parsableBitArray.readBits(2);
        if (readBits3 == 3) {
            readBits3 += readVariableBits(parsableBitArray, 2);
        }
        int i12 = readBits3;
        int readBits4 = parsableBitArray.readBits(10);
        if (parsableBitArray.readBit() && parsableBitArray.readBits(3) > 0) {
            parsableBitArray.skipBits(2);
        }
        int i13 = parsableBitArray.readBit() ? OpusUtil.SAMPLE_RATE : 44100;
        int readBits5 = parsableBitArray.readBits(4);
        if (i13 == 44100 && readBits5 == 13) {
            i9 = SAMPLE_COUNT[readBits5];
        } else {
            if (i13 == 48000) {
                int[] iArr = SAMPLE_COUNT;
                if (readBits5 < iArr.length) {
                    int i14 = iArr[readBits5];
                    int i15 = readBits4 % 5;
                    if (i15 != 1) {
                        if (i15 == 2) {
                            if (readBits5 != 8) {
                            }
                            i14++;
                            i9 = i14;
                        } else if (i15 != 3) {
                            if (i15 == 4) {
                                if (readBits5 != 3) {
                                    if (readBits5 != 8) {
                                    }
                                }
                                i14++;
                            }
                            i9 = i14;
                        }
                    }
                    if (readBits5 != 3) {
                    }
                    i14++;
                    i9 = i14;
                }
            }
            i9 = 0;
        }
        return new SyncFrameInfo(i12, 2, i13, i11, i9);
    }

    public static int parseAc4SyncframeSize(byte[] bArr, int i8) {
        int i9 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i10 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i10 == 65535) {
            i10 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i9 = 4;
        }
        if (i8 == 44097) {
            i9 += 2;
        }
        return i10 + i9;
    }

    private static int readVariableBits(ParsableBitArray parsableBitArray, int i8) {
        int i9 = 0;
        while (true) {
            int readBits = i9 + parsableBitArray.readBits(i8);
            if (!parsableBitArray.readBit()) {
                return readBits;
            }
            i9 = (readBits + 1) << i8;
        }
    }
}
