package defpackage;

import android.os.Bundle;
import androidx.fragment.app.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class ub implements ow {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ ub(k kVar, int i) {
        this.a = i;
        this.b = kVar;
    }

    @Override // defpackage.ow
    public final void a(ac acVar) {
        int i = this.a;
        k kVar = this.b;
        switch (i) {
            case 0:
                acVar.getClass();
                Bundle a = kVar.i.b.a("android:support:activity-result");
                if (a != null) {
                    yb ybVar = kVar.m;
                    LinkedHashMap linkedHashMap = ybVar.b;
                    LinkedHashMap linkedHashMap2 = ybVar.a;
                    Bundle bundle = ybVar.g;
                    ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        ybVar.d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
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
                                if (linkedHashMap2 instanceof vp) {
                                    ClassCastException classCastException = new ClassCastException(linkedHashMap2.getClass().getName().concat(" cannot be cast to kotlin.collections.MutableMap"));
                                    op.O(classCastException, l70.class.getName());
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
                        ybVar.b.put(str3, Integer.valueOf(intValue));
                    }
                    return;
                }
                return;
            default:
                kk kkVar = (kk) ((r3) kVar).z.g;
                kkVar.i.b(kkVar, kkVar, null);
                return;
        }
    }
}
