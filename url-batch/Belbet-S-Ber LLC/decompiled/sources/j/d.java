package j;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.emoji2.text.q;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d extends a implements k.k {
    public Context h;
    public ActionBarContextView i;

    /* renamed from: j, reason: collision with root package name */
    public q f2083j;

    /* renamed from: k, reason: collision with root package name */
    public WeakReference f2084k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2085l;

    /* renamed from: m, reason: collision with root package name */
    public k.m f2086m;

    @Override // j.a
    public final void a() {
        if (this.f2085l) {
            return;
        }
        this.f2085l = true;
        this.f2083j.A(this);
    }

    @Override // j.a
    public final View b() {
        WeakReference weakReference = this.f2084k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.a
    public final k.m c() {
        return this.f2086m;
    }

    @Override // j.a
    public final MenuInflater d() {
        return new h(this.i.getContext());
    }

    @Override // j.a
    public final CharSequence e() {
        return this.i.getSubtitle();
    }

    @Override // j.a
    public final CharSequence f() {
        return this.i.getTitle();
    }

    @Override // j.a
    public final void g() {
        this.f2083j.C(this, this.f2086m);
    }

    @Override // j.a
    public final boolean h() {
        return this.i.f306x;
    }

    @Override // j.a
    public final void i(View view) {
        this.i.setCustomView(view);
        this.f2084k = view != null ? new WeakReference(view) : null;
    }

    @Override // j.a
    public final void j(int i) {
        k(this.h.getString(i));
    }

    @Override // j.a
    public final void k(CharSequence charSequence) {
        this.i.setSubtitle(charSequence);
    }

    @Override // j.a
    public final void l(int i) {
        m(this.h.getString(i));
    }

    @Override // j.a
    public final void m(CharSequence charSequence) {
        this.i.setTitle(charSequence);
    }

    @Override // j.a
    public final void n(boolean z4) {
        this.f2077g = z4;
        this.i.setTitleOptional(z4);
    }

    @Override // k.k
    public final boolean q(k.m mVar, MenuItem menuItem) {
        return ((a0.k) this.f2083j.f466g).r(this, menuItem);
    }

    @Override // k.k
    public final void z(k.m mVar) {
        g();
        l.j jVar = this.i.i;
        if (jVar != null) {
            jVar.l();
        }
    }
}
