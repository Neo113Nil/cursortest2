package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.AbstractC0142a;
import java.lang.ref.WeakReference;
import k.InterfaceC0162k;
import k.MenuC0164m;
import l.C0216k;

/* loaded from: classes.dex */
public final class J extends AbstractC0142a implements InterfaceC0162k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2153c;
    public final MenuC0164m d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2154e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2155f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f2156g;

    public J(K k2, Context context, B.j jVar) {
        this.f2156g = k2;
        this.f2153c = context;
        this.f2154e = jVar;
        MenuC0164m menuC0164m = new MenuC0164m(context);
        menuC0164m.f2693l = 1;
        this.d = menuC0164m;
        menuC0164m.f2688e = this;
    }

    @Override // j.AbstractC0142a
    public final void a() {
        K k2 = this.f2156g;
        if (k2.i != this) {
            return;
        }
        if (k2.f2171p) {
            k2.f2165j = this;
            k2.f2166k = this.f2154e;
        } else {
            this.f2154e.B(this);
        }
        this.f2154e = null;
        k2.x0(false);
        ActionBarContextView actionBarContextView = k2.f2163f;
        if (actionBarContextView.f1265k == null) {
            actionBarContextView.e();
        }
        k2.f2161c.setHideOnContentScrollEnabled(k2.f2176u);
        k2.i = null;
    }

    @Override // j.AbstractC0142a
    public final View b() {
        WeakReference weakReference = this.f2155f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0142a
    public final MenuC0164m c() {
        return this.d;
    }

    @Override // j.AbstractC0142a
    public final MenuInflater d() {
        return new j.h(this.f2153c);
    }

    @Override // j.AbstractC0142a
    public final CharSequence e() {
        return this.f2156g.f2163f.getSubtitle();
    }

    @Override // j.AbstractC0142a
    public final CharSequence f() {
        return this.f2156g.f2163f.getTitle();
    }

    @Override // j.AbstractC0142a
    public final void g() {
        if (this.f2156g.i != this) {
            return;
        }
        MenuC0164m menuC0164m = this.d;
        menuC0164m.w();
        try {
            this.f2154e.D(this, menuC0164m);
        } finally {
            menuC0164m.v();
        }
    }

    @Override // j.AbstractC0142a
    public final boolean h() {
        return this.f2156g.f2163f.f1273s;
    }

    @Override // j.AbstractC0142a
    public final void i(View view) {
        this.f2156g.f2163f.setCustomView(view);
        this.f2155f = new WeakReference(view);
    }

    @Override // j.AbstractC0142a
    public final void j(int i) {
        k(this.f2156g.f2159a.getResources().getString(i));
    }

    @Override // j.AbstractC0142a
    public final void k(CharSequence charSequence) {
        this.f2156g.f2163f.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0142a
    public final void l(int i) {
        m(this.f2156g.f2159a.getResources().getString(i));
    }

    @Override // j.AbstractC0142a
    public final void m(CharSequence charSequence) {
        this.f2156g.f2163f.setTitle(charSequence);
    }

    @Override // j.AbstractC0142a
    public final void n(boolean z2) {
        this.f2538b = z2;
        this.f2156g.f2163f.setTitleOptional(z2);
    }

    @Override // k.InterfaceC0162k
    public final void o(MenuC0164m menuC0164m) {
        if (this.f2154e == null) {
            return;
        }
        g();
        C0216k c0216k = this.f2156g.f2163f.d;
        if (c0216k != null) {
            c0216k.l();
        }
    }

    @Override // k.InterfaceC0162k
    public final boolean p(MenuC0164m menuC0164m, MenuItem menuItem) {
        B.j jVar = this.f2154e;
        if (jVar != null) {
            return ((U.u) jVar.f31b).p(this, menuItem);
        }
        return false;
    }
}
