package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.snovikpovik.vuevnxsj.R;
import l.n1;
import l.o1;
import l.y;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r extends k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: e, reason: collision with root package name */
    public final Context f4126e;

    /* renamed from: f, reason: collision with root package name */
    public final i f4127f;

    /* renamed from: g, reason: collision with root package name */
    public final g f4128g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4129h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4130j;

    /* renamed from: k, reason: collision with root package name */
    public final o1 f4131k;

    /* renamed from: n, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4134n;

    /* renamed from: o, reason: collision with root package name */
    public View f4135o;

    /* renamed from: p, reason: collision with root package name */
    public View f4136p;

    /* renamed from: q, reason: collision with root package name */
    public n f4137q;

    /* renamed from: r, reason: collision with root package name */
    public ViewTreeObserver f4138r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4139s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4140t;

    /* renamed from: u, reason: collision with root package name */
    public int f4141u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4143w;

    /* renamed from: l, reason: collision with root package name */
    public final c f4132l = new c(this, 1);

    /* renamed from: m, reason: collision with root package name */
    public final f1.e f4133m = new f1.e(4, this);

    /* renamed from: v, reason: collision with root package name */
    public int f4142v = 0;

    public r(Context context, i iVar, View view, int i, boolean z3) {
        this.f4126e = context;
        this.f4127f = iVar;
        this.f4129h = z3;
        this.f4128g = new g(iVar, LayoutInflater.from(context), z3, R.layout.abc_popup_menu_item_layout);
        this.f4130j = i;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4135o = view;
        this.f4131k = new o1(context, i);
        iVar.b(this, context);
    }

    @Override // k.o
    public final void a(i iVar, boolean z3) {
        if (iVar != this.f4127f) {
            return;
        }
        dismiss();
        n nVar = this.f4137q;
        if (nVar != null) {
            nVar.a(iVar, z3);
        }
    }

    @Override // k.o
    public final boolean c(s sVar) {
        boolean z3;
        if (sVar.hasVisibleItems()) {
            m mVar = new m(this.f4126e, sVar, this.f4136p, this.f4129h, this.f4130j, 0);
            n nVar = this.f4137q;
            mVar.f4123h = nVar;
            k kVar = mVar.i;
            if (kVar != null) {
                kVar.h(nVar);
            }
            int size = sVar.f4075f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z3 = false;
                    break;
                }
                MenuItem item = sVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z3 = true;
                    break;
                }
                i++;
            }
            mVar.f4122g = z3;
            k kVar2 = mVar.i;
            if (kVar2 != null) {
                kVar2.o(z3);
            }
            mVar.f4124j = this.f4134n;
            this.f4134n = null;
            this.f4127f.c(false);
            o1 o1Var = this.f4131k;
            int i8 = o1Var.f4301h;
            int i9 = !o1Var.f4302j ? 0 : o1Var.i;
            if ((Gravity.getAbsoluteGravity(this.f4142v, this.f4135o.getLayoutDirection()) & 7) == 5) {
                i8 += this.f4135o.getWidth();
            }
            if (!mVar.b()) {
                if (mVar.f4120e != null) {
                    mVar.d(i8, i9, true, true);
                }
            }
            n nVar2 = this.f4137q;
            if (nVar2 != null) {
                nVar2.g(sVar);
            }
            return true;
        }
        return false;
    }

    @Override // k.q
    public final void d() {
        View view;
        if (k()) {
            return;
        }
        if (this.f4139s || (view = this.f4135o) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f4136p = view;
        o1 o1Var = this.f4131k;
        y yVar = o1Var.f4317y;
        y yVar2 = o1Var.f4317y;
        yVar.setOnDismissListener(this);
        o1Var.f4308p = this;
        o1Var.f4316x = true;
        yVar2.setFocusable(true);
        View view2 = this.f4136p;
        boolean z3 = this.f4138r == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f4138r = viewTreeObserver;
        if (z3) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f4132l);
        }
        view2.addOnAttachStateChangeListener(this.f4133m);
        o1Var.f4307o = view2;
        o1Var.f4305m = this.f4142v;
        boolean z7 = this.f4140t;
        Context context = this.f4126e;
        g gVar = this.f4128g;
        if (!z7) {
            this.f4141u = k.m(gVar, context, this.i);
            this.f4140t = true;
        }
        int i = this.f4141u;
        Rect rect = o1Var.f4314v;
        Drawable background = yVar2.getBackground();
        if (background != null) {
            background.getPadding(rect);
            o1Var.f4300g = rect.left + rect.right + i;
        } else {
            o1Var.f4300g = i;
        }
        yVar2.setInputMethodMode(2);
        Rect rect2 = this.f4114d;
        o1Var.f4315w = rect2 != null ? new Rect(rect2) : null;
        o1Var.d();
        n1 n1Var = o1Var.f4299f;
        n1Var.setOnKeyListener(this);
        if (this.f4143w) {
            i iVar = this.f4127f;
            if (iVar.f4080l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) n1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(iVar.f4080l);
                }
                frameLayout.setEnabled(false);
                n1Var.addHeaderView(frameLayout, null, false);
            }
        }
        o1Var.a(gVar);
        o1Var.d();
    }

    @Override // k.q
    public final void dismiss() {
        if (k()) {
            this.f4131k.dismiss();
        }
    }

    @Override // k.o
    public final void f() {
        this.f4140t = false;
        g gVar = this.f4128g;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // k.q
    public final ListView g() {
        return this.f4131k.f4299f;
    }

    @Override // k.o
    public final void h(n nVar) {
        this.f4137q = nVar;
    }

    @Override // k.o
    public final boolean j() {
        return false;
    }

    @Override // k.q
    public final boolean k() {
        return !this.f4139s && this.f4131k.f4317y.isShowing();
    }

    @Override // k.k
    public final void n(View view) {
        this.f4135o = view;
    }

    @Override // k.k
    public final void o(boolean z3) {
        this.f4128g.f4065c = z3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4139s = true;
        this.f4127f.c(true);
        ViewTreeObserver viewTreeObserver = this.f4138r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f4138r = this.f4136p.getViewTreeObserver();
            }
            this.f4138r.removeGlobalOnLayoutListener(this.f4132l);
            this.f4138r = null;
        }
        this.f4136p.removeOnAttachStateChangeListener(this.f4133m);
        PopupWindow.OnDismissListener onDismissListener = this.f4134n;
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

    @Override // k.k
    public final void p(int i) {
        this.f4142v = i;
    }

    @Override // k.k
    public final void q(int i) {
        this.f4131k.f4301h = i;
    }

    @Override // k.k
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f4134n = onDismissListener;
    }

    @Override // k.k
    public final void s(boolean z3) {
        this.f4143w = z3;
    }

    @Override // k.k
    public final void t(int i) {
        o1 o1Var = this.f4131k;
        o1Var.i = i;
        o1Var.f4302j = true;
    }

    @Override // k.k
    public final void l(i iVar) {
    }
}
