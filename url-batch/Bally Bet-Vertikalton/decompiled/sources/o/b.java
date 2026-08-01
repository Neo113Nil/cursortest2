package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {
    public C0280a h;

    public b(k kVar) {
        int i = kVar.f3334c;
        b(i);
        if (this.f3334c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3332a, 0, this.f3332a, 0, i);
            System.arraycopy(kVar.f3333b, 0, this.f3333b, 0, i << 1);
            this.f3334c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new C0280a(0, this);
        }
        C0280a c0280a = this.h;
        if (c0280a.f3298a == null) {
            c0280a.f3298a = new h(c0280a, 0);
        }
        return c0280a.f3298a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new C0280a(0, this);
        }
        C0280a c0280a = this.h;
        if (c0280a.f3299b == null) {
            c0280a.f3299b = new h(c0280a, 1);
        }
        return c0280a.f3299b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3334c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new C0280a(0, this);
        }
        C0280a c0280a = this.h;
        if (c0280a.f3300c == null) {
            c0280a.f3300c = new j(c0280a);
        }
        return c0280a.f3300c;
    }
}
