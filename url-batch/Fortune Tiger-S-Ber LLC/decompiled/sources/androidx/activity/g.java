package androidx.activity;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements a.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f.i f101b;

    public /* synthetic */ g(f.i iVar, int i4) {
        this.f100a = i4;
        this.f101b = iVar;
    }

    @Override // a.b
    public final void a(o oVar) {
        switch (this.f100a) {
            case 0:
                u2.c.e(oVar, "it");
                f.i iVar = this.f101b;
                Bundle c = iVar.f127i.f1004b.c("android:support:activity-result");
                if (c != null) {
                    l lVar = iVar.f131m;
                    LinkedHashMap linkedHashMap = lVar.f119b;
                    LinkedHashMap linkedHashMap2 = lVar.f118a;
                    Bundle bundle = lVar.g;
                    ArrayList<Integer> integerArrayList = c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        lVar.f120d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        String str = stringArrayList.get(i4);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle.containsKey(str)) {
                                continue;
                            } else {
                                if (linkedHashMap2 instanceof v2.a) {
                                    ClassCastException classCastException = new ClassCastException((linkedHashMap2 == null ? "null" : linkedHashMap2.getClass().getName()).concat(" cannot be cast to kotlin.collections.MutableMap"));
                                    u2.c.g(classCastException, u2.h.class.getName());
                                    throw classCastException;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i4);
                        u2.c.d(num2, "rcs[i]");
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i4);
                        u2.c.d(str2, "keys[i]");
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(intValue), str3);
                        lVar.f119b.put(str3, Integer.valueOf(intValue));
                    }
                    return;
                }
                return;
            default:
                androidx.fragment.app.w wVar = (androidx.fragment.app.w) this.f101b.f1605x.g;
                wVar.f550n.b(wVar, wVar, null);
                return;
        }
    }
}
