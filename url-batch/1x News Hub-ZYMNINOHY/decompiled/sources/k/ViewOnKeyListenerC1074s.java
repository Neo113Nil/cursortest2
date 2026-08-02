package k;

import E.A;
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
import com.fc.barca.football.R;
import java.lang.reflect.Field;
import l.M;
import l.N;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1074s extends AbstractC1067l implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f9652b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC1065j f9653c;

    /* renamed from: d, reason: collision with root package name */
    public final C1063h f9654d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9655e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9656g;

    /* renamed from: h, reason: collision with root package name */
    public final N f9657h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1058c f9658i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC1059d f9659j;

    /* renamed from: k, reason: collision with root package name */
    public C1068m f9660k;

    /* renamed from: l, reason: collision with root package name */
    public View f9661l;

    /* renamed from: m, reason: collision with root package name */
    public View f9662m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC1070o f9663n;
    public ViewTreeObserver o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9664p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9665q;

    /* renamed from: r, reason: collision with root package name */
    public int f9666r;

    /* renamed from: s, reason: collision with root package name */
    public int f9667s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9668t;

    public ViewOnKeyListenerC1074s(int i3, Context context, View view, MenuC1065j menuC1065j, boolean z) {
        int i4 = 1;
        this.f9658i = new ViewTreeObserverOnGlobalLayoutListenerC1058c(this, i4);
        this.f9659j = new ViewOnAttachStateChangeListenerC1059d(this, i4);
        this.f9652b = context;
        this.f9653c = menuC1065j;
        this.f9655e = z;
        this.f9654d = new C1063h(menuC1065j, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f9656g = i3;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f9661l = view;
        this.f9657h = new N(context, i3);
        menuC1065j.b(this, context);
    }

    @Override // k.InterfaceC1071p
    public final void a(MenuC1065j menuC1065j, boolean z) {
        if (menuC1065j != this.f9653c) {
            return;
        }
        dismiss();
        InterfaceC1070o interfaceC1070o = this.f9663n;
        if (interfaceC1070o != null) {
            interfaceC1070o.a(menuC1065j, z);
        }
    }

    @Override // k.InterfaceC1071p
    public final boolean c(SubMenuC1075t subMenuC1075t) {
        if (subMenuC1075t.hasVisibleItems()) {
            C1069n c1069n = new C1069n(this.f9656g, this.f9652b, this.f9662m, subMenuC1075t, this.f9655e);
            InterfaceC1070o interfaceC1070o = this.f9663n;
            c1069n.f9648h = interfaceC1070o;
            AbstractC1067l abstractC1067l = c1069n.f9649i;
            if (abstractC1067l != null) {
                abstractC1067l.h(interfaceC1070o);
            }
            boolean u3 = AbstractC1067l.u(subMenuC1075t);
            c1069n.f9647g = u3;
            AbstractC1067l abstractC1067l2 = c1069n.f9649i;
            if (abstractC1067l2 != null) {
                abstractC1067l2.o(u3);
            }
            c1069n.f9650j = this.f9660k;
            this.f9660k = null;
            this.f9653c.c(false);
            N n3 = this.f9657h;
            int i3 = n3.f9737e;
            int i4 = !n3.f9738g ? 0 : n3.f;
            int i5 = this.f9667s;
            View view = this.f9661l;
            Field field = A.f243a;
            if ((Gravity.getAbsoluteGravity(i5, view.getLayoutDirection()) & 7) == 5) {
                i3 += this.f9661l.getWidth();
            }
            if (!c1069n.b()) {
                if (c1069n.f9646e != null) {
                    c1069n.d(i3, i4, true, true);
                }
            }
            InterfaceC1070o interfaceC1070o2 = this.f9663n;
            if (interfaceC1070o2 != null) {
                interfaceC1070o2.d(subMenuC1075t);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC1073r
    public final void d() {
        View view;
        if (k()) {
            return;
        }
        if (this.f9664p || (view = this.f9661l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f9662m = view;
        N n3 = this.f9657h;
        n3.v.setOnDismissListener(this);
        n3.f9744m = this;
        n3.f9751u = true;
        n3.v.setFocusable(true);
        View view2 = this.f9662m;
        boolean z = this.o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.o = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f9658i);
        }
        view2.addOnAttachStateChangeListener(this.f9659j);
        n3.f9743l = view2;
        n3.f9741j = this.f9667s;
        boolean z2 = this.f9665q;
        Context context = this.f9652b;
        C1063h c1063h = this.f9654d;
        if (!z2) {
            this.f9666r = AbstractC1067l.m(c1063h, context, this.f);
            this.f9665q = true;
        }
        int i3 = this.f9666r;
        Drawable background = n3.v.getBackground();
        if (background != null) {
            Rect rect = n3.f9749s;
            background.getPadding(rect);
            n3.f9736d = rect.left + rect.right + i3;
        } else {
            n3.f9736d = i3;
        }
        n3.v.setInputMethodMode(2);
        Rect rect2 = this.f9640a;
        n3.f9750t = rect2 != null ? new Rect(rect2) : null;
        n3.d();
        M m3 = n3.f9735c;
        m3.setOnKeyListener(this);
        if (this.f9668t) {
            MenuC1065j menuC1065j = this.f9653c;
            if (menuC1065j.f9607l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) m3, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC1065j.f9607l);
                }
                frameLayout.setEnabled(false);
                m3.addHeaderView(frameLayout, null, false);
            }
        }
        n3.c(c1063h);
        n3.d();
    }

    @Override // k.InterfaceC1073r
    public final void dismiss() {
        if (k()) {
            this.f9657h.dismiss();
        }
    }

    @Override // k.InterfaceC1071p
    public final void f() {
        this.f9665q = false;
        C1063h c1063h = this.f9654d;
        if (c1063h != null) {
            c1063h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC1073r
    public final ListView g() {
        return this.f9657h.f9735c;
    }

    @Override // k.InterfaceC1071p
    public final void h(InterfaceC1070o interfaceC1070o) {
        this.f9663n = interfaceC1070o;
    }

    @Override // k.InterfaceC1071p
    public final boolean j() {
        return false;
    }

    @Override // k.InterfaceC1073r
    public final boolean k() {
        return !this.f9664p && this.f9657h.v.isShowing();
    }

    @Override // k.AbstractC1067l
    public final void n(View view) {
        this.f9661l = view;
    }

    @Override // k.AbstractC1067l
    public final void o(boolean z) {
        this.f9654d.f9594c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f9664p = true;
        this.f9653c.c(true);
        ViewTreeObserver viewTreeObserver = this.o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.o = this.f9662m.getViewTreeObserver();
            }
            this.o.removeGlobalOnLayoutListener(this.f9658i);
            this.o = null;
        }
        this.f9662m.removeOnAttachStateChangeListener(this.f9659j);
        C1068m c1068m = this.f9660k;
        if (c1068m != null) {
            c1068m.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // k.AbstractC1067l
    public final void p(int i3) {
        this.f9667s = i3;
    }

    @Override // k.AbstractC1067l
    public final void q(int i3) {
        this.f9657h.f9737e = i3;
    }

    @Override // k.AbstractC1067l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f9660k = (C1068m) onDismissListener;
    }

    @Override // k.AbstractC1067l
    public final void s(boolean z) {
        this.f9668t = z;
    }

    @Override // k.AbstractC1067l
    public final void t(int i3) {
        N n3 = this.f9657h;
        n3.f = i3;
        n3.f9738g = true;
    }

    @Override // k.AbstractC1067l
    public final void l(MenuC1065j menuC1065j) {
    }
}
