package l;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import n.C0716j;

/* renamed from: l.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650f extends AbstractC0646b implements m.k {

    /* renamed from: i, reason: collision with root package name */
    public Context f6210i;

    /* renamed from: l, reason: collision with root package name */
    public ActionBarContextView f6211l;

    /* renamed from: m, reason: collision with root package name */
    public P0.e f6212m;

    /* renamed from: n, reason: collision with root package name */
    public WeakReference f6213n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6214o;

    /* renamed from: p, reason: collision with root package name */
    public m.m f6215p;

    @Override // l.AbstractC0646b
    public final void a() {
        if (this.f6214o) {
            return;
        }
        this.f6214o = true;
        this.f6212m.f(this);
    }

    @Override // l.AbstractC0646b
    public final View b() {
        WeakReference weakReference = this.f6213n;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.AbstractC0646b
    public final m.m c() {
        return this.f6215p;
    }

    @Override // m.k
    public final boolean d(m.m mVar, MenuItem menuItem) {
        return ((InterfaceC0645a) this.f6212m.f2194e).c(this, menuItem);
    }

    @Override // l.AbstractC0646b
    public final MenuInflater e() {
        return new j(this.f6211l.getContext());
    }

    @Override // l.AbstractC0646b
    public final CharSequence f() {
        return this.f6211l.getSubtitle();
    }

    @Override // l.AbstractC0646b
    public final CharSequence g() {
        return this.f6211l.getTitle();
    }

    @Override // l.AbstractC0646b
    public final void h() {
        this.f6212m.d(this, this.f6215p);
    }

    @Override // l.AbstractC0646b
    public final boolean i() {
        return this.f6211l.f3147A;
    }

    @Override // m.k
    public final void j(m.m mVar) {
        h();
        C0716j c0716j = this.f6211l.f3152l;
        if (c0716j != null) {
            c0716j.l();
        }
    }

    @Override // l.AbstractC0646b
    public final void k(View view) {
        this.f6211l.setCustomView(view);
        this.f6213n = view != null ? new WeakReference(view) : null;
    }

    @Override // l.AbstractC0646b
    public final void l(int i2) {
        m(this.f6210i.getString(i2));
    }

    @Override // l.AbstractC0646b
    public final void m(CharSequence charSequence) {
        this.f6211l.setSubtitle(charSequence);
    }

    @Override // l.AbstractC0646b
    public final void n(int i2) {
        o(this.f6210i.getString(i2));
    }

    @Override // l.AbstractC0646b
    public final void o(CharSequence charSequence) {
        this.f6211l.setTitle(charSequence);
    }

    @Override // l.AbstractC0646b
    public final void p(boolean z7) {
        this.f6203e = z7;
        this.f6211l.setTitleOptional(z7);
    }
}
