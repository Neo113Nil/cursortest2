package c;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f2566a;

    public /* synthetic */ f(m mVar) {
        this.f2566a = mVar;
    }

    public final void a(m it) {
        m this$0 = this.f2566a;
        kotlin.jvm.internal.j.e(this$0, "this$0");
        kotlin.jvm.internal.j.e(it, "it");
        Bundle a3 = ((O1.k) this$0.f2586d.f1593c).a("android:support:activity-result");
        if (a3 != null) {
            k kVar = this$0.f2590i;
            kVar.getClass();
            ArrayList<Integer> integerArrayList = a3.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a3.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a3.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                kVar.f2578d.addAll(stringArrayList2);
            }
            Bundle bundle = a3.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = kVar.f2580g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                String str = stringArrayList.get(i3);
                LinkedHashMap linkedHashMap = kVar.f2576b;
                boolean containsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = kVar.f2575a;
                if (containsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        kotlin.jvm.internal.t.a(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i3);
                kotlin.jvm.internal.j.d(num2, "rcs[i]");
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i3);
                kotlin.jvm.internal.j.d(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(intValue));
            }
        }
    }
}
