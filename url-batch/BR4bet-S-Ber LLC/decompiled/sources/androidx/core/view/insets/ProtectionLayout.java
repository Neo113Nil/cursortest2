package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.moontiko.really.admiralcasino.R;
import defpackage.d80;
import defpackage.ec;
import defpackage.f60;
import defpackage.g9;
import defpackage.n1;
import defpackage.p00;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object h = new Object();
    public final ArrayList f;
    public p00 g;

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f = new ArrayList();
    }

    private d80 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof d80) {
            return (d80) tag;
        }
        d80 d80Var = new d80(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, d80Var);
        return d80Var;
    }

    public final void a() {
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            b();
            return;
        }
        d80 orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        b();
        this.g = new p00(orInstallSystemBarStateMonitor, arrayList);
        getChildCount();
        if (this.g.a.size() <= 0) {
            return;
        }
        ec ecVar = (ec) this.g.a.get(0);
        getContext();
        ecVar.getClass();
        g9.i(f60.e("Unexpected side: ", 0));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != h) {
            p00 p00Var = this.g;
            int childCount = getChildCount() - (p00Var != null ? p00Var.a.size() : 0);
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
            p00 p00Var = this.g;
            if (size > 0) {
                ((ec) p00Var.a.get(0)).getClass();
                throw null;
            }
            ArrayList arrayList = p00Var.a;
            if (!p00Var.f) {
                p00Var.f = true;
                p00Var.b.b.remove(p00Var);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((ec) arrayList.get(size2)).c = null;
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
        if (tag instanceof d80) {
            d80 d80Var = (d80) tag;
            if (d80Var.b.isEmpty()) {
                d80Var.a.post(new n1(13, d80Var));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<ec> list) {
        ArrayList arrayList = this.f;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }
}
