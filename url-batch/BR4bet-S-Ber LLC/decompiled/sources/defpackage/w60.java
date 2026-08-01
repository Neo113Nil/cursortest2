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
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class w60 extends vw implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context g;
    public final mw h;
    public final jw i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;
    public final bx n;
    public PopupWindow.OnDismissListener q;
    public View r;
    public View s;
    public cx t;
    public ViewTreeObserver u;
    public boolean v;
    public boolean w;
    public int x;
    public boolean z;
    public final h5 o = new h5(3, this);
    public final aa p = new aa(5, this);
    public int y = 0;

    public w60(int i, int i2, mw mwVar, Context context, View view, boolean z) {
        this.g = context;
        this.h = mwVar;
        this.j = z;
        this.i = new jw(mwVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.l = i;
        this.m = i2;
        Resources resources = context.getResources();
        this.k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.r = view;
        this.n = new bx(context, null, i, i2);
        mwVar.b(this, context);
    }

    @Override // defpackage.dx
    public final void a(mw mwVar, boolean z) {
        if (mwVar != this.h) {
            return;
        }
        dismiss();
        cx cxVar = this.t;
        if (cxVar != null) {
            cxVar.a(mwVar, z);
        }
    }

    @Override // defpackage.s50
    public final boolean b() {
        return !this.v && this.n.E.isShowing();
    }

    @Override // defpackage.s50
    public final void d() {
        View view;
        if (b()) {
            return;
        }
        if (this.v || (view = this.r) == null) {
            g9.s("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.s = view;
        bx bxVar = this.n;
        z4 z4Var = bxVar.E;
        z4 z4Var2 = bxVar.E;
        z4Var.setOnDismissListener(this);
        bxVar.u = this;
        bxVar.D = true;
        z4Var2.setFocusable(true);
        View view2 = this.s;
        boolean z = this.u == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.u = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.o);
        }
        view2.addOnAttachStateChangeListener(this.p);
        bxVar.t = view2;
        bxVar.q = this.y;
        boolean z2 = this.w;
        Context context = this.g;
        jw jwVar = this.i;
        if (!z2) {
            this.x = vw.m(jwVar, context, this.k);
            this.w = true;
        }
        bxVar.r(this.x);
        z4Var2.setInputMethodMode(2);
        Rect rect = this.f;
        bxVar.C = rect != null ? new Rect(rect) : null;
        bxVar.d();
        mi miVar = bxVar.h;
        miVar.setOnKeyListener(this);
        if (this.z) {
            mw mwVar = this.h;
            if (mwVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) miVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(mwVar.m);
                }
                frameLayout.setEnabled(false);
                miVar.addHeaderView(frameLayout, null, false);
            }
        }
        bxVar.q(jwVar);
        bxVar.d();
    }

    @Override // defpackage.s50
    public final void dismiss() {
        if (b()) {
            this.n.dismiss();
        }
    }

    @Override // defpackage.dx
    public final void e(cx cxVar) {
        this.t = cxVar;
    }

    @Override // defpackage.dx
    public final void g() {
        this.w = false;
        jw jwVar = this.i;
        if (jwVar != null) {
            jwVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.s50
    public final mi i() {
        return this.n.h;
    }

    @Override // defpackage.dx
    public final boolean j(p70 p70Var) {
        boolean z;
        if (p70Var.hasVisibleItems()) {
            xw xwVar = new xw(this.l, this.m, p70Var, this.g, this.s, this.j);
            cx cxVar = this.t;
            xwVar.i = cxVar;
            vw vwVar = xwVar.j;
            if (vwVar != null) {
                vwVar.e(cxVar);
            }
            int size = p70Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = p70Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            xwVar.h = z;
            vw vwVar2 = xwVar.j;
            if (vwVar2 != null) {
                vwVar2.o(z);
            }
            xwVar.k = this.q;
            this.q = null;
            this.h.c(false);
            bx bxVar = this.n;
            int i2 = bxVar.k;
            int o = bxVar.o();
            if ((Gravity.getAbsoluteGravity(this.y, this.r.getLayoutDirection()) & 7) == 5) {
                i2 += this.r.getWidth();
            }
            if (!xwVar.b()) {
                if (xwVar.f != null) {
                    xwVar.d(i2, o, true, true);
                }
            }
            cx cxVar2 = this.t;
            if (cxVar2 != null) {
                cxVar2.w(p70Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.dx
    public final boolean k() {
        return false;
    }

    @Override // defpackage.vw
    public final void n(View view) {
        this.r = view;
    }

    @Override // defpackage.vw
    public final void o(boolean z) {
        this.i.c = z;
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

    @Override // defpackage.vw
    public final void p(int i) {
        this.y = i;
    }

    @Override // defpackage.vw
    public final void q(int i) {
        this.n.k = i;
    }

    @Override // defpackage.vw
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.q = onDismissListener;
    }

    @Override // defpackage.vw
    public final void s(boolean z) {
        this.z = z;
    }

    @Override // defpackage.vw
    public final void t(int i) {
        this.n.k(i);
    }

    @Override // defpackage.vw
    public final void l(mw mwVar) {
    }
}
