package b;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: b.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0245e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f4152a;

    public /* synthetic */ C0245e(o oVar) {
        this.f4152a = oVar;
    }

    public final void a(o oVar) {
        o oVar2 = this.f4152a;
        Z1.i.f(oVar2, "this$0");
        Z1.i.f(oVar, "it");
        Bundle a3 = ((u1.e) oVar2.f4180g.f3455c).a("android:support:activity-result");
        if (a3 != null) {
            m mVar = oVar2.f4185l;
            mVar.getClass();
            ArrayList<Integer> integerArrayList = a3.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a3.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a3.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                mVar.f4170d.addAll(stringArrayList2);
            }
            Bundle bundle = a3.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = mVar.f4173g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                String str = stringArrayList.get(i3);
                LinkedHashMap linkedHashMap = mVar.f4168b;
                boolean containsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = mVar.f4167a;
                if (containsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        Z1.w.c(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i3);
                Z1.i.e(num2, "rcs[i]");
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i3);
                Z1.i.e(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(intValue));
            }
        }
    }
}
