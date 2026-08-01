package j;

import T.u;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.InterfaceC0159k;
import k.MenuC0161m;
import l.C0226k;

/* loaded from: classes.dex */
public final class d extends AbstractC0140a implements InterfaceC0159k {

    /* renamed from: c, reason: collision with root package name */
    public Context f2480c;
    public ActionBarContextView d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2481e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2482f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2483g;
    public MenuC0161m h;

    @Override // j.AbstractC0140a
    public final void a() {
        if (this.f2483g) {
            return;
        }
        this.f2483g = true;
        this.f2481e.A(this);
    }

    @Override // j.AbstractC0140a
    public final View b() {
        WeakReference weakReference = this.f2482f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0140a
    public final MenuC0161m c() {
        return this.h;
    }

    @Override // j.AbstractC0140a
    public final MenuInflater d() {
        return new h(this.d.getContext());
    }

    @Override // j.AbstractC0140a
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // j.AbstractC0140a
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override // j.AbstractC0140a
    public final void g() {
        this.f2481e.C(this, this.h);
    }

    @Override // j.AbstractC0140a
    public final boolean h() {
        return this.d.f1214s;
    }

    @Override // j.AbstractC0140a
    public final void i(View view) {
        this.d.setCustomView(view);
        this.f2482f = view != null ? new WeakReference(view) : null;
    }

    @Override // j.AbstractC0140a
    public final void j(int i) {
        k(this.f2480c.getString(i));
    }

    @Override // j.AbstractC0140a
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0140a
    public final void l(int i) {
        m(this.f2480c.getString(i));
    }

    @Override // j.AbstractC0140a
    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // j.AbstractC0140a
    public final void n(boolean z2) {
        this.f2474b = z2;
        this.d.setTitleOptional(z2);
    }

    @Override // k.InterfaceC0159k
    public final void o(MenuC0161m menuC0161m) {
        g();
        C0226k c0226k = this.d.d;
        if (c0226k != null) {
            c0226k.l();
        }
    }

    @Override // k.InterfaceC0159k
    public final boolean q(MenuC0161m menuC0161m, MenuItem menuItem) {
        return ((u) this.f2481e.f27b).p(this, menuItem);
    }
}
