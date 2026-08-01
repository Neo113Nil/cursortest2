package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class wa0 extends p1 implements yt {
    public final Context h;
    public final au i;
    public h5 j;
    public WeakReference k;
    public final /* synthetic */ xa0 l;

    public wa0(xa0 xa0Var, Context context, h5 h5Var) {
        this.l = xa0Var;
        this.h = context;
        this.j = h5Var;
        au auVar = new au(context);
        auVar.l = 1;
        this.i = auVar;
        auVar.e = this;
    }

    @Override // defpackage.p1
    public final void a() {
        xa0 xa0Var = this.l;
        if (xa0Var.i != this) {
            return;
        }
        if (xa0Var.p) {
            xa0Var.j = this;
            xa0Var.k = this.j;
        } else {
            this.j.C(this);
        }
        this.j = null;
        xa0Var.a(false);
        ActionBarContextView actionBarContextView = xa0Var.f;
        if (actionBarContextView.p == null) {
            actionBarContextView.e();
        }
        xa0Var.c.setHideOnContentScrollEnabled(xa0Var.u);
        xa0Var.i = null;
    }

    @Override // defpackage.p1
    public final View b() {
        WeakReference weakReference = this.k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.p1
    public final au c() {
        return this.i;
    }

    @Override // defpackage.p1
    public final MenuInflater d() {
        return new a50(this.h);
    }

    @Override // defpackage.p1
    public final CharSequence e() {
        return this.l.f.getSubtitle();
    }

    @Override // defpackage.yt
    public final boolean f(au auVar, MenuItem menuItem) {
        h5 h5Var = this.j;
        if (h5Var != null) {
            return ((h8) h5Var.g).g(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.p1
    public final CharSequence g() {
        return this.l.f.getTitle();
    }

    @Override // defpackage.p1
    public final void h() {
        if (this.l.i != this) {
            return;
        }
        au auVar = this.i;
        auVar.w();
        try {
            this.j.E(this, auVar);
        } finally {
            auVar.v();
        }
    }

    @Override // defpackage.p1
    public final boolean i() {
        return this.l.f.x;
    }

    @Override // defpackage.p1
    public final void j(View view) {
        this.l.f.setCustomView(view);
        this.k = new WeakReference(view);
    }

    @Override // defpackage.p1
    public final void k(int i) {
        l(this.l.a.getResources().getString(i));
    }

    @Override // defpackage.p1
    public final void l(CharSequence charSequence) {
        this.l.f.setSubtitle(charSequence);
    }

    @Override // defpackage.yt
    public final void m(au auVar) {
        if (this.j == null) {
            return;
        }
        h();
        k1 k1Var = this.l.f.i;
        if (k1Var != null) {
            k1Var.l();
        }
    }

    @Override // defpackage.p1
    public final void n(int i) {
        o(this.l.a.getResources().getString(i));
    }

    @Override // defpackage.p1
    public final void o(CharSequence charSequence) {
        this.l.f.setTitle(charSequence);
    }

    @Override // defpackage.p1
    public final void p(boolean z) {
        this.g = z;
        this.l.f.setTitleOptional(z);
    }
}
