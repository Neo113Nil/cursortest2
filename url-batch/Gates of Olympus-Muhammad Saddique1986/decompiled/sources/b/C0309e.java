package b;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: b.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0309e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0319o f5287a;

    public /* synthetic */ C0309e(AbstractActivityC0319o abstractActivityC0319o) {
        this.f5287a = abstractActivityC0319o;
    }

    public final void a(AbstractActivityC0319o abstractActivityC0319o) {
        AbstractActivityC0319o abstractActivityC0319o2 = this.f5287a;
        f2.j.f(abstractActivityC0319o2, "this$0");
        f2.j.f(abstractActivityC0319o, "it");
        Bundle a3 = ((y1.e) abstractActivityC0319o2.f5316g.f320d).a("android:support:activity-result");
        if (a3 != null) {
            C0317m c0317m = abstractActivityC0319o2.f5321l;
            c0317m.getClass();
            ArrayList<Integer> integerArrayList = a3.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a3.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a3.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                c0317m.f5306d.addAll(stringArrayList2);
            }
            Bundle bundle = a3.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = c0317m.f5309g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                String str = stringArrayList.get(i3);
                LinkedHashMap linkedHashMap = c0317m.f5304b;
                boolean containsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = c0317m.f5303a;
                if (containsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        f2.x.c(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i3);
                f2.j.e(num2, "rcs[i]");
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i3);
                f2.j.e(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(intValue));
            }
        }
    }
}
