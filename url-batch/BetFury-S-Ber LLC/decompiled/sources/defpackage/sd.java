package defpackage;

import android.os.Bundle;
import androidx.fragment.app.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class sd implements z40 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ sd(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.z40
    public final void a(yd ydVar) {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                ydVar.getClass();
                Bundle g = ((i5) bVar.i.h).g("android:support:activity-result");
                if (g != null) {
                    wd wdVar = bVar.n;
                    LinkedHashMap linkedHashMap = wdVar.b;
                    LinkedHashMap linkedHashMap2 = wdVar.a;
                    Bundle bundle = wdVar.g;
                    ArrayList<Integer> integerArrayList = g.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = g.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = g.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        wdVar.d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = g.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str = stringArrayList.get(i2);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle.containsKey(str)) {
                                continue;
                            } else {
                                if (linkedHashMap2 instanceof pw) {
                                    gk0.R(linkedHashMap2, "kotlin.collections.MutableMap");
                                    throw null;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i2);
                        num2.getClass();
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i2);
                        str2.getClass();
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(intValue), str3);
                        wdVar.b.put(str3, Integer.valueOf(intValue));
                    }
                    return;
                }
                return;
            default:
                xp xpVar = (xp) ((u3) bVar).z.g;
                xpVar.r.b(xpVar, xpVar, null);
                return;
        }
    }
}
