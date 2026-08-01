package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {
    public C0265a h;

    public b(k kVar) {
        int i = kVar.f3237c;
        b(i);
        if (this.f3237c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3235a, 0, this.f3235a, 0, i);
            System.arraycopy(kVar.f3236b, 0, this.f3236b, 0, i << 1);
            this.f3237c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new C0265a(0, this);
        }
        C0265a c0265a = this.h;
        if (c0265a.f3201a == null) {
            c0265a.f3201a = new h(c0265a, 0);
        }
        return c0265a.f3201a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new C0265a(0, this);
        }
        C0265a c0265a = this.h;
        if (c0265a.f3202b == null) {
            c0265a.f3202b = new h(c0265a, 1);
        }
        return c0265a.f3202b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3237c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new C0265a(0, this);
        }
        C0265a c0265a = this.h;
        if (c0265a.f3203c == null) {
            c0265a.f3203c = new j(c0265a);
        }
        return c0265a.f3203c;
    }
}
