package androidx.core.view.insets;

import a2.r;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.w0;
import com.gglhk.bofio.fortunetiger.R;
import java.util.ArrayList;
import java.util.List;
import n0.a;
import n0.d;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object h = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f305f;
    public a g;

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f305f = new ArrayList();
    }

    private d getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof d) {
            return (d) tag;
        }
        d dVar = new d(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, dVar);
        return dVar;
    }

    public final void a() {
        ArrayList arrayList = this.f305f;
        if (arrayList.isEmpty()) {
            return;
        }
        this.g = new a(getOrInstallSystemBarStateMonitor(), arrayList);
        getChildCount();
        if (this.g.f2937a.size() <= 0) {
            return;
        }
        if (this.g.f2937a.get(0) != null) {
            throw new ClassCastException();
        }
        getContext();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != h) {
            a aVar = this.g;
            int childCount = getChildCount() - (aVar != null ? aVar.f2937a.size() : 0);
            if (i4 > childCount || i4 < 0) {
                i4 = childCount;
            }
        }
        super.addView(view, i4, layoutParams);
    }

    public final void b() {
        if (this.g != null) {
            removeViews(getChildCount() - this.g.f2937a.size(), this.g.f2937a.size());
            if (this.g.f2937a.size() > 0) {
                throw w0.d(this.g.f2937a, 0);
            }
            a aVar = this.g;
            ArrayList arrayList = aVar.f2937a;
            if (!aVar.f2939d) {
                aVar.f2939d = true;
                aVar.f2938b.f2943b.remove(aVar);
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    throw w0.d(arrayList, size);
                }
                arrayList.clear();
            }
            this.g = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.g != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof d) {
            d dVar = (d) tag;
            if (dVar.f2943b.isEmpty()) {
                dVar.f2942a.post(new r(10, dVar));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<Object> list) {
        ArrayList arrayList = this.f305f;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }
}
