package v2;

import java.util.Map;

/* loaded from: classes.dex */
public final class c0 extends M {

    /* renamed from: d, reason: collision with root package name */
    public final transient f0 f15614d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f15615e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f15616f;

    public c0(f0 f0Var, Object[] objArr, int i4) {
        this.f15614d = f0Var;
        this.f15615e = objArr;
        this.f15616f = i4;
    }

    @Override // v2.D
    public final int c(int i4, Object[] objArr) {
        return b().c(i4, objArr);
    }

    @Override // v2.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f15614d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // v2.D
    public final boolean g() {
        return true;
    }

    @Override // v2.D
    /* renamed from: h */
    public final p0 iterator() {
        return b().listIterator(0);
    }

    @Override // v2.M
    public final I l() {
        return new b0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15616f;
    }
}
