package X;

import android.os.Bundle;
import b.InterfaceC0075b;
import g.AbstractActivityC0126i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0051t implements InterfaceC0075b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0126i f999b;

    public /* synthetic */ C0051t(AbstractActivityC0126i abstractActivityC0126i, int i) {
        this.f998a = i;
        this.f999b = abstractActivityC0126i;
    }

    @Override // b.InterfaceC0075b
    public final void a(a.l lVar) {
        switch (this.f998a) {
            case 0:
                C0052u c0052u = (C0052u) this.f999b.f2324s.f59b;
                c0052u.h.b(c0052u, c0052u, null);
                return;
            default:
                AbstractActivityC0126i abstractActivityC0126i = this.f999b;
                X0.d.e(lVar, "it");
                Bundle c2 = abstractActivityC0126i.d.f2379b.c("android:support:activity-result");
                if (c2 != null) {
                    a.j jVar = abstractActivityC0126i.h;
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
                    Bundle bundle2 = jVar.f1056g;
                    if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        LinkedHashMap linkedHashMap = jVar.f1052b;
                        boolean containsKey = linkedHashMap.containsKey(str);
                        LinkedHashMap linkedHashMap2 = jVar.f1051a;
                        if (containsKey) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle2.containsKey(str)) {
                                continue;
                            } else {
                                if (linkedHashMap2 instanceof Y0.a) {
                                    ClassCastException classCastException = new ClassCastException((linkedHashMap2 == null ? "null" : linkedHashMap2.getClass().getName()).concat(" cannot be cast to kotlin.collections.MutableMap"));
                                    X0.d.g(classCastException, X0.j.class.getName());
                                    throw classCastException;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        X0.d.d(num2, "rcs[i]");
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        X0.d.d(str2, "keys[i]");
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
