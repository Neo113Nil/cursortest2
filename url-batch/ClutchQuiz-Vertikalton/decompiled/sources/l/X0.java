package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC0148b;
import java.util.ArrayList;
import k.C0169o;
import k.C0171q;
import k.InterfaceC0179y;
import k.MenuC0167m;
import k.SubMenuC0154E;

/* loaded from: classes.dex */
public final class X0 implements InterfaceC0179y {

    /* renamed from: a, reason: collision with root package name */
    public MenuC0167m f2932a;

    /* renamed from: b, reason: collision with root package name */
    public C0169o f2933b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2934c;

    public X0(Toolbar toolbar) {
        this.f2934c = toolbar;
    }

    @Override // k.InterfaceC0179y
    public final void b(MenuC0167m menuC0167m, boolean z2) {
    }

    @Override // k.InterfaceC0179y
    public final void c() {
        if (this.f2933b != null) {
            MenuC0167m menuC0167m = this.f2932a;
            if (menuC0167m != null) {
                int size = menuC0167m.f2750f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f2932a.getItem(i) == this.f2933b) {
                        return;
                    }
                }
            }
            h(this.f2933b);
        }
    }

    @Override // k.InterfaceC0179y
    public final boolean d(C0169o c0169o) {
        Toolbar toolbar = this.f2934c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = c0169o.getActionView();
        toolbar.i = actionView;
        this.f2933b = c0169o;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            Y0 h = Toolbar.h();
            h.f2935a = (toolbar.f1376n & 112) | 8388611;
            h.f2936b = 2;
            toolbar.i.setLayoutParams(h);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((Y0) childAt.getLayoutParams()).f2936b != 2 && childAt != toolbar.f1366a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1354E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0169o.f2772C = true;
        c0169o.f2783n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0148b) {
            ((C0171q) ((InterfaceC0148b) callback)).f2799a.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // k.InterfaceC0179y
    public final boolean f(SubMenuC0154E subMenuC0154E) {
        return false;
    }

    @Override // k.InterfaceC0179y
    public final boolean h(C0169o c0169o) {
        Toolbar toolbar = this.f2934c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0148b) {
            ((C0171q) ((InterfaceC0148b) callback)).f2799a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.f1354E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2933b = null;
        toolbar.requestLayout();
        c0169o.f2772C = false;
        c0169o.f2783n.p(false);
        toolbar.u();
        return true;
    }

    @Override // k.InterfaceC0179y
    public final void j(Context context, MenuC0167m menuC0167m) {
        C0169o c0169o;
        MenuC0167m menuC0167m2 = this.f2932a;
        if (menuC0167m2 != null && (c0169o = this.f2933b) != null) {
            menuC0167m2.d(c0169o);
        }
        this.f2932a = menuC0167m;
    }

    @Override // k.InterfaceC0179y
    public final boolean k() {
        return false;
    }
}
