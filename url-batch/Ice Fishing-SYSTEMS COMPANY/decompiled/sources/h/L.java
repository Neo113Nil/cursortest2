package h;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.AbstractC4614b;
import k.C4621i;
import k.InterfaceC4613a;
import l.InterfaceC4682j;
import m.C4743k;

/* loaded from: classes.dex */
public final class L extends AbstractC4614b implements InterfaceC4682j {

    /* renamed from: v, reason: collision with root package name */
    public final Context f38048v;

    /* renamed from: w, reason: collision with root package name */
    public final l.l f38049w;

    /* renamed from: x, reason: collision with root package name */
    public S0.l f38050x;

    /* renamed from: y, reason: collision with root package name */
    public WeakReference f38051y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ M f38052z;

    public L(M m8, Context context, S0.l lVar) {
        this.f38052z = m8;
        this.f38048v = context;
        this.f38050x = lVar;
        l.l lVar2 = new l.l(context);
        lVar2.f38950E = 1;
        this.f38049w = lVar2;
        lVar2.f38966x = this;
    }

    @Override // k.AbstractC4614b
    public final void a() {
        M m8 = this.f38052z;
        if (m8.i != this) {
            return;
        }
        if (m8.f38069p) {
            m8.f38063j = this;
            m8.f38064k = this.f38050x;
        } else {
            this.f38050x.i(this);
        }
        this.f38050x = null;
        m8.t(false);
        ActionBarContextView actionBarContextView = m8.f38060f;
        if (actionBarContextView.f4628D == null) {
            actionBarContextView.e();
        }
        m8.f38057c.setHideOnContentScrollEnabled(m8.f38074u);
        m8.i = null;
    }

    @Override // k.AbstractC4614b
    public final View b() {
        WeakReference weakReference = this.f38051y;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.AbstractC4614b
    public final l.l c() {
        return this.f38049w;
    }

    @Override // k.AbstractC4614b
    public final MenuInflater d() {
        return new C4621i(this.f38048v);
    }

    @Override // k.AbstractC4614b
    public final CharSequence e() {
        return this.f38052z.f38060f.getSubtitle();
    }

    @Override // k.AbstractC4614b
    public final CharSequence f() {
        return this.f38052z.f38060f.getTitle();
    }

    @Override // k.AbstractC4614b
    public final void g() {
        if (this.f38052z.i != this) {
            return;
        }
        l.l lVar = this.f38049w;
        lVar.w();
        try {
            this.f38050x.b(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override // k.AbstractC4614b
    public final boolean h() {
        return this.f38052z.f38060f.f4635L;
    }

    @Override // k.AbstractC4614b
    public final void i(View view) {
        this.f38052z.f38060f.setCustomView(view);
        this.f38051y = new WeakReference(view);
    }

    @Override // l.InterfaceC4682j
    public final void j(l.l lVar) {
        if (this.f38050x == null) {
            return;
        }
        g();
        C4743k c4743k = this.f38052z.f38060f.f4640w;
        if (c4743k != null) {
            c4743k.l();
        }
    }

    @Override // k.AbstractC4614b
    public final void k(int i) {
        l(this.f38052z.f38055a.getResources().getString(i));
    }

    @Override // k.AbstractC4614b
    public final void l(CharSequence charSequence) {
        this.f38052z.f38060f.setSubtitle(charSequence);
    }

    @Override // k.AbstractC4614b
    public final void m(int i) {
        n(this.f38052z.f38055a.getResources().getString(i));
    }

    @Override // k.AbstractC4614b
    public final void n(CharSequence charSequence) {
        this.f38052z.f38060f.setTitle(charSequence);
    }

    @Override // l.InterfaceC4682j
    public final boolean o(l.l lVar, MenuItem menuItem) {
        S0.l lVar2 = this.f38050x;
        if (lVar2 != null) {
            return ((InterfaceC4613a) lVar2.f2910u).a(this, menuItem);
        }
        return false;
    }

    @Override // k.AbstractC4614b
    public final void p(boolean z8) {
        this.f38606u = z8;
        this.f38052z.f38060f.setTitleOptional(z8);
    }
}
