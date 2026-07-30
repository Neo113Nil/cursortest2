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
import com.majelw.libystne.R;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lo2 extends rk1 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean F;
    public final Context n;
    public final fk1 o;
    public final ck1 p;
    public final boolean q;
    public final int r;
    public final int s;
    public final xk1 t;
    public PopupWindow.OnDismissListener w;
    public View x;
    public View y;
    public yk1 z;
    public final hg u = new hg(3, this);
    public final w7 v = new w7(4, this);
    public int E = 0;

    public lo2(Context context, fk1 fk1Var, View view, int i, boolean z) {
        this.n = context;
        this.o = fk1Var;
        this.q = z;
        this.p = new ck1(fk1Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.s = i;
        Resources resources = context.getResources();
        this.r = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.x = view;
        this.t = new xk1(context, null, i);
        fk1Var.b(this, context);
    }

    @Override // defpackage.cl2
    public final boolean a() {
        return !this.B && this.t.K.isShowing();
    }

    @Override // defpackage.zk1
    public final void b(fk1 fk1Var, boolean z) {
        if (fk1Var != this.o) {
            return;
        }
        dismiss();
        yk1 yk1Var = this.z;
        if (yk1Var != null) {
            yk1Var.b(fk1Var, z);
        }
    }

    @Override // defpackage.cl2
    public final void c() {
        View view;
        if (a()) {
            return;
        }
        if (this.B || (view = this.x) == null) {
            lh.g("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.y = view;
        xk1 xk1Var = this.t;
        ag agVar = xk1Var.K;
        ag agVar2 = xk1Var.K;
        agVar.setOnDismissListener(this);
        xk1Var.B = this;
        xk1Var.J = true;
        agVar2.setFocusable(true);
        View view2 = this.y;
        boolean z = this.A == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.A = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.u);
        }
        view2.addOnAttachStateChangeListener(this.v);
        xk1Var.A = view2;
        xk1Var.x = this.E;
        boolean z2 = this.C;
        Context context = this.n;
        ck1 ck1Var = this.p;
        if (!z2) {
            this.D = rk1.m(ck1Var, context, this.r);
            this.C = true;
        }
        xk1Var.r(this.D);
        agVar2.setInputMethodMode(2);
        Rect rect = this.m;
        xk1Var.I = rect != null ? new Rect(rect) : null;
        xk1Var.c();
        ne0 ne0Var = xk1Var.o;
        ne0Var.setOnKeyListener(this);
        if (this.F) {
            fk1 fk1Var = this.o;
            if (fk1Var.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) ne0Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(fk1Var.m);
                }
                frameLayout.setEnabled(false);
                ne0Var.addHeaderView(frameLayout, null, false);
            }
        }
        xk1Var.p(ck1Var);
        xk1Var.c();
    }

    @Override // defpackage.cl2
    public final void dismiss() {
        if (a()) {
            this.t.dismiss();
        }
    }

    @Override // defpackage.zk1
    public final void e(yk1 yk1Var) {
        this.z = yk1Var;
    }

    @Override // defpackage.zk1
    public final void g() {
        this.C = false;
        ck1 ck1Var = this.p;
        if (ck1Var != null) {
            ck1Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.cl2
    public final ne0 h() {
        return this.t.o;
    }

    @Override // defpackage.zk1
    public final boolean j(cq2 cq2Var) {
        boolean z;
        if (cq2Var.hasVisibleItems()) {
            tk1 tk1Var = new tk1(this.n, cq2Var, this.y, this.q, this.s, 0);
            yk1 yk1Var = this.z;
            tk1Var.h = yk1Var;
            rk1 rk1Var = tk1Var.i;
            if (rk1Var != null) {
                rk1Var.e(yk1Var);
            }
            int size = cq2Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = cq2Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            tk1Var.g = z;
            rk1 rk1Var2 = tk1Var.i;
            if (rk1Var2 != null) {
                rk1Var2.o(z);
            }
            tk1Var.j = this.w;
            this.w = null;
            this.o.c(false);
            xk1 xk1Var = this.t;
            int i2 = xk1Var.r;
            int n = xk1Var.n();
            if ((Gravity.getAbsoluteGravity(this.E, this.x.getLayoutDirection()) & 7) == 5) {
                i2 += this.x.getWidth();
            }
            if (!tk1Var.b()) {
                if (tk1Var.e != null) {
                    tk1Var.d(i2, n, true, true);
                }
            }
            yk1 yk1Var2 = this.z;
            if (yk1Var2 != null) {
                yk1Var2.o(cq2Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.zk1
    public final boolean k() {
        return false;
    }

    @Override // defpackage.rk1
    public final void n(View view) {
        this.x = view;
    }

    @Override // defpackage.rk1
    public final void o(boolean z) {
        this.p.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.B = true;
        this.o.c(true);
        ViewTreeObserver viewTreeObserver = this.A;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A = this.y.getViewTreeObserver();
            }
            this.A.removeGlobalOnLayoutListener(this.u);
            this.A = null;
        }
        this.y.removeOnAttachStateChangeListener(this.v);
        PopupWindow.OnDismissListener onDismissListener = this.w;
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

    @Override // defpackage.rk1
    public final void p(int i) {
        this.E = i;
    }

    @Override // defpackage.rk1
    public final void q(int i) {
        this.t.r = i;
    }

    @Override // defpackage.rk1
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.w = onDismissListener;
    }

    @Override // defpackage.rk1
    public final void s(boolean z) {
        this.F = z;
    }

    @Override // defpackage.rk1
    public final void t(int i) {
        this.t.j(i);
    }

    @Override // defpackage.rk1
    public final void l(fk1 fk1Var) {
    }
}
