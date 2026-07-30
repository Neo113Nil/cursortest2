package u3;

import android.os.Bundle;
import android.os.Parcelable;
import e6.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import t3.b0;
import t3.g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public static final s f9015g = new s(2);

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        Bundle bundle;
        b0 b0Var = (b0) obj2;
        LinkedHashMap linkedHashMap = b0Var.f8758n;
        LinkedHashMap linkedHashMap2 = b0Var.f8757m;
        e6.j jVar = b0Var.f8751g;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : c0.m0(b0Var.f8766v.f8804a).entrySet()) {
            ((g0) entry.getValue()).getClass();
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        if (!jVar.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[jVar.f2822h];
            Iterator<E> it = jVar.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                parcelableArr[i7] = new t3.i((t3.h) it.next());
                i7++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap2.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i8 = 0;
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                int intValue = ((Number) entry2.getKey()).intValue();
                String str = (String) entry2.getValue();
                iArr[i8] = intValue;
                arrayList2.add(str);
                i8++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                String str2 = (String) entry3.getKey();
                e6.j jVar2 = (e6.j) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[jVar2.f2822h];
                Iterator it2 = jVar2.iterator();
                int i9 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        e6.m.Z();
                        throw null;
                    }
                    parcelableArr2[i9] = (t3.i) next;
                    i9 = i10;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (b0Var.f8750f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", b0Var.f8750f);
        }
        return bundle;
    }
}
