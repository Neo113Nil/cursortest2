package i0;

import a0.a0;
import android.content.Context;
import android.view.ViewGroup;
import com.snovikpovik.vuevnxsj.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final int f3266d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3267e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3268f;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f3269g;

    /* renamed from: h, reason: collision with root package name */
    public int f3270h;

    public d(Context context) {
        super(context);
        this.f3266d = 5;
        ArrayList arrayList = new ArrayList();
        this.f3267e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f3268f = arrayList2;
        this.f3269g = new a0(8);
        setClipChildren(false);
        e eVar = new e(context);
        addView(eVar);
        arrayList.add(eVar);
        arrayList2.add(eVar);
        this.f3270h = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
    }
}
