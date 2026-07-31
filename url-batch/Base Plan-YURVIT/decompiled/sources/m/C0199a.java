package m;

import F.C0032n;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199a extends i implements Map {

    /* renamed from: l, reason: collision with root package name */
    public C0032n f2818l;

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f2818l == null) {
            this.f2818l = new C0032n(this);
        }
        C0032n c0032n = this.f2818l;
        if (((f) c0032n.f409a) == null) {
            c0032n.f409a = new f(c0032n, 0);
        }
        return (f) c0032n.f409a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f2818l == null) {
            this.f2818l = new C0032n(this);
        }
        C0032n c0032n = this.f2818l;
        if (((f) c0032n.f410b) == null) {
            c0032n.f410b = new f(c0032n, 1);
        }
        return (f) c0032n.f410b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f2849g;
        int i2 = this.f2849g;
        int[] iArr = this.f2847e;
        if (iArr.length < size) {
            Object[] objArr = this.f2848f;
            a(size);
            if (this.f2849g > 0) {
                System.arraycopy(iArr, 0, this.f2847e, 0, i2);
                System.arraycopy(objArr, 0, this.f2848f, 0, i2 << 1);
            }
            i.b(iArr, objArr, i2);
        }
        if (this.f2849g != i2) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f2818l == null) {
            this.f2818l = new C0032n(this);
        }
        C0032n c0032n = this.f2818l;
        if (((h) c0032n.f411c) == null) {
            c0032n.f411c = new h(c0032n);
        }
        return (h) c0032n.f411c;
    }
}
