package b8;

import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u extends i {

    /* renamed from: r, reason: collision with root package name */
    public final transient x f1444r;

    /* renamed from: s, reason: collision with root package name */
    public final transient Object[] f1445s;

    /* renamed from: t, reason: collision with root package name */
    public final transient int f1446t;

    public u(x xVar, Object[] objArr, int i3) {
        this.f1444r = xVar;
        this.f1445s = objArr;
        this.f1446t = i3;
    }

    @Override // b8.b
    public final int c(Object[] objArr) {
        return b().c(objArr);
    }

    @Override // b8.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f1444r.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // b8.b
    public final boolean h() {
        return true;
    }

    @Override // b8.b
    /* renamed from: i */
    public final b0 iterator() {
        return b().listIterator(0);
    }

    @Override // b8.i
    public final g n() {
        return new t(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1446t;
    }
}
