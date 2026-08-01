package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.p0;
import com.oriondriftchasers.arordrft.R;
import l.k2;
import l.s1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d0 extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: g, reason: collision with root package name */
    public final Context f2002g;

    /* renamed from: h, reason: collision with root package name */
    public final m f2003h;
    public final j i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2004j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2005k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2006l;

    /* renamed from: m, reason: collision with root package name */
    public final k2 f2007m;

    /* renamed from: p, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2010p;

    /* renamed from: q, reason: collision with root package name */
    public View f2011q;

    /* renamed from: r, reason: collision with root package name */
    public View f2012r;

    /* renamed from: s, reason: collision with root package name */
    public x f2013s;

    /* renamed from: t, reason: collision with root package name */
    public ViewTreeObserver f2014t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2015u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2016v;

    /* renamed from: w, reason: collision with root package name */
    public int f2017w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2019y;

    /* renamed from: n, reason: collision with root package name */
    public final d f2008n = new d(1, this);

    /* renamed from: o, reason: collision with root package name */
    public final p0 f2009o = new p0(2, this);

    /* renamed from: x, reason: collision with root package name */
    public int f2018x = 0;

    public d0(Context context, m mVar, View view, int i, boolean z3) {
        this.f2002g = context;
        this.f2003h = mVar;
        this.f2004j = z3;
        this.i = new j(mVar, LayoutInflater.from(context), z3, R.layout.abc_popup_menu_item_layout);
        this.f2006l = i;
        Resources resources = context.getResources();
        this.f2005k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2011q = view;
        this.f2007m = new k2(context, null, i, 0);
        mVar.b(this, context);
    }

    @Override // k.y
    public final void a(m mVar, boolean z3) {
        if (mVar != this.f2003h) {
            return;
        }
        dismiss();
        x xVar = this.f2013s;
        if (xVar != null) {
            xVar.a(mVar, z3);
        }
    }

    @Override // k.c0
    public final boolean b() {
        return !this.f2015u && this.f2007m.E.isShowing();
    }

    @Override // k.y
    public final boolean d(e0 e0Var) {
        boolean z3;
        if (e0Var.hasVisibleItems()) {
            w wVar = new w(this.f2002g, e0Var, this.f2012r, this.f2004j, this.f2006l, 0);
            x xVar = this.f2013s;
            wVar.f2125h = xVar;
            u uVar = wVar.i;
            if (uVar != null) {
                uVar.l(xVar);
            }
            int size = e0Var.f2064f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z3 = false;
                    break;
                }
                MenuItem item = e0Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z3 = true;
                    break;
                }
                i++;
            }
            wVar.f2124g = z3;
            u uVar2 = wVar.i;
            if (uVar2 != null) {
                uVar2.q(z3);
            }
            wVar.f2126j = this.f2010p;
            this.f2010p = null;
            this.f2003h.c(false);
            k2 k2Var = this.f2007m;
            int i4 = k2Var.f2288k;
            int g4 = k2Var.g();
            if ((Gravity.getAbsoluteGravity(this.f2018x, this.f2011q.getLayoutDirection()) & 7) == 5) {
                i4 += this.f2011q.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f2122e != null) {
                    wVar.d(i4, g4, true, true);
                }
            }
            x xVar2 = this.f2013s;
            if (xVar2 != null) {
                xVar2.d(e0Var);
            }
            return true;
        }
        return false;
    }

    @Override // k.c0
    public final void dismiss() {
        if (b()) {
            this.f2007m.dismiss();
        }
    }

    @Override // k.c0
    public final void f() {
        View view;
        if (b()) {
            return;
        }
        if (this.f2015u || (view = this.f2011q) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2012r = view;
        k2 k2Var = this.f2007m;
        l.b0 b0Var = k2Var.E;
        l.b0 b0Var2 = k2Var.E;
        b0Var.setOnDismissListener(this);
        k2Var.f2298u = this;
        k2Var.D = true;
        b0Var2.setFocusable(true);
        View view2 = this.f2012r;
        boolean z3 = this.f2014t == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2014t = viewTreeObserver;
        if (z3) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2008n);
        }
        view2.addOnAttachStateChangeListener(this.f2009o);
        k2Var.f2297t = view2;
        k2Var.f2294q = this.f2018x;
        boolean z4 = this.f2016v;
        Context context = this.f2002g;
        j jVar = this.i;
        if (!z4) {
            this.f2017w = u.o(jVar, context, this.f2005k);
            this.f2016v = true;
        }
        k2Var.r(this.f2017w);
        b0Var2.setInputMethodMode(2);
        Rect rect = this.f2117f;
        k2Var.C = rect != null ? new Rect(rect) : null;
        k2Var.f();
        s1 s1Var = k2Var.f2286h;
        s1Var.setOnKeyListener(this);
        if (this.f2019y) {
            m mVar = this.f2003h;
            if (mVar.f2070m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) s1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(mVar.f2070m);
                }
                frameLayout.setEnabled(false);
                s1Var.addHeaderView(frameLayout, null, false);
            }
        }
        k2Var.o(jVar);
        k2Var.f();
    }

    @Override // k.y
    public final boolean h() {
        return false;
    }

    @Override // k.y
    public final Parcelable i() {
        return null;
    }

    @Override // k.c0
    public final s1 k() {
        return this.f2007m.f2286h;
    }

    @Override // k.y
    public final void l(x xVar) {
        this.f2013s = xVar;
    }

    @Override // k.y
    public final void m(boolean z3) {
        this.f2016v = false;
        j jVar = this.i;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2015u = true;
        this.f2003h.c(true);
        ViewTreeObserver viewTreeObserver = this.f2014t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2014t = this.f2012r.getViewTreeObserver();
            }
            this.f2014t.removeGlobalOnLayoutListener(this.f2008n);
            this.f2014t = null;
        }
        this.f2012r.removeOnAttachStateChangeListener(this.f2009o);
        PopupWindow.OnDismissListener onDismissListener = this.f2010p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // k.u
    public final void p(View view) {
        this.f2011q = view;
    }

    @Override // k.u
    public final void q(boolean z3) {
        this.i.f2056c = z3;
    }

    @Override // k.u
    public final void r(int i) {
        this.f2018x = i;
    }

    @Override // k.u
    public final void s(int i) {
        this.f2007m.f2288k = i;
    }

    @Override // k.u
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f2010p = onDismissListener;
    }

    @Override // k.u
    public final void u(boolean z3) {
        this.f2019y = z3;
    }

    @Override // k.u
    public final void v(int i) {
        this.f2007m.n(i);
    }

    @Override // k.y
    public final void j(Parcelable parcelable) {
    }

    @Override // k.u
    public final void n(m mVar) {
    }
}
