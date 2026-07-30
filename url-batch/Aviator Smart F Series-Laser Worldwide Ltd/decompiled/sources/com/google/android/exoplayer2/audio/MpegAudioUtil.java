package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.MimeTypes;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import com.realsil.sdk.dfu.DfuConstants;

@Deprecated
/* loaded from: classes3.dex */
public final class MpegAudioUtil {
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    public static final int MAX_RATE_BYTES_PER_SECOND = 40000;
    private static final int SAMPLES_PER_FRAME_L1 = 384;
    private static final int SAMPLES_PER_FRAME_L2 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V1 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V2 = 576;
    private static final String[] MIME_TYPE_BY_LAYER = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] SAMPLING_RATE_V1 = {44100, OpusUtil.SAMPLE_RATE, DfuConstants.MAX_CONNECTION_LOCK_TIMEOUT};
    private static final int[] BITRATE_V1_L1 = {DfuConstants.MAX_CONNECTION_LOCK_TIMEOUT, 64000, 96000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] BITRATE_V2_L1 = {DfuConstants.MAX_CONNECTION_LOCK_TIMEOUT, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] BITRATE_V1_L2 = {DfuConstants.MAX_CONNECTION_LOCK_TIMEOUT, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};
    private static final int[] BITRATE_V1_L3 = {DfuConstants.MAX_CONNECTION_LOCK_TIMEOUT, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};
    private static final int[] BITRATE_V2 = {8000, 16000, 24000, DfuConstants.MAX_CONNECTION_LOCK_TIMEOUT, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000};

    public static final class Header {
        public int bitrate;
        public int channels;
        public int frameSize;

        @Nullable
        public String mimeType;
        public int sampleRate;
        public int samplesPerFrame;
        public int version;

        public boolean setForHeaderData(int i8) {
            int i9;
            int i10;
            int i11;
            int i12;
            if (!MpegAudioUtil.isMagicPresent(i8) || (i9 = (i8 >>> 19) & 3) == 1 || (i10 = (i8 >>> 17) & 3) == 0 || (i11 = (i8 >>> 12) & 15) == 0 || i11 == 15 || (i12 = (i8 >>> 10) & 3) == 3) {
                return false;
            }
            this.version = i9;
            this.mimeType = MpegAudioUtil.MIME_TYPE_BY_LAYER[3 - i10];
            int i13 = MpegAudioUtil.SAMPLING_RATE_V1[i12];
            this.sampleRate = i13;
            if (i9 == 2) {
                this.sampleRate = i13 / 2;
            } else if (i9 == 0) {
                this.sampleRate = i13 / 4;
            }
            int i14 = (i8 >>> 9) & 1;
            this.samplesPerFrame = MpegAudioUtil.getFrameSizeInSamples(i9, i10);
            if (i10 == 3) {
                int i15 = i9 == 3 ? MpegAudioUtil.BITRATE_V1_L1[i11 - 1] : MpegAudioUtil.BITRATE_V2_L1[i11 - 1];
                this.bitrate = i15;
                this.frameSize = (((i15 * 12) / this.sampleRate) + i14) * 4;
            } else {
                int i16 = GattError.GATT_DUP_REG;
                if (i9 == 3) {
                    int i17 = i10 == 2 ? MpegAudioUtil.BITRATE_V1_L2[i11 - 1] : MpegAudioUtil.BITRATE_V1_L3[i11 - 1];
                    this.bitrate = i17;
                    this.frameSize = ((i17 * GattError.GATT_DUP_REG) / this.sampleRate) + i14;
                } else {
                    int i18 = MpegAudioUtil.BITRATE_V2[i11 - 1];
                    this.bitrate = i18;
                    if (i10 == 1) {
                        i16 = 72;
                    }
                    this.frameSize = ((i16 * i18) / this.sampleRate) + i14;
                }
            }
            this.channels = ((i8 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    private MpegAudioUtil() {
    }

    public static int getFrameSize(int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        if (!isMagicPresent(i8) || (i9 = (i8 >>> 19) & 3) == 1 || (i10 = (i8 >>> 17) & 3) == 0 || (i11 = (i8 >>> 12) & 15) == 0 || i11 == 15 || (i12 = (i8 >>> 10) & 3) == 3) {
            return -1;
        }
        int i13 = SAMPLING_RATE_V1[i12];
        if (i9 == 2) {
            i13 /= 2;
        } else if (i9 == 0) {
            i13 /= 4;
        }
        int i14 = (i8 >>> 9) & 1;
        if (i10 == 3) {
            return ((((i9 == 3 ? BITRATE_V1_L1[i11 - 1] : BITRATE_V2_L1[i11 - 1]) * 12) / i13) + i14) * 4;
        }
        int i15 = i9 == 3 ? i10 == 2 ? BITRATE_V1_L2[i11 - 1] : BITRATE_V1_L3[i11 - 1] : BITRATE_V2[i11 - 1];
        int i16 = GattError.GATT_DUP_REG;
        if (i9 == 3) {
            return ((i15 * GattError.GATT_DUP_REG) / i13) + i14;
        }
        if (i10 == 1) {
            i16 = 72;
        }
        return ((i16 * i15) / i13) + i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getFrameSizeInSamples(int i8, int i9) {
        if (i9 == 1) {
            if (i8 == 3) {
                return 1152;
            }
            return SAMPLES_PER_FRAME_L3_V2;
        }
        if (i9 == 2) {
            return 1152;
        }
        if (i9 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMagicPresent(int i8) {
        return (i8 & (-2097152)) == -2097152;
    }

    public static int parseMpegAudioFrameSampleCount(int i8) {
        int i9;
        int i10;
        if (!isMagicPresent(i8) || (i9 = (i8 >>> 19) & 3) == 1 || (i10 = (i8 >>> 17) & 3) == 0) {
            return -1;
        }
        int i11 = (i8 >>> 12) & 15;
        int i12 = (i8 >>> 10) & 3;
        if (i11 == 0 || i11 == 15 || i12 == 3) {
            return -1;
        }
        return getFrameSizeInSamples(i9, i10);
    }
}
