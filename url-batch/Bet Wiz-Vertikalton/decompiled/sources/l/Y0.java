package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC0140b;
import java.util.ArrayList;
import k.C0162o;
import k.C0164q;
import k.InterfaceC0172y;
import k.MenuC0160m;
import k.SubMenuC0147E;

/* loaded from: classes.dex */
public final class Y0 implements InterfaceC0172y {

    /* renamed from: a, reason: collision with root package name */
    public MenuC0160m f2938a;

    /* renamed from: b, reason: collision with root package name */
    public C0162o f2939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2940c;

    public Y0(Toolbar toolbar) {
        this.f2940c = toolbar;
    }

    @Override // k.InterfaceC0172y
    public final void b(MenuC0160m menuC0160m, boolean z2) {
    }

    @Override // k.InterfaceC0172y
    public final void c() {
        if (this.f2939b != null) {
            MenuC0160m menuC0160m = this.f2938a;
            if (menuC0160m != null) {
                int size = menuC0160m.f2665f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f2938a.getItem(i) == this.f2939b) {
                        return;
                    }
                }
            }
            h(this.f2939b);
        }
    }

    @Override // k.InterfaceC0172y
    public final boolean d(C0162o c0162o) {
        Toolbar toolbar = this.f2940c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = c0162o.getActionView();
        toolbar.i = actionView;
        this.f2939b = c0162o;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            Z0 h = Toolbar.h();
            h.f2941a = (toolbar.f1339n & 112) | 8388611;
            h.f2942b = 2;
            toolbar.i.setLayoutParams(h);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((Z0) childAt.getLayoutParams()).f2942b != 2 && childAt != toolbar.f1329a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1317E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0162o.f2687C = true;
        c0162o.f2698n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0140b) {
            ((C0164q) ((InterfaceC0140b) callback)).f2714a.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // k.InterfaceC0172y
    public final boolean f(SubMenuC0147E subMenuC0147E) {
        return false;
    }

    @Override // k.InterfaceC0172y
    public final boolean h(C0162o c0162o) {
        Toolbar toolbar = this.f2940c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0140b) {
            ((C0164q) ((InterfaceC0140b) callback)).f2714a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.f1317E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2939b = null;
        toolbar.requestLayout();
        c0162o.f2687C = false;
        c0162o.f2698n.p(false);
        toolbar.u();
        return true;
    }

    @Override // k.InterfaceC0172y
    public final void j(Context context, MenuC0160m menuC0160m) {
        C0162o c0162o;
        MenuC0160m menuC0160m2 = this.f2938a;
        if (menuC0160m2 != null && (c0162o = this.f2939b) != null) {
            menuC0160m2.d(c0162o);
        }
        this.f2938a = menuC0160m;
    }

    @Override // k.InterfaceC0172y
    public final boolean k() {
        return false;
    }
}
