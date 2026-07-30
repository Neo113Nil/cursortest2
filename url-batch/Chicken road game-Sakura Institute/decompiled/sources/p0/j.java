package p0;

import androidx.lifecycle.r0;
import e6.c0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final r6.l f7009a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f7010b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f7011c;

    /* JADX WARN: Multi-variable type inference failed */
    public j(Map map, q6.c cVar) {
        this.f7009a = (r6.l) cVar;
        this.f7010b = map != null ? c0.n0(map) : new LinkedHashMap();
        this.f7011c = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q6.c, r6.l] */
    @Override // p0.i
    public final boolean a(Object obj) {
        return ((Boolean) this.f7009a.f(obj)).booleanValue();
    }

    @Override // p0.i
    public final Object b(String str) {
        LinkedHashMap linkedHashMap = this.f7010b;
        List list = (List) linkedHashMap.remove(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            linkedHashMap.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    public final Map c() {
        LinkedHashMap n02 = c0.n0(this.f7010b);
        for (Map.Entry entry : this.f7011c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object a3 = ((q6.a) list.get(0)).a();
                if (a3 == null) {
                    continue;
                } else {
                    if (!a(a3)) {
                        throw new IllegalStateException(a.a.t(a3).toString());
                    }
                    n02.put(str, e6.m.U(a3));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i7 = 0; i7 < size; i7++) {
                    Object a9 = ((q6.a) list.get(i7)).a();
                    if (a9 != null && !a(a9)) {
                        throw new IllegalStateException(a.a.t(a9).toString());
                    }
                    arrayList.add(a9);
                }
                n02.put(str, arrayList);
            }
        }
        return n02;
    }

    @Override // p0.i
    public final b1.b d(String str, r0 r0Var) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!v1.g.l(str.charAt(i7))) {
                LinkedHashMap linkedHashMap = this.f7011c;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(str, obj);
                }
                ((List) obj).add(r0Var);
                return new b1.b(this, str, r0Var, 16);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
