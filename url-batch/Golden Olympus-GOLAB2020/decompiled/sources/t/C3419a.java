package t;

import s.C3404d;
import t.C3423e;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3419a extends i {

    /* renamed from: y0, reason: collision with root package name */
    private int f46041y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f46042z0 = true;

    /* renamed from: A0, reason: collision with root package name */
    private int f46040A0 = 0;

    public boolean G0() {
        return this.f46042z0;
    }

    public int H0() {
        return this.f46041y0;
    }

    public int I0() {
        return this.f46040A0;
    }

    protected void J0() {
        for (int i4 = 0; i4 < this.f46195x0; i4++) {
            C3423e c3423e = this.f46194w0[i4];
            int i5 = this.f46041y0;
            if (i5 == 0 || i5 == 1) {
                c3423e.l0(0, true);
            } else if (i5 == 2 || i5 == 3) {
                c3423e.l0(1, true);
            }
        }
    }

    public void K0(boolean z4) {
        this.f46042z0 = z4;
    }

    public void L0(int i4) {
        this.f46041y0 = i4;
    }

    public void M0(int i4) {
        this.f46040A0 = i4;
    }

    @Override // t.C3423e
    public void f(C3404d c3404d) {
        C3422d[] c3422dArr;
        boolean z4;
        int i4;
        int i5;
        int i6;
        C3422d[] c3422dArr2 = this.f46093J;
        c3422dArr2[0] = this.f46085B;
        c3422dArr2[2] = this.f46086C;
        c3422dArr2[1] = this.f46087D;
        c3422dArr2[3] = this.f46088E;
        int i7 = 0;
        while (true) {
            c3422dArr = this.f46093J;
            if (i7 >= c3422dArr.length) {
                break;
            }
            C3422d c3422d = c3422dArr[i7];
            c3422d.f46071g = c3404d.q(c3422d);
            i7++;
        }
        int i8 = this.f46041y0;
        if (i8 < 0 || i8 >= 4) {
            return;
        }
        C3422d c3422d2 = c3422dArr[i8];
        for (int i9 = 0; i9 < this.f46195x0; i9++) {
            C3423e c3423e = this.f46194w0[i9];
            if ((this.f46042z0 || c3423e.g()) && ((((i5 = this.f46041y0) == 0 || i5 == 1) && c3423e.w() == C3423e.b.MATCH_CONSTRAINT && c3423e.f46085B.f46068d != null && c3423e.f46087D.f46068d != null) || (((i6 = this.f46041y0) == 2 || i6 == 3) && c3423e.K() == C3423e.b.MATCH_CONSTRAINT && c3423e.f46086C.f46068d != null && c3423e.f46088E.f46068d != null))) {
                z4 = true;
                break;
            }
        }
        z4 = false;
        boolean z5 = this.f46085B.h() || this.f46087D.h();
        boolean z6 = this.f46086C.h() || this.f46088E.h();
        int i10 = !(!z4 && (((i4 = this.f46041y0) == 0 && z5) || ((i4 == 2 && z6) || ((i4 == 1 && z5) || (i4 == 3 && z6))))) ? 4 : 5;
        for (int i11 = 0; i11 < this.f46195x0; i11++) {
            C3423e c3423e2 = this.f46194w0[i11];
            if (this.f46042z0 || c3423e2.g()) {
                s.i q4 = c3404d.q(c3423e2.f46093J[this.f46041y0]);
                C3422d[] c3422dArr3 = c3423e2.f46093J;
                int i12 = this.f46041y0;
                C3422d c3422d3 = c3422dArr3[i12];
                c3422d3.f46071g = q4;
                C3422d c3422d4 = c3422d3.f46068d;
                int i13 = (c3422d4 == null || c3422d4.f46066b != this) ? 0 : c3422d3.f46069e;
                if (i12 == 0 || i12 == 2) {
                    c3404d.i(c3422d2.f46071g, q4, this.f46040A0 - i13, z4);
                } else {
                    c3404d.g(c3422d2.f46071g, q4, this.f46040A0 + i13, z4);
                }
                c3404d.e(c3422d2.f46071g, q4, this.f46040A0 + i13, i10);
            }
        }
        int i14 = this.f46041y0;
        if (i14 == 0) {
            c3404d.e(this.f46087D.f46071g, this.f46085B.f46071g, 0, 8);
            c3404d.e(this.f46085B.f46071g, this.f46097N.f46087D.f46071g, 0, 4);
            c3404d.e(this.f46085B.f46071g, this.f46097N.f46085B.f46071g, 0, 0);
            return;
        }
        if (i14 == 1) {
            c3404d.e(this.f46085B.f46071g, this.f46087D.f46071g, 0, 8);
            c3404d.e(this.f46085B.f46071g, this.f46097N.f46085B.f46071g, 0, 4);
            c3404d.e(this.f46085B.f46071g, this.f46097N.f46087D.f46071g, 0, 0);
        } else if (i14 == 2) {
            c3404d.e(this.f46088E.f46071g, this.f46086C.f46071g, 0, 8);
            c3404d.e(this.f46086C.f46071g, this.f46097N.f46088E.f46071g, 0, 4);
            c3404d.e(this.f46086C.f46071g, this.f46097N.f46086C.f46071g, 0, 0);
        } else if (i14 == 3) {
            c3404d.e(this.f46086C.f46071g, this.f46088E.f46071g, 0, 8);
            c3404d.e(this.f46086C.f46071g, this.f46097N.f46086C.f46071g, 0, 4);
            c3404d.e(this.f46086C.f46071g, this.f46097N.f46088E.f46071g, 0, 0);
        }
    }

    @Override // t.C3423e
    public boolean g() {
        return true;
    }

    @Override // t.C3423e
    public String toString() {
        String str = "[Barrier] " + p() + " {";
        for (int i4 = 0; i4 < this.f46195x0; i4++) {
            C3423e c3423e = this.f46194w0[i4];
            if (i4 > 0) {
                str = str + ", ";
            }
            str = str + c3423e.p();
        }
        return str + "}";
    }
}
