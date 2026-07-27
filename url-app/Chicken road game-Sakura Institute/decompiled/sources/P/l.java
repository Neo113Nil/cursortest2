package P;

import B1.C0097d;
import M2.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;
import z2.C1412P;
import z2.C1441y;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final p f3671a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3672b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f3673c;

    /* JADX WARN: Multi-variable type inference failed */
    public l(Map map, Function1 function1) {
        this.f3671a = (p) function1;
        this.f3672b = map != null ? C1412P.j(map) : new LinkedHashMap();
        this.f3673c = new LinkedHashMap();
    }

    public final Map a() {
        LinkedHashMap j4 = C1412P.j(this.f3672b);
        for (Map.Entry entry : this.f3673c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object invoke = ((Function0) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else {
                    if (!b(invoke)) {
                        throw new IllegalStateException(u3.l.d0(invoke).toString());
                    }
                    j4.put(str, C1441y.b(invoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Object invoke2 = ((Function0) list.get(i2)).invoke();
                    if (invoke2 != null && !b(invoke2)) {
                        throw new IllegalStateException(u3.l.d0(invoke2).toString());
                    }
                    arrayList.add(invoke2);
                }
                j4.put(str, arrayList);
            }
        }
        return j4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // P.k
    public final boolean b(Object obj) {
        return ((Boolean) this.f3671a.invoke(obj)).booleanValue();
    }

    @Override // P.k
    public final Object c(String str) {
        LinkedHashMap linkedHashMap = this.f3672b;
        List list = (List) linkedHashMap.remove(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            linkedHashMap.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    @Override // P.k
    public final C0097d e(String str, A3.e eVar) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!CharsKt.b(str.charAt(i2))) {
                LinkedHashMap linkedHashMap = this.f3673c;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(str, obj);
                }
                ((List) obj).add(eVar);
                return new C0097d(this, str, eVar, 8);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
