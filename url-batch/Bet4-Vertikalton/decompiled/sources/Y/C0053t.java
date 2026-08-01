package Y;

import android.os.Bundle;
import b.InterfaceC0077b;
import g.AbstractActivityC0106i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: Y.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0053t implements InterfaceC0077b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1127a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0106i f1128b;

    public /* synthetic */ C0053t(AbstractActivityC0106i abstractActivityC0106i, int i) {
        this.f1127a = i;
        this.f1128b = abstractActivityC0106i;
    }

    @Override // b.InterfaceC0077b
    public final void a(a.l lVar) {
        switch (this.f1127a) {
            case 0:
                C0054u c0054u = (C0054u) this.f1128b.f2215s.f115b;
                c0054u.h.b(c0054u, c0054u, null);
                return;
            default:
                AbstractActivityC0106i abstractActivityC0106i = this.f1128b;
                d1.d.e(lVar, "it");
                Bundle c2 = abstractActivityC0106i.d.f2535b.c("android:support:activity-result");
                if (c2 != null) {
                    a.j jVar = abstractActivityC0106i.h;
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
                    Bundle bundle2 = jVar.f1171g;
                    if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        LinkedHashMap linkedHashMap = jVar.f1167b;
                        boolean containsKey = linkedHashMap.containsKey(str);
                        LinkedHashMap linkedHashMap2 = jVar.f1166a;
                        if (containsKey) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle2.containsKey(str)) {
                                continue;
                            } else {
                                if (linkedHashMap2 instanceof e1.a) {
                                    ClassCastException classCastException = new ClassCastException((linkedHashMap2 == null ? "null" : linkedHashMap2.getClass().getName()) + " cannot be cast to kotlin.collections.MutableMap");
                                    d1.d.g(classCastException, d1.j.class.getName());
                                    throw classCastException;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        d1.d.d(num2, "rcs[i]");
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        d1.d.d(str2, "keys[i]");
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
