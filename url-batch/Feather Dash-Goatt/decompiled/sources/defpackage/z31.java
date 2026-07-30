package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.feathherdashh.dashgame.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class z31 extends ViewGroup {
    public final int d;
    public final ArrayList e;
    public final ArrayList g;
    public final yw h;
    public int i;

    public z31(Context context) {
        super(context);
        this.d = 5;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.g = arrayList2;
        this.h = new yw(29);
        setClipChildren(false);
        a41 a41Var = new a41(context);
        addView(a41Var);
        arrayList.add(a41Var);
        arrayList2.add(a41Var);
        this.i = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
