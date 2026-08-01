package j;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.InterfaceC0187k;
import k.MenuC0189m;
import l.C0242k;
import u0.C0385x;

/* loaded from: classes.dex */
public final class d extends AbstractC0164a implements InterfaceC0187k {

    /* renamed from: c, reason: collision with root package name */
    public Context f3026c;
    public ActionBarContextView d;

    /* renamed from: e, reason: collision with root package name */
    public C0385x f3027e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f3028f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3029g;
    public MenuC0189m h;

    @Override // j.AbstractC0164a
    public final void a() {
        if (this.f3029g) {
            return;
        }
        this.f3029g = true;
        this.f3027e.x(this);
    }

    @Override // j.AbstractC0164a
    public final View b() {
        WeakReference weakReference = this.f3028f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0164a
    public final MenuC0189m c() {
        return this.h;
    }

    @Override // j.AbstractC0164a
    public final MenuInflater d() {
        return new h(this.d.getContext());
    }

    @Override // j.AbstractC0164a
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // k.InterfaceC0187k
    public final void f(MenuC0189m menuC0189m) {
        i();
        C0242k c0242k = this.d.d;
        if (c0242k != null) {
            c0242k.l();
        }
    }

    @Override // k.InterfaceC0187k
    public final boolean g(MenuC0189m menuC0189m, MenuItem menuItem) {
        return ((T0.m) this.f3027e.f4231b).s(this, menuItem);
    }

    @Override // j.AbstractC0164a
    public final CharSequence h() {
        return this.d.getTitle();
    }

    @Override // j.AbstractC0164a
    public final void i() {
        this.f3027e.z(this, this.h);
    }

    @Override // j.AbstractC0164a
    public final boolean j() {
        return this.d.f1677s;
    }

    @Override // j.AbstractC0164a
    public final void k(View view) {
        this.d.setCustomView(view);
        this.f3028f = view != null ? new WeakReference(view) : null;
    }

    @Override // j.AbstractC0164a
    public final void l(int i) {
        m(this.f3026c.getString(i));
    }

    @Override // j.AbstractC0164a
    public final void m(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0164a
    public final void n(int i) {
        o(this.f3026c.getString(i));
    }

    @Override // j.AbstractC0164a
    public final void o(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // j.AbstractC0164a
    public final void p(boolean z2) {
        this.f3020b = z2;
        this.d.setTitleOptional(z2);
    }
}
