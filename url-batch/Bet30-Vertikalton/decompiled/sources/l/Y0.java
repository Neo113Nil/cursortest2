package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC0138b;
import java.util.ArrayList;
import k.C0159o;
import k.C0161q;
import k.InterfaceC0169y;
import k.MenuC0157m;
import k.SubMenuC0144E;

/* loaded from: classes.dex */
public final class Y0 implements InterfaceC0169y {

    /* renamed from: a, reason: collision with root package name */
    public MenuC0157m f2941a;

    /* renamed from: b, reason: collision with root package name */
    public C0159o f2942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2943c;

    public Y0(Toolbar toolbar) {
        this.f2943c = toolbar;
    }

    @Override // k.InterfaceC0169y
    public final void b(MenuC0157m menuC0157m, boolean z2) {
    }

    @Override // k.InterfaceC0169y
    public final void c() {
        if (this.f2942b != null) {
            MenuC0157m menuC0157m = this.f2941a;
            if (menuC0157m != null) {
                int size = menuC0157m.f2689f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f2941a.getItem(i) == this.f2942b) {
                        return;
                    }
                }
            }
            h(this.f2942b);
        }
    }

    @Override // k.InterfaceC0169y
    public final boolean d(C0159o c0159o) {
        Toolbar toolbar = this.f2943c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = c0159o.getActionView();
        toolbar.i = actionView;
        this.f2942b = c0159o;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            Z0 h = Toolbar.h();
            h.f2954a = (toolbar.f1234n & 112) | 8388611;
            h.f2955b = 2;
            toolbar.i.setLayoutParams(h);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((Z0) childAt.getLayoutParams()).f2955b != 2 && childAt != toolbar.f1224a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1212E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0159o.f2711C = true;
        c0159o.f2722n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0138b) {
            ((C0161q) ((InterfaceC0138b) callback)).f2738a.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // k.InterfaceC0169y
    public final boolean e(SubMenuC0144E subMenuC0144E) {
        return false;
    }

    @Override // k.InterfaceC0169y
    public final boolean h(C0159o c0159o) {
        Toolbar toolbar = this.f2943c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0138b) {
            ((C0161q) ((InterfaceC0138b) callback)).f2738a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.f1212E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2942b = null;
        toolbar.requestLayout();
        c0159o.f2711C = false;
        c0159o.f2722n.p(false);
        toolbar.u();
        return true;
    }

    @Override // k.InterfaceC0169y
    public final void j(Context context, MenuC0157m menuC0157m) {
        C0159o c0159o;
        MenuC0157m menuC0157m2 = this.f2941a;
        if (menuC0157m2 != null && (c0159o = this.f2942b) != null) {
            menuC0157m2.d(c0159o);
        }
        this.f2941a = menuC0157m;
    }

    @Override // k.InterfaceC0169y
    public final boolean k() {
        return false;
    }
}
