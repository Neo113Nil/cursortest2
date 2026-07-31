package o;

import androidx.datastore.preferences.protobuf.c1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends t0 implements Map {

    /* renamed from: g, reason: collision with root package name */
    public c1 f5440g;

    /* renamed from: h, reason: collision with root package name */
    public b f5441h;
    public d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t0 t0Var) {
        super(0);
        int i = t0Var.f5542f;
        b(this.f5542f + i);
        if (this.f5542f != 0) {
            for (int i8 = 0; i8 < i; i8++) {
                put(t0Var.f(i8), t0Var.i(i8));
            }
        } else if (i > 0) {
            d6.l.F(0, 0, i, t0Var.f5540d, this.f5540d);
            d6.l.H(t0Var.f5541e, this.f5541e, 0, 0, i << 1);
            this.f5542f = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        c1 c1Var = this.f5440g;
        if (c1Var != null) {
            return c1Var;
        }
        c1 c1Var2 = new c1(this, 1);
        this.f5440g = c1Var2;
        return c1Var2;
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
        int i = this.f5542f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f5542f;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f5441h;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f5441h = bVar2;
        return bVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f5542f);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.i;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.i = dVar2;
        return dVar2;
    }
}
