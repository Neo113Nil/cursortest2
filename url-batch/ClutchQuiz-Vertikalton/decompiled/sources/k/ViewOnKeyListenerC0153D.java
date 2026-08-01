package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.clutchquizarena.app.R;
import l.C0236r0;
import l.J0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0153D extends AbstractC0175u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2670b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0167m f2671c;
    public final C0164j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2672e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2673f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2674g;
    public final J0 h;

    /* renamed from: k, reason: collision with root package name */
    public C0176v f2676k;

    /* renamed from: l, reason: collision with root package name */
    public View f2677l;

    /* renamed from: m, reason: collision with root package name */
    public View f2678m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0178x f2679n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2680o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2681p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2682q;

    /* renamed from: r, reason: collision with root package name */
    public int f2683r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2685t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0158d i = new ViewTreeObserverOnGlobalLayoutListenerC0158d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final R0.n f2675j = new R0.n(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2684s = 0;

    public ViewOnKeyListenerC0153D(int i, Context context, View view, MenuC0167m menuC0167m, boolean z2) {
        this.f2670b = context;
        this.f2671c = menuC0167m;
        this.f2672e = z2;
        this.d = new C0164j(menuC0167m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2674g = i;
        Resources resources = context.getResources();
        this.f2673f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2677l = view;
        this.h = new J0(context, null, i);
        menuC0167m.b(this, context);
    }

    @Override // k.InterfaceC0152C
    public final boolean a() {
        return !this.f2681p && this.h.f2860z.isShowing();
    }

    @Override // k.InterfaceC0179y
    public final void b(MenuC0167m menuC0167m, boolean z2) {
        if (menuC0167m != this.f2671c) {
            return;
        }
        dismiss();
        InterfaceC0178x interfaceC0178x = this.f2679n;
        if (interfaceC0178x != null) {
            interfaceC0178x.b(menuC0167m, z2);
        }
    }

    @Override // k.InterfaceC0179y
    public final void c() {
        this.f2682q = false;
        C0164j c0164j = this.d;
        if (c0164j != null) {
            c0164j.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0152C
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // k.InterfaceC0152C
    public final C0236r0 e() {
        return this.h.f2840c;
    }

    @Override // k.InterfaceC0179y
    public final boolean f(SubMenuC0154E subMenuC0154E) {
        if (subMenuC0154E.hasVisibleItems()) {
            View view = this.f2678m;
            C0177w c0177w = new C0177w(this.f2674g, this.f2670b, view, subMenuC0154E, this.f2672e);
            InterfaceC0178x interfaceC0178x = this.f2679n;
            c0177w.h = interfaceC0178x;
            AbstractC0175u abstractC0175u = c0177w.i;
            if (abstractC0175u != null) {
                abstractC0175u.g(interfaceC0178x);
            }
            boolean u2 = AbstractC0175u.u(subMenuC0154E);
            c0177w.f2812g = u2;
            AbstractC0175u abstractC0175u2 = c0177w.i;
            if (abstractC0175u2 != null) {
                abstractC0175u2.o(u2);
            }
            c0177w.f2813j = this.f2676k;
            this.f2676k = null;
            this.f2671c.c(false);
            J0 j02 = this.h;
            int i = j02.f2842f;
            int j2 = j02.j();
            if ((Gravity.getAbsoluteGravity(this.f2684s, this.f2677l.getLayoutDirection()) & 7) == 5) {
                i += this.f2677l.getWidth();
            }
            if (!c0177w.b()) {
                if (c0177w.f2810e != null) {
                    c0177w.d(i, j2, true, true);
                }
            }
            InterfaceC0178x interfaceC0178x2 = this.f2679n;
            if (interfaceC0178x2 != null) {
                interfaceC0178x2.g(subMenuC0154E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0179y
    public final void g(InterfaceC0178x interfaceC0178x) {
        this.f2679n = interfaceC0178x;
    }

    @Override // k.InterfaceC0152C
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2681p || (view = this.f2677l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2678m = view;
        J0 j02 = this.h;
        j02.f2860z.setOnDismissListener(this);
        j02.f2850p = this;
        j02.f2859y = true;
        j02.f2860z.setFocusable(true);
        View view2 = this.f2678m;
        boolean z2 = this.f2680o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2680o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2675j);
        j02.f2849o = view2;
        j02.f2846l = this.f2684s;
        boolean z3 = this.f2682q;
        Context context = this.f2670b;
        C0164j c0164j = this.d;
        if (!z3) {
            this.f2683r = AbstractC0175u.m(c0164j, context, this.f2673f);
            this.f2682q = true;
        }
        j02.q(this.f2683r);
        j02.f2860z.setInputMethodMode(2);
        Rect rect = this.f2805a;
        j02.f2858x = rect != null ? new Rect(rect) : null;
        j02.i();
        C0236r0 c0236r0 = j02.f2840c;
        c0236r0.setOnKeyListener(this);
        if (this.f2685t) {
            MenuC0167m menuC0167m = this.f2671c;
            if (menuC0167m.f2755m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0236r0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0167m.f2755m);
                }
                frameLayout.setEnabled(false);
                c0236r0.addHeaderView(frameLayout, null, false);
            }
        }
        j02.n(c0164j);
        j02.i();
    }

    @Override // k.InterfaceC0179y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0175u
    public final void l(MenuC0167m menuC0167m) {
    }

    @Override // k.AbstractC0175u
    public final void n(View view) {
        this.f2677l = view;
    }

    @Override // k.AbstractC0175u
    public final void o(boolean z2) {
        this.d.f2742c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2681p = true;
        this.f2671c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2680o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2680o = this.f2678m.getViewTreeObserver();
            }
            this.f2680o.removeGlobalOnLayoutListener(this.i);
            this.f2680o = null;
        }
        this.f2678m.removeOnAttachStateChangeListener(this.f2675j);
        C0176v c0176v = this.f2676k;
        if (c0176v != null) {
            c0176v.onDismiss();
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

    @Override // k.AbstractC0175u
    public final void p(int i) {
        this.f2684s = i;
    }

    @Override // k.AbstractC0175u
    public final void q(int i) {
        this.h.f2842f = i;
    }

    @Override // k.AbstractC0175u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2676k = (C0176v) onDismissListener;
    }

    @Override // k.AbstractC0175u
    public final void s(boolean z2) {
        this.f2685t = z2;
    }

    @Override // k.AbstractC0175u
    public final void t(int i) {
        this.h.l(i);
    }
}
