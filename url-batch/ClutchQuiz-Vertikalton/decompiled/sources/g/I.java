package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.AbstractC0147a;
import java.lang.ref.WeakReference;
import k.InterfaceC0165k;
import k.MenuC0167m;
import l.C0221k;

/* loaded from: classes.dex */
public final class I extends AbstractC0147a implements InterfaceC0165k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2388c;
    public final MenuC0167m d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2389e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ J f2391g;

    public I(J j2, Context context, B.j jVar) {
        this.f2391g = j2;
        this.f2388c = context;
        this.f2389e = jVar;
        MenuC0167m menuC0167m = new MenuC0167m(context);
        menuC0167m.f2754l = 1;
        this.d = menuC0167m;
        menuC0167m.f2749e = this;
    }

    @Override // j.AbstractC0147a
    public final void a() {
        J j2 = this.f2391g;
        if (j2.i != this) {
            return;
        }
        if (j2.f2406p) {
            j2.f2400j = this;
            j2.f2401k = this.f2389e;
        } else {
            this.f2389e.C(this);
        }
        this.f2389e = null;
        j2.S(false);
        ActionBarContextView actionBarContextView = j2.f2398f;
        if (actionBarContextView.f1285k == null) {
            actionBarContextView.e();
        }
        j2.f2396c.setHideOnContentScrollEnabled(j2.f2411u);
        j2.i = null;
    }

    @Override // j.AbstractC0147a
    public final View b() {
        WeakReference weakReference = this.f2390f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0147a
    public final MenuC0167m c() {
        return this.d;
    }

    @Override // j.AbstractC0147a
    public final MenuInflater d() {
        return new j.h(this.f2388c);
    }

    @Override // j.AbstractC0147a
    public final CharSequence e() {
        return this.f2391g.f2398f.getSubtitle();
    }

    @Override // j.AbstractC0147a
    public final CharSequence f() {
        return this.f2391g.f2398f.getTitle();
    }

    @Override // j.AbstractC0147a
    public final void g() {
        if (this.f2391g.i != this) {
            return;
        }
        MenuC0167m menuC0167m = this.d;
        menuC0167m.w();
        try {
            this.f2389e.D(this, menuC0167m);
        } finally {
            menuC0167m.v();
        }
    }

    @Override // j.AbstractC0147a
    public final boolean h() {
        return this.f2391g.f2398f.f1293s;
    }

    @Override // j.AbstractC0147a
    public final void i(View view) {
        this.f2391g.f2398f.setCustomView(view);
        this.f2390f = new WeakReference(view);
    }

    @Override // j.AbstractC0147a
    public final void j(int i) {
        k(this.f2391g.f2394a.getResources().getString(i));
    }

    @Override // j.AbstractC0147a
    public final void k(CharSequence charSequence) {
        this.f2391g.f2398f.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0147a
    public final void l(int i) {
        m(this.f2391g.f2394a.getResources().getString(i));
    }

    @Override // j.AbstractC0147a
    public final void m(CharSequence charSequence) {
        this.f2391g.f2398f.setTitle(charSequence);
    }

    @Override // j.AbstractC0147a
    public final void n(boolean z2) {
        this.f2591b = z2;
        this.f2391g.f2398f.setTitleOptional(z2);
    }

    @Override // k.InterfaceC0165k
    public final void p(MenuC0167m menuC0167m) {
        if (this.f2389e == null) {
            return;
        }
        g();
        C0221k c0221k = this.f2391g.f2398f.d;
        if (c0221k != null) {
            c0221k.l();
        }
    }

    @Override // k.InterfaceC0165k
    public final boolean q(MenuC0167m menuC0167m, MenuItem menuItem) {
        B.j jVar = this.f2389e;
        if (jVar != null) {
            return ((T.w) jVar.f56b).k(this, menuItem);
        }
        return false;
    }
}
