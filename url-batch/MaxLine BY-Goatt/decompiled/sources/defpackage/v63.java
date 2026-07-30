package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v63 extends i3 implements dk1 {
    public final Context o;
    public final fk1 p;
    public t21 q;
    public WeakReference r;
    public final /* synthetic */ w63 s;

    public v63(w63 w63Var, Context context, t21 t21Var) {
        this.s = w63Var;
        this.o = context;
        this.q = t21Var;
        fk1 fk1Var = new fk1(context);
        fk1Var.l = 1;
        this.p = fk1Var;
        fk1Var.e = this;
    }

    @Override // defpackage.i3
    public final void a() {
        w63 w63Var = this.s;
        if (w63Var.i != this) {
            return;
        }
        if (w63Var.p) {
            w63Var.j = this;
            w63Var.k = this.q;
        } else {
            this.q.E(this);
        }
        this.q = null;
        w63Var.a(false);
        ActionBarContextView actionBarContextView = w63Var.f;
        if (actionBarContextView.w == null) {
            actionBarContextView.e();
        }
        w63Var.c.setHideOnContentScrollEnabled(w63Var.u);
        w63Var.i = null;
    }

    @Override // defpackage.i3
    public final View b() {
        WeakReference weakReference = this.r;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.i3
    public final fk1 c() {
        return this.p;
    }

    @Override // defpackage.i3
    public final MenuInflater d() {
        return new xq2(this.o);
    }

    @Override // defpackage.dk1
    public final boolean e(fk1 fk1Var, MenuItem menuItem) {
        t21 t21Var = this.q;
        if (t21Var != null) {
            return ((js0) t21Var.n).C(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.i3
    public final CharSequence f() {
        return this.s.f.getSubtitle();
    }

    @Override // defpackage.i3
    public final CharSequence g() {
        return this.s.f.getTitle();
    }

    @Override // defpackage.i3
    public final void h() {
        if (this.s.i != this) {
            return;
        }
        fk1 fk1Var = this.p;
        fk1Var.w();
        try {
            this.q.F(this, fk1Var);
        } finally {
            fk1Var.v();
        }
    }

    @Override // defpackage.i3
    public final boolean i() {
        return this.s.f.E;
    }

    @Override // defpackage.i3
    public final void j(View view) {
        this.s.f.setCustomView(view);
        this.r = new WeakReference(view);
    }

    @Override // defpackage.dk1
    public final void k(fk1 fk1Var) {
        if (this.q == null) {
            return;
        }
        h();
        e3 e3Var = this.s.f.p;
        if (e3Var != null) {
            e3Var.l();
        }
    }

    @Override // defpackage.i3
    public final void l(int i) {
        m(this.s.a.getResources().getString(i));
    }

    @Override // defpackage.i3
    public final void m(CharSequence charSequence) {
        this.s.f.setSubtitle(charSequence);
    }

    @Override // defpackage.i3
    public final void n(int i) {
        o(this.s.a.getResources().getString(i));
    }

    @Override // defpackage.i3
    public final void o(CharSequence charSequence) {
        this.s.f.setTitle(charSequence);
    }

    @Override // defpackage.i3
    public final void p(boolean z) {
        this.n = z;
        this.s.f.setTitleOptional(z);
    }
}
