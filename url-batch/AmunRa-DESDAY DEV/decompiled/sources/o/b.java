package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {
    public C0274a h;

    public b(k kVar) {
        int i = kVar.f3333c;
        b(i);
        if (this.f3333c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3331a, 0, this.f3331a, 0, i);
            System.arraycopy(kVar.f3332b, 0, this.f3332b, 0, i << 1);
            this.f3333c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new C0274a(0, this);
        }
        C0274a c0274a = this.h;
        if (c0274a.f3297a == null) {
            c0274a.f3297a = new h(c0274a, 0);
        }
        return c0274a.f3297a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new C0274a(0, this);
        }
        C0274a c0274a = this.h;
        if (c0274a.f3298b == null) {
            c0274a.f3298b = new h(c0274a, 1);
        }
        return c0274a.f3298b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3333c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new C0274a(0, this);
        }
        C0274a c0274a = this.h;
        if (c0274a.f3299c == null) {
            c0274a.f3299c = new j(c0274a);
        }
        return c0274a.f3299c;
    }
}
