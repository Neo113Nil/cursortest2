package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.AbstractC0170b;
import j.InterfaceC0169a;
import java.lang.ref.WeakReference;
import k.InterfaceC0200k;
import k.MenuC0202m;
import l.C0270k;

/* loaded from: classes.dex */
public final class N extends AbstractC0170b implements InterfaceC0200k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2516c;

    /* renamed from: d, reason: collision with root package name */
    public final MenuC0202m f2517d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2518e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2519f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O f2520g;

    public N(O o2, Context context, B.j jVar) {
        this.f2520g = o2;
        this.f2516c = context;
        this.f2518e = jVar;
        MenuC0202m menuC0202m = new MenuC0202m(context);
        menuC0202m.f3070l = 1;
        this.f2517d = menuC0202m;
        menuC0202m.f3065e = this;
    }

    @Override // j.AbstractC0170b
    public final void a() {
        O o2 = this.f2520g;
        if (o2.i != this) {
            return;
        }
        if (o2.f2536p) {
            o2.f2530j = this;
            o2.f2531k = this.f2518e;
        } else {
            this.f2518e.d(this);
        }
        this.f2518e = null;
        o2.p(false);
        ActionBarContextView actionBarContextView = o2.f2528f;
        if (actionBarContextView.f997k == null) {
            actionBarContextView.e();
        }
        o2.f2525c.setHideOnContentScrollEnabled(o2.f2541u);
        o2.i = null;
    }

    @Override // j.AbstractC0170b
    public final View b() {
        WeakReference weakReference = this.f2519f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0170b
    public final MenuC0202m c() {
        return this.f2517d;
    }

    @Override // j.AbstractC0170b
    public final MenuInflater d() {
        return new j.i(this.f2516c);
    }

    @Override // j.AbstractC0170b
    public final CharSequence e() {
        return this.f2520g.f2528f.getSubtitle();
    }

    @Override // j.AbstractC0170b
    public final CharSequence f() {
        return this.f2520g.f2528f.getTitle();
    }

    @Override // j.AbstractC0170b
    public final void g() {
        if (this.f2520g.i != this) {
            return;
        }
        MenuC0202m menuC0202m = this.f2517d;
        menuC0202m.w();
        try {
            this.f2518e.e(this, menuC0202m);
        } finally {
            menuC0202m.v();
        }
    }

    @Override // j.AbstractC0170b
    public final boolean h() {
        return this.f2520g.f2528f.f1005s;
    }

    @Override // j.AbstractC0170b
    public final void i(View view) {
        this.f2520g.f2528f.setCustomView(view);
        this.f2519f = new WeakReference(view);
    }

    @Override // j.AbstractC0170b
    public final void j(int i) {
        k(this.f2520g.f2523a.getResources().getString(i));
    }

    @Override // j.AbstractC0170b
    public final void k(CharSequence charSequence) {
        this.f2520g.f2528f.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0170b
    public final void l(int i) {
        m(this.f2520g.f2523a.getResources().getString(i));
    }

    @Override // j.AbstractC0170b
    public final void m(CharSequence charSequence) {
        this.f2520g.f2528f.setTitle(charSequence);
    }

    @Override // j.AbstractC0170b
    public final void n(boolean z2) {
        this.f2812b = z2;
        this.f2520g.f2528f.setTitleOptional(z2);
    }

    @Override // k.InterfaceC0200k
    public final void p(MenuC0202m menuC0202m) {
        if (this.f2518e == null) {
            return;
        }
        g();
        C0270k c0270k = this.f2520g.f2528f.f992d;
        if (c0270k != null) {
            c0270k.l();
        }
    }

    @Override // k.InterfaceC0200k
    public final boolean r(MenuC0202m menuC0202m, MenuItem menuItem) {
        B.j jVar = this.f2518e;
        if (jVar != null) {
            return ((InterfaceC0169a) jVar.f36b).a(this, menuItem);
        }
        return false;
    }
}
