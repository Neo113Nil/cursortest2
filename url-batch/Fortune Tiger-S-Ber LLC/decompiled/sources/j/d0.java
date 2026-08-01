package j;

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
import com.gglhk.bofio.fortunetiger.R;
import k.h2;
import k.p1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d0 extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context g;
    public final m h;

    /* renamed from: i, reason: collision with root package name */
    public final j f2135i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2136j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2137k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2138l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2139m;

    /* renamed from: n, reason: collision with root package name */
    public final h2 f2140n;

    /* renamed from: q, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2143q;

    /* renamed from: r, reason: collision with root package name */
    public View f2144r;

    /* renamed from: s, reason: collision with root package name */
    public View f2145s;

    /* renamed from: t, reason: collision with root package name */
    public x f2146t;

    /* renamed from: u, reason: collision with root package name */
    public ViewTreeObserver f2147u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2148v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2149w;

    /* renamed from: x, reason: collision with root package name */
    public int f2150x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2152z;

    /* renamed from: o, reason: collision with root package name */
    public final d f2141o = new d(1, this);

    /* renamed from: p, reason: collision with root package name */
    public final p0 f2142p = new p0(2, this);

    /* renamed from: y, reason: collision with root package name */
    public int f2151y = 0;

    public d0(int i4, int i5, Context context, View view, m mVar, boolean z3) {
        this.g = context;
        this.h = mVar;
        this.f2136j = z3;
        this.f2135i = new j(mVar, LayoutInflater.from(context), z3, R.layout.abc_popup_menu_item_layout);
        this.f2138l = i4;
        this.f2139m = i5;
        Resources resources = context.getResources();
        this.f2137k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2144r = view;
        this.f2140n = new h2(context, null, i4, i5);
        mVar.b(this, context);
    }

    @Override // j.y
    public final void a(m mVar, boolean z3) {
        if (mVar != this.h) {
            return;
        }
        dismiss();
        x xVar = this.f2146t;
        if (xVar != null) {
            xVar.a(mVar, z3);
        }
    }

    @Override // j.c0
    public final boolean b() {
        return !this.f2148v && this.f2140n.E.isShowing();
    }

    @Override // j.c0
    public final void c() {
        View view;
        if (b()) {
            return;
        }
        if (this.f2148v || (view = this.f2144r) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2145s = view;
        h2 h2Var = this.f2140n;
        k.z zVar = h2Var.E;
        k.z zVar2 = h2Var.E;
        zVar.setOnDismissListener(this);
        h2Var.f2521u = this;
        h2Var.D = true;
        zVar2.setFocusable(true);
        View view2 = this.f2145s;
        boolean z3 = this.f2147u == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2147u = viewTreeObserver;
        if (z3) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2141o);
        }
        view2.addOnAttachStateChangeListener(this.f2142p);
        h2Var.f2520t = view2;
        h2Var.f2517q = this.f2151y;
        boolean z4 = this.f2149w;
        Context context = this.g;
        j jVar = this.f2135i;
        if (!z4) {
            this.f2150x = u.m(jVar, context, this.f2137k);
            this.f2149w = true;
        }
        h2Var.r(this.f2150x);
        zVar2.setInputMethodMode(2);
        Rect rect = this.f2242f;
        h2Var.C = rect != null ? new Rect(rect) : null;
        h2Var.c();
        p1 p1Var = h2Var.h;
        p1Var.setOnKeyListener(this);
        if (this.f2152z) {
            m mVar = this.h;
            if (mVar.f2198m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) p1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(mVar.f2198m);
                }
                frameLayout.setEnabled(false);
                p1Var.addHeaderView(frameLayout, null, false);
            }
        }
        h2Var.p(jVar);
        h2Var.c();
    }

    @Override // j.c0
    public final void dismiss() {
        if (b()) {
            this.f2140n.dismiss();
        }
    }

    @Override // j.y
    public final void e() {
        this.f2149w = false;
        j jVar = this.f2135i;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // j.c0
    public final p1 f() {
        return this.f2140n.h;
    }

    @Override // j.y
    public final boolean h() {
        return false;
    }

    @Override // j.y
    public final void j(x xVar) {
        this.f2146t = xVar;
    }

    @Override // j.y
    public final boolean k(e0 e0Var) {
        boolean z3;
        if (e0Var.hasVisibleItems()) {
            w wVar = new w(this.f2138l, this.f2139m, this.g, this.f2145s, e0Var, this.f2136j);
            x xVar = this.f2146t;
            wVar.f2249i = xVar;
            u uVar = wVar.f2250j;
            if (uVar != null) {
                uVar.j(xVar);
            }
            int size = e0Var.f2193f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z3 = false;
                    break;
                }
                MenuItem item = e0Var.getItem(i4);
                if (item.isVisible() && item.getIcon() != null) {
                    z3 = true;
                    break;
                }
                i4++;
            }
            wVar.h = z3;
            u uVar2 = wVar.f2250j;
            if (uVar2 != null) {
                uVar2.o(z3);
            }
            wVar.f2251k = this.f2143q;
            this.f2143q = null;
            this.h.c(false);
            h2 h2Var = this.f2140n;
            int i5 = h2Var.f2511k;
            int n3 = h2Var.n();
            if ((Gravity.getAbsoluteGravity(this.f2151y, this.f2144r.getLayoutDirection()) & 7) == 5) {
                i5 += this.f2144r.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f2248f != null) {
                    wVar.d(i5, n3, true, true);
                }
            }
            x xVar2 = this.f2146t;
            if (xVar2 != null) {
                xVar2.i(e0Var);
            }
            return true;
        }
        return false;
    }

    @Override // j.u
    public final void n(View view) {
        this.f2144r = view;
    }

    @Override // j.u
    public final void o(boolean z3) {
        this.f2135i.c = z3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2148v = true;
        this.h.c(true);
        ViewTreeObserver viewTreeObserver = this.f2147u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2147u = this.f2145s.getViewTreeObserver();
            }
            this.f2147u.removeGlobalOnLayoutListener(this.f2141o);
            this.f2147u = null;
        }
        this.f2145s.removeOnAttachStateChangeListener(this.f2142p);
        PopupWindow.OnDismissListener onDismissListener = this.f2143q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i4 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // j.u
    public final void p(int i4) {
        this.f2151y = i4;
    }

    @Override // j.u
    public final void q(int i4) {
        this.f2140n.f2511k = i4;
    }

    @Override // j.u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2143q = onDismissListener;
    }

    @Override // j.u
    public final void s(boolean z3) {
        this.f2152z = z3;
    }

    @Override // j.u
    public final void t(int i4) {
        this.f2140n.i(i4);
    }

    @Override // j.u
    public final void l(m mVar) {
    }
}
