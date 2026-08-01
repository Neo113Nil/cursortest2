package q;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {
    public C0256a h;

    public b(k kVar) {
        int i = kVar.f3372c;
        b(i);
        if (this.f3372c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3370a, 0, this.f3370a, 0, i);
            System.arraycopy(kVar.f3371b, 0, this.f3371b, 0, i << 1);
            this.f3372c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new C0256a(0, this);
        }
        C0256a c0256a = this.h;
        if (c0256a.f3336a == null) {
            c0256a.f3336a = new h(c0256a, 0);
        }
        return c0256a.f3336a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new C0256a(0, this);
        }
        C0256a c0256a = this.h;
        if (c0256a.f3337b == null) {
            c0256a.f3337b = new h(c0256a, 1);
        }
        return c0256a.f3337b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3372c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new C0256a(0, this);
        }
        C0256a c0256a = this.h;
        if (c0256a.f3338c == null) {
            c0256a.f3338c = new j(c0256a);
        }
        return c0256a.f3338c;
    }
}
