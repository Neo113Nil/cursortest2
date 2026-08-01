package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.AbstractC0147a;
import l.InterfaceC0167k;
import l.MenuC0169m;
import m.C0221k;

/* loaded from: classes.dex */
public final class J extends AbstractC0147a implements InterfaceC0167k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2269c;
    public final MenuC0169m d;

    /* renamed from: e, reason: collision with root package name */
    public C.j f2270e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2271f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f2272g;

    public J(K k2, Context context, C.j jVar) {
        this.f2272g = k2;
        this.f2269c = context;
        this.f2270e = jVar;
        MenuC0169m menuC0169m = new MenuC0169m(context);
        menuC0169m.f2824l = 1;
        this.d = menuC0169m;
        menuC0169m.f2818e = this;
    }

    @Override // k.AbstractC0147a
    public final void a() {
        K k2 = this.f2272g;
        if (k2.f2284m != this) {
            return;
        }
        if (k2.f2291t) {
            k2.f2285n = this;
            k2.f2286o = this.f2270e;
        } else {
            this.f2270e.B(this);
        }
        this.f2270e = null;
        k2.m0(false);
        ActionBarContextView actionBarContextView = k2.f2281j;
        if (actionBarContextView.f1349k == null) {
            actionBarContextView.e();
        }
        k2.f2279g.setHideOnContentScrollEnabled(k2.f2296y);
        k2.f2284m = null;
    }

    @Override // k.AbstractC0147a
    public final View b() {
        WeakReference weakReference = this.f2271f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.AbstractC0147a
    public final MenuC0169m c() {
        return this.d;
    }

    @Override // k.AbstractC0147a
    public final MenuInflater d() {
        return new k.h(this.f2269c);
    }

    @Override // k.AbstractC0147a
    public final CharSequence e() {
        return this.f2272g.f2281j.getSubtitle();
    }

    @Override // k.AbstractC0147a
    public final CharSequence f() {
        return this.f2272g.f2281j.getTitle();
    }

    @Override // k.AbstractC0147a
    public final void g() {
        if (this.f2272g.f2284m != this) {
            return;
        }
        MenuC0169m menuC0169m = this.d;
        menuC0169m.w();
        try {
            this.f2270e.C(this, menuC0169m);
        } finally {
            menuC0169m.v();
        }
    }

    @Override // k.AbstractC0147a
    public final boolean h() {
        return this.f2272g.f2281j.f1357s;
    }

    @Override // k.AbstractC0147a
    public final void i(View view) {
        this.f2272g.f2281j.setCustomView(view);
        this.f2271f = new WeakReference(view);
    }

    @Override // k.AbstractC0147a
    public final void j(int i) {
        k(this.f2272g.f2277e.getResources().getString(i));
    }

    @Override // k.AbstractC0147a
    public final void k(CharSequence charSequence) {
        this.f2272g.f2281j.setSubtitle(charSequence);
    }

    @Override // k.AbstractC0147a
    public final void l(int i) {
        m(this.f2272g.f2277e.getResources().getString(i));
    }

    @Override // k.AbstractC0147a
    public final void m(CharSequence charSequence) {
        this.f2272g.f2281j.setTitle(charSequence);
    }

    @Override // k.AbstractC0147a
    public final void n(boolean z2) {
        this.f2673b = z2;
        this.f2272g.f2281j.setTitleOptional(z2);
    }

    @Override // l.InterfaceC0167k
    public final boolean o(MenuC0169m menuC0169m, MenuItem menuItem) {
        C.j jVar = this.f2270e;
        if (jVar != null) {
            return ((S0.g) jVar.f86b).p(this, menuItem);
        }
        return false;
    }

    @Override // l.InterfaceC0167k
    public final void q(MenuC0169m menuC0169m) {
        if (this.f2270e == null) {
            return;
        }
        g();
        C0221k c0221k = this.f2272g.f2281j.d;
        if (c0221k != null) {
            c0221k.l();
        }
    }
}
