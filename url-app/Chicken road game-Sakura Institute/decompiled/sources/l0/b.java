package l0;

import f1.g0;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends a implements s6.d {

    /* renamed from: h, reason: collision with root package name */
    public final g0 f5744h;

    /* renamed from: i, reason: collision with root package name */
    public Object f5745i;

    public b(g0 g0Var, Object obj, Object obj2) {
        super(obj, obj2);
        this.f5744h = g0Var;
        this.f5745i = obj2;
    }

    @Override // l0.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f5745i;
    }

    @Override // l0.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f5745i;
        this.f5745i = obj;
        e eVar = (e) this.f5744h.f3155g;
        o0.c cVar = eVar.f5752i;
        Object obj3 = this.f5742f;
        if (!cVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z8 = eVar.f5751h;
        if (!z8) {
            cVar.put(obj3, obj);
        } else {
            if (!z8) {
                throw new NoSuchElementException();
            }
            l lVar = eVar.f5749f[eVar.f5750g];
            Object obj4 = lVar.f5766f[lVar.f5768h];
            cVar.put(obj3, obj);
            eVar.c(obj4 != null ? obj4.hashCode() : 0, cVar.f6817g, obj4, 0);
        }
        eVar.f5755l = cVar.f6819i;
        return obj2;
    }
}
