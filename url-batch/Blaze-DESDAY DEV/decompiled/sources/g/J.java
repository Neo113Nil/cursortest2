package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.AbstractC0144a;
import java.lang.ref.WeakReference;
import k.InterfaceC0164k;
import k.MenuC0166m;
import l.C0219k;

/* loaded from: classes.dex */
public final class J extends AbstractC0144a implements InterfaceC0164k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2193c;
    public final MenuC0166m d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2194e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2195f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f2196g;

    public J(K k2, Context context, B.j jVar) {
        this.f2196g = k2;
        this.f2193c = context;
        this.f2194e = jVar;
        MenuC0166m menuC0166m = new MenuC0166m(context);
        menuC0166m.f2721l = 1;
        this.d = menuC0166m;
        menuC0166m.f2716e = this;
    }

    @Override // j.AbstractC0144a
    public final void a() {
        K k2 = this.f2196g;
        if (k2.i != this) {
            return;
        }
        if (k2.f2211p) {
            k2.f2205j = this;
            k2.f2206k = this.f2194e;
        } else {
            this.f2194e.B(this);
        }
        this.f2194e = null;
        k2.v0(false);
        ActionBarContextView actionBarContextView = k2.f2203f;
        if (actionBarContextView.f1296k == null) {
            actionBarContextView.e();
        }
        k2.f2201c.setHideOnContentScrollEnabled(k2.f2216u);
        k2.i = null;
    }

    @Override // j.AbstractC0144a
    public final View b() {
        WeakReference weakReference = this.f2195f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0144a
    public final MenuC0166m c() {
        return this.d;
    }

    @Override // j.AbstractC0144a
    public final MenuInflater d() {
        return new j.h(this.f2193c);
    }

    @Override // j.AbstractC0144a
    public final CharSequence e() {
        return this.f2196g.f2203f.getSubtitle();
    }

    @Override // j.AbstractC0144a
    public final CharSequence f() {
        return this.f2196g.f2203f.getTitle();
    }

    @Override // j.AbstractC0144a
    public final void g() {
        if (this.f2196g.i != this) {
            return;
        }
        MenuC0166m menuC0166m = this.d;
        menuC0166m.w();
        try {
            this.f2194e.D(this, menuC0166m);
        } finally {
            menuC0166m.v();
        }
    }

    @Override // j.AbstractC0144a
    public final boolean h() {
        return this.f2196g.f2203f.f1304s;
    }

    @Override // j.AbstractC0144a
    public final void i(View view) {
        this.f2196g.f2203f.setCustomView(view);
        this.f2195f = new WeakReference(view);
    }

    @Override // j.AbstractC0144a
    public final void j(int i) {
        k(this.f2196g.f2199a.getResources().getString(i));
    }

    @Override // j.AbstractC0144a
    public final void k(CharSequence charSequence) {
        this.f2196g.f2203f.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0144a
    public final void l(int i) {
        m(this.f2196g.f2199a.getResources().getString(i));
    }

    @Override // j.AbstractC0144a
    public final void m(CharSequence charSequence) {
        this.f2196g.f2203f.setTitle(charSequence);
    }

    @Override // j.AbstractC0144a
    public final void n(boolean z2) {
        this.f2576b = z2;
        this.f2196g.f2203f.setTitleOptional(z2);
    }

    @Override // k.InterfaceC0164k
    public final void p(MenuC0166m menuC0166m) {
        if (this.f2194e == null) {
            return;
        }
        g();
        C0219k c0219k = this.f2196g.f2203f.d;
        if (c0219k != null) {
            c0219k.l();
        }
    }

    @Override // k.InterfaceC0164k
    public final boolean r(MenuC0166m menuC0166m, MenuItem menuItem) {
        B.j jVar = this.f2194e;
        if (jVar != null) {
            return ((U.u) jVar.f45b).p(this, menuItem);
        }
        return false;
    }
}
