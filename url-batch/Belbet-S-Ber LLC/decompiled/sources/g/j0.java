package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j0 extends j.a implements k.k {
    public final Context h;
    public final k.m i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.emoji2.text.q f1530j;

    /* renamed from: k, reason: collision with root package name */
    public WeakReference f1531k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k0 f1532l;

    public j0(k0 k0Var, Context context, androidx.emoji2.text.q qVar) {
        this.f1532l = k0Var;
        this.h = context;
        this.f1530j = qVar;
        k.m mVar = new k.m(context);
        mVar.f2219l = 1;
        this.i = mVar;
        mVar.f2214e = this;
    }

    @Override // j.a
    public final void a() {
        k0 k0Var = this.f1532l;
        if (k0Var.f1539j != this) {
            return;
        }
        if (k0Var.f1546q) {
            k0Var.f1540k = this;
            k0Var.f1541l = this.f1530j;
        } else {
            this.f1530j.A(this);
        }
        this.f1530j = null;
        k0Var.l0(false);
        ActionBarContextView actionBarContextView = k0Var.f1538g;
        if (actionBarContextView.f298p == null) {
            actionBarContextView.e();
        }
        k0Var.d.setHideOnContentScrollEnabled(k0Var.f1551v);
        k0Var.f1539j = null;
    }

    @Override // j.a
    public final View b() {
        WeakReference weakReference = this.f1531k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.a
    public final k.m c() {
        return this.i;
    }

    @Override // j.a
    public final MenuInflater d() {
        return new j.h(this.h);
    }

    @Override // j.a
    public final CharSequence e() {
        return this.f1532l.f1538g.getSubtitle();
    }

    @Override // j.a
    public final CharSequence f() {
        return this.f1532l.f1538g.getTitle();
    }

    @Override // j.a
    public final void g() {
        if (this.f1532l.f1539j != this) {
            return;
        }
        k.m mVar = this.i;
        mVar.w();
        try {
            this.f1530j.C(this, mVar);
        } finally {
            mVar.v();
        }
    }

    @Override // j.a
    public final boolean h() {
        return this.f1532l.f1538g.f306x;
    }

    @Override // j.a
    public final void i(View view) {
        this.f1532l.f1538g.setCustomView(view);
        this.f1531k = new WeakReference(view);
    }

    @Override // j.a
    public final void j(int i) {
        k(this.f1532l.f1534b.getResources().getString(i));
    }

    @Override // j.a
    public final void k(CharSequence charSequence) {
        this.f1532l.f1538g.setSubtitle(charSequence);
    }

    @Override // j.a
    public final void l(int i) {
        m(this.f1532l.f1534b.getResources().getString(i));
    }

    @Override // j.a
    public final void m(CharSequence charSequence) {
        this.f1532l.f1538g.setTitle(charSequence);
    }

    @Override // j.a
    public final void n(boolean z4) {
        this.f2077g = z4;
        this.f1532l.f1538g.setTitleOptional(z4);
    }

    @Override // k.k
    public final boolean q(k.m mVar, MenuItem menuItem) {
        androidx.emoji2.text.q qVar = this.f1530j;
        if (qVar != null) {
            return ((a0.k) qVar.f466g).r(this, menuItem);
        }
        return false;
    }

    @Override // k.k
    public final void z(k.m mVar) {
        if (this.f1530j == null) {
            return;
        }
        g();
        l.j jVar = this.f1532l.f1538g.i;
        if (jVar != null) {
            jVar.l();
        }
    }
}
