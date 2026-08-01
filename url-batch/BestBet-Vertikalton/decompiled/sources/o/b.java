package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {
    public C0294a h;

    public b(k kVar) {
        int i = kVar.f3591c;
        b(i);
        if (this.f3591c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3589a, 0, this.f3589a, 0, i);
            System.arraycopy(kVar.f3590b, 0, this.f3590b, 0, i << 1);
            this.f3591c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new C0294a(0, this);
        }
        C0294a c0294a = this.h;
        if (((h) c0294a.f2996a) == null) {
            c0294a.f2996a = new h(c0294a, 0);
        }
        return (h) c0294a.f2996a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new C0294a(0, this);
        }
        C0294a c0294a = this.h;
        if (((h) c0294a.f2997b) == null) {
            c0294a.f2997b = new h(c0294a, 1);
        }
        return (h) c0294a.f2997b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3591c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new C0294a(0, this);
        }
        C0294a c0294a = this.h;
        if (((j) c0294a.f2998c) == null) {
            c0294a.f2998c = new j(c0294a);
        }
        return (j) c0294a.f2998c;
    }
}
