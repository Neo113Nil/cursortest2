package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC0145b;
import java.util.ArrayList;
import k.C0168o;
import k.C0170q;
import k.InterfaceC0178y;
import k.MenuC0166m;
import k.SubMenuC0153E;

/* loaded from: classes.dex */
public final class Y0 implements InterfaceC0178y {

    /* renamed from: a, reason: collision with root package name */
    public MenuC0166m f2902a;

    /* renamed from: b, reason: collision with root package name */
    public C0168o f2903b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2904c;

    public Y0(Toolbar toolbar) {
        this.f2904c = toolbar;
    }

    @Override // k.InterfaceC0178y
    public final void b(MenuC0166m menuC0166m, boolean z2) {
    }

    @Override // k.InterfaceC0178y
    public final void c() {
        if (this.f2903b != null) {
            MenuC0166m menuC0166m = this.f2902a;
            if (menuC0166m != null) {
                int size = menuC0166m.f2717f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f2902a.getItem(i) == this.f2903b) {
                        return;
                    }
                }
            }
            h(this.f2903b);
        }
    }

    @Override // k.InterfaceC0178y
    public final boolean d(C0168o c0168o) {
        Toolbar toolbar = this.f2904c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = c0168o.getActionView();
        toolbar.i = actionView;
        this.f2903b = c0168o;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            Z0 h = Toolbar.h();
            h.f2905a = (toolbar.f1384n & 112) | 8388611;
            h.f2906b = 2;
            toolbar.i.setLayoutParams(h);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((Z0) childAt.getLayoutParams()).f2906b != 2 && childAt != toolbar.f1374a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1362E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0168o.f2739C = true;
        c0168o.f2750n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0145b) {
            ((C0170q) ((InterfaceC0145b) callback)).f2766a.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // k.InterfaceC0178y
    public final boolean f(SubMenuC0153E subMenuC0153E) {
        return false;
    }

    @Override // k.InterfaceC0178y
    public final boolean h(C0168o c0168o) {
        Toolbar toolbar = this.f2904c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0145b) {
            ((C0170q) ((InterfaceC0145b) callback)).f2766a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.f1362E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2903b = null;
        toolbar.requestLayout();
        c0168o.f2739C = false;
        c0168o.f2750n.p(false);
        toolbar.u();
        return true;
    }

    @Override // k.InterfaceC0178y
    public final void j(Context context, MenuC0166m menuC0166m) {
        C0168o c0168o;
        MenuC0166m menuC0166m2 = this.f2902a;
        if (menuC0166m2 != null && (c0168o = this.f2903b) != null) {
            menuC0166m2.d(c0168o);
        }
        this.f2902a = menuC0166m;
    }

    @Override // k.InterfaceC0178y
    public final boolean k() {
        return false;
    }
}
