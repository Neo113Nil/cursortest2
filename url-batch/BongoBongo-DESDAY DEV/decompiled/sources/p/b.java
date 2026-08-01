package p;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {

    /* renamed from: h, reason: collision with root package name */
    public C0282a f3439h;

    public b(k kVar) {
        int i = kVar.f3473c;
        b(i);
        if (this.f3473c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3471a, 0, this.f3471a, 0, i);
            System.arraycopy(kVar.f3472b, 0, this.f3472b, 0, i << 1);
            this.f3473c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f3439h == null) {
            this.f3439h = new C0282a(0, this);
        }
        C0282a c0282a = this.f3439h;
        if (c0282a.f3435a == null) {
            c0282a.f3435a = new h(c0282a, 0);
        }
        return c0282a.f3435a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f3439h == null) {
            this.f3439h = new C0282a(0, this);
        }
        C0282a c0282a = this.f3439h;
        if (c0282a.f3436b == null) {
            c0282a.f3436b = new h(c0282a, 1);
        }
        return c0282a.f3436b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3473c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f3439h == null) {
            this.f3439h = new C0282a(0, this);
        }
        C0282a c0282a = this.f3439h;
        if (c0282a.f3437c == null) {
            c0282a.f3437c = new j(c0282a);
        }
        return c0282a.f3437c;
    }
}
