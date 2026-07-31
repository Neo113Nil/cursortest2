package t0;

import java.nio.ByteBuffer;
import r0.s1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f21697a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f21698a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21699b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21700c;

        /* renamed from: d, reason: collision with root package name */
        public final int f21701d;

        /* renamed from: e, reason: collision with root package name */
        public final int f21702e;

        private b(int i7, int i8, int i9, int i10, int i11) {
            this.f21698a = i7;
            this.f21700c = i8;
            this.f21699b = i9;
            this.f21701d = i10;
            this.f21702e = i11;
        }
    }

    public static void a(int i7, o2.a0 a0Var) {
        a0Var.K(7);
        byte[] d7 = a0Var.d();
        d7[0] = -84;
        d7[1] = 64;
        d7[2] = -1;
        d7[3] = -1;
        d7[4] = (byte) ((i7 >> 16) & 255);
        d7[5] = (byte) ((i7 >> 8) & 255);
        d7[6] = (byte) (i7 & 255);
    }

    public static s1 b(o2.a0 a0Var, String str, String str2, v0.m mVar) {
        a0Var.P(1);
        return new s1.b().S(str).e0("audio/ac4").H(2).f0(((a0Var.C() & 32) >> 5) == 1 ? 48000 : 44100).M(mVar).V(str2).E();
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return d(new o2.z(bArr)).f21702e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
    
        if (r10 != 11) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        if (r10 != 11) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        if (r10 != 8) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b d(o2.z zVar) {
        int i7;
        int i8;
        int h7 = zVar.h(16);
        int h8 = zVar.h(16);
        if (h8 == 65535) {
            h8 = zVar.h(24);
            i7 = 7;
        } else {
            i7 = 4;
        }
        int i9 = h8 + i7;
        if (h7 == 44097) {
            i9 += 2;
        }
        int i10 = i9;
        int h9 = zVar.h(2);
        if (h9 == 3) {
            h9 += f(zVar, 2);
        }
        int i11 = h9;
        int h10 = zVar.h(10);
        if (zVar.g() && zVar.h(3) > 0) {
            zVar.r(2);
        }
        int i12 = zVar.g() ? 48000 : 44100;
        int h11 = zVar.h(4);
        if (i12 == 44100 && h11 == 13) {
            i8 = f21697a[h11];
        } else {
            if (i12 == 48000) {
                int[] iArr = f21697a;
                if (h11 < iArr.length) {
                    int i13 = iArr[h11];
                    int i14 = h10 % 5;
                    if (i14 != 1) {
                        if (i14 == 2) {
                            if (h11 != 8) {
                            }
                            i13++;
                            i8 = i13;
                        } else if (i14 != 3) {
                            if (i14 == 4) {
                                if (h11 != 3) {
                                    if (h11 != 8) {
                                    }
                                }
                                i13++;
                            }
                            i8 = i13;
                        }
                    }
                    if (h11 != 3) {
                    }
                    i13++;
                    i8 = i13;
                }
            }
            i8 = 0;
        }
        return new b(i11, 2, i12, i10, i8);
    }

    public static int e(byte[] bArr, int i7) {
        int i8 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i9 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i9 == 65535) {
            i9 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i8 = 4;
        }
        if (i7 == 44097) {
            i8 += 2;
        }
        return i9 + i8;
    }

    private static int f(o2.z zVar, int i7) {
        int i8 = 0;
        while (true) {
            int h7 = i8 + zVar.h(i7);
            if (!zVar.g()) {
                return h7;
            }
            i8 = (h7 + 1) << i7;
        }
    }
}
