package h;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import l.AbstractC0204a;
import m.InterfaceC0227k;
import m.MenuC0229m;
import n.C0282k;

/* loaded from: classes.dex */
public final class J extends AbstractC0204a implements InterfaceC0227k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2741c;

    /* renamed from: d, reason: collision with root package name */
    public final MenuC0229m f2742d;
    public B1.c e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f2744g;

    public J(K k2, Context context, B1.c cVar) {
        this.f2744g = k2;
        this.f2741c = context;
        this.e = cVar;
        MenuC0229m menuC0229m = new MenuC0229m(context);
        menuC0229m.f3356l = 1;
        this.f2742d = menuC0229m;
        menuC0229m.e = this;
    }

    @Override // l.AbstractC0204a
    public final void a() {
        K k2 = this.f2744g;
        if (k2.f2754m != this) {
            return;
        }
        if (k2.f2761t) {
            k2.f2755n = this;
            k2.f2756o = this.e;
        } else {
            this.e.C(this);
        }
        this.e = null;
        k2.h0(false);
        ActionBarContextView actionBarContextView = k2.j;
        if (actionBarContextView.f1715k == null) {
            actionBarContextView.e();
        }
        k2.f2750g.setHideOnContentScrollEnabled(k2.f2766y);
        k2.f2754m = null;
    }

    @Override // l.AbstractC0204a
    public final View b() {
        WeakReference weakReference = this.f2743f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // m.InterfaceC0227k
    public final boolean c(MenuC0229m menuC0229m, MenuItem menuItem) {
        B1.c cVar = this.e;
        if (cVar != null) {
            return ((V.v) cVar.f68b).p(this, menuItem);
        }
        return false;
    }

    @Override // l.AbstractC0204a
    public final MenuC0229m d() {
        return this.f2742d;
    }

    @Override // l.AbstractC0204a
    public final MenuInflater e() {
        return new l.h(this.f2741c);
    }

    @Override // m.InterfaceC0227k
    public final void f(MenuC0229m menuC0229m) {
        if (this.e == null) {
            return;
        }
        i();
        C0282k c0282k = this.f2744g.j.f1711d;
        if (c0282k != null) {
            c0282k.l();
        }
    }

    @Override // l.AbstractC0204a
    public final CharSequence g() {
        return this.f2744g.j.getSubtitle();
    }

    @Override // l.AbstractC0204a
    public final CharSequence h() {
        return this.f2744g.j.getTitle();
    }

    @Override // l.AbstractC0204a
    public final void i() {
        if (this.f2744g.f2754m != this) {
            return;
        }
        MenuC0229m menuC0229m = this.f2742d;
        menuC0229m.w();
        try {
            this.e.E(this, menuC0229m);
        } finally {
            menuC0229m.v();
        }
    }

    @Override // l.AbstractC0204a
    public final boolean j() {
        return this.f2744g.j.f1723s;
    }

    @Override // l.AbstractC0204a
    public final void k(View view) {
        this.f2744g.j.setCustomView(view);
        this.f2743f = new WeakReference(view);
    }

    @Override // l.AbstractC0204a
    public final void l(int i) {
        m(this.f2744g.e.getResources().getString(i));
    }

    @Override // l.AbstractC0204a
    public final void m(CharSequence charSequence) {
        this.f2744g.j.setSubtitle(charSequence);
    }

    @Override // l.AbstractC0204a
    public final void n(int i) {
        o(this.f2744g.e.getResources().getString(i));
    }

    @Override // l.AbstractC0204a
    public final void o(CharSequence charSequence) {
        this.f2744g.j.setTitle(charSequence);
    }

    @Override // l.AbstractC0204a
    public final void p(boolean z2) {
        this.f3189b = z2;
        this.f2744g.j.setTitleOptional(z2);
    }
}
