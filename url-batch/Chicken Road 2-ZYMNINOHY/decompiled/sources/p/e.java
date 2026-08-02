package p;

import androidx.datastore.preferences.protobuf.b0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class e extends j implements Map {

    /* renamed from: d, reason: collision with root package name */
    public b0 f14647d;

    /* renamed from: e, reason: collision with root package name */
    public b f14648e;

    /* renamed from: f, reason: collision with root package name */
    public d f14649f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar) {
        super(0);
        int i4 = jVar.f14667c;
        b(this.f14667c + i4);
        if (this.f14667c != 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                put(jVar.f(i5), jVar.i(i5));
            }
        } else if (i4 > 0) {
            d3.g.P(0, 0, i4, jVar.f14665a, this.f14665a);
            d3.g.Q(0, 0, i4 << 1, jVar.f14666b, this.f14666b);
            this.f14667c = i4;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        b0 b0Var = this.f14647d;
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(1, this);
        this.f14647d = b0Var2;
        return b0Var2;
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
        int i4 = this.f14667c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i4 != this.f14667c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f14648e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f14648e = bVar2;
        return bVar2;
    }

    public final boolean l(Collection collection) {
        int i4 = this.f14667c;
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            if (!collection.contains(f(i5))) {
                g(i5);
            }
        }
        return i4 != this.f14667c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f14667c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f14649f;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f14649f = dVar2;
        return dVar2;
    }
}
