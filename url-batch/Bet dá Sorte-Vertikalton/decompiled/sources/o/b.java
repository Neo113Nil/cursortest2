package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {
    public C0257a h;

    public b(k kVar) {
        int i = kVar.f3361c;
        b(i);
        if (this.f3361c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3359a, 0, this.f3359a, 0, i);
            System.arraycopy(kVar.f3360b, 0, this.f3360b, 0, i << 1);
            this.f3361c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new C0257a(0, this);
        }
        C0257a c0257a = this.h;
        if (c0257a.f3325a == null) {
            c0257a.f3325a = new h(c0257a, 0);
        }
        return c0257a.f3325a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new C0257a(0, this);
        }
        C0257a c0257a = this.h;
        if (c0257a.f3326b == null) {
            c0257a.f3326b = new h(c0257a, 1);
        }
        return c0257a.f3326b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3361c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new C0257a(0, this);
        }
        C0257a c0257a = this.h;
        if (c0257a.f3327c == null) {
            c0257a.f3327c = new j(c0257a);
        }
        return c0257a.f3327c;
    }
}
