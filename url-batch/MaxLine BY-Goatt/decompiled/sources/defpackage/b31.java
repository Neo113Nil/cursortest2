package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b31 extends iv implements Runnable, iu1, View.OnAttachStateChangeListener {
    public final i83 o;
    public boolean p;
    public boolean q;
    public c83 r;

    public b31(i83 i83Var) {
        super(!i83Var.r ? 1 : 0);
        this.o = i83Var;
    }

    @Override // defpackage.iu1
    public final c83 a(View view, c83 c83Var) {
        this.r = c83Var;
        i83 i83Var = this.o;
        s33 s33Var = i83Var.p;
        z73 z73Var = c83Var.a;
        s33Var.f(mh2.r(z73Var.h(8)));
        if (this.p) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.q) {
            i83Var.q.f(mh2.r(z73Var.h(8)));
            i83.a(i83Var, c83Var);
        }
        return i83Var.r ? c83.b : c83Var;
    }

    @Override // defpackage.iv
    public final void e(i73 i73Var) {
        this.p = false;
        this.q = false;
        c83 c83Var = this.r;
        if (i73Var.a.b() != 0 && c83Var != null) {
            z73 z73Var = c83Var.a;
            i83 i83Var = this.o;
            i83Var.q.f(mh2.r(z73Var.h(8)));
            i83Var.p.f(mh2.r(z73Var.h(8)));
            i83.a(i83Var, c83Var);
        }
        this.r = null;
    }

    @Override // defpackage.iv
    public final void f(i73 i73Var) {
        this.p = true;
        this.q = true;
    }

    @Override // defpackage.iv
    public final c83 g(c83 c83Var, List list) {
        i83 i83Var = this.o;
        i83.a(i83Var, c83Var);
        return i83Var.r ? c83.b : c83Var;
    }

    @Override // defpackage.iv
    public final tt1 h(i73 i73Var, tt1 tt1Var) {
        this.p = false;
        return tt1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.p) {
            this.p = false;
            this.q = false;
            c83 c83Var = this.r;
            if (c83Var != null) {
                i83 i83Var = this.o;
                i83Var.q.f(mh2.r(c83Var.a.h(8)));
                i83.a(i83Var, c83Var);
                this.r = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
