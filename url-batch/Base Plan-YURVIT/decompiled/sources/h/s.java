package h;

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
import com.crane.slab.beam.R;
import i.M;
import i.N;
import java.lang.reflect.Field;
import y.x;

/* loaded from: classes.dex */
public final class s extends l implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: f, reason: collision with root package name */
    public final Context f2068f;

    /* renamed from: g, reason: collision with root package name */
    public final MenuC0143j f2069g;

    /* renamed from: h, reason: collision with root package name */
    public final C0141h f2070h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2071i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2072j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2073k;

    /* renamed from: l, reason: collision with root package name */
    public final N f2074l;

    /* renamed from: m, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0136c f2075m;

    /* renamed from: n, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0137d f2076n;

    /* renamed from: o, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2077o;

    /* renamed from: p, reason: collision with root package name */
    public View f2078p;

    /* renamed from: q, reason: collision with root package name */
    public View f2079q;

    /* renamed from: r, reason: collision with root package name */
    public o f2080r;

    /* renamed from: s, reason: collision with root package name */
    public ViewTreeObserver f2081s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2082u;

    /* renamed from: v, reason: collision with root package name */
    public int f2083v;

    /* renamed from: w, reason: collision with root package name */
    public int f2084w = 0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2085x;

    public s(Context context, MenuC0143j menuC0143j, View view, int i2, boolean z2) {
        int i3 = 1;
        this.f2075m = new ViewTreeObserverOnGlobalLayoutListenerC0136c(this, i3);
        this.f2076n = new ViewOnAttachStateChangeListenerC0137d(this, i3);
        this.f2068f = context;
        this.f2069g = menuC0143j;
        this.f2071i = z2;
        this.f2070h = new C0141h(menuC0143j, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2073k = i2;
        Resources resources = context.getResources();
        this.f2072j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2078p = view;
        this.f2074l = new N(context, i2);
        menuC0143j.b(this, context);
    }

    @Override // h.p
    public final void a(MenuC0143j menuC0143j, boolean z2) {
        if (menuC0143j != this.f2069g) {
            return;
        }
        dismiss();
        o oVar = this.f2080r;
        if (oVar != null) {
            oVar.a(menuC0143j, z2);
        }
    }

    @Override // h.p
    public final void b(o oVar) {
        this.f2080r = oVar;
    }

    @Override // h.r
    public final void c() {
        View view;
        if (j()) {
            return;
        }
        if (this.t || (view = this.f2078p) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2079q = view;
        N n2 = this.f2074l;
        n2.f2155z.setOnDismissListener(this);
        n2.f2147q = this;
        n2.f2154y = true;
        n2.f2155z.setFocusable(true);
        View view2 = this.f2079q;
        boolean z2 = this.f2081s == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2081s = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2075m);
        }
        view2.addOnAttachStateChangeListener(this.f2076n);
        n2.f2146p = view2;
        n2.f2144n = this.f2084w;
        boolean z3 = this.f2082u;
        Context context = this.f2068f;
        C0141h c0141h = this.f2070h;
        if (!z3) {
            this.f2083v = l.m(c0141h, context, this.f2072j);
            this.f2082u = true;
        }
        int i2 = this.f2083v;
        Rect rect = n2.f2152w;
        Drawable background = n2.f2155z.getBackground();
        if (background != null) {
            background.getPadding(rect);
            n2.f2138h = rect.left + rect.right + i2;
        } else {
            n2.f2138h = i2;
        }
        n2.f2155z.setInputMethodMode(2);
        Rect rect2 = this.f2055e;
        n2.f2153x = rect2 != null ? new Rect(rect2) : null;
        n2.c();
        M m2 = n2.f2137g;
        m2.setOnKeyListener(this);
        if (this.f2085x) {
            MenuC0143j menuC0143j = this.f2069g;
            if (menuC0143j.f2020l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) m2, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0143j.f2020l);
                }
                frameLayout.setEnabled(false);
                m2.addHeaderView(frameLayout, null, false);
            }
        }
        n2.a(c0141h);
        n2.c();
    }

    @Override // h.p
    public final void d() {
        this.f2082u = false;
        C0141h c0141h = this.f2070h;
        if (c0141h != null) {
            c0141h.notifyDataSetChanged();
        }
    }

    @Override // h.r
    public final void dismiss() {
        if (j()) {
            this.f2074l.dismiss();
        }
    }

    @Override // h.r
    public final ListView e() {
        return this.f2074l.f2137g;
    }

    @Override // h.p
    public final boolean g() {
        return false;
    }

    @Override // h.r
    public final boolean j() {
        return !this.t && this.f2074l.f2155z.isShowing();
    }

    @Override // h.p
    public final boolean k(t tVar) {
        boolean z2;
        if (tVar.hasVisibleItems()) {
            n nVar = new n(this.f2068f, tVar, this.f2079q, this.f2071i, this.f2073k, 0);
            o oVar = this.f2080r;
            nVar.f2064h = oVar;
            l lVar = nVar.f2065i;
            if (lVar != null) {
                lVar.b(oVar);
            }
            int size = tVar.f2014f.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z2 = false;
                    break;
                }
                MenuItem item = tVar.getItem(i2);
                if (item.isVisible() && item.getIcon() != null) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            nVar.f2063g = z2;
            l lVar2 = nVar.f2065i;
            if (lVar2 != null) {
                lVar2.o(z2);
            }
            nVar.f2066j = this.f2077o;
            this.f2077o = null;
            this.f2069g.c(false);
            N n2 = this.f2074l;
            int i3 = n2.f2139i;
            int i4 = !n2.f2141k ? 0 : n2.f2140j;
            int i5 = this.f2084w;
            View view = this.f2078p;
            Field field = x.f3160a;
            if ((Gravity.getAbsoluteGravity(i5, view.getLayoutDirection()) & 7) == 5) {
                i3 += this.f2078p.getWidth();
            }
            if (!nVar.b()) {
                if (nVar.f2061e != null) {
                    nVar.d(i3, i4, true, true);
                }
            }
            o oVar2 = this.f2080r;
            if (oVar2 != null) {
                oVar2.n(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // h.l
    public final void n(View view) {
        this.f2078p = view;
    }

    @Override // h.l
    public final void o(boolean z2) {
        this.f2070h.f2004g = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.t = true;
        this.f2069g.c(true);
        ViewTreeObserver viewTreeObserver = this.f2081s;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2081s = this.f2079q.getViewTreeObserver();
            }
            this.f2081s.removeGlobalOnLayoutListener(this.f2075m);
            this.f2081s = null;
        }
        this.f2079q.removeOnAttachStateChangeListener(this.f2076n);
        PopupWindow.OnDismissListener onDismissListener = this.f2077o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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

    @Override // h.l
    public final void p(int i2) {
        this.f2084w = i2;
    }

    @Override // h.l
    public final void q(int i2) {
        this.f2074l.f2139i = i2;
    }

    @Override // h.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2077o = onDismissListener;
    }

    @Override // h.l
    public final void s(boolean z2) {
        this.f2085x = z2;
    }

    @Override // h.l
    public final void t(int i2) {
        N n2 = this.f2074l;
        n2.f2140j = i2;
        n2.f2141k = true;
    }

    @Override // h.l
    public final void l(MenuC0143j menuC0143j) {
    }
}
