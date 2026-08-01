package l;

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
import com.appsflyer.R;
import d2.a2;
import kotlin.collections.i0;
import m.g1;
import m.h1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r extends k implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public View A;
    public n B;
    public ViewTreeObserver C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean H;

    /* renamed from: e, reason: collision with root package name */
    public final Context f5718e;

    /* renamed from: i, reason: collision with root package name */
    public final i f5719i;

    /* renamed from: r, reason: collision with root package name */
    public final g f5720r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f5721s;

    /* renamed from: t, reason: collision with root package name */
    public final int f5722t;

    /* renamed from: u, reason: collision with root package name */
    public final int f5723u;

    /* renamed from: v, reason: collision with root package name */
    public final h1 f5724v;

    /* renamed from: y, reason: collision with root package name */
    public PopupWindow.OnDismissListener f5727y;

    /* renamed from: z, reason: collision with root package name */
    public View f5728z;

    /* renamed from: w, reason: collision with root package name */
    public final c f5725w = new c(this, 1);

    /* renamed from: x, reason: collision with root package name */
    public final a2 f5726x = new a2(4, this);
    public int G = 0;

    public r(Context context, i iVar, View view, int i3, boolean z10) {
        this.f5718e = context;
        this.f5719i = iVar;
        this.f5721s = z10;
        this.f5720r = new g(iVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f5723u = i3;
        Resources resources = context.getResources();
        this.f5722t = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f5728z = view;
        this.f5724v = new h1(context, i3);
        iVar.b(this, context);
    }

    @Override // l.q
    public final void a() {
        View view;
        if (j()) {
            return;
        }
        if (this.D || (view = this.f5728z) == null) {
            i0.l("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.A = view;
        h1 h1Var = this.f5724v;
        m.s sVar = h1Var.J;
        m.s sVar2 = h1Var.J;
        sVar.setOnDismissListener(this);
        h1Var.A = this;
        h1Var.I = true;
        sVar2.setFocusable(true);
        View view2 = this.A;
        boolean z10 = this.C == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.C = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f5725w);
        }
        view2.addOnAttachStateChangeListener(this.f5726x);
        h1Var.f6050z = view2;
        h1Var.f6048x = this.G;
        boolean z11 = this.E;
        Context context = this.f5718e;
        g gVar = this.f5720r;
        if (!z11) {
            this.F = k.m(gVar, context, this.f5722t);
            this.E = true;
        }
        int i3 = this.F;
        Rect rect = h1Var.G;
        Drawable background = sVar2.getBackground();
        if (background != null) {
            background.getPadding(rect);
            h1Var.f6042r = rect.left + rect.right + i3;
        } else {
            h1Var.f6042r = i3;
        }
        sVar2.setInputMethodMode(2);
        Rect rect2 = this.f5707d;
        h1Var.H = rect2 != null ? new Rect(rect2) : null;
        h1Var.a();
        g1 g1Var = h1Var.f6041i;
        g1Var.setOnKeyListener(this);
        if (this.H) {
            i iVar = this.f5719i;
            if (iVar.f5674l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) g1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(iVar.f5674l);
                }
                frameLayout.setEnabled(false);
                g1Var.addHeaderView(frameLayout, null, false);
            }
        }
        h1Var.b(gVar);
        h1Var.a();
    }

    @Override // l.o
    public final void b(i iVar, boolean z10) {
        if (iVar != this.f5719i) {
            return;
        }
        dismiss();
        n nVar = this.B;
        if (nVar != null) {
            nVar.b(iVar, z10);
        }
    }

    @Override // l.o
    public final void c() {
        this.E = false;
        g gVar = this.f5720r;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // l.q
    public final ListView d() {
        return this.f5724v.f6041i;
    }

    @Override // l.q
    public final void dismiss() {
        if (j()) {
            this.f5724v.dismiss();
        }
    }

    @Override // l.o
    public final void e(n nVar) {
        this.B = nVar;
    }

    @Override // l.o
    public final boolean h() {
        return false;
    }

    @Override // l.o
    public final boolean i(s sVar) {
        boolean z10;
        if (sVar.hasVisibleItems()) {
            m mVar = new m(this.f5718e, sVar, this.A, this.f5721s, this.f5723u, 0);
            n nVar = this.B;
            mVar.f5715h = nVar;
            k kVar = mVar.f5716i;
            if (kVar != null) {
                kVar.e(nVar);
            }
            int size = sVar.f5670f.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = sVar.getItem(i3);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i3++;
            }
            mVar.g = z10;
            k kVar2 = mVar.f5716i;
            if (kVar2 != null) {
                kVar2.o(z10);
            }
            mVar.j = this.f5727y;
            this.f5727y = null;
            this.f5719i.c(false);
            h1 h1Var = this.f5724v;
            int i10 = h1Var.f6043s;
            int i11 = !h1Var.f6045u ? 0 : h1Var.f6044t;
            if ((Gravity.getAbsoluteGravity(this.G, this.f5728z.getLayoutDirection()) & 7) == 5) {
                i10 += this.f5728z.getWidth();
            }
            if (!mVar.b()) {
                if (mVar.f5713e != null) {
                    mVar.d(i10, i11, true, true);
                }
            }
            n nVar2 = this.B;
            if (nVar2 != null) {
                nVar2.f(sVar);
            }
            return true;
        }
        return false;
    }

    @Override // l.q
    public final boolean j() {
        return !this.D && this.f5724v.J.isShowing();
    }

    @Override // l.k
    public final void n(View view) {
        this.f5728z = view;
    }

    @Override // l.k
    public final void o(boolean z10) {
        this.f5720r.f5660c = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.D = true;
        this.f5719i.c(true);
        ViewTreeObserver viewTreeObserver = this.C;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.C = this.A.getViewTreeObserver();
            }
            this.C.removeGlobalOnLayoutListener(this.f5725w);
            this.C = null;
        }
        this.A.removeOnAttachStateChangeListener(this.f5726x);
        PopupWindow.OnDismissListener onDismissListener = this.f5727y;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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

    @Override // l.k
    public final void p(int i3) {
        this.G = i3;
    }

    @Override // l.k
    public final void q(int i3) {
        this.f5724v.f6043s = i3;
    }

    @Override // l.k
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f5727y = onDismissListener;
    }

    @Override // l.k
    public final void s(boolean z10) {
        this.H = z10;
    }

    @Override // l.k
    public final void t(int i3) {
        h1 h1Var = this.f5724v;
        h1Var.f6044t = i3;
        h1Var.f6045u = true;
    }

    @Override // l.k
    public final void l(i iVar) {
    }
}
