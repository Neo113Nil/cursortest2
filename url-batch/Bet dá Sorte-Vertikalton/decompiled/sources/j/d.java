package j;

import T.u;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.InterfaceC0155k;
import k.MenuC0157m;
import l.C0219k;

/* loaded from: classes.dex */
public final class d extends AbstractC0137a implements InterfaceC0155k {

    /* renamed from: c, reason: collision with root package name */
    public Context f2519c;
    public ActionBarContextView d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2520e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2521f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2522g;
    public MenuC0157m h;

    @Override // j.AbstractC0137a
    public final void a() {
        if (this.f2522g) {
            return;
        }
        this.f2522g = true;
        this.f2520e.A(this);
    }

    @Override // j.AbstractC0137a
    public final View b() {
        WeakReference weakReference = this.f2521f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0137a
    public final MenuC0157m c() {
        return this.h;
    }

    @Override // j.AbstractC0137a
    public final MenuInflater d() {
        return new h(this.d.getContext());
    }

    @Override // j.AbstractC0137a
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // j.AbstractC0137a
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override // j.AbstractC0137a
    public final void g() {
        this.f2520e.C(this, this.h);
    }

    @Override // j.AbstractC0137a
    public final boolean h() {
        return this.d.f1228s;
    }

    @Override // j.AbstractC0137a
    public final void i(View view) {
        this.d.setCustomView(view);
        this.f2521f = view != null ? new WeakReference(view) : null;
    }

    @Override // j.AbstractC0137a
    public final void j(int i) {
        k(this.f2519c.getString(i));
    }

    @Override // j.AbstractC0137a
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0137a
    public final void l(int i) {
        m(this.f2519c.getString(i));
    }

    @Override // j.AbstractC0137a
    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // j.AbstractC0137a
    public final void n(boolean z2) {
        this.f2513b = z2;
        this.d.setTitleOptional(z2);
    }

    @Override // k.InterfaceC0155k
    public final void q(MenuC0157m menuC0157m) {
        g();
        C0219k c0219k = this.d.d;
        if (c0219k != null) {
            c0219k.l();
        }
    }

    @Override // k.InterfaceC0155k
    public final boolean s(MenuC0157m menuC0157m, MenuItem menuItem) {
        return ((u) this.f2520e.f53b).p(this, menuItem);
    }
}
