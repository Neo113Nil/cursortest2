package v2;

import a.AbstractC0124a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class W extends AbstractC1468o implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final transient Map f15594d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f15595e;

    /* renamed from: f, reason: collision with root package name */
    public transient V f15596f;

    public W(Map map) {
        AbstractC0124a.h(map.isEmpty());
        this.f15594d = map;
    }

    @Override // v2.AbstractC1468o
    public final Map c() {
        Map map = this.f15594d;
        return map instanceof NavigableMap ? new C1459f(this, (NavigableMap) map) : map instanceof SortedMap ? new C1462i(this, (SortedMap) map) : new C1457d(this, map);
    }

    @Override // v2.AbstractC1468o
    public final Set d() {
        Map map = this.f15594d;
        return map instanceof NavigableMap ? new C1460g(this, (NavigableMap) map) : map instanceof SortedMap ? new C1463j(this, (SortedMap) map) : new C1458e(this, map);
    }

    public final void f() {
        Map map = this.f15594d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f15595e = 0;
    }

    public final Collection g() {
        return (List) this.f15596f.get();
    }
}
