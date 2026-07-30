package m;

import I.T;
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
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.util.WeakHashMap;
import n.C0742w0;
import n.O0;

/* loaded from: classes.dex */
public final class E extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: A, reason: collision with root package name */
    public int f6325A = 0;

    /* renamed from: B, reason: collision with root package name */
    public boolean f6326B;

    /* renamed from: e, reason: collision with root package name */
    public final Context f6327e;

    /* renamed from: i, reason: collision with root package name */
    public final m f6328i;

    /* renamed from: l, reason: collision with root package name */
    public final j f6329l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f6330m;

    /* renamed from: n, reason: collision with root package name */
    public final int f6331n;

    /* renamed from: o, reason: collision with root package name */
    public final int f6332o;

    /* renamed from: p, reason: collision with root package name */
    public final O0 f6333p;

    /* renamed from: q, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0679d f6334q;

    /* renamed from: r, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0680e f6335r;

    /* renamed from: s, reason: collision with root package name */
    public PopupWindow.OnDismissListener f6336s;

    /* renamed from: t, reason: collision with root package name */
    public View f6337t;

    /* renamed from: u, reason: collision with root package name */
    public View f6338u;

    /* renamed from: v, reason: collision with root package name */
    public y f6339v;

    /* renamed from: w, reason: collision with root package name */
    public ViewTreeObserver f6340w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6341x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6342y;

    /* renamed from: z, reason: collision with root package name */
    public int f6343z;

    public E(Context context, m mVar, View view, int i2, boolean z7) {
        int i5 = 1;
        this.f6334q = new ViewTreeObserverOnGlobalLayoutListenerC0679d(i5, this);
        this.f6335r = new ViewOnAttachStateChangeListenerC0680e(this, i5);
        this.f6327e = context;
        this.f6328i = mVar;
        this.f6330m = z7;
        this.f6329l = new j(mVar, LayoutInflater.from(context), z7, R.layout.abc_popup_menu_item_layout);
        this.f6332o = i2;
        Resources resources = context.getResources();
        this.f6331n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f6337t = view;
        this.f6333p = new O0(context, null, i2);
        mVar.b(this, context);
    }

    @Override // m.z
    public final void a(m mVar, boolean z7) {
        if (mVar != this.f6328i) {
            return;
        }
        dismiss();
        y yVar = this.f6339v;
        if (yVar != null) {
            yVar.a(mVar, z7);
        }
    }

    @Override // m.InterfaceC0675D
    public final boolean b() {
        return !this.f6341x && this.f6333p.f6649G.isShowing();
    }

    @Override // m.InterfaceC0675D
    public final void c() {
        View view;
        if (b()) {
            return;
        }
        if (this.f6341x || (view = this.f6337t) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f6338u = view;
        O0 o02 = this.f6333p;
        o02.f6649G.setOnDismissListener(this);
        o02.f6665x = this;
        o02.f6648F = true;
        o02.f6649G.setFocusable(true);
        View view2 = this.f6338u;
        boolean z7 = this.f6340w == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f6340w = viewTreeObserver;
        if (z7) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f6334q);
        }
        view2.addOnAttachStateChangeListener(this.f6335r);
        o02.f6664w = view2;
        o02.f6661t = this.f6325A;
        boolean z8 = this.f6342y;
        Context context = this.f6327e;
        j jVar = this.f6329l;
        if (!z8) {
            this.f6343z = u.m(jVar, context, this.f6331n);
            this.f6342y = true;
        }
        o02.r(this.f6343z);
        o02.f6649G.setInputMethodMode(2);
        Rect rect = this.f6474d;
        o02.f6647E = rect != null ? new Rect(rect) : null;
        o02.c();
        C0742w0 c0742w0 = o02.f6652i;
        c0742w0.setOnKeyListener(this);
        if (this.f6326B) {
            m mVar = this.f6328i;
            if (mVar.f6421m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0742w0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(mVar.f6421m);
                }
                frameLayout.setEnabled(false);
                c0742w0.addHeaderView(frameLayout, null, false);
            }
        }
        o02.p(jVar);
        o02.c();
    }

    @Override // m.z
    public final void d() {
        this.f6342y = false;
        j jVar = this.f6329l;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // m.InterfaceC0675D
    public final void dismiss() {
        if (b()) {
            this.f6333p.dismiss();
        }
    }

    @Override // m.InterfaceC0675D
    public final C0742w0 e() {
        return this.f6333p.f6652i;
    }

    @Override // m.z
    public final boolean h() {
        return false;
    }

    @Override // m.z
    public final boolean i(F f7) {
        boolean z7;
        if (f7.hasVisibleItems()) {
            x xVar = new x(this.f6327e, f7, this.f6338u, this.f6330m, this.f6332o, 0);
            y yVar = this.f6339v;
            xVar.f6483h = yVar;
            u uVar = xVar.f6484i;
            if (uVar != null) {
                uVar.j(yVar);
            }
            int size = f7.f6415f.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z7 = false;
                    break;
                }
                MenuItem item = f7.getItem(i2);
                if (item.isVisible() && item.getIcon() != null) {
                    z7 = true;
                    break;
                }
                i2++;
            }
            xVar.f6482g = z7;
            u uVar2 = xVar.f6484i;
            if (uVar2 != null) {
                uVar2.o(z7);
            }
            xVar.j = this.f6336s;
            this.f6336s = null;
            this.f6328i.c(false);
            O0 o02 = this.f6333p;
            int i5 = o02.f6655n;
            int m2 = o02.m();
            int i7 = this.f6325A;
            View view = this.f6337t;
            WeakHashMap weakHashMap = T.f1153a;
            if ((Gravity.getAbsoluteGravity(i7, view.getLayoutDirection()) & 7) == 5) {
                i5 += this.f6337t.getWidth();
            }
            if (!xVar.b()) {
                if (xVar.f6480e != null) {
                    xVar.d(i5, m2, true, true);
                }
            }
            y yVar2 = this.f6339v;
            if (yVar2 != null) {
                yVar2.i(f7);
            }
            return true;
        }
        return false;
    }

    @Override // m.z
    public final void j(y yVar) {
        this.f6339v = yVar;
    }

    @Override // m.u
    public final void n(View view) {
        this.f6337t = view;
    }

    @Override // m.u
    public final void o(boolean z7) {
        this.f6329l.f6405i = z7;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f6341x = true;
        this.f6328i.c(true);
        ViewTreeObserver viewTreeObserver = this.f6340w;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f6340w = this.f6338u.getViewTreeObserver();
            }
            this.f6340w.removeGlobalOnLayoutListener(this.f6334q);
            this.f6340w = null;
        }
        this.f6338u.removeOnAttachStateChangeListener(this.f6335r);
        PopupWindow.OnDismissListener onDismissListener = this.f6336s;
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

    @Override // m.u
    public final void p(int i2) {
        this.f6325A = i2;
    }

    @Override // m.u
    public final void q(int i2) {
        this.f6333p.f6655n = i2;
    }

    @Override // m.u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f6336s = onDismissListener;
    }

    @Override // m.u
    public final void s(boolean z7) {
        this.f6326B = z7;
    }

    @Override // m.u
    public final void t(int i2) {
        this.f6333p.i(i2);
    }

    @Override // m.u
    public final void l(m mVar) {
    }
}
