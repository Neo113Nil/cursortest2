package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.AbstractC0140a;
import java.lang.ref.WeakReference;
import k.InterfaceC0159k;
import k.MenuC0161m;
import l.C0226k;

/* loaded from: classes.dex */
public final class J extends AbstractC0140a implements InterfaceC0159k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2331c;
    public final MenuC0161m d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2332e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2333f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f2334g;

    public J(K k2, Context context, B.j jVar) {
        this.f2334g = k2;
        this.f2331c = context;
        this.f2332e = jVar;
        MenuC0161m menuC0161m = new MenuC0161m(context);
        menuC0161m.f2620l = 1;
        this.d = menuC0161m;
        menuC0161m.f2615e = this;
    }

    @Override // j.AbstractC0140a
    public final void a() {
        K k2 = this.f2334g;
        if (k2.i != this) {
            return;
        }
        if (k2.f2349p) {
            k2.f2343j = this;
            k2.f2344k = this.f2332e;
        } else {
            this.f2332e.A(this);
        }
        this.f2332e = null;
        k2.u0(false);
        ActionBarContextView actionBarContextView = k2.f2341f;
        if (actionBarContextView.f1206k == null) {
            actionBarContextView.e();
        }
        k2.f2339c.setHideOnContentScrollEnabled(k2.f2354u);
        k2.i = null;
    }

    @Override // j.AbstractC0140a
    public final View b() {
        WeakReference weakReference = this.f2333f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0140a
    public final MenuC0161m c() {
        return this.d;
    }

    @Override // j.AbstractC0140a
    public final MenuInflater d() {
        return new j.h(this.f2331c);
    }

    @Override // j.AbstractC0140a
    public final CharSequence e() {
        return this.f2334g.f2341f.getSubtitle();
    }

    @Override // j.AbstractC0140a
    public final CharSequence f() {
        return this.f2334g.f2341f.getTitle();
    }

    @Override // j.AbstractC0140a
    public final void g() {
        if (this.f2334g.i != this) {
            return;
        }
        MenuC0161m menuC0161m = this.d;
        menuC0161m.w();
        try {
            this.f2332e.C(this, menuC0161m);
        } finally {
            menuC0161m.v();
        }
    }

    @Override // j.AbstractC0140a
    public final boolean h() {
        return this.f2334g.f2341f.f1214s;
    }

    @Override // j.AbstractC0140a
    public final void i(View view) {
        this.f2334g.f2341f.setCustomView(view);
        this.f2333f = new WeakReference(view);
    }

    @Override // j.AbstractC0140a
    public final void j(int i) {
        k(this.f2334g.f2337a.getResources().getString(i));
    }

    @Override // j.AbstractC0140a
    public final void k(CharSequence charSequence) {
        this.f2334g.f2341f.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0140a
    public final void l(int i) {
        m(this.f2334g.f2337a.getResources().getString(i));
    }

    @Override // j.AbstractC0140a
    public final void m(CharSequence charSequence) {
        this.f2334g.f2341f.setTitle(charSequence);
    }

    @Override // j.AbstractC0140a
    public final void n(boolean z2) {
        this.f2474b = z2;
        this.f2334g.f2341f.setTitleOptional(z2);
    }

    @Override // k.InterfaceC0159k
    public final void o(MenuC0161m menuC0161m) {
        if (this.f2332e == null) {
            return;
        }
        g();
        C0226k c0226k = this.f2334g.f2341f.d;
        if (c0226k != null) {
            c0226k.l();
        }
    }

    @Override // k.InterfaceC0159k
    public final boolean q(MenuC0161m menuC0161m, MenuItem menuItem) {
        B.j jVar = this.f2332e;
        if (jVar != null) {
            return ((T.u) jVar.f27b).p(this, menuItem);
        }
        return false;
    }
}
