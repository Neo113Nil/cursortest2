package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ao0 extends p1 implements p10 {
    public final Context h;
    public final r10 i;
    public i5 j;
    public WeakReference k;
    public final /* synthetic */ bo0 l;

    public ao0(bo0 bo0Var, Context context, i5 i5Var) {
        this.l = bo0Var;
        this.h = context;
        this.j = i5Var;
        r10 r10Var = new r10(context);
        r10Var.l = 1;
        this.i = r10Var;
        r10Var.e = this;
    }

    @Override // defpackage.p1
    public final void a() {
        bo0 bo0Var = this.l;
        if (bo0Var.A != this) {
            return;
        }
        if (bo0Var.H) {
            bo0Var.B = this;
            bo0Var.C = this.j;
        } else {
            this.j.F(this);
        }
        this.j = null;
        bo0Var.W(false);
        ActionBarContextView actionBarContextView = bo0Var.x;
        if (actionBarContextView.p == null) {
            actionBarContextView.e();
        }
        bo0Var.u.setHideOnContentScrollEnabled(bo0Var.M);
        bo0Var.A = null;
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
    public final r10 c() {
        return this.i;
    }

    @Override // defpackage.p1
    public final MenuInflater d() {
        return new eg0(this.h);
    }

    @Override // defpackage.p1
    public final CharSequence e() {
        return this.l.x.getSubtitle();
    }

    @Override // defpackage.p1
    public final CharSequence f() {
        return this.l.x.getTitle();
    }

    @Override // defpackage.p10
    public final boolean g(r10 r10Var, MenuItem menuItem) {
        i5 i5Var = this.j;
        if (i5Var != null) {
            return ((wi) i5Var.g).n(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.p1
    public final void h() {
        if (this.l.A != this) {
            return;
        }
        r10 r10Var = this.i;
        r10Var.w();
        try {
            this.j.H(this, r10Var);
        } finally {
            r10Var.v();
        }
    }

    @Override // defpackage.p1
    public final boolean i() {
        return this.l.x.x;
    }

    @Override // defpackage.p1
    public final void j(View view) {
        this.l.x.setCustomView(view);
        this.k = new WeakReference(view);
    }

    @Override // defpackage.p1
    public final void k(int i) {
        l(this.l.s.getResources().getString(i));
    }

    @Override // defpackage.p1
    public final void l(CharSequence charSequence) {
        this.l.x.setSubtitle(charSequence);
    }

    @Override // defpackage.p1
    public final void m(int i) {
        n(this.l.s.getResources().getString(i));
    }

    @Override // defpackage.p1
    public final void n(CharSequence charSequence) {
        this.l.x.setTitle(charSequence);
    }

    @Override // defpackage.p10
    public final void o(r10 r10Var) {
        if (this.j == null) {
            return;
        }
        h();
        l1 l1Var = this.l.x.i;
        if (l1Var != null) {
            l1Var.l();
        }
    }

    @Override // defpackage.p1
    public final void p(boolean z) {
        this.g = z;
        this.l.x.setTitleOptional(z);
    }
}
