package j;

import T.w;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.InterfaceC0165k;
import k.MenuC0167m;
import l.C0221k;

/* loaded from: classes.dex */
public final class d extends AbstractC0147a implements InterfaceC0165k {

    /* renamed from: c, reason: collision with root package name */
    public Context f2597c;
    public ActionBarContextView d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2598e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2599f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2600g;
    public MenuC0167m h;

    @Override // j.AbstractC0147a
    public final void a() {
        if (this.f2600g) {
            return;
        }
        this.f2600g = true;
        this.f2598e.C(this);
    }

    @Override // j.AbstractC0147a
    public final View b() {
        WeakReference weakReference = this.f2599f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0147a
    public final MenuC0167m c() {
        return this.h;
    }

    @Override // j.AbstractC0147a
    public final MenuInflater d() {
        return new h(this.d.getContext());
    }

    @Override // j.AbstractC0147a
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // j.AbstractC0147a
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override // j.AbstractC0147a
    public final void g() {
        this.f2598e.D(this, this.h);
    }

    @Override // j.AbstractC0147a
    public final boolean h() {
        return this.d.f1293s;
    }

    @Override // j.AbstractC0147a
    public final void i(View view) {
        this.d.setCustomView(view);
        this.f2599f = view != null ? new WeakReference(view) : null;
    }

    @Override // j.AbstractC0147a
    public final void j(int i) {
        k(this.f2597c.getString(i));
    }

    @Override // j.AbstractC0147a
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0147a
    public final void l(int i) {
        m(this.f2597c.getString(i));
    }

    @Override // j.AbstractC0147a
    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // j.AbstractC0147a
    public final void n(boolean z2) {
        this.f2591b = z2;
        this.d.setTitleOptional(z2);
    }

    @Override // k.InterfaceC0165k
    public final void p(MenuC0167m menuC0167m) {
        g();
        C0221k c0221k = this.d.d;
        if (c0221k != null) {
            c0221k.l();
        }
    }

    @Override // k.InterfaceC0165k
    public final boolean q(MenuC0167m menuC0167m, MenuItem menuItem) {
        return ((w) this.f2598e.f56b).k(this, menuItem);
    }
}
