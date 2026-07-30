package b;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f1150a;

    public /* synthetic */ f(o oVar) {
        this.f1150a = oVar;
    }

    public final void a(Context context) {
        r6.k.f(context, "it");
        o oVar = this.f1150a;
        Bundle a3 = ((x3.e) oVar.f1198i.f138d).a("android:support:activity-result");
        if (a3 != null) {
            m mVar = oVar.f1203n;
            LinkedHashMap linkedHashMap = mVar.f1184b;
            LinkedHashMap linkedHashMap2 = mVar.f1183a;
            Bundle bundle = mVar.f1189g;
            ArrayList<Integer> integerArrayList = a3.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a3.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a3.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                mVar.f1186d.addAll(stringArrayList2);
            }
            Bundle bundle2 = a3.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                String str = stringArrayList.get(i7);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        r6.y.c(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i7);
                r6.k.e(num2, "rcs[i]");
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i7);
                r6.k.e(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                mVar.f1184b.put(str3, Integer.valueOf(intValue));
            }
        }
    }
}
