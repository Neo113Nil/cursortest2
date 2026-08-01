package i;

import a2.s;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.emoji2.text.w;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d extends a implements j.k {
    public Context h;

    /* renamed from: i, reason: collision with root package name */
    public ActionBarContextView f2034i;

    /* renamed from: j, reason: collision with root package name */
    public s f2035j;

    /* renamed from: k, reason: collision with root package name */
    public WeakReference f2036k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2037l;

    /* renamed from: m, reason: collision with root package name */
    public j.m f2038m;

    @Override // i.a
    public final void a() {
        if (this.f2037l) {
            return;
        }
        this.f2037l = true;
        this.f2035j.A(this);
    }

    @Override // i.a
    public final View b() {
        WeakReference weakReference = this.f2036k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // i.a
    public final j.m c() {
        return this.f2038m;
    }

    @Override // i.a
    public final MenuInflater d() {
        return new h(this.f2034i.getContext());
    }

    @Override // i.a
    public final CharSequence e() {
        return this.f2034i.getSubtitle();
    }

    @Override // i.a
    public final CharSequence f() {
        return this.f2034i.getTitle();
    }

    @Override // i.a
    public final void g() {
        this.f2035j.C(this, this.f2038m);
    }

    @Override // i.a
    public final boolean h() {
        return this.f2034i.f198x;
    }

    @Override // i.a
    public final void i(View view) {
        this.f2034i.setCustomView(view);
        this.f2036k = view != null ? new WeakReference(view) : null;
    }

    @Override // j.k
    public final void j(j.m mVar) {
        g();
        k.k kVar = this.f2034i.f183i;
        if (kVar != null) {
            kVar.l();
        }
    }

    @Override // i.a
    public final void k(int i4) {
        m(this.h.getString(i4));
    }

    @Override // j.k
    public final boolean l(j.m mVar, MenuItem menuItem) {
        return ((w) this.f2035j.g).o(this, menuItem);
    }

    @Override // i.a
    public final void m(CharSequence charSequence) {
        this.f2034i.setSubtitle(charSequence);
    }

    @Override // i.a
    public final void n(int i4) {
        o(this.h.getString(i4));
    }

    @Override // i.a
    public final void o(CharSequence charSequence) {
        this.f2034i.setTitle(charSequence);
    }

    @Override // i.a
    public final void p(boolean z3) {
        this.g = z3;
        this.f2034i.setTitleOptional(z3);
    }
}
