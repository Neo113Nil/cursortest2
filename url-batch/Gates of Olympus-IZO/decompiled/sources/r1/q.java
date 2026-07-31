package r1;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import q1.C0775D;
import q1.C0784h;
import q1.C0785i;
import q1.J;

/* loaded from: classes.dex */
public final class q extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public static final q f7247e = new q(2);

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        Bundle bundle;
        C0775D c0775d = (C0775D) obj2;
        c0775d.getClass();
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : M1.B.Q(c0775d.f6848v.f6875a).entrySet()) {
            ((J) entry.getValue()).getClass();
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        M1.j jVar = c0775d.f6834g;
        if (!jVar.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[jVar.f2799f];
            Iterator<E> it = jVar.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                parcelableArr[i3] = new C0785i((C0784h) it.next());
                i3++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = c0775d.f6840m;
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
        LinkedHashMap linkedHashMap2 = c0775d.f6841n;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry3.getKey();
                M1.j jVar2 = (M1.j) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[jVar2.f2799f];
                Iterator it2 = jVar2.iterator();
                int i5 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        M1.m.f0();
                        throw null;
                    }
                    parcelableArr2[i5] = (C0785i) next;
                    i5 = i6;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (c0775d.f6833f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", c0775d.f6833f);
        }
        return bundle;
    }
}
