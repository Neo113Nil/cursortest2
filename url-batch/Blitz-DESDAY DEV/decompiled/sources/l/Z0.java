package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC0145b;
import java.util.ArrayList;
import k.SubMenuC0162E;

/* loaded from: classes.dex */
public final class Z0 implements k.y {

    /* renamed from: a, reason: collision with root package name */
    public k.m f2956a;

    /* renamed from: b, reason: collision with root package name */
    public k.o f2957b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2958c;

    public Z0(Toolbar toolbar) {
        this.f2958c = toolbar;
    }

    @Override // k.y
    public final void b(k.m mVar, boolean z2) {
    }

    @Override // k.y
    public final void c() {
        if (this.f2957b != null) {
            k.m mVar = this.f2956a;
            if (mVar != null) {
                int size = mVar.f2769f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f2956a.getItem(i) == this.f2957b) {
                        return;
                    }
                }
            }
            h(this.f2957b);
        }
    }

    @Override // k.y
    public final boolean d(k.o oVar) {
        Toolbar toolbar = this.f2958c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = oVar.getActionView();
        toolbar.i = actionView;
        this.f2957b = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            a1 h = Toolbar.h();
            h.f2963a = (toolbar.f1441n & 112) | 8388611;
            h.f2964b = 2;
            toolbar.i.setLayoutParams(h);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((a1) childAt.getLayoutParams()).f2964b != 2 && childAt != toolbar.f1431a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1419E.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.f2791C = true;
        oVar.f2802n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0145b) {
            ((k.q) ((InterfaceC0145b) callback)).f2818a.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // k.y
    public final boolean e(SubMenuC0162E subMenuC0162E) {
        return false;
    }

    @Override // k.y
    public final boolean h(k.o oVar) {
        Toolbar toolbar = this.f2958c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0145b) {
            ((k.q) ((InterfaceC0145b) callback)).f2818a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.f1419E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2957b = null;
        toolbar.requestLayout();
        oVar.f2791C = false;
        oVar.f2802n.p(false);
        toolbar.u();
        return true;
    }

    @Override // k.y
    public final void j(Context context, k.m mVar) {
        k.o oVar;
        k.m mVar2 = this.f2956a;
        if (mVar2 != null && (oVar = this.f2957b) != null) {
            mVar2.d(oVar);
        }
        this.f2956a = mVar;
    }

    @Override // k.y
    public final boolean k() {
        return false;
    }
}
