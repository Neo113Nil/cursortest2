package n;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import l.InterfaceC0647c;

/* loaded from: classes.dex */
public final class n1 implements m.z {

    /* renamed from: d, reason: collision with root package name */
    public m.m f6844d;

    /* renamed from: e, reason: collision with root package name */
    public m.o f6845e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Toolbar f6846i;

    public n1(Toolbar toolbar) {
        this.f6846i = toolbar;
    }

    @Override // m.z
    public final void d() {
        if (this.f6845e != null) {
            m.m mVar = this.f6844d;
            if (mVar != null) {
                int size = mVar.f6415f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f6844d.getItem(i2) == this.f6845e) {
                        return;
                    }
                }
            }
            k(this.f6845e);
        }
    }

    @Override // m.z
    public final boolean f(m.o oVar) {
        Toolbar toolbar = this.f6846i;
        toolbar.c();
        ViewParent parent = toolbar.f3341p.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f3341p);
            }
            toolbar.addView(toolbar.f3341p);
        }
        View actionView = oVar.getActionView();
        toolbar.f3342q = actionView;
        this.f6845e = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f3342q);
            }
            o1 h7 = Toolbar.h();
            h7.f6859a = (toolbar.f3347v & 112) | 8388611;
            h7.f6860b = 2;
            toolbar.f3342q.setLayoutParams(h7);
            toolbar.addView(toolbar.f3342q);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((o1) childAt.getLayoutParams()).f6860b != 2 && childAt != toolbar.f3332d) {
                toolbar.removeViewAt(childCount);
                toolbar.f3319M.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.f6439C = true;
        oVar.f6452n.p(false);
        KeyEvent.Callback callback = toolbar.f3342q;
        if (callback instanceof InterfaceC0647c) {
            ((InterfaceC0647c) callback).onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // m.z
    public final void g(Context context, m.m mVar) {
        m.o oVar;
        m.m mVar2 = this.f6844d;
        if (mVar2 != null && (oVar = this.f6845e) != null) {
            mVar2.d(oVar);
        }
        this.f6844d = mVar;
    }

    @Override // m.z
    public final boolean h() {
        return false;
    }

    @Override // m.z
    public final boolean i(m.F f7) {
        return false;
    }

    @Override // m.z
    public final boolean k(m.o oVar) {
        Toolbar toolbar = this.f6846i;
        KeyEvent.Callback callback = toolbar.f3342q;
        if (callback instanceof InterfaceC0647c) {
            ((InterfaceC0647c) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f3342q);
        toolbar.removeView(toolbar.f3341p);
        toolbar.f3342q = null;
        ArrayList arrayList = toolbar.f3319M;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f6845e = null;
        toolbar.requestLayout();
        oVar.f6439C = false;
        oVar.f6452n.p(false);
        toolbar.v();
        return true;
    }

    @Override // m.z
    public final void a(m.m mVar, boolean z7) {
    }
}
