package l;

import V.v;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import m.InterfaceC0227k;
import m.MenuC0229m;
import n.C0282k;

/* loaded from: classes.dex */
public final class d extends AbstractC0204a implements InterfaceC0227k {

    /* renamed from: c, reason: collision with root package name */
    public Context f3195c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f3196d;
    public B1.c e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f3197f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3198g;

    /* renamed from: h, reason: collision with root package name */
    public MenuC0229m f3199h;

    @Override // l.AbstractC0204a
    public final void a() {
        if (this.f3198g) {
            return;
        }
        this.f3198g = true;
        this.e.C(this);
    }

    @Override // l.AbstractC0204a
    public final View b() {
        WeakReference weakReference = this.f3197f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // m.InterfaceC0227k
    public final boolean c(MenuC0229m menuC0229m, MenuItem menuItem) {
        return ((v) this.e.f68b).p(this, menuItem);
    }

    @Override // l.AbstractC0204a
    public final MenuC0229m d() {
        return this.f3199h;
    }

    @Override // l.AbstractC0204a
    public final MenuInflater e() {
        return new h(this.f3196d.getContext());
    }

    @Override // m.InterfaceC0227k
    public final void f(MenuC0229m menuC0229m) {
        i();
        C0282k c0282k = this.f3196d.f1711d;
        if (c0282k != null) {
            c0282k.l();
        }
    }

    @Override // l.AbstractC0204a
    public final CharSequence g() {
        return this.f3196d.getSubtitle();
    }

    @Override // l.AbstractC0204a
    public final CharSequence h() {
        return this.f3196d.getTitle();
    }

    @Override // l.AbstractC0204a
    public final void i() {
        this.e.E(this, this.f3199h);
    }

    @Override // l.AbstractC0204a
    public final boolean j() {
        return this.f3196d.f1723s;
    }

    @Override // l.AbstractC0204a
    public final void k(View view) {
        this.f3196d.setCustomView(view);
        this.f3197f = view != null ? new WeakReference(view) : null;
    }

    @Override // l.AbstractC0204a
    public final void l(int i) {
        m(this.f3195c.getString(i));
    }

    @Override // l.AbstractC0204a
    public final void m(CharSequence charSequence) {
        this.f3196d.setSubtitle(charSequence);
    }

    @Override // l.AbstractC0204a
    public final void n(int i) {
        o(this.f3195c.getString(i));
    }

    @Override // l.AbstractC0204a
    public final void o(CharSequence charSequence) {
        this.f3196d.setTitle(charSequence);
    }

    @Override // l.AbstractC0204a
    public final void p(boolean z2) {
        this.f3189b = z2;
        this.f3196d.setTitleOptional(z2);
    }
}
