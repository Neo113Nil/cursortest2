package b;

import android.os.Bundle;
import d6.y;
import d7.n0;
import d7.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements x4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f973b;

    public /* synthetic */ g(int i, Object obj) {
        this.f972a = i;
        this.f973b = obj;
    }

    @Override // x4.d
    public final Bundle a() {
        c6.f[] fVarArr;
        switch (this.f972a) {
            case 0:
                l lVar = (l) this.f973b;
                Bundle bundle = new Bundle();
                k kVar = lVar.f991k;
                kVar.getClass();
                LinkedHashMap linkedHashMap = kVar.f981b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(kVar.f982c));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(kVar.f985f));
                return bundle;
            case 1:
                g2.n nVar = (g2.n) this.f973b;
                for (Map.Entry entry : y.G((LinkedHashMap) nVar.f2982e).entrySet()) {
                    nVar.f(((n0) ((w) entry.getValue())).getValue(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : y.G((LinkedHashMap) nVar.f2980c).entrySet()) {
                    nVar.f(((x4.d) entry2.getValue()).a(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) nVar.f2979b;
                if (linkedHashMap2.isEmpty()) {
                    fVarArr = new c6.f[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        arrayList.add(new c6.f((String) entry3.getKey(), entry3.getValue()));
                    }
                    fVarArr = (c6.f[]) arrayList.toArray(new c6.f[0]);
                }
                return h0.a.j((c6.f[]) Arrays.copyOf(fVarArr, fVarArr.length));
            default:
                Map d8 = ((v0.f) this.f973b).d();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry4 : d8.entrySet()) {
                    String str = (String) entry4.getKey();
                    List list = (List) entry4.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
        }
    }
}
