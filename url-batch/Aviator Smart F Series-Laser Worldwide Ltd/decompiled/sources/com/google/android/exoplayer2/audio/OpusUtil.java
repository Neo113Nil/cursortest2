package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.DefaultLoadControl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public class OpusUtil {
    private static final int DEFAULT_SEEK_PRE_ROLL_SAMPLES = 3840;
    private static final int FULL_CODEC_INITIALIZATION_DATA_BUFFER_COUNT = 3;
    public static final int MAX_BYTES_PER_SECOND = 63750;
    public static final int SAMPLE_RATE = 48000;

    private OpusUtil() {
    }

    public static List<byte[]> buildInitializationData(byte[] bArr) {
        long sampleCountToNanoseconds = sampleCountToNanoseconds(getPreSkipSamples(bArr));
        long sampleCountToNanoseconds2 = sampleCountToNanoseconds(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(buildNativeOrderByteArray(sampleCountToNanoseconds));
        arrayList.add(buildNativeOrderByteArray(sampleCountToNanoseconds2));
        return arrayList;
    }

    private static byte[] buildNativeOrderByteArray(long j8) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j8).array();
    }

    public static int getChannelCount(byte[] bArr) {
        return bArr[9] & 255;
    }

    private static long getPacketDurationUs(byte b8, byte b9) {
        int i8;
        int i9 = b8 & 255;
        int i10 = b8 & 3;
        if (i10 != 0) {
            i8 = 2;
            if (i10 != 1 && i10 != 2) {
                i8 = b9 & 63;
            }
        } else {
            i8 = 1;
        }
        int i11 = i9 >> 3;
        return i8 * (i11 >= 16 ? DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS << r6 : i11 >= 12 ? 10000 << (i11 & 1) : (i11 & 3) == 3 ? 60000 : 10000 << r6);
    }

    private static int getPreSkipSamples(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int parseOggPacketAudioSampleCount(ByteBuffer byteBuffer) {
        int parseOggPacketForPreAudioSampleByteCount = parseOggPacketForPreAudioSampleByteCount(byteBuffer);
        int i8 = byteBuffer.get(parseOggPacketForPreAudioSampleByteCount + 26) + 27 + parseOggPacketForPreAudioSampleByteCount;
        return (int) ((getPacketDurationUs(byteBuffer.get(i8), byteBuffer.limit() - i8 > 1 ? byteBuffer.get(i8 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int parseOggPacketForPreAudioSampleByteCount(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b8 = byteBuffer.get(26);
        int i8 = 28;
        int i9 = 28;
        for (int i10 = 0; i10 < b8; i10++) {
            i9 += byteBuffer.get(i10 + 27);
        }
        byte b9 = byteBuffer.get(i9 + 26);
        for (int i11 = 0; i11 < b9; i11++) {
            i8 += byteBuffer.get(i9 + 27 + i11);
        }
        return i9 + i8;
    }

    public static int parsePacketAudioSampleCount(ByteBuffer byteBuffer) {
        return (int) ((getPacketDurationUs(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    private static long sampleCountToNanoseconds(long j8) {
        return (j8 * C.NANOS_PER_SECOND) / 48000;
    }

    public static long getPacketDurationUs(byte[] bArr) {
        return getPacketDurationUs(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }
}
