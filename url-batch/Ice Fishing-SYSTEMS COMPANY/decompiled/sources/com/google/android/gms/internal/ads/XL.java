package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class XL {

    /* renamed from: f, reason: collision with root package name */
    public static final XL f28633f = new XL(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f28634a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f28635b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f28636c;

    /* renamed from: d, reason: collision with root package name */
    public int f28637d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28638e;

    public XL(int i, int[] iArr, Object[] objArr, boolean z8) {
        this.f28634a = i;
        this.f28635b = iArr;
        this.f28636c = objArr;
        this.f28638e = z8;
    }

    public static XL a() {
        return new XL(0, new int[8], new Object[8], true);
    }

    public final void b(C2478Aq c2478Aq) {
        if (this.f28634a != 0) {
            for (int i = 0; i < this.f28634a; i++) {
                int i4 = this.f28635b[i];
                Object obj = this.f28636c[i];
                int i9 = i4 & 7;
                int i10 = i4 >>> 3;
                if (i9 == 0) {
                    ((XK) c2478Aq.f23905u).q(i10, ((Long) obj).longValue());
                } else if (i9 == 1) {
                    ((XK) c2478Aq.f23905u).r(i10, ((Long) obj).longValue());
                } else if (i9 == 2) {
                    ((XK) c2478Aq.f23905u).u(i10, (SK) obj);
                } else if (i9 == 3) {
                    ((XK) c2478Aq.f23905u).m(i10, 3);
                    ((XL) obj).b(c2478Aq);
                    ((XK) c2478Aq.f23905u).m(i10, 4);
                } else {
                    if (i9 != 5) {
                        throw new RuntimeException(new C3792qL());
                    }
                    ((XK) c2478Aq.f23905u).p(i10, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int j9;
        int k6;
        int j10;
        int i = this.f28637d;
        if (i != -1) {
            return i;
        }
        int i4 = 0;
        for (int i9 = 0; i9 < this.f28634a; i9++) {
            int i10 = this.f28635b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 == 1) {
                    ((Long) this.f28636c[i9]).getClass();
                    j10 = XK.j(i11 << 3) + 8;
                } else if (i12 == 2) {
                    int i13 = i11 << 3;
                    SK sk = (SK) this.f28636c[i9];
                    int j11 = XK.j(i13);
                    int f6 = sk.f();
                    i4 = CL.d(f6, f6, j11, i4);
                } else if (i12 == 3) {
                    int j12 = XK.j(i11 << 3);
                    j9 = j12 + j12;
                    k6 = ((XL) this.f28636c[i9]).c();
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException(new C3792qL());
                    }
                    ((Integer) this.f28636c[i9]).getClass();
                    j10 = XK.j(i11 << 3) + 4;
                }
                i4 = j10 + i4;
            } else {
                int i14 = i11 << 3;
                long longValue = ((Long) this.f28636c[i9]).longValue();
                j9 = XK.j(i14);
                k6 = XK.k(longValue);
            }
            i4 = k6 + j9 + i4;
        }
        this.f28637d = i4;
        return i4;
    }

    public final void d(int i, Object obj) {
        if (!this.f28638e) {
            throw new UnsupportedOperationException();
        }
        e(this.f28634a + 1);
        int[] iArr = this.f28635b;
        int i4 = this.f28634a;
        iArr[i4] = i;
        this.f28636c[i4] = obj;
        this.f28634a = i4 + 1;
    }

    public final void e(int i) {
        int[] iArr = this.f28635b;
        if (i > iArr.length) {
            int i4 = this.f28634a;
            int i9 = (i4 / 2) + i4;
            if (i9 >= i) {
                i = i9;
            }
            if (i < 8) {
                i = 8;
            }
            this.f28635b = Arrays.copyOf(iArr, i);
            this.f28636c = Arrays.copyOf(this.f28636c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof XL)) {
            return false;
        }
        XL xl = (XL) obj;
        int i = this.f28634a;
        if (i == xl.f28634a) {
            int[] iArr = this.f28635b;
            int[] iArr2 = xl.f28635b;
            int i4 = 0;
            while (true) {
                if (i4 >= i) {
                    Object[] objArr = this.f28636c;
                    Object[] objArr2 = xl.f28636c;
                    int i9 = this.f28634a;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
                if (iArr[i4] != iArr2[i4]) {
                    break;
                }
                i4++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f28634a;
        int i4 = i + 527;
        int[] iArr = this.f28635b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = ((i4 * 31) + i10) * 31;
        Object[] objArr = this.f28636c;
        int i13 = this.f28634a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }
}
