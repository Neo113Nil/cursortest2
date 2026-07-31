package r0;

import java.util.Iterator;
import java.util.Map;
import l1.w;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends d6.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6482d;

    /* renamed from: e, reason: collision with root package name */
    public final u0.f f6483e;

    public /* synthetic */ e(int i, u0.f fVar) {
        this.f6482d = i;
        this.f6483e = fVar;
    }

    @Override // d6.h
    public final int a() {
        switch (this.f6482d) {
            case 0:
                u0.f fVar = this.f6483e;
                fVar.getClass();
                return fVar.f7150h;
            default:
                u0.f fVar2 = this.f6483e;
                fVar2.getClass();
                return fVar2.f7150h;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f6482d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f6482d) {
            case 0:
                this.f6483e.clear();
                break;
            default:
                this.f6483e.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f6482d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                u0.f fVar = this.f6483e;
                Object obj2 = fVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && fVar.containsKey(entry.getKey());
            default:
                return this.f6483e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f6482d) {
            case 0:
                return new w(this.f6483e);
            default:
                k[] kVarArr = new k[8];
                for (int i = 0; i < 8; i++) {
                    kVarArr[i] = new l(1);
                }
                return new f(this.f6483e, kVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f6482d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f6483e.remove(entry.getKey(), entry.getValue());
            default:
                u0.f fVar = this.f6483e;
                if (!fVar.containsKey(obj)) {
                    return false;
                }
                fVar.remove(obj);
                return true;
        }
    }
}
