package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.ice.fishing.grenza.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pw1 extends ViewGroup {
    public final ArrayList OPXfSBeufaJ8;
    public final cr1 dgRBjINgWbAK;
    public final int rtx2ld2ELZv4;
    public final ArrayList wdg6QnbFHrFF;
    public int x50lh2ztY7Y5;

    public pw1(Context context) {
        super(context);
        this.rtx2ld2ELZv4 = 5;
        ArrayList arrayList = new ArrayList();
        this.OPXfSBeufaJ8 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.wdg6QnbFHrFF = arrayList2;
        this.dgRBjINgWbAK = new cr1(2);
        setClipChildren(false);
        rw1 rw1Var = new rw1(context);
        addView(rw1Var);
        arrayList.add(rw1Var);
        arrayList2.add(rw1Var);
        this.x50lh2ztY7Y5 = 1;
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
