package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.AbstractC0139a;
import java.lang.ref.WeakReference;
import k.InterfaceC0158k;
import k.MenuC0160m;
import l.C0225k;

/* loaded from: classes.dex */
public final class J extends AbstractC0139a implements InterfaceC0158k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2392c;
    public final MenuC0160m d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2393e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2394f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f2395g;

    public J(K k2, Context context, B.j jVar) {
        this.f2395g = k2;
        this.f2392c = context;
        this.f2393e = jVar;
        MenuC0160m menuC0160m = new MenuC0160m(context);
        menuC0160m.f2669l = 1;
        this.d = menuC0160m;
        menuC0160m.f2664e = this;
    }

    @Override // j.AbstractC0139a
    public final void a() {
        K k2 = this.f2395g;
        if (k2.i != this) {
            return;
        }
        if (k2.f2410p) {
            k2.f2404j = this;
            k2.f2405k = this.f2393e;
        } else {
            this.f2393e.A(this);
        }
        this.f2393e = null;
        k2.l0(false);
        ActionBarContextView actionBarContextView = k2.f2402f;
        if (actionBarContextView.f1251k == null) {
            actionBarContextView.e();
        }
        k2.f2400c.setHideOnContentScrollEnabled(k2.f2415u);
        k2.i = null;
    }

    @Override // j.AbstractC0139a
    public final View b() {
        WeakReference weakReference = this.f2394f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0139a
    public final MenuC0160m c() {
        return this.d;
    }

    @Override // j.AbstractC0139a
    public final MenuInflater d() {
        return new j.h(this.f2392c);
    }

    @Override // j.AbstractC0139a
    public final CharSequence e() {
        return this.f2395g.f2402f.getSubtitle();
    }

    @Override // j.AbstractC0139a
    public final CharSequence f() {
        return this.f2395g.f2402f.getTitle();
    }

    @Override // j.AbstractC0139a
    public final void g() {
        if (this.f2395g.i != this) {
            return;
        }
        MenuC0160m menuC0160m = this.d;
        menuC0160m.w();
        try {
            this.f2393e.C(this, menuC0160m);
        } finally {
            menuC0160m.v();
        }
    }

    @Override // j.AbstractC0139a
    public final boolean h() {
        return this.f2395g.f2402f.f1259s;
    }

    @Override // j.AbstractC0139a
    public final void i(View view) {
        this.f2395g.f2402f.setCustomView(view);
        this.f2394f = new WeakReference(view);
    }

    @Override // j.AbstractC0139a
    public final void j(int i) {
        k(this.f2395g.f2398a.getResources().getString(i));
    }

    @Override // j.AbstractC0139a
    public final void k(CharSequence charSequence) {
        this.f2395g.f2402f.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0139a
    public final void l(int i) {
        m(this.f2395g.f2398a.getResources().getString(i));
    }

    @Override // j.AbstractC0139a
    public final void m(CharSequence charSequence) {
        this.f2395g.f2402f.setTitle(charSequence);
    }

    @Override // j.AbstractC0139a
    public final void n(boolean z2) {
        this.f2525b = z2;
        this.f2395g.f2402f.setTitleOptional(z2);
    }

    @Override // k.InterfaceC0158k
    public final void q(MenuC0160m menuC0160m) {
        if (this.f2393e == null) {
            return;
        }
        g();
        C0225k c0225k = this.f2395g.f2402f.d;
        if (c0225k != null) {
            c0225k.l();
        }
    }

    @Override // k.InterfaceC0158k
    public final boolean s(MenuC0160m menuC0160m, MenuItem menuItem) {
        B.j jVar = this.f2393e;
        if (jVar != null) {
            return ((T.u) jVar.f25b).p(this, menuItem);
        }
        return false;
    }
}
