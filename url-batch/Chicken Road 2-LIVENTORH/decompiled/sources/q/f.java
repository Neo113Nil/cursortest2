package q;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f extends j implements Map {
    public a i;

    /* renamed from: j, reason: collision with root package name */
    public c f3024j;

    /* renamed from: k, reason: collision with root package name */
    public e f3025k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar) {
        super(0);
        int i = jVar.f3036h;
        b(this.f3036h + i);
        if (this.f3036h != 0) {
            for (int i4 = 0; i4 < i; i4++) {
                put(jVar.f(i4), jVar.i(i4));
            }
        } else if (i > 0) {
            a3.d.W(0, 0, i, jVar.f3034f, this.f3034f);
            a3.d.X(jVar.f3035g, this.f3035g, 0, 0, i << 1);
            this.f3036h = i;
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
        int i = this.f3036h;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f3036h;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c cVar = this.f3024j;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f3024j = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3036h);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        e eVar = this.f3025k;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f3025k = eVar2;
        return eVar2;
    }
}
