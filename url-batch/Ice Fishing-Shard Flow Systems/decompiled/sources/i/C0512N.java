package i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import l.AbstractC0646b;
import l.InterfaceC0645a;
import n.C0716j;

/* renamed from: i.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512N extends AbstractC0646b implements m.k {

    /* renamed from: i, reason: collision with root package name */
    public final Context f5382i;

    /* renamed from: l, reason: collision with root package name */
    public final m.m f5383l;

    /* renamed from: m, reason: collision with root package name */
    public P0.e f5384m;

    /* renamed from: n, reason: collision with root package name */
    public WeakReference f5385n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0513O f5386o;

    public C0512N(C0513O c0513o, Context context, P0.e eVar) {
        this.f5386o = c0513o;
        this.f5382i = context;
        this.f5384m = eVar;
        m.m mVar = new m.m(context);
        mVar.f6420l = 1;
        this.f5383l = mVar;
        mVar.f6414e = this;
    }

    @Override // l.AbstractC0646b
    public final void a() {
        C0513O c0513o = this.f5386o;
        if (c0513o.f5397i != this) {
            return;
        }
        boolean z7 = c0513o.f5403p;
        boolean z8 = c0513o.f5404q;
        if (z7 || z8) {
            c0513o.j = this;
            c0513o.f5398k = this.f5384m;
        } else {
            this.f5384m.f(this);
        }
        this.f5384m = null;
        c0513o.v(false);
        ActionBarContextView actionBarContextView = c0513o.f5394f;
        if (actionBarContextView.f3159s == null) {
            actionBarContextView.e();
        }
        c0513o.f5391c.setHideOnContentScrollEnabled(c0513o.f5409v);
        c0513o.f5397i = null;
    }

    @Override // l.AbstractC0646b
    public final View b() {
        WeakReference weakReference = this.f5385n;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.AbstractC0646b
    public final m.m c() {
        return this.f5383l;
    }

    @Override // m.k
    public final boolean d(m.m mVar, MenuItem menuItem) {
        P0.e eVar = this.f5384m;
        if (eVar != null) {
            return ((InterfaceC0645a) eVar.f2194e).c(this, menuItem);
        }
        return false;
    }

    @Override // l.AbstractC0646b
    public final MenuInflater e() {
        return new l.j(this.f5382i);
    }

    @Override // l.AbstractC0646b
    public final CharSequence f() {
        return this.f5386o.f5394f.getSubtitle();
    }

    @Override // l.AbstractC0646b
    public final CharSequence g() {
        return this.f5386o.f5394f.getTitle();
    }

    @Override // l.AbstractC0646b
    public final void h() {
        if (this.f5386o.f5397i != this) {
            return;
        }
        m.m mVar = this.f5383l;
        mVar.w();
        try {
            this.f5384m.d(this, mVar);
        } finally {
            mVar.v();
        }
    }

    @Override // l.AbstractC0646b
    public final boolean i() {
        return this.f5386o.f5394f.f3147A;
    }

    @Override // m.k
    public final void j(m.m mVar) {
        if (this.f5384m == null) {
            return;
        }
        h();
        C0716j c0716j = this.f5386o.f5394f.f3152l;
        if (c0716j != null) {
            c0716j.l();
        }
    }

    @Override // l.AbstractC0646b
    public final void k(View view) {
        this.f5386o.f5394f.setCustomView(view);
        this.f5385n = new WeakReference(view);
    }

    @Override // l.AbstractC0646b
    public final void l(int i2) {
        m(this.f5386o.f5389a.getResources().getString(i2));
    }

    @Override // l.AbstractC0646b
    public final void m(CharSequence charSequence) {
        this.f5386o.f5394f.setSubtitle(charSequence);
    }

    @Override // l.AbstractC0646b
    public final void n(int i2) {
        o(this.f5386o.f5389a.getResources().getString(i2));
    }

    @Override // l.AbstractC0646b
    public final void o(CharSequence charSequence) {
        this.f5386o.f5394f.setTitle(charSequence);
    }

    @Override // l.AbstractC0646b
    public final void p(boolean z7) {
        this.f6203e = z7;
        this.f5386o.f5394f.setTitleOptional(z7);
    }
}
