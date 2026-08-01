package j;

import U.u;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.InterfaceC0162k;
import k.MenuC0164m;
import l.C0216k;

/* loaded from: classes.dex */
public final class d extends AbstractC0142a implements InterfaceC0162k {

    /* renamed from: c, reason: collision with root package name */
    public Context f2544c;
    public ActionBarContextView d;

    /* renamed from: e, reason: collision with root package name */
    public B.j f2545e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2546f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2547g;
    public MenuC0164m h;

    @Override // j.AbstractC0142a
    public final void a() {
        if (this.f2547g) {
            return;
        }
        this.f2547g = true;
        this.f2545e.B(this);
    }

    @Override // j.AbstractC0142a
    public final View b() {
        WeakReference weakReference = this.f2546f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0142a
    public final MenuC0164m c() {
        return this.h;
    }

    @Override // j.AbstractC0142a
    public final MenuInflater d() {
        return new h(this.d.getContext());
    }

    @Override // j.AbstractC0142a
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // j.AbstractC0142a
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override // j.AbstractC0142a
    public final void g() {
        this.f2545e.D(this, this.h);
    }

    @Override // j.AbstractC0142a
    public final boolean h() {
        return this.d.f1273s;
    }

    @Override // j.AbstractC0142a
    public final void i(View view) {
        this.d.setCustomView(view);
        this.f2546f = view != null ? new WeakReference(view) : null;
    }

    @Override // j.AbstractC0142a
    public final void j(int i) {
        k(this.f2544c.getString(i));
    }

    @Override // j.AbstractC0142a
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0142a
    public final void l(int i) {
        m(this.f2544c.getString(i));
    }

    @Override // j.AbstractC0142a
    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // j.AbstractC0142a
    public final void n(boolean z2) {
        this.f2538b = z2;
        this.d.setTitleOptional(z2);
    }

    @Override // k.InterfaceC0162k
    public final void o(MenuC0164m menuC0164m) {
        g();
        C0216k c0216k = this.d.d;
        if (c0216k != null) {
            c0216k.l();
        }
    }

    @Override // k.InterfaceC0162k
    public final boolean p(MenuC0164m menuC0164m, MenuItem menuItem) {
        return ((u) this.f2545e.f31b).p(this, menuItem);
    }
}
