package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
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
import com.gdmhkmf.belbet.R;
import l.h2;
import l.p1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d0 extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: g, reason: collision with root package name */
    public final Context f2156g;
    public final m h;
    public final j i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2157j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2158k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2159l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2160m;

    /* renamed from: n, reason: collision with root package name */
    public final h2 f2161n;

    /* renamed from: q, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2164q;

    /* renamed from: r, reason: collision with root package name */
    public View f2165r;

    /* renamed from: s, reason: collision with root package name */
    public View f2166s;

    /* renamed from: t, reason: collision with root package name */
    public x f2167t;

    /* renamed from: u, reason: collision with root package name */
    public ViewTreeObserver f2168u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2169v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2170w;

    /* renamed from: x, reason: collision with root package name */
    public int f2171x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2173z;

    /* renamed from: o, reason: collision with root package name */
    public final d f2162o = new d(1, this);

    /* renamed from: p, reason: collision with root package name */
    public final p0 f2163p = new p0(2, this);

    /* renamed from: y, reason: collision with root package name */
    public int f2172y = 0;

    public d0(int i, int i4, Context context, View view, m mVar, boolean z4) {
        this.f2156g = context;
        this.h = mVar;
        this.f2157j = z4;
        this.i = new j(mVar, LayoutInflater.from(context), z4, R.layout.abc_popup_menu_item_layout);
        this.f2159l = i;
        this.f2160m = i4;
        Resources resources = context.getResources();
        this.f2158k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2165r = view;
        this.f2161n = new h2(context, null, i, i4);
        mVar.b(this, context);
    }

    @Override // k.y
    public final void a(m mVar, boolean z4) {
        if (mVar != this.h) {
            return;
        }
        dismiss();
        x xVar = this.f2167t;
        if (xVar != null) {
            xVar.a(mVar, z4);
        }
    }

    @Override // k.c0
    public final boolean b() {
        return !this.f2169v && this.f2161n.E.isShowing();
    }

    @Override // k.y
    public final boolean d(e0 e0Var) {
        boolean z4;
        if (e0Var.hasVisibleItems()) {
            w wVar = new w(this.f2159l, this.f2160m, this.f2156g, this.f2166s, e0Var, this.f2157j);
            x xVar = this.f2167t;
            wVar.i = xVar;
            u uVar = wVar.f2273j;
            if (uVar != null) {
                uVar.i(xVar);
            }
            int size = e0Var.f2215f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z4 = false;
                    break;
                }
                MenuItem item = e0Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z4 = true;
                    break;
                }
                i++;
            }
            wVar.h = z4;
            u uVar2 = wVar.f2273j;
            if (uVar2 != null) {
                uVar2.o(z4);
            }
            wVar.f2274k = this.f2164q;
            this.f2164q = null;
            this.h.c(false);
            h2 h2Var = this.f2161n;
            int i4 = h2Var.f2410k;
            int n4 = h2Var.n();
            if ((Gravity.getAbsoluteGravity(this.f2172y, this.f2165r.getLayoutDirection()) & 7) == 5) {
                i4 += this.f2165r.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f2271f != null) {
                    wVar.d(i4, n4, true, true);
                }
            }
            x xVar2 = this.f2167t;
            if (xVar2 != null) {
                xVar2.n(e0Var);
            }
            return true;
        }
        return false;
    }

    @Override // k.c0
    public final void dismiss() {
        if (b()) {
            this.f2161n.dismiss();
        }
    }

    @Override // k.c0
    public final void e() {
        View view;
        if (b()) {
            return;
        }
        if (this.f2169v || (view = this.f2165r) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2166s = view;
        h2 h2Var = this.f2161n;
        l.y yVar = h2Var.E;
        l.y yVar2 = h2Var.E;
        yVar.setOnDismissListener(this);
        h2Var.f2420u = this;
        h2Var.D = true;
        yVar2.setFocusable(true);
        View view2 = this.f2166s;
        boolean z4 = this.f2168u == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2168u = viewTreeObserver;
        if (z4) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2162o);
        }
        view2.addOnAttachStateChangeListener(this.f2163p);
        h2Var.f2419t = view2;
        h2Var.f2416q = this.f2172y;
        boolean z5 = this.f2170w;
        Context context = this.f2156g;
        j jVar = this.i;
        if (!z5) {
            this.f2171x = u.m(jVar, context, this.f2158k);
            this.f2170w = true;
        }
        h2Var.r(this.f2171x);
        yVar2.setInputMethodMode(2);
        Rect rect = this.f2265f;
        h2Var.C = rect != null ? new Rect(rect) : null;
        h2Var.e();
        p1 p1Var = h2Var.h;
        p1Var.setOnKeyListener(this);
        if (this.f2173z) {
            m mVar = this.h;
            if (mVar.f2220m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) p1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(mVar.f2220m);
                }
                frameLayout.setEnabled(false);
                p1Var.addHeaderView(frameLayout, null, false);
            }
        }
        h2Var.p(jVar);
        h2Var.e();
    }

    @Override // k.y
    public final void g() {
        this.f2170w = false;
        j jVar = this.i;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // k.c0
    public final p1 h() {
        return this.f2161n.h;
    }

    @Override // k.y
    public final void i(x xVar) {
        this.f2167t = xVar;
    }

    @Override // k.y
    public final boolean k() {
        return false;
    }

    @Override // k.u
    public final void n(View view) {
        this.f2165r = view;
    }

    @Override // k.u
    public final void o(boolean z4) {
        this.i.f2207c = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2169v = true;
        this.h.c(true);
        ViewTreeObserver viewTreeObserver = this.f2168u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2168u = this.f2166s.getViewTreeObserver();
            }
            this.f2168u.removeGlobalOnLayoutListener(this.f2162o);
            this.f2168u = null;
        }
        this.f2166s.removeOnAttachStateChangeListener(this.f2163p);
        PopupWindow.OnDismissListener onDismissListener = this.f2164q;
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
    public final void p(int i) {
        this.f2172y = i;
    }

    @Override // k.u
    public final void q(int i) {
        this.f2161n.f2410k = i;
    }

    @Override // k.u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2164q = onDismissListener;
    }

    @Override // k.u
    public final void s(boolean z4) {
        this.f2173z = z4;
    }

    @Override // k.u
    public final void t(int i) {
        this.f2161n.j(i);
    }

    @Override // k.u
    public final void l(m mVar) {
    }
}
