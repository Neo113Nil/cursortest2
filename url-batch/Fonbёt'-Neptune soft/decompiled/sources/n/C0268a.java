package n;

import I.C0079n;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268a extends C0276i implements Map {

    /* renamed from: l, reason: collision with root package name */
    public C0079n f3226l;

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f3226l == null) {
            this.f3226l = new C0079n(this);
        }
        C0079n c0079n = this.f3226l;
        if (((C0273f) c0079n.f689e) == null) {
            c0079n.f689e = new C0273f(c0079n, 0);
        }
        return (C0273f) c0079n.f689e;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f3226l == null) {
            this.f3226l = new C0079n(this);
        }
        C0079n c0079n = this.f3226l;
        if (((C0273f) c0079n.f690f) == null) {
            c0079n.f690f = new C0273f(c0079n, 1);
        }
        return (C0273f) c0079n.f690f;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f3257g;
        int i2 = this.f3257g;
        int[] iArr = this.f3255e;
        if (iArr.length < size) {
            Object[] objArr = this.f3256f;
            a(size);
            if (this.f3257g > 0) {
                System.arraycopy(iArr, 0, this.f3255e, 0, i2);
                System.arraycopy(objArr, 0, this.f3256f, 0, i2 << 1);
            }
            C0276i.b(iArr, objArr, i2);
        }
        if (this.f3257g != i2) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f3226l == null) {
            this.f3226l = new C0079n(this);
        }
        C0079n c0079n = this.f3226l;
        if (((C0275h) c0079n.f691g) == null) {
            c0079n.f691g = new C0275h(c0079n);
        }
        return (C0275h) c0079n.f691g;
    }
}
