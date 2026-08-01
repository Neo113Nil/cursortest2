package Y;

import android.os.Bundle;
import b.InterfaceC0078b;
import g.AbstractActivityC0108i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: Y.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0053t implements InterfaceC0078b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0108i f1155b;

    public /* synthetic */ C0053t(AbstractActivityC0108i abstractActivityC0108i, int i) {
        this.f1154a = i;
        this.f1155b = abstractActivityC0108i;
    }

    @Override // b.InterfaceC0078b
    public final void a(a.l lVar) {
        switch (this.f1154a) {
            case 0:
                C0054u c0054u = (C0054u) this.f1155b.f2255s.f80b;
                c0054u.d.b(c0054u, c0054u, null);
                return;
            default:
                AbstractActivityC0108i abstractActivityC0108i = this.f1155b;
                g1.d.e(lVar, "it");
                Bundle c2 = abstractActivityC0108i.d.f2566b.c("android:support:activity-result");
                if (c2 != null) {
                    a.j jVar = abstractActivityC0108i.h;
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
                    Bundle bundle2 = jVar.f1201g;
                    if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        LinkedHashMap linkedHashMap = jVar.f1197b;
                        boolean containsKey = linkedHashMap.containsKey(str);
                        LinkedHashMap linkedHashMap2 = jVar.f1196a;
                        if (containsKey) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle2.containsKey(str)) {
                                continue;
                            } else {
                                if (linkedHashMap2 instanceof h1.a) {
                                    ClassCastException classCastException = new ClassCastException((linkedHashMap2 == null ? "null" : linkedHashMap2.getClass().getName()) + " cannot be cast to kotlin.collections.MutableMap");
                                    g1.d.g(classCastException, g1.j.class.getName());
                                    throw classCastException;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        g1.d.d(num2, "rcs[i]");
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        g1.d.d(str2, "keys[i]");
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
