package H2;

import kotlin.jvm.internal.Intrinsics;
import okio.AbstractC3369b;
import okio.C3372e;
import okio.E;
import okio.s;
import okio.w;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f766a = E.a("0123456789abcdef");

    public static final C3372e.a a(C3372e c3372e, C3372e.a unsafeCursor) {
        Intrinsics.checkNotNullParameter(c3372e, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        C3372e.a g4 = AbstractC3369b.g(unsafeCursor);
        if (g4.f43262b != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        g4.f43262b = c3372e;
        g4.f43263c = true;
        return g4;
    }

    public static final byte[] b() {
        return f766a;
    }

    public static final boolean c(w segment, int i4, byte[] bytes, int i5, int i6) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i7 = segment.f43306c;
        byte[] bArr = segment.f43304a;
        while (i5 < i6) {
            if (i4 == i7) {
                segment = segment.f43309f;
                Intrinsics.checkNotNull(segment);
                byte[] bArr2 = segment.f43304a;
                bArr = bArr2;
                i4 = segment.f43305b;
                i7 = segment.f43306c;
            }
            if (bArr[i4] != bytes[i5]) {
                return false;
            }
            i4++;
            i5++;
        }
        return true;
    }

    public static final String d(C3372e c3372e, long j4) {
        Intrinsics.checkNotNullParameter(c3372e, "<this>");
        if (j4 > 0) {
            long j5 = j4 - 1;
            if (c3372e.U(j5) == 13) {
                String j02 = c3372e.j0(j5);
                c3372e.H(2L);
                return j02;
            }
        }
        String j03 = c3372e.j0(j4);
        c3372e.H(1L);
        return j03;
    }

    public static final int e(C3372e c3372e, s options, boolean z4) {
        int i4;
        int i5;
        w wVar;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(c3372e, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        w wVar2 = c3372e.f43260b;
        if (wVar2 == null) {
            return z4 ? -2 : -1;
        }
        byte[] bArr = wVar2.f43304a;
        int i8 = wVar2.f43305b;
        int i9 = wVar2.f43306c;
        int[] f4 = options.f();
        w wVar3 = wVar2;
        int i10 = -1;
        int i11 = 0;
        loop0: while (true) {
            int i12 = i11 + 1;
            int i13 = f4[i11];
            int i14 = i11 + 2;
            int i15 = f4[i12];
            if (i15 != -1) {
                i10 = i15;
            }
            if (wVar3 == null) {
                break;
            }
            if (i13 >= 0) {
                i4 = i8 + 1;
                int i16 = bArr[i8] & 255;
                int i17 = i14 + i13;
                while (i14 != i17) {
                    if (i16 == f4[i14]) {
                        i5 = f4[i14 + i13];
                        if (i4 == i9) {
                            wVar3 = wVar3.f43309f;
                            Intrinsics.checkNotNull(wVar3);
                            i4 = wVar3.f43305b;
                            bArr = wVar3.f43304a;
                            i9 = wVar3.f43306c;
                            if (wVar3 == wVar2) {
                                wVar3 = null;
                            }
                        }
                        if (i5 >= 0) {
                            return i5;
                        }
                        i11 = -i5;
                        i8 = i4;
                    } else {
                        i14++;
                    }
                }
                break loop0;
            }
            int i18 = i14 + (i13 * (-1));
            while (true) {
                int i19 = i8 + 1;
                int i20 = i14 + 1;
                if ((bArr[i8] & 255) != f4[i14]) {
                    break loop0;
                }
                boolean z5 = i20 == i18;
                if (i19 == i9) {
                    Intrinsics.checkNotNull(wVar3);
                    w wVar4 = wVar3.f43309f;
                    Intrinsics.checkNotNull(wVar4);
                    i7 = wVar4.f43305b;
                    byte[] bArr2 = wVar4.f43304a;
                    i6 = wVar4.f43306c;
                    if (wVar4 != wVar2) {
                        wVar = wVar4;
                        bArr = bArr2;
                    } else {
                        if (!z5) {
                            break loop0;
                        }
                        bArr = bArr2;
                        wVar = null;
                    }
                } else {
                    wVar = wVar3;
                    i6 = i9;
                    i7 = i19;
                }
                if (z5) {
                    i5 = f4[i20];
                    i4 = i7;
                    i9 = i6;
                    wVar3 = wVar;
                    break;
                }
                i8 = i7;
                i9 = i6;
                wVar3 = wVar;
                i14 = i20;
            }
        }
        if (z4) {
            return -2;
        }
        return i10;
    }

    public static /* synthetic */ int f(C3372e c3372e, s sVar, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return e(c3372e, sVar, z4);
    }
}
