package j;

import T.u;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.InterfaceC0158k;
import k.MenuC0160m;
import l.C0225k;

/* loaded from: classes.dex */
public final class d extends AbstractC0139a implements InterfaceC0158k {

    /* renamed from: c, reason: collision with root package name */
    public Context f2531c;
    public ActionBarContextView d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2532e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2533f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2534g;
    public MenuC0160m h;

    @Override // j.AbstractC0139a
    public final void a() {
        if (this.f2534g) {
            return;
        }
        this.f2534g = true;
        this.f2532e.A(this);
    }

    @Override // j.AbstractC0139a
    public final View b() {
        WeakReference weakReference = this.f2533f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0139a
    public final MenuC0160m c() {
        return this.h;
    }

    @Override // j.AbstractC0139a
    public final MenuInflater d() {
        return new h(this.d.getContext());
    }

    @Override // j.AbstractC0139a
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // j.AbstractC0139a
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override // j.AbstractC0139a
    public final void g() {
        this.f2532e.C(this, this.h);
    }

    @Override // j.AbstractC0139a
    public final boolean h() {
        return this.d.f1259s;
    }

    @Override // j.AbstractC0139a
    public final void i(View view) {
        this.d.setCustomView(view);
        this.f2533f = view != null ? new WeakReference(view) : null;
    }

    @Override // j.AbstractC0139a
    public final void j(int i) {
        k(this.f2531c.getString(i));
    }

    @Override // j.AbstractC0139a
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0139a
    public final void l(int i) {
        m(this.f2531c.getString(i));
    }

    @Override // j.AbstractC0139a
    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // j.AbstractC0139a
    public final void n(boolean z2) {
        this.f2525b = z2;
        this.d.setTitleOptional(z2);
    }

    @Override // k.InterfaceC0158k
    public final void q(MenuC0160m menuC0160m) {
        g();
        C0225k c0225k = this.d.d;
        if (c0225k != null) {
            c0225k.l();
        }
    }

    @Override // k.InterfaceC0158k
    public final boolean s(MenuC0160m menuC0160m, MenuItem menuItem) {
        return ((u) this.f2532e.f25b).p(this, menuItem);
    }
}
