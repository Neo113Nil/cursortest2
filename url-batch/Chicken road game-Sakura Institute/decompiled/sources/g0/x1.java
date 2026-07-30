package g0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final y1 f3958a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3959b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3960c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f3961d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3962e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3963f;

    /* renamed from: g, reason: collision with root package name */
    public int f3964g;

    /* renamed from: h, reason: collision with root package name */
    public int f3965h;

    /* renamed from: i, reason: collision with root package name */
    public int f3966i;

    /* renamed from: j, reason: collision with root package name */
    public final m0 f3967j;

    /* renamed from: k, reason: collision with root package name */
    public int f3968k;

    /* renamed from: l, reason: collision with root package name */
    public int f3969l;

    /* renamed from: m, reason: collision with root package name */
    public int f3970m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3971n;

    public x1(y1 y1Var) {
        this.f3958a = y1Var;
        this.f3959b = y1Var.f3974f;
        int i7 = y1Var.f3975g;
        this.f3960c = i7;
        this.f3961d = y1Var.f3976h;
        this.f3962e = y1Var.f3977i;
        this.f3965h = i7;
        this.f3966i = -1;
        this.f3967j = new m0();
    }

    public final c a(int i7) {
        ArrayList arrayList = this.f3958a.f3981m;
        int P = d.P(arrayList, i7, this.f3960c);
        if (P >= 0) {
            return (c) arrayList.get(P);
        }
        c cVar = new c(i7);
        arrayList.add(-(P + 1), cVar);
        return cVar;
    }

    public final Object b(int[] iArr, int i7) {
        int i8;
        if (!d.k(iArr, i7)) {
            return l.f3784a;
        }
        int i9 = i7 * 5;
        if (i9 >= iArr.length) {
            i8 = iArr.length;
        } else {
            int i10 = iArr[i9 + 4];
            int i11 = 1;
            switch (iArr[i9 + 1] >> 29) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    i11 = 0;
                    break;
                case 1:
                case 2:
                case 4:
                    break;
                case 3:
                case 5:
                case 6:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
            i8 = i11 + i10;
        }
        return this.f3961d[i8];
    }

    public final void c() {
        int i7;
        this.f3963f = true;
        y1 y1Var = this.f3958a;
        y1Var.getClass();
        if (this.f3958a != y1Var || (i7 = y1Var.f3978j) <= 0) {
            d.w("Unexpected reader close()");
            throw null;
        }
        y1Var.f3978j = i7 - 1;
    }

    public final void d() {
        if (this.f3968k == 0) {
            if (!(this.f3964g == this.f3965h)) {
                d.w("endGroup() not called at the end of a group");
                throw null;
            }
            int i7 = this.f3966i;
            int[] iArr = this.f3959b;
            int p6 = d.p(iArr, i7);
            this.f3966i = p6;
            int i8 = this.f3960c;
            this.f3965h = p6 < 0 ? i8 : d.j(iArr, p6) + p6;
            int a3 = this.f3967j.a();
            if (a3 < 0) {
                this.f3969l = 0;
                this.f3970m = 0;
            } else {
                this.f3969l = a3;
                this.f3970m = p6 >= i8 - 1 ? this.f3962e : d.i(iArr, p6 + 1);
            }
        }
    }

    public final Object e() {
        int i7 = this.f3964g;
        if (i7 < this.f3965h) {
            return b(this.f3959b, i7);
        }
        return 0;
    }

    public final int f() {
        int i7 = this.f3964g;
        if (i7 >= this.f3965h) {
            return 0;
        }
        return this.f3959b[i7 * 5];
    }

    public final Object g(int i7, int i8) {
        int[] iArr = this.f3959b;
        int r8 = d.r(iArr, i7);
        int i9 = i7 + 1;
        int i10 = r8 + i8;
        return i10 < (i9 < this.f3960c ? iArr[(i9 * 5) + 4] : this.f3962e) ? this.f3961d[i10] : l.f3784a;
    }

    public final Object h() {
        int i7;
        if (this.f3968k > 0 || (i7 = this.f3969l) >= this.f3970m) {
            this.f3971n = false;
            return l.f3784a;
        }
        this.f3971n = true;
        this.f3969l = i7 + 1;
        return this.f3961d[i7];
    }

    public final Object i(int i7) {
        int[] iArr = this.f3959b;
        if (!d.m(iArr, i7)) {
            return null;
        }
        if (!d.m(iArr, i7)) {
            return l.f3784a;
        }
        return this.f3961d[iArr[(i7 * 5) + 4]];
    }

    public final Object j(int[] iArr, int i7) {
        if (!d.l(iArr, i7)) {
            return null;
        }
        int i8 = i7 * 5;
        int i9 = iArr[i8 + 4];
        int i10 = 1;
        switch (iArr[i8 + 1] >> 30) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i10 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case 5:
            case 6:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        return this.f3961d[i10 + i9];
    }

    public final void k(int i7) {
        if (!(this.f3968k == 0)) {
            d.w("Cannot reposition while in an empty region");
            throw null;
        }
        this.f3964g = i7;
        int[] iArr = this.f3959b;
        int i8 = this.f3960c;
        int p6 = i7 < i8 ? d.p(iArr, i7) : -1;
        this.f3966i = p6;
        if (p6 < 0) {
            this.f3965h = i8;
        } else {
            this.f3965h = d.j(iArr, p6) + p6;
        }
        this.f3969l = 0;
        this.f3970m = 0;
    }

    public final int l() {
        if (!(this.f3968k == 0)) {
            d.w("Cannot skip while in an empty region");
            throw null;
        }
        int i7 = this.f3964g;
        int[] iArr = this.f3959b;
        int o2 = d.m(iArr, i7) ? 1 : d.o(iArr, this.f3964g);
        int i8 = this.f3964g;
        this.f3964g = d.j(iArr, i8) + i8;
        return o2;
    }

    public final void m() {
        if (!(this.f3968k == 0)) {
            d.w("Cannot skip the enclosing group while in an empty region");
            throw null;
        }
        this.f3964g = this.f3965h;
        this.f3969l = 0;
        this.f3970m = 0;
    }

    public final void n() {
        if (this.f3968k <= 0) {
            int i7 = this.f3966i;
            int i8 = this.f3964g;
            int[] iArr = this.f3959b;
            if (!(d.p(iArr, i8) == i7)) {
                d.R("Invalid slot table detected");
                throw null;
            }
            int i9 = this.f3969l;
            int i10 = this.f3970m;
            m0 m0Var = this.f3967j;
            if (i9 == 0 && i10 == 0) {
                m0Var.b(-1);
            } else {
                m0Var.b(i9);
            }
            this.f3966i = i8;
            this.f3965h = d.j(iArr, i8) + i8;
            int i11 = i8 + 1;
            this.f3964g = i11;
            this.f3969l = d.r(iArr, i8);
            this.f3970m = i8 >= this.f3960c - 1 ? this.f3962e : d.i(iArr, i11);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f3964g);
        sb.append(", key=");
        sb.append(f());
        sb.append(", parent=");
        sb.append(this.f3966i);
        sb.append(", end=");
        return a0.m.l(sb, this.f3965h, ')');
    }
}
