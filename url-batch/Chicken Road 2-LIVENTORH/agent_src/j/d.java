package j;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.emoji2.text.q;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d extends a implements k.k {

    /* renamed from: h, reason: collision with root package name */
    public Context f1838h;
    public ActionBarContextView i;

    /* renamed from: j, reason: collision with root package name */
    public q f1839j;

    /* renamed from: k, reason: collision with root package name */
    public WeakReference f1840k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1841l;

    /* renamed from: m, reason: collision with root package name */
    public k.m f1842m;

    @Override // j.a
    public final void a() {
        if (this.f1841l) {
            return;
        }
        this.f1841l = true;
        this.f1839j.A(this);
    }

    @Override // j.a
    public final View b() {
        WeakReference weakReference = this.f1840k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.a
    public final k.m c() {
        return this.f1842m;
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
        this.f1839j.B(this, this.f1842m);
    }

    @Override // j.a
    public final boolean h() {
        return this.i.f176x;
    }

    @Override // j.a
    public final void i(View view) {
        this.i.setCustomView(view);
        this.f1840k = view != null ? new WeakReference(view) : null;
    }

    @Override // j.a
    public final void j(int i) {
        l(this.f1838h.getString(i));
    }

    @Override // k.k
    public final boolean k(k.m mVar, MenuItem menuItem) {
        return ((a0.j) this.f1839j.f346g).n(this, menuItem);
    }

    @Override // j.a
    public final void l(CharSequence charSequence) {
        this.i.setSubtitle(charSequence);
    }

    @Override // j.a
    public final void m(int i) {
        n(this.f1838h.getString(i));
    }

    @Override // j.a
    public final void n(CharSequence charSequence) {
        this.i.setTitle(charSequence);
    }

    @Override // j.a
    public final void o(boolean z3) {
        this.f1832g = z3;
        this.i.setTitleOptional(z3);
    }

    @Override // k.k
    public final void v(k.m mVar) {
        g();
        l.l lVar = this.i.i;
        if (lVar != null) {
            lVar.n();
        }
    }
}
