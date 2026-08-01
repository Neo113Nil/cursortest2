package a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements b.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.i f27b;

    public /* synthetic */ h(g.i iVar, int i) {
        this.f26a = i;
        this.f27b = iVar;
    }

    @Override // b.b
    public final void a(m mVar) {
        switch (this.f26a) {
            case 0:
                i3.d.e(mVar, "it");
                g.i iVar = this.f27b;
                Bundle c5 = iVar.i.f1972b.c("android:support:activity-result");
                if (c5 != null) {
                    l lVar = iVar.f52m;
                    LinkedHashMap linkedHashMap = lVar.f39b;
                    LinkedHashMap linkedHashMap2 = lVar.f38a;
                    Bundle bundle = lVar.f43g;
                    ArrayList<Integer> integerArrayList = c5.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c5.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = c5.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        lVar.d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = c5.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
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
                                if (linkedHashMap2 instanceof j3.a) {
                                    ClassCastException classCastException = new ClassCastException((linkedHashMap2 == null ? "null" : linkedHashMap2.getClass().getName()) + " cannot be cast to kotlin.collections.MutableMap");
                                    i3.d.g(classCastException, i3.i.class.getName());
                                    throw classCastException;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        i3.d.d(num2, "get(...)");
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        i3.d.d(str2, "get(...)");
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(intValue), str3);
                        lVar.f39b.put(str3, Integer.valueOf(intValue));
                    }
                    return;
                }
                return;
            default:
                androidx.fragment.app.w wVar = (androidx.fragment.app.w) this.f27b.f1527z.f79g;
                wVar.f676r.b(wVar, wVar, null);
                return;
        }
    }
}
