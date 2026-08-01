package X;

import android.os.Bundle;
import b.InterfaceC0078b;
import g.AbstractActivityC0133i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0050t implements InterfaceC0078b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0133i f1068b;

    public /* synthetic */ C0050t(AbstractActivityC0133i abstractActivityC0133i, int i) {
        this.f1067a = i;
        this.f1068b = abstractActivityC0133i;
    }

    @Override // b.InterfaceC0078b
    public final void a(a.l lVar) {
        switch (this.f1067a) {
            case 0:
                C0051u c0051u = (C0051u) this.f1068b.f2393s.f66b;
                c0051u.h.b(c0051u, c0051u, null);
                return;
            default:
                AbstractActivityC0133i abstractActivityC0133i = this.f1068b;
                b1.d.e(lVar, "it");
                Bundle c2 = abstractActivityC0133i.d.f2447b.c("android:support:activity-result");
                if (c2 != null) {
                    a.j jVar = abstractActivityC0133i.h;
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
                    Bundle bundle2 = jVar.f1114g;
                    if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        LinkedHashMap linkedHashMap = jVar.f1110b;
                        boolean containsKey = linkedHashMap.containsKey(str);
                        LinkedHashMap linkedHashMap2 = jVar.f1109a;
                        if (containsKey) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle2.containsKey(str)) {
                                continue;
                            } else {
                                if (linkedHashMap2 instanceof c1.a) {
                                    ClassCastException classCastException = new ClassCastException((linkedHashMap2 == null ? "null" : linkedHashMap2.getClass().getName()).concat(" cannot be cast to kotlin.collections.MutableMap"));
                                    b1.d.g(classCastException, b1.j.class.getName());
                                    throw classCastException;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        b1.d.d(num2, "rcs[i]");
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        b1.d.d(str2, "keys[i]");
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
