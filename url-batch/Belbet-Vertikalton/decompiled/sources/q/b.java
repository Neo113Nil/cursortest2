package q;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {

    /* renamed from: h, reason: collision with root package name */
    public C0331a f3891h;

    public b(k kVar) {
        int i = kVar.f3925c;
        b(i);
        if (this.f3925c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3923a, 0, this.f3923a, 0, i);
            System.arraycopy(kVar.f3924b, 0, this.f3924b, 0, i << 1);
            this.f3925c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f3891h == null) {
            this.f3891h = new C0331a(0, this);
        }
        C0331a c0331a = this.f3891h;
        if (c0331a.f3887a == null) {
            c0331a.f3887a = new h(c0331a, 0);
        }
        return c0331a.f3887a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f3891h == null) {
            this.f3891h = new C0331a(0, this);
        }
        C0331a c0331a = this.f3891h;
        if (c0331a.f3888b == null) {
            c0331a.f3888b = new h(c0331a, 1);
        }
        return c0331a.f3888b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3925c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f3891h == null) {
            this.f3891h = new C0331a(0, this);
        }
        C0331a c0331a = this.f3891h;
        if (c0331a.f3889c == null) {
            c0331a.f3889c = new j(c0331a);
        }
        return c0331a.f3889c;
    }
}
