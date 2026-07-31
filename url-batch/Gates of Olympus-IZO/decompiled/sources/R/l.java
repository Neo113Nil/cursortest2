package R;

import D1.C0014b;
import M1.B;
import e2.AbstractC0381e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Z1.j f3160a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3161b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f3162c;

    /* JADX WARN: Multi-variable type inference failed */
    public l(Map map, Y1.c cVar) {
        this.f3160a = (Z1.j) cVar;
        this.f3161b = map != null ? B.R(map) : new LinkedHashMap();
        this.f3162c = new LinkedHashMap();
    }

    @Override // R.k
    public final C0014b a(String str, A2.l lVar) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (!AbstractC0381e.F(str.charAt(i3))) {
                LinkedHashMap linkedHashMap = this.f3162c;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(str, obj);
                }
                ((List) obj).add(lVar);
                return new C0014b(this, str, lVar, 5);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    public final Map b() {
        LinkedHashMap R2 = B.R(this.f3161b);
        for (Map.Entry entry : this.f3162c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object b2 = ((Y1.a) list.get(0)).b();
                if (b2 == null) {
                    continue;
                } else {
                    if (!c(b2)) {
                        throw new IllegalStateException(I2.d.y(b2).toString());
                    }
                    R2.put(str, M1.m.Z(b2));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i3 = 0; i3 < size; i3++) {
                    Object b3 = ((Y1.a) list.get(i3)).b();
                    if (b3 != null && !c(b3)) {
                        throw new IllegalStateException(I2.d.y(b3).toString());
                    }
                    arrayList.add(b3);
                }
                R2.put(str, arrayList);
            }
        }
        return R2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y1.c, Z1.j] */
    @Override // R.k
    public final boolean c(Object obj) {
        return ((Boolean) this.f3160a.j(obj)).booleanValue();
    }

    @Override // R.k
    public final Object d(String str) {
        LinkedHashMap linkedHashMap = this.f3161b;
        List list = (List) linkedHashMap.remove(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            linkedHashMap.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }
}
