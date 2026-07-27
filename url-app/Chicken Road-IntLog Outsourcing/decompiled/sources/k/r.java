package k;

import E.G;
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
import com.chickyneer.roadway.R;
import java.lang.reflect.Field;
import l.J;
import l.K;

/* loaded from: classes.dex */
public final class r extends k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f10646b;

    /* renamed from: c, reason: collision with root package name */
    public final i f10647c;

    /* renamed from: d, reason: collision with root package name */
    public final g f10648d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10649e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10650f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10651g;

    /* renamed from: h, reason: collision with root package name */
    public final K f10652h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1203c f10653i;

    /* renamed from: j, reason: collision with root package name */
    public final d f10654j;

    /* renamed from: k, reason: collision with root package name */
    public l f10655k;

    /* renamed from: l, reason: collision with root package name */
    public View f10656l;

    /* renamed from: m, reason: collision with root package name */
    public View f10657m;

    /* renamed from: n, reason: collision with root package name */
    public n f10658n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f10659o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10660p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10661q;

    /* renamed from: r, reason: collision with root package name */
    public int f10662r;

    /* renamed from: s, reason: collision with root package name */
    public int f10663s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10664t;

    public r(int i2, Context context, View view, i iVar, boolean z) {
        int i3 = 1;
        this.f10653i = new ViewTreeObserverOnGlobalLayoutListenerC1203c(this, i3);
        this.f10654j = new d(this, i3);
        this.f10646b = context;
        this.f10647c = iVar;
        this.f10649e = z;
        this.f10648d = new g(iVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f10651g = i2;
        Resources resources = context.getResources();
        this.f10650f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f10656l = view;
        this.f10652h = new K(context, i2);
        iVar.b(this, context);
    }

    @Override // k.o
    public final void a(i iVar, boolean z) {
        if (iVar != this.f10647c) {
            return;
        }
        dismiss();
        n nVar = this.f10658n;
        if (nVar != null) {
            nVar.a(iVar, z);
        }
    }

    @Override // k.o
    public final boolean c(s sVar) {
        if (sVar.hasVisibleItems()) {
            m mVar = new m(this.f10651g, this.f10646b, this.f10657m, sVar, this.f10649e);
            n nVar = this.f10658n;
            mVar.f10642h = nVar;
            k kVar = mVar.f10643i;
            if (kVar != null) {
                kVar.h(nVar);
            }
            boolean u5 = k.u(sVar);
            mVar.f10641g = u5;
            k kVar2 = mVar.f10643i;
            if (kVar2 != null) {
                kVar2.o(u5);
            }
            mVar.f10644j = this.f10655k;
            this.f10655k = null;
            this.f10647c.c(false);
            K k3 = this.f10652h;
            int i2 = k3.f10774e;
            int i3 = !k3.f10776g ? 0 : k3.f10775f;
            int i6 = this.f10663s;
            View view = this.f10656l;
            Field field = G.f566a;
            if ((Gravity.getAbsoluteGravity(i6, view.getLayoutDirection()) & 7) == 5) {
                i2 += this.f10656l.getWidth();
            }
            if (!mVar.b()) {
                if (mVar.f10639e != null) {
                    mVar.d(i2, i3, true, true);
                }
            }
            n nVar2 = this.f10658n;
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
        if (this.f10660p || (view = this.f10656l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f10657m = view;
        K k3 = this.f10652h;
        k3.f10791v.setOnDismissListener(this);
        k3.f10782m = this;
        k3.f10790u = true;
        k3.f10791v.setFocusable(true);
        View view2 = this.f10657m;
        boolean z = this.f10659o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f10659o = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f10653i);
        }
        view2.addOnAttachStateChangeListener(this.f10654j);
        k3.f10781l = view2;
        k3.f10779j = this.f10663s;
        boolean z5 = this.f10661q;
        Context context = this.f10646b;
        g gVar = this.f10648d;
        if (!z5) {
            this.f10662r = k.m(gVar, context, this.f10650f);
            this.f10661q = true;
        }
        int i2 = this.f10662r;
        Drawable background = k3.f10791v.getBackground();
        if (background != null) {
            Rect rect = k3.f10788s;
            background.getPadding(rect);
            k3.f10773d = rect.left + rect.right + i2;
        } else {
            k3.f10773d = i2;
        }
        k3.f10791v.setInputMethodMode(2);
        Rect rect2 = this.f10633a;
        k3.f10789t = rect2 != null ? new Rect(rect2) : null;
        k3.d();
        J j2 = k3.f10772c;
        j2.setOnKeyListener(this);
        if (this.f10664t) {
            i iVar = this.f10647c;
            if (iVar.f10597l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) j2, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(iVar.f10597l);
                }
                frameLayout.setEnabled(false);
                j2.addHeaderView(frameLayout, null, false);
            }
        }
        k3.b(gVar);
        k3.d();
    }

    @Override // k.q
    public final void dismiss() {
        if (k()) {
            this.f10652h.dismiss();
        }
    }

    @Override // k.o
    public final void f() {
        this.f10661q = false;
        g gVar = this.f10648d;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // k.q
    public final ListView g() {
        return this.f10652h.f10772c;
    }

    @Override // k.o
    public final void h(n nVar) {
        this.f10658n = nVar;
    }

    @Override // k.o
    public final boolean j() {
        return false;
    }

    @Override // k.q
    public final boolean k() {
        return !this.f10660p && this.f10652h.f10791v.isShowing();
    }

    @Override // k.k
    public final void n(View view) {
        this.f10656l = view;
    }

    @Override // k.k
    public final void o(boolean z) {
        this.f10648d.f10581c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f10660p = true;
        this.f10647c.c(true);
        ViewTreeObserver viewTreeObserver = this.f10659o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f10659o = this.f10657m.getViewTreeObserver();
            }
            this.f10659o.removeGlobalOnLayoutListener(this.f10653i);
            this.f10659o = null;
        }
        this.f10657m.removeOnAttachStateChangeListener(this.f10654j);
        l lVar = this.f10655k;
        if (lVar != null) {
            lVar.onDismiss();
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

    @Override // k.k
    public final void p(int i2) {
        this.f10663s = i2;
    }

    @Override // k.k
    public final void q(int i2) {
        this.f10652h.f10774e = i2;
    }

    @Override // k.k
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f10655k = (l) onDismissListener;
    }

    @Override // k.k
    public final void s(boolean z) {
        this.f10664t = z;
    }

    @Override // k.k
    public final void t(int i2) {
        K k3 = this.f10652h;
        k3.f10775f = i2;
        k3.f10776g = true;
    }

    @Override // k.k
    public final void l(i iVar) {
    }
}
