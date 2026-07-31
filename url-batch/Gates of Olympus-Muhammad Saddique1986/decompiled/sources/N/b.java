package N;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: f, reason: collision with root package name */
    public final g f3500f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3501g;

    public b(g gVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f3500f = gVar;
        this.f3501g = obj2;
    }

    @Override // N.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f3501g;
    }

    @Override // N.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f3501g;
        this.f3501g = obj;
        e eVar = (e) this.f3500f.f3515e;
        Q.c cVar = eVar.f3508g;
        Object obj3 = this.f3498d;
        if (cVar.containsKey(obj3)) {
            boolean z3 = eVar.f3507f;
            if (!z3) {
                cVar.put(obj3, obj);
            } else {
                if (!z3) {
                    throw new NoSuchElementException();
                }
                n nVar = eVar.f3505d[eVar.f3506e];
                Object obj4 = nVar.f3526d[nVar.f3528f];
                cVar.put(obj3, obj);
                eVar.c(obj4 != null ? obj4.hashCode() : 0, cVar.f3949e, obj4, 0);
            }
            eVar.f3511j = cVar.f3951g;
        }
        return obj2;
    }
}
