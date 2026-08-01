package X;

import android.os.Bundle;
import b.InterfaceC0080b;
import g.AbstractActivityC0136i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0050t implements InterfaceC0080b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0136i f1134b;

    public /* synthetic */ C0050t(AbstractActivityC0136i abstractActivityC0136i, int i) {
        this.f1133a = i;
        this.f1134b = abstractActivityC0136i;
    }

    @Override // b.InterfaceC0080b
    public final void a(a.l lVar) {
        switch (this.f1133a) {
            case 0:
                C0051u c0051u = (C0051u) this.f1134b.f2450s.f30b;
                c0051u.d.b(c0051u, c0051u, null);
                return;
            default:
                AbstractActivityC0136i abstractActivityC0136i = this.f1134b;
                g1.f.e(lVar, "it");
                Bundle c2 = abstractActivityC0136i.d.f2580b.c("android:support:activity-result");
                if (c2 != null) {
                    a.j jVar = abstractActivityC0136i.h;
                    jVar.getClass();
                    ArrayList<Integer> integerArrayList = c2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = c2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        jVar.d.addAll(stringArrayList2);
                    }
                    Bundle bundle = c2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = jVar.f1195g;
                    if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        LinkedHashMap linkedHashMap = jVar.f1191b;
                        boolean containsKey = linkedHashMap.containsKey(str);
                        LinkedHashMap linkedHashMap2 = jVar.f1190a;
                        if (containsKey) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle2.containsKey(str)) {
                                continue;
                            } else {
                                if ((linkedHashMap2 instanceof h1.a) && !(linkedHashMap2 instanceof h1.b)) {
                                    g1.l.c(linkedHashMap2, "kotlin.collections.MutableMap");
                                    throw null;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        g1.f.d(num2, "rcs[i]");
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        g1.f.d(str2, "keys[i]");
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
