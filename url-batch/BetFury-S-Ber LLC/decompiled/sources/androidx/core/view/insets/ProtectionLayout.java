package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.trembin.nirefon.betfury.R;
import defpackage.dd;
import defpackage.r1;
import defpackage.r7;
import defpackage.s60;
import defpackage.s9;
import defpackage.zg0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object h = new Object();
    public final ArrayList f;
    public s60 g;

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f = new ArrayList();
    }

    private zg0 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof zg0) {
            return (zg0) tag;
        }
        zg0 zg0Var = new zg0(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, zg0Var);
        return zg0Var;
    }

    public final void a() {
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            b();
            return;
        }
        zg0 orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        b();
        this.g = new s60(orInstallSystemBarStateMonitor, arrayList);
        getChildCount();
        if (this.g.a.size() <= 0) {
            return;
        }
        dd ddVar = (dd) this.g.a.get(0);
        getContext();
        ddVar.getClass();
        s9.k(r7.b("Unexpected side: ", 0));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != h) {
            s60 s60Var = this.g;
            int childCount = getChildCount() - (s60Var != null ? s60Var.a.size() : 0);
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
            s60 s60Var = this.g;
            if (size > 0) {
                ((dd) s60Var.a.get(0)).getClass();
                throw null;
            }
            ArrayList arrayList = s60Var.a;
            if (!s60Var.f) {
                s60Var.f = true;
                s60Var.b.b.remove(s60Var);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((dd) arrayList.get(size2)).c = null;
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
        if (tag instanceof zg0) {
            zg0 zg0Var = (zg0) tag;
            if (zg0Var.b.isEmpty()) {
                zg0Var.a.post(new r1(14, zg0Var));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<dd> list) {
        ArrayList arrayList = this.f;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }
}
