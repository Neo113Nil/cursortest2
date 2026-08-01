package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ze0 extends p1 implements p10 {
    public Context h;
    public ActionBarContextView i;
    public i5 j;
    public WeakReference k;
    public boolean l;
    public r10 m;

    @Override // defpackage.p1
    public final void a() {
        if (this.l) {
            return;
        }
        this.l = true;
        this.j.F(this);
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
        return this.m;
    }

    @Override // defpackage.p1
    public final MenuInflater d() {
        return new eg0(this.i.getContext());
    }

    @Override // defpackage.p1
    public final CharSequence e() {
        return this.i.getSubtitle();
    }

    @Override // defpackage.p1
    public final CharSequence f() {
        return this.i.getTitle();
    }

    @Override // defpackage.p10
    public final boolean g(r10 r10Var, MenuItem menuItem) {
        return ((wi) this.j.g).n(this, menuItem);
    }

    @Override // defpackage.p1
    public final void h() {
        this.j.H(this, this.m);
    }

    @Override // defpackage.p1
    public final boolean i() {
        return this.i.x;
    }

    @Override // defpackage.p1
    public final void j(View view) {
        this.i.setCustomView(view);
        this.k = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.p1
    public final void k(int i) {
        l(this.h.getString(i));
    }

    @Override // defpackage.p1
    public final void l(CharSequence charSequence) {
        this.i.setSubtitle(charSequence);
    }

    @Override // defpackage.p1
    public final void m(int i) {
        n(this.h.getString(i));
    }

    @Override // defpackage.p1
    public final void n(CharSequence charSequence) {
        this.i.setTitle(charSequence);
    }

    @Override // defpackage.p10
    public final void o(r10 r10Var) {
        h();
        l1 l1Var = this.i.i;
        if (l1Var != null) {
            l1Var.l();
        }
    }

    @Override // defpackage.p1
    public final void p(boolean z) {
        this.g = z;
        this.i.setTitleOptional(z);
    }
}
