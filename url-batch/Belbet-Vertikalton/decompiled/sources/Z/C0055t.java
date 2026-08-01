package Z;

import android.os.Bundle;
import c.InterfaceC0100b;
import h.AbstractActivityC0132i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: Z.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0055t implements InterfaceC0100b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0132i f1636b;

    public /* synthetic */ C0055t(AbstractActivityC0132i abstractActivityC0132i, int i) {
        this.f1635a = i;
        this.f1636b = abstractActivityC0132i;
    }

    @Override // c.InterfaceC0100b
    public final void a(b.l lVar) {
        switch (this.f1635a) {
            case 0:
                C0056u c0056u = (C0056u) this.f1636b.f2802s.f145b;
                c0056u.e.b(c0056u, c0056u, null);
                return;
            default:
                AbstractActivityC0132i abstractActivityC0132i = this.f1636b;
                j1.h.e(lVar, "it");
                Bundle c2 = abstractActivityC0132i.f2180d.f3167b.c("android:support:activity-result");
                if (c2 != null) {
                    b.j jVar = abstractActivityC0132i.f2183h;
                    jVar.getClass();
                    ArrayList<Integer> integerArrayList = c2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = c2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        jVar.f2171d.addAll(stringArrayList2);
                    }
                    Bundle bundle = c2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = jVar.f2173g;
                    if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        LinkedHashMap linkedHashMap = jVar.f2169b;
                        boolean containsKey = linkedHashMap.containsKey(str);
                        LinkedHashMap linkedHashMap2 = jVar.f2168a;
                        if (containsKey) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle2.containsKey(str)) {
                                continue;
                            } else {
                                if ((linkedHashMap2 instanceof k1.a) && !(linkedHashMap2 instanceof k1.b)) {
                                    j1.n.c(linkedHashMap2, "kotlin.collections.MutableMap");
                                    throw null;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        j1.h.d(num2, "rcs[i]");
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        j1.h.d(str2, "keys[i]");
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(intValue), str3);
                        linkedHashMap.put(str3, Integer.valueOf(intValue));
                    }
                    return;
                }
                return;
        }
    }
}
