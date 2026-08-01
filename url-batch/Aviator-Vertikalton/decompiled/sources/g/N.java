package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.AbstractC0169b;
import j.InterfaceC0168a;
import java.lang.ref.WeakReference;
import k.InterfaceC0198k;
import k.MenuC0200m;
import l.C0268k;

/* loaded from: classes.dex */
public final class N extends AbstractC0169b implements InterfaceC0198k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2512c;

    /* renamed from: d, reason: collision with root package name */
    public final MenuC0200m f2513d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2514e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2515f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O f2516g;

    public N(O o2, Context context, B.j jVar) {
        this.f2516g = o2;
        this.f2512c = context;
        this.f2514e = jVar;
        MenuC0200m menuC0200m = new MenuC0200m(context);
        menuC0200m.f3066l = 1;
        this.f2513d = menuC0200m;
        menuC0200m.f3061e = this;
    }

    @Override // j.AbstractC0169b
    public final void a() {
        O o2 = this.f2516g;
        if (o2.i != this) {
            return;
        }
        if (o2.f2532p) {
            o2.f2526j = this;
            o2.f2527k = this.f2514e;
        } else {
            this.f2514e.d(this);
        }
        this.f2514e = null;
        o2.p(false);
        ActionBarContextView actionBarContextView = o2.f2524f;
        if (actionBarContextView.f996k == null) {
            actionBarContextView.e();
        }
        o2.f2521c.setHideOnContentScrollEnabled(o2.f2537u);
        o2.i = null;
    }

    @Override // j.AbstractC0169b
    public final View b() {
        WeakReference weakReference = this.f2515f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0169b
    public final MenuC0200m c() {
        return this.f2513d;
    }

    @Override // j.AbstractC0169b
    public final MenuInflater d() {
        return new j.i(this.f2512c);
    }

    @Override // k.InterfaceC0198k
    public final void e(MenuC0200m menuC0200m) {
        if (this.f2514e == null) {
            return;
        }
        i();
        C0268k c0268k = this.f2516g.f2524f.f991d;
        if (c0268k != null) {
            c0268k.l();
        }
    }

    @Override // k.InterfaceC0198k
    public final boolean f(MenuC0200m menuC0200m, MenuItem menuItem) {
        B.j jVar = this.f2514e;
        if (jVar != null) {
            return ((InterfaceC0168a) jVar.f36b).a(this, menuItem);
        }
        return false;
    }

    @Override // j.AbstractC0169b
    public final CharSequence g() {
        return this.f2516g.f2524f.getSubtitle();
    }

    @Override // j.AbstractC0169b
    public final CharSequence h() {
        return this.f2516g.f2524f.getTitle();
    }

    @Override // j.AbstractC0169b
    public final void i() {
        if (this.f2516g.i != this) {
            return;
        }
        MenuC0200m menuC0200m = this.f2513d;
        menuC0200m.w();
        try {
            this.f2514e.e(this, menuC0200m);
        } finally {
            menuC0200m.v();
        }
    }

    @Override // j.AbstractC0169b
    public final boolean j() {
        return this.f2516g.f2524f.f1004s;
    }

    @Override // j.AbstractC0169b
    public final void k(View view) {
        this.f2516g.f2524f.setCustomView(view);
        this.f2515f = new WeakReference(view);
    }

    @Override // j.AbstractC0169b
    public final void l(int i) {
        m(this.f2516g.f2519a.getResources().getString(i));
    }

    @Override // j.AbstractC0169b
    public final void m(CharSequence charSequence) {
        this.f2516g.f2524f.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0169b
    public final void n(int i) {
        o(this.f2516g.f2519a.getResources().getString(i));
    }

    @Override // j.AbstractC0169b
    public final void o(CharSequence charSequence) {
        this.f2516g.f2524f.setTitle(charSequence);
    }

    @Override // j.AbstractC0169b
    public final void p(boolean z2) {
        this.f2808b = z2;
        this.f2516g.f2524f.setTitleOptional(z2);
    }
}
