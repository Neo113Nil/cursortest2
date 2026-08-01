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
    public final Context f2261c;
    public final MenuC0157m d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2262e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f2264g;

    public J(K k2, Context context, B.j jVar) {
        this.f2264g = k2;
        this.f2261c = context;
        this.f2262e = jVar;
        MenuC0157m menuC0157m = new MenuC0157m(context);
        menuC0157m.f2693l = 1;
        this.d = menuC0157m;
        menuC0157m.f2688e = this;
    }

    @Override // j.AbstractC0137a
    public final void a() {
        K k2 = this.f2264g;
        if (k2.i != this) {
            return;
        }
        if (k2.f2279p) {
            k2.f2273j = this;
            k2.f2274k = this.f2262e;
        } else {
            this.f2262e.A(this);
        }
        this.f2262e = null;
        k2.d0(false);
        ActionBarContextView actionBarContextView = k2.f2271f;
        if (actionBarContextView.f1146k == null) {
            actionBarContextView.e();
        }
        k2.f2269c.setHideOnContentScrollEnabled(k2.f2284u);
        k2.i = null;
    }

    @Override // j.AbstractC0137a
    public final View b() {
        WeakReference weakReference = this.f2263f;
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
        return new j.h(this.f2261c);
    }

    @Override // j.AbstractC0137a
    public final CharSequence e() {
        return this.f2264g.f2271f.getSubtitle();
    }

    @Override // j.AbstractC0137a
    public final CharSequence f() {
        return this.f2264g.f2271f.getTitle();
    }

    @Override // k.InterfaceC0155k
    public final void g(MenuC0157m menuC0157m) {
        if (this.f2262e == null) {
            return;
        }
        i();
        C0244l c0244l = this.f2264g.f2271f.d;
        if (c0244l != null) {
            c0244l.l();
        }
    }

    @Override // k.InterfaceC0155k
    public final boolean h(MenuC0157m menuC0157m, MenuItem menuItem) {
        B.j jVar = this.f2262e;
        if (jVar != null) {
            return ((T.t) jVar.f30b).p(this, menuItem);
        }
        return false;
    }

    @Override // j.AbstractC0137a
    public final void i() {
        if (this.f2264g.i != this) {
            return;
        }
        MenuC0157m menuC0157m = this.d;
        menuC0157m.w();
        try {
            this.f2262e.B(this, menuC0157m);
        } finally {
            menuC0157m.v();
        }
    }

    @Override // j.AbstractC0137a
    public final boolean j() {
        return this.f2264g.f2271f.f1154s;
    }

    @Override // j.AbstractC0137a
    public final void k(View view) {
        this.f2264g.f2271f.setCustomView(view);
        this.f2263f = new WeakReference(view);
    }

    @Override // j.AbstractC0137a
    public final void l(int i) {
        m(this.f2264g.f2267a.getResources().getString(i));
    }

    @Override // j.AbstractC0137a
    public final void m(CharSequence charSequence) {
        this.f2264g.f2271f.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0137a
    public final void n(int i) {
        o(this.f2264g.f2267a.getResources().getString(i));
    }

    @Override // j.AbstractC0137a
    public final void o(CharSequence charSequence) {
        this.f2264g.f2271f.setTitle(charSequence);
    }

    @Override // j.AbstractC0137a
    public final void p(boolean z2) {
        this.f2545b = z2;
        this.f2264g.f2271f.setTitleOptional(z2);
    }
}
