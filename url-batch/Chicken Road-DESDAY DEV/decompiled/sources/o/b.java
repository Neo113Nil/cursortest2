package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {
    public C0277a h;

    public b(k kVar) {
        int i = kVar.f3328c;
        b(i);
        if (this.f3328c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3326a, 0, this.f3326a, 0, i);
            System.arraycopy(kVar.f3327b, 0, this.f3327b, 0, i << 1);
            this.f3328c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new C0277a(0, this);
        }
        C0277a c0277a = this.h;
        if (c0277a.f3292a == null) {
            c0277a.f3292a = new h(c0277a, 0);
        }
        return c0277a.f3292a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new C0277a(0, this);
        }
        C0277a c0277a = this.h;
        if (c0277a.f3293b == null) {
            c0277a.f3293b = new h(c0277a, 1);
        }
        return c0277a.f3293b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3328c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new C0277a(0, this);
        }
        C0277a c0277a = this.h;
        if (c0277a.f3294c == null) {
            c0277a.f3294c = new j(c0277a);
        }
        return c0277a.f3294c;
    }
}
