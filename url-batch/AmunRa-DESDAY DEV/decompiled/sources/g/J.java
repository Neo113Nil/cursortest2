package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.AbstractC0138a;
import java.lang.ref.WeakReference;
import k.InterfaceC0156k;
import k.MenuC0158m;
import l.C0223k;

/* loaded from: classes.dex */
public final class J extends AbstractC0138a implements InterfaceC0156k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2330c;
    public final MenuC0158m d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2331e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2332f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f2333g;

    public J(K k2, Context context, B.j jVar) {
        this.f2333g = k2;
        this.f2330c = context;
        this.f2331e = jVar;
        MenuC0158m menuC0158m = new MenuC0158m(context);
        menuC0158m.f2610l = 1;
        this.d = menuC0158m;
        menuC0158m.f2605e = this;
    }

    @Override // j.AbstractC0138a
    public final void a() {
        K k2 = this.f2333g;
        if (k2.f2346p != this) {
            return;
        }
        if (k2.f2353w) {
            k2.f2347q = this;
            k2.f2348r = this.f2331e;
        } else {
            this.f2331e.A(this);
        }
        this.f2331e = null;
        k2.k0(false);
        ActionBarContextView actionBarContextView = k2.f2343m;
        if (actionBarContextView.f1181k == null) {
            actionBarContextView.e();
        }
        k2.f2340j.setHideOnContentScrollEnabled(k2.f2336B);
        k2.f2346p = null;
    }

    @Override // j.AbstractC0138a
    public final View b() {
        WeakReference weakReference = this.f2332f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0138a
    public final MenuC0158m c() {
        return this.d;
    }

    @Override // j.AbstractC0138a
    public final MenuInflater d() {
        return new j.h(this.f2330c);
    }

    @Override // k.InterfaceC0156k
    public final void e(MenuC0158m menuC0158m) {
        if (this.f2331e == null) {
            return;
        }
        i();
        C0223k c0223k = this.f2333g.f2343m.d;
        if (c0223k != null) {
            c0223k.l();
        }
    }

    @Override // k.InterfaceC0156k
    public final boolean f(MenuC0158m menuC0158m, MenuItem menuItem) {
        B.j jVar = this.f2331e;
        if (jVar != null) {
            return ((T.u) jVar.f25b).p(this, menuItem);
        }
        return false;
    }

    @Override // j.AbstractC0138a
    public final CharSequence g() {
        return this.f2333g.f2343m.getSubtitle();
    }

    @Override // j.AbstractC0138a
    public final CharSequence h() {
        return this.f2333g.f2343m.getTitle();
    }

    @Override // j.AbstractC0138a
    public final void i() {
        if (this.f2333g.f2346p != this) {
            return;
        }
        MenuC0158m menuC0158m = this.d;
        menuC0158m.w();
        try {
            this.f2331e.C(this, menuC0158m);
        } finally {
            menuC0158m.v();
        }
    }

    @Override // j.AbstractC0138a
    public final boolean j() {
        return this.f2333g.f2343m.f1189s;
    }

    @Override // j.AbstractC0138a
    public final void k(View view) {
        this.f2333g.f2343m.setCustomView(view);
        this.f2332f = new WeakReference(view);
    }

    @Override // j.AbstractC0138a
    public final void l(int i) {
        m(this.f2333g.h.getResources().getString(i));
    }

    @Override // j.AbstractC0138a
    public final void m(CharSequence charSequence) {
        this.f2333g.f2343m.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0138a
    public final void n(int i) {
        o(this.f2333g.h.getResources().getString(i));
    }

    @Override // j.AbstractC0138a
    public final void o(CharSequence charSequence) {
        this.f2333g.f2343m.setTitle(charSequence);
    }

    @Override // j.AbstractC0138a
    public final void p(boolean z2) {
        this.f2469b = z2;
        this.f2333g.f2343m.setTitleOptional(z2);
    }
}
