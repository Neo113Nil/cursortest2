package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {
    public C0279a h;

    public b(k kVar) {
        int i = kVar.f3351c;
        b(i);
        if (this.f3351c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3349a, 0, this.f3349a, 0, i);
            System.arraycopy(kVar.f3350b, 0, this.f3350b, 0, i << 1);
            this.f3351c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new C0279a(0, this);
        }
        C0279a c0279a = this.h;
        if (c0279a.f3315a == null) {
            c0279a.f3315a = new h(c0279a, 0);
        }
        return c0279a.f3315a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new C0279a(0, this);
        }
        C0279a c0279a = this.h;
        if (c0279a.f3316b == null) {
            c0279a.f3316b = new h(c0279a, 1);
        }
        return c0279a.f3316b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3351c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new C0279a(0, this);
        }
        C0279a c0279a = this.h;
        if (c0279a.f3317c == null) {
            c0279a.f3317c = new j(c0279a);
        }
        return c0279a.f3317c;
    }
}
