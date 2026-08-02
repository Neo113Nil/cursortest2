package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gv extends gl implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, gp {
    final kl a;
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final gd f;
    private final ga h;
    private final boolean i;
    private final int j;
    private final int k;
    private PopupWindow.OnDismissListener m;
    private View n;
    private go o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean t;
    final ViewTreeObserver.OnGlobalLayoutListener b = new gu(this, 0);
    private final View.OnAttachStateChangeListener l = new fu(this, 2);
    private int s = 0;

    public gv(Context context, gd gdVar, View view, int i, boolean z) {
        this.e = context;
        this.f = gdVar;
        this.i = z;
        this.h = new ga(gdVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.k = i;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.a = new kl(context, i);
        gdVar.h(this, context);
    }

    @Override // defpackage.gp
    public final Parcelable bh() {
        return null;
    }

    @Override // defpackage.gt
    public final ListView bi() {
        return this.a.e;
    }

    @Override // defpackage.gp
    public final void d(gd gdVar, boolean z) {
        if (gdVar != this.f) {
            return;
        }
        m();
        go goVar = this.o;
        if (goVar != null) {
            goVar.a(gdVar, z);
        }
    }

    @Override // defpackage.gp
    public final void e(go goVar) {
        this.o = goVar;
    }

    @Override // defpackage.gp
    public final boolean f() {
        return false;
    }

    @Override // defpackage.gp
    public final boolean g(gw gwVar) {
        if (gwVar.hasVisibleItems()) {
            gn gnVar = new gn(this.e, gwVar, this.c, this.i, this.k);
            gnVar.e(this.o);
            gnVar.d(gl.z(gwVar));
            gnVar.c = this.m;
            this.m = null;
            this.f.i(false);
            kl klVar = this.a;
            int i = klVar.g;
            int b = klVar.b();
            if ((Gravity.getAbsoluteGravity(this.s, this.n.getLayoutDirection()) & 7) == 5) {
                i += this.n.getWidth();
            }
            if (!gnVar.g()) {
                if (gnVar.a != null) {
                    gnVar.f(i, b, true, true);
                }
            }
            go goVar = this.o;
            if (goVar != null) {
                goVar.b(gwVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.gp
    public final void j() {
        this.q = false;
        ga gaVar = this.h;
        if (gaVar != null) {
            gaVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.gt
    public final void m() {
        if (x()) {
            this.a.m();
        }
    }

    @Override // defpackage.gl
    public final void o(View view) {
        this.n = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.f.i(true);
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        m();
        return true;
    }

    @Override // defpackage.gl
    public final void p(boolean z) {
        this.h.b = z;
    }

    @Override // defpackage.gl
    public final void q(int i) {
        this.s = i;
    }

    @Override // defpackage.gl
    public final void r(int i) {
        this.a.g = i;
    }

    @Override // defpackage.gl
    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.gl
    public final void t(boolean z) {
        this.t = z;
    }

    @Override // defpackage.gl
    public final void u(int i) {
        this.a.j(i);
    }

    @Override // defpackage.gt
    public final void v() {
        View view;
        if (x()) {
            return;
        }
        if (this.p || (view = this.n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.c = view;
        kl klVar = this.a;
        klVar.t(this);
        klVar.l = this;
        klVar.y();
        View view2 = this.c;
        ViewTreeObserver viewTreeObserver = this.d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.b);
        }
        view2.addOnAttachStateChangeListener(this.l);
        klVar.k = view2;
        klVar.j = this.s;
        if (!this.q) {
            this.r = A(this.h, this.e, this.j);
            this.q = true;
        }
        klVar.r(this.r);
        klVar.w();
        klVar.s(this.g);
        klVar.v();
        jp jpVar = klVar.e;
        jpVar.setOnKeyListener(this);
        if (this.t) {
            gd gdVar = this.f;
            if (gdVar.e != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) jpVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(gdVar.e);
                }
                frameLayout.setEnabled(false);
                jpVar.addHeaderView(frameLayout, null, false);
            }
        }
        klVar.e(this.h);
        klVar.v();
    }

    @Override // defpackage.gt
    public final boolean x() {
        return !this.p && this.a.x();
    }

    @Override // defpackage.gl
    public final void l(gd gdVar) {
    }

    @Override // defpackage.gp
    public final void n(Parcelable parcelable) {
    }
}
