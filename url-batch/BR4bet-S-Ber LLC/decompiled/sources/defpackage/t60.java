package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class t60 extends m1 implements kw {
    public Context h;
    public ActionBarContextView i;
    public a5 j;
    public WeakReference k;
    public boolean l;
    public mw m;

    @Override // defpackage.m1
    public final void a() {
        if (this.l) {
            return;
        }
        this.l = true;
        this.j.I(this);
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
        return this.m;
    }

    @Override // defpackage.m1
    public final MenuInflater d() {
        return new v70(this.i.getContext());
    }

    @Override // defpackage.m1
    public final CharSequence e() {
        return this.i.getSubtitle();
    }

    @Override // defpackage.m1
    public final CharSequence f() {
        return this.i.getTitle();
    }

    @Override // defpackage.kw
    public final boolean g(mw mwVar, MenuItem menuItem) {
        return ((rg) this.j.g).u(this, menuItem);
    }

    @Override // defpackage.m1
    public final void h() {
        this.j.K(this, this.m);
    }

    @Override // defpackage.m1
    public final boolean i() {
        return this.i.x;
    }

    @Override // defpackage.m1
    public final void j(View view) {
        this.i.setCustomView(view);
        this.k = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.m1
    public final void k(int i) {
        l(this.h.getString(i));
    }

    @Override // defpackage.m1
    public final void l(CharSequence charSequence) {
        this.i.setSubtitle(charSequence);
    }

    @Override // defpackage.m1
    public final void m(int i) {
        n(this.h.getString(i));
    }

    @Override // defpackage.m1
    public final void n(CharSequence charSequence) {
        this.i.setTitle(charSequence);
    }

    @Override // defpackage.m1
    public final void o(boolean z) {
        this.g = z;
        this.i.setTitleOptional(z);
    }

    @Override // defpackage.kw
    public final void q(mw mwVar) {
        h();
        i1 i1Var = this.i.i;
        if (i1Var != null) {
            i1Var.l();
        }
    }
}
