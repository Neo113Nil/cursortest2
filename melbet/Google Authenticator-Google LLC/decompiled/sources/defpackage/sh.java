package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sh extends sd {
    private boolean at;
    public float a = -1.0f;
    public int b = -1;
    public int c = -1;
    public sc d = this.L;
    public int as = 0;

    public sh() {
        this.T.clear();
        this.T.add(this.d);
        int length = this.S.length;
        for (int i = 0; i < 6; i++) {
            this.S[i] = this.d;
        }
    }

    @Override // defpackage.sd
    public final sc M(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                }
            }
            if (this.as != 0) {
                return null;
            }
            return this.d;
        }
        if (this.as != 1) {
            return null;
        }
        return this.d;
    }

    @Override // defpackage.sd
    public final void U(boolean z) {
        if (this.V == null) {
            return;
        }
        int o = rv.o(this.d);
        if (this.as == 1) {
            this.aa = o;
            this.ab = 0;
            z(this.V.h());
            E(0);
            return;
        }
        this.aa = 0;
        this.ab = o;
        E(this.V.j());
        z(0);
    }

    public final void a(int i) {
        this.d.f(i);
        this.at = true;
    }

    @Override // defpackage.sd
    public final void b(rv rvVar, boolean z) {
        sd sdVar = this.V;
        if (sdVar == null) {
            return;
        }
        Object M = sdVar.M(2);
        Object M2 = sdVar.M(4);
        sd sdVar2 = this.V;
        boolean z2 = sdVar2 != null && sdVar2.ar[0] == 2;
        if (this.as == 0) {
            M = sdVar.M(3);
            M2 = sdVar.M(5);
            z2 = sdVar2 != null && sdVar2.ar[1] == 2;
        }
        if (this.at) {
            sc scVar = this.d;
            if (scVar.c) {
                ry b = rvVar.b(scVar);
                rvVar.f(b, this.d.a());
                if (this.b != -1) {
                    if (z2) {
                        rvVar.g(rvVar.b(M2), b, 0, 5);
                    }
                } else if (this.c != -1 && z2) {
                    ry b2 = rvVar.b(M2);
                    rvVar.g(b, rvVar.b(M), 0, 5);
                    rvVar.g(b2, b, 0, 5);
                }
                this.at = false;
                return;
            }
        }
        if (this.b != -1) {
            ry b3 = rvVar.b(this.d);
            rvVar.m(b3, rvVar.b(M), this.b, 8);
            if (z2) {
                rvVar.g(rvVar.b(M2), b3, 0, 5);
                return;
            }
            return;
        }
        if (this.c != -1) {
            ry b4 = rvVar.b(this.d);
            ry b5 = rvVar.b(M2);
            rvVar.m(b4, b5, -this.c, 8);
            if (z2) {
                rvVar.g(b4, rvVar.b(M), 0, 5);
                rvVar.g(b5, b4, 0, 5);
                return;
            }
            return;
        }
        if (this.a != -1.0f) {
            ry b6 = rvVar.b(this.d);
            ry b7 = rvVar.b(M2);
            float f = this.a;
            ru a = rvVar.a();
            a.e.g(b6, -1.0f);
            a.e.g(b7, f);
            rvVar.e(a);
        }
    }

    public final void c(int i) {
        sc scVar;
        if (this.as == i) {
            return;
        }
        this.as = i;
        ArrayList arrayList = this.T;
        arrayList.clear();
        if (this.as == 1) {
            scVar = this.K;
            this.d = scVar;
        } else {
            scVar = this.L;
            this.d = scVar;
        }
        arrayList.add(scVar);
        sc[] scVarArr = this.S;
        int length = scVarArr.length;
        for (int i2 = 0; i2 < 6; i2++) {
            scVarArr[i2] = this.d;
        }
    }

    @Override // defpackage.sd
    public final boolean d() {
        return true;
    }

    @Override // defpackage.sd
    public final boolean e() {
        return this.at;
    }

    @Override // defpackage.sd
    public final boolean f() {
        return this.at;
    }
}
