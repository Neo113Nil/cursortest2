package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class l0 extends j.a implements k.k {

    /* renamed from: h, reason: collision with root package name */
    public final Context f1656h;
    public final k.m i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.emoji2.text.q f1657j;

    /* renamed from: k, reason: collision with root package name */
    public WeakReference f1658k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m0 f1659l;

    public l0(m0 m0Var, Context context, androidx.emoji2.text.q qVar) {
        this.f1659l = m0Var;
        this.f1656h = context;
        this.f1657j = qVar;
        k.m mVar = new k.m(context);
        mVar.f2069l = 1;
        this.i = mVar;
        mVar.f2063e = this;
    }

    @Override // j.a
    public final void a() {
        m0 m0Var = this.f1659l;
        if (m0Var.f1668v != this) {
            return;
        }
        if (m0Var.C) {
            m0Var.f1669w = this;
            m0Var.f1670x = this.f1657j;
        } else {
            this.f1657j.A(this);
        }
        this.f1657j = null;
        m0Var.W(false);
        ActionBarContextView actionBarContextView = m0Var.f1665s;
        if (actionBarContextView.f168p == null) {
            actionBarContextView.e();
        }
        m0Var.f1662p.setHideOnContentScrollEnabled(m0Var.H);
        m0Var.f1668v = null;
    }

    @Override // j.a
    public final View b() {
        WeakReference weakReference = this.f1658k;
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
        return new j.h(this.f1656h);
    }

    @Override // j.a
    public final CharSequence e() {
        return this.f1659l.f1665s.getSubtitle();
    }

    @Override // j.a
    public final CharSequence f() {
        return this.f1659l.f1665s.getTitle();
    }

    @Override // j.a
    public final void g() {
        if (this.f1659l.f1668v != this) {
            return;
        }
        k.m mVar = this.i;
        mVar.w();
        try {
            this.f1657j.B(this, mVar);
        } finally {
            mVar.v();
        }
    }

    @Override // j.a
    public final boolean h() {
        return this.f1659l.f1665s.f176x;
    }

    @Override // j.a
    public final void i(View view) {
        this.f1659l.f1665s.setCustomView(view);
        this.f1658k = new WeakReference(view);
    }

    @Override // j.a
    public final void j(int i) {
        l(this.f1659l.f1660n.getResources().getString(i));
    }

    @Override // k.k
    public final boolean k(k.m mVar, MenuItem menuItem) {
        androidx.emoji2.text.q qVar = this.f1657j;
        if (qVar != null) {
            return ((a0.j) qVar.f346g).n(this, menuItem);
        }
        return false;
    }

    @Override // j.a
    public final void l(CharSequence charSequence) {
        this.f1659l.f1665s.setSubtitle(charSequence);
    }

    @Override // j.a
    public final void m(int i) {
        n(this.f1659l.f1660n.getResources().getString(i));
    }

    @Override // j.a
    public final void n(CharSequence charSequence) {
        this.f1659l.f1665s.setTitle(charSequence);
    }

    @Override // j.a
    public final void o(boolean z3) {
        this.f1832g = z3;
        this.f1659l.f1665s.setTitleOptional(z3);
    }

    @Override // k.k
    public final void v(k.m mVar) {
        if (this.f1657j == null) {
            return;
        }
        g();
        l.l lVar = this.f1659l.f1665s.i;
        if (lVar != null) {
            lVar.n();
        }
    }
}
