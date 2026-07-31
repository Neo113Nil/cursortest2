package N;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: f, reason: collision with root package name */
    public final g f2818f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2819g;

    public b(g gVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f2818f = gVar;
        this.f2819g = obj2;
    }

    @Override // N.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f2819g;
    }

    @Override // N.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f2819g;
        this.f2819g = obj;
        e eVar = (e) this.f2818f.f2833e;
        Q.c cVar = eVar.f2826g;
        Object obj3 = this.f2816d;
        if (cVar.containsKey(obj3)) {
            boolean z3 = eVar.f2825f;
            if (!z3) {
                cVar.put(obj3, obj);
            } else {
                if (!z3) {
                    throw new NoSuchElementException();
                }
                n nVar = eVar.f2823d[eVar.f2824e];
                Object obj4 = nVar.f2844d[nVar.f2846f];
                cVar.put(obj3, obj);
                eVar.c(obj4 != null ? obj4.hashCode() : 0, cVar.f3083e, obj4, 0);
            }
            eVar.f2829j = cVar.f3085g;
        }
        return obj2;
    }
}
