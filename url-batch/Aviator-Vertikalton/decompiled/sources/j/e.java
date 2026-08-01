package j;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.InterfaceC0198k;
import k.MenuC0200m;
import l.C0268k;

/* loaded from: classes.dex */
public final class e extends AbstractC0169b implements InterfaceC0198k {

    /* renamed from: c, reason: collision with root package name */
    public Context f2815c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f2816d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2817e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2818f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2819g;
    public MenuC0200m h;

    @Override // j.AbstractC0169b
    public final void a() {
        if (this.f2819g) {
            return;
        }
        this.f2819g = true;
        this.f2817e.d(this);
    }

    @Override // j.AbstractC0169b
    public final View b() {
        WeakReference weakReference = this.f2818f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0169b
    public final MenuC0200m c() {
        return this.h;
    }

    @Override // j.AbstractC0169b
    public final MenuInflater d() {
        return new i(this.f2816d.getContext());
    }

    @Override // k.InterfaceC0198k
    public final void e(MenuC0200m menuC0200m) {
        i();
        C0268k c0268k = this.f2816d.f991d;
        if (c0268k != null) {
            c0268k.l();
        }
    }

    @Override // k.InterfaceC0198k
    public final boolean f(MenuC0200m menuC0200m, MenuItem menuItem) {
        return ((InterfaceC0168a) this.f2817e.f36b).a(this, menuItem);
    }

    @Override // j.AbstractC0169b
    public final CharSequence g() {
        return this.f2816d.getSubtitle();
    }

    @Override // j.AbstractC0169b
    public final CharSequence h() {
        return this.f2816d.getTitle();
    }

    @Override // j.AbstractC0169b
    public final void i() {
        this.f2817e.e(this, this.h);
    }

    @Override // j.AbstractC0169b
    public final boolean j() {
        return this.f2816d.f1004s;
    }

    @Override // j.AbstractC0169b
    public final void k(View view) {
        this.f2816d.setCustomView(view);
        this.f2818f = view != null ? new WeakReference(view) : null;
    }

    @Override // j.AbstractC0169b
    public final void l(int i) {
        m(this.f2815c.getString(i));
    }

    @Override // j.AbstractC0169b
    public final void m(CharSequence charSequence) {
        this.f2816d.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0169b
    public final void n(int i) {
        o(this.f2815c.getString(i));
    }

    @Override // j.AbstractC0169b
    public final void o(CharSequence charSequence) {
        this.f2816d.setTitle(charSequence);
    }

    @Override // j.AbstractC0169b
    public final void p(boolean z2) {
        this.f2808b = z2;
        this.f2816d.setTitleOptional(z2);
    }
}
