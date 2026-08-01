package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class a40 extends p1 implements yt {
    public Context h;
    public ActionBarContextView i;
    public h5 j;
    public WeakReference k;
    public boolean l;
    public au m;

    @Override // defpackage.p1
    public final void a() {
        if (this.l) {
            return;
        }
        this.l = true;
        this.j.C(this);
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
        return this.m;
    }

    @Override // defpackage.p1
    public final MenuInflater d() {
        return new a50(this.i.getContext());
    }

    @Override // defpackage.p1
    public final CharSequence e() {
        return this.i.getSubtitle();
    }

    @Override // defpackage.yt
    public final boolean f(au auVar, MenuItem menuItem) {
        return ((h8) this.j.g).g(this, menuItem);
    }

    @Override // defpackage.p1
    public final CharSequence g() {
        return this.i.getTitle();
    }

    @Override // defpackage.p1
    public final void h() {
        this.j.E(this, this.m);
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

    @Override // defpackage.yt
    public final void m(au auVar) {
        h();
        k1 k1Var = this.i.i;
        if (k1Var != null) {
            k1Var.l();
        }
    }

    @Override // defpackage.p1
    public final void n(int i) {
        o(this.h.getString(i));
    }

    @Override // defpackage.p1
    public final void o(CharSequence charSequence) {
        this.i.setTitle(charSequence);
    }

    @Override // defpackage.p1
    public final void p(boolean z) {
        this.g = z;
        this.i.setTitleOptional(z);
    }
}
