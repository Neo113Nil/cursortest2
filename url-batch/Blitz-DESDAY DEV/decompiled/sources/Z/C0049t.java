package Z;

import android.os.Bundle;
import b.InterfaceC0075b;
import g.AbstractActivityC0110i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: Z.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0049t implements InterfaceC0075b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0110i f1217b;

    public /* synthetic */ C0049t(AbstractActivityC0110i abstractActivityC0110i, int i) {
        this.f1216a = i;
        this.f1217b = abstractActivityC0110i;
    }

    @Override // b.InterfaceC0075b
    public final void a(a.l lVar) {
        switch (this.f1216a) {
            case 0:
                C0050u c0050u = (C0050u) this.f1217b.f2317s.f170b;
                c0050u.d.b(c0050u, c0050u, null);
                return;
            default:
                AbstractActivityC0110i abstractActivityC0110i = this.f1217b;
                g1.d.e(lVar, "it");
                Bundle c2 = abstractActivityC0110i.d.f2686b.c("android:support:activity-result");
                if (c2 != null) {
                    a.j jVar = abstractActivityC0110i.h;
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
                    Bundle bundle2 = jVar.f1256g;
                    if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        LinkedHashMap linkedHashMap = jVar.f1252b;
                        boolean containsKey = linkedHashMap.containsKey(str);
                        LinkedHashMap linkedHashMap2 = jVar.f1251a;
                        if (containsKey) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle2.containsKey(str)) {
                                continue;
                            } else {
                                if (linkedHashMap2 instanceof h1.a) {
                                    ClassCastException classCastException = new ClassCastException((linkedHashMap2 == null ? "null" : linkedHashMap2.getClass().getName()).concat(" cannot be cast to kotlin.collections.MutableMap"));
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
