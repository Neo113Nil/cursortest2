package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fse implements fsj {
    private final bd a;
    private final gzp b;
    private oc c;
    private oc d;
    private final Intent e;
    private final boolean f;
    private final boolean g;
    private final glu h;

    public fse(bd bdVar, glu gluVar, gzp gzpVar) {
        this.a = bdVar;
        this.h = gluVar;
        this.b = gzpVar;
        this.e = (Intent) gzpVar.a(new euy(new dvm(10), 8)).c(new fsd(1));
        this.f = ((Boolean) gzpVar.a(new euy(new dvm(11), 9)).c(new fsd(0))).booleanValue();
        ((Boolean) gzpVar.a(new euy(new dvm(12), 10)).c(new fsd(2))).booleanValue();
        this.g = gluVar.a().X();
    }

    @Override // defpackage.fsj
    public final Intent a() {
        return this.e;
    }

    @Override // defpackage.fsj
    public final oc b() {
        if (!this.b.f()) {
            throw new UnsupportedOperationException("@ScreenFragment in FragmentHost cannot start Activities");
        }
        oc ocVar = this.d;
        if (ocVar != null) {
            return ocVar;
        }
        ksp.a("_requirementActivityLauncher");
        return null;
    }

    @Override // defpackage.fsj
    public final oc c() {
        if (!this.b.f()) {
            throw new UnsupportedOperationException("@ScreenFragment in FragmentHost cannot start Activities");
        }
        oc ocVar = this.c;
        if (ocVar != null) {
            return ocVar;
        }
        ksp.a("_switchAccountActivityLauncher");
        return null;
    }

    @Override // defpackage.fsj
    public final void d(ob obVar, ob obVar2) {
        if (this.b.f()) {
            bd bdVar = this.a;
            this.c = bdVar.K(new om(), obVar);
            this.d = bdVar.K(new om(), obVar2);
        }
    }

    @Override // defpackage.fsj
    public final boolean e() {
        return this.b.f();
    }

    @Override // defpackage.fsj
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.fsj
    public final boolean g() {
        return this.g;
    }
}
