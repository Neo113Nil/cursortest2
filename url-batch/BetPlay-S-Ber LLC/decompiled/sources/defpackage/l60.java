package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class l60 implements ru {
    public au f;
    public eu g;
    public final /* synthetic */ Toolbar h;

    public l60(Toolbar toolbar) {
        this.h = toolbar;
    }

    @Override // defpackage.ru
    public final boolean c(eu euVar) {
        Toolbar toolbar = this.h;
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof bb) {
            ((gu) ((bb) callback)).f.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.n);
        toolbar.removeView(toolbar.m);
        toolbar.n = null;
        ArrayList arrayList = toolbar.J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.g = null;
        toolbar.requestLayout();
        euVar.C = false;
        euVar.n.p(false);
        toolbar.v();
        return true;
    }

    @Override // defpackage.ru
    public final boolean f(eu euVar) {
        Toolbar toolbar = this.h;
        toolbar.d();
        ViewParent parent = toolbar.m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.m);
            }
            toolbar.addView(toolbar.m);
        }
        View actionView = euVar.getActionView();
        toolbar.n = actionView;
        this.g = euVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.n);
            }
            m60 j = Toolbar.j();
            j.a = (toolbar.s & 112) | 8388611;
            j.b = 2;
            toolbar.n.setLayoutParams(j);
            toolbar.addView(toolbar.n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((m60) childAt.getLayoutParams()).b != 2 && childAt != toolbar.f) {
                toolbar.removeViewAt(childCount);
                toolbar.J.add(childAt);
            }
        }
        toolbar.requestLayout();
        euVar.C = true;
        euVar.n.p(false);
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof bb) {
            ((gu) ((bb) callback)).f.onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // defpackage.ru
    public final void g() {
        if (this.g != null) {
            au auVar = this.f;
            if (auVar != null) {
                int size = auVar.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f.getItem(i) == this.g) {
                        return;
                    }
                }
            }
            c(this.g);
        }
    }

    @Override // defpackage.ru
    public final void i(Context context, au auVar) {
        eu euVar;
        au auVar2 = this.f;
        if (auVar2 != null && (euVar = this.g) != null) {
            auVar2.d(euVar);
        }
        this.f = auVar;
    }

    @Override // defpackage.ru
    public final boolean j(v40 v40Var) {
        return false;
    }

    @Override // defpackage.ru
    public final boolean k() {
        return false;
    }

    @Override // defpackage.ru
    public final void a(au auVar, boolean z) {
    }
}
