package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmx implements gkf, gxr, jrp {
    final jsb a;
    final jsb b;
    final jsb c;
    final jsb d;
    private final Activity e;
    private final bnl f;
    private final bnk g;
    private final bmy h;
    private final bmx i = this;

    public bmx(bnl bnlVar, bnk bnkVar, bmy bmyVar, Activity activity, glu gluVar) {
        this.f = bnlVar;
        this.g = bnkVar;
        this.h = bmyVar;
        this.e = activity;
        jrw c = jrx.c(activity);
        this.a = c;
        this.b = new jrh(c, 1);
        this.c = new gcn(c, 15);
        this.d = jrx.c(gluVar);
    }

    public final Activity a() {
        Activity activity = this.e;
        hnu.bd(activity);
        return activity;
    }

    @Override // defpackage.gkf
    public final bnw b() {
        return new bnw(this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.gxr
    public final brn c() {
        return new brn((gva) this.g.C.b(), (byte[]) null);
    }

    public final brn d() {
        return new brn((gva) this.g.C.b(), (byte[]) null);
    }
}
