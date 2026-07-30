package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class io2 extends i3 implements dk1 {
    public Context o;
    public ActionBarContextView p;
    public t21 q;
    public WeakReference r;
    public boolean s;
    public fk1 t;

    @Override // defpackage.i3
    public final void a() {
        if (this.s) {
            return;
        }
        this.s = true;
        this.q.E(this);
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
        return this.t;
    }

    @Override // defpackage.i3
    public final MenuInflater d() {
        return new xq2(this.p.getContext());
    }

    @Override // defpackage.dk1
    public final boolean e(fk1 fk1Var, MenuItem menuItem) {
        return ((js0) this.q.n).C(this, menuItem);
    }

    @Override // defpackage.i3
    public final CharSequence f() {
        return this.p.getSubtitle();
    }

    @Override // defpackage.i3
    public final CharSequence g() {
        return this.p.getTitle();
    }

    @Override // defpackage.i3
    public final void h() {
        this.q.F(this, this.t);
    }

    @Override // defpackage.i3
    public final boolean i() {
        return this.p.E;
    }

    @Override // defpackage.i3
    public final void j(View view) {
        this.p.setCustomView(view);
        this.r = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.dk1
    public final void k(fk1 fk1Var) {
        h();
        e3 e3Var = this.p.p;
        if (e3Var != null) {
            e3Var.l();
        }
    }

    @Override // defpackage.i3
    public final void l(int i) {
        m(this.o.getString(i));
    }

    @Override // defpackage.i3
    public final void m(CharSequence charSequence) {
        this.p.setSubtitle(charSequence);
    }

    @Override // defpackage.i3
    public final void n(int i) {
        o(this.o.getString(i));
    }

    @Override // defpackage.i3
    public final void o(CharSequence charSequence) {
        this.p.setTitle(charSequence);
    }

    @Override // defpackage.i3
    public final void p(boolean z) {
        this.n = z;
        this.p.setTitleOptional(z);
    }
}
