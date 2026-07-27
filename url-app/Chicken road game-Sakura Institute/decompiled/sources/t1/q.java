package t1;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import s1.C1183B;
import s1.C1193i;
import s1.C1194j;
import s1.H;
import z2.C1412P;
import z2.C1433q;
import z2.C1441y;

/* loaded from: classes.dex */
public final class q extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public static final q f10679d = new q(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        Bundle bundle;
        C1183B c1183b = (C1183B) obj2;
        c1183b.getClass();
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : C1412P.i(c1183b.f10457v.f10487a).entrySet()) {
            ((H) entry.getValue()).getClass();
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        C1433q c1433q = c1183b.f10442g;
        if (!c1433q.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[c1433q.f11958i];
            Iterator<E> it = c1433q.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                parcelableArr[i2] = new C1194j((C1193i) it.next());
                i2++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = c1183b.f10448m;
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
        LinkedHashMap linkedHashMap2 = c1183b.f10449n;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry3.getKey();
                C1433q c1433q2 = (C1433q) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[c1433q2.f11958i];
                Iterator it2 = c1433q2.iterator();
                int i5 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        C1441y.g();
                        throw null;
                    }
                    parcelableArr2[i5] = (C1194j) next;
                    i5 = i6;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (c1183b.f10441f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", c1183b.f10441f);
        }
        return bundle;
    }
}
