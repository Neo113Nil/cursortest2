package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.AbstractC0137a;
import java.lang.ref.WeakReference;
import k.InterfaceC0155k;
import k.MenuC0157m;
import l.C0219k;

/* loaded from: classes.dex */
public final class J extends AbstractC0137a implements InterfaceC0155k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2371c;
    public final MenuC0157m d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2372e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2373f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f2374g;

    public J(K k2, Context context, B.j jVar) {
        this.f2374g = k2;
        this.f2371c = context;
        this.f2372e = jVar;
        MenuC0157m menuC0157m = new MenuC0157m(context);
        menuC0157m.f2656l = 1;
        this.d = menuC0157m;
        menuC0157m.f2651e = this;
    }

    @Override // j.AbstractC0137a
    public final void a() {
        K k2 = this.f2374g;
        if (k2.f2382k != this) {
            return;
        }
        if (k2.f2389r) {
            k2.f2383l = this;
            k2.f2384m = this.f2372e;
        } else {
            this.f2372e.A(this);
        }
        this.f2372e = null;
        k2.k0(false);
        ActionBarContextView actionBarContextView = k2.h;
        if (actionBarContextView.f1220k == null) {
            actionBarContextView.e();
        }
        k2.f2378e.setHideOnContentScrollEnabled(k2.f2394w);
        k2.f2382k = null;
    }

    @Override // j.AbstractC0137a
    public final View b() {
        WeakReference weakReference = this.f2373f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0137a
    public final MenuC0157m c() {
        return this.d;
    }

    @Override // j.AbstractC0137a
    public final MenuInflater d() {
        return new j.h(this.f2371c);
    }

    @Override // j.AbstractC0137a
    public final CharSequence e() {
        return this.f2374g.h.getSubtitle();
    }

    @Override // j.AbstractC0137a
    public final CharSequence f() {
        return this.f2374g.h.getTitle();
    }

    @Override // j.AbstractC0137a
    public final void g() {
        if (this.f2374g.f2382k != this) {
            return;
        }
        MenuC0157m menuC0157m = this.d;
        menuC0157m.w();
        try {
            this.f2372e.C(this, menuC0157m);
        } finally {
            menuC0157m.v();
        }
    }

    @Override // j.AbstractC0137a
    public final boolean h() {
        return this.f2374g.h.f1228s;
    }

    @Override // j.AbstractC0137a
    public final void i(View view) {
        this.f2374g.h.setCustomView(view);
        this.f2373f = new WeakReference(view);
    }

    @Override // j.AbstractC0137a
    public final void j(int i) {
        k(this.f2374g.f2377c.getResources().getString(i));
    }

    @Override // j.AbstractC0137a
    public final void k(CharSequence charSequence) {
        this.f2374g.h.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0137a
    public final void l(int i) {
        m(this.f2374g.f2377c.getResources().getString(i));
    }

    @Override // j.AbstractC0137a
    public final void m(CharSequence charSequence) {
        this.f2374g.h.setTitle(charSequence);
    }

    @Override // j.AbstractC0137a
    public final void n(boolean z2) {
        this.f2513b = z2;
        this.f2374g.h.setTitleOptional(z2);
    }

    @Override // k.InterfaceC0155k
    public final void q(MenuC0157m menuC0157m) {
        if (this.f2372e == null) {
            return;
        }
        g();
        C0219k c0219k = this.f2374g.h.d;
        if (c0219k != null) {
            c0219k.l();
        }
    }

    @Override // k.InterfaceC0155k
    public final boolean s(MenuC0157m menuC0157m, MenuItem menuItem) {
        B.j jVar = this.f2372e;
        if (jVar != null) {
            return ((T.u) jVar.f53b).p(this, menuItem);
        }
        return false;
    }
}
