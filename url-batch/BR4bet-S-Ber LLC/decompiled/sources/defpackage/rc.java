package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class rc implements iz {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;

    public /* synthetic */ rc(m3 m3Var, int i) {
        this.a = i;
        this.b = m3Var;
    }

    @Override // defpackage.iz
    public final void a(wc wcVar) {
        int i = this.a;
        m3 m3Var = this.b;
        switch (i) {
            case 0:
                wcVar.getClass();
                Bundle c = m3Var.i.b.c("android:support:activity-result");
                if (c != null) {
                    uc ucVar = m3Var.m;
                    LinkedHashMap linkedHashMap = ucVar.b;
                    LinkedHashMap linkedHashMap2 = ucVar.a;
                    Bundle bundle = ucVar.g;
                    ArrayList<Integer> integerArrayList = c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        ucVar.d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
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
                                if (linkedHashMap2 instanceof wr) {
                                    la0.d0(linkedHashMap2, "kotlin.collections.MutableMap");
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
                        ucVar.b.put(str3, Integer.valueOf(intValue));
                    }
                    return;
                }
                return;
            default:
                rm rmVar = (rm) m3Var.y.g;
                rmVar.u.b(rmVar, rmVar, null);
                return;
        }
    }
}
