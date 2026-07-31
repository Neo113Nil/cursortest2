package b;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f974a;

    public /* synthetic */ h(l lVar) {
        this.f974a = lVar;
    }

    public final void a(Context context) {
        q6.i.e(context, "it");
        l lVar = this.f974a;
        Bundle a8 = ((x4.e) lVar.f988g.f8656b).a("android:support:activity-result");
        if (a8 != null) {
            k kVar = lVar.f991k;
            LinkedHashMap linkedHashMap = kVar.f981b;
            LinkedHashMap linkedHashMap2 = kVar.f980a;
            Bundle bundle = kVar.f985f;
            ArrayList<Integer> integerArrayList = a8.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a8.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a8.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                kVar.f982c.addAll(stringArrayList2);
            }
            Bundle bundle2 = a8.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        q6.v.b(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                q6.i.d(num2, "get(...)");
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                q6.i.d(str2, "get(...)");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                kVar.f981b.put(str3, Integer.valueOf(intValue));
            }
        }
    }
}
