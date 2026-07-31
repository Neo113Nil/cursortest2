package t0;

import java.nio.ByteBuffer;
import java.util.Arrays;
import r0.s1;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f21694a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f21695b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f21696c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(byte[] bArr) {
        int i7;
        byte b7;
        int i8;
        int i9;
        byte b8;
        boolean z6 = false;
        byte b9 = bArr[0];
        if (b9 != -2) {
            if (b9 == -1) {
                i9 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b8 = bArr[9];
            } else if (b9 != 31) {
                i7 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b7 = bArr[7];
            } else {
                i9 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b8 = bArr[8];
            }
            i8 = (((b8 & 60) >> 2) | i9) + 1;
            z6 = true;
            return !z6 ? (i8 * 16) / 14 : i8;
        }
        i7 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b7 = bArr[6];
        i8 = (((b7 & 240) >> 4) | i7) + 1;
        if (!z6) {
        }
    }

    private static o2.z b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new o2.z(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (c(copyOf)) {
            for (int i7 = 0; i7 < copyOf.length - 1; i7 += 2) {
                byte b7 = copyOf[i7];
                int i8 = i7 + 1;
                copyOf[i7] = copyOf[i8];
                copyOf[i8] = b7;
            }
        }
        o2.z zVar = new o2.z(copyOf);
        if (copyOf[0] == 31) {
            o2.z zVar2 = new o2.z(copyOf);
            while (zVar2.b() >= 16) {
                zVar2.r(2);
                zVar.f(zVar2.h(14), 14);
            }
        }
        zVar.n(copyOf);
        return zVar;
    }

    private static boolean c(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }

    public static boolean d(int i7) {
        return i7 == 2147385345 || i7 == -25230976 || i7 == 536864768 || i7 == -14745368;
    }

    public static int e(ByteBuffer byteBuffer) {
        int i7;
        int i8;
        int i9;
        int i10;
        int position = byteBuffer.position();
        byte b7 = byteBuffer.get(position);
        if (b7 != -2) {
            if (b7 == -1) {
                i7 = (byteBuffer.get(position + 4) & 7) << 4;
                i10 = position + 7;
            } else if (b7 != 31) {
                i7 = (byteBuffer.get(position + 4) & 1) << 6;
                i8 = position + 5;
            } else {
                i7 = (byteBuffer.get(position + 5) & 7) << 4;
                i10 = position + 6;
            }
            i9 = byteBuffer.get(i10) & 60;
            return (((i9 >> 2) | i7) + 1) * 32;
        }
        i7 = (byteBuffer.get(position + 5) & 1) << 6;
        i8 = position + 4;
        i9 = byteBuffer.get(i8) & 252;
        return (((i9 >> 2) | i7) + 1) * 32;
    }

    public static int f(byte[] bArr) {
        int i7;
        byte b7;
        int i8;
        byte b8;
        byte b9 = bArr[0];
        if (b9 != -2) {
            if (b9 == -1) {
                i7 = (bArr[4] & 7) << 4;
                b8 = bArr[7];
            } else if (b9 != 31) {
                i7 = (bArr[4] & 1) << 6;
                b7 = bArr[5];
            } else {
                i7 = (bArr[5] & 7) << 4;
                b8 = bArr[6];
            }
            i8 = b8 & 60;
            return (((i8 >> 2) | i7) + 1) * 32;
        }
        i7 = (bArr[5] & 1) << 6;
        b7 = bArr[4];
        i8 = b7 & 252;
        return (((i8 >> 2) | i7) + 1) * 32;
    }

    public static s1 g(byte[] bArr, String str, String str2, v0.m mVar) {
        o2.z b7 = b(bArr);
        b7.r(60);
        int i7 = f21694a[b7.h(6)];
        int i8 = f21695b[b7.h(4)];
        int h7 = b7.h(5);
        int[] iArr = f21696c;
        int i9 = h7 >= iArr.length ? -1 : (iArr[h7] * 1000) / 2;
        b7.r(10);
        return new s1.b().S(str).e0("audio/vnd.dts").G(i9).H(i7 + (b7.h(2) > 0 ? 1 : 0)).f0(i8).M(mVar).V(str2).E();
    }
}
