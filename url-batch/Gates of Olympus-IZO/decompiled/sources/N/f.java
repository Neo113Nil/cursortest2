package N;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends M1.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2830d;

    /* renamed from: e, reason: collision with root package name */
    public final Q.c f2831e;

    public /* synthetic */ f(int i3, Q.c cVar) {
        this.f2830d = i3;
        this.f2831e = cVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f2830d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // M1.g
    public final int b() {
        switch (this.f2830d) {
            case 0:
                Q.c cVar = this.f2831e;
                cVar.getClass();
                return cVar.f3086h;
            default:
                Q.c cVar2 = this.f2831e;
                cVar2.getClass();
                return cVar2.f3086h;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f2830d) {
            case 0:
                this.f2831e.clear();
                break;
            default:
                this.f2831e.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f2830d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                Object key = entry.getKey();
                Q.c cVar = this.f2831e;
                Object obj2 = cVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f2831e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2830d) {
            case 0:
                return new g(this.f2831e);
            default:
                n[] nVarArr = new n[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    nVarArr[i3] = new o(1);
                }
                return new h(this.f2831e, nVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f2830d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                return this.f2831e.remove(entry.getKey(), entry.getValue());
            default:
                Q.c cVar = this.f2831e;
                if (!cVar.containsKey(obj)) {
                    return false;
                }
                cVar.remove(obj);
                return true;
        }
    }
}
