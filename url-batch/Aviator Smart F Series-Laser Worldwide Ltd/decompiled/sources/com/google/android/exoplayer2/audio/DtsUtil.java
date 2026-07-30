package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.baidu.ar.base.MsgField;
import com.baidu.platform.comapi.bmsdk.BmLocated;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.material.internal.ViewUtils;
import com.realsil.sdk.dfu.DfuConstants;
import java.nio.ByteBuffer;
import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
public final class DtsUtil {
    public static final int DTS_HD_MAX_RATE_BYTES_PER_SECOND = 2250000;
    public static final int DTS_MAX_RATE_BYTES_PER_SECOND = 192000;
    private static final byte FIRST_BYTE_14B_BE = 31;
    private static final byte FIRST_BYTE_14B_LE = -1;
    private static final byte FIRST_BYTE_BE = Byte.MAX_VALUE;
    private static final byte FIRST_BYTE_LE = -2;
    private static final int SYNC_EXT_SUB_LE = 622876772;
    private static final int SYNC_FTOC_LE = -233094848;
    private static final int SYNC_FTOC_NON_SYNC_LE = -398277519;
    private static final int SYNC_VALUE_14B_BE = 536864768;
    private static final int SYNC_VALUE_14B_LE = -14745368;
    private static final int SYNC_VALUE_BE = 2147385345;
    private static final int SYNC_VALUE_LE = -25230976;
    private static final int[] CHANNELS_BY_AMODE = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] SAMPLE_RATE_BY_SFREQ = {-1, 8000, 16000, DfuConstants.MAX_CONNECTION_LOCK_TIMEOUT, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, OpusUtil.SAMPLE_RATE, -1, -1};
    private static final int[] TWICE_BITRATE_KBPS_BY_RATE = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, 256, RendererCapabilities.MODE_SUPPORT_MASK, 448, 512, 640, ViewUtils.EDGE_TO_EDGE_FLAGS, 896, 1024, 1152, 1280, 1536, 1920, 2048, MsgField.MSG_ON_DOWNLOAD_RES_SUCCESS, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, BmLocated.HALF_LEFT_BOTTOM, 7680};

    private DtsUtil() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getDtsFrameSize(byte[] bArr) {
        int i8;
        byte b8;
        int i9;
        int i10;
        byte b9;
        boolean z7 = false;
        byte b10 = bArr[0];
        if (b10 != -2) {
            if (b10 == -1) {
                i10 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b9 = bArr[9];
            } else if (b10 != 31) {
                i8 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b8 = bArr[7];
            } else {
                i10 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b9 = bArr[8];
            }
            i9 = (((b9 & 60) >> 2) | i10) + 1;
            z7 = true;
            return !z7 ? (i9 * 16) / 14 : i9;
        }
        i8 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b8 = bArr[6];
        i9 = (((b8 & 240) >> 4) | i8) + 1;
        if (!z7) {
        }
    }

    private static ParsableBitArray getNormalizedFrameHeader(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new ParsableBitArray(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (isLittleEndianFrameHeader(copyOf)) {
            for (int i8 = 0; i8 < copyOf.length - 1; i8 += 2) {
                byte b8 = copyOf[i8];
                int i9 = i8 + 1;
                copyOf[i8] = copyOf[i9];
                copyOf[i9] = b8;
            }
        }
        ParsableBitArray parsableBitArray = new ParsableBitArray(copyOf);
        if (copyOf[0] == 31) {
            ParsableBitArray parsableBitArray2 = new ParsableBitArray(copyOf);
            while (parsableBitArray2.bitsLeft() >= 16) {
                parsableBitArray2.skipBits(2);
                parsableBitArray.putInt(parsableBitArray2.readBits(14), 14);
            }
        }
        parsableBitArray.reset(copyOf);
        return parsableBitArray;
    }

    private static boolean isLittleEndianFrameHeader(byte[] bArr) {
        byte b8 = bArr[0];
        return b8 == -2 || b8 == -1;
    }

    public static boolean isSyncWord(int i8) {
        return i8 == SYNC_VALUE_BE || i8 == SYNC_VALUE_LE || i8 == SYNC_VALUE_14B_BE || i8 == SYNC_VALUE_14B_LE;
    }

    public static int parseDtsAudioSampleCount(byte[] bArr) {
        int i8;
        byte b8;
        int i9;
        byte b9;
        byte b10 = bArr[0];
        if (b10 != -2) {
            if (b10 == -1) {
                i8 = (bArr[4] & 7) << 4;
                b9 = bArr[7];
            } else if (b10 != 31) {
                i8 = (bArr[4] & 1) << 6;
                b8 = bArr[5];
            } else {
                i8 = (bArr[5] & 7) << 4;
                b9 = bArr[6];
            }
            i9 = b9 & 60;
            return (((i9 >> 2) | i8) + 1) * 32;
        }
        i8 = (bArr[5] & 1) << 6;
        b8 = bArr[4];
        i9 = b8 & com.liulishuo.filedownloader.model.b.warn;
        return (((i9 >> 2) | i8) + 1) * 32;
    }

    public static Format parseDtsFormat(byte[] bArr, @Nullable String str, @Nullable String str2, @Nullable DrmInitData drmInitData) {
        ParsableBitArray normalizedFrameHeader = getNormalizedFrameHeader(bArr);
        normalizedFrameHeader.skipBits(60);
        int i8 = CHANNELS_BY_AMODE[normalizedFrameHeader.readBits(6)];
        int i9 = SAMPLE_RATE_BY_SFREQ[normalizedFrameHeader.readBits(4)];
        int readBits = normalizedFrameHeader.readBits(5);
        int[] iArr = TWICE_BITRATE_KBPS_BY_RATE;
        int i10 = readBits >= iArr.length ? -1 : (iArr[readBits] * 1000) / 2;
        normalizedFrameHeader.skipBits(10);
        return new Format.Builder().setId(str).setSampleMimeType(MimeTypes.AUDIO_DTS).setAverageBitrate(i10).setChannelCount(i8 + (normalizedFrameHeader.readBits(2) > 0 ? 1 : 0)).setSampleRate(i9).setDrmInitData(drmInitData).setLanguage(str2).build();
    }

    public static int parseDtsAudioSampleCount(ByteBuffer byteBuffer) {
        int i8;
        byte b8;
        int i9;
        byte b9;
        if (byteBuffer.getInt(0) == SYNC_FTOC_LE || byteBuffer.getInt(0) == SYNC_FTOC_NON_SYNC_LE) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == SYNC_EXT_SUB_LE) {
            return 4096;
        }
        int position = byteBuffer.position();
        byte b10 = byteBuffer.get(position);
        if (b10 != -2) {
            if (b10 == -1) {
                i8 = (byteBuffer.get(position + 4) & 7) << 4;
                b9 = byteBuffer.get(position + 7);
            } else if (b10 != 31) {
                i8 = (byteBuffer.get(position + 4) & 1) << 6;
                b8 = byteBuffer.get(position + 5);
            } else {
                i8 = (byteBuffer.get(position + 5) & 7) << 4;
                b9 = byteBuffer.get(position + 6);
            }
            i9 = b9 & 60;
            return (((i9 >> 2) | i8) + 1) * 32;
        }
        i8 = (byteBuffer.get(position + 5) & 1) << 6;
        b8 = byteBuffer.get(position + 4);
        i9 = b8 & com.liulishuo.filedownloader.model.b.warn;
        return (((i9 >> 2) | i8) + 1) * 32;
    }
}
