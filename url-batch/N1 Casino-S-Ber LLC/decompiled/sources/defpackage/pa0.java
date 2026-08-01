package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class pa0 extends l1 implements kt {
    public final Context h;
    public final mt i;
    public q4 j;
    public WeakReference k;
    public final /* synthetic */ qa0 l;

    public pa0(qa0 qa0Var, Context context, q4 q4Var) {
        this.l = qa0Var;
        this.h = context;
        this.j = q4Var;
        mt mtVar = new mt(context);
        mtVar.l = 1;
        this.i = mtVar;
        mtVar.e = this;
    }

    @Override // defpackage.l1
    public final void a() {
        qa0 qa0Var = this.l;
        if (qa0Var.A != this) {
            return;
        }
        if (qa0Var.H) {
            qa0Var.B = this;
            qa0Var.C = this.j;
        } else {
            this.j.I(this);
        }
        this.j = null;
        qa0Var.F0(false);
        ActionBarContextView actionBarContextView = qa0Var.x;
        if (actionBarContextView.p == null) {
            actionBarContextView.e();
        }
        qa0Var.u.setHideOnContentScrollEnabled(qa0Var.M);
        qa0Var.A = null;
    }

    @Override // defpackage.l1
    public final View b() {
        WeakReference weakReference = this.k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.l1
    public final mt c() {
        return this.i;
    }

    @Override // defpackage.l1
    public final MenuInflater d() {
        return new t40(this.h);
    }

    @Override // defpackage.l1
    public final CharSequence e() {
        return this.l.x.getSubtitle();
    }

    @Override // defpackage.l1
    public final CharSequence f() {
        return this.l.x.getTitle();
    }

    @Override // defpackage.l1
    public final void g() {
        if (this.l.A != this) {
            return;
        }
        mt mtVar = this.i;
        mtVar.w();
        try {
            this.j.K(this, mtVar);
        } finally {
            mtVar.v();
        }
    }

    @Override // defpackage.l1
    public final boolean h() {
        return this.l.x.x;
    }

    @Override // defpackage.kt
    public final boolean i(mt mtVar, MenuItem menuItem) {
        q4 q4Var = this.j;
        if (q4Var != null) {
            return ((we) q4Var.g).u(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.l1
    public final void j(View view) {
        this.l.x.setCustomView(view);
        this.k = new WeakReference(view);
    }

    @Override // defpackage.l1
    public final void k(int i) {
        l(this.l.s.getResources().getString(i));
    }

    @Override // defpackage.l1
    public final void l(CharSequence charSequence) {
        this.l.x.setSubtitle(charSequence);
    }

    @Override // defpackage.l1
    public final void m(int i) {
        n(this.l.s.getResources().getString(i));
    }

    @Override // defpackage.l1
    public final void n(CharSequence charSequence) {
        this.l.x.setTitle(charSequence);
    }

    @Override // defpackage.l1
    public final void o(boolean z) {
        this.g = z;
        this.l.x.setTitleOptional(z);
    }

    @Override // defpackage.kt
    public final void r(mt mtVar) {
        if (this.j == null) {
            return;
        }
        g();
        h1 h1Var = this.l.x.i;
        if (h1Var != null) {
            h1Var.l();
        }
    }
}
