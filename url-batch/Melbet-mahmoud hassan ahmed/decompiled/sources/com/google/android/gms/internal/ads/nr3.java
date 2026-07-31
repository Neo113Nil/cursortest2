package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class nr3<T> implements es3<T> {

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f9255q = new int[0];

    /* renamed from: r, reason: collision with root package name */
    private static final Unsafe f9256r = gt3.q();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f9257a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f9258b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9259c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9260d;

    /* renamed from: e, reason: collision with root package name */
    private final kr3 f9261e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f9262f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f9263g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f9264h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f9265i;

    /* renamed from: j, reason: collision with root package name */
    private final int f9266j;

    /* renamed from: k, reason: collision with root package name */
    private final int f9267k;

    /* renamed from: l, reason: collision with root package name */
    private final yq3 f9268l;

    /* renamed from: m, reason: collision with root package name */
    private final ws3<?, ?> f9269m;

    /* renamed from: n, reason: collision with root package name */
    private final np3<?> f9270n;

    /* renamed from: o, reason: collision with root package name */
    private final qr3 f9271o;

    /* renamed from: p, reason: collision with root package name */
    private final fr3 f9272p;

    /* JADX WARN: Multi-variable type inference failed */
    private nr3(int[] iArr, int[] iArr2, Object[] objArr, int i7, int i8, kr3 kr3Var, boolean z6, boolean z7, int[] iArr3, int i9, int i10, qr3 qr3Var, yq3 yq3Var, ws3<?, ?> ws3Var, np3<?> np3Var, fr3 fr3Var) {
        this.f9257a = iArr;
        this.f9258b = iArr2;
        this.f9259c = objArr;
        this.f9260d = i7;
        this.f9263g = i8 instanceof aq3;
        this.f9264h = kr3Var;
        boolean z8 = false;
        if (ws3Var != 0 && ws3Var.h(i8)) {
            z8 = true;
        }
        this.f9262f = z8;
        this.f9265i = z7;
        this.f9266j = iArr3;
        this.f9267k = i9;
        this.f9271o = i10;
        this.f9268l = qr3Var;
        this.f9269m = yq3Var;
        this.f9270n = ws3Var;
        this.f9261e = i8;
        this.f9272p = np3Var;
    }

    private final boolean A(T t6, int i7) {
        int X = X(i7);
        long j7 = X & 1048575;
        if (j7 != 1048575) {
            return (gt3.l(t6, j7) & (1 << (X >>> 20))) != 0;
        }
        int m7 = m(i7);
        long j8 = m7 & 1048575;
        switch (l(m7)) {
            case 0:
                return Double.doubleToRawLongBits(gt3.j(t6, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(gt3.k(t6, j8)) != 0;
            case 2:
                return gt3.n(t6, j8) != 0;
            case 3:
                return gt3.n(t6, j8) != 0;
            case 4:
                return gt3.l(t6, j8) != 0;
            case 5:
                return gt3.n(t6, j8) != 0;
            case 6:
                return gt3.l(t6, j8) != 0;
            case c4.w0.f2149o /* 7 */:
                return gt3.H(t6, j8);
            case c4.w0.f2150p /* 8 */:
                Object p7 = gt3.p(t6, j8);
                if (p7 instanceof String) {
                    return !((String) p7).isEmpty();
                }
                if (p7 instanceof uo3) {
                    return !uo3.f12885g.equals(p7);
                }
                throw new IllegalArgumentException();
            case 9:
                return gt3.p(t6, j8) != null;
            case 10:
                return !uo3.f12885g.equals(gt3.p(t6, j8));
            case 11:
                return gt3.l(t6, j8) != 0;
            case 12:
                return gt3.l(t6, j8) != 0;
            case 13:
                return gt3.l(t6, j8) != 0;
            case 14:
                return gt3.n(t6, j8) != 0;
            case 15:
                return gt3.l(t6, j8) != 0;
            case 16:
                return gt3.n(t6, j8) != 0;
            case 17:
                return gt3.p(t6, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean B(T t6, int i7, int i8, int i9, int i10) {
        return i8 == 1048575 ? A(t6, i7) : (i9 & i10) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean C(Object obj, int i7, es3 es3Var) {
        return es3Var.j(gt3.p(obj, i7 & 1048575));
    }

    private final boolean D(T t6, int i7, int i8) {
        return gt3.l(t6, (long) (X(i8) & 1048575)) == i7;
    }

    private static <T> boolean E(T t6, long j7) {
        return ((Boolean) gt3.p(t6, j7)).booleanValue();
    }

    private final void F(T t6, ip3 ip3Var) {
        int i7;
        if (this.f9262f) {
            this.f9270n.a(t6);
            throw null;
        }
        int length = this.f9257a.length;
        Unsafe unsafe = f9256r;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i9 < length) {
            int m7 = m(i9);
            int i12 = this.f9257a[i9];
            int l7 = l(m7);
            if (l7 <= 17) {
                int i13 = this.f9257a[i9 + 2];
                int i14 = i13 & i8;
                if (i14 != i11) {
                    i10 = unsafe.getInt(t6, i14);
                    i11 = i14;
                }
                i7 = 1 << (i13 >>> 20);
            } else {
                i7 = 0;
            }
            long j7 = m7 & i8;
            switch (l7) {
                case 0:
                    if ((i10 & i7) == 0) {
                        break;
                    } else {
                        ip3Var.q(i12, gt3.j(t6, j7));
                        continue;
                    }
                case 1:
                    if ((i10 & i7) != 0) {
                        ip3Var.z(i12, gt3.k(t6, j7));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if ((i10 & i7) != 0) {
                        ip3Var.E(i12, unsafe.getLong(t6, j7));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((i10 & i7) != 0) {
                        ip3Var.j(i12, unsafe.getLong(t6, j7));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((i10 & i7) != 0) {
                        ip3Var.C(i12, unsafe.getInt(t6, j7));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if ((i10 & i7) != 0) {
                        ip3Var.x(i12, unsafe.getLong(t6, j7));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if ((i10 & i7) != 0) {
                        ip3Var.v(i12, unsafe.getInt(t6, j7));
                        break;
                    } else {
                        continue;
                    }
                case c4.w0.f2149o /* 7 */:
                    if ((i10 & i7) != 0) {
                        ip3Var.m(i12, gt3.H(t6, j7));
                        break;
                    } else {
                        continue;
                    }
                case c4.w0.f2150p /* 8 */:
                    if ((i10 & i7) != 0) {
                        H(i12, unsafe.getObject(t6, j7), ip3Var);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    if ((i10 & i7) != 0) {
                        ip3Var.G(i12, unsafe.getObject(t6, j7), p(i9));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if ((i10 & i7) != 0) {
                        ip3Var.o(i12, (uo3) unsafe.getObject(t6, j7));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if ((i10 & i7) != 0) {
                        ip3Var.h(i12, unsafe.getInt(t6, j7));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if ((i10 & i7) != 0) {
                        ip3Var.t(i12, unsafe.getInt(t6, j7));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if ((i10 & i7) != 0) {
                        ip3Var.H(i12, unsafe.getInt(t6, j7));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if ((i10 & i7) != 0) {
                        ip3Var.J(i12, unsafe.getLong(t6, j7));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if ((i10 & i7) != 0) {
                        ip3Var.a(i12, unsafe.getInt(t6, j7));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if ((i10 & i7) != 0) {
                        ip3Var.c(i12, unsafe.getLong(t6, j7));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if ((i10 & i7) != 0) {
                        ip3Var.B(i12, unsafe.getObject(t6, j7), p(i9));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    gs3.l(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, false);
                    continue;
                case 19:
                    gs3.p(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, false);
                    continue;
                case 20:
                    gs3.s(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, false);
                    continue;
                case 21:
                    gs3.B(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, false);
                    continue;
                case 22:
                    gs3.r(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, false);
                    continue;
                case 23:
                    gs3.o(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, false);
                    continue;
                case 24:
                    gs3.n(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, false);
                    continue;
                case 25:
                    gs3.j(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, false);
                    continue;
                case 26:
                    gs3.y(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var);
                    break;
                case 27:
                    gs3.t(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, p(i9));
                    break;
                case 28:
                    gs3.k(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var);
                    break;
                case 29:
                    gs3.z(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, false);
                    break;
                case 30:
                    gs3.m(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, false);
                    break;
                case 31:
                    gs3.u(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, false);
                    break;
                case 32:
                    gs3.v(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, false);
                    break;
                case 33:
                    gs3.w(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, false);
                    break;
                case 34:
                    gs3.x(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, false);
                    break;
                case 35:
                    gs3.l(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, true);
                    break;
                case 36:
                    gs3.p(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, true);
                    break;
                case 37:
                    gs3.s(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, true);
                    break;
                case 38:
                    gs3.B(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, true);
                    break;
                case 39:
                    gs3.r(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, true);
                    break;
                case 40:
                    gs3.o(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, true);
                    break;
                case 41:
                    gs3.n(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, true);
                    break;
                case 42:
                    gs3.j(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, true);
                    break;
                case 43:
                    gs3.z(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, true);
                    break;
                case 44:
                    gs3.m(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, true);
                    break;
                case 45:
                    gs3.u(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, true);
                    break;
                case 46:
                    gs3.v(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, true);
                    break;
                case 47:
                    gs3.w(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, true);
                    break;
                case 48:
                    gs3.x(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, true);
                    break;
                case 49:
                    gs3.q(this.f9257a[i9], (List) unsafe.getObject(t6, j7), ip3Var, p(i9));
                    break;
                case 50:
                    G(ip3Var, i12, unsafe.getObject(t6, j7), i9);
                    break;
                case 51:
                    if (D(t6, i12, i9)) {
                        ip3Var.q(i12, M(t6, j7));
                        break;
                    }
                    break;
                case 52:
                    if (D(t6, i12, i9)) {
                        ip3Var.z(i12, N(t6, j7));
                        break;
                    }
                    break;
                case 53:
                    if (D(t6, i12, i9)) {
                        ip3Var.E(i12, n(t6, j7));
                        break;
                    }
                    break;
                case 54:
                    if (D(t6, i12, i9)) {
                        ip3Var.j(i12, n(t6, j7));
                        break;
                    }
                    break;
                case 55:
                    if (D(t6, i12, i9)) {
                        ip3Var.C(i12, Q(t6, j7));
                        break;
                    }
                    break;
                case 56:
                    if (D(t6, i12, i9)) {
                        ip3Var.x(i12, n(t6, j7));
                        break;
                    }
                    break;
                case 57:
                    if (D(t6, i12, i9)) {
                        ip3Var.v(i12, Q(t6, j7));
                        break;
                    }
                    break;
                case 58:
                    if (D(t6, i12, i9)) {
                        ip3Var.m(i12, E(t6, j7));
                        break;
                    }
                    break;
                case 59:
                    if (D(t6, i12, i9)) {
                        H(i12, unsafe.getObject(t6, j7), ip3Var);
                        break;
                    }
                    break;
                case 60:
                    if (D(t6, i12, i9)) {
                        ip3Var.G(i12, unsafe.getObject(t6, j7), p(i9));
                        break;
                    }
                    break;
                case 61:
                    if (D(t6, i12, i9)) {
                        ip3Var.o(i12, (uo3) unsafe.getObject(t6, j7));
                        break;
                    }
                    break;
                case 62:
                    if (D(t6, i12, i9)) {
                        ip3Var.h(i12, Q(t6, j7));
                        break;
                    }
                    break;
                case 63:
                    if (D(t6, i12, i9)) {
                        ip3Var.t(i12, Q(t6, j7));
                        break;
                    }
                    break;
                case 64:
                    if (D(t6, i12, i9)) {
                        ip3Var.H(i12, Q(t6, j7));
                        break;
                    }
                    break;
                case 65:
                    if (D(t6, i12, i9)) {
                        ip3Var.J(i12, n(t6, j7));
                        break;
                    }
                    break;
                case 66:
                    if (D(t6, i12, i9)) {
                        ip3Var.a(i12, Q(t6, j7));
                        break;
                    }
                    break;
                case 67:
                    if (D(t6, i12, i9)) {
                        ip3Var.c(i12, n(t6, j7));
                        break;
                    }
                    break;
                case 68:
                    if (D(t6, i12, i9)) {
                        ip3Var.B(i12, unsafe.getObject(t6, j7), p(i9));
                        break;
                    }
                    break;
            }
            i9 += 3;
            i8 = 1048575;
        }
        ws3<?, ?> ws3Var = this.f9269m;
        ws3Var.r(ws3Var.d(t6), ip3Var);
    }

    private final <K, V> void G(ip3 ip3Var, int i7, Object obj, int i8) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void H(int i7, Object obj, ip3 ip3Var) {
        if (obj instanceof String) {
            ip3Var.f(i7, (String) obj);
        } else {
            ip3Var.o(i7, (uo3) obj);
        }
    }

    static xs3 J(Object obj) {
        aq3 aq3Var = (aq3) obj;
        xs3 xs3Var = aq3Var.zzc;
        if (xs3Var != xs3.c()) {
            return xs3Var;
        }
        xs3 e7 = xs3.e();
        aq3Var.zzc = e7;
        return e7;
    }

    static <T> nr3<T> K(Class<T> cls, hr3 hr3Var, qr3 qr3Var, yq3 yq3Var, ws3<?, ?> ws3Var, np3<?> np3Var, fr3 fr3Var) {
        if (hr3Var instanceof vr3) {
            return L((vr3) hr3Var, qr3Var, yq3Var, ws3Var, np3Var, fr3Var);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> nr3<T> L(vr3 vr3Var, qr3 qr3Var, yq3 yq3Var, ws3<?, ?> ws3Var, np3<?> np3Var, fr3 fr3Var) {
        int i7;
        int charAt;
        int charAt2;
        int charAt3;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char charAt4;
        int i13;
        char charAt5;
        int i14;
        char charAt6;
        int i15;
        char charAt7;
        int i16;
        char charAt8;
        int i17;
        char charAt9;
        int i18;
        char charAt10;
        int i19;
        char charAt11;
        int i20;
        int i21;
        int i22;
        int[] iArr2;
        int i23;
        int i24;
        int i25;
        int objectFieldOffset;
        Object[] objArr;
        String str;
        Class<?> cls;
        int i26;
        int i27;
        int i28;
        Field s7;
        char charAt12;
        int i29;
        int i30;
        int i31;
        Object obj;
        Field s8;
        Object obj2;
        Field s9;
        int i32;
        char charAt13;
        int i33;
        char charAt14;
        int i34;
        char charAt15;
        int i35;
        char charAt16;
        boolean z6 = vr3Var.c() == 2;
        String b7 = vr3Var.b();
        int length = b7.length();
        char c7 = 55296;
        if (b7.charAt(0) >= 55296) {
            int i36 = 1;
            while (true) {
                i7 = i36 + 1;
                if (b7.charAt(i36) < 55296) {
                    break;
                }
                i36 = i7;
            }
        } else {
            i7 = 1;
        }
        int i37 = i7 + 1;
        int charAt17 = b7.charAt(i7);
        if (charAt17 >= 55296) {
            int i38 = charAt17 & 8191;
            int i39 = 13;
            while (true) {
                i35 = i37 + 1;
                charAt16 = b7.charAt(i37);
                if (charAt16 < 55296) {
                    break;
                }
                i38 |= (charAt16 & 8191) << i39;
                i39 += 13;
                i37 = i35;
            }
            charAt17 = i38 | (charAt16 << i39);
            i37 = i35;
        }
        if (charAt17 == 0) {
            iArr = f9255q;
            i9 = 0;
            charAt = 0;
            i11 = 0;
            charAt2 = 0;
            i10 = 0;
            charAt3 = 0;
            i8 = 0;
        } else {
            int i40 = i37 + 1;
            int charAt18 = b7.charAt(i37);
            if (charAt18 >= 55296) {
                int i41 = charAt18 & 8191;
                int i42 = 13;
                while (true) {
                    i19 = i40 + 1;
                    charAt11 = b7.charAt(i40);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i41 |= (charAt11 & 8191) << i42;
                    i42 += 13;
                    i40 = i19;
                }
                charAt18 = i41 | (charAt11 << i42);
                i40 = i19;
            }
            int i43 = i40 + 1;
            int charAt19 = b7.charAt(i40);
            if (charAt19 >= 55296) {
                int i44 = charAt19 & 8191;
                int i45 = 13;
                while (true) {
                    i18 = i43 + 1;
                    charAt10 = b7.charAt(i43);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i44 |= (charAt10 & 8191) << i45;
                    i45 += 13;
                    i43 = i18;
                }
                charAt19 = i44 | (charAt10 << i45);
                i43 = i18;
            }
            int i46 = i43 + 1;
            charAt = b7.charAt(i43);
            if (charAt >= 55296) {
                int i47 = charAt & 8191;
                int i48 = 13;
                while (true) {
                    i17 = i46 + 1;
                    charAt9 = b7.charAt(i46);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i47 |= (charAt9 & 8191) << i48;
                    i48 += 13;
                    i46 = i17;
                }
                charAt = i47 | (charAt9 << i48);
                i46 = i17;
            }
            int i49 = i46 + 1;
            int charAt20 = b7.charAt(i46);
            if (charAt20 >= 55296) {
                int i50 = charAt20 & 8191;
                int i51 = 13;
                while (true) {
                    i16 = i49 + 1;
                    charAt8 = b7.charAt(i49);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i50 |= (charAt8 & 8191) << i51;
                    i51 += 13;
                    i49 = i16;
                }
                charAt20 = i50 | (charAt8 << i51);
                i49 = i16;
            }
            int i52 = i49 + 1;
            charAt2 = b7.charAt(i49);
            if (charAt2 >= 55296) {
                int i53 = charAt2 & 8191;
                int i54 = 13;
                while (true) {
                    i15 = i52 + 1;
                    charAt7 = b7.charAt(i52);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i53 |= (charAt7 & 8191) << i54;
                    i54 += 13;
                    i52 = i15;
                }
                charAt2 = i53 | (charAt7 << i54);
                i52 = i15;
            }
            int i55 = i52 + 1;
            int charAt21 = b7.charAt(i52);
            if (charAt21 >= 55296) {
                int i56 = charAt21 & 8191;
                int i57 = 13;
                while (true) {
                    i14 = i55 + 1;
                    charAt6 = b7.charAt(i55);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i56 |= (charAt6 & 8191) << i57;
                    i57 += 13;
                    i55 = i14;
                }
                charAt21 = i56 | (charAt6 << i57);
                i55 = i14;
            }
            int i58 = i55 + 1;
            int charAt22 = b7.charAt(i55);
            if (charAt22 >= 55296) {
                int i59 = charAt22 & 8191;
                int i60 = 13;
                while (true) {
                    i13 = i58 + 1;
                    charAt5 = b7.charAt(i58);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i59 |= (charAt5 & 8191) << i60;
                    i60 += 13;
                    i58 = i13;
                }
                charAt22 = i59 | (charAt5 << i60);
                i58 = i13;
            }
            int i61 = i58 + 1;
            charAt3 = b7.charAt(i58);
            if (charAt3 >= 55296) {
                int i62 = charAt3 & 8191;
                int i63 = 13;
                while (true) {
                    i12 = i61 + 1;
                    charAt4 = b7.charAt(i61);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i62 |= (charAt4 & 8191) << i63;
                    i63 += 13;
                    i61 = i12;
                }
                charAt3 = i62 | (charAt4 << i63);
                i61 = i12;
            }
            iArr = new int[charAt3 + charAt21 + charAt22];
            i8 = charAt18 + charAt18 + charAt19;
            i9 = charAt18;
            i37 = i61;
            int i64 = charAt21;
            i10 = charAt20;
            i11 = i64;
        }
        Unsafe unsafe = f9256r;
        Object[] d7 = vr3Var.d();
        Class<?> cls2 = vr3Var.zza().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 + charAt2];
        int i65 = charAt3 + i11;
        int i66 = charAt3;
        int i67 = i65;
        int i68 = 0;
        int i69 = 0;
        while (i37 < length) {
            int i70 = i37 + 1;
            int charAt23 = b7.charAt(i37);
            if (charAt23 >= c7) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i34 = i72 + 1;
                    charAt15 = b7.charAt(i72);
                    if (charAt15 < c7) {
                        break;
                    }
                    i71 |= (charAt15 & 8191) << i73;
                    i73 += 13;
                    i72 = i34;
                }
                charAt23 = i71 | (charAt15 << i73);
                i20 = i34;
            } else {
                i20 = i70;
            }
            int i74 = i20 + 1;
            int charAt24 = b7.charAt(i20);
            if (charAt24 >= c7) {
                int i75 = charAt24 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i33 = i76 + 1;
                    charAt14 = b7.charAt(i76);
                    i21 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i75 |= (charAt14 & 8191) << i77;
                    i77 += 13;
                    i76 = i33;
                    length = i21;
                }
                charAt24 = i75 | (charAt14 << i77);
                i22 = i33;
            } else {
                i21 = length;
                i22 = i74;
            }
            int i78 = charAt24 & 255;
            int i79 = charAt3;
            if ((charAt24 & 1024) != 0) {
                iArr[i69] = i68;
                i69++;
            }
            if (i78 >= 51) {
                int i80 = i22 + 1;
                int charAt25 = b7.charAt(i22);
                if (charAt25 >= 55296) {
                    int i81 = charAt25 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i32 = i82 + 1;
                        charAt13 = b7.charAt(i82);
                        i24 = i10;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i81 |= (charAt13 & 8191) << i83;
                        i83 += 13;
                        i82 = i32;
                        i10 = i24;
                    }
                    charAt25 = i81 | (charAt13 << i83);
                    i30 = i32;
                } else {
                    i24 = i10;
                    i30 = i80;
                }
                int i84 = i78 - 51;
                i26 = i30;
                if (i84 == 9 || i84 == 17) {
                    int i85 = i68 / 3;
                    i31 = i8 + 1;
                    objArr2[i85 + i85 + 1] = d7[i8];
                } else {
                    if (i84 == 12 && !z6) {
                        int i86 = i68 / 3;
                        i31 = i8 + 1;
                        objArr2[i86 + i86 + 1] = d7[i8];
                    }
                    int i87 = charAt25 + charAt25;
                    obj = d7[i87];
                    if (obj instanceof Field) {
                        s8 = s(cls2, (String) obj);
                        d7[i87] = s8;
                    } else {
                        s8 = (Field) obj;
                    }
                    iArr2 = iArr3;
                    i23 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(s8);
                    int i88 = i87 + 1;
                    obj2 = d7[i88];
                    if (obj2 instanceof Field) {
                        s9 = s(cls2, (String) obj2);
                        d7[i88] = s9;
                    } else {
                        s9 = (Field) obj2;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(s9);
                    str = b7;
                    cls = cls2;
                    i27 = objectFieldOffset3;
                    objArr = objArr2;
                    objectFieldOffset = objectFieldOffset2;
                    i28 = 0;
                }
                i8 = i31;
                int i872 = charAt25 + charAt25;
                obj = d7[i872];
                if (obj instanceof Field) {
                }
                iArr2 = iArr3;
                i23 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(s8);
                int i882 = i872 + 1;
                obj2 = d7[i882];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(s9);
                str = b7;
                cls = cls2;
                i27 = objectFieldOffset32;
                objArr = objArr2;
                objectFieldOffset = objectFieldOffset22;
                i28 = 0;
            } else {
                iArr2 = iArr3;
                i23 = charAt;
                i24 = i10;
                int i89 = i8 + 1;
                Field s10 = s(cls2, (String) d7[i8]);
                if (i78 == 9 || i78 == 17) {
                    int i90 = i68 / 3;
                    objArr2[i90 + i90 + 1] = s10.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        int i91 = i68 / 3;
                        i29 = i89 + 1;
                        objArr2[i91 + i91 + 1] = d7[i89];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        if (!z6) {
                            int i92 = i68 / 3;
                            i29 = i89 + 1;
                            objArr2[i92 + i92 + 1] = d7[i89];
                        }
                    } else if (i78 == 50) {
                        int i93 = i66 + 1;
                        iArr[i66] = i68;
                        int i94 = i68 / 3;
                        int i95 = i94 + i94;
                        int i96 = i89 + 1;
                        objArr2[i95] = d7[i89];
                        if ((charAt24 & 2048) != 0) {
                            i89 = i96 + 1;
                            objArr2[i95 + 1] = d7[i96];
                            i66 = i93;
                        } else {
                            i66 = i93;
                            i25 = i96;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(s10);
                            objArr = objArr2;
                            if ((charAt24 & 4096) == 4096 || i78 > 17) {
                                str = b7;
                                cls = cls2;
                                i26 = i22;
                                i27 = 1048575;
                                i28 = 0;
                            } else {
                                int i97 = i22 + 1;
                                int charAt26 = b7.charAt(i22);
                                if (charAt26 >= 55296) {
                                    int i98 = charAt26 & 8191;
                                    int i99 = 13;
                                    while (true) {
                                        i26 = i97 + 1;
                                        charAt12 = b7.charAt(i97);
                                        if (charAt12 < 55296) {
                                            break;
                                        }
                                        i98 |= (charAt12 & 8191) << i99;
                                        i99 += 13;
                                        i97 = i26;
                                    }
                                    charAt26 = i98 | (charAt12 << i99);
                                } else {
                                    i26 = i97;
                                }
                                int i100 = i9 + i9 + (charAt26 / 32);
                                Object obj3 = d7[i100];
                                str = b7;
                                if (obj3 instanceof Field) {
                                    s7 = (Field) obj3;
                                } else {
                                    s7 = s(cls2, (String) obj3);
                                    d7[i100] = s7;
                                }
                                cls = cls2;
                                i27 = (int) unsafe.objectFieldOffset(s7);
                                i28 = charAt26 % 32;
                            }
                            if (i78 >= 18 && i78 <= 49) {
                                iArr[i67] = objectFieldOffset;
                                i67++;
                            }
                            i8 = i25;
                        }
                    }
                    i25 = i29;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(s10);
                    objArr = objArr2;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = b7;
                    cls = cls2;
                    i26 = i22;
                    i27 = 1048575;
                    i28 = 0;
                    if (i78 >= 18) {
                        iArr[i67] = objectFieldOffset;
                        i67++;
                    }
                    i8 = i25;
                }
                i25 = i89;
                objectFieldOffset = (int) unsafe.objectFieldOffset(s10);
                objArr = objArr2;
                if ((charAt24 & 4096) == 4096) {
                }
                str = b7;
                cls = cls2;
                i26 = i22;
                i27 = 1048575;
                i28 = 0;
                if (i78 >= 18) {
                }
                i8 = i25;
            }
            int i101 = i68 + 1;
            iArr2[i68] = charAt23;
            int i102 = i101 + 1;
            iArr2[i101] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i78 << 20) | objectFieldOffset;
            i68 = i102 + 1;
            iArr2[i102] = (i28 << 20) | i27;
            cls2 = cls;
            charAt = i23;
            charAt3 = i79;
            i37 = i26;
            length = i21;
            objArr2 = objArr;
            b7 = str;
            iArr3 = iArr2;
            i10 = i24;
            c7 = 55296;
        }
        return new nr3<>(iArr3, objArr2, charAt, i10, vr3Var.zza(), z6, false, iArr, charAt3, i65, qr3Var, yq3Var, ws3Var, np3Var, fr3Var, null);
    }

    private static <T> double M(T t6, long j7) {
        return ((Double) gt3.p(t6, j7)).doubleValue();
    }

    private static <T> float N(T t6, long j7) {
        return ((Float) gt3.p(t6, j7)).floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0302, code lost:
    
        if ((r7 instanceof com.google.android.gms.internal.ads.uo3) != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a0, code lost:
    
        if ((r7 instanceof com.google.android.gms.internal.ads.uo3) != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0305, code lost:
    
        r8 = com.google.android.gms.internal.ads.hp3.a(r8 << 3);
        r7 = com.google.android.gms.internal.ads.hp3.C((java.lang.String) r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int O(T t6) {
        int i7;
        long j7;
        Object object;
        int i8;
        int i9;
        int i10;
        long j8;
        int J;
        int K;
        int D;
        int a7;
        Unsafe unsafe = f9256r;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        for (int i14 = 0; i14 < this.f9257a.length; i14 += 3) {
            int m7 = m(i14);
            int i15 = this.f9257a[i14];
            int l7 = l(m7);
            if (l7 <= 17) {
                int i16 = this.f9257a[i14 + 2];
                int i17 = i16 & 1048575;
                i7 = 1 << (i16 >>> 20);
                if (i17 != i13) {
                    i12 = unsafe.getInt(t6, i17);
                    i13 = i17;
                }
            } else {
                i7 = 0;
            }
            long j9 = m7 & 1048575;
            switch (l7) {
                case 0:
                    if ((i12 & i7) == 0) {
                        break;
                    }
                    J = hp3.a(i15 << 3) + 8;
                    i11 += J;
                    break;
                case 1:
                    if ((i12 & i7) == 0) {
                        break;
                    }
                    J = hp3.a(i15 << 3) + 4;
                    i11 += J;
                    break;
                case 2:
                    if ((i12 & i7) == 0) {
                        break;
                    }
                    j7 = unsafe.getLong(t6, j9);
                    J = hp3.a(i15 << 3) + hp3.b(j7);
                    i11 += J;
                    break;
                case 3:
                    if ((i12 & i7) == 0) {
                        break;
                    }
                    j7 = unsafe.getLong(t6, j9);
                    J = hp3.a(i15 << 3) + hp3.b(j7);
                    i11 += J;
                    break;
                case 4:
                    if ((i12 & i7) == 0) {
                        break;
                    }
                    i9 = unsafe.getInt(t6, j9);
                    D = hp3.a(i15 << 3);
                    K = hp3.z(i9);
                    a7 = D + K;
                    i11 += a7;
                    break;
                case 5:
                    if ((i12 & i7) == 0) {
                        break;
                    }
                    J = hp3.a(i15 << 3) + 8;
                    i11 += J;
                    break;
                case 6:
                    if ((i12 & i7) == 0) {
                        break;
                    }
                    J = hp3.a(i15 << 3) + 4;
                    i11 += J;
                    break;
                case c4.w0.f2149o /* 7 */:
                    if ((i12 & i7) == 0) {
                        break;
                    }
                    J = hp3.a(i15 << 3) + 1;
                    i11 += J;
                    break;
                case c4.w0.f2150p /* 8 */:
                    if ((i12 & i7) != 0) {
                        object = unsafe.getObject(t6, j9);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i12 & i7) == 0) {
                        break;
                    }
                    J = gs3.Q(i15, unsafe.getObject(t6, j9), p(i14));
                    i11 += J;
                    break;
                case 10:
                    if ((i12 & i7) == 0) {
                        break;
                    }
                    object = unsafe.getObject(t6, j9);
                    int a8 = hp3.a(i15 << 3);
                    int q7 = ((uo3) object).q();
                    a7 = a8 + hp3.a(q7) + q7;
                    i11 += a7;
                    break;
                case 11:
                    if ((i12 & i7) != 0) {
                        i8 = unsafe.getInt(t6, j9);
                        D = hp3.a(i15 << 3);
                        K = hp3.a(i8);
                        a7 = D + K;
                        i11 += a7;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i12 & i7) == 0) {
                        break;
                    }
                    i9 = unsafe.getInt(t6, j9);
                    D = hp3.a(i15 << 3);
                    K = hp3.z(i9);
                    a7 = D + K;
                    i11 += a7;
                    break;
                case 13:
                    if ((i12 & i7) == 0) {
                        break;
                    }
                    J = hp3.a(i15 << 3) + 4;
                    i11 += J;
                    break;
                case 14:
                    if ((i12 & i7) == 0) {
                        break;
                    }
                    J = hp3.a(i15 << 3) + 8;
                    i11 += J;
                    break;
                case 15:
                    if ((i12 & i7) != 0) {
                        i10 = unsafe.getInt(t6, j9);
                        D = hp3.a(i15 << 3);
                        i8 = (i10 >> 31) ^ (i10 + i10);
                        K = hp3.a(i8);
                        a7 = D + K;
                        i11 += a7;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i12 & i7) != 0) {
                        j8 = unsafe.getLong(t6, j9);
                        D = hp3.a(i15 << 3);
                        K = hp3.b((j8 >> 63) ^ (j8 + j8));
                        a7 = D + K;
                        i11 += a7;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i12 & i7) == 0) {
                        break;
                    }
                    J = hp3.y(i15, (kr3) unsafe.getObject(t6, j9), p(i14));
                    i11 += J;
                    break;
                case 18:
                case 23:
                case 32:
                    J = gs3.J(i15, (List) unsafe.getObject(t6, j9), false);
                    i11 += J;
                    break;
                case 19:
                case 24:
                case 31:
                    J = gs3.H(i15, (List) unsafe.getObject(t6, j9), false);
                    i11 += J;
                    break;
                case 20:
                    J = gs3.O(i15, (List) unsafe.getObject(t6, j9), false);
                    i11 += J;
                    break;
                case 21:
                    J = gs3.Z(i15, (List) unsafe.getObject(t6, j9), false);
                    i11 += J;
                    break;
                case 22:
                    J = gs3.M(i15, (List) unsafe.getObject(t6, j9), false);
                    i11 += J;
                    break;
                case 25:
                    J = gs3.A(i15, (List) unsafe.getObject(t6, j9), false);
                    i11 += J;
                    break;
                case 26:
                    J = gs3.W(i15, (List) unsafe.getObject(t6, j9));
                    i11 += J;
                    break;
                case 27:
                    J = gs3.R(i15, (List) unsafe.getObject(t6, j9), p(i14));
                    i11 += J;
                    break;
                case 28:
                    J = gs3.E(i15, (List) unsafe.getObject(t6, j9));
                    i11 += J;
                    break;
                case 29:
                    J = gs3.X(i15, (List) unsafe.getObject(t6, j9), false);
                    i11 += J;
                    break;
                case 30:
                    J = gs3.F(i15, (List) unsafe.getObject(t6, j9), false);
                    i11 += J;
                    break;
                case 33:
                    J = gs3.S(i15, (List) unsafe.getObject(t6, j9), false);
                    i11 += J;
                    break;
                case 34:
                    J = gs3.U(i15, (List) unsafe.getObject(t6, j9), false);
                    i11 += J;
                    break;
                case 35:
                    K = gs3.K((List) unsafe.getObject(t6, j9));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i15) + hp3.a(K);
                    a7 = D + K;
                    i11 += a7;
                    break;
                case 36:
                    K = gs3.I((List) unsafe.getObject(t6, j9));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i15) + hp3.a(K);
                    a7 = D + K;
                    i11 += a7;
                    break;
                case 37:
                    K = gs3.P((List) unsafe.getObject(t6, j9));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i15) + hp3.a(K);
                    a7 = D + K;
                    i11 += a7;
                    break;
                case 38:
                    K = gs3.a0((List) unsafe.getObject(t6, j9));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i15) + hp3.a(K);
                    a7 = D + K;
                    i11 += a7;
                    break;
                case 39:
                    K = gs3.N((List) unsafe.getObject(t6, j9));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i15) + hp3.a(K);
                    a7 = D + K;
                    i11 += a7;
                    break;
                case 40:
                    K = gs3.K((List) unsafe.getObject(t6, j9));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i15) + hp3.a(K);
                    a7 = D + K;
                    i11 += a7;
                    break;
                case 41:
                    K = gs3.I((List) unsafe.getObject(t6, j9));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i15) + hp3.a(K);
                    a7 = D + K;
                    i11 += a7;
                    break;
                case 42:
                    K = gs3.D((List) unsafe.getObject(t6, j9));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i15) + hp3.a(K);
                    a7 = D + K;
                    i11 += a7;
                    break;
                case 43:
                    K = gs3.Y((List) unsafe.getObject(t6, j9));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i15) + hp3.a(K);
                    a7 = D + K;
                    i11 += a7;
                    break;
                case 44:
                    K = gs3.G((List) unsafe.getObject(t6, j9));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i15) + hp3.a(K);
                    a7 = D + K;
                    i11 += a7;
                    break;
                case 45:
                    K = gs3.I((List) unsafe.getObject(t6, j9));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i15) + hp3.a(K);
                    a7 = D + K;
                    i11 += a7;
                    break;
                case 46:
                    K = gs3.K((List) unsafe.getObject(t6, j9));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i15) + hp3.a(K);
                    a7 = D + K;
                    i11 += a7;
                    break;
                case 47:
                    K = gs3.T((List) unsafe.getObject(t6, j9));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i15) + hp3.a(K);
                    a7 = D + K;
                    i11 += a7;
                    break;
                case 48:
                    K = gs3.V((List) unsafe.getObject(t6, j9));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i15) + hp3.a(K);
                    a7 = D + K;
                    i11 += a7;
                    break;
                case 49:
                    J = gs3.L(i15, (List) unsafe.getObject(t6, j9), p(i14));
                    i11 += J;
                    break;
                case 50:
                    fr3.a(i15, unsafe.getObject(t6, j9), r(i14));
                    break;
                case 51:
                    if (!D(t6, i15, i14)) {
                        break;
                    }
                    J = hp3.a(i15 << 3) + 8;
                    i11 += J;
                    break;
                case 52:
                    if (!D(t6, i15, i14)) {
                        break;
                    }
                    J = hp3.a(i15 << 3) + 4;
                    i11 += J;
                    break;
                case 53:
                    if (!D(t6, i15, i14)) {
                        break;
                    }
                    j7 = n(t6, j9);
                    J = hp3.a(i15 << 3) + hp3.b(j7);
                    i11 += J;
                    break;
                case 54:
                    if (!D(t6, i15, i14)) {
                        break;
                    }
                    j7 = n(t6, j9);
                    J = hp3.a(i15 << 3) + hp3.b(j7);
                    i11 += J;
                    break;
                case 55:
                    if (!D(t6, i15, i14)) {
                        break;
                    }
                    i9 = Q(t6, j9);
                    D = hp3.a(i15 << 3);
                    K = hp3.z(i9);
                    a7 = D + K;
                    i11 += a7;
                    break;
                case 56:
                    if (!D(t6, i15, i14)) {
                        break;
                    }
                    J = hp3.a(i15 << 3) + 8;
                    i11 += J;
                    break;
                case 57:
                    if (!D(t6, i15, i14)) {
                        break;
                    }
                    J = hp3.a(i15 << 3) + 4;
                    i11 += J;
                    break;
                case 58:
                    if (!D(t6, i15, i14)) {
                        break;
                    }
                    J = hp3.a(i15 << 3) + 1;
                    i11 += J;
                    break;
                case 59:
                    if (D(t6, i15, i14)) {
                        object = unsafe.getObject(t6, j9);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (!D(t6, i15, i14)) {
                        break;
                    }
                    J = gs3.Q(i15, unsafe.getObject(t6, j9), p(i14));
                    i11 += J;
                    break;
                case 61:
                    if (!D(t6, i15, i14)) {
                        break;
                    }
                    object = unsafe.getObject(t6, j9);
                    int a82 = hp3.a(i15 << 3);
                    int q72 = ((uo3) object).q();
                    a7 = a82 + hp3.a(q72) + q72;
                    i11 += a7;
                    break;
                case 62:
                    if (D(t6, i15, i14)) {
                        i8 = Q(t6, j9);
                        D = hp3.a(i15 << 3);
                        K = hp3.a(i8);
                        a7 = D + K;
                        i11 += a7;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (!D(t6, i15, i14)) {
                        break;
                    }
                    i9 = Q(t6, j9);
                    D = hp3.a(i15 << 3);
                    K = hp3.z(i9);
                    a7 = D + K;
                    i11 += a7;
                    break;
                case 64:
                    if (!D(t6, i15, i14)) {
                        break;
                    }
                    J = hp3.a(i15 << 3) + 4;
                    i11 += J;
                    break;
                case 65:
                    if (!D(t6, i15, i14)) {
                        break;
                    }
                    J = hp3.a(i15 << 3) + 8;
                    i11 += J;
                    break;
                case 66:
                    if (D(t6, i15, i14)) {
                        i10 = Q(t6, j9);
                        D = hp3.a(i15 << 3);
                        i8 = (i10 >> 31) ^ (i10 + i10);
                        K = hp3.a(i8);
                        a7 = D + K;
                        i11 += a7;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (D(t6, i15, i14)) {
                        j8 = n(t6, j9);
                        D = hp3.a(i15 << 3);
                        K = hp3.b((j8 >> 63) ^ (j8 + j8));
                        a7 = D + K;
                        i11 += a7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (!D(t6, i15, i14)) {
                        break;
                    }
                    J = hp3.y(i15, (kr3) unsafe.getObject(t6, j9), p(i14));
                    i11 += J;
                    break;
            }
        }
        ws3<?, ?> ws3Var = this.f9269m;
        int a9 = i11 + ws3Var.a(ws3Var.d(t6));
        if (!this.f9262f) {
            return a9;
        }
        this.f9270n.a(t6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x030e, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.ads.uo3) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0097, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.ads.uo3) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0311, code lost:
    
        r5 = com.google.android.gms.internal.ads.hp3.a(r6 << 3);
        r4 = com.google.android.gms.internal.ads.hp3.C((java.lang.String) r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int P(T t6) {
        long n7;
        Object p7;
        int l7;
        int l8;
        int l9;
        long n8;
        int J;
        int K;
        int D;
        int a7;
        Unsafe unsafe = f9256r;
        int i7 = 0;
        for (int i8 = 0; i8 < this.f9257a.length; i8 += 3) {
            int m7 = m(i8);
            int l10 = l(m7);
            int i9 = this.f9257a[i8];
            long j7 = m7 & 1048575;
            if (l10 >= tp3.R.zza() && l10 <= tp3.f12323e0.zza()) {
                int i10 = this.f9257a[i8 + 2];
            }
            switch (l10) {
                case 0:
                    if (!A(t6, i8)) {
                        break;
                    }
                    J = hp3.a(i9 << 3) + 8;
                    i7 += J;
                    break;
                case 1:
                    if (!A(t6, i8)) {
                        break;
                    }
                    J = hp3.a(i9 << 3) + 4;
                    i7 += J;
                    break;
                case 2:
                    if (!A(t6, i8)) {
                        break;
                    }
                    n7 = gt3.n(t6, j7);
                    i7 += hp3.a(i9 << 3) + hp3.b(n7);
                    break;
                case 3:
                    if (!A(t6, i8)) {
                        break;
                    }
                    n7 = gt3.n(t6, j7);
                    i7 += hp3.a(i9 << 3) + hp3.b(n7);
                    break;
                case 4:
                    if (!A(t6, i8)) {
                        break;
                    }
                    l8 = gt3.l(t6, j7);
                    D = hp3.a(i9 << 3);
                    K = hp3.z(l8);
                    a7 = D + K;
                    i7 += a7;
                    break;
                case 5:
                    if (!A(t6, i8)) {
                        break;
                    }
                    J = hp3.a(i9 << 3) + 8;
                    i7 += J;
                    break;
                case 6:
                    if (!A(t6, i8)) {
                        break;
                    }
                    J = hp3.a(i9 << 3) + 4;
                    i7 += J;
                    break;
                case c4.w0.f2149o /* 7 */:
                    if (!A(t6, i8)) {
                        break;
                    }
                    J = hp3.a(i9 << 3) + 1;
                    i7 += J;
                    break;
                case c4.w0.f2150p /* 8 */:
                    if (A(t6, i8)) {
                        p7 = gt3.p(t6, j7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (!A(t6, i8)) {
                        break;
                    }
                    J = gs3.Q(i9, gt3.p(t6, j7), p(i8));
                    i7 += J;
                    break;
                case 10:
                    if (!A(t6, i8)) {
                        break;
                    }
                    p7 = gt3.p(t6, j7);
                    int a8 = hp3.a(i9 << 3);
                    int q7 = ((uo3) p7).q();
                    a7 = a8 + hp3.a(q7) + q7;
                    i7 += a7;
                    break;
                case 11:
                    if (A(t6, i8)) {
                        l7 = gt3.l(t6, j7);
                        D = hp3.a(i9 << 3);
                        K = hp3.a(l7);
                        a7 = D + K;
                        i7 += a7;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (!A(t6, i8)) {
                        break;
                    }
                    l8 = gt3.l(t6, j7);
                    D = hp3.a(i9 << 3);
                    K = hp3.z(l8);
                    a7 = D + K;
                    i7 += a7;
                    break;
                case 13:
                    if (!A(t6, i8)) {
                        break;
                    }
                    J = hp3.a(i9 << 3) + 4;
                    i7 += J;
                    break;
                case 14:
                    if (!A(t6, i8)) {
                        break;
                    }
                    J = hp3.a(i9 << 3) + 8;
                    i7 += J;
                    break;
                case 15:
                    if (A(t6, i8)) {
                        l9 = gt3.l(t6, j7);
                        D = hp3.a(i9 << 3);
                        l7 = (l9 >> 31) ^ (l9 + l9);
                        K = hp3.a(l7);
                        a7 = D + K;
                        i7 += a7;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (A(t6, i8)) {
                        n8 = gt3.n(t6, j7);
                        D = hp3.a(i9 << 3);
                        K = hp3.b((n8 >> 63) ^ (n8 + n8));
                        a7 = D + K;
                        i7 += a7;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (!A(t6, i8)) {
                        break;
                    }
                    J = hp3.y(i9, (kr3) gt3.p(t6, j7), p(i8));
                    i7 += J;
                    break;
                case 18:
                case 23:
                case 32:
                    J = gs3.J(i9, (List) gt3.p(t6, j7), false);
                    i7 += J;
                    break;
                case 19:
                case 24:
                case 31:
                    J = gs3.H(i9, (List) gt3.p(t6, j7), false);
                    i7 += J;
                    break;
                case 20:
                    J = gs3.O(i9, (List) gt3.p(t6, j7), false);
                    i7 += J;
                    break;
                case 21:
                    J = gs3.Z(i9, (List) gt3.p(t6, j7), false);
                    i7 += J;
                    break;
                case 22:
                    J = gs3.M(i9, (List) gt3.p(t6, j7), false);
                    i7 += J;
                    break;
                case 25:
                    J = gs3.A(i9, (List) gt3.p(t6, j7), false);
                    i7 += J;
                    break;
                case 26:
                    J = gs3.W(i9, (List) gt3.p(t6, j7));
                    i7 += J;
                    break;
                case 27:
                    J = gs3.R(i9, (List) gt3.p(t6, j7), p(i8));
                    i7 += J;
                    break;
                case 28:
                    J = gs3.E(i9, (List) gt3.p(t6, j7));
                    i7 += J;
                    break;
                case 29:
                    J = gs3.X(i9, (List) gt3.p(t6, j7), false);
                    i7 += J;
                    break;
                case 30:
                    J = gs3.F(i9, (List) gt3.p(t6, j7), false);
                    i7 += J;
                    break;
                case 33:
                    J = gs3.S(i9, (List) gt3.p(t6, j7), false);
                    i7 += J;
                    break;
                case 34:
                    J = gs3.U(i9, (List) gt3.p(t6, j7), false);
                    i7 += J;
                    break;
                case 35:
                    K = gs3.K((List) unsafe.getObject(t6, j7));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i9) + hp3.a(K);
                    a7 = D + K;
                    i7 += a7;
                    break;
                case 36:
                    K = gs3.I((List) unsafe.getObject(t6, j7));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i9) + hp3.a(K);
                    a7 = D + K;
                    i7 += a7;
                    break;
                case 37:
                    K = gs3.P((List) unsafe.getObject(t6, j7));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i9) + hp3.a(K);
                    a7 = D + K;
                    i7 += a7;
                    break;
                case 38:
                    K = gs3.a0((List) unsafe.getObject(t6, j7));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i9) + hp3.a(K);
                    a7 = D + K;
                    i7 += a7;
                    break;
                case 39:
                    K = gs3.N((List) unsafe.getObject(t6, j7));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i9) + hp3.a(K);
                    a7 = D + K;
                    i7 += a7;
                    break;
                case 40:
                    K = gs3.K((List) unsafe.getObject(t6, j7));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i9) + hp3.a(K);
                    a7 = D + K;
                    i7 += a7;
                    break;
                case 41:
                    K = gs3.I((List) unsafe.getObject(t6, j7));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i9) + hp3.a(K);
                    a7 = D + K;
                    i7 += a7;
                    break;
                case 42:
                    K = gs3.D((List) unsafe.getObject(t6, j7));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i9) + hp3.a(K);
                    a7 = D + K;
                    i7 += a7;
                    break;
                case 43:
                    K = gs3.Y((List) unsafe.getObject(t6, j7));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i9) + hp3.a(K);
                    a7 = D + K;
                    i7 += a7;
                    break;
                case 44:
                    K = gs3.G((List) unsafe.getObject(t6, j7));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i9) + hp3.a(K);
                    a7 = D + K;
                    i7 += a7;
                    break;
                case 45:
                    K = gs3.I((List) unsafe.getObject(t6, j7));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i9) + hp3.a(K);
                    a7 = D + K;
                    i7 += a7;
                    break;
                case 46:
                    K = gs3.K((List) unsafe.getObject(t6, j7));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i9) + hp3.a(K);
                    a7 = D + K;
                    i7 += a7;
                    break;
                case 47:
                    K = gs3.T((List) unsafe.getObject(t6, j7));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i9) + hp3.a(K);
                    a7 = D + K;
                    i7 += a7;
                    break;
                case 48:
                    K = gs3.V((List) unsafe.getObject(t6, j7));
                    if (K <= 0) {
                        break;
                    }
                    D = hp3.D(i9) + hp3.a(K);
                    a7 = D + K;
                    i7 += a7;
                    break;
                case 49:
                    J = gs3.L(i9, (List) gt3.p(t6, j7), p(i8));
                    i7 += J;
                    break;
                case 50:
                    fr3.a(i9, gt3.p(t6, j7), r(i8));
                    break;
                case 51:
                    if (!D(t6, i9, i8)) {
                        break;
                    }
                    J = hp3.a(i9 << 3) + 8;
                    i7 += J;
                    break;
                case 52:
                    if (!D(t6, i9, i8)) {
                        break;
                    }
                    J = hp3.a(i9 << 3) + 4;
                    i7 += J;
                    break;
                case 53:
                    if (!D(t6, i9, i8)) {
                        break;
                    }
                    n7 = n(t6, j7);
                    i7 += hp3.a(i9 << 3) + hp3.b(n7);
                    break;
                case 54:
                    if (!D(t6, i9, i8)) {
                        break;
                    }
                    n7 = n(t6, j7);
                    i7 += hp3.a(i9 << 3) + hp3.b(n7);
                    break;
                case 55:
                    if (!D(t6, i9, i8)) {
                        break;
                    }
                    l8 = Q(t6, j7);
                    D = hp3.a(i9 << 3);
                    K = hp3.z(l8);
                    a7 = D + K;
                    i7 += a7;
                    break;
                case 56:
                    if (!D(t6, i9, i8)) {
                        break;
                    }
                    J = hp3.a(i9 << 3) + 8;
                    i7 += J;
                    break;
                case 57:
                    if (!D(t6, i9, i8)) {
                        break;
                    }
                    J = hp3.a(i9 << 3) + 4;
                    i7 += J;
                    break;
                case 58:
                    if (!D(t6, i9, i8)) {
                        break;
                    }
                    J = hp3.a(i9 << 3) + 1;
                    i7 += J;
                    break;
                case 59:
                    if (D(t6, i9, i8)) {
                        p7 = gt3.p(t6, j7);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (!D(t6, i9, i8)) {
                        break;
                    }
                    J = gs3.Q(i9, gt3.p(t6, j7), p(i8));
                    i7 += J;
                    break;
                case 61:
                    if (!D(t6, i9, i8)) {
                        break;
                    }
                    p7 = gt3.p(t6, j7);
                    int a82 = hp3.a(i9 << 3);
                    int q72 = ((uo3) p7).q();
                    a7 = a82 + hp3.a(q72) + q72;
                    i7 += a7;
                    break;
                case 62:
                    if (D(t6, i9, i8)) {
                        l7 = Q(t6, j7);
                        D = hp3.a(i9 << 3);
                        K = hp3.a(l7);
                        a7 = D + K;
                        i7 += a7;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (!D(t6, i9, i8)) {
                        break;
                    }
                    l8 = Q(t6, j7);
                    D = hp3.a(i9 << 3);
                    K = hp3.z(l8);
                    a7 = D + K;
                    i7 += a7;
                    break;
                case 64:
                    if (!D(t6, i9, i8)) {
                        break;
                    }
                    J = hp3.a(i9 << 3) + 4;
                    i7 += J;
                    break;
                case 65:
                    if (!D(t6, i9, i8)) {
                        break;
                    }
                    J = hp3.a(i9 << 3) + 8;
                    i7 += J;
                    break;
                case 66:
                    if (D(t6, i9, i8)) {
                        l9 = Q(t6, j7);
                        D = hp3.a(i9 << 3);
                        l7 = (l9 >> 31) ^ (l9 + l9);
                        K = hp3.a(l7);
                        a7 = D + K;
                        i7 += a7;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (D(t6, i9, i8)) {
                        n8 = n(t6, j7);
                        D = hp3.a(i9 << 3);
                        K = hp3.b((n8 >> 63) ^ (n8 + n8));
                        a7 = D + K;
                        i7 += a7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (!D(t6, i9, i8)) {
                        break;
                    }
                    J = hp3.y(i9, (kr3) gt3.p(t6, j7), p(i8));
                    i7 += J;
                    break;
            }
        }
        ws3<?, ?> ws3Var = this.f9269m;
        return i7 + ws3Var.a(ws3Var.d(t6));
    }

    private static <T> int Q(T t6, long j7) {
        return ((Integer) gt3.p(t6, j7)).intValue();
    }

    private final <K, V> int R(T t6, byte[] bArr, int i7, int i8, int i9, long j7, eo3 eo3Var) {
        Unsafe unsafe = f9256r;
        Object r7 = r(i9);
        Object object = unsafe.getObject(t6, j7);
        if (fr3.b(object)) {
            er3<K, V> d7 = er3.a().d();
            fr3.c(d7, object);
            unsafe.putObject(t6, j7, d7);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int S(T t6, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j7, int i14, eo3 eo3Var) {
        int m7;
        long j8;
        int i15;
        Object valueOf;
        int j9;
        Object obj;
        Unsafe unsafe = f9256r;
        long j10 = this.f9257a[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                if (i11 == 1) {
                    unsafe.putObject(t6, j7, Double.valueOf(Double.longBitsToDouble(fo3.n(bArr, i7))));
                    unsafe.putInt(t6, j10, i10);
                    return i7 + 8;
                }
                return i7;
            case 52:
                if (i11 == 5) {
                    unsafe.putObject(t6, j7, Float.valueOf(Float.intBitsToFloat(fo3.b(bArr, i7))));
                    unsafe.putInt(t6, j10, i10);
                    return i7 + 4;
                }
                return i7;
            case 53:
            case 54:
                if (i11 == 0) {
                    m7 = fo3.m(bArr, i7, eo3Var);
                    j8 = eo3Var.f4687b;
                    valueOf = Long.valueOf(j8);
                    unsafe.putObject(t6, j7, valueOf);
                    unsafe.putInt(t6, j10, i10);
                    return m7;
                }
                return i7;
            case 55:
            case 62:
                if (i11 == 0) {
                    m7 = fo3.j(bArr, i7, eo3Var);
                    i15 = eo3Var.f4686a;
                    valueOf = Integer.valueOf(i15);
                    unsafe.putObject(t6, j7, valueOf);
                    unsafe.putInt(t6, j10, i10);
                    return m7;
                }
                return i7;
            case 56:
            case 65:
                if (i11 == 1) {
                    unsafe.putObject(t6, j7, Long.valueOf(fo3.n(bArr, i7)));
                    unsafe.putInt(t6, j10, i10);
                    return i7 + 8;
                }
                return i7;
            case 57:
            case 64:
                if (i11 == 5) {
                    unsafe.putObject(t6, j7, Integer.valueOf(fo3.b(bArr, i7)));
                    unsafe.putInt(t6, j10, i10);
                    return i7 + 4;
                }
                return i7;
            case 58:
                if (i11 == 0) {
                    m7 = fo3.m(bArr, i7, eo3Var);
                    valueOf = Boolean.valueOf(eo3Var.f4687b != 0);
                    unsafe.putObject(t6, j7, valueOf);
                    unsafe.putInt(t6, j10, i10);
                    return m7;
                }
                return i7;
            case 59:
                if (i11 == 2) {
                    j9 = fo3.j(bArr, i7, eo3Var);
                    int i16 = eo3Var.f4686a;
                    if (i16 == 0) {
                        obj = "";
                        unsafe.putObject(t6, j7, obj);
                        unsafe.putInt(t6, j10, i10);
                        return j9;
                    }
                    if ((i12 & 536870912) != 0 && !lt3.j(bArr, j9, j9 + i16)) {
                        throw mq3.d();
                    }
                    unsafe.putObject(t6, j7, new String(bArr, j9, i16, kq3.f7586b));
                    j9 += i16;
                    unsafe.putInt(t6, j10, i10);
                    return j9;
                }
                return i7;
            case 60:
                if (i11 == 2) {
                    j9 = fo3.d(p(i14), bArr, i7, i8, eo3Var);
                    Object object = unsafe.getInt(t6, j10) == i10 ? unsafe.getObject(t6, j7) : null;
                    obj = eo3Var.f4688c;
                    if (object != null) {
                        obj = kq3.g(object, obj);
                    }
                    unsafe.putObject(t6, j7, obj);
                    unsafe.putInt(t6, j10, i10);
                    return j9;
                }
                return i7;
            case 61:
                if (i11 == 2) {
                    m7 = fo3.a(bArr, i7, eo3Var);
                    valueOf = eo3Var.f4688c;
                    unsafe.putObject(t6, j7, valueOf);
                    unsafe.putInt(t6, j10, i10);
                    return m7;
                }
                return i7;
            case 63:
                if (i11 == 0) {
                    int j11 = fo3.j(bArr, i7, eo3Var);
                    int i17 = eo3Var.f4686a;
                    eq3 o7 = o(i14);
                    if (o7 == null || o7.d(i17)) {
                        unsafe.putObject(t6, j7, Integer.valueOf(i17));
                        unsafe.putInt(t6, j10, i10);
                    } else {
                        J(t6).h(i9, Long.valueOf(i17));
                    }
                    return j11;
                }
                return i7;
            case 66:
                if (i11 == 0) {
                    m7 = fo3.j(bArr, i7, eo3Var);
                    i15 = cp3.e(eo3Var.f4686a);
                    valueOf = Integer.valueOf(i15);
                    unsafe.putObject(t6, j7, valueOf);
                    unsafe.putInt(t6, j10, i10);
                    return m7;
                }
                return i7;
            case 67:
                if (i11 == 0) {
                    m7 = fo3.m(bArr, i7, eo3Var);
                    j8 = cp3.f(eo3Var.f4687b);
                    valueOf = Long.valueOf(j8);
                    unsafe.putObject(t6, j7, valueOf);
                    unsafe.putInt(t6, j10, i10);
                    return m7;
                }
                return i7;
            case 68:
                if (i11 == 3) {
                    j9 = fo3.c(p(i14), bArr, i7, i8, (i9 & (-8)) | 4, eo3Var);
                    Object object2 = unsafe.getInt(t6, j10) == i10 ? unsafe.getObject(t6, j7) : null;
                    obj = eo3Var.f4688c;
                    if (object2 != null) {
                        obj = kq3.g(object2, obj);
                    }
                    unsafe.putObject(t6, j7, obj);
                    unsafe.putInt(t6, j10, i10);
                    return j9;
                }
                return i7;
            default:
                return i7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x028e, code lost:
    
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0290, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r19;
        r1 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02a4, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02d7, code lost:
    
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02f8, code lost:
    
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0093. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int T(T t6, byte[] bArr, int i7, int i8, eo3 eo3Var) {
        byte b7;
        int i9;
        int i10;
        int i11;
        Unsafe unsafe;
        int i12;
        int i13;
        Unsafe unsafe2;
        int i14;
        int i15;
        int i16;
        int m7;
        long j7;
        Unsafe unsafe3;
        T t7;
        long j8;
        int i17;
        int i18;
        Object obj;
        Unsafe unsafe4;
        nr3<T> nr3Var = this;
        T t8 = t6;
        byte[] bArr2 = bArr;
        int i19 = i8;
        eo3 eo3Var2 = eo3Var;
        Unsafe unsafe5 = f9256r;
        int i20 = -1;
        int i21 = 1048575;
        int i22 = i7;
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1048575;
        while (i22 < i19) {
            int i27 = i22 + 1;
            byte b8 = bArr2[i22];
            if (b8 < 0) {
                i9 = fo3.k(b8, bArr2, i27, eo3Var2);
                b7 = eo3Var2.f4686a;
            } else {
                b7 = b8;
                i9 = i27;
            }
            int i28 = b7 >>> 3;
            int i29 = b7 & 7;
            int W = i28 > i23 ? nr3Var.W(i28, i24 / 3) : nr3Var.V(i28);
            if (W == i20) {
                i10 = i9;
                i11 = i28;
                unsafe = unsafe5;
                i12 = 0;
            } else {
                int i30 = nr3Var.f9257a[W + 1];
                int l7 = l(i30);
                Unsafe unsafe6 = unsafe5;
                long j9 = i30 & i21;
                if (l7 <= 17) {
                    int i31 = nr3Var.f9257a[W + 2];
                    int i32 = 1 << (i31 >>> 20);
                    int i33 = i31 & 1048575;
                    if (i33 != i26) {
                        if (i26 != 1048575) {
                            long j10 = i26;
                            unsafe4 = unsafe6;
                            unsafe4.putInt(t8, j10, i25);
                        } else {
                            unsafe4 = unsafe6;
                        }
                        if (i33 != 1048575) {
                            i25 = unsafe4.getInt(t8, i33);
                        }
                        unsafe2 = unsafe4;
                        i26 = i33;
                    } else {
                        unsafe2 = unsafe6;
                    }
                    switch (l7) {
                        case 0:
                            i13 = W;
                            i11 = i28;
                            if (i29 != 1) {
                                i10 = i9;
                                unsafe = unsafe2;
                                i12 = i13;
                                break;
                            } else {
                                gt3.z(t8, j9, Double.longBitsToDouble(fo3.n(bArr2, i9)));
                                i22 = i9 + 8;
                                i25 |= i32;
                                unsafe5 = unsafe2;
                                i24 = i13;
                                i23 = i11;
                                i21 = 1048575;
                                i20 = -1;
                                i19 = i8;
                                break;
                            }
                        case 1:
                            i13 = W;
                            i11 = i28;
                            if (i29 != 5) {
                                i10 = i9;
                                unsafe = unsafe2;
                                i12 = i13;
                                break;
                            } else {
                                gt3.A(t8, j9, Float.intBitsToFloat(fo3.b(bArr2, i9)));
                                i22 = i9 + 4;
                                i25 |= i32;
                                unsafe5 = unsafe2;
                                i24 = i13;
                                i23 = i11;
                                i21 = 1048575;
                                i20 = -1;
                                i19 = i8;
                                break;
                            }
                        case 2:
                        case 3:
                            i13 = W;
                            i11 = i28;
                            if (i29 != 0) {
                                i10 = i9;
                                unsafe = unsafe2;
                                i12 = i13;
                                break;
                            } else {
                                m7 = fo3.m(bArr2, i9, eo3Var2);
                                j7 = eo3Var2.f4687b;
                                unsafe3 = unsafe2;
                                t7 = t6;
                                j8 = j9;
                                unsafe3.putLong(t7, j8, j7);
                                i25 |= i32;
                                unsafe5 = unsafe2;
                                i24 = i13;
                                i22 = m7;
                                i23 = i11;
                                i21 = 1048575;
                                i20 = -1;
                                i19 = i8;
                                break;
                            }
                        case 4:
                        case 11:
                            i13 = W;
                            i11 = i28;
                            if (i29 != 0) {
                                i10 = i9;
                                unsafe = unsafe2;
                                i12 = i13;
                                break;
                            } else {
                                i22 = fo3.j(bArr2, i9, eo3Var2);
                                i17 = eo3Var2.f4686a;
                                unsafe2.putInt(t8, j9, i17);
                                i25 |= i32;
                                unsafe5 = unsafe2;
                                i24 = i13;
                                i23 = i11;
                                i21 = 1048575;
                                i20 = -1;
                                i19 = i8;
                                break;
                            }
                        case 5:
                        case 14:
                            i13 = W;
                            i11 = i28;
                            if (i29 != 1) {
                                i10 = i9;
                                unsafe = unsafe2;
                                i12 = i13;
                                break;
                            } else {
                                unsafe2.putLong(t6, j9, fo3.n(bArr2, i9));
                                i22 = i9 + 8;
                                i25 |= i32;
                                unsafe5 = unsafe2;
                                i24 = i13;
                                i23 = i11;
                                i21 = 1048575;
                                i20 = -1;
                                i19 = i8;
                                break;
                            }
                        case 6:
                        case 13:
                            i18 = i8;
                            i13 = W;
                            i11 = i28;
                            if (i29 != 5) {
                                i10 = i9;
                                unsafe = unsafe2;
                                i12 = i13;
                                break;
                            } else {
                                unsafe2.putInt(t8, j9, fo3.b(bArr2, i9));
                                i22 = i9 + 4;
                                i25 |= i32;
                                unsafe5 = unsafe2;
                                i23 = i11;
                                i21 = 1048575;
                                i20 = -1;
                                int i34 = i13;
                                i19 = i18;
                                i24 = i34;
                                break;
                            }
                        case c4.w0.f2149o /* 7 */:
                            i18 = i8;
                            i13 = W;
                            i11 = i28;
                            if (i29 != 0) {
                                i10 = i9;
                                unsafe = unsafe2;
                                i12 = i13;
                                break;
                            } else {
                                i22 = fo3.m(bArr2, i9, eo3Var2);
                                gt3.x(t8, j9, eo3Var2.f4687b != 0);
                                i25 |= i32;
                                unsafe5 = unsafe2;
                                i23 = i11;
                                i21 = 1048575;
                                i20 = -1;
                                int i342 = i13;
                                i19 = i18;
                                i24 = i342;
                                break;
                            }
                        case c4.w0.f2150p /* 8 */:
                            i18 = i8;
                            i13 = W;
                            i11 = i28;
                            if (i29 != 2) {
                                i10 = i9;
                                unsafe = unsafe2;
                                i12 = i13;
                                break;
                            } else {
                                i22 = (i30 & 536870912) == 0 ? fo3.g(bArr2, i9, eo3Var2) : fo3.h(bArr2, i9, eo3Var2);
                                obj = eo3Var2.f4688c;
                                unsafe2.putObject(t8, j9, obj);
                                i25 |= i32;
                                unsafe5 = unsafe2;
                                i23 = i11;
                                i21 = 1048575;
                                i20 = -1;
                                int i3422 = i13;
                                i19 = i18;
                                i24 = i3422;
                                break;
                            }
                        case 9:
                            i13 = W;
                            i11 = i28;
                            if (i29 != 2) {
                                i10 = i9;
                                unsafe = unsafe2;
                                i12 = i13;
                                break;
                            } else {
                                i18 = i8;
                                i22 = fo3.d(nr3Var.p(i13), bArr2, i9, i18, eo3Var2);
                                Object object = unsafe2.getObject(t8, j9);
                                obj = object == null ? eo3Var2.f4688c : kq3.g(object, eo3Var2.f4688c);
                                unsafe2.putObject(t8, j9, obj);
                                i25 |= i32;
                                unsafe5 = unsafe2;
                                i23 = i11;
                                i21 = 1048575;
                                i20 = -1;
                                int i34222 = i13;
                                i19 = i18;
                                i24 = i34222;
                                break;
                            }
                        case 10:
                            i13 = W;
                            i11 = i28;
                            if (i29 != 2) {
                                i10 = i9;
                                unsafe = unsafe2;
                                i12 = i13;
                                break;
                            } else {
                                i22 = fo3.a(bArr2, i9, eo3Var2);
                                unsafe2.putObject(t8, j9, eo3Var2.f4688c);
                                i25 |= i32;
                                unsafe5 = unsafe2;
                                i24 = i13;
                                i23 = i11;
                                i21 = 1048575;
                                i20 = -1;
                                i19 = i8;
                                break;
                            }
                        case 12:
                            i13 = W;
                            i11 = i28;
                            if (i29 != 0) {
                                i10 = i9;
                                unsafe = unsafe2;
                                i12 = i13;
                                break;
                            } else {
                                i22 = fo3.j(bArr2, i9, eo3Var2);
                                i17 = eo3Var2.f4686a;
                                unsafe2.putInt(t8, j9, i17);
                                i25 |= i32;
                                unsafe5 = unsafe2;
                                i24 = i13;
                                i23 = i11;
                                i21 = 1048575;
                                i20 = -1;
                                i19 = i8;
                                break;
                            }
                        case 15:
                            i13 = W;
                            i11 = i28;
                            if (i29 != 0) {
                                i10 = i9;
                                unsafe = unsafe2;
                                i12 = i13;
                                break;
                            } else {
                                i22 = fo3.j(bArr2, i9, eo3Var2);
                                i17 = cp3.e(eo3Var2.f4686a);
                                unsafe2.putInt(t8, j9, i17);
                                i25 |= i32;
                                unsafe5 = unsafe2;
                                i24 = i13;
                                i23 = i11;
                                i21 = 1048575;
                                i20 = -1;
                                i19 = i8;
                                break;
                            }
                        case 16:
                            if (i29 != 0) {
                                i13 = W;
                                i11 = i28;
                                i10 = i9;
                                unsafe = unsafe2;
                                i12 = i13;
                                break;
                            } else {
                                m7 = fo3.m(bArr2, i9, eo3Var2);
                                j7 = cp3.f(eo3Var2.f4687b);
                                unsafe3 = unsafe2;
                                t7 = t6;
                                i13 = W;
                                j8 = j9;
                                i11 = i28;
                                unsafe3.putLong(t7, j8, j7);
                                i25 |= i32;
                                unsafe5 = unsafe2;
                                i24 = i13;
                                i22 = m7;
                                i23 = i11;
                                i21 = 1048575;
                                i20 = -1;
                                i19 = i8;
                                break;
                            }
                        default:
                            i13 = W;
                            i11 = i28;
                            i10 = i9;
                            unsafe = unsafe2;
                            i12 = i13;
                            break;
                    }
                } else {
                    i11 = i28;
                    i13 = W;
                    unsafe2 = unsafe6;
                    if (l7 != 27) {
                        if (l7 <= 49) {
                            int i35 = i9;
                            i15 = i25;
                            i16 = i26;
                            unsafe = unsafe2;
                            i12 = i13;
                            i22 = U(t6, bArr, i9, i8, b7, i11, i29, i13, i30, l7, j9, eo3Var);
                        } else {
                            i14 = i9;
                            i15 = i25;
                            i16 = i26;
                            unsafe = unsafe2;
                            i12 = i13;
                            if (l7 != 50) {
                                i22 = S(t6, bArr, i14, i8, b7, i11, i29, i30, l7, j9, i12, eo3Var);
                            } else if (i29 == 2) {
                                i22 = R(t6, bArr, i14, i8, i12, j9, eo3Var);
                            }
                        }
                        unsafe5 = unsafe;
                        i21 = 1048575;
                        i20 = -1;
                    } else if (i29 == 2) {
                        jq3 jq3Var = (jq3) unsafe2.getObject(t8, j9);
                        if (!jq3Var.c()) {
                            int size = jq3Var.size();
                            jq3Var = jq3Var.e(size == 0 ? 10 : size + size);
                            unsafe2.putObject(t8, j9, jq3Var);
                        }
                        i22 = fo3.e(nr3Var.p(i13), b7, bArr, i9, i8, jq3Var, eo3Var);
                        i25 = i25;
                        unsafe5 = unsafe2;
                        i24 = i13;
                        i23 = i11;
                        i21 = 1048575;
                        i20 = -1;
                        i19 = i8;
                    } else {
                        i14 = i9;
                        i15 = i25;
                        i16 = i26;
                        unsafe = unsafe2;
                        i12 = i13;
                    }
                    i10 = i14;
                    i25 = i15;
                    i26 = i16;
                }
            }
            i22 = fo3.i(b7, bArr, i10, i8, J(t6), eo3Var);
            nr3Var = this;
            t8 = t6;
            bArr2 = bArr;
            i19 = i8;
            eo3Var2 = eo3Var;
            i24 = i12;
            i23 = i11;
            unsafe5 = unsafe;
            i21 = 1048575;
            i20 = -1;
        }
        int i36 = i25;
        Unsafe unsafe7 = unsafe5;
        if (i26 != 1048575) {
            unsafe7.putInt(t6, i26, i36);
        }
        if (i22 == i8) {
            return i22;
        }
        throw mq3.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0156, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0132, code lost:
    
        r12.add(com.google.android.gms.internal.ads.uo3.K(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0254, code lost:
    
        if (r29.f4687b != 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0256, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0259, code lost:
    
        r12.j(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x025c, code lost:
    
        if (r4 >= r19) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x025e, code lost:
    
        r6 = com.google.android.gms.internal.ads.fo3.j(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0264, code lost:
    
        if (r20 == r29.f4686a) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0267, code lost:
    
        r4 = com.google.android.gms.internal.ads.fo3.m(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x026f, code lost:
    
        if (r29.f4687b == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0258, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0272, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0259, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0122, code lost:
    
        if (r4 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0124, code lost:
    
        r12.add(com.google.android.gms.internal.ads.uo3.f12885g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0132, code lost:
    
        if (r1 >= r19) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0134, code lost:
    
        r4 = com.google.android.gms.internal.ads.fo3.j(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013a, code lost:
    
        if (r20 == r29.f4686a) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013d, code lost:
    
        r1 = com.google.android.gms.internal.ads.fo3.j(r17, r4, r29);
        r4 = r29.f4686a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0143, code lost:
    
        if (r4 < 0) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0147, code lost:
    
        if (r4 > (r17.length - r1)) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0149, code lost:
    
        if (r4 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x012a, code lost:
    
        r12.add(com.google.android.gms.internal.ads.uo3.K(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0150, code lost:
    
        throw com.google.android.gms.internal.ads.mq3.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0155, code lost:
    
        throw com.google.android.gms.internal.ads.mq3.f();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x01b4 -> B:96:0x0193). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x01f8 -> B:113:0x01cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x026f -> B:150:0x0256). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0149 -> B:68:0x0124). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int U(T t6, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, long j7, int i13, long j8, eo3 eo3Var) {
        int i14;
        int i15;
        int i16;
        int i17;
        int j9;
        int i18 = i7;
        Unsafe unsafe = f9256r;
        jq3 jq3Var = (jq3) unsafe.getObject(t6, j8);
        if (!jq3Var.c()) {
            int size = jq3Var.size();
            jq3Var = jq3Var.e(size == 0 ? 10 : size + size);
            unsafe.putObject(t6, j8, jq3Var);
        }
        switch (i13) {
            case 18:
            case 35:
                if (i11 == 2) {
                    jp3 jp3Var = (jp3) jq3Var;
                    int j10 = fo3.j(bArr, i18, eo3Var);
                    int i19 = eo3Var.f4686a + j10;
                    while (j10 < i19) {
                        jp3Var.j(Double.longBitsToDouble(fo3.n(bArr, j10)));
                        j10 += 8;
                    }
                    if (j10 == i19) {
                        return j10;
                    }
                    throw mq3.j();
                }
                if (i11 == 1) {
                    jp3 jp3Var2 = (jp3) jq3Var;
                    long n7 = fo3.n(bArr, i7);
                    while (true) {
                        jp3Var2.j(Double.longBitsToDouble(n7));
                        i14 = i18 + 8;
                        if (i14 < i8) {
                            i18 = fo3.j(bArr, i14, eo3Var);
                            if (i9 == eo3Var.f4686a) {
                                n7 = fo3.n(bArr, i18);
                            }
                        }
                    }
                    return i14;
                }
                return i18;
            case 19:
            case 36:
                if (i11 == 2) {
                    up3 up3Var = (up3) jq3Var;
                    int j11 = fo3.j(bArr, i18, eo3Var);
                    int i20 = eo3Var.f4686a + j11;
                    while (j11 < i20) {
                        up3Var.j(Float.intBitsToFloat(fo3.b(bArr, j11)));
                        j11 += 4;
                    }
                    if (j11 == i20) {
                        return j11;
                    }
                    throw mq3.j();
                }
                if (i11 == 5) {
                    up3 up3Var2 = (up3) jq3Var;
                    int b7 = fo3.b(bArr, i7);
                    while (true) {
                        up3Var2.j(Float.intBitsToFloat(b7));
                        i15 = i18 + 4;
                        if (i15 < i8) {
                            i18 = fo3.j(bArr, i15, eo3Var);
                            if (i9 == eo3Var.f4686a) {
                                b7 = fo3.b(bArr, i18);
                            }
                        }
                    }
                    return i15;
                }
                return i18;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i11 == 2) {
                    zq3 zq3Var = (zq3) jq3Var;
                    int j12 = fo3.j(bArr, i18, eo3Var);
                    int i21 = eo3Var.f4686a + j12;
                    while (j12 < i21) {
                        j12 = fo3.m(bArr, j12, eo3Var);
                        zq3Var.l(eo3Var.f4687b);
                    }
                    if (j12 == i21) {
                        return j12;
                    }
                    throw mq3.j();
                }
                if (i11 == 0) {
                    zq3 zq3Var2 = (zq3) jq3Var;
                    do {
                        int m7 = fo3.m(bArr, i18, eo3Var);
                        zq3Var2.l(eo3Var.f4687b);
                        if (m7 < i8) {
                            i18 = fo3.j(bArr, m7, eo3Var);
                        }
                        return m7;
                    } while (i9 == eo3Var.f4686a);
                    return m7;
                }
                return i18;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i11 == 2) {
                    return fo3.f(bArr, i18, jq3Var, eo3Var);
                }
                if (i11 == 0) {
                    return fo3.l(i9, bArr, i7, i8, jq3Var, eo3Var);
                }
                return i18;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i11 == 2) {
                    zq3 zq3Var3 = (zq3) jq3Var;
                    int j13 = fo3.j(bArr, i18, eo3Var);
                    int i22 = eo3Var.f4686a + j13;
                    while (j13 < i22) {
                        zq3Var3.l(fo3.n(bArr, j13));
                        j13 += 8;
                    }
                    if (j13 == i22) {
                        return j13;
                    }
                    throw mq3.j();
                }
                if (i11 == 1) {
                    zq3 zq3Var4 = (zq3) jq3Var;
                    long n8 = fo3.n(bArr, i7);
                    while (true) {
                        zq3Var4.l(n8);
                        i16 = i18 + 8;
                        if (i16 < i8) {
                            i18 = fo3.j(bArr, i16, eo3Var);
                            if (i9 == eo3Var.f4686a) {
                                n8 = fo3.n(bArr, i18);
                            }
                        }
                    }
                    return i16;
                }
                return i18;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i11 == 2) {
                    bq3 bq3Var = (bq3) jq3Var;
                    int j14 = fo3.j(bArr, i18, eo3Var);
                    int i23 = eo3Var.f4686a + j14;
                    while (j14 < i23) {
                        bq3Var.O(fo3.b(bArr, j14));
                        j14 += 4;
                    }
                    if (j14 == i23) {
                        return j14;
                    }
                    throw mq3.j();
                }
                if (i11 == 5) {
                    bq3 bq3Var2 = (bq3) jq3Var;
                    int b8 = fo3.b(bArr, i7);
                    while (true) {
                        bq3Var2.O(b8);
                        i17 = i18 + 4;
                        if (i17 < i8) {
                            i18 = fo3.j(bArr, i17, eo3Var);
                            if (i9 == eo3Var.f4686a) {
                                b8 = fo3.b(bArr, i18);
                            }
                        }
                    }
                    return i17;
                }
                return i18;
            case 25:
            case 42:
                if (i11 != 2) {
                    if (i11 == 0) {
                        go3 go3Var = (go3) jq3Var;
                        int m8 = fo3.m(bArr, i18, eo3Var);
                        break;
                    }
                    return i18;
                }
                go3 go3Var2 = (go3) jq3Var;
                j9 = fo3.j(bArr, i18, eo3Var);
                int i24 = eo3Var.f4686a + j9;
                while (j9 < i24) {
                    j9 = fo3.m(bArr, j9, eo3Var);
                    go3Var2.j(eo3Var.f4687b != 0);
                }
                if (j9 != i24) {
                    throw mq3.j();
                }
                return j9;
            case 26:
                if (i11 == 2) {
                    long j15 = j7 & 536870912;
                    i18 = fo3.j(bArr, i18, eo3Var);
                    if (j15 == 0) {
                        int i25 = eo3Var.f4686a;
                        if (i25 < 0) {
                            throw mq3.f();
                        }
                        if (i25 != 0) {
                            jq3Var.add(new String(bArr, i18, i25, kq3.f7586b));
                            i18 += i25;
                            while (i18 < i8) {
                                int j16 = fo3.j(bArr, i18, eo3Var);
                                if (i9 == eo3Var.f4686a) {
                                    i18 = fo3.j(bArr, j16, eo3Var);
                                    int i26 = eo3Var.f4686a;
                                    if (i26 < 0) {
                                        throw mq3.f();
                                    }
                                    if (i26 != 0) {
                                        jq3Var.add(new String(bArr, i18, i26, kq3.f7586b));
                                        i18 += i26;
                                    }
                                }
                            }
                        }
                        jq3Var.add("");
                        while (i18 < i8) {
                        }
                    } else {
                        int i27 = eo3Var.f4686a;
                        if (i27 < 0) {
                            throw mq3.f();
                        }
                        if (i27 != 0) {
                            int i28 = i18 + i27;
                            if (!lt3.j(bArr, i18, i28)) {
                                throw mq3.d();
                            }
                            jq3Var.add(new String(bArr, i18, i27, kq3.f7586b));
                            i18 = i28;
                            while (i18 < i8) {
                                int j17 = fo3.j(bArr, i18, eo3Var);
                                if (i9 == eo3Var.f4686a) {
                                    i18 = fo3.j(bArr, j17, eo3Var);
                                    int i29 = eo3Var.f4686a;
                                    if (i29 < 0) {
                                        throw mq3.f();
                                    }
                                    if (i29 != 0) {
                                        int i30 = i18 + i29;
                                        if (!lt3.j(bArr, i18, i30)) {
                                            throw mq3.d();
                                        }
                                        jq3Var.add(new String(bArr, i18, i29, kq3.f7586b));
                                        i18 = i30;
                                    }
                                }
                            }
                        }
                        jq3Var.add("");
                        while (i18 < i8) {
                        }
                    }
                }
                return i18;
            case 27:
                if (i11 == 2) {
                    return fo3.e(p(i12), i9, bArr, i7, i8, jq3Var, eo3Var);
                }
                return i18;
            case 28:
                if (i11 == 2) {
                    int j18 = fo3.j(bArr, i18, eo3Var);
                    int i31 = eo3Var.f4686a;
                    if (i31 < 0) {
                        throw mq3.f();
                    }
                    if (i31 > bArr.length - j18) {
                        throw mq3.j();
                    }
                }
                return i18;
            case 30:
            case 44:
                if (i11 != 2) {
                    if (i11 == 0) {
                        j9 = fo3.l(i9, bArr, i7, i8, jq3Var, eo3Var);
                    }
                    return i18;
                }
                j9 = fo3.f(bArr, i18, jq3Var, eo3Var);
                aq3 aq3Var = (aq3) t6;
                xs3 xs3Var = aq3Var.zzc;
                if (xs3Var == xs3.c()) {
                    xs3Var = null;
                }
                Object c7 = gs3.c(i10, jq3Var, o(i12), xs3Var, this.f9269m);
                if (c7 != null) {
                    aq3Var.zzc = (xs3) c7;
                    return j9;
                }
                return j9;
            case 33:
            case 47:
                if (i11 == 2) {
                    bq3 bq3Var3 = (bq3) jq3Var;
                    int j19 = fo3.j(bArr, i18, eo3Var);
                    int i32 = eo3Var.f4686a + j19;
                    while (j19 < i32) {
                        j19 = fo3.j(bArr, j19, eo3Var);
                        bq3Var3.O(cp3.e(eo3Var.f4686a));
                    }
                    if (j19 == i32) {
                        return j19;
                    }
                    throw mq3.j();
                }
                if (i11 == 0) {
                    bq3 bq3Var4 = (bq3) jq3Var;
                    do {
                        int j20 = fo3.j(bArr, i18, eo3Var);
                        bq3Var4.O(cp3.e(eo3Var.f4686a));
                        if (j20 < i8) {
                            i18 = fo3.j(bArr, j20, eo3Var);
                        }
                        return j20;
                    } while (i9 == eo3Var.f4686a);
                    return j20;
                }
                return i18;
            case 34:
            case 48:
                if (i11 == 2) {
                    zq3 zq3Var5 = (zq3) jq3Var;
                    int j21 = fo3.j(bArr, i18, eo3Var);
                    int i33 = eo3Var.f4686a + j21;
                    while (j21 < i33) {
                        j21 = fo3.m(bArr, j21, eo3Var);
                        zq3Var5.l(cp3.f(eo3Var.f4687b));
                    }
                    if (j21 == i33) {
                        return j21;
                    }
                    throw mq3.j();
                }
                if (i11 == 0) {
                    zq3 zq3Var6 = (zq3) jq3Var;
                    do {
                        int m9 = fo3.m(bArr, i18, eo3Var);
                        zq3Var6.l(cp3.f(eo3Var.f4687b));
                        if (m9 < i8) {
                            i18 = fo3.j(bArr, m9, eo3Var);
                        }
                        return m9;
                    } while (i9 == eo3Var.f4686a);
                    return m9;
                }
                return i18;
            default:
                if (i11 == 3) {
                    es3 p7 = p(i12);
                    int i34 = (i9 & (-8)) | 4;
                    int c8 = fo3.c(p7, bArr, i7, i8, i34, eo3Var);
                    while (true) {
                        jq3Var.add(eo3Var.f4688c);
                        if (c8 < i8) {
                            int j22 = fo3.j(bArr, c8, eo3Var);
                            if (i9 == eo3Var.f4686a) {
                                c8 = fo3.c(p7, bArr, j22, i8, i34, eo3Var);
                            }
                        }
                    }
                    return c8;
                }
                return i18;
        }
    }

    private final int V(int i7) {
        if (i7 < this.f9259c || i7 > this.f9260d) {
            return -1;
        }
        return k(i7, 0);
    }

    private final int W(int i7, int i8) {
        if (i7 < this.f9259c || i7 > this.f9260d) {
            return -1;
        }
        return k(i7, i8);
    }

    private final int X(int i7) {
        return this.f9257a[i7 + 2];
    }

    private final int k(int i7, int i8) {
        int length = (this.f9257a.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = this.f9257a[i10];
            if (i7 == i11) {
                return i10;
            }
            if (i7 < i11) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    private static int l(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int m(int i7) {
        return this.f9257a[i7 + 1];
    }

    private static <T> long n(T t6, long j7) {
        return ((Long) gt3.p(t6, j7)).longValue();
    }

    private final eq3 o(int i7) {
        int i8 = i7 / 3;
        return (eq3) this.f9258b[i8 + i8 + 1];
    }

    private final es3 p(int i7) {
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        es3 es3Var = (es3) this.f9258b[i9];
        if (es3Var != null) {
            return es3Var;
        }
        es3<T> b7 = tr3.a().b((Class) this.f9258b[i9 + 1]);
        this.f9258b[i9] = b7;
        return b7;
    }

    private final <UT, UB> UB q(Object obj, int i7, UB ub, ws3<UT, UB> ws3Var) {
        int i8 = this.f9257a[i7];
        Object p7 = gt3.p(obj, m(i7) & 1048575);
        if (p7 == null || o(i7) == null) {
            return ub;
        }
        throw null;
    }

    private final Object r(int i7) {
        int i8 = i7 / 3;
        return this.f9258b[i8 + i8];
    }

    private static Field s(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private final void t(T t6, T t7, int i7) {
        long m7 = m(i7) & 1048575;
        if (A(t7, i7)) {
            Object p7 = gt3.p(t6, m7);
            Object p8 = gt3.p(t7, m7);
            if (p7 != null && p8 != null) {
                p8 = kq3.g(p7, p8);
            } else if (p8 == null) {
                return;
            }
            gt3.D(t6, m7, p8);
            w(t6, i7);
        }
    }

    private final void u(T t6, T t7, int i7) {
        int m7 = m(i7);
        int i8 = this.f9257a[i7];
        long j7 = m7 & 1048575;
        if (D(t7, i8, i7)) {
            Object p7 = D(t6, i8, i7) ? gt3.p(t6, j7) : null;
            Object p8 = gt3.p(t7, j7);
            if (p7 != null && p8 != null) {
                p8 = kq3.g(p7, p8);
            } else if (p8 == null) {
                return;
            }
            gt3.D(t6, j7, p8);
            x(t6, i8, i7);
        }
    }

    private final void v(Object obj, int i7, wr3 wr3Var) {
        long j7;
        Object l7;
        if (z(i7)) {
            j7 = i7 & 1048575;
            l7 = wr3Var.y();
        } else {
            int i8 = i7 & 1048575;
            if (this.f9263g) {
                j7 = i8;
                l7 = wr3Var.q();
            } else {
                j7 = i8;
                l7 = wr3Var.l();
            }
        }
        gt3.D(obj, j7, l7);
    }

    private final void w(T t6, int i7) {
        int X = X(i7);
        long j7 = 1048575 & X;
        if (j7 == 1048575) {
            return;
        }
        gt3.B(t6, j7, (1 << (X >>> 20)) | gt3.l(t6, j7));
    }

    private final void x(T t6, int i7, int i8) {
        gt3.B(t6, X(i8) & 1048575, i7);
    }

    private final boolean y(T t6, T t7, int i7) {
        return A(t6, i7) == A(t7, i7);
    }

    private static boolean z(int i7) {
        return (i7 & 536870912) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0416, code lost:
    
        if (r6 == r3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0418, code lost:
    
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x041e, code lost:
    
        r3 = r9.f9266j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0422, code lost:
    
        if (r3 >= r9.f9267k) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0424, code lost:
    
        r9.q(r12, r9.f9265i[r3], r2, r9.f9269m);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0432, code lost:
    
        if (r7 != 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0434, code lost:
    
        if (r0 != r32) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x043b, code lost:
    
        throw com.google.android.gms.internal.ads.mq3.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0440, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x043c, code lost:
    
        if (r0 > r32) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x043e, code lost:
    
        if (r1 != r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0446, code lost:
    
        throw com.google.android.gms.internal.ads.mq3.g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int I(T t6, byte[] bArr, int i7, int i8, int i9, eo3 eo3Var) {
        Unsafe unsafe;
        int i10;
        Object obj;
        nr3<T> nr3Var;
        boolean z6;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Object obj2;
        eo3 eo3Var2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int m7;
        Unsafe unsafe2;
        Object obj3;
        long j7;
        long j8;
        int i24;
        long j9;
        Object g7;
        long j10;
        int i25;
        int i26;
        int i27;
        int i28;
        nr3<T> nr3Var2 = this;
        Object obj4 = t6;
        byte[] bArr2 = bArr;
        int i29 = i8;
        int i30 = i9;
        eo3 eo3Var3 = eo3Var;
        Unsafe unsafe3 = f9256r;
        int i31 = i7;
        int i32 = 0;
        int i33 = -1;
        int i34 = 0;
        int i35 = 0;
        int i36 = 1048575;
        while (true) {
            if (i31 < i29) {
                int i37 = i31 + 1;
                byte b7 = bArr2[i31];
                if (b7 < 0) {
                    i13 = fo3.k(b7, bArr2, i37, eo3Var3);
                    i12 = eo3Var3.f4686a;
                } else {
                    i12 = b7;
                    i13 = i37;
                }
                int i38 = i12 >>> 3;
                int i39 = i12 & 7;
                int W = i38 > i33 ? nr3Var2.W(i38, i34 / 3) : nr3Var2.V(i38);
                if (W == -1) {
                    i14 = i13;
                    i15 = i12;
                    i16 = i35;
                    i17 = i38;
                    unsafe = unsafe3;
                    i10 = i30;
                    i18 = 0;
                } else {
                    int i40 = nr3Var2.f9257a[W + 1];
                    int l7 = l(i40);
                    int i41 = i12;
                    int i42 = i13;
                    long j11 = i40 & 1048575;
                    if (l7 <= 17) {
                        int i43 = nr3Var2.f9257a[W + 2];
                        int i44 = 1 << (i43 >>> 20);
                        int i45 = i43 & 1048575;
                        int i46 = W;
                        if (i45 != i36) {
                            if (i36 != 1048575) {
                                unsafe3.putInt(obj4, i36, i35);
                            }
                            i35 = unsafe3.getInt(obj4, i45);
                            i20 = i45;
                        } else {
                            i20 = i36;
                        }
                        int i47 = i35;
                        switch (l7) {
                            case 0:
                                i21 = i41;
                                i14 = i42;
                                i22 = i38;
                                i23 = i46;
                                if (i39 != 1) {
                                    i16 = i47;
                                    i18 = i23;
                                    unsafe = unsafe3;
                                    i15 = i21;
                                    i17 = i22;
                                    i36 = i20;
                                    i10 = i9;
                                    break;
                                } else {
                                    gt3.z(obj4, j11, Double.longBitsToDouble(fo3.n(bArr2, i14)));
                                    i31 = i14 + 8;
                                    i35 = i47 | i44;
                                    i34 = i23;
                                    i32 = i21;
                                    i33 = i22;
                                    i36 = i20;
                                    i30 = i9;
                                }
                            case 1:
                                i21 = i41;
                                i14 = i42;
                                i22 = i38;
                                i23 = i46;
                                if (i39 != 5) {
                                    i16 = i47;
                                    i18 = i23;
                                    unsafe = unsafe3;
                                    i15 = i21;
                                    i17 = i22;
                                    i36 = i20;
                                    i10 = i9;
                                    break;
                                } else {
                                    gt3.A(obj4, j11, Float.intBitsToFloat(fo3.b(bArr2, i14)));
                                    i31 = i14 + 4;
                                    i35 = i47 | i44;
                                    i34 = i23;
                                    i32 = i21;
                                    i33 = i22;
                                    i36 = i20;
                                    i30 = i9;
                                }
                            case 2:
                            case 3:
                                i21 = i41;
                                i14 = i42;
                                i22 = i38;
                                i23 = i46;
                                if (i39 != 0) {
                                    i16 = i47;
                                    i18 = i23;
                                    unsafe = unsafe3;
                                    i15 = i21;
                                    i17 = i22;
                                    i36 = i20;
                                    i10 = i9;
                                    break;
                                } else {
                                    m7 = fo3.m(bArr2, i14, eo3Var3);
                                    unsafe2 = unsafe3;
                                    obj3 = t6;
                                    j7 = j11;
                                    j8 = eo3Var3.f4687b;
                                    unsafe2.putLong(obj3, j7, j8);
                                    i35 = i47 | i44;
                                    i34 = i23;
                                    i31 = m7;
                                    i32 = i21;
                                    i33 = i22;
                                    i36 = i20;
                                    i30 = i9;
                                }
                            case 4:
                            case 11:
                                i21 = i41;
                                i14 = i42;
                                i22 = i38;
                                i23 = i46;
                                if (i39 != 0) {
                                    i16 = i47;
                                    i18 = i23;
                                    unsafe = unsafe3;
                                    i15 = i21;
                                    i17 = i22;
                                    i36 = i20;
                                    i10 = i9;
                                    break;
                                } else {
                                    i31 = fo3.j(bArr2, i14, eo3Var3);
                                    unsafe3.putInt(obj4, j11, eo3Var3.f4686a);
                                    i35 = i47 | i44;
                                    i34 = i23;
                                    i32 = i21;
                                    i33 = i22;
                                    i36 = i20;
                                    i30 = i9;
                                }
                            case 5:
                            case 14:
                                i21 = i41;
                                i24 = i42;
                                i22 = i38;
                                i23 = i46;
                                if (i39 != 1) {
                                    i14 = i24;
                                    i16 = i47;
                                    i18 = i23;
                                    unsafe = unsafe3;
                                    i15 = i21;
                                    i17 = i22;
                                    i36 = i20;
                                    i10 = i9;
                                    break;
                                } else {
                                    unsafe3.putLong(t6, j11, fo3.n(bArr2, i24));
                                    i31 = i24 + 8;
                                    i35 = i47 | i44;
                                    i34 = i23;
                                    i32 = i21;
                                    i33 = i22;
                                    i36 = i20;
                                    i30 = i9;
                                }
                            case 6:
                            case 13:
                                i21 = i41;
                                i24 = i42;
                                i22 = i38;
                                i23 = i46;
                                if (i39 != 5) {
                                    i14 = i24;
                                    i16 = i47;
                                    i18 = i23;
                                    unsafe = unsafe3;
                                    i15 = i21;
                                    i17 = i22;
                                    i36 = i20;
                                    i10 = i9;
                                    break;
                                } else {
                                    unsafe3.putInt(obj4, j11, fo3.b(bArr2, i24));
                                    i31 = i24 + 4;
                                    i35 = i47 | i44;
                                    i34 = i23;
                                    i32 = i21;
                                    i33 = i22;
                                    i36 = i20;
                                    i30 = i9;
                                }
                            case c4.w0.f2149o /* 7 */:
                                i21 = i41;
                                i24 = i42;
                                i22 = i38;
                                i23 = i46;
                                if (i39 != 0) {
                                    i14 = i24;
                                    i16 = i47;
                                    i18 = i23;
                                    unsafe = unsafe3;
                                    i15 = i21;
                                    i17 = i22;
                                    i36 = i20;
                                    i10 = i9;
                                    break;
                                } else {
                                    i31 = fo3.m(bArr2, i24, eo3Var3);
                                    gt3.x(obj4, j11, eo3Var3.f4687b != 0);
                                    i35 = i47 | i44;
                                    i34 = i23;
                                    i32 = i21;
                                    i33 = i22;
                                    i36 = i20;
                                    i30 = i9;
                                }
                            case c4.w0.f2150p /* 8 */:
                                i21 = i41;
                                i24 = i42;
                                i22 = i38;
                                i23 = i46;
                                if (i39 != 2) {
                                    i14 = i24;
                                    i16 = i47;
                                    i18 = i23;
                                    unsafe = unsafe3;
                                    i15 = i21;
                                    i17 = i22;
                                    i36 = i20;
                                    i10 = i9;
                                    break;
                                } else {
                                    i31 = (536870912 & i40) == 0 ? fo3.g(bArr2, i24, eo3Var3) : fo3.h(bArr2, i24, eo3Var3);
                                    unsafe3.putObject(obj4, j11, eo3Var3.f4688c);
                                    i35 = i47 | i44;
                                    i34 = i23;
                                    i32 = i21;
                                    i33 = i22;
                                    i36 = i20;
                                    i30 = i9;
                                }
                            case 9:
                                i21 = i41;
                                i24 = i42;
                                j9 = j11;
                                i22 = i38;
                                i23 = i46;
                                if (i39 != 2) {
                                    i14 = i24;
                                    i16 = i47;
                                    i18 = i23;
                                    unsafe = unsafe3;
                                    i15 = i21;
                                    i17 = i22;
                                    i36 = i20;
                                    i10 = i9;
                                    break;
                                } else {
                                    i31 = fo3.d(nr3Var2.p(i23), bArr2, i24, i29, eo3Var3);
                                    g7 = (i47 & i44) == 0 ? eo3Var3.f4688c : kq3.g(unsafe3.getObject(obj4, j9), eo3Var3.f4688c);
                                    unsafe3.putObject(obj4, j9, g7);
                                    i35 = i47 | i44;
                                    i34 = i23;
                                    i32 = i21;
                                    i33 = i22;
                                    i36 = i20;
                                    i30 = i9;
                                }
                            case 10:
                                i21 = i41;
                                i24 = i42;
                                j9 = j11;
                                i22 = i38;
                                i23 = i46;
                                if (i39 != 2) {
                                    i14 = i24;
                                    i16 = i47;
                                    i18 = i23;
                                    unsafe = unsafe3;
                                    i15 = i21;
                                    i17 = i22;
                                    i36 = i20;
                                    i10 = i9;
                                    break;
                                } else {
                                    i31 = fo3.a(bArr2, i24, eo3Var3);
                                    g7 = eo3Var3.f4688c;
                                    unsafe3.putObject(obj4, j9, g7);
                                    i35 = i47 | i44;
                                    i34 = i23;
                                    i32 = i21;
                                    i33 = i22;
                                    i36 = i20;
                                    i30 = i9;
                                }
                            case 12:
                                i21 = i41;
                                i24 = i42;
                                j10 = j11;
                                i22 = i38;
                                i23 = i46;
                                if (i39 != 0) {
                                    i14 = i24;
                                    i16 = i47;
                                    i18 = i23;
                                    unsafe = unsafe3;
                                    i15 = i21;
                                    i17 = i22;
                                    i36 = i20;
                                    i10 = i9;
                                    break;
                                } else {
                                    i31 = fo3.j(bArr2, i24, eo3Var3);
                                    i25 = eo3Var3.f4686a;
                                    eq3 o7 = nr3Var2.o(i23);
                                    if (o7 != null && !o7.d(i25)) {
                                        J(t6).h(i21, Long.valueOf(i25));
                                        i35 = i47;
                                        i34 = i23;
                                        i32 = i21;
                                        i33 = i22;
                                        i36 = i20;
                                        i30 = i9;
                                    }
                                    unsafe3.putInt(obj4, j10, i25);
                                    i35 = i47 | i44;
                                    i34 = i23;
                                    i32 = i21;
                                    i33 = i22;
                                    i36 = i20;
                                    i30 = i9;
                                }
                                break;
                            case 15:
                                i21 = i41;
                                i24 = i42;
                                j10 = j11;
                                i22 = i38;
                                i23 = i46;
                                if (i39 != 0) {
                                    i14 = i24;
                                    i16 = i47;
                                    i18 = i23;
                                    unsafe = unsafe3;
                                    i15 = i21;
                                    i17 = i22;
                                    i36 = i20;
                                    i10 = i9;
                                    break;
                                } else {
                                    i31 = fo3.j(bArr2, i24, eo3Var3);
                                    i25 = cp3.e(eo3Var3.f4686a);
                                    unsafe3.putInt(obj4, j10, i25);
                                    i35 = i47 | i44;
                                    i34 = i23;
                                    i32 = i21;
                                    i33 = i22;
                                    i36 = i20;
                                    i30 = i9;
                                }
                            case 16:
                                if (i39 != 0) {
                                    i21 = i41;
                                    i22 = i38;
                                    i23 = i46;
                                    i14 = i42;
                                    i16 = i47;
                                    i18 = i23;
                                    unsafe = unsafe3;
                                    i15 = i21;
                                    i17 = i22;
                                    i36 = i20;
                                    i10 = i9;
                                    break;
                                } else {
                                    m7 = fo3.m(bArr2, i42, eo3Var3);
                                    j8 = cp3.f(eo3Var3.f4687b);
                                    j7 = j11;
                                    unsafe2 = unsafe3;
                                    i21 = i41;
                                    obj3 = t6;
                                    i22 = i38;
                                    i23 = i46;
                                    unsafe2.putLong(obj3, j7, j8);
                                    i35 = i47 | i44;
                                    i34 = i23;
                                    i31 = m7;
                                    i32 = i21;
                                    i33 = i22;
                                    i36 = i20;
                                    i30 = i9;
                                }
                            default:
                                i21 = i41;
                                i14 = i42;
                                i22 = i38;
                                i23 = i46;
                                if (i39 != 3) {
                                    i16 = i47;
                                    i18 = i23;
                                    unsafe = unsafe3;
                                    i15 = i21;
                                    i17 = i22;
                                    i36 = i20;
                                    i10 = i9;
                                    break;
                                } else {
                                    i31 = fo3.c(nr3Var2.p(i23), bArr, i14, i8, (i22 << 3) | 4, eo3Var);
                                    unsafe3.putObject(obj4, j11, (i47 & i44) == 0 ? eo3Var3.f4688c : kq3.g(unsafe3.getObject(obj4, j11), eo3Var3.f4688c));
                                    i35 = i47 | i44;
                                    bArr2 = bArr;
                                    i29 = i8;
                                    i34 = i23;
                                    i32 = i21;
                                    i33 = i22;
                                    i36 = i20;
                                    i30 = i9;
                                }
                        }
                    } else {
                        i22 = i38;
                        int i48 = W;
                        if (l7 != 27) {
                            i16 = i35;
                            i26 = i36;
                            if (l7 <= 49) {
                                i18 = i48;
                                i17 = i22;
                                unsafe = unsafe3;
                                i28 = i41;
                                i31 = U(t6, bArr, i42, i8, i41, i22, i39, i18, i40, l7, j11, eo3Var);
                                if (i31 != i42) {
                                    nr3Var2 = this;
                                    obj4 = t6;
                                    bArr2 = bArr;
                                    i29 = i8;
                                    i30 = i9;
                                    eo3Var3 = eo3Var;
                                    i35 = i16;
                                    i34 = i18;
                                    i32 = i28;
                                    i33 = i17;
                                    i36 = i26;
                                    unsafe3 = unsafe;
                                } else {
                                    i10 = i9;
                                    i14 = i31;
                                    i15 = i28;
                                    i36 = i26;
                                }
                            } else {
                                i27 = i42;
                                i18 = i48;
                                unsafe = unsafe3;
                                i17 = i22;
                                i28 = i41;
                                if (l7 != 50) {
                                    i31 = S(t6, bArr, i27, i8, i28, i17, i39, i40, l7, j11, i18, eo3Var);
                                    if (i31 != i27) {
                                        nr3Var2 = this;
                                        obj4 = t6;
                                        bArr2 = bArr;
                                        i29 = i8;
                                        i30 = i9;
                                        eo3Var3 = eo3Var;
                                        i35 = i16;
                                        i34 = i18;
                                        i32 = i28;
                                        i33 = i17;
                                        i36 = i26;
                                        unsafe3 = unsafe;
                                    } else {
                                        i10 = i9;
                                        i14 = i31;
                                        i15 = i28;
                                        i36 = i26;
                                    }
                                } else if (i39 == 2) {
                                    i31 = R(t6, bArr, i27, i8, i18, j11, eo3Var);
                                    if (i31 != i27) {
                                        nr3Var2 = this;
                                        obj4 = t6;
                                        bArr2 = bArr;
                                        i29 = i8;
                                        i30 = i9;
                                        eo3Var3 = eo3Var;
                                        i35 = i16;
                                        i34 = i18;
                                        i32 = i28;
                                        i33 = i17;
                                        i36 = i26;
                                        unsafe3 = unsafe;
                                    } else {
                                        i10 = i9;
                                        i14 = i31;
                                        i15 = i28;
                                        i36 = i26;
                                    }
                                }
                            }
                        } else if (i39 == 2) {
                            jq3 jq3Var = (jq3) unsafe3.getObject(obj4, j11);
                            if (!jq3Var.c()) {
                                int size = jq3Var.size();
                                jq3Var = jq3Var.e(size == 0 ? 10 : size + size);
                                unsafe3.putObject(obj4, j11, jq3Var);
                            }
                            i32 = i41;
                            i20 = i36;
                            i31 = fo3.e(nr3Var2.p(i48), i32, bArr, i42, i8, jq3Var, eo3Var);
                            bArr2 = bArr;
                            i29 = i8;
                            i34 = i48;
                            i35 = i35;
                            i33 = i22;
                            i36 = i20;
                            i30 = i9;
                        } else {
                            i16 = i35;
                            i26 = i36;
                            i27 = i42;
                            i18 = i48;
                            unsafe = unsafe3;
                            i17 = i22;
                            i28 = i41;
                        }
                        i10 = i9;
                        i14 = i27;
                        i15 = i28;
                        i36 = i26;
                    }
                }
                if (i15 != i10 || i10 == 0) {
                    if (this.f9262f) {
                        eo3Var2 = eo3Var;
                        if (eo3Var2.f4689d != mp3.a()) {
                            i19 = i17;
                            if (eo3Var2.f4689d.c(this.f9261e, i19) != null) {
                                throw null;
                            }
                            i31 = fo3.i(i15, bArr, i14, i8, J(t6), eo3Var);
                            obj2 = t6;
                            i29 = i8;
                            i32 = i15;
                            nr3Var2 = this;
                            eo3Var3 = eo3Var2;
                            i33 = i19;
                            obj4 = obj2;
                            i35 = i16;
                            i34 = i18;
                            unsafe3 = unsafe;
                            bArr2 = bArr;
                            i30 = i10;
                        } else {
                            obj2 = t6;
                        }
                    } else {
                        obj2 = t6;
                        eo3Var2 = eo3Var;
                    }
                    i19 = i17;
                    i31 = fo3.i(i15, bArr, i14, i8, J(t6), eo3Var);
                    i29 = i8;
                    i32 = i15;
                    nr3Var2 = this;
                    eo3Var3 = eo3Var2;
                    i33 = i19;
                    obj4 = obj2;
                    i35 = i16;
                    i34 = i18;
                    unsafe3 = unsafe;
                    bArr2 = bArr;
                    i30 = i10;
                } else {
                    i11 = 1048575;
                    nr3Var = this;
                    obj = t6;
                    i31 = i14;
                    i32 = i15;
                    i35 = i16;
                    z6 = false;
                }
            } else {
                unsafe = unsafe3;
                i10 = i30;
                obj = obj4;
                nr3Var = nr3Var2;
                z6 = false;
                i11 = 1048575;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c8, code lost:
    
        if (r3 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e0, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00dc, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00da, code lost:
    
        if (r3 != null) goto L67;
     */
    @Override // com.google.android.gms.internal.ads.es3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(T t6) {
        int i7;
        double j7;
        float k7;
        long n7;
        int l7;
        boolean H;
        Object p7;
        int length = this.f9257a.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int m7 = m(i9);
            int i10 = this.f9257a[i9];
            long j8 = 1048575 & m7;
            int i11 = 37;
            switch (l(m7)) {
                case 0:
                    i7 = i8 * 53;
                    j7 = gt3.j(t6, j8);
                    n7 = Double.doubleToLongBits(j7);
                    l7 = kq3.c(n7);
                    i8 = i7 + l7;
                    break;
                case 1:
                    i7 = i8 * 53;
                    k7 = gt3.k(t6, j8);
                    l7 = Float.floatToIntBits(k7);
                    i8 = i7 + l7;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i7 = i8 * 53;
                    n7 = gt3.n(t6, j8);
                    l7 = kq3.c(n7);
                    i8 = i7 + l7;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i7 = i8 * 53;
                    l7 = gt3.l(t6, j8);
                    i8 = i7 + l7;
                    break;
                case c4.w0.f2149o /* 7 */:
                    i7 = i8 * 53;
                    H = gt3.H(t6, j8);
                    l7 = kq3.a(H);
                    i8 = i7 + l7;
                    break;
                case c4.w0.f2150p /* 8 */:
                    i7 = i8 * 53;
                    l7 = ((String) gt3.p(t6, j8)).hashCode();
                    i8 = i7 + l7;
                    break;
                case 9:
                    p7 = gt3.p(t6, j8);
                    break;
                case 10:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    i7 = i8 * 53;
                    l7 = gt3.p(t6, j8).hashCode();
                    i8 = i7 + l7;
                    break;
                case 17:
                    p7 = gt3.p(t6, j8);
                    break;
                case 51:
                    if (D(t6, i10, i9)) {
                        i7 = i8 * 53;
                        j7 = M(t6, j8);
                        n7 = Double.doubleToLongBits(j7);
                        l7 = kq3.c(n7);
                        i8 = i7 + l7;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (D(t6, i10, i9)) {
                        i7 = i8 * 53;
                        k7 = N(t6, j8);
                        l7 = Float.floatToIntBits(k7);
                        i8 = i7 + l7;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (!D(t6, i10, i9)) {
                        break;
                    }
                    i7 = i8 * 53;
                    n7 = n(t6, j8);
                    l7 = kq3.c(n7);
                    i8 = i7 + l7;
                    break;
                case 54:
                    if (!D(t6, i10, i9)) {
                        break;
                    }
                    i7 = i8 * 53;
                    n7 = n(t6, j8);
                    l7 = kq3.c(n7);
                    i8 = i7 + l7;
                    break;
                case 55:
                    if (!D(t6, i10, i9)) {
                        break;
                    }
                    i7 = i8 * 53;
                    l7 = Q(t6, j8);
                    i8 = i7 + l7;
                    break;
                case 56:
                    if (!D(t6, i10, i9)) {
                        break;
                    }
                    i7 = i8 * 53;
                    n7 = n(t6, j8);
                    l7 = kq3.c(n7);
                    i8 = i7 + l7;
                    break;
                case 57:
                    if (!D(t6, i10, i9)) {
                        break;
                    }
                    i7 = i8 * 53;
                    l7 = Q(t6, j8);
                    i8 = i7 + l7;
                    break;
                case 58:
                    if (D(t6, i10, i9)) {
                        i7 = i8 * 53;
                        H = E(t6, j8);
                        l7 = kq3.a(H);
                        i8 = i7 + l7;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!D(t6, i10, i9)) {
                        break;
                    }
                    i7 = i8 * 53;
                    l7 = ((String) gt3.p(t6, j8)).hashCode();
                    i8 = i7 + l7;
                    break;
                case 60:
                    if (!D(t6, i10, i9)) {
                        break;
                    }
                    i7 = i8 * 53;
                    l7 = gt3.p(t6, j8).hashCode();
                    i8 = i7 + l7;
                    break;
                case 61:
                    if (!D(t6, i10, i9)) {
                        break;
                    }
                    i7 = i8 * 53;
                    l7 = gt3.p(t6, j8).hashCode();
                    i8 = i7 + l7;
                    break;
                case 62:
                    if (!D(t6, i10, i9)) {
                        break;
                    }
                    i7 = i8 * 53;
                    l7 = Q(t6, j8);
                    i8 = i7 + l7;
                    break;
                case 63:
                    if (!D(t6, i10, i9)) {
                        break;
                    }
                    i7 = i8 * 53;
                    l7 = Q(t6, j8);
                    i8 = i7 + l7;
                    break;
                case 64:
                    if (!D(t6, i10, i9)) {
                        break;
                    }
                    i7 = i8 * 53;
                    l7 = Q(t6, j8);
                    i8 = i7 + l7;
                    break;
                case 65:
                    if (!D(t6, i10, i9)) {
                        break;
                    }
                    i7 = i8 * 53;
                    n7 = n(t6, j8);
                    l7 = kq3.c(n7);
                    i8 = i7 + l7;
                    break;
                case 66:
                    if (!D(t6, i10, i9)) {
                        break;
                    }
                    i7 = i8 * 53;
                    l7 = Q(t6, j8);
                    i8 = i7 + l7;
                    break;
                case 67:
                    if (!D(t6, i10, i9)) {
                        break;
                    }
                    i7 = i8 * 53;
                    n7 = n(t6, j8);
                    l7 = kq3.c(n7);
                    i8 = i7 + l7;
                    break;
                case 68:
                    if (!D(t6, i10, i9)) {
                        break;
                    }
                    i7 = i8 * 53;
                    l7 = gt3.p(t6, j8).hashCode();
                    i8 = i7 + l7;
                    break;
            }
        }
        int hashCode = (i8 * 53) + this.f9269m.d(t6).hashCode();
        if (!this.f9262f) {
            return hashCode;
        }
        this.f9270n.a(t6);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.es3
    public final T b() {
        return (T) ((aq3) this.f9261e).E(4, null, null);
    }

    @Override // com.google.android.gms.internal.ads.es3
    public final int c(T t6) {
        return this.f9264h ? P(t6) : O(t6);
    }

    @Override // com.google.android.gms.internal.ads.es3
    public final void d(T t6) {
        int i7;
        int i8 = this.f9266j;
        while (true) {
            i7 = this.f9267k;
            if (i8 >= i7) {
                break;
            }
            long m7 = m(this.f9265i[i8]) & 1048575;
            Object p7 = gt3.p(t6, m7);
            if (p7 != null) {
                ((er3) p7).e();
                gt3.D(t6, m7, p7);
            }
            i8++;
        }
        int length = this.f9265i.length;
        while (i7 < length) {
            this.f9268l.b(t6, this.f9265i[i7]);
            i7++;
        }
        this.f9269m.m(t6);
        if (this.f9262f) {
            this.f9270n.e(t6);
        }
    }

    @Override // com.google.android.gms.internal.ads.es3
    public final void e(T t6, wr3 wr3Var, mp3 mp3Var) {
        long j7;
        Object g7;
        int b7;
        List<Double> a7;
        List<Float> a8;
        List<Long> a9;
        List<Long> a10;
        List<Integer> a11;
        List<Long> a12;
        List<Integer> a13;
        List<Boolean> a14;
        List<Integer> a15;
        List<Integer> a16;
        eq3 o7;
        List<Integer> a17;
        List<Long> a18;
        List<Integer> a19;
        List<Long> a20;
        Objects.requireNonNull(mp3Var);
        ws3 ws3Var = this.f9269m;
        np3<?> np3Var = this.f9270n;
        sp3<?> sp3Var = null;
        Object obj = null;
        while (true) {
            try {
                int c7 = wr3Var.c();
                int V = V(c7);
                if (V >= 0) {
                    int m7 = m(V);
                    try {
                        switch (l(m7)) {
                            case 0:
                                gt3.z(t6, m7 & 1048575, wr3Var.zza());
                                w(t6, V);
                                break;
                            case 1:
                                gt3.A(t6, m7 & 1048575, wr3Var.a());
                                w(t6, V);
                                break;
                            case 2:
                                gt3.C(t6, m7 & 1048575, wr3Var.k());
                                w(t6, V);
                                break;
                            case 3:
                                gt3.C(t6, m7 & 1048575, wr3Var.n());
                                w(t6, V);
                                break;
                            case 4:
                                gt3.B(t6, m7 & 1048575, wr3Var.e());
                                w(t6, V);
                                break;
                            case 5:
                                gt3.C(t6, m7 & 1048575, wr3Var.j());
                                w(t6, V);
                                break;
                            case 6:
                                gt3.B(t6, m7 & 1048575, wr3Var.d());
                                w(t6, V);
                                break;
                            case c4.w0.f2149o /* 7 */:
                                gt3.x(t6, m7 & 1048575, wr3Var.P());
                                w(t6, V);
                                break;
                            case c4.w0.f2150p /* 8 */:
                                v(t6, m7, wr3Var);
                                w(t6, V);
                                break;
                            case 9:
                                if (A(t6, V)) {
                                    j7 = m7 & 1048575;
                                    g7 = kq3.g(gt3.p(t6, j7), wr3Var.D(p(V), mp3Var));
                                    gt3.D(t6, j7, g7);
                                    break;
                                } else {
                                    gt3.D(t6, m7 & 1048575, wr3Var.D(p(V), mp3Var));
                                    w(t6, V);
                                    break;
                                }
                            case 10:
                                gt3.D(t6, m7 & 1048575, wr3Var.l());
                                w(t6, V);
                                break;
                            case 11:
                                gt3.B(t6, m7 & 1048575, wr3Var.i());
                                w(t6, V);
                                break;
                            case 12:
                                b7 = wr3Var.b();
                                eq3 o8 = o(V);
                                if (o8 != null && !o8.d(b7)) {
                                    obj = gs3.d(c7, b7, obj, ws3Var);
                                    break;
                                } else {
                                    gt3.B(t6, m7 & 1048575, b7);
                                    w(t6, V);
                                    break;
                                }
                                break;
                            case 13:
                                gt3.B(t6, m7 & 1048575, wr3Var.f());
                                w(t6, V);
                                break;
                            case 14:
                                gt3.C(t6, m7 & 1048575, wr3Var.o());
                                w(t6, V);
                                break;
                            case 15:
                                gt3.B(t6, m7 & 1048575, wr3Var.h());
                                w(t6, V);
                                break;
                            case 16:
                                gt3.C(t6, m7 & 1048575, wr3Var.m());
                                w(t6, V);
                                break;
                            case 17:
                                if (A(t6, V)) {
                                    j7 = m7 & 1048575;
                                    g7 = kq3.g(gt3.p(t6, j7), wr3Var.I(p(V), mp3Var));
                                    gt3.D(t6, j7, g7);
                                    break;
                                } else {
                                    gt3.D(t6, m7 & 1048575, wr3Var.I(p(V), mp3Var));
                                    w(t6, V);
                                    break;
                                }
                            case 18:
                                a7 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.x(a7);
                                break;
                            case 19:
                                a8 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.K(a8);
                                break;
                            case 20:
                                a9 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.t(a9);
                                break;
                            case 21:
                                a10 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.w(a10);
                                break;
                            case 22:
                                a11 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.B(a11);
                                break;
                            case 23:
                                a12 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.v(a12);
                                break;
                            case 24:
                                a13 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.J(a13);
                                break;
                            case 25:
                                a14 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.G(a14);
                                break;
                            case 26:
                                if (z(m7)) {
                                    ((dp3) wr3Var).L(this.f9268l.a(t6, m7 & 1048575), true);
                                    break;
                                } else {
                                    ((dp3) wr3Var).L(this.f9268l.a(t6, m7 & 1048575), false);
                                    break;
                                }
                            case 27:
                                wr3Var.s(this.f9268l.a(t6, m7 & 1048575), p(V), mp3Var);
                                break;
                            case 28:
                                wr3Var.A(this.f9268l.a(t6, m7 & 1048575));
                                break;
                            case 29:
                                a15 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.E(a15);
                                break;
                            case 30:
                                a16 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.r(a16);
                                o7 = o(V);
                                obj = gs3.c(c7, a16, o7, obj, ws3Var);
                                break;
                            case 31:
                                a17 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.H(a17);
                                break;
                            case 32:
                                a18 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.F(a18);
                                break;
                            case 33:
                                a19 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.z(a19);
                                break;
                            case 34:
                                a20 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.p(a20);
                                break;
                            case 35:
                                a7 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.x(a7);
                                break;
                            case 36:
                                a8 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.K(a8);
                                break;
                            case 37:
                                a9 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.t(a9);
                                break;
                            case 38:
                                a10 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.w(a10);
                                break;
                            case 39:
                                a11 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.B(a11);
                                break;
                            case 40:
                                a12 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.v(a12);
                                break;
                            case 41:
                                a13 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.J(a13);
                                break;
                            case 42:
                                a14 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.G(a14);
                                break;
                            case 43:
                                a15 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.E(a15);
                                break;
                            case 44:
                                a16 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.r(a16);
                                o7 = o(V);
                                obj = gs3.c(c7, a16, o7, obj, ws3Var);
                                break;
                            case 45:
                                a17 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.H(a17);
                                break;
                            case 46:
                                a18 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.F(a18);
                                break;
                            case 47:
                                a19 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.z(a19);
                                break;
                            case 48:
                                a20 = this.f9268l.a(t6, m7 & 1048575);
                                wr3Var.p(a20);
                                break;
                            case 49:
                                wr3Var.C(this.f9268l.a(t6, m7 & 1048575), p(V), mp3Var);
                                break;
                            case 50:
                                Object r7 = r(V);
                                long m8 = m(V) & 1048575;
                                Object p7 = gt3.p(t6, m8);
                                if (p7 == null) {
                                    p7 = er3.a().d();
                                    gt3.D(t6, m8, p7);
                                } else if (fr3.b(p7)) {
                                    Object d7 = er3.a().d();
                                    fr3.c(d7, p7);
                                    gt3.D(t6, m8, d7);
                                    p7 = d7;
                                }
                                throw null;
                                break;
                            case 51:
                                gt3.D(t6, m7 & 1048575, Double.valueOf(wr3Var.zza()));
                                x(t6, c7, V);
                                break;
                            case 52:
                                gt3.D(t6, m7 & 1048575, Float.valueOf(wr3Var.a()));
                                x(t6, c7, V);
                                break;
                            case 53:
                                gt3.D(t6, m7 & 1048575, Long.valueOf(wr3Var.k()));
                                x(t6, c7, V);
                                break;
                            case 54:
                                gt3.D(t6, m7 & 1048575, Long.valueOf(wr3Var.n()));
                                x(t6, c7, V);
                                break;
                            case 55:
                                gt3.D(t6, m7 & 1048575, Integer.valueOf(wr3Var.e()));
                                x(t6, c7, V);
                                break;
                            case 56:
                                gt3.D(t6, m7 & 1048575, Long.valueOf(wr3Var.j()));
                                x(t6, c7, V);
                                break;
                            case 57:
                                gt3.D(t6, m7 & 1048575, Integer.valueOf(wr3Var.d()));
                                x(t6, c7, V);
                                break;
                            case 58:
                                gt3.D(t6, m7 & 1048575, Boolean.valueOf(wr3Var.P()));
                                x(t6, c7, V);
                                break;
                            case 59:
                                v(t6, m7, wr3Var);
                                x(t6, c7, V);
                                break;
                            case 60:
                                int i7 = m7 & 1048575;
                                if (D(t6, c7, V)) {
                                    long j8 = i7;
                                    gt3.D(t6, j8, kq3.g(gt3.p(t6, j8), wr3Var.D(p(V), mp3Var)));
                                } else {
                                    gt3.D(t6, i7, wr3Var.D(p(V), mp3Var));
                                    w(t6, V);
                                }
                                x(t6, c7, V);
                                break;
                            case 61:
                                gt3.D(t6, m7 & 1048575, wr3Var.l());
                                x(t6, c7, V);
                                break;
                            case 62:
                                gt3.D(t6, m7 & 1048575, Integer.valueOf(wr3Var.i()));
                                x(t6, c7, V);
                                break;
                            case 63:
                                b7 = wr3Var.b();
                                eq3 o9 = o(V);
                                if (o9 != null && !o9.d(b7)) {
                                    obj = gs3.d(c7, b7, obj, ws3Var);
                                    break;
                                }
                                gt3.D(t6, m7 & 1048575, Integer.valueOf(b7));
                                x(t6, c7, V);
                                break;
                            case 64:
                                gt3.D(t6, m7 & 1048575, Integer.valueOf(wr3Var.f()));
                                x(t6, c7, V);
                                break;
                            case 65:
                                gt3.D(t6, m7 & 1048575, Long.valueOf(wr3Var.o()));
                                x(t6, c7, V);
                                break;
                            case 66:
                                gt3.D(t6, m7 & 1048575, Integer.valueOf(wr3Var.h()));
                                x(t6, c7, V);
                                break;
                            case 67:
                                gt3.D(t6, m7 & 1048575, Long.valueOf(wr3Var.m()));
                                x(t6, c7, V);
                                break;
                            case 68:
                                gt3.D(t6, m7 & 1048575, wr3Var.I(p(V), mp3Var));
                                x(t6, c7, V);
                                break;
                            default:
                                if (obj == null) {
                                    obj = ws3Var.f();
                                }
                                if (!ws3Var.p(obj, wr3Var)) {
                                    for (int i8 = this.f9266j; i8 < this.f9267k; i8++) {
                                        obj = q(t6, this.f9265i[i8], obj, ws3Var);
                                    }
                                    if (obj != null) {
                                        ws3Var.n(t6, obj);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (lq3 unused) {
                        ws3Var.q(wr3Var);
                        if (obj == null) {
                            obj = ws3Var.c(t6);
                        }
                        if (!ws3Var.p(obj, wr3Var)) {
                            for (int i9 = this.f9266j; i9 < this.f9267k; i9++) {
                                obj = q(t6, this.f9265i[i9], obj, ws3Var);
                            }
                            if (obj != null) {
                                ws3Var.n(t6, obj);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (c7 == Integer.MAX_VALUE) {
                        for (int i10 = this.f9266j; i10 < this.f9267k; i10++) {
                            obj = q(t6, this.f9265i[i10], obj, ws3Var);
                        }
                        if (obj != null) {
                            ws3Var.n(t6, obj);
                            return;
                        }
                        return;
                    }
                    Object c8 = !this.f9262f ? null : np3Var.c(mp3Var, this.f9261e, c7);
                    if (c8 != null) {
                        if (sp3Var == null) {
                            sp3Var = np3Var.b(t6);
                        }
                        sp3<?> sp3Var2 = sp3Var;
                        obj = np3Var.d(wr3Var, c8, mp3Var, sp3Var2, obj, ws3Var);
                        sp3Var = sp3Var2;
                    } else {
                        ws3Var.q(wr3Var);
                        if (obj == null) {
                            obj = ws3Var.c(t6);
                        }
                        if (!ws3Var.p(obj, wr3Var)) {
                            for (int i11 = this.f9266j; i11 < this.f9267k; i11++) {
                                obj = q(t6, this.f9265i[i11], obj, ws3Var);
                            }
                            if (obj != null) {
                                ws3Var.n(t6, obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i12 = this.f9266j; i12 < this.f9267k; i12++) {
                    obj = q(t6, this.f9265i[i12], obj, ws3Var);
                }
                if (obj != null) {
                    ws3Var.n(t6, obj);
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.es3
    public final void f(T t6, T t7) {
        Objects.requireNonNull(t7);
        for (int i7 = 0; i7 < this.f9257a.length; i7 += 3) {
            int m7 = m(i7);
            long j7 = 1048575 & m7;
            int i8 = this.f9257a[i7];
            switch (l(m7)) {
                case 0:
                    if (A(t7, i7)) {
                        gt3.z(t6, j7, gt3.j(t7, j7));
                        w(t6, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (A(t7, i7)) {
                        gt3.A(t6, j7, gt3.k(t7, j7));
                        w(t6, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!A(t7, i7)) {
                        break;
                    }
                    gt3.C(t6, j7, gt3.n(t7, j7));
                    w(t6, i7);
                    break;
                case 3:
                    if (!A(t7, i7)) {
                        break;
                    }
                    gt3.C(t6, j7, gt3.n(t7, j7));
                    w(t6, i7);
                    break;
                case 4:
                    if (!A(t7, i7)) {
                        break;
                    }
                    gt3.B(t6, j7, gt3.l(t7, j7));
                    w(t6, i7);
                    break;
                case 5:
                    if (!A(t7, i7)) {
                        break;
                    }
                    gt3.C(t6, j7, gt3.n(t7, j7));
                    w(t6, i7);
                    break;
                case 6:
                    if (!A(t7, i7)) {
                        break;
                    }
                    gt3.B(t6, j7, gt3.l(t7, j7));
                    w(t6, i7);
                    break;
                case c4.w0.f2149o /* 7 */:
                    if (A(t7, i7)) {
                        gt3.x(t6, j7, gt3.H(t7, j7));
                        w(t6, i7);
                        break;
                    } else {
                        break;
                    }
                case c4.w0.f2150p /* 8 */:
                    if (!A(t7, i7)) {
                        break;
                    }
                    gt3.D(t6, j7, gt3.p(t7, j7));
                    w(t6, i7);
                    break;
                case 9:
                case 17:
                    t(t6, t7, i7);
                    break;
                case 10:
                    if (!A(t7, i7)) {
                        break;
                    }
                    gt3.D(t6, j7, gt3.p(t7, j7));
                    w(t6, i7);
                    break;
                case 11:
                    if (!A(t7, i7)) {
                        break;
                    }
                    gt3.B(t6, j7, gt3.l(t7, j7));
                    w(t6, i7);
                    break;
                case 12:
                    if (!A(t7, i7)) {
                        break;
                    }
                    gt3.B(t6, j7, gt3.l(t7, j7));
                    w(t6, i7);
                    break;
                case 13:
                    if (!A(t7, i7)) {
                        break;
                    }
                    gt3.B(t6, j7, gt3.l(t7, j7));
                    w(t6, i7);
                    break;
                case 14:
                    if (!A(t7, i7)) {
                        break;
                    }
                    gt3.C(t6, j7, gt3.n(t7, j7));
                    w(t6, i7);
                    break;
                case 15:
                    if (!A(t7, i7)) {
                        break;
                    }
                    gt3.B(t6, j7, gt3.l(t7, j7));
                    w(t6, i7);
                    break;
                case 16:
                    if (!A(t7, i7)) {
                        break;
                    }
                    gt3.C(t6, j7, gt3.n(t7, j7));
                    w(t6, i7);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f9268l.c(t6, t7, j7);
                    break;
                case 50:
                    gs3.i(this.f9272p, t6, t7, j7);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!D(t7, i8, i7)) {
                        break;
                    }
                    gt3.D(t6, j7, gt3.p(t7, j7));
                    x(t6, i8, i7);
                    break;
                case 60:
                case 68:
                    u(t6, t7, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!D(t7, i8, i7)) {
                        break;
                    }
                    gt3.D(t6, j7, gt3.p(t7, j7));
                    x(t6, i8, i7);
                    break;
            }
        }
        gs3.f(this.f9269m, t6, t7);
        if (this.f9262f) {
            gs3.e(this.f9270n, t6, t7);
        }
    }

    @Override // com.google.android.gms.internal.ads.es3
    public final void g(T t6, ip3 ip3Var) {
        double j7;
        float k7;
        long n7;
        long n8;
        int l7;
        long n9;
        int l8;
        boolean H;
        int l9;
        int l10;
        int l11;
        long n10;
        int l12;
        long n11;
        if (!this.f9264h) {
            F(t6, ip3Var);
            return;
        }
        if (this.f9262f) {
            this.f9270n.a(t6);
            throw null;
        }
        int length = this.f9257a.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int m7 = m(i7);
            int i8 = this.f9257a[i7];
            switch (l(m7)) {
                case 0:
                    if (A(t6, i7)) {
                        j7 = gt3.j(t6, m7 & 1048575);
                        ip3Var.q(i8, j7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (A(t6, i7)) {
                        k7 = gt3.k(t6, m7 & 1048575);
                        ip3Var.z(i8, k7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (A(t6, i7)) {
                        n7 = gt3.n(t6, m7 & 1048575);
                        ip3Var.E(i8, n7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (A(t6, i7)) {
                        n8 = gt3.n(t6, m7 & 1048575);
                        ip3Var.j(i8, n8);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (A(t6, i7)) {
                        l7 = gt3.l(t6, m7 & 1048575);
                        ip3Var.C(i8, l7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (A(t6, i7)) {
                        n9 = gt3.n(t6, m7 & 1048575);
                        ip3Var.x(i8, n9);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (A(t6, i7)) {
                        l8 = gt3.l(t6, m7 & 1048575);
                        ip3Var.v(i8, l8);
                        break;
                    } else {
                        break;
                    }
                case c4.w0.f2149o /* 7 */:
                    if (A(t6, i7)) {
                        H = gt3.H(t6, m7 & 1048575);
                        ip3Var.m(i8, H);
                        break;
                    } else {
                        break;
                    }
                case c4.w0.f2150p /* 8 */:
                    if (!A(t6, i7)) {
                        break;
                    }
                    H(i8, gt3.p(t6, m7 & 1048575), ip3Var);
                    break;
                case 9:
                    if (!A(t6, i7)) {
                        break;
                    }
                    ip3Var.G(i8, gt3.p(t6, m7 & 1048575), p(i7));
                    break;
                case 10:
                    if (!A(t6, i7)) {
                        break;
                    }
                    ip3Var.o(i8, (uo3) gt3.p(t6, m7 & 1048575));
                    break;
                case 11:
                    if (A(t6, i7)) {
                        l9 = gt3.l(t6, m7 & 1048575);
                        ip3Var.h(i8, l9);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (A(t6, i7)) {
                        l10 = gt3.l(t6, m7 & 1048575);
                        ip3Var.t(i8, l10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (A(t6, i7)) {
                        l11 = gt3.l(t6, m7 & 1048575);
                        ip3Var.H(i8, l11);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (A(t6, i7)) {
                        n10 = gt3.n(t6, m7 & 1048575);
                        ip3Var.J(i8, n10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (A(t6, i7)) {
                        l12 = gt3.l(t6, m7 & 1048575);
                        ip3Var.a(i8, l12);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (A(t6, i7)) {
                        n11 = gt3.n(t6, m7 & 1048575);
                        ip3Var.c(i8, n11);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (!A(t6, i7)) {
                        break;
                    }
                    ip3Var.B(i8, gt3.p(t6, m7 & 1048575), p(i7));
                    break;
                case 18:
                    gs3.l(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, false);
                    break;
                case 19:
                    gs3.p(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, false);
                    break;
                case 20:
                    gs3.s(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, false);
                    break;
                case 21:
                    gs3.B(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, false);
                    break;
                case 22:
                    gs3.r(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, false);
                    break;
                case 23:
                    gs3.o(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, false);
                    break;
                case 24:
                    gs3.n(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, false);
                    break;
                case 25:
                    gs3.j(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, false);
                    break;
                case 26:
                    gs3.y(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var);
                    break;
                case 27:
                    gs3.t(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, p(i7));
                    break;
                case 28:
                    gs3.k(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var);
                    break;
                case 29:
                    gs3.z(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, false);
                    break;
                case 30:
                    gs3.m(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, false);
                    break;
                case 31:
                    gs3.u(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, false);
                    break;
                case 32:
                    gs3.v(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, false);
                    break;
                case 33:
                    gs3.w(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, false);
                    break;
                case 34:
                    gs3.x(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, false);
                    break;
                case 35:
                    gs3.l(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, true);
                    break;
                case 36:
                    gs3.p(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, true);
                    break;
                case 37:
                    gs3.s(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, true);
                    break;
                case 38:
                    gs3.B(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, true);
                    break;
                case 39:
                    gs3.r(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, true);
                    break;
                case 40:
                    gs3.o(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, true);
                    break;
                case 41:
                    gs3.n(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, true);
                    break;
                case 42:
                    gs3.j(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, true);
                    break;
                case 43:
                    gs3.z(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, true);
                    break;
                case 44:
                    gs3.m(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, true);
                    break;
                case 45:
                    gs3.u(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, true);
                    break;
                case 46:
                    gs3.v(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, true);
                    break;
                case 47:
                    gs3.w(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, true);
                    break;
                case 48:
                    gs3.x(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, true);
                    break;
                case 49:
                    gs3.q(this.f9257a[i7], (List) gt3.p(t6, m7 & 1048575), ip3Var, p(i7));
                    break;
                case 50:
                    G(ip3Var, i8, gt3.p(t6, m7 & 1048575), i7);
                    break;
                case 51:
                    if (D(t6, i8, i7)) {
                        j7 = M(t6, m7 & 1048575);
                        ip3Var.q(i8, j7);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (D(t6, i8, i7)) {
                        k7 = N(t6, m7 & 1048575);
                        ip3Var.z(i8, k7);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (D(t6, i8, i7)) {
                        n7 = n(t6, m7 & 1048575);
                        ip3Var.E(i8, n7);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (D(t6, i8, i7)) {
                        n8 = n(t6, m7 & 1048575);
                        ip3Var.j(i8, n8);
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (D(t6, i8, i7)) {
                        l7 = Q(t6, m7 & 1048575);
                        ip3Var.C(i8, l7);
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (D(t6, i8, i7)) {
                        n9 = n(t6, m7 & 1048575);
                        ip3Var.x(i8, n9);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (D(t6, i8, i7)) {
                        l8 = Q(t6, m7 & 1048575);
                        ip3Var.v(i8, l8);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (D(t6, i8, i7)) {
                        H = E(t6, m7 & 1048575);
                        ip3Var.m(i8, H);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!D(t6, i8, i7)) {
                        break;
                    }
                    H(i8, gt3.p(t6, m7 & 1048575), ip3Var);
                    break;
                case 60:
                    if (!D(t6, i8, i7)) {
                        break;
                    }
                    ip3Var.G(i8, gt3.p(t6, m7 & 1048575), p(i7));
                    break;
                case 61:
                    if (!D(t6, i8, i7)) {
                        break;
                    }
                    ip3Var.o(i8, (uo3) gt3.p(t6, m7 & 1048575));
                    break;
                case 62:
                    if (D(t6, i8, i7)) {
                        l9 = Q(t6, m7 & 1048575);
                        ip3Var.h(i8, l9);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (D(t6, i8, i7)) {
                        l10 = Q(t6, m7 & 1048575);
                        ip3Var.t(i8, l10);
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (D(t6, i8, i7)) {
                        l11 = Q(t6, m7 & 1048575);
                        ip3Var.H(i8, l11);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (D(t6, i8, i7)) {
                        n10 = n(t6, m7 & 1048575);
                        ip3Var.J(i8, n10);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (D(t6, i8, i7)) {
                        l12 = Q(t6, m7 & 1048575);
                        ip3Var.a(i8, l12);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (D(t6, i8, i7)) {
                        n11 = n(t6, m7 & 1048575);
                        ip3Var.c(i8, n11);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (!D(t6, i8, i7)) {
                        break;
                    }
                    ip3Var.B(i8, gt3.p(t6, m7 & 1048575), p(i7));
                    break;
            }
        }
        ws3<?, ?> ws3Var = this.f9269m;
        ws3Var.r(ws3Var.d(t6), ip3Var);
    }

    @Override // com.google.android.gms.internal.ads.es3
    public final void h(T t6, byte[] bArr, int i7, int i8, eo3 eo3Var) {
        if (this.f9264h) {
            T(t6, bArr, i7, i8, eo3Var);
        } else {
            I(t6, bArr, i7, i8, 0, eo3Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.es3
    public final boolean i(T t6, T t7) {
        int length = this.f9257a.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int m7 = m(i7);
            long j7 = m7 & 1048575;
            switch (l(m7)) {
                case 0:
                    if (y(t6, t7, i7) && Double.doubleToLongBits(gt3.j(t6, j7)) == Double.doubleToLongBits(gt3.j(t7, j7))) {
                        break;
                    }
                    return false;
                case 1:
                    if (y(t6, t7, i7) && Float.floatToIntBits(gt3.k(t6, j7)) == Float.floatToIntBits(gt3.k(t7, j7))) {
                        break;
                    }
                    return false;
                case 2:
                    if (y(t6, t7, i7) && gt3.n(t6, j7) == gt3.n(t7, j7)) {
                        break;
                    }
                    return false;
                case 3:
                    if (y(t6, t7, i7) && gt3.n(t6, j7) == gt3.n(t7, j7)) {
                        break;
                    }
                    return false;
                case 4:
                    if (y(t6, t7, i7) && gt3.l(t6, j7) == gt3.l(t7, j7)) {
                        break;
                    }
                    return false;
                case 5:
                    if (y(t6, t7, i7) && gt3.n(t6, j7) == gt3.n(t7, j7)) {
                        break;
                    }
                    return false;
                case 6:
                    if (y(t6, t7, i7) && gt3.l(t6, j7) == gt3.l(t7, j7)) {
                        break;
                    }
                    return false;
                case c4.w0.f2149o /* 7 */:
                    if (y(t6, t7, i7) && gt3.H(t6, j7) == gt3.H(t7, j7)) {
                        break;
                    }
                    return false;
                case c4.w0.f2150p /* 8 */:
                    if (y(t6, t7, i7) && gs3.h(gt3.p(t6, j7), gt3.p(t7, j7))) {
                        break;
                    }
                    return false;
                case 9:
                    if (y(t6, t7, i7) && gs3.h(gt3.p(t6, j7), gt3.p(t7, j7))) {
                        break;
                    }
                    return false;
                case 10:
                    if (y(t6, t7, i7) && gs3.h(gt3.p(t6, j7), gt3.p(t7, j7))) {
                        break;
                    }
                    return false;
                case 11:
                    if (y(t6, t7, i7) && gt3.l(t6, j7) == gt3.l(t7, j7)) {
                        break;
                    }
                    return false;
                case 12:
                    if (y(t6, t7, i7) && gt3.l(t6, j7) == gt3.l(t7, j7)) {
                        break;
                    }
                    return false;
                case 13:
                    if (y(t6, t7, i7) && gt3.l(t6, j7) == gt3.l(t7, j7)) {
                        break;
                    }
                    return false;
                case 14:
                    if (y(t6, t7, i7) && gt3.n(t6, j7) == gt3.n(t7, j7)) {
                        break;
                    }
                    return false;
                case 15:
                    if (y(t6, t7, i7) && gt3.l(t6, j7) == gt3.l(t7, j7)) {
                        break;
                    }
                    return false;
                case 16:
                    if (y(t6, t7, i7) && gt3.n(t6, j7) == gt3.n(t7, j7)) {
                        break;
                    }
                    return false;
                case 17:
                    if (y(t6, t7, i7) && gs3.h(gt3.p(t6, j7), gt3.p(t7, j7))) {
                        break;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (!gs3.h(gt3.p(t6, j7), gt3.p(t7, j7))) {
                        return false;
                    }
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long X = X(i7) & 1048575;
                    if (gt3.l(t6, X) == gt3.l(t7, X) && gs3.h(gt3.p(t6, j7), gt3.p(t7, j7))) {
                        break;
                    }
                    return false;
            }
        }
        if (!this.f9269m.d(t6).equals(this.f9269m.d(t7))) {
            return false;
        }
        if (!this.f9262f) {
            return true;
        }
        this.f9270n.a(t6);
        this.f9270n.a(t7);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.es3
    public final boolean j(T t6) {
        int i7;
        int i8;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.f9266j) {
            int i12 = this.f9265i[i11];
            int i13 = this.f9257a[i12];
            int m7 = m(i12);
            int i14 = this.f9257a[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i9) {
                if (i15 != 1048575) {
                    i10 = f9256r.getInt(t6, i15);
                }
                i8 = i10;
                i7 = i15;
            } else {
                i7 = i9;
                i8 = i10;
            }
            if ((268435456 & m7) != 0 && !B(t6, i12, i7, i8, i16)) {
                return false;
            }
            int l7 = l(m7);
            if (l7 != 9 && l7 != 17) {
                if (l7 != 27) {
                    if (l7 == 60 || l7 == 68) {
                        if (D(t6, i13, i12) && !C(t6, m7, p(i12))) {
                            return false;
                        }
                    } else if (l7 != 49) {
                        if (l7 == 50 && !((er3) gt3.p(t6, m7 & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) gt3.p(t6, m7 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    es3 p7 = p(i12);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!p7.j(list.get(i17))) {
                            return false;
                        }
                    }
                }
            } else if (B(t6, i12, i7, i8, i16) && !C(t6, m7, p(i12))) {
                return false;
            }
            i11++;
            i9 = i7;
            i10 = i8;
        }
        if (!this.f9262f) {
            return true;
        }
        this.f9270n.a(t6);
        throw null;
    }
}
