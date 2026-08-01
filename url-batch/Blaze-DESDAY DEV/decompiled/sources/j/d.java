package j;

import U.u;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.InterfaceC0164k;
import k.MenuC0166m;
import l.C0219k;

/* loaded from: classes.dex */
public final class d extends AbstractC0144a implements InterfaceC0164k {

    /* renamed from: c, reason: collision with root package name */
    public Context f2582c;
    public ActionBarContextView d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2583e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2584f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2585g;
    public MenuC0166m h;

    @Override // j.AbstractC0144a
    public final void a() {
        if (this.f2585g) {
            return;
        }
        this.f2585g = true;
        this.f2583e.B(this);
    }

    @Override // j.AbstractC0144a
    public final View b() {
        WeakReference weakReference = this.f2584f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0144a
    public final MenuC0166m c() {
        return this.h;
    }

    @Override // j.AbstractC0144a
    public final MenuInflater d() {
        return new h(this.d.getContext());
    }

    @Override // j.AbstractC0144a
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // j.AbstractC0144a
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override // j.AbstractC0144a
    public final void g() {
        this.f2583e.D(this, this.h);
    }

    @Override // j.AbstractC0144a
    public final boolean h() {
        return this.d.f1304s;
    }

    @Override // j.AbstractC0144a
    public final void i(View view) {
        this.d.setCustomView(view);
        this.f2584f = view != null ? new WeakReference(view) : null;
    }

    @Override // j.AbstractC0144a
    public final void j(int i) {
        k(this.f2582c.getString(i));
    }

    @Override // j.AbstractC0144a
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0144a
    public final void l(int i) {
        m(this.f2582c.getString(i));
    }

    @Override // j.AbstractC0144a
    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // j.AbstractC0144a
    public final void n(boolean z2) {
        this.f2576b = z2;
        this.d.setTitleOptional(z2);
    }

    @Override // k.InterfaceC0164k
    public final void p(MenuC0166m menuC0166m) {
        g();
        C0219k c0219k = this.d.d;
        if (c0219k != null) {
            c0219k.l();
        }
    }

    @Override // k.InterfaceC0164k
    public final boolean r(MenuC0166m menuC0166m, MenuItem menuItem) {
        return ((u) this.f2583e.f45b).p(this, menuItem);
    }
}
