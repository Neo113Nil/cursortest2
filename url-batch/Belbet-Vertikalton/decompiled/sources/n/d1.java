package n;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import l.InterfaceC0205b;
import m.C0231o;
import m.C0233q;
import m.InterfaceC0241y;
import m.MenuC0229m;
import m.SubMenuC0216E;

/* loaded from: classes.dex */
public final class d1 implements InterfaceC0241y {

    /* renamed from: a, reason: collision with root package name */
    public MenuC0229m f3610a;

    /* renamed from: b, reason: collision with root package name */
    public C0231o f3611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3612c;

    public d1(Toolbar toolbar) {
        this.f3612c = toolbar;
    }

    @Override // m.InterfaceC0241y
    public final void b(MenuC0229m menuC0229m, boolean z2) {
    }

    @Override // m.InterfaceC0241y
    public final boolean c(C0231o c0231o) {
        Toolbar toolbar = this.f3612c;
        toolbar.c();
        ViewParent parent = toolbar.f1799h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1799h);
            }
            toolbar.addView(toolbar.f1799h);
        }
        View actionView = c0231o.getActionView();
        toolbar.i = actionView;
        this.f3611b = c0231o;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            e1 h2 = Toolbar.h();
            h2.f3613a = (toolbar.f1803n & 112) | 8388611;
            h2.f3614b = 2;
            toolbar.i.setLayoutParams(h2);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((e1) childAt.getLayoutParams()).f3614b != 2 && childAt != toolbar.f1793a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1781E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0231o.f3374C = true;
        c0231o.f3385n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0205b) {
            ((C0233q) ((InterfaceC0205b) callback)).f3401a.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // m.InterfaceC0241y
    public final void d() {
        if (this.f3611b != null) {
            MenuC0229m menuC0229m = this.f3610a;
            if (menuC0229m != null) {
                int size = menuC0229m.f3352f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f3610a.getItem(i) == this.f3611b) {
                        return;
                    }
                }
            }
            j(this.f3611b);
        }
    }

    @Override // m.InterfaceC0241y
    public final void f(Context context, MenuC0229m menuC0229m) {
        C0231o c0231o;
        MenuC0229m menuC0229m2 = this.f3610a;
        if (menuC0229m2 != null && (c0231o = this.f3611b) != null) {
            menuC0229m2.d(c0231o);
        }
        this.f3610a = menuC0229m;
    }

    @Override // m.InterfaceC0241y
    public final boolean g() {
        return false;
    }

    @Override // m.InterfaceC0241y
    public final boolean j(C0231o c0231o) {
        Toolbar toolbar = this.f3612c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0205b) {
            ((C0233q) ((InterfaceC0205b) callback)).f3401a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.f1799h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.f1781E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f3611b = null;
        toolbar.requestLayout();
        c0231o.f3374C = false;
        c0231o.f3385n.p(false);
        toolbar.u();
        return true;
    }

    @Override // m.InterfaceC0241y
    public final boolean k(SubMenuC0216E subMenuC0216E) {
        return false;
    }
}
