package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zh extends zn {
    final WindowInsets.Builder a;

    public zh(zz zzVar) {
        super(zzVar);
        WindowInsets e = zzVar.e();
        this.a = e != null ? new WindowInsets.Builder(e) : new WindowInsets.Builder();
    }

    @Override // defpackage.zn
    public zz a() {
        WindowInsets build;
        i();
        build = this.a.build();
        zz q = zz.q(build, null);
        q.s(this.b);
        q.x();
        q.u(this.c);
        q.v(this.d);
        return q;
    }

    @Override // defpackage.zn
    public void b(vb vbVar) {
        this.a.setStableInsets(vbVar.a());
    }

    @Override // defpackage.zn
    public void c(vb vbVar) {
        this.a.setSystemWindowInsets(vbVar.a());
    }

    @Override // defpackage.zn
    public void d(vb vbVar) {
        this.a.setMandatorySystemGestureInsets(vbVar.a());
    }

    @Override // defpackage.zn
    public void e(vb vbVar) {
        this.a.setSystemGestureInsets(vbVar.a());
    }

    @Override // defpackage.zn
    public void f(vb vbVar) {
        this.a.setTappableElementInsets(vbVar.a());
    }

    public zh() {
        this.a = new WindowInsets.Builder();
    }
}
