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
import com.derinko.gbini.n1casino.R;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class t30 extends ut implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context g;
    public final mt h;
    public final jt i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;
    public final au n;
    public PopupWindow.OnDismissListener q;
    public View r;
    public View s;
    public bu t;
    public ViewTreeObserver u;
    public boolean v;
    public boolean w;
    public int x;
    public boolean z;
    public final x4 o = new x4(3, this);
    public final n9 p = new n9(5, this);
    public int y = 0;

    public t30(int i, int i2, mt mtVar, Context context, View view, boolean z) {
        this.g = context;
        this.h = mtVar;
        this.j = z;
        this.i = new jt(mtVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.l = i;
        this.m = i2;
        Resources resources = context.getResources();
        this.k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.r = view;
        this.n = new au(context, null, i, i2);
        mtVar.b(this, context);
    }

    @Override // defpackage.cu
    public final void a(mt mtVar, boolean z) {
        if (mtVar != this.h) {
            return;
        }
        dismiss();
        bu buVar = this.t;
        if (buVar != null) {
            buVar.a(mtVar, z);
        }
    }

    @Override // defpackage.q20
    public final boolean b() {
        return !this.v && this.n.E.isShowing();
    }

    @Override // defpackage.q20
    public final void d() {
        View view;
        if (b()) {
            return;
        }
        if (this.v || (view = this.r) == null) {
            t8.t("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.s = view;
        au auVar = this.n;
        p4 p4Var = auVar.E;
        p4 p4Var2 = auVar.E;
        p4Var.setOnDismissListener(this);
        auVar.u = this;
        auVar.D = true;
        p4Var2.setFocusable(true);
        View view2 = this.s;
        boolean z = this.u == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.u = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.o);
        }
        view2.addOnAttachStateChangeListener(this.p);
        auVar.t = view2;
        auVar.q = this.y;
        boolean z2 = this.w;
        Context context = this.g;
        jt jtVar = this.i;
        if (!z2) {
            this.x = ut.m(jtVar, context, this.k);
            this.w = true;
        }
        auVar.r(this.x);
        p4Var2.setInputMethodMode(2);
        Rect rect = this.f;
        auVar.C = rect != null ? new Rect(rect) : null;
        auVar.d();
        lg lgVar = auVar.h;
        lgVar.setOnKeyListener(this);
        if (this.z) {
            mt mtVar = this.h;
            if (mtVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) lgVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(mtVar.m);
                }
                frameLayout.setEnabled(false);
                lgVar.addHeaderView(frameLayout, null, false);
            }
        }
        auVar.q(jtVar);
        auVar.d();
    }

    @Override // defpackage.q20
    public final void dismiss() {
        if (b()) {
            this.n.dismiss();
        }
    }

    @Override // defpackage.cu
    public final void e(bu buVar) {
        this.t = buVar;
    }

    @Override // defpackage.cu
    public final void g() {
        this.w = false;
        jt jtVar = this.i;
        if (jtVar != null) {
            jtVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.q20
    public final lg h() {
        return this.n.h;
    }

    @Override // defpackage.cu
    public final boolean j(m40 m40Var) {
        boolean z;
        if (m40Var.hasVisibleItems()) {
            wt wtVar = new wt(this.l, this.m, m40Var, this.g, this.s, this.j);
            bu buVar = this.t;
            wtVar.i = buVar;
            ut utVar = wtVar.j;
            if (utVar != null) {
                utVar.e(buVar);
            }
            int size = m40Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = m40Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            wtVar.h = z;
            ut utVar2 = wtVar.j;
            if (utVar2 != null) {
                utVar2.o(z);
            }
            wtVar.k = this.q;
            this.q = null;
            this.h.c(false);
            au auVar = this.n;
            int i2 = auVar.k;
            int o = auVar.o();
            if ((Gravity.getAbsoluteGravity(this.y, this.r.getLayoutDirection()) & 7) == 5) {
                i2 += this.r.getWidth();
            }
            if (!wtVar.b()) {
                if (wtVar.f != null) {
                    wtVar.d(i2, o, true, true);
                }
            }
            bu buVar2 = this.t;
            if (buVar2 != null) {
                buVar2.x(m40Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.cu
    public final boolean k() {
        return false;
    }

    @Override // defpackage.ut
    public final void n(View view) {
        this.r = view;
    }

    @Override // defpackage.ut
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

    @Override // defpackage.ut
    public final void p(int i) {
        this.y = i;
    }

    @Override // defpackage.ut
    public final void q(int i) {
        this.n.k = i;
    }

    @Override // defpackage.ut
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.q = onDismissListener;
    }

    @Override // defpackage.ut
    public final void s(boolean z) {
        this.z = z;
    }

    @Override // defpackage.ut
    public final void t(int i) {
        this.n.i(i);
    }

    @Override // defpackage.ut
    public final void l(mt mtVar) {
    }
}
