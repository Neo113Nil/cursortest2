package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.derinko.gbini.n1casino.R;
import defpackage.a50;
import defpackage.d30;
import defpackage.jb;
import defpackage.m1;
import defpackage.mx;
import defpackage.t8;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object h = new Object();
    public final ArrayList f;
    public mx g;

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f = new ArrayList();
    }

    private a50 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof a50) {
            return (a50) tag;
        }
        a50 a50Var = new a50(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, a50Var);
        return a50Var;
    }

    public final void a() {
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            b();
            return;
        }
        a50 orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        b();
        this.g = new mx(orInstallSystemBarStateMonitor, arrayList);
        getChildCount();
        if (this.g.a.size() <= 0) {
            return;
        }
        jb jbVar = (jb) this.g.a.get(0);
        getContext();
        jbVar.getClass();
        t8.k(d30.e("Unexpected side: ", 0));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != h) {
            mx mxVar = this.g;
            int childCount = getChildCount() - (mxVar != null ? mxVar.a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        if (this.g != null) {
            removeViews(getChildCount() - this.g.a.size(), this.g.a.size());
            int size = this.g.a.size();
            mx mxVar = this.g;
            if (size > 0) {
                ((jb) mxVar.a.get(0)).getClass();
                throw null;
            }
            ArrayList arrayList = mxVar.a;
            if (!mxVar.f) {
                mxVar.f = true;
                mxVar.b.b.remove(mxVar);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((jb) arrayList.get(size2)).c = null;
                }
                arrayList.clear();
            }
            this.g = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof a50) {
            a50 a50Var = (a50) tag;
            if (a50Var.b.isEmpty()) {
                a50Var.a.post(new m1(13, a50Var));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<jb> list) {
        ArrayList arrayList = this.f;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }
}
