package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {
    public C0282a h;

    public b(k kVar) {
        int i = kVar.f3292c;
        b(i);
        if (this.f3292c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3290a, 0, this.f3290a, 0, i);
            System.arraycopy(kVar.f3291b, 0, this.f3291b, 0, i << 1);
            this.f3292c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new C0282a(0, this);
        }
        C0282a c0282a = this.h;
        if (c0282a.f3256a == null) {
            c0282a.f3256a = new h(c0282a, 0);
        }
        return c0282a.f3256a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new C0282a(0, this);
        }
        C0282a c0282a = this.h;
        if (c0282a.f3257b == null) {
            c0282a.f3257b = new h(c0282a, 1);
        }
        return c0282a.f3257b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3292c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new C0282a(0, this);
        }
        C0282a c0282a = this.h;
        if (c0282a.f3258c == null) {
            c0282a.f3258c = new j(c0282a);
        }
        return c0282a.f3258c;
    }
}
