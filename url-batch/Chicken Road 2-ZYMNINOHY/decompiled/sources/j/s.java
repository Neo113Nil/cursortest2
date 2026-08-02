package j;

import E.H;
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
import com.rockchicken.pump.up.road.R;
import java.lang.reflect.Field;
import k.C1187K;
import k.C1188L;

/* loaded from: classes.dex */
public final class s extends l implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f13703b;

    /* renamed from: c, reason: collision with root package name */
    public final j f13704c;

    /* renamed from: d, reason: collision with root package name */
    public final h f13705d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13706e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13707f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13708g;

    /* renamed from: h, reason: collision with root package name */
    public final C1188L f13709h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1170c f13710i;

    /* renamed from: j, reason: collision with root package name */
    public final d f13711j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f13712k;

    /* renamed from: l, reason: collision with root package name */
    public View f13713l;

    /* renamed from: m, reason: collision with root package name */
    public View f13714m;
    public o n;
    public ViewTreeObserver o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13715p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13716q;

    /* renamed from: r, reason: collision with root package name */
    public int f13717r;

    /* renamed from: s, reason: collision with root package name */
    public int f13718s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13719t;

    public s(Context context, j jVar, View view, int i4, boolean z) {
        int i5 = 1;
        this.f13710i = new ViewTreeObserverOnGlobalLayoutListenerC1170c(this, i5);
        this.f13711j = new d(this, i5);
        this.f13703b = context;
        this.f13704c = jVar;
        this.f13706e = z;
        this.f13705d = new h(jVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f13708g = i4;
        Resources resources = context.getResources();
        this.f13707f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f13713l = view;
        this.f13709h = new C1188L(context, i4);
        jVar.b(this, context);
    }

    @Override // j.p
    public final boolean b() {
        return false;
    }

    @Override // j.r
    public final boolean c() {
        return !this.f13715p && this.f13709h.v.isShowing();
    }

    @Override // j.p
    public final void d(j jVar, boolean z) {
        if (jVar != this.f13704c) {
            return;
        }
        dismiss();
        o oVar = this.n;
        if (oVar != null) {
            oVar.d(jVar, z);
        }
    }

    @Override // j.r
    public final void dismiss() {
        if (c()) {
            this.f13709h.dismiss();
        }
    }

    @Override // j.p
    public final void e(o oVar) {
        this.n = oVar;
    }

    @Override // j.p
    public final boolean f(t tVar) {
        boolean z;
        if (tVar.hasVisibleItems()) {
            n nVar = new n(this.f13703b, tVar, this.f13714m, this.f13706e, this.f13708g, 0);
            o oVar = this.n;
            nVar.f13699h = oVar;
            l lVar = nVar.f13700i;
            if (lVar != null) {
                lVar.e(oVar);
            }
            int size = tVar.f13652f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = tVar.getItem(i4);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            nVar.f13698g = z;
            l lVar2 = nVar.f13700i;
            if (lVar2 != null) {
                lVar2.n(z);
            }
            nVar.f13701j = this.f13712k;
            this.f13712k = null;
            this.f13704c.c(false);
            C1188L c1188l = this.f13709h;
            int i5 = c1188l.f13927e;
            int i6 = !c1188l.f13929g ? 0 : c1188l.f13928f;
            int i7 = this.f13718s;
            View view = this.f13713l;
            Field field = H.f375a;
            if ((Gravity.getAbsoluteGravity(i7, view.getLayoutDirection()) & 7) == 5) {
                i5 += this.f13713l.getWidth();
            }
            if (!nVar.b()) {
                if (nVar.f13696e != null) {
                    nVar.d(i5, i6, true, true);
                }
            }
            o oVar2 = this.n;
            if (oVar2 != null) {
                oVar2.r(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // j.p
    public final void g() {
        this.f13716q = false;
        h hVar = this.f13705d;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // j.r
    public final ListView h() {
        return this.f13709h.f13925c;
    }

    @Override // j.l
    public final void m(View view) {
        this.f13713l = view;
    }

    @Override // j.l
    public final void n(boolean z) {
        this.f13705d.f13643c = z;
    }

    @Override // j.l
    public final void o(int i4) {
        this.f13718s = i4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f13715p = true;
        this.f13704c.c(true);
        ViewTreeObserver viewTreeObserver = this.o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.o = this.f13714m.getViewTreeObserver();
            }
            this.o.removeGlobalOnLayoutListener(this.f13710i);
            this.o = null;
        }
        this.f13714m.removeOnAttachStateChangeListener(this.f13711j);
        PopupWindow.OnDismissListener onDismissListener = this.f13712k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i4 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // j.l
    public final void p(int i4) {
        this.f13709h.f13927e = i4;
    }

    @Override // j.l
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f13712k = onDismissListener;
    }

    @Override // j.l
    public final void r(boolean z) {
        this.f13719t = z;
    }

    @Override // j.l
    public final void s(int i4) {
        C1188L c1188l = this.f13709h;
        c1188l.f13928f = i4;
        c1188l.f13929g = true;
    }

    @Override // j.r
    public final void show() {
        View view;
        if (c()) {
            return;
        }
        if (this.f13715p || (view = this.f13713l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f13714m = view;
        C1188L c1188l = this.f13709h;
        c1188l.v.setOnDismissListener(this);
        c1188l.f13935m = this;
        c1188l.f13941u = true;
        c1188l.v.setFocusable(true);
        View view2 = this.f13714m;
        boolean z = this.o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.o = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f13710i);
        }
        view2.addOnAttachStateChangeListener(this.f13711j);
        c1188l.f13934l = view2;
        c1188l.f13932j = this.f13718s;
        boolean z4 = this.f13716q;
        Context context = this.f13703b;
        h hVar = this.f13705d;
        if (!z4) {
            this.f13717r = l.l(hVar, context, this.f13707f);
            this.f13716q = true;
        }
        int i4 = this.f13717r;
        Rect rect = c1188l.f13939s;
        Drawable background = c1188l.v.getBackground();
        if (background != null) {
            background.getPadding(rect);
            c1188l.f13926d = rect.left + rect.right + i4;
        } else {
            c1188l.f13926d = i4;
        }
        c1188l.v.setInputMethodMode(2);
        Rect rect2 = this.f13690a;
        c1188l.f13940t = rect2 != null ? new Rect(rect2) : null;
        c1188l.show();
        C1187K c1187k = c1188l.f13925c;
        c1187k.setOnKeyListener(this);
        if (this.f13719t) {
            j jVar = this.f13704c;
            if (jVar.f13658l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1187k, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(jVar.f13658l);
                }
                frameLayout.setEnabled(false);
                c1187k.addHeaderView(frameLayout, null, false);
            }
        }
        c1188l.a(hVar);
        c1188l.show();
    }

    @Override // j.l
    public final void k(j jVar) {
    }
}
