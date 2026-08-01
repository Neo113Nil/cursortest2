package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.AbstractC0144a;
import j.C0151h;
import java.lang.ref.WeakReference;
import l.C0195k;

/* loaded from: classes.dex */
public final class J extends AbstractC0144a implements k.k {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2255c;
    public final k.m d;

    /* renamed from: e, reason: collision with root package name */
    public D.j f2256e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2257f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f2258g;

    public J(K k2, Context context, D.j jVar) {
        this.f2258g = k2;
        this.f2255c = context;
        this.f2256e = jVar;
        k.m mVar = new k.m(context);
        mVar.f2773l = 1;
        this.d = mVar;
        mVar.f2768e = this;
    }

    @Override // j.AbstractC0144a
    public final void a() {
        K k2 = this.f2258g;
        if (k2.i != this) {
            return;
        }
        if (k2.f2273p) {
            k2.f2267j = this;
            k2.f2268k = this.f2256e;
        } else {
            this.f2256e.B(this);
        }
        this.f2256e = null;
        k2.y0(false);
        ActionBarContextView actionBarContextView = k2.f2265f;
        if (actionBarContextView.f1353k == null) {
            actionBarContextView.e();
        }
        k2.f2263c.setHideOnContentScrollEnabled(k2.f2278u);
        k2.i = null;
    }

    @Override // j.AbstractC0144a
    public final View b() {
        WeakReference weakReference = this.f2257f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0144a
    public final k.m c() {
        return this.d;
    }

    @Override // j.AbstractC0144a
    public final MenuInflater d() {
        return new C0151h(this.f2255c);
    }

    @Override // j.AbstractC0144a
    public final CharSequence e() {
        return this.f2258g.f2265f.getSubtitle();
    }

    @Override // j.AbstractC0144a
    public final CharSequence f() {
        return this.f2258g.f2265f.getTitle();
    }

    @Override // j.AbstractC0144a
    public final void g() {
        if (this.f2258g.i != this) {
            return;
        }
        k.m mVar = this.d;
        mVar.w();
        try {
            this.f2256e.C(this, mVar);
        } finally {
            mVar.v();
        }
    }

    @Override // j.AbstractC0144a
    public final boolean h() {
        return this.f2258g.f2265f.f1361s;
    }

    @Override // j.AbstractC0144a
    public final void i(View view) {
        this.f2258g.f2265f.setCustomView(view);
        this.f2257f = new WeakReference(view);
    }

    @Override // j.AbstractC0144a
    public final void j(int i) {
        k(this.f2258g.f2261a.getResources().getString(i));
    }

    @Override // j.AbstractC0144a
    public final void k(CharSequence charSequence) {
        this.f2258g.f2265f.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0144a
    public final void l(int i) {
        m(this.f2258g.f2261a.getResources().getString(i));
    }

    @Override // j.AbstractC0144a
    public final void m(CharSequence charSequence) {
        this.f2258g.f2265f.setTitle(charSequence);
    }

    @Override // j.AbstractC0144a
    public final void n(boolean z2) {
        this.f2622b = z2;
        this.f2258g.f2265f.setTitleOptional(z2);
    }

    @Override // k.k
    public final void o(k.m mVar) {
        if (this.f2256e == null) {
            return;
        }
        g();
        C0195k c0195k = this.f2258g.f2265f.d;
        if (c0195k != null) {
            c0195k.l();
        }
    }

    @Override // k.k
    public final boolean q(k.m mVar, MenuItem menuItem) {
        D.j jVar = this.f2256e;
        if (jVar != null) {
            return ((T0.g) jVar.f133b).p(this, menuItem);
        }
        return false;
    }
}
