package u1;

import android.os.Bundle;
import android.os.Parcelable;
import e2.InterfaceC0426e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import t1.AbstractC1019G;
import t1.C1013A;
import t1.C1028h;
import t1.C1029i;

/* loaded from: classes.dex */
public final class q extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public static final q f9617e = new q(2);

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        Bundle bundle;
        C1013A c1013a = (C1013A) obj2;
        c1013a.getClass();
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : S1.B.M(c1013a.f8827v.f8854a).entrySet()) {
            ((AbstractC1019G) entry.getValue()).getClass();
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        S1.j jVar = c1013a.f8812g;
        if (!jVar.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[jVar.f4316f];
            Iterator<E> it = jVar.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                parcelableArr[i3] = new C1029i((C1028h) it.next());
                i3++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = c1013a.f8818m;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i4 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int intValue = ((Number) entry2.getKey()).intValue();
                String str = (String) entry2.getValue();
                iArr[i4] = intValue;
                arrayList2.add(str);
                i4++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = c1013a.f8819n;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry3.getKey();
                S1.j jVar2 = (S1.j) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[jVar2.f4316f];
                Iterator it2 = jVar2.iterator();
                int i5 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        S1.m.D0();
                        throw null;
                    }
                    parcelableArr2[i5] = (C1029i) next;
                    i5 = i6;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (c1013a.f8811f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", c1013a.f8811f);
        }
        return bundle;
    }
}
