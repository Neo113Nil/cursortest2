package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.AbstractC0164a;
import java.lang.ref.WeakReference;
import k.InterfaceC0187k;
import k.MenuC0189m;
import l.C0242k;
import u0.C0385x;

/* loaded from: classes.dex */
public final class J extends AbstractC0164a implements InterfaceC0187k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2610c;
    public final MenuC0189m d;

    /* renamed from: e, reason: collision with root package name */
    public C0385x f2611e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2612f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f2613g;

    public J(K k2, Context context, C0385x c0385x) {
        this.f2613g = k2;
        this.f2610c = context;
        this.f2611e = c0385x;
        MenuC0189m menuC0189m = new MenuC0189m(context);
        menuC0189m.f3171l = 1;
        this.d = menuC0189m;
        menuC0189m.f3166e = this;
    }

    @Override // j.AbstractC0164a
    public final void a() {
        K k2 = this.f2613g;
        if (k2.f2622l != this) {
            return;
        }
        if (k2.f2629s) {
            k2.f2623m = this;
            k2.f2624n = this.f2611e;
        } else {
            this.f2611e.x(this);
        }
        this.f2611e = null;
        k2.D(false);
        ActionBarContextView actionBarContextView = k2.i;
        if (actionBarContextView.f1669k == null) {
            actionBarContextView.e();
        }
        k2.f2618f.setHideOnContentScrollEnabled(k2.f2634x);
        k2.f2622l = null;
    }

    @Override // j.AbstractC0164a
    public final View b() {
        WeakReference weakReference = this.f2612f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0164a
    public final MenuC0189m c() {
        return this.d;
    }

    @Override // j.AbstractC0164a
    public final MenuInflater d() {
        return new j.h(this.f2610c);
    }

    @Override // j.AbstractC0164a
    public final CharSequence e() {
        return this.f2613g.i.getSubtitle();
    }

    @Override // k.InterfaceC0187k
    public final void f(MenuC0189m menuC0189m) {
        if (this.f2611e == null) {
            return;
        }
        i();
        C0242k c0242k = this.f2613g.i.d;
        if (c0242k != null) {
            c0242k.l();
        }
    }

    @Override // k.InterfaceC0187k
    public final boolean g(MenuC0189m menuC0189m, MenuItem menuItem) {
        C0385x c0385x = this.f2611e;
        if (c0385x != null) {
            return ((T0.m) c0385x.f4231b).s(this, menuItem);
        }
        return false;
    }

    @Override // j.AbstractC0164a
    public final CharSequence h() {
        return this.f2613g.i.getTitle();
    }

    @Override // j.AbstractC0164a
    public final void i() {
        if (this.f2613g.f2622l != this) {
            return;
        }
        MenuC0189m menuC0189m = this.d;
        menuC0189m.w();
        try {
            this.f2611e.z(this, menuC0189m);
        } finally {
            menuC0189m.v();
        }
    }

    @Override // j.AbstractC0164a
    public final boolean j() {
        return this.f2613g.i.f1677s;
    }

    @Override // j.AbstractC0164a
    public final void k(View view) {
        this.f2613g.i.setCustomView(view);
        this.f2612f = new WeakReference(view);
    }

    @Override // j.AbstractC0164a
    public final void l(int i) {
        m(this.f2613g.d.getResources().getString(i));
    }

    @Override // j.AbstractC0164a
    public final void m(CharSequence charSequence) {
        this.f2613g.i.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0164a
    public final void n(int i) {
        o(this.f2613g.d.getResources().getString(i));
    }

    @Override // j.AbstractC0164a
    public final void o(CharSequence charSequence) {
        this.f2613g.i.setTitle(charSequence);
    }

    @Override // j.AbstractC0164a
    public final void p(boolean z2) {
        this.f3020b = z2;
        this.f2613g.i.setTitleOptional(z2);
    }
}
