package R;

import S1.B;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n.r;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final f2.k f4033a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4034b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f4035c;

    /* JADX WARN: Multi-variable type inference failed */
    public l(Map map, InterfaceC0424c interfaceC0424c) {
        this.f4033a = (f2.k) interfaceC0424c;
        this.f4034b = map != null ? B.N(map) : new LinkedHashMap();
        this.f4035c = new LinkedHashMap();
    }

    public final Map a() {
        LinkedHashMap N3 = B.N(this.f4034b);
        for (Map.Entry entry : this.f4035c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object b3 = ((InterfaceC0422a) list.get(0)).b();
                if (b3 == null) {
                    continue;
                } else {
                    if (!b(b3)) {
                        throw new IllegalStateException(O2.d.M(b3).toString());
                    }
                    N3.put(str, S1.m.x0(b3));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i3 = 0; i3 < size; i3++) {
                    Object b4 = ((InterfaceC0422a) list.get(i3)).b();
                    if (b4 != null && !b(b4)) {
                        throw new IllegalStateException(O2.d.M(b4).toString());
                    }
                    arrayList.add(b4);
                }
                N3.put(str, arrayList);
            }
        }
        return N3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e2.c, f2.k] */
    @Override // R.k
    public final boolean b(Object obj) {
        return ((Boolean) this.f4033a.n(obj)).booleanValue();
    }

    @Override // R.k
    public final Object c(String str) {
        LinkedHashMap linkedHashMap = this.f4034b;
        List list = (List) linkedHashMap.remove(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            linkedHashMap.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    @Override // R.k
    public final G1.m d(String str, A.h hVar) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (!r.n(str.charAt(i3))) {
                LinkedHashMap linkedHashMap = this.f4035c;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(str, obj);
                }
                ((List) obj).add(hVar);
                return new G1.m(this, str, hVar, 7);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
