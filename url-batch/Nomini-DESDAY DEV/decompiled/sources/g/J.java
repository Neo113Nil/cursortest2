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
import l.C0244l;

/* loaded from: classes.dex */
public final class J extends AbstractC0137a implements InterfaceC0155k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2256c;
    public final MenuC0157m d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2257e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f2259g;

    public J(K k2, Context context, B.j jVar) {
        this.f2259g = k2;
        this.f2256c = context;
        this.f2257e = jVar;
        MenuC0157m menuC0157m = new MenuC0157m(context);
        menuC0157m.f2671l = 1;
        this.d = menuC0157m;
        menuC0157m.f2666e = this;
    }

    @Override // j.AbstractC0137a
    public final void a() {
        K k2 = this.f2259g;
        if (k2.i != this) {
            return;
        }
        if (k2.f2274p) {
            k2.f2268j = this;
            k2.f2269k = this.f2257e;
        } else {
            this.f2257e.A(this);
        }
        this.f2257e = null;
        k2.d0(false);
        ActionBarContextView actionBarContextView = k2.f2266f;
        if (actionBarContextView.f1142k == null) {
            actionBarContextView.e();
        }
        k2.f2264c.setHideOnContentScrollEnabled(k2.f2279u);
        k2.i = null;
    }

    @Override // j.AbstractC0137a
    public final View b() {
        WeakReference weakReference = this.f2258f;
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
        return new j.h(this.f2256c);
    }

    @Override // j.AbstractC0137a
    public final CharSequence e() {
        return this.f2259g.f2266f.getSubtitle();
    }

    @Override // j.AbstractC0137a
    public final CharSequence f() {
        return this.f2259g.f2266f.getTitle();
    }

    @Override // k.InterfaceC0155k
    public final void g(MenuC0157m menuC0157m) {
        if (this.f2257e == null) {
            return;
        }
        i();
        C0244l c0244l = this.f2259g.f2266f.d;
        if (c0244l != null) {
            c0244l.l();
        }
    }

    @Override // k.InterfaceC0155k
    public final boolean h(MenuC0157m menuC0157m, MenuItem menuItem) {
        B.j jVar = this.f2257e;
        if (jVar != null) {
            return ((T.t) jVar.f30b).p(this, menuItem);
        }
        return false;
    }

    @Override // j.AbstractC0137a
    public final void i() {
        if (this.f2259g.i != this) {
            return;
        }
        MenuC0157m menuC0157m = this.d;
        menuC0157m.w();
        try {
            this.f2257e.B(this, menuC0157m);
        } finally {
            menuC0157m.v();
        }
    }

    @Override // j.AbstractC0137a
    public final boolean j() {
        return this.f2259g.f2266f.f1150s;
    }

    @Override // j.AbstractC0137a
    public final void k(View view) {
        this.f2259g.f2266f.setCustomView(view);
        this.f2258f = new WeakReference(view);
    }

    @Override // j.AbstractC0137a
    public final void l(int i) {
        m(this.f2259g.f2262a.getResources().getString(i));
    }

    @Override // j.AbstractC0137a
    public final void m(CharSequence charSequence) {
        this.f2259g.f2266f.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0137a
    public final void n(int i) {
        o(this.f2259g.f2262a.getResources().getString(i));
    }

    @Override // j.AbstractC0137a
    public final void o(CharSequence charSequence) {
        this.f2259g.f2266f.setTitle(charSequence);
    }

    @Override // j.AbstractC0137a
    public final void p(boolean z2) {
        this.f2523b = z2;
        this.f2259g.f2266f.setTitleOptional(z2);
    }
}
