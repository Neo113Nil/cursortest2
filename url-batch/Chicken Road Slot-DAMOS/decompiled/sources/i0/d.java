package i0;

import android.content.Context;
import android.view.ViewGroup;
import c6.s;
import com.appsflyer.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final int f4559d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4560e;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4561i;

    /* renamed from: r, reason: collision with root package name */
    public final s f4562r;

    /* renamed from: s, reason: collision with root package name */
    public int f4563s;

    public d(Context context) {
        super(context);
        this.f4559d = 5;
        ArrayList arrayList = new ArrayList();
        this.f4560e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f4561i = arrayList2;
        this.f4562r = new s(6);
        setClipChildren(false);
        e eVar = new e(context);
        addView(eVar);
        arrayList.add(eVar);
        arrayList2.add(eVar);
        this.f4563s = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
    }
}
