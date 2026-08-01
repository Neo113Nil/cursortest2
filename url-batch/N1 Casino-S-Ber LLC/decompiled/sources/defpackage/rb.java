package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class rb implements fw {
    public final /* synthetic */ int a;
    public final /* synthetic */ c3 b;

    public /* synthetic */ rb(c3 c3Var, int i) {
        this.a = i;
        this.b = c3Var;
    }

    @Override // defpackage.fw
    public final void a(wb wbVar) {
        int i = this.a;
        c3 c3Var = this.b;
        switch (i) {
            case 0:
                wbVar.getClass();
                Bundle c = c3Var.i.b.c("android:support:activity-result");
                if (c != null) {
                    ub ubVar = c3Var.m;
                    LinkedHashMap linkedHashMap = ubVar.b;
                    LinkedHashMap linkedHashMap2 = ubVar.a;
                    Bundle bundle = ubVar.g;
                    ArrayList<Integer> integerArrayList = c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        ubVar.d.addAll(stringArrayList2);
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
                                if (linkedHashMap2 instanceof kp) {
                                    ClassCastException classCastException = new ClassCastException(linkedHashMap2.getClass().getName().concat(" cannot be cast to kotlin.collections.MutableMap"));
                                    zo.M(classCastException, e70.class.getName());
                                    throw classCastException;
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
                        ubVar.b.put(str3, Integer.valueOf(intValue));
                    }
                    return;
                }
                return;
            default:
                ok okVar = (ok) c3Var.z.g;
                okVar.r.b(okVar, okVar, null);
                return;
        }
    }
}
