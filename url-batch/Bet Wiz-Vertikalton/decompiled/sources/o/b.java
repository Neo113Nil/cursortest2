package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {
    public C0276a h;

    public b(k kVar) {
        int i = kVar.f3234c;
        b(i);
        if (this.f3234c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3232a, 0, this.f3232a, 0, i);
            System.arraycopy(kVar.f3233b, 0, this.f3233b, 0, i << 1);
            this.f3234c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new C0276a(0, this);
        }
        C0276a c0276a = this.h;
        if (c0276a.f3198a == null) {
            c0276a.f3198a = new h(c0276a, 0);
        }
        return c0276a.f3198a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new C0276a(0, this);
        }
        C0276a c0276a = this.h;
        if (c0276a.f3199b == null) {
            c0276a.f3199b = new h(c0276a, 1);
        }
        return c0276a.f3199b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3234c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new C0276a(0, this);
        }
        C0276a c0276a = this.h;
        if (c0276a.f3200c == null) {
            c0276a.f3200c = new j(c0276a);
        }
        return c0276a.f3200c;
    }
}
