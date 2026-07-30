package defpackage;

import android.os.Bundle;
import com.feathherdashh.dashgame.MainActivity;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class pj {
    public final /* synthetic */ MainActivity a;

    public /* synthetic */ pj(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public final void a() {
        MainActivity mainActivity = this.a;
        Bundle d = ((c51) mainActivity.i.g).d("android:support:activity-result");
        if (d != null) {
            rj rjVar = mainActivity.o;
            HashMap hashMap = rjVar.b;
            HashMap hashMap2 = rjVar.a;
            Bundle bundle = rjVar.g;
            ArrayList<Integer> integerArrayList = d.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = d.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            rjVar.d = d.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            bundle.putAll(d.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i = 0; i < stringArrayList.size(); i++) {
                String str = stringArrayList.get(i);
                if (hashMap.containsKey(str)) {
                    Integer num = (Integer) hashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        hashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.intValue();
                String str2 = stringArrayList.get(i);
                hashMap2.put(num2, str2);
                rjVar.b.put(str2, num2);
            }
        }
    }
}
