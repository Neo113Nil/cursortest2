package n;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f extends j implements Map {

    /* renamed from: i, reason: collision with root package name */
    public a f2927i;

    /* renamed from: j, reason: collision with root package name */
    public c f2928j;

    /* renamed from: k, reason: collision with root package name */
    public e f2929k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar) {
        super(0);
        int i4 = jVar.h;
        b(this.h + i4);
        if (this.h != 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                put(jVar.f(i5), jVar.i(i5));
            }
        } else if (i4 > 0) {
            n2.f.C(0, 0, i4, jVar.f2935f, this.f2935f);
            n2.f.D(jVar.g, this.g, 0, 0, i4 << 1);
            this.h = i4;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        a aVar = this.f2927i;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f2927i = aVar2;
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
        int i4 = this.h;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i4 != this.h;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c cVar = this.f2928j;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f2928j = cVar2;
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
        e eVar = this.f2929k;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f2929k = eVar2;
        return eVar2;
    }
}
