package j;

import D.D;
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
import com.strategylink.Row.Five.R;
import java.lang.reflect.Field;
import k.P;
import k.Q;

/* loaded from: classes.dex */
public final class s extends l implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: g, reason: collision with root package name */
    public final Context f4855g;

    /* renamed from: h, reason: collision with root package name */
    public final j f4856h;

    /* renamed from: i, reason: collision with root package name */
    public final h f4857i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4858j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4859k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4860l;

    /* renamed from: m, reason: collision with root package name */
    public final Q f4861m;

    /* renamed from: n, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0433c f4862n;

    /* renamed from: o, reason: collision with root package name */
    public final d f4863o;

    /* renamed from: p, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4864p;

    /* renamed from: q, reason: collision with root package name */
    public View f4865q;

    /* renamed from: r, reason: collision with root package name */
    public View f4866r;

    /* renamed from: s, reason: collision with root package name */
    public o f4867s;

    /* renamed from: t, reason: collision with root package name */
    public ViewTreeObserver f4868t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4869u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4870v;

    /* renamed from: w, reason: collision with root package name */
    public int f4871w;

    /* renamed from: x, reason: collision with root package name */
    public int f4872x = 0;
    public boolean y;

    public s(Context context, j jVar, View view, int i7, boolean z5) {
        int i8 = 1;
        this.f4862n = new ViewTreeObserverOnGlobalLayoutListenerC0433c(this, i8);
        this.f4863o = new d(this, i8);
        this.f4855g = context;
        this.f4856h = jVar;
        this.f4858j = z5;
        this.f4857i = new h(jVar, LayoutInflater.from(context), z5, R.layout.abc_popup_menu_item_layout);
        this.f4860l = i7;
        Resources resources = context.getResources();
        this.f4859k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4865q = view;
        this.f4861m = new Q(context, i7);
        jVar.b(this, context);
    }

    @Override // j.p
    public final void a(j jVar, boolean z5) {
        if (jVar != this.f4856h) {
            return;
        }
        dismiss();
        o oVar = this.f4867s;
        if (oVar != null) {
            oVar.a(jVar, z5);
        }
    }

    @Override // j.r
    public final void b() {
        View view;
        if (h()) {
            return;
        }
        if (this.f4869u || (view = this.f4865q) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f4866r = view;
        Q q6 = this.f4861m;
        q6.f4935A.setOnDismissListener(this);
        q6.f4948r = this;
        q6.f4955z = true;
        q6.f4935A.setFocusable(true);
        View view2 = this.f4866r;
        boolean z5 = this.f4868t == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f4868t = viewTreeObserver;
        if (z5) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f4862n);
        }
        view2.addOnAttachStateChangeListener(this.f4863o);
        q6.f4947q = view2;
        q6.f4945o = this.f4872x;
        boolean z6 = this.f4870v;
        Context context = this.f4855g;
        h hVar = this.f4857i;
        if (!z6) {
            this.f4871w = l.m(hVar, context, this.f4859k);
            this.f4870v = true;
        }
        int i7 = this.f4871w;
        Rect rect = q6.f4954x;
        Drawable background = q6.f4935A.getBackground();
        if (background != null) {
            background.getPadding(rect);
            q6.f4939i = rect.left + rect.right + i7;
        } else {
            q6.f4939i = i7;
        }
        q6.f4935A.setInputMethodMode(2);
        Rect rect2 = this.f4842f;
        q6.y = rect2 != null ? new Rect(rect2) : null;
        q6.b();
        P p4 = q6.f4938h;
        p4.setOnKeyListener(this);
        if (this.y) {
            j jVar = this.f4856h;
            if (jVar.f4806l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) p4, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(jVar.f4806l);
                }
                frameLayout.setEnabled(false);
                p4.addHeaderView(frameLayout, null, false);
            }
        }
        q6.a(hVar);
        q6.b();
    }

    @Override // j.p
    public final void d() {
        this.f4870v = false;
        h hVar = this.f4857i;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // j.r
    public final void dismiss() {
        if (h()) {
            this.f4861m.dismiss();
        }
    }

    @Override // j.r
    public final ListView e() {
        return this.f4861m.f4938h;
    }

    @Override // j.p
    public final boolean g() {
        return false;
    }

    @Override // j.r
    public final boolean h() {
        return !this.f4869u && this.f4861m.f4935A.isShowing();
    }

    @Override // j.p
    public final void j(o oVar) {
        this.f4867s = oVar;
    }

    @Override // j.p
    public final boolean k(t tVar) {
        boolean z5;
        if (tVar.hasVisibleItems()) {
            n nVar = new n(this.f4855g, tVar, this.f4866r, this.f4858j, this.f4860l, 0);
            o oVar = this.f4867s;
            nVar.f4851h = oVar;
            l lVar = nVar.f4852i;
            if (lVar != null) {
                lVar.j(oVar);
            }
            int size = tVar.f4800f.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    z5 = false;
                    break;
                }
                MenuItem item = tVar.getItem(i7);
                if (item.isVisible() && item.getIcon() != null) {
                    z5 = true;
                    break;
                }
                i7++;
            }
            nVar.f4850g = z5;
            l lVar2 = nVar.f4852i;
            if (lVar2 != null) {
                lVar2.o(z5);
            }
            nVar.f4853j = this.f4864p;
            this.f4864p = null;
            this.f4856h.c(false);
            Q q6 = this.f4861m;
            int i8 = q6.f4940j;
            int i9 = !q6.f4942l ? 0 : q6.f4941k;
            int i10 = this.f4872x;
            View view = this.f4865q;
            Field field = D.f240a;
            if ((Gravity.getAbsoluteGravity(i10, view.getLayoutDirection()) & 7) == 5) {
                i8 += this.f4865q.getWidth();
            }
            if (!nVar.b()) {
                if (nVar.f4848e != null) {
                    nVar.d(i8, i9, true, true);
                }
            }
            o oVar2 = this.f4867s;
            if (oVar2 != null) {
                oVar2.b(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // j.l
    public final void n(View view) {
        this.f4865q = view;
    }

    @Override // j.l
    public final void o(boolean z5) {
        this.f4857i.f4790h = z5;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4869u = true;
        this.f4856h.c(true);
        ViewTreeObserver viewTreeObserver = this.f4868t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f4868t = this.f4866r.getViewTreeObserver();
            }
            this.f4868t.removeGlobalOnLayoutListener(this.f4862n);
            this.f4868t = null;
        }
        this.f4866r.removeOnAttachStateChangeListener(this.f4863o);
        PopupWindow.OnDismissListener onDismissListener = this.f4864p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // j.l
    public final void p(int i7) {
        this.f4872x = i7;
    }

    @Override // j.l
    public final void q(int i7) {
        this.f4861m.f4940j = i7;
    }

    @Override // j.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f4864p = onDismissListener;
    }

    @Override // j.l
    public final void s(boolean z5) {
        this.y = z5;
    }

    @Override // j.l
    public final void t(int i7) {
        Q q6 = this.f4861m;
        q6.f4941k = i7;
        q6.f4942l = true;
    }

    @Override // j.l
    public final void l(j jVar) {
    }
}
