package C;

import android.content.Context;
import android.view.ViewGroup;
import com.chicken.road.kedro.laqer.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import z2.C1441y;

/* loaded from: classes.dex */
public final class r extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final int f1121d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1122e;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1123i;

    /* renamed from: j, reason: collision with root package name */
    public final y.t f1124j;

    /* renamed from: k, reason: collision with root package name */
    public int f1125k;

    public r(Context context) {
        super(context);
        this.f1121d = 5;
        ArrayList arrayList = new ArrayList();
        this.f1122e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f1123i = arrayList2;
        this.f1124j = new y.t(2);
        setClipChildren(false);
        u uVar = new u(context);
        addView(uVar);
        arrayList.add(uVar);
        arrayList2.add(uVar);
        this.f1125k = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final u a(s sVar) {
        y.t tVar = this.f1124j;
        u uVar = (u) ((LinkedHashMap) tVar.f11494e).get(sVar);
        if (uVar != null) {
            return uVar;
        }
        ArrayList arrayList = this.f1123i;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        u uVar2 = (u) (arrayList.isEmpty() ? null : arrayList.remove(0));
        LinkedHashMap linkedHashMap = (LinkedHashMap) tVar.f11494e;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) tVar.f11495i;
        if (uVar2 == null) {
            int i2 = this.f1125k;
            ArrayList arrayList2 = this.f1122e;
            if (i2 > C1441y.d(arrayList2)) {
                uVar2 = new u(getContext());
                addView(uVar2);
                arrayList2.add(uVar2);
            } else {
                uVar2 = (u) arrayList2.get(this.f1125k);
                s sVar2 = (s) linkedHashMap2.get(uVar2);
                if (sVar2 != null) {
                    sVar2.W();
                    u uVar3 = (u) linkedHashMap.get(sVar2);
                    if (uVar3 != null) {
                    }
                    linkedHashMap.remove(sVar2);
                    uVar2.c();
                }
            }
            int i4 = this.f1125k;
            if (i4 < this.f1121d - 1) {
                this.f1125k = i4 + 1;
            } else {
                this.f1125k = 0;
            }
        }
        linkedHashMap.put(sVar, uVar2);
        linkedHashMap2.put(uVar2, sVar);
        return uVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i2, int i4, int i5, int i6) {
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i4) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
