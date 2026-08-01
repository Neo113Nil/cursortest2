package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC0171c;
import java.util.ArrayList;
import k.C0204o;
import k.C0206q;
import k.InterfaceC0214y;
import k.MenuC0202m;
import k.SubMenuC0189E;

/* loaded from: classes.dex */
public final class Y0 implements InterfaceC0214y {

    /* renamed from: a, reason: collision with root package name */
    public MenuC0202m f3317a;

    /* renamed from: b, reason: collision with root package name */
    public C0204o f3318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3319c;

    public Y0(Toolbar toolbar) {
        this.f3319c = toolbar;
    }

    @Override // k.InterfaceC0214y
    public final void b(MenuC0202m menuC0202m, boolean z2) {
    }

    @Override // k.InterfaceC0214y
    public final void c() {
        if (this.f3318b != null) {
            MenuC0202m menuC0202m = this.f3317a;
            if (menuC0202m != null) {
                int size = menuC0202m.f3066f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f3317a.getItem(i) == this.f3318b) {
                        return;
                    }
                }
            }
            h(this.f3318b);
        }
    }

    @Override // k.InterfaceC0214y
    public final boolean d(C0204o c0204o) {
        Toolbar toolbar = this.f3319c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = c0204o.getActionView();
        toolbar.i = actionView;
        this.f3318b = c0204o;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            Z0 h = Toolbar.h();
            h.f3331a = (toolbar.f1092n & 112) | 8388611;
            h.f3332b = 2;
            toolbar.i.setLayoutParams(h);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((Z0) childAt.getLayoutParams()).f3332b != 2 && childAt != toolbar.f1081a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1066E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0204o.f3088C = true;
        c0204o.f3100n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0171c) {
            ((C0206q) ((InterfaceC0171c) callback)).f3116a.onActionViewExpanded();
        }
        toolbar.w();
        return true;
    }

    @Override // k.InterfaceC0214y
    public final boolean f(SubMenuC0189E subMenuC0189E) {
        return false;
    }

    @Override // k.InterfaceC0214y
    public final boolean h(C0204o c0204o) {
        Toolbar toolbar = this.f3319c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0171c) {
            ((C0206q) ((InterfaceC0171c) callback)).f3116a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.f1066E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f3318b = null;
        toolbar.requestLayout();
        c0204o.f3088C = false;
        c0204o.f3100n.p(false);
        toolbar.w();
        return true;
    }

    @Override // k.InterfaceC0214y
    public final void j(Context context, MenuC0202m menuC0202m) {
        C0204o c0204o;
        MenuC0202m menuC0202m2 = this.f3317a;
        if (menuC0202m2 != null && (c0204o = this.f3318b) != null) {
            menuC0202m2.d(c0204o);
        }
        this.f3317a = menuC0202m;
    }

    @Override // k.InterfaceC0214y
    public final boolean k() {
        return false;
    }
}
