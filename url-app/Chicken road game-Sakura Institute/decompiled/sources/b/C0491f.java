package b;

import M2.J;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import v1.C1248e;

/* renamed from: b.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0491f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f5537a;

    public /* synthetic */ C0491f(o oVar) {
        this.f5537a = oVar;
    }

    public final void a(o it) {
        o this$0 = this.f5537a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle a4 = ((C1248e) this$0.f5564j.f63d).a("android:support:activity-result");
        if (a4 != null) {
            m mVar = this$0.f5569o;
            mVar.getClass();
            ArrayList<Integer> integerArrayList = a4.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a4.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a4.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                mVar.f5553d.addAll(stringArrayList2);
            }
            Bundle bundle = a4.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = mVar.f5556g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = stringArrayList.get(i2);
                LinkedHashMap linkedHashMap = mVar.f5551b;
                boolean containsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = mVar.f5550a;
                if (containsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        J.c(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i2);
                Intrinsics.checkNotNullExpressionValue(num2, "rcs[i]");
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i2);
                Intrinsics.checkNotNullExpressionValue(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(intValue));
            }
        }
    }
}
