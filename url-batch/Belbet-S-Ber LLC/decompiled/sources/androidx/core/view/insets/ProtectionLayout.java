package androidx.core.view.insets;

import a.j;
import a4.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.gdmhkmf.belbet.R;
import java.util.ArrayList;
import java.util.List;
import q0.a;
import q0.c;
import q0.f;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object h = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f414f;

    /* renamed from: g, reason: collision with root package name */
    public c f415g;

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f414f = new ArrayList();
    }

    private f getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof f) {
            return (f) tag;
        }
        f fVar = new f(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, fVar);
        return fVar;
    }

    public final void a() {
        ArrayList arrayList = this.f414f;
        if (arrayList.isEmpty()) {
            b();
            return;
        }
        f orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        b();
        this.f415g = new c(orInstallSystemBarStateMonitor, arrayList);
        getChildCount();
        if (this.f415g.f3127a.size() <= 0) {
            return;
        }
        a aVar = (a) this.f415g.f3127a.get(0);
        getContext();
        aVar.getClass();
        throw new IllegalArgumentException(b.f("Unexpected side: ", 0));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != h) {
            c cVar = this.f415g;
            int childCount = getChildCount() - (cVar != null ? cVar.f3127a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        if (this.f415g != null) {
            removeViews(getChildCount() - this.f415g.f3127a.size(), this.f415g.f3127a.size());
            if (this.f415g.f3127a.size() > 0) {
                ((a) this.f415g.f3127a.get(0)).getClass();
                throw null;
            }
            c cVar = this.f415g;
            ArrayList arrayList = cVar.f3127a;
            if (!cVar.f3131f) {
                cVar.f3131f = true;
                cVar.f3128b.f3137b.remove(cVar);
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((a) arrayList.get(size)).f3120c = null;
                }
                arrayList.clear();
            }
            this.f415g = null;
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
        if (tag instanceof f) {
            f fVar = (f) tag;
            if (fVar.f3137b.isEmpty()) {
                fVar.f3136a.post(new j(8, fVar));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<a> list) {
        ArrayList arrayList = this.f414f;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }
}
