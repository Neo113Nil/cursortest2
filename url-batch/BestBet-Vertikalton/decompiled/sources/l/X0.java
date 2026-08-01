package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC0165b;
import java.util.ArrayList;
import k.C0192p;
import k.C0194r;
import k.InterfaceC0202z;
import k.MenuC0189m;
import k.SubMenuC0176F;

/* loaded from: classes.dex */
public final class X0 implements InterfaceC0202z {

    /* renamed from: a, reason: collision with root package name */
    public MenuC0189m f3352a;

    /* renamed from: b, reason: collision with root package name */
    public C0192p f3353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3354c;

    public X0(Toolbar toolbar) {
        this.f3354c = toolbar;
    }

    @Override // k.InterfaceC0202z
    public final void b(MenuC0189m menuC0189m, boolean z2) {
    }

    @Override // k.InterfaceC0202z
    public final void c() {
        if (this.f3353b != null) {
            MenuC0189m menuC0189m = this.f3352a;
            if (menuC0189m != null) {
                int size = menuC0189m.f3167f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f3352a.getItem(i) == this.f3353b) {
                        return;
                    }
                }
            }
            h(this.f3353b);
        }
    }

    @Override // k.InterfaceC0202z
    public final boolean d(C0192p c0192p) {
        Toolbar toolbar = this.f3354c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = c0192p.getActionView();
        toolbar.i = actionView;
        this.f3353b = c0192p;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            Y0 h = Toolbar.h();
            h.f3356a = (toolbar.f1757n & 112) | 8388611;
            h.f3357b = 2;
            toolbar.i.setLayoutParams(h);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((Y0) childAt.getLayoutParams()).f3357b != 2 && childAt != toolbar.f1747a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1735E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0192p.f3190C = true;
        c0192p.f3201n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0165b) {
            ((C0194r) ((InterfaceC0165b) callback)).f3217a.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // k.InterfaceC0202z
    public final boolean e(SubMenuC0176F subMenuC0176F) {
        return false;
    }

    @Override // k.InterfaceC0202z
    public final boolean h(C0192p c0192p) {
        Toolbar toolbar = this.f3354c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0165b) {
            ((C0194r) ((InterfaceC0165b) callback)).f3217a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.f1735E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f3353b = null;
        toolbar.requestLayout();
        c0192p.f3190C = false;
        c0192p.f3201n.p(false);
        toolbar.u();
        return true;
    }

    @Override // k.InterfaceC0202z
    public final void j(Context context, MenuC0189m menuC0189m) {
        C0192p c0192p;
        MenuC0189m menuC0189m2 = this.f3352a;
        if (menuC0189m2 != null && (c0192p = this.f3353b) != null) {
            menuC0189m2.d(c0192p);
        }
        this.f3352a = menuC0189m;
    }

    @Override // k.InterfaceC0202z
    public final boolean k() {
        return false;
    }
}
