package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fsc implements fsj {
    private final glu a;

    public fsc(glu gluVar) {
        this.a = gluVar;
    }

    @Override // defpackage.fsj
    public final Intent a() {
        return new Intent();
    }

    @Override // defpackage.fsj
    public final oc b() {
        throw new UnsupportedOperationException("FragmentHosts cannot start Activities");
    }

    @Override // defpackage.fsj
    public final oc c() {
        throw new UnsupportedOperationException("FragmentHosts cannot start Activities");
    }

    @Override // defpackage.fsj
    public final boolean e() {
        return false;
    }

    @Override // defpackage.fsj
    public final boolean f() {
        return false;
    }

    @Override // defpackage.fsj
    public final boolean g() {
        return this.a.a().X();
    }

    @Override // defpackage.fsj
    public final void d(ob obVar, ob obVar2) {
    }
}
