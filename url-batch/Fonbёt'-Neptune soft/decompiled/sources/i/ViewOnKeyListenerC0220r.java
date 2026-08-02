package i;

import A.z;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.neptunesoft.languesbacdz.R;
import j.N;
import j.O;
import java.lang.reflect.Field;

/* renamed from: i.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0220r extends AbstractC0213k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: f, reason: collision with root package name */
    public final Context f2468f;

    /* renamed from: g, reason: collision with root package name */
    public final MenuC0211i f2469g;

    /* renamed from: h, reason: collision with root package name */
    public final C0209g f2470h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2471i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2472j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2473k;

    /* renamed from: l, reason: collision with root package name */
    public final O f2474l;

    /* renamed from: m, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0205c f2475m;

    /* renamed from: n, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0206d f2476n;

    /* renamed from: o, reason: collision with root package name */
    public C0214l f2477o;

    /* renamed from: p, reason: collision with root package name */
    public View f2478p;

    /* renamed from: q, reason: collision with root package name */
    public View f2479q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0216n f2480r;

    /* renamed from: s, reason: collision with root package name */
    public ViewTreeObserver f2481s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2482t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2483u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public int f2484w = 0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2485x;

    public ViewOnKeyListenerC0220r(int i2, Context context, View view, MenuC0211i menuC0211i, boolean z2) {
        int i3 = 1;
        this.f2475m = new ViewTreeObserverOnGlobalLayoutListenerC0205c(this, i3);
        this.f2476n = new ViewOnAttachStateChangeListenerC0206d(this, i3);
        this.f2468f = context;
        this.f2469g = menuC0211i;
        this.f2471i = z2;
        this.f2470h = new C0209g(menuC0211i, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2473k = i2;
        Resources resources = context.getResources();
        this.f2472j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2478p = view;
        this.f2474l = new O(context, i2);
        menuC0211i.b(this, context);
    }

    @Override // i.InterfaceC0217o
    public final void a(MenuC0211i menuC0211i, boolean z2) {
        if (menuC0211i != this.f2469g) {
            return;
        }
        dismiss();
        InterfaceC0216n interfaceC0216n = this.f2480r;
        if (interfaceC0216n != null) {
            interfaceC0216n.a(menuC0211i, z2);
        }
    }

    @Override // i.InterfaceC0219q
    public final void c() {
        View view;
        if (i()) {
            return;
        }
        if (this.f2482t || (view = this.f2478p) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2479q = view;
        O o2 = this.f2474l;
        o2.f2896z.setOnDismissListener(this);
        o2.f2888q = this;
        o2.f2895y = true;
        o2.f2896z.setFocusable(true);
        View view2 = this.f2479q;
        boolean z2 = this.f2481s == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2481s = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2475m);
        }
        view2.addOnAttachStateChangeListener(this.f2476n);
        o2.f2887p = view2;
        o2.f2885n = this.f2484w;
        boolean z3 = this.f2483u;
        Context context = this.f2468f;
        C0209g c0209g = this.f2470h;
        if (!z3) {
            this.v = AbstractC0213k.m(c0209g, context, this.f2472j);
            this.f2483u = true;
        }
        int i2 = this.v;
        Drawable background = o2.f2896z.getBackground();
        if (background != null) {
            Rect rect = o2.f2893w;
            background.getPadding(rect);
            o2.f2879h = rect.left + rect.right + i2;
        } else {
            o2.f2879h = i2;
        }
        o2.f2896z.setInputMethodMode(2);
        Rect rect2 = this.f2455e;
        o2.f2894x = rect2 != null ? new Rect(rect2) : null;
        o2.c();
        N n2 = o2.f2878g;
        n2.setOnKeyListener(this);
        if (this.f2485x) {
            MenuC0211i menuC0211i = this.f2469g;
            if (menuC0211i.f2419l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) n2, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0211i.f2419l);
                }
                frameLayout.setEnabled(false);
                n2.addHeaderView(frameLayout, null, false);
            }
        }
        o2.a(c0209g);
        o2.c();
    }

    @Override // i.InterfaceC0217o
    public final boolean d() {
        return false;
    }

    @Override // i.InterfaceC0219q
    public final void dismiss() {
        if (i()) {
            this.f2474l.dismiss();
        }
    }

    @Override // i.InterfaceC0217o
    public final void f(InterfaceC0216n interfaceC0216n) {
        this.f2480r = interfaceC0216n;
    }

    @Override // i.InterfaceC0217o
    public final void h() {
        this.f2483u = false;
        C0209g c0209g = this.f2470h;
        if (c0209g != null) {
            c0209g.notifyDataSetChanged();
        }
    }

    @Override // i.InterfaceC0219q
    public final boolean i() {
        return !this.f2482t && this.f2474l.f2896z.isShowing();
    }

    @Override // i.InterfaceC0219q
    public final ListView j() {
        return this.f2474l.f2878g;
    }

    @Override // i.InterfaceC0217o
    public final boolean k(SubMenuC0221s subMenuC0221s) {
        if (subMenuC0221s.hasVisibleItems()) {
            C0215m c0215m = new C0215m(this.f2473k, this.f2468f, this.f2479q, subMenuC0221s, this.f2471i);
            InterfaceC0216n interfaceC0216n = this.f2480r;
            c0215m.f2464h = interfaceC0216n;
            AbstractC0213k abstractC0213k = c0215m.f2465i;
            if (abstractC0213k != null) {
                abstractC0213k.f(interfaceC0216n);
            }
            boolean u2 = AbstractC0213k.u(subMenuC0221s);
            c0215m.f2463g = u2;
            AbstractC0213k abstractC0213k2 = c0215m.f2465i;
            if (abstractC0213k2 != null) {
                abstractC0213k2.o(u2);
            }
            c0215m.f2466j = this.f2477o;
            this.f2477o = null;
            this.f2469g.c(false);
            O o2 = this.f2474l;
            int i2 = o2.f2880i;
            int i3 = !o2.f2882k ? 0 : o2.f2881j;
            int i4 = this.f2484w;
            View view = this.f2478p;
            Field field = z.f58a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 += this.f2478p.getWidth();
            }
            if (!c0215m.b()) {
                if (c0215m.f2461e != null) {
                    c0215m.d(i2, i3, true, true);
                }
            }
            InterfaceC0216n interfaceC0216n2 = this.f2480r;
            if (interfaceC0216n2 != null) {
                interfaceC0216n2.b(subMenuC0221s);
            }
            return true;
        }
        return false;
    }

    @Override // i.AbstractC0213k
    public final void n(View view) {
        this.f2478p = view;
    }

    @Override // i.AbstractC0213k
    public final void o(boolean z2) {
        this.f2470h.f2403g = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2482t = true;
        this.f2469g.c(true);
        ViewTreeObserver viewTreeObserver = this.f2481s;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2481s = this.f2479q.getViewTreeObserver();
            }
            this.f2481s.removeGlobalOnLayoutListener(this.f2475m);
            this.f2481s = null;
        }
        this.f2479q.removeOnAttachStateChangeListener(this.f2476n);
        C0214l c0214l = this.f2477o;
        if (c0214l != null) {
            c0214l.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // i.AbstractC0213k
    public final void p(int i2) {
        this.f2484w = i2;
    }

    @Override // i.AbstractC0213k
    public final void q(int i2) {
        this.f2474l.f2880i = i2;
    }

    @Override // i.AbstractC0213k
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2477o = (C0214l) onDismissListener;
    }

    @Override // i.AbstractC0213k
    public final void s(boolean z2) {
        this.f2485x = z2;
    }

    @Override // i.AbstractC0213k
    public final void t(int i2) {
        O o2 = this.f2474l;
        o2.f2881j = i2;
        o2.f2882k = true;
    }

    @Override // i.AbstractC0213k
    public final void l(MenuC0211i menuC0211i) {
    }
}
