package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: f, reason: collision with root package name */
    public static final i1 f843f = new i1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f844a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f845b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f846c;

    /* renamed from: d, reason: collision with root package name */
    public int f847d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f848e;

    public i1(int i7, int[] iArr, Object[] objArr, boolean z8) {
        this.f844a = i7;
        this.f845b = iArr;
        this.f846c = objArr;
        this.f848e = z8;
    }

    public final void a(int i7) {
        int[] iArr = this.f845b;
        if (i7 > iArr.length) {
            int i8 = this.f844a;
            int i9 = (i8 / 2) + i8;
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f845b = Arrays.copyOf(iArr, i7);
            this.f846c = Arrays.copyOf(this.f846c, i7);
        }
    }

    public final int b() {
        int s5;
        int u8;
        int o2;
        int i7 = this.f847d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f844a; i9++) {
            int i10 = this.f845b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 == 1) {
                    ((Long) this.f846c[i9]).getClass();
                    o2 = l.o(i11);
                } else if (i12 == 2) {
                    o2 = l.l(i11, (g) this.f846c[i9]);
                } else if (i12 == 3) {
                    s5 = l.s(i11) * 2;
                    u8 = ((i1) this.f846c[i9]).b();
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException(z.b());
                    }
                    ((Integer) this.f846c[i9]).getClass();
                    o2 = l.n(i11);
                }
                i8 = o2 + i8;
            } else {
                long longValue = ((Long) this.f846c[i9]).longValue();
                s5 = l.s(i11);
                u8 = l.u(longValue);
            }
            i8 = u8 + s5 + i8;
        }
        this.f847d = i8;
        return i8;
    }

    public final void c(int i7, Object obj) {
        if (!this.f848e) {
            throw new UnsupportedOperationException();
        }
        a(this.f844a + 1);
        int[] iArr = this.f845b;
        int i8 = this.f844a;
        iArr[i8] = i7;
        this.f846c[i8] = obj;
        this.f844a = i8 + 1;
    }

    public final void d(h0 h0Var) {
        if (this.f844a == 0) {
            return;
        }
        h0Var.getClass();
        l lVar = (l) h0Var.f831a;
        for (int i7 = 0; i7 < this.f844a; i7++) {
            int i8 = this.f845b[i7];
            Object obj = this.f846c[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 == 0) {
                lVar.O(((Long) obj).longValue(), i9);
            } else if (i10 == 1) {
                lVar.E(((Long) obj).longValue(), i9);
            } else if (i10 == 2) {
                h0Var.a(i9, (g) obj);
            } else if (i10 == 3) {
                lVar.L(i9, 3);
                ((i1) obj).d(h0Var);
                lVar.L(i9, 4);
            } else {
                if (i10 != 5) {
                    throw new RuntimeException(z.b());
                }
                lVar.C(i9, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        int i7 = this.f844a;
        if (i7 == i1Var.f844a) {
            int[] iArr = this.f845b;
            int[] iArr2 = i1Var.f845b;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.f846c;
                    Object[] objArr2 = i1Var.f846c;
                    int i9 = this.f844a;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
                if (iArr[i8] != iArr2[i8]) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f844a;
        int i8 = (527 + i7) * 31;
        int[] iArr = this.f845b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i8 + i10) * 31;
        Object[] objArr = this.f846c;
        int i13 = this.f844a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }
}
