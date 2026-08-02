package X;

import E.AbstractC0005f;
import T.C0089g;
import T.C0097o;
import a.AbstractC0124a;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.KotlinVersion;
import v2.C;
import v2.F;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3552a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f3553b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3554c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f3555d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i4, int i5, boolean[] zArr) {
        int i6 = i5 - i4;
        AbstractC0124a.t(i6 >= 0);
        if (i6 == 0) {
            return i5;
        }
        if (zArr[0]) {
            a(zArr);
            return i4 - 3;
        }
        if (i6 > 1 && zArr[1] && bArr[i4] == 1) {
            a(zArr);
            return i4 - 2;
        }
        if (i6 > 2 && zArr[2] && bArr[i4] == 0 && bArr[i4 + 1] == 1) {
            a(zArr);
            return i4 - 1;
        }
        int i7 = i5 - 1;
        int i8 = i4 + 2;
        while (i8 < i7) {
            byte b4 = bArr[i8];
            if ((b4 & 254) == 0) {
                int i9 = i8 - 2;
                if (bArr[i9] == 0 && bArr[i8 - 1] == 0 && b4 == 1) {
                    a(zArr);
                    return i9;
                }
                i8 -= 2;
            }
            i8 += 3;
        }
        zArr[0] = i6 <= 2 ? !(i6 != 2 ? !(zArr[1] && bArr[i7] == 1) : !(zArr[2] && bArr[i5 + (-2)] == 0 && bArr[i7] == 1)) : bArr[i5 + (-3)] == 0 && bArr[i5 + (-2)] == 0 && bArr[i7] == 1;
        zArr[1] = i6 <= 1 ? zArr[2] && bArr[i7] == 0 : bArr[i5 + (-2)] == 0 && bArr[i7] == 0;
        zArr[2] = bArr[i7] == 0;
        return i5;
    }

    public static String c(C0097o c0097o) {
        String str = c0097o.n;
        String str2 = c0097o.f2866k;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return c0097o.n;
    }

    public static boolean d(byte[] bArr, int i4, C0097o c0097o) {
        int i5;
        if (Objects.equals(c0097o.n, "video/avc")) {
            byte b4 = bArr[4];
            if (((b4 & 96) >> 5) == 0 && ((i5 = b4 & 31) == 1 || i5 == 9 || i5 == 14)) {
                return false;
            }
        } else if (Objects.equals(c0097o.n, "video/hevc")) {
            A0.c f4 = f(new W.t(bArr, 4, i4 + 4));
            int i6 = f4.f9a;
            if (i6 == 35) {
                return false;
            }
            if (i6 <= 14 && i6 % 2 == 0 && f4.f11c == c0097o.f2845E - 1) {
                return false;
            }
        }
        return true;
    }

    public static int e(C0097o c0097o) {
        String c4 = c(c0097o);
        if (Objects.equals(c4, "video/avc")) {
            return 1;
        }
        return Objects.equals(c4, "video/hevc") ? 2 : 0;
    }

    public static A0.c f(W.t tVar) {
        tVar.s();
        return new A0.c(tVar.i(6), tVar.i(6), tVar.i(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i g(W.t tVar, boolean z, int i4, i iVar) {
        int[] iArr;
        int i5;
        boolean z4;
        int i6;
        int i7;
        boolean z5;
        int i8;
        int i9;
        int[] iArr2 = new int[6];
        if (z) {
            int i10 = tVar.i(2);
            z5 = tVar.h();
            i8 = tVar.i(5);
            i9 = 0;
            for (int i11 = 0; i11 < 32; i11++) {
                if (tVar.h()) {
                    i9 |= 1 << i11;
                }
            }
            for (int i12 = 0; i12 < 6; i12++) {
                iArr2[i12] = tVar.i(8);
            }
            i5 = i10;
        } else {
            if (iVar == null) {
                iArr = iArr2;
                i5 = 0;
                z4 = false;
                i6 = 0;
                i7 = 0;
                int i13 = tVar.i(8);
                int i14 = 0;
                for (int i15 = 0; i15 < i4; i15++) {
                    if (tVar.h()) {
                        i14 += 88;
                    }
                    if (tVar.h()) {
                        i14 += 8;
                    }
                }
                tVar.t(i14);
                if (i4 > 0) {
                    tVar.t((8 - i4) * 2);
                }
                return new i(i5, z4, i6, i7, iArr, i13);
            }
            int i16 = iVar.f3504a;
            z5 = iVar.f3505b;
            i8 = iVar.f3506c;
            i9 = iVar.f3507d;
            iArr2 = iVar.f3508e;
            i5 = i16;
        }
        iArr = iArr2;
        z4 = z5;
        i6 = i8;
        i7 = i9;
        int i132 = tVar.i(8);
        int i142 = 0;
        while (i15 < i4) {
        }
        tVar.t(i142);
        if (i4 > 0) {
        }
        return new i(i5, z4, i6, i7, iArr, i132);
    }

    public static E3.j h(byte[] bArr, int i4, int i5) {
        byte b4;
        int i6 = i4 + 2;
        do {
            i5--;
            b4 = bArr[i5];
            if (b4 != 0) {
                break;
            }
        } while (i5 > i6);
        if (b4 == 0 || i5 <= i6) {
            return null;
        }
        W.t tVar = new W.t(bArr, i6, i5 + 1);
        while (tVar.d(16)) {
            int i7 = tVar.i(8);
            int i8 = 0;
            while (i7 == 255) {
                i8 += KotlinVersion.MAX_COMPONENT_VALUE;
                i7 = tVar.i(8);
            }
            int i9 = i8 + i7;
            int i10 = tVar.i(8);
            int i11 = 0;
            while (i10 == 255) {
                i11 += KotlinVersion.MAX_COMPONENT_VALUE;
                i10 = tVar.i(8);
            }
            int i12 = i11 + i10;
            if (i12 == 0 || !tVar.d(i12)) {
                return null;
            }
            if (i9 == 176) {
                int m4 = tVar.m();
                boolean h2 = tVar.h();
                int m5 = h2 ? tVar.m() : 0;
                int m6 = tVar.m();
                int i13 = -1;
                for (int i14 = 0; i14 <= m6; i14++) {
                    i13 = tVar.m();
                    tVar.m();
                    int i15 = tVar.i(6);
                    if (i15 == 63) {
                        return null;
                    }
                    tVar.i(i15 == 0 ? Math.max(0, m4 - 30) : Math.max(0, (i15 + m4) - 31));
                    if (h2) {
                        int i16 = tVar.i(6);
                        if (i16 == 63) {
                            return null;
                        }
                        tVar.i(i16 == 0 ? Math.max(0, m5 - 30) : Math.max(0, (i16 + m5) - 31));
                    }
                    if (tVar.h()) {
                        tVar.t(10);
                    }
                }
                return new E3.j(i13);
            }
            tVar.t(i12 * 8);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l i(byte[] bArr, int i4, int i5, G1.c cVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        int m4;
        int i10;
        int m5;
        int i11;
        int i12;
        int i13;
        int m6;
        int i14;
        i iVar;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        j jVar;
        int i25;
        int i26;
        int i27;
        j jVar2;
        A0.c f4 = f(new W.t(bArr, i4, i5));
        W.t tVar = new W.t(bArr, i4 + 2, i5);
        int i28 = 4;
        tVar.t(4);
        int i29 = tVar.i(3);
        int i30 = f4.f10b;
        boolean z = i30 != 0 && i29 == 7;
        if (cVar != null) {
            I i31 = (I) cVar.f835b;
            if (!i31.isEmpty()) {
                i6 = ((h) i31.get(Math.min(i30, i31.size() - 1))).f3502a;
                i iVar2 = null;
                if (z) {
                    tVar.s();
                    iVar2 = g(tVar, true, i29, null);
                } else if (cVar != null) {
                    j jVar3 = (j) cVar.f836c;
                    int[] iArr = jVar3.f3511b;
                    I i32 = jVar3.f3510a;
                    int i33 = iArr[i6];
                    if (i32.size() > i33) {
                        iVar2 = (i) i32.get(i33);
                    }
                }
                tVar.m();
                if (z) {
                    int m7 = tVar.m();
                    if (m7 == 3) {
                        tVar.s();
                    }
                    int m8 = tVar.m();
                    int m9 = tVar.m();
                    if (tVar.h()) {
                        int m10 = tVar.m();
                        int m11 = tVar.m();
                        int m12 = tVar.m();
                        int m13 = tVar.m();
                        i7 = m8 - ((m10 + m11) * ((m7 == 1 || m7 == 2) ? 2 : 1));
                        i8 = m9 - ((m12 + m13) * (m7 == 1 ? 2 : 1));
                    } else {
                        i7 = m8;
                        i8 = m9;
                    }
                    i9 = i8;
                    m4 = tVar.m();
                    i10 = i7;
                    m5 = tVar.m();
                    i11 = m9;
                    i12 = m8;
                } else {
                    int i34 = tVar.h() ? tVar.i(8) : -1;
                    if (cVar != null && (jVar2 = (j) cVar.f837d) != null) {
                        I i35 = jVar2.f3510a;
                        if (i34 == -1) {
                            i34 = jVar2.f3511b[i6];
                        }
                        if (i34 != -1 && i35.size() > i34) {
                            k kVar = (k) i35.get(i34);
                            int i36 = kVar.f3512a;
                            i10 = kVar.f3515d;
                            int i37 = kVar.f3516e;
                            m4 = kVar.f3513b;
                            m5 = kVar.f3514c;
                            i9 = i37;
                            i11 = i9;
                            i12 = i10;
                        }
                    }
                    m4 = 0;
                    m5 = 0;
                    i10 = 0;
                    i12 = 0;
                    i9 = 0;
                    i11 = 0;
                }
                int m14 = tVar.m();
                if (z) {
                    i13 = -1;
                    for (int i38 = tVar.h() ? 0 : i29; i38 <= i29; i38++) {
                        tVar.m();
                        i13 = Math.max(tVar.m(), i13);
                        tVar.m();
                    }
                } else {
                    i13 = -1;
                }
                tVar.m();
                tVar.m();
                tVar.m();
                tVar.m();
                tVar.m();
                tVar.m();
                if (tVar.h()) {
                    int i39 = 6;
                    if (z ? tVar.h() : false) {
                        tVar.t(6);
                    } else if (tVar.h()) {
                        int i40 = 0;
                        while (i40 < i28) {
                            int i41 = 0;
                            while (i41 < i39) {
                                if (tVar.h()) {
                                    int min = Math.min(64, 1 << ((i40 << 1) + 4));
                                    if (i40 > 1) {
                                        tVar.n();
                                    }
                                    for (int i42 = 0; i42 < min; i42++) {
                                        tVar.n();
                                    }
                                } else {
                                    tVar.m();
                                }
                                i41 += i40 == 3 ? 3 : 1;
                                i39 = 6;
                            }
                            i40++;
                            i28 = 4;
                            i39 = 6;
                        }
                    }
                }
                tVar.t(2);
                if (tVar.h()) {
                    tVar.t(8);
                    tVar.m();
                    tVar.m();
                    tVar.s();
                }
                m6 = tVar.m();
                int[] iArr2 = new int[0];
                int[] iArr3 = new int[0];
                i14 = 0;
                int i43 = -1;
                int i44 = -1;
                while (i14 < m6) {
                    if (i14 == 0 || !tVar.h()) {
                        i25 = m6;
                        i26 = i6;
                        i27 = i14;
                        int m15 = tVar.m();
                        i43 = tVar.m();
                        int[] iArr4 = new int[m15];
                        int i45 = 0;
                        while (i45 < m15) {
                            iArr4[i45] = (i45 > 0 ? iArr4[i45 - 1] : 0) - (tVar.m() + 1);
                            tVar.s();
                            i45++;
                        }
                        int[] iArr5 = new int[i43];
                        int i46 = 0;
                        while (i46 < i43) {
                            iArr5[i46] = tVar.m() + 1 + (i46 > 0 ? iArr5[i46 - 1] : 0);
                            tVar.s();
                            i46++;
                        }
                        i44 = m15;
                        iArr2 = iArr4;
                        iArr3 = iArr5;
                    } else {
                        i25 = m6;
                        int i47 = i44 + i43;
                        int m16 = (1 - ((tVar.h() ? 1 : 0) * 2)) * (tVar.m() + 1);
                        i26 = i6;
                        int i48 = i47 + 1;
                        i27 = i14;
                        boolean[] zArr = new boolean[i48];
                        for (int i49 = 0; i49 <= i47; i49++) {
                            if (tVar.h()) {
                                zArr[i49] = true;
                            } else {
                                zArr[i49] = tVar.h();
                            }
                        }
                        int[] iArr6 = new int[i48];
                        int[] iArr7 = new int[i48];
                        int i50 = 0;
                        for (int i51 = i43 - 1; i51 >= 0; i51--) {
                            int i52 = iArr3[i51] + m16;
                            if (i52 < 0 && zArr[i44 + i51]) {
                                iArr6[i50] = i52;
                                i50++;
                            }
                        }
                        if (m16 < 0 && zArr[i47]) {
                            iArr6[i50] = m16;
                            i50++;
                        }
                        int i53 = i50;
                        int[] iArr8 = iArr2;
                        for (int i54 = 0; i54 < i44; i54++) {
                            int i55 = iArr8[i54] + m16;
                            if (i55 < 0 && zArr[i54]) {
                                iArr6[i53] = i55;
                                i53++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr6, i53);
                        int i56 = 0;
                        for (int i57 = i44 - 1; i57 >= 0; i57--) {
                            int i58 = iArr8[i57] + m16;
                            if (i58 > 0 && zArr[i57]) {
                                iArr7[i56] = i58;
                                i56++;
                            }
                        }
                        if (m16 > 0 && zArr[i47]) {
                            iArr7[i56] = m16;
                            i56++;
                        }
                        int i59 = i53;
                        int i60 = i56;
                        for (int i61 = 0; i61 < i43; i61++) {
                            int i62 = iArr3[i61] + m16;
                            if (i62 > 0 && zArr[i44 + i61]) {
                                iArr7[i60] = i62;
                                i60++;
                            }
                        }
                        iArr3 = Arrays.copyOf(iArr7, i60);
                        i43 = i60;
                        i44 = i59;
                        iArr2 = copyOf;
                    }
                    i14 = i27 + 1;
                    m6 = i25;
                    i6 = i26;
                }
                int i63 = i6;
                if (tVar.h()) {
                    int m17 = tVar.m();
                    for (int i64 = 0; i64 < m17; i64++) {
                        tVar.t(m14 + 5);
                    }
                }
                tVar.t(2);
                float f5 = 1.0f;
                if (tVar.h()) {
                    iVar = iVar2;
                    i15 = m4;
                    i16 = i10;
                    i17 = i12;
                    i18 = i11;
                    i19 = -1;
                    i20 = -1;
                    i21 = -1;
                } else {
                    if (tVar.h()) {
                        int i65 = tVar.i(8);
                        if (i65 == 255) {
                            int i66 = tVar.i(16);
                            int i67 = tVar.i(16);
                            if (i66 != 0 && i67 != 0) {
                                f5 = i66 / i67;
                            }
                        } else if (i65 < 17) {
                            f5 = f3553b[i65];
                        } else {
                            AbstractC0005f.u(i65, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                        }
                    }
                    if (tVar.h()) {
                        tVar.s();
                    }
                    if (tVar.h()) {
                        tVar.t(3);
                        i24 = tVar.h() ? 1 : 2;
                        if (tVar.h()) {
                            int i68 = tVar.i(8);
                            int i69 = tVar.i(8);
                            tVar.t(8);
                            i22 = C0089g.f(i68);
                            i23 = C0089g.g(i69);
                        } else {
                            i22 = -1;
                            i23 = -1;
                        }
                    } else {
                        if (cVar != null && (jVar = (j) cVar.f838e) != null) {
                            I i70 = jVar.f3510a;
                            int i71 = jVar.f3511b[i63];
                            if (i70.size() > i71) {
                                m mVar = (m) i70.get(i71);
                                int i72 = mVar.f3530a;
                                int i73 = mVar.f3531b;
                                i23 = mVar.f3532c;
                                i22 = i72;
                                i24 = i73;
                            }
                        }
                        i22 = -1;
                        i23 = -1;
                        i24 = -1;
                    }
                    if (tVar.h()) {
                        tVar.m();
                        tVar.m();
                    }
                    tVar.s();
                    if (tVar.h()) {
                        i9 *= 2;
                    }
                    i19 = i22;
                    i21 = i23;
                    i20 = i24;
                    iVar = iVar2;
                    i15 = m4;
                    i16 = i10;
                    i17 = i12;
                    i18 = i11;
                }
                return new l(i29, iVar, i15, m5, i16, i9, i17, i18, f5, i13, i19, i20, i21);
            }
        }
        i6 = 0;
        i iVar22 = null;
        if (z) {
        }
        tVar.m();
        if (z) {
        }
        int m142 = tVar.m();
        if (z) {
        }
        tVar.m();
        tVar.m();
        tVar.m();
        tVar.m();
        tVar.m();
        tVar.m();
        if (tVar.h()) {
        }
        tVar.t(2);
        if (tVar.h()) {
        }
        m6 = tVar.m();
        int[] iArr22 = new int[0];
        int[] iArr32 = new int[0];
        i14 = 0;
        int i432 = -1;
        int i442 = -1;
        while (i14 < m6) {
        }
        int i632 = i6;
        if (tVar.h()) {
        }
        tVar.t(2);
        float f52 = 1.0f;
        if (tVar.h()) {
        }
        return new l(i29, iVar, i15, m5, i16, i9, i17, i18, f52, i13, i19, i20, i21);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static G1.c j(byte[] bArr, int i4, int i5) {
        int[] iArr;
        int[] iArr2;
        j jVar;
        int i6;
        int i7;
        int i8;
        boolean z;
        int i9;
        a0 a0Var;
        boolean[][] zArr;
        int i10;
        boolean[][] zArr2;
        int[] iArr3;
        int[] iArr4;
        int i11;
        boolean z4;
        int i12;
        boolean h2;
        int i13;
        int i14;
        int i15;
        boolean h4;
        int i16;
        int i17;
        boolean z5;
        boolean z6;
        W.t tVar = new W.t(bArr, i4, i5);
        f(tVar);
        tVar.t(4);
        boolean h5 = tVar.h();
        boolean h6 = tVar.h();
        int i18 = tVar.i(6);
        int i19 = i18 + 1;
        int i20 = tVar.i(3);
        tVar.t(17);
        i g4 = g(tVar, true, i20, null);
        for (int i21 = tVar.h() ? 0 : i20; i21 <= i20; i21++) {
            tVar.m();
            tVar.m();
            tVar.m();
        }
        int i22 = tVar.i(6);
        int m4 = tVar.m() + 1;
        int i23 = 6;
        int i24 = 1;
        j jVar2 = new j(I.o(g4), new int[1], 0);
        boolean z7 = i19 >= 2 && m4 >= 2;
        boolean z8 = h5 && h6;
        int i25 = i22 + 1;
        boolean z9 = i25 >= i19;
        if (!z7 || !z8 || !z9) {
            return new G1.c((a0) null, jVar2, (j) null, (j) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, m4, i25);
        int[] iArr6 = new int[m4];
        int[] iArr7 = new int[m4];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i26 = 1; i26 < m4; i26++) {
            int i27 = 0;
            for (int i28 = 0; i28 <= i22; i28++) {
                if (tVar.h()) {
                    iArr5[i26][i27] = i28;
                    iArr7[i26] = i28;
                    i27++;
                }
                iArr6[i26] = i27;
            }
        }
        if (tVar.h()) {
            tVar.t(64);
            if (tVar.h()) {
                tVar.m();
            }
            int m5 = tVar.m();
            int i29 = 0;
            while (i29 < m5) {
                tVar.m();
                if (i29 == 0 || tVar.h()) {
                    boolean h7 = tVar.h();
                    boolean h8 = tVar.h();
                    z6 = h7;
                    z5 = h8;
                    if (h7 || h8) {
                        h2 = tVar.h();
                        if (h2) {
                            tVar.t(19);
                        }
                        tVar.t(8);
                        if (h2) {
                            tVar.t(4);
                        }
                        tVar.t(15);
                        i14 = h7;
                        i13 = h8;
                        i15 = 0;
                        while (i15 <= i20) {
                            boolean h9 = tVar.h();
                            if (!h9) {
                                h9 = tVar.h();
                            }
                            if (h9) {
                                tVar.m();
                                h4 = false;
                            } else {
                                h4 = tVar.h();
                            }
                            if (h4) {
                                i16 = i29;
                                i17 = 0;
                            } else {
                                i16 = i29;
                                i17 = tVar.m();
                            }
                            int[][] iArr8 = iArr5;
                            int i30 = i14 + i13;
                            int[] iArr9 = iArr7;
                            int i31 = 0;
                            while (i31 < i30) {
                                int i32 = i30;
                                for (int i33 = 0; i33 <= i17; i33++) {
                                    tVar.m();
                                    tVar.m();
                                    if (h2) {
                                        tVar.m();
                                        tVar.m();
                                    }
                                    tVar.s();
                                }
                                i31++;
                                i30 = i32;
                            }
                            i15++;
                            i29 = i16;
                            iArr5 = iArr8;
                            iArr7 = iArr9;
                        }
                        i29++;
                    }
                } else {
                    z6 = false;
                    z5 = false;
                }
                h2 = false;
                i14 = z6;
                i13 = z5;
                i15 = 0;
                while (i15 <= i20) {
                }
                i29++;
            }
        }
        int[][] iArr10 = iArr5;
        int[] iArr11 = iArr7;
        if (!tVar.h()) {
            return new G1.c((a0) null, jVar2, (j) null, (j) null);
        }
        int i34 = tVar.f3346e;
        if (i34 > 0) {
            tVar.t(8 - i34);
        }
        i g5 = g(tVar, false, i20, g4);
        boolean h10 = tVar.h();
        boolean[] zArr3 = new boolean[16];
        int i35 = 0;
        for (int i36 = 0; i36 < 16; i36++) {
            boolean h11 = tVar.h();
            zArr3[i36] = h11;
            if (h11) {
                i35++;
            }
        }
        if (i35 == 0 || !zArr3[1]) {
            return new G1.c((a0) null, jVar2, (j) null, (j) null);
        }
        int[] iArr12 = new int[i35];
        for (int i37 = 0; i37 < i35 - (h10 ? 1 : 0); i37++) {
            iArr12[i37] = tVar.i(3);
        }
        int[] iArr13 = new int[i35 + 1];
        if (h10) {
            int i38 = 1;
            while (i38 < i35) {
                int[] iArr14 = iArr13;
                for (int i39 = 0; i39 < i38; i39++) {
                    iArr14[i38] = iArr12[i39] + 1 + iArr14[i38];
                }
                i38++;
                iArr13 = iArr14;
            }
            iArr = iArr13;
            iArr[i35] = 6;
        } else {
            iArr = iArr13;
        }
        int[][] iArr15 = (int[][]) Array.newInstance((Class<?>) cls, i19, i35);
        int[] iArr16 = new int[i19];
        iArr16[0] = 0;
        boolean h12 = tVar.h();
        int i40 = 1;
        while (i40 < i19) {
            if (h12) {
                i12 = i40;
                iArr16[i12] = tVar.i(i23);
            } else {
                i12 = i40;
                iArr16[i12] = i12;
            }
            if (h10) {
                for (int i41 = 0; i41 < i35; i41++) {
                    iArr15[i12][i41] = (iArr16[i12] & ((1 << iArr[r31]) - 1)) >> iArr[i41];
                }
            } else {
                int i42 = 0;
                while (i42 < i35) {
                    int i43 = i42;
                    iArr15[i12][i43] = tVar.i(iArr12[i42] + 1);
                    i42 = i43 + 1;
                }
            }
            i40 = i12 + 1;
            i23 = 6;
        }
        int[] iArr17 = new int[i25];
        int i44 = 1;
        int i45 = 0;
        while (i45 < i19) {
            iArr17[iArr16[i45]] = -1;
            int[] iArr18 = iArr17;
            int i46 = 0;
            int i47 = 0;
            while (i46 < 16) {
                if (zArr3[i46]) {
                    if (i46 == i24) {
                        iArr18[iArr16[i45]] = iArr15[i45][i47];
                    }
                    i47++;
                }
                i46++;
                i24 = 1;
            }
            if (i45 > 0) {
                int i48 = 0;
                while (true) {
                    if (i48 >= i45) {
                        z4 = true;
                        break;
                    }
                    int i49 = i48;
                    if (iArr18[iArr16[i45]] == iArr18[iArr16[i48]]) {
                        z4 = false;
                        break;
                    }
                    i48 = i49 + 1;
                }
                if (z4) {
                    i44++;
                }
            }
            i45++;
            iArr17 = iArr18;
            i24 = 1;
        }
        int[] iArr19 = iArr17;
        int i50 = tVar.i(4);
        if (i44 < 2 || i50 == 0) {
            return new G1.c((a0) null, jVar2, (j) null, (j) null);
        }
        int[] iArr20 = new int[i44];
        for (int i51 = 0; i51 < i44; i51++) {
            iArr20[i51] = tVar.i(i50);
        }
        int[] iArr21 = new int[i25];
        int i52 = 0;
        while (i52 < i19) {
            iArr21[Math.min(iArr16[i52], i22)] = i52;
            i52++;
            iArr20 = iArr20;
        }
        int[] iArr22 = iArr20;
        F j4 = I.j();
        int i53 = 0;
        while (i53 <= i22) {
            int i54 = i44;
            int[] iArr23 = iArr16;
            int min = Math.min(iArr19[i53], i54 - 1);
            int[] iArr24 = iArr21;
            j4.b(new h(iArr24[i53], min >= 0 ? iArr22[min] : -1));
            i53++;
            i44 = i54;
            iArr21 = iArr24;
            iArr16 = iArr23;
        }
        int[] iArr25 = iArr16;
        a0 f4 = j4.f();
        if (((h) f4.get(0)).f3503b == -1) {
            return new G1.c((a0) null, jVar2, (j) null, (j) null);
        }
        int i55 = 1;
        while (true) {
            if (i55 > i22) {
                i55 = -1;
                break;
            }
            if (((h) f4.get(i55)).f3503b != -1) {
                break;
            }
            i55++;
        }
        if (i55 == -1) {
            return new G1.c((a0) null, jVar2, (j) null, (j) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i19, i19);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i19, i19);
        int i56 = 1;
        while (i56 < i19) {
            boolean[][] zArr6 = zArr5;
            for (int i57 = 0; i57 < i56; i57++) {
                boolean[] zArr7 = zArr4[i56];
                boolean[] zArr8 = zArr6[i56];
                boolean h13 = tVar.h();
                zArr8[i57] = h13;
                zArr7[i57] = h13;
            }
            i56++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i58 = 1; i58 < i19; i58++) {
            int i59 = 0;
            while (i59 < i18) {
                boolean[][] zArr10 = zArr4;
                int i60 = 0;
                while (true) {
                    if (i60 < i58) {
                        boolean[] zArr11 = zArr9[i58];
                        if (zArr11[i60] && zArr9[i60][i59]) {
                            zArr11[i59] = true;
                            break;
                        }
                        i60++;
                    }
                }
                i59++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr26 = new int[i25];
        for (int i61 = 0; i61 < i19; i61++) {
            int i62 = 0;
            for (int i63 = 0; i63 < i61; i63++) {
                i62 += zArr12[i61][i63] ? 1 : 0;
            }
            iArr26[iArr25[i61]] = i62;
        }
        int i64 = 0;
        for (int i65 = 0; i65 < i19; i65++) {
            if (iArr26[iArr25[i65]] == 0) {
                i64++;
            }
        }
        if (i64 > 1) {
            return new G1.c((a0) null, jVar2, (j) null, (j) null);
        }
        int[] iArr27 = new int[i19];
        int[] iArr28 = new int[m4];
        if (tVar.h()) {
            iArr2 = iArr26;
            int i66 = 0;
            while (i66 < i19) {
                int i67 = i66;
                iArr27[i67] = tVar.i(3);
                i66 = i67 + 1;
            }
        } else {
            iArr2 = iArr26;
            Arrays.fill(iArr27, 0, i19, i20);
        }
        int i68 = 0;
        while (i68 < m4) {
            int i69 = i68;
            int[] iArr29 = iArr27;
            int[] iArr30 = iArr28;
            int i70 = 0;
            for (int i71 = 0; i71 < iArr6[i69]; i71++) {
                i70 = Math.max(i70, iArr29[((h) f4.get(iArr10[i69][i71])).f3502a]);
            }
            iArr30[i69] = i70 + 1;
            i68 = i69 + 1;
            iArr27 = iArr29;
            iArr28 = iArr30;
        }
        int[] iArr31 = iArr28;
        if (tVar.h()) {
            int i72 = 0;
            while (i72 < i18) {
                int i73 = i72 + 1;
                int i74 = i73;
                while (i74 < i19) {
                    if (zArr12[i74][i72]) {
                        i11 = i18;
                        tVar.t(3);
                    } else {
                        i11 = i18;
                    }
                    i74++;
                    i18 = i11;
                }
                i72 = i73;
            }
        }
        tVar.s();
        int m6 = tVar.m() + 1;
        F j5 = I.j();
        j5.b(g4);
        if (m6 > 1) {
            j5.b(g5);
            for (int i75 = 2; i75 < m6; i75++) {
                g5 = g(tVar, tVar.h(), i20, g5);
                j5.b(g5);
            }
        }
        a0 f5 = j5.f();
        int m7 = tVar.m() + m4;
        if (m7 > m4) {
            return new G1.c((a0) null, jVar2, (j) null, (j) null);
        }
        int i76 = tVar.i(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, m7, i25);
        int[] iArr32 = new int[m7];
        int i77 = 0;
        int[] iArr33 = new int[m7];
        int i78 = 0;
        while (i78 < m4) {
            iArr32[i78] = i77;
            iArr33[i78] = iArr11[i78];
            if (i76 == 0) {
                i10 = i78;
                zArr2 = zArr13;
                iArr3 = iArr32;
                iArr4 = iArr6;
                Arrays.fill(zArr13[i10], i77, iArr6[i10], true);
                iArr3[i10] = iArr4[i10];
            } else {
                i10 = i78;
                zArr2 = zArr13;
                iArr3 = iArr32;
                iArr4 = iArr6;
                if (i76 == 1) {
                    int i79 = iArr11[i10];
                    for (int i80 = 0; i80 < iArr4[i10]; i80++) {
                        zArr2[i10][i80] = iArr10[i10][i80] == i79;
                    }
                    iArr3[i10] = 1;
                } else {
                    i77 = 0;
                    zArr2[0][0] = true;
                    iArr3[0] = 1;
                    i78 = i10 + 1;
                    zArr13 = zArr2;
                    iArr32 = iArr3;
                    iArr6 = iArr4;
                }
            }
            i77 = 0;
            i78 = i10 + 1;
            zArr13 = zArr2;
            iArr32 = iArr3;
            iArr6 = iArr4;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr34 = iArr32;
        int[] iArr35 = iArr6;
        int[] iArr36 = new int[i25];
        int i81 = 2;
        int[] iArr37 = new int[2];
        iArr37[1] = i25;
        iArr37[i77] = m7;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr37);
        int i82 = 1;
        int i83 = 0;
        while (i82 < m7) {
            if (i76 == i81) {
                for (int i84 = 0; i84 < iArr35[i82]; i84++) {
                    zArr14[i82][i84] = tVar.h();
                    int i85 = iArr34[i82];
                    boolean z10 = zArr14[i82][i84];
                    iArr34[i82] = i85 + (z10 ? 1 : 0);
                    if (z10) {
                        iArr33[i82] = iArr10[i82][i84];
                    }
                }
            }
            if (i83 == 0) {
                i9 = 0;
                if (iArr10[i82][0] == 0 && zArr14[i82][0]) {
                    for (int i86 = 1; i86 < iArr35[i82]; i86++) {
                        if (iArr10[i82][i86] == i55 && zArr14[i82][i55]) {
                            i83 = i82;
                        }
                    }
                }
            } else {
                i9 = 0;
            }
            int i87 = i9;
            while (i87 < iArr35[i82]) {
                if (m6 > 1) {
                    zArr15[i82][i87] = zArr14[i82][i87];
                    a0Var = f5;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int c4 = x2.c.c(m6);
                    if (!zArr[i82][i87]) {
                        int i88 = ((h) f4.get(iArr10[i82][i87])).f3502a;
                        int i89 = i9;
                        while (true) {
                            if (i89 >= i87) {
                                break;
                            }
                            int i90 = i89;
                            if (zArr9[i88][((h) f4.get(iArr10[i82][i90])).f3502a]) {
                                zArr[i82][i87] = true;
                                break;
                            }
                            i89 = i90 + 1;
                        }
                    }
                    if (zArr[i82][i87]) {
                        if (i83 <= 0 || i82 != i83) {
                            tVar.t(c4);
                        } else {
                            iArr36[i87] = tVar.i(c4);
                        }
                    }
                } else {
                    a0Var = f5;
                    zArr = zArr15;
                }
                i87++;
                f5 = a0Var;
                zArr15 = zArr;
            }
            a0 a0Var2 = f5;
            boolean[][] zArr16 = zArr15;
            if (iArr34[i82] == 1 && iArr2[iArr33[i82]] > 0) {
                tVar.s();
            }
            i82++;
            f5 = a0Var2;
            zArr15 = zArr16;
            i81 = 2;
        }
        a0 a0Var3 = f5;
        boolean[][] zArr17 = zArr15;
        if (i83 == 0) {
            return new G1.c((a0) null, jVar2, (j) null, (j) null);
        }
        int m8 = tVar.m();
        int i91 = m8 + 1;
        v2.r.d(i91, "expectedSize");
        v2.r.d(i91, "initialCapacity");
        int[] iArr38 = new int[i19];
        Object[] objArr = new Object[i91];
        int i92 = 0;
        int i93 = 0;
        boolean z11 = false;
        while (i92 < i91) {
            int i94 = i92;
            int i95 = tVar.i(16);
            int i96 = tVar.i(16);
            boolean z12 = z11;
            if (tVar.h()) {
                i6 = tVar.i(2);
                if (i6 == 3) {
                    tVar.s();
                }
                i7 = tVar.i(4);
                i8 = tVar.i(4);
            } else {
                i6 = 0;
                i7 = 0;
                i8 = 0;
            }
            if (tVar.h()) {
                int m9 = tVar.m();
                int m10 = tVar.m();
                int m11 = tVar.m();
                int m12 = tVar.m();
                i95 -= (m9 + m10) * ((i6 == 1 || i6 == 2) ? 2 : 1);
                i96 -= (m11 + m12) * (i6 == 1 ? 2 : 1);
            }
            k kVar = new k(i6, i7, i8, i95, i96);
            int e4 = C.e(objArr.length, i93 + 1);
            if (e4 > objArr.length || z12) {
                objArr = Arrays.copyOf(objArr, e4);
                z = false;
            } else {
                z = z12;
            }
            objArr[i93] = kVar;
            i93++;
            i92 = i94 + 1;
            z11 = z;
        }
        if (i91 <= 1 || !tVar.h()) {
            for (int i97 = 1; i97 < i19; i97++) {
                iArr38[i97] = Math.min(i97, m8);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int c5 = x2.c.c(i91);
            for (int i98 = 1; i98 < i19; i98++) {
                iArr38[i98] = tVar.i(c5);
            }
        }
        j jVar3 = new j(I.i(i93, objArr), iArr38, 1);
        tVar.t(2);
        for (int i99 = 1; i99 < i19; i99++) {
            if (iArr2[iArr25[i99]] == 0) {
                tVar.s();
            }
        }
        for (int i100 = 1; i100 < m7; i100++) {
            boolean h14 = tVar.h();
            int i101 = 0;
            while (i101 < iArr31[i100]) {
                if ((i101 <= 0 || !h14) ? i101 == 0 : tVar.h()) {
                    for (int i102 = 0; i102 < iArr35[i100]; i102++) {
                        if (zArr17[i100][i102]) {
                            tVar.m();
                        }
                    }
                    tVar.m();
                    tVar.m();
                }
                i101++;
            }
        }
        int m13 = tVar.m() + 2;
        if (tVar.h()) {
            tVar.t(m13);
        } else {
            for (int i103 = 1; i103 < i19; i103++) {
                for (int i104 = 0; i104 < i103; i104++) {
                    if (zArr12[i103][i104]) {
                        tVar.t(m13);
                    }
                }
            }
        }
        int m14 = tVar.m();
        for (int i105 = 1; i105 <= m14; i105++) {
            tVar.t(8);
        }
        if (tVar.h()) {
            int i106 = tVar.f3346e;
            if (i106 > 0) {
                tVar.t(8 - i106);
            }
            if (!tVar.h() ? tVar.h() : true) {
                tVar.s();
            }
            boolean h15 = tVar.h();
            boolean h16 = tVar.h();
            if (h15 || h16) {
                for (int i107 = 0; i107 < m4; i107++) {
                    for (int i108 = 0; i108 < iArr31[i107]; i108++) {
                        boolean h17 = h15 ? tVar.h() : false;
                        boolean h18 = h16 ? tVar.h() : false;
                        if (h17) {
                            tVar.t(32);
                        }
                        if (h18) {
                            tVar.t(18);
                        }
                    }
                }
            }
            boolean h19 = tVar.h();
            int i109 = h19 ? tVar.i(4) + 1 : i19;
            v2.r.d(i109, "expectedSize");
            v2.r.d(i109, "initialCapacity");
            int[] iArr39 = new int[i19];
            Object[] objArr2 = new Object[i109];
            int i110 = 0;
            int i111 = 0;
            boolean z13 = false;
            while (i110 < i109) {
                tVar.t(3);
                int i112 = tVar.h() ? 1 : 2;
                int f6 = C0089g.f(tVar.i(8));
                boolean z14 = h19;
                int g6 = C0089g.g(tVar.i(8));
                tVar.t(8);
                m mVar = new m(f6, i112, g6);
                int e5 = C.e(objArr2.length, i111 + 1);
                if (e5 > objArr2.length || z13) {
                    objArr2 = Arrays.copyOf(objArr2, e5);
                    z13 = false;
                }
                objArr2[i111] = mVar;
                i110++;
                i111++;
                h19 = z14;
                z13 = z13;
            }
            if (h19 && i109 > 1) {
                for (int i113 = 0; i113 < i19; i113++) {
                    iArr39[i113] = tVar.i(4);
                }
            }
            jVar = new j(I.i(i111, objArr2), iArr39, 2);
        } else {
            jVar = null;
        }
        return new G1.c(f4, new j(a0Var3, iArr36, 0), jVar3, jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o k(byte[] bArr, int i4, int i5) {
        int m4;
        int m5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z4;
        boolean h2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f4;
        int i18;
        int i19;
        int i20;
        boolean h4;
        boolean h5;
        int i21;
        W.t tVar = new W.t(bArr, i4 + 1, i5);
        int i22 = tVar.i(8);
        int i23 = tVar.i(8);
        int i24 = tVar.i(8);
        int m6 = tVar.m();
        if (i22 == 100 || i22 == 110 || i22 == 122 || i22 == 244 || i22 == 44 || i22 == 83 || i22 == 86 || i22 == 118 || i22 == 128 || i22 == 138) {
            m4 = tVar.m();
            boolean h6 = m4 == 3 ? tVar.h() : false;
            int m7 = tVar.m();
            m5 = tVar.m();
            tVar.s();
            if (tVar.h()) {
                int i25 = m4 != 3 ? 8 : 12;
                i6 = 16;
                int i26 = 0;
                while (i26 < i25) {
                    if (tVar.h()) {
                        int i27 = i26 < 6 ? 16 : 64;
                        int i28 = 8;
                        int i29 = 8;
                        for (int i30 = 0; i30 < i27; i30++) {
                            if (i28 != 0) {
                                i28 = ((tVar.n() + i29) + 256) % 256;
                            }
                            if (i28 != 0) {
                                i29 = i28;
                            }
                        }
                    }
                    i26++;
                }
            } else {
                i6 = 16;
            }
            z = h6;
            i7 = m7;
        } else {
            m4 = 1;
            i6 = 16;
            i7 = 0;
            z = false;
            m5 = 0;
        }
        int m8 = tVar.m() + 4;
        int m9 = tVar.m();
        if (m9 == 0) {
            i11 = tVar.m() + 4;
            i8 = i22;
            i9 = m9;
            i10 = m5;
        } else {
            if (m9 == 1) {
                boolean h7 = tVar.h();
                tVar.n();
                tVar.n();
                i8 = i22;
                long m10 = tVar.m();
                i9 = m9;
                for (int i31 = 0; i31 < m10; i31++) {
                    tVar.m();
                }
                i10 = m5;
                z4 = h7;
                i11 = 0;
                tVar.m();
                tVar.s();
                int m11 = tVar.m() + 1;
                int m12 = tVar.m() + 1;
                h2 = tVar.h();
                int i32 = 2 - (h2 ? 1 : 0);
                int i33 = m12 * i32;
                if (!h2) {
                    tVar.s();
                }
                tVar.s();
                int i34 = m11 * 16;
                int i35 = i33 * 16;
                if (tVar.h()) {
                    int m13 = tVar.m();
                    int m14 = tVar.m();
                    int m15 = tVar.m();
                    int m16 = tVar.m();
                    if (m4 == 0) {
                        i21 = 1;
                    } else {
                        i21 = m4 == 3 ? 1 : 2;
                        i32 *= m4 == 1 ? 2 : 1;
                    }
                    i34 -= (m13 + m14) * i21;
                    i35 -= (m15 + m16) * i32;
                }
                int i36 = i35;
                int i37 = i34;
                int i38 = i8;
                int i39 = ((i38 != 44 || i38 == 86 || i38 == 100 || i38 == 110 || i38 == 122 || i38 == 244) && (i23 & 16) != 0) ? 0 : i6;
                int i40 = -1;
                float f5 = 1.0f;
                if (tVar.h()) {
                    i12 = m8;
                    i13 = i10;
                    i14 = i39;
                    i15 = -1;
                    i16 = -1;
                    i17 = i11;
                    f4 = 1.0f;
                    i18 = -1;
                } else {
                    if (tVar.h()) {
                        int i41 = tVar.i(8);
                        if (i41 == 255) {
                            int i42 = i6;
                            int i43 = tVar.i(i42);
                            int i44 = tVar.i(i42);
                            if (i43 != 0 && i44 != 0) {
                                f5 = i43 / i44;
                            }
                        } else if (i41 < 17) {
                            f5 = f3553b[i41];
                        } else {
                            i12 = m8;
                            AbstractC0005f.u(i41, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                            if (tVar.h()) {
                                tVar.s();
                            }
                            if (tVar.h()) {
                                i19 = -1;
                                i20 = -1;
                            } else {
                                tVar.t(3);
                                i19 = tVar.h() ? 1 : 2;
                                if (tVar.h()) {
                                    int i45 = tVar.i(8);
                                    int i46 = tVar.i(8);
                                    tVar.t(8);
                                    i40 = C0089g.f(i45);
                                    i20 = C0089g.g(i46);
                                } else {
                                    i20 = -1;
                                }
                            }
                            if (tVar.h()) {
                                tVar.m();
                                tVar.m();
                            }
                            if (tVar.h()) {
                                tVar.t(65);
                            }
                            h4 = tVar.h();
                            if (h4) {
                                l(tVar);
                            }
                            h5 = tVar.h();
                            if (h5) {
                                l(tVar);
                            }
                            if (!h4 || h5) {
                                tVar.s();
                            }
                            tVar.s();
                            if (tVar.h()) {
                                tVar.s();
                                tVar.m();
                                tVar.m();
                                tVar.m();
                                tVar.m();
                                i39 = tVar.m();
                                tVar.m();
                            }
                            int i47 = i40;
                            i17 = i11;
                            f4 = f5;
                            i18 = i47;
                            i15 = i19;
                            i16 = i20;
                            i13 = i10;
                            i14 = i39;
                        }
                    }
                    i12 = m8;
                    if (tVar.h()) {
                    }
                    if (tVar.h()) {
                    }
                    if (tVar.h()) {
                    }
                    if (tVar.h()) {
                    }
                    h4 = tVar.h();
                    if (h4) {
                    }
                    h5 = tVar.h();
                    if (h5) {
                    }
                    if (!h4) {
                    }
                    tVar.s();
                    tVar.s();
                    if (tVar.h()) {
                    }
                    int i472 = i40;
                    i17 = i11;
                    f4 = f5;
                    i18 = i472;
                    i15 = i19;
                    i16 = i20;
                    i13 = i10;
                    i14 = i39;
                }
                return new o(i38, i23, i24, m6, i37, i36, f4, i7, i13, z, h2, i12, i9, i17, z4, i18, i15, i16, i14);
            }
            i8 = i22;
            i9 = m9;
            i10 = m5;
            i11 = 0;
        }
        z4 = false;
        tVar.m();
        tVar.s();
        int m112 = tVar.m() + 1;
        int m122 = tVar.m() + 1;
        h2 = tVar.h();
        int i322 = 2 - (h2 ? 1 : 0);
        int i332 = m122 * i322;
        if (!h2) {
        }
        tVar.s();
        int i342 = m112 * 16;
        int i352 = i332 * 16;
        if (tVar.h()) {
        }
        int i362 = i352;
        int i372 = i342;
        int i382 = i8;
        if (i382 != 44) {
        }
        int i402 = -1;
        float f52 = 1.0f;
        if (tVar.h()) {
        }
        return new o(i382, i23, i24, m6, i372, i362, f4, i7, i13, z, h2, i12, i9, i17, z4, i18, i15, i16, i14);
    }

    public static void l(W.t tVar) {
        int m4 = tVar.m() + 1;
        tVar.t(8);
        for (int i4 = 0; i4 < m4; i4++) {
            tVar.m();
            tVar.m();
            tVar.s();
        }
        tVar.t(20);
    }

    public static ArrayList m(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            try {
                byte b4 = asReadOnlyBuffer.get();
                int i4 = (b4 >> 3) & 15;
                if (((b4 >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                if (((b4 >> 1) & 1) != 0) {
                    remaining = 0;
                    for (int i5 = 0; i5 < 8; i5++) {
                        byte b5 = asReadOnlyBuffer.get();
                        remaining |= (b5 & Byte.MAX_VALUE) << (i5 * 7);
                        if ((b5 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    remaining = asReadOnlyBuffer.remaining();
                }
                if (asReadOnlyBuffer.position() + remaining > asReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
                duplicate.limit(asReadOnlyBuffer.position() + remaining);
                arrayList.add(new r(i4, duplicate));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static int n(int i4, byte[] bArr) {
        int i5;
        synchronized (f3554c) {
            int i6 = 0;
            int i7 = 0;
            while (i6 < i4) {
                while (true) {
                    if (i6 >= i4 - 2) {
                        i6 = i4;
                        break;
                    }
                    try {
                        if (bArr[i6] == 0 && bArr[i6 + 1] == 0 && bArr[i6 + 2] == 3) {
                            break;
                        }
                        i6++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i6 < i4) {
                    int[] iArr = f3555d;
                    if (iArr.length <= i7) {
                        f3555d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f3555d[i7] = i6;
                    i6 += 3;
                    i7++;
                }
            }
            i5 = i4 - i7;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i7; i10++) {
                int i11 = f3555d[i10] - i9;
                System.arraycopy(bArr, i9, bArr, i8, i11);
                int i12 = i8 + i11;
                int i13 = i12 + 1;
                bArr[i12] = 0;
                i8 = i12 + 2;
                bArr[i13] = 0;
                i9 += i11 + 3;
            }
            System.arraycopy(bArr, i9, bArr, i8, i5 - i8);
        }
        return i5;
    }
}
