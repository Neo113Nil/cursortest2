package d;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.se;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import je.l0;
import kotlin.Pair;
import kotlin.collections.p0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements f5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3227b;

    public /* synthetic */ f(int i3, Object obj) {
        this.f3226a = i3;
        this.f3227b = obj;
    }

    @Override // f5.d
    public final Bundle a() {
        Pair[] pairArr;
        switch (this.f3226a) {
            case 0:
                k kVar = (k) this.f3227b;
                Bundle bundle = new Bundle();
                j jVar = kVar.f3249v;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f3238b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.f3239c));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f3242f));
                return bundle;
            case 1:
                Map d10 = ((a1.o) this.f3227b).d();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : d10.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            default:
                se seVar = (se) this.f3227b;
                for (Map.Entry entry2 : p0.h((LinkedHashMap) seVar.f2801r).entrySet()) {
                    seVar.r(((l0) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : p0.h((LinkedHashMap) seVar.f2799e).entrySet()) {
                    seVar.r(((f5.d) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) seVar.f2798d;
                if (linkedHashMap2.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new Pair((String) entry4.getKey(), entry4.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                return z4.w.h((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }
}
