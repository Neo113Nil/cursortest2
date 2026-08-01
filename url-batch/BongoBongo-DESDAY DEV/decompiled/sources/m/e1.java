package m;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import k.InterfaceC0148b;
import l.C0171o;
import l.C0173q;
import l.InterfaceC0181y;
import l.MenuC0169m;
import l.SubMenuC0156E;

/* loaded from: classes.dex */
public final class e1 implements InterfaceC0181y {

    /* renamed from: a, reason: collision with root package name */
    public MenuC0169m f3083a;

    /* renamed from: b, reason: collision with root package name */
    public C0171o f3084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3085c;

    public e1(Toolbar toolbar) {
        this.f3085c = toolbar;
    }

    @Override // l.InterfaceC0181y
    public final void b(MenuC0169m menuC0169m, boolean z2) {
    }

    @Override // l.InterfaceC0181y
    public final void c() {
        if (this.f3084b != null) {
            MenuC0169m menuC0169m = this.f3083a;
            if (menuC0169m != null) {
                int size = menuC0169m.f2819f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f3083a.getItem(i) == this.f3084b) {
                        return;
                    }
                }
            }
            k(this.f3084b);
        }
    }

    @Override // l.InterfaceC0181y
    public final void d(Context context, MenuC0169m menuC0169m) {
        C0171o c0171o;
        MenuC0169m menuC0169m2 = this.f3083a;
        if (menuC0169m2 != null && (c0171o = this.f3084b) != null) {
            menuC0169m2.d(c0171o);
        }
        this.f3083a = menuC0169m;
    }

    @Override // l.InterfaceC0181y
    public final boolean e(SubMenuC0156E subMenuC0156E) {
        return false;
    }

    @Override // l.InterfaceC0181y
    public final boolean h(C0171o c0171o) {
        Toolbar toolbar = this.f3085c;
        toolbar.c();
        ViewParent parent = toolbar.f1435h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1435h);
            }
            toolbar.addView(toolbar.f1435h);
        }
        View actionView = c0171o.getActionView();
        toolbar.i = actionView;
        this.f3084b = c0171o;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            f1 h2 = Toolbar.h();
            h2.f3086a = (toolbar.f1440n & 112) | 8388611;
            h2.f3087b = 2;
            toolbar.i.setLayoutParams(h2);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((f1) childAt.getLayoutParams()).f3087b != 2 && childAt != toolbar.f1429a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1417E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0171o.f2842C = true;
        c0171o.f2854n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0148b) {
            ((C0173q) ((InterfaceC0148b) callback)).f2870a.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // l.InterfaceC0181y
    public final boolean i() {
        return false;
    }

    @Override // l.InterfaceC0181y
    public final boolean k(C0171o c0171o) {
        Toolbar toolbar = this.f3085c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0148b) {
            ((C0173q) ((InterfaceC0148b) callback)).f2870a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.f1435h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.f1417E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f3084b = null;
        toolbar.requestLayout();
        c0171o.f2842C = false;
        c0171o.f2854n.p(false);
        toolbar.u();
        return true;
    }
}
