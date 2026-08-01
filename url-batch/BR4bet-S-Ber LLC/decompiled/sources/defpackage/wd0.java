package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class wd0 extends m1 implements kw {
    public final Context h;
    public final mw i;
    public a5 j;
    public WeakReference k;
    public final /* synthetic */ xd0 l;

    public wd0(xd0 xd0Var, Context context, a5 a5Var) {
        this.l = xd0Var;
        this.h = context;
        this.j = a5Var;
        mw mwVar = new mw(context);
        mwVar.l = 1;
        this.i = mwVar;
        mwVar.e = this;
    }

    @Override // defpackage.m1
    public final void a() {
        xd0 xd0Var = this.l;
        if (xd0Var.i != this) {
            return;
        }
        if (xd0Var.p) {
            xd0Var.j = this;
            xd0Var.k = this.j;
        } else {
            this.j.I(this);
        }
        this.j = null;
        xd0Var.a(false);
        ActionBarContextView actionBarContextView = xd0Var.f;
        if (actionBarContextView.p == null) {
            actionBarContextView.e();
        }
        xd0Var.c.setHideOnContentScrollEnabled(xd0Var.u);
        xd0Var.i = null;
    }

    @Override // defpackage.m1
    public final View b() {
        WeakReference weakReference = this.k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.m1
    public final mw c() {
        return this.i;
    }

    @Override // defpackage.m1
    public final MenuInflater d() {
        return new v70(this.h);
    }

    @Override // defpackage.m1
    public final CharSequence e() {
        return this.l.f.getSubtitle();
    }

    @Override // defpackage.m1
    public final CharSequence f() {
        return this.l.f.getTitle();
    }

    @Override // defpackage.kw
    public final boolean g(mw mwVar, MenuItem menuItem) {
        a5 a5Var = this.j;
        if (a5Var != null) {
            return ((rg) a5Var.g).u(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.m1
    public final void h() {
        if (this.l.i != this) {
            return;
        }
        mw mwVar = this.i;
        mwVar.w();
        try {
            this.j.K(this, mwVar);
        } finally {
            mwVar.v();
        }
    }

    @Override // defpackage.m1
    public final boolean i() {
        return this.l.f.x;
    }

    @Override // defpackage.m1
    public final void j(View view) {
        this.l.f.setCustomView(view);
        this.k = new WeakReference(view);
    }

    @Override // defpackage.m1
    public final void k(int i) {
        l(this.l.a.getResources().getString(i));
    }

    @Override // defpackage.m1
    public final void l(CharSequence charSequence) {
        this.l.f.setSubtitle(charSequence);
    }

    @Override // defpackage.m1
    public final void m(int i) {
        n(this.l.a.getResources().getString(i));
    }

    @Override // defpackage.m1
    public final void n(CharSequence charSequence) {
        this.l.f.setTitle(charSequence);
    }

    @Override // defpackage.m1
    public final void o(boolean z) {
        this.g = z;
        this.l.f.setTitleOptional(z);
    }

    @Override // defpackage.kw
    public final void q(mw mwVar) {
        if (this.j == null) {
            return;
        }
        h();
        i1 i1Var = this.l.f.i;
        if (i1Var != null) {
            i1Var.l();
        }
    }
}
