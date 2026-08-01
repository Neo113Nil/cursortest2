package d;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import wd.g0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f3231a;

    public /* synthetic */ g(k kVar) {
        this.f3231a = kVar;
    }

    public final void a(Context context) {
        context.getClass();
        k kVar = this.f3231a;
        Bundle b10 = ((c6.l) kVar.f3245r.f1869e).b("android:support:activity-result");
        if (b10 != null) {
            j jVar = kVar.f3249v;
            LinkedHashMap linkedHashMap = jVar.f3238b;
            LinkedHashMap linkedHashMap2 = jVar.f3237a;
            Bundle bundle = jVar.f3242f;
            ArrayList<Integer> integerArrayList = b10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = b10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = b10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                jVar.f3239c.addAll(stringArrayList2);
            }
            Bundle bundle2 = b10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                String str = stringArrayList.get(i3);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        g0.b(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i3);
                num2.getClass();
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i3);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                jVar.f3238b.put(str3, Integer.valueOf(intValue));
            }
        }
    }
}
