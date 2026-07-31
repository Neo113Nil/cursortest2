package l4;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4831a;

    public d(int i) {
        switch (i) {
            case 1:
                this.f4831a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.f4831a = new LinkedHashMap();
                break;
        }
    }

    public void a(q6.e eVar, p6.c cVar) {
        i.e(cVar, "initializer");
        LinkedHashMap linkedHashMap = this.f4831a;
        if (!linkedHashMap.containsKey(eVar)) {
            linkedHashMap.put(eVar, new f(eVar, cVar));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + m.a.x(eVar) + '.').toString());
    }

    public c b() {
        Collection values = this.f4831a.values();
        i.e(values, "initializers");
        f[] fVarArr = (f[]) values.toArray(new f[0]);
        return new c((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
