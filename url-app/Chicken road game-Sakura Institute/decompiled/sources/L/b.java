package L;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends a implements N2.d {

    /* renamed from: i, reason: collision with root package name */
    public final h f3457i;

    /* renamed from: j, reason: collision with root package name */
    public Object f3458j;

    public b(h hVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f3457i = hVar;
        this.f3458j = obj2;
    }

    @Override // L.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f3458j;
    }

    @Override // L.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f3458j;
        this.f3458j = obj;
        f fVar = (f) this.f3457i.f3478e;
        e eVar = fVar.f3471j;
        Object obj3 = this.f3455d;
        if (eVar.containsKey(obj3)) {
            boolean z4 = fVar.f3464i;
            if (!z4) {
                eVar.put(obj3, obj);
            } else {
                if (!z4) {
                    throw new NoSuchElementException();
                }
                n nVar = fVar.f3462d[fVar.f3463e];
                Object obj4 = nVar.f3488d[nVar.f3490i];
                eVar.put(obj3, obj);
                fVar.d(obj4 != null ? obj4.hashCode() : 0, eVar.f3467i, obj4, 0);
            }
            fVar.f3474m = eVar.f3469k;
        }
        return obj2;
    }
}
