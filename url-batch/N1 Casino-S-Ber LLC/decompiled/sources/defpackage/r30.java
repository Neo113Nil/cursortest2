package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class r30 extends l1 implements kt {
    public Context h;
    public ActionBarContextView i;
    public q4 j;
    public WeakReference k;
    public boolean l;
    public mt m;

    @Override // defpackage.l1
    public final void a() {
        if (this.l) {
            return;
        }
        this.l = true;
        this.j.I(this);
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
        return this.m;
    }

    @Override // defpackage.l1
    public final MenuInflater d() {
        return new t40(this.i.getContext());
    }

    @Override // defpackage.l1
    public final CharSequence e() {
        return this.i.getSubtitle();
    }

    @Override // defpackage.l1
    public final CharSequence f() {
        return this.i.getTitle();
    }

    @Override // defpackage.l1
    public final void g() {
        this.j.K(this, this.m);
    }

    @Override // defpackage.l1
    public final boolean h() {
        return this.i.x;
    }

    @Override // defpackage.kt
    public final boolean i(mt mtVar, MenuItem menuItem) {
        return ((we) this.j.g).u(this, menuItem);
    }

    @Override // defpackage.l1
    public final void j(View view) {
        this.i.setCustomView(view);
        this.k = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.l1
    public final void k(int i) {
        l(this.h.getString(i));
    }

    @Override // defpackage.l1
    public final void l(CharSequence charSequence) {
        this.i.setSubtitle(charSequence);
    }

    @Override // defpackage.l1
    public final void m(int i) {
        n(this.h.getString(i));
    }

    @Override // defpackage.l1
    public final void n(CharSequence charSequence) {
        this.i.setTitle(charSequence);
    }

    @Override // defpackage.l1
    public final void o(boolean z) {
        this.g = z;
        this.i.setTitleOptional(z);
    }

    @Override // defpackage.kt
    public final void r(mt mtVar) {
        g();
        h1 h1Var = this.i.i;
        if (h1Var != null) {
            h1Var.l();
        }
    }
}
