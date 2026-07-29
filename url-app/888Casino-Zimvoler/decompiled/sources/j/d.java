package j;

import T.t;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.InterfaceC0155k;
import k.MenuC0157m;
import l.C0244l;

/* loaded from: classes.dex */
public final class d extends AbstractC0137a implements InterfaceC0155k {

    /* renamed from: c, reason: collision with root package name */
    public Context f2530c;
    public ActionBarContextView d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2531e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2532f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2533g;
    public MenuC0157m h;

    @Override // j.AbstractC0137a
    public final void a() {
        if (this.f2533g) {
            return;
        }
        this.f2533g = true;
        this.f2531e.A(this);
    }

    @Override // j.AbstractC0137a
    public final View b() {
        WeakReference weakReference = this.f2532f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0137a
    public final MenuC0157m c() {
        return this.h;
    }

    @Override // j.AbstractC0137a
    public final MenuInflater d() {
        return new h(this.d.getContext());
    }

    @Override // j.AbstractC0137a
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // j.AbstractC0137a
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override // k.InterfaceC0155k
    public final void g(MenuC0157m menuC0157m) {
        i();
        C0244l c0244l = this.d.d;
        if (c0244l != null) {
            c0244l.l();
        }
    }

    @Override // k.InterfaceC0155k
    public final boolean h(MenuC0157m menuC0157m, MenuItem menuItem) {
        return ((t) this.f2531e.f30b).p(this, menuItem);
    }

    @Override // j.AbstractC0137a
    public final void i() {
        this.f2531e.B(this, this.h);
    }

    @Override // j.AbstractC0137a
    public final boolean j() {
        return this.d.f1151s;
    }

    @Override // j.AbstractC0137a
    public final void k(View view) {
        this.d.setCustomView(view);
        this.f2532f = view != null ? new WeakReference(view) : null;
    }

    @Override // j.AbstractC0137a
    public final void l(int i) {
        m(this.f2530c.getString(i));
    }

    @Override // j.AbstractC0137a
    public final void m(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0137a
    public final void n(int i) {
        o(this.f2530c.getString(i));
    }

    @Override // j.AbstractC0137a
    public final void o(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // j.AbstractC0137a
    public final void p(boolean z2) {
        this.f2524b = z2;
        this.d.setTitleOptional(z2);
    }
}
