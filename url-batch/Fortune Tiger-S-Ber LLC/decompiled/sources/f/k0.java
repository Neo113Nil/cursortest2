package f;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class k0 extends i.a implements j.k {
    public final Context h;

    /* renamed from: i, reason: collision with root package name */
    public final j.m f1613i;

    /* renamed from: j, reason: collision with root package name */
    public a2.s f1614j;

    /* renamed from: k, reason: collision with root package name */
    public WeakReference f1615k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0 f1616l;

    public k0(l0 l0Var, Context context, a2.s sVar) {
        this.f1616l = l0Var;
        this.h = context;
        this.f1614j = sVar;
        j.m mVar = new j.m(context);
        mVar.f2197l = 1;
        this.f1613i = mVar;
        mVar.f2192e = this;
    }

    @Override // i.a
    public final void a() {
        l0 l0Var = this.f1616l;
        if (l0Var.f1623n != this) {
            return;
        }
        if (l0Var.f1630u) {
            l0Var.f1624o = this;
            l0Var.f1625p = this.f1614j;
        } else {
            this.f1614j.A(this);
        }
        this.f1614j = null;
        l0Var.l0(false);
        ActionBarContextView actionBarContextView = l0Var.f1620k;
        if (actionBarContextView.f190p == null) {
            actionBarContextView.e();
        }
        l0Var.h.setHideOnContentScrollEnabled(l0Var.f1635z);
        l0Var.f1623n = null;
    }

    @Override // i.a
    public final View b() {
        WeakReference weakReference = this.f1615k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // i.a
    public final j.m c() {
        return this.f1613i;
    }

    @Override // i.a
    public final MenuInflater d() {
        return new i.h(this.h);
    }

    @Override // i.a
    public final CharSequence e() {
        return this.f1616l.f1620k.getSubtitle();
    }

    @Override // i.a
    public final CharSequence f() {
        return this.f1616l.f1620k.getTitle();
    }

    @Override // i.a
    public final void g() {
        if (this.f1616l.f1623n != this) {
            return;
        }
        j.m mVar = this.f1613i;
        mVar.w();
        try {
            this.f1614j.C(this, mVar);
        } finally {
            mVar.v();
        }
    }

    @Override // i.a
    public final boolean h() {
        return this.f1616l.f1620k.f198x;
    }

    @Override // i.a
    public final void i(View view) {
        this.f1616l.f1620k.setCustomView(view);
        this.f1615k = new WeakReference(view);
    }

    @Override // j.k
    public final void j(j.m mVar) {
        if (this.f1614j == null) {
            return;
        }
        g();
        k.k kVar = this.f1616l.f1620k.f183i;
        if (kVar != null) {
            kVar.l();
        }
    }

    @Override // i.a
    public final void k(int i4) {
        m(this.f1616l.f1617f.getResources().getString(i4));
    }

    @Override // j.k
    public final boolean l(j.m mVar, MenuItem menuItem) {
        a2.s sVar = this.f1614j;
        if (sVar != null) {
            return ((androidx.emoji2.text.w) sVar.g).o(this, menuItem);
        }
        return false;
    }

    @Override // i.a
    public final void m(CharSequence charSequence) {
        this.f1616l.f1620k.setSubtitle(charSequence);
    }

    @Override // i.a
    public final void n(int i4) {
        o(this.f1616l.f1617f.getResources().getString(i4));
    }

    @Override // i.a
    public final void o(CharSequence charSequence) {
        this.f1616l.f1620k.setTitle(charSequence);
    }

    @Override // i.a
    public final void p(boolean z3) {
        this.g = z3;
        this.f1616l.f1620k.setTitleOptional(z3);
    }
}
