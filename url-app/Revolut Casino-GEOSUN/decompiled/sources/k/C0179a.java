package k;

import D.C0013n;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179a extends i implements Map {

    /* renamed from: l, reason: collision with root package name */
    public C0013n f2645l;

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f2645l == null) {
            this.f2645l = new C0013n(this);
        }
        C0013n c0013n = this.f2645l;
        if (((f) c0013n.f244a) == null) {
            c0013n.f244a = new f(c0013n, 0);
        }
        return (f) c0013n.f244a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f2645l == null) {
            this.f2645l = new C0013n(this);
        }
        C0013n c0013n = this.f2645l;
        if (((f) c0013n.f245b) == null) {
            c0013n.f245b = new f(c0013n, 1);
        }
        return (f) c0013n.f245b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f2676g;
        int i2 = this.f2676g;
        int[] iArr = this.f2674e;
        if (iArr.length < size) {
            Object[] objArr = this.f2675f;
            a(size);
            if (this.f2676g > 0) {
                System.arraycopy(iArr, 0, this.f2674e, 0, i2);
                System.arraycopy(objArr, 0, this.f2675f, 0, i2 << 1);
            }
            i.b(iArr, objArr, i2);
        }
        if (this.f2676g != i2) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f2645l == null) {
            this.f2645l = new C0013n(this);
        }
        C0013n c0013n = this.f2645l;
        if (((h) c0013n.f246c) == null) {
            c0013n.f246c = new h(c0013n);
        }
        return (h) c0013n.f246c;
    }
}
