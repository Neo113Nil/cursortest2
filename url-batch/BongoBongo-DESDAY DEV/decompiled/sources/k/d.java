package k;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import l.InterfaceC0167k;
import l.MenuC0169m;
import m.C0221k;

/* loaded from: classes.dex */
public final class d extends AbstractC0147a implements InterfaceC0167k {

    /* renamed from: c, reason: collision with root package name */
    public Context f2679c;
    public ActionBarContextView d;

    /* renamed from: e, reason: collision with root package name */
    public C.j f2680e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2681f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2682g;

    /* renamed from: h, reason: collision with root package name */
    public MenuC0169m f2683h;

    @Override // k.AbstractC0147a
    public final void a() {
        if (this.f2682g) {
            return;
        }
        this.f2682g = true;
        this.f2680e.B(this);
    }

    @Override // k.AbstractC0147a
    public final View b() {
        WeakReference weakReference = this.f2681f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.AbstractC0147a
    public final MenuC0169m c() {
        return this.f2683h;
    }

    @Override // k.AbstractC0147a
    public final MenuInflater d() {
        return new h(this.d.getContext());
    }

    @Override // k.AbstractC0147a
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // k.AbstractC0147a
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override // k.AbstractC0147a
    public final void g() {
        this.f2680e.C(this, this.f2683h);
    }

    @Override // k.AbstractC0147a
    public final boolean h() {
        return this.d.f1357s;
    }

    @Override // k.AbstractC0147a
    public final void i(View view) {
        this.d.setCustomView(view);
        this.f2681f = view != null ? new WeakReference(view) : null;
    }

    @Override // k.AbstractC0147a
    public final void j(int i) {
        k(this.f2679c.getString(i));
    }

    @Override // k.AbstractC0147a
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // k.AbstractC0147a
    public final void l(int i) {
        m(this.f2679c.getString(i));
    }

    @Override // k.AbstractC0147a
    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // k.AbstractC0147a
    public final void n(boolean z2) {
        this.f2673b = z2;
        this.d.setTitleOptional(z2);
    }

    @Override // l.InterfaceC0167k
    public final boolean o(MenuC0169m menuC0169m, MenuItem menuItem) {
        return ((S0.g) this.f2680e.f86b).p(this, menuItem);
    }

    @Override // l.InterfaceC0167k
    public final void q(MenuC0169m menuC0169m) {
        g();
        C0221k c0221k = this.d.d;
        if (c0221k != null) {
            c0221k.l();
        }
    }
}
