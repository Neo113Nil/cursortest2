package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {
    public C0306a h;

    public b(k kVar) {
        int i = kVar.f3711c;
        b(i);
        if (this.f3711c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3709a, 0, this.f3709a, 0, i);
            System.arraycopy(kVar.f3710b, 0, this.f3710b, 0, i << 1);
            this.f3711c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new C0306a(0, this);
        }
        C0306a c0306a = this.h;
        if (c0306a.f3668a == null) {
            c0306a.f3668a = new h(c0306a, 0);
        }
        return c0306a.f3668a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new C0306a(0, this);
        }
        C0306a c0306a = this.h;
        if (c0306a.f3669b == null) {
            c0306a.f3669b = new h(c0306a, 1);
        }
        return c0306a.f3669b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3711c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new C0306a(0, this);
        }
        C0306a c0306a = this.h;
        if (c0306a.f3670c == null) {
            c0306a.f3670c = new j(c0306a);
        }
        return c0306a.f3670c;
    }
}
