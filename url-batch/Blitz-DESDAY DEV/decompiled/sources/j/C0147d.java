package j;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import l.C0195k;

/* renamed from: j.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147d extends AbstractC0144a implements k.k {

    /* renamed from: c, reason: collision with root package name */
    public Context f2628c;
    public ActionBarContextView d;

    /* renamed from: e, reason: collision with root package name */
    public D.j f2629e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2630f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2631g;
    public k.m h;

    @Override // j.AbstractC0144a
    public final void a() {
        if (this.f2631g) {
            return;
        }
        this.f2631g = true;
        this.f2629e.B(this);
    }

    @Override // j.AbstractC0144a
    public final View b() {
        WeakReference weakReference = this.f2630f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.AbstractC0144a
    public final k.m c() {
        return this.h;
    }

    @Override // j.AbstractC0144a
    public final MenuInflater d() {
        return new C0151h(this.d.getContext());
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
        this.f2629e.C(this, this.h);
    }

    @Override // j.AbstractC0144a
    public final boolean h() {
        return this.d.f1361s;
    }

    @Override // j.AbstractC0144a
    public final void i(View view) {
        this.d.setCustomView(view);
        this.f2630f = view != null ? new WeakReference(view) : null;
    }

    @Override // j.AbstractC0144a
    public final void j(int i) {
        k(this.f2628c.getString(i));
    }

    @Override // j.AbstractC0144a
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // j.AbstractC0144a
    public final void l(int i) {
        m(this.f2628c.getString(i));
    }

    @Override // j.AbstractC0144a
    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // j.AbstractC0144a
    public final void n(boolean z2) {
        this.f2622b = z2;
        this.d.setTitleOptional(z2);
    }

    @Override // k.k
    public final void o(k.m mVar) {
        g();
        C0195k c0195k = this.d.d;
        if (c0195k != null) {
            c0195k.l();
        }
    }

    @Override // k.k
    public final boolean q(k.m mVar, MenuItem menuItem) {
        return ((T0.g) this.f2629e.f133b).p(this, menuItem);
    }
}
