package defpackage;

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
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class cf0 extends z10 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context g;
    public final r10 h;
    public final o10 i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;
    public final f20 n;
    public PopupWindow.OnDismissListener q;
    public View r;
    public View s;
    public g20 t;
    public ViewTreeObserver u;
    public boolean v;
    public boolean w;
    public int x;
    public boolean z;
    public final p5 o = new p5(3, this);
    public final ta p = new ta(5, this);
    public int y = 0;

    public cf0(int i, int i2, r10 r10Var, Context context, View view, boolean z) {
        this.g = context;
        this.h = r10Var;
        this.j = z;
        this.i = new o10(r10Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.l = i;
        this.m = i2;
        Resources resources = context.getResources();
        this.k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.r = view;
        this.n = new f20(context, null, i, i2);
        r10Var.b(this, context);
    }

    @Override // defpackage.h20
    public final void a(r10 r10Var, boolean z) {
        if (r10Var != this.h) {
            return;
        }
        dismiss();
        g20 g20Var = this.t;
        if (g20Var != null) {
            g20Var.a(r10Var, z);
        }
    }

    @Override // defpackage.vd0
    public final boolean b() {
        return !this.v && this.n.E.isShowing();
    }

    @Override // defpackage.vd0
    public final void d() {
        View view;
        if (b()) {
            return;
        }
        if (this.v || (view = this.r) == null) {
            s9.u("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.s = view;
        f20 f20Var = this.n;
        h5 h5Var = f20Var.E;
        h5 h5Var2 = f20Var.E;
        h5Var.setOnDismissListener(this);
        f20Var.u = this;
        f20Var.D = true;
        h5Var2.setFocusable(true);
        View view2 = this.s;
        boolean z = this.u == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.u = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.o);
        }
        view2.addOnAttachStateChangeListener(this.p);
        f20Var.t = view2;
        f20Var.q = this.y;
        boolean z2 = this.w;
        Context context = this.g;
        o10 o10Var = this.i;
        if (!z2) {
            this.x = z10.m(o10Var, context, this.k);
            this.w = true;
        }
        f20Var.r(this.x);
        h5Var2.setInputMethodMode(2);
        Rect rect = this.f;
        f20Var.C = rect != null ? new Rect(rect) : null;
        f20Var.d();
        xk xkVar = f20Var.h;
        xkVar.setOnKeyListener(this);
        if (this.z) {
            r10 r10Var = this.h;
            if (r10Var.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) xkVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(r10Var.m);
                }
                frameLayout.setEnabled(false);
                xkVar.addHeaderView(frameLayout, null, false);
            }
        }
        f20Var.q(o10Var);
        f20Var.d();
    }

    @Override // defpackage.vd0
    public final void dismiss() {
        if (b()) {
            this.n.dismiss();
        }
    }

    @Override // defpackage.h20
    public final void e(g20 g20Var) {
        this.t = g20Var;
    }

    @Override // defpackage.h20
    public final void g() {
        this.w = false;
        o10 o10Var = this.i;
        if (o10Var != null) {
            o10Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.vd0
    public final xk i() {
        return this.n.h;
    }

    @Override // defpackage.h20
    public final boolean j(wf0 wf0Var) {
        boolean z;
        if (wf0Var.hasVisibleItems()) {
            b20 b20Var = new b20(this.l, this.m, wf0Var, this.g, this.s, this.j);
            g20 g20Var = this.t;
            b20Var.i = g20Var;
            z10 z10Var = b20Var.j;
            if (z10Var != null) {
                z10Var.e(g20Var);
            }
            int size = wf0Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = wf0Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            b20Var.h = z;
            z10 z10Var2 = b20Var.j;
            if (z10Var2 != null) {
                z10Var2.o(z);
            }
            b20Var.k = this.q;
            this.q = null;
            this.h.c(false);
            f20 f20Var = this.n;
            int i2 = f20Var.k;
            int o = f20Var.o();
            if ((Gravity.getAbsoluteGravity(this.y, this.r.getLayoutDirection()) & 7) == 5) {
                i2 += this.r.getWidth();
            }
            if (!b20Var.b()) {
                if (b20Var.f != null) {
                    b20Var.d(i2, o, true, true);
                }
            }
            g20 g20Var2 = this.t;
            if (g20Var2 != null) {
                g20Var2.t(wf0Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.h20
    public final boolean k() {
        return false;
    }

    @Override // defpackage.z10
    public final void n(View view) {
        this.r = view;
    }

    @Override // defpackage.z10
    public final void o(boolean z) {
        this.i.h = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.v = true;
        this.h.c(true);
        ViewTreeObserver viewTreeObserver = this.u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.u = this.s.getViewTreeObserver();
            }
            this.u.removeGlobalOnLayoutListener(this.o);
            this.u = null;
        }
        this.s.removeOnAttachStateChangeListener(this.p);
        PopupWindow.OnDismissListener onDismissListener = this.q;
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

    @Override // defpackage.z10
    public final void p(int i) {
        this.y = i;
    }

    @Override // defpackage.z10
    public final void q(int i) {
        this.n.k = i;
    }

    @Override // defpackage.z10
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.q = onDismissListener;
    }

    @Override // defpackage.z10
    public final void s(boolean z) {
        this.z = z;
    }

    @Override // defpackage.z10
    public final void t(int i) {
        this.n.k(i);
    }

    @Override // defpackage.z10
    public final void l(r10 r10Var) {
    }
}
