package q;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0582b extends C0591k implements Map {

    /* renamed from: m, reason: collision with root package name */
    public C0581a f5703m;

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f5703m == null) {
            this.f5703m = new C0581a(0, this);
        }
        C0581a c0581a = this.f5703m;
        if (((C0588h) c0581a.f1959a) == null) {
            c0581a.f1959a = new C0588h(c0581a, 0);
        }
        return (C0588h) c0581a.f1959a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f5703m == null) {
            this.f5703m = new C0581a(0, this);
        }
        C0581a c0581a = this.f5703m;
        if (((C0588h) c0581a.f1960b) == null) {
            c0581a.f1960b = new C0588h(c0581a, 1);
        }
        return (C0588h) c0581a.f1960b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f5744h;
        int i7 = this.f5744h;
        int[] iArr = this.f5742f;
        if (iArr.length < size) {
            Object[] objArr = this.f5743g;
            a(size);
            if (this.f5744h > 0) {
                System.arraycopy(iArr, 0, this.f5742f, 0, i7);
                System.arraycopy(objArr, 0, this.f5743g, 0, i7 << 1);
            }
            C0591k.b(iArr, objArr, i7);
        }
        if (this.f5744h != i7) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f5703m == null) {
            this.f5703m = new C0581a(0, this);
        }
        C0581a c0581a = this.f5703m;
        if (((C0590j) c0581a.f1961c) == null) {
            c0581a.f1961c = new C0590j(c0581a);
        }
        return (C0590j) c0581a.f1961c;
    }
}
