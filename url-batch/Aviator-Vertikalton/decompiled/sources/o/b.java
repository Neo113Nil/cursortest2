package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {
    public C0304a h;

    public b(k kVar) {
        int i = kVar.f3707c;
        b(i);
        if (this.f3707c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3705a, 0, this.f3705a, 0, i);
            System.arraycopy(kVar.f3706b, 0, this.f3706b, 0, i << 1);
            this.f3707c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new C0304a(0, this);
        }
        C0304a c0304a = this.h;
        if (c0304a.f3664a == null) {
            c0304a.f3664a = new h(c0304a, 0);
        }
        return c0304a.f3664a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new C0304a(0, this);
        }
        C0304a c0304a = this.h;
        if (c0304a.f3665b == null) {
            c0304a.f3665b = new h(c0304a, 1);
        }
        return c0304a.f3665b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3707c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new C0304a(0, this);
        }
        C0304a c0304a = this.h;
        if (c0304a.f3666c == null) {
            c0304a.f3666c = new j(c0304a);
        }
        return c0304a.f3666c;
    }
}
