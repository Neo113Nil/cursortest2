package a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements b.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.j f28b;

    public /* synthetic */ h(g.j jVar, int i) {
        this.f27a = i;
        this.f28b = jVar;
    }

    @Override // b.b
    public final void a(m mVar) {
        switch (this.f27a) {
            case 0:
                f3.d.e(mVar, "it");
                g.j jVar = this.f28b;
                Bundle c4 = jVar.i.f1703b.c("android:support:activity-result");
                if (c4 != null) {
                    l lVar = jVar.f50m;
                    LinkedHashMap linkedHashMap = lVar.f39b;
                    LinkedHashMap linkedHashMap2 = lVar.f38a;
                    Bundle bundle = lVar.f43g;
                    ArrayList<Integer> integerArrayList = c4.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c4.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = c4.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        lVar.d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = c4.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle.containsKey(str)) {
                                continue;
                            } else {
                                if (linkedHashMap2 instanceof g3.a) {
                                    ClassCastException classCastException = new ClassCastException(linkedHashMap2.getClass().getName().concat(" cannot be cast to kotlin.collections.MutableMap"));
                                    f3.d.f(classCastException, f3.g.class.getName());
                                    throw classCastException;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        f3.d.d(num2, "get(...)");
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        f3.d.d(str2, "get(...)");
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(intValue), str3);
                        lVar.f39b.put(str3, Integer.valueOf(intValue));
                    }
                    return;
                }
                return;
            default:
                androidx.fragment.app.w wVar = (androidx.fragment.app.w) this.f28b.f1650y.f81g;
                wVar.f570q.b(wVar, wVar, null);
                return;
        }
    }
}
