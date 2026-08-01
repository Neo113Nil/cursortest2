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
import com.awerser.monnit.betplay.R;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class c40 extends ju implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context g;
    public final au h;
    public final xt i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;
    public final pu n;
    public PopupWindow.OnDismissListener q;
    public View r;
    public View s;
    public qu t;
    public ViewTreeObserver u;
    public boolean v;
    public boolean w;
    public int x;
    public boolean z;
    public final o5 o = new o5(3, this);
    public final i9 p = new i9(5, this);
    public int y = 0;

    public c40(int i, int i2, au auVar, Context context, View view, boolean z) {
        this.g = context;
        this.h = auVar;
        this.j = z;
        this.i = new xt(auVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.l = i;
        this.m = i2;
        Resources resources = context.getResources();
        this.k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.r = view;
        this.n = new pu(context, null, i, i2);
        auVar.b(this, context);
    }

    @Override // defpackage.ru
    public final void a(au auVar, boolean z) {
        if (auVar != this.h) {
            return;
        }
        dismiss();
        qu quVar = this.t;
        if (quVar != null) {
            quVar.a(auVar, z);
        }
    }

    @Override // defpackage.b30
    public final boolean b() {
        return !this.v && this.n.E.isShowing();
    }

    @Override // defpackage.b30
    public final void d() {
        View view;
        if (b()) {
            return;
        }
        if (this.v || (view = this.r) == null) {
            o8.t("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.s = view;
        pu puVar = this.n;
        g5 g5Var = puVar.E;
        g5 g5Var2 = puVar.E;
        g5Var.setOnDismissListener(this);
        puVar.u = this;
        puVar.D = true;
        g5Var2.setFocusable(true);
        View view2 = this.s;
        boolean z = this.u == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.u = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.o);
        }
        view2.addOnAttachStateChangeListener(this.p);
        puVar.t = view2;
        puVar.q = this.y;
        boolean z2 = this.w;
        Context context = this.g;
        xt xtVar = this.i;
        if (!z2) {
            this.x = ju.m(xtVar, context, this.k);
            this.w = true;
        }
        puVar.r(this.x);
        g5Var2.setInputMethodMode(2);
        Rect rect = this.f;
        puVar.C = rect != null ? new Rect(rect) : null;
        puVar.d();
        dg dgVar = puVar.h;
        dgVar.setOnKeyListener(this);
        if (this.z) {
            au auVar = this.h;
            if (auVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) dgVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(auVar.m);
                }
                frameLayout.setEnabled(false);
                dgVar.addHeaderView(frameLayout, null, false);
            }
        }
        puVar.q(xtVar);
        puVar.d();
    }

    @Override // defpackage.b30
    public final void dismiss() {
        if (b()) {
            this.n.dismiss();
        }
    }

    @Override // defpackage.ru
    public final void e(qu quVar) {
        this.t = quVar;
    }

    @Override // defpackage.ru
    public final void g() {
        this.w = false;
        xt xtVar = this.i;
        if (xtVar != null) {
            xtVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.b30
    public final dg h() {
        return this.n.h;
    }

    @Override // defpackage.ru
    public final boolean j(v40 v40Var) {
        boolean z;
        if (v40Var.hasVisibleItems()) {
            lu luVar = new lu(this.l, this.m, v40Var, this.g, this.s, this.j);
            qu quVar = this.t;
            luVar.i = quVar;
            ju juVar = luVar.j;
            if (juVar != null) {
                juVar.e(quVar);
            }
            int size = v40Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = v40Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            luVar.h = z;
            ju juVar2 = luVar.j;
            if (juVar2 != null) {
                juVar2.o(z);
            }
            luVar.k = this.q;
            this.q = null;
            this.h.c(false);
            pu puVar = this.n;
            int i2 = puVar.k;
            int o = puVar.o();
            if ((Gravity.getAbsoluteGravity(this.y, this.r.getLayoutDirection()) & 7) == 5) {
                i2 += this.r.getWidth();
            }
            if (!luVar.b()) {
                if (luVar.f != null) {
                    luVar.d(i2, o, true, true);
                }
            }
            qu quVar2 = this.t;
            if (quVar2 != null) {
                quVar2.s(v40Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ru
    public final boolean k() {
        return false;
    }

    @Override // defpackage.ju
    public final void n(View view) {
        this.r = view;
    }

    @Override // defpackage.ju
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

    @Override // defpackage.ju
    public final void p(int i) {
        this.y = i;
    }

    @Override // defpackage.ju
    public final void q(int i) {
        this.n.k = i;
    }

    @Override // defpackage.ju
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.q = onDismissListener;
    }

    @Override // defpackage.ju
    public final void s(boolean z) {
        this.z = z;
    }

    @Override // defpackage.ju
    public final void t(int i) {
        this.n.k(i);
    }

    @Override // defpackage.ju
    public final void l(au auVar) {
    }
}
