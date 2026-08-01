package q;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f extends j implements Map {
    public a i;

    /* renamed from: j, reason: collision with root package name */
    public c f3106j;

    /* renamed from: k, reason: collision with root package name */
    public e f3107k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar) {
        super(0);
        int i = jVar.h;
        b(this.h + i);
        if (this.h != 0) {
            for (int i4 = 0; i4 < i; i4++) {
                put(jVar.f(i4), jVar.i(i4));
            }
        } else if (i > 0) {
            x2.g.G(0, 0, i, jVar.f3114f, this.f3114f);
            x2.g.H(jVar.f3115g, this.f3115g, 0, 0, i << 1);
            this.h = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        a aVar = this.i;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.i = aVar2;
        return aVar2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.h;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.h;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c cVar = this.f3106j;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f3106j = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.h);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        e eVar = this.f3107k;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f3107k = eVar2;
        return eVar2;
    }
}
