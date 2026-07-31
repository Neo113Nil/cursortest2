package r0;

import java.util.NoSuchElementException;
import l1.w;
import o.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends t {

    /* renamed from: g, reason: collision with root package name */
    public final w f6471g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6472h;

    public a(w wVar, Object obj, Object obj2) {
        super(1, obj, obj2);
        this.f6471g = wVar;
        this.f6472h = obj2;
    }

    @Override // o.t, java.util.Map.Entry
    public final Object getValue() {
        return this.f6472h;
    }

    @Override // o.t, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f6472h;
        this.f6472h = obj;
        d dVar = (d) this.f6471g.f4824e;
        u0.f fVar = dVar.f6479g;
        Object obj3 = this.f5538e;
        if (!fVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z3 = dVar.f6478f;
        if (!z3) {
            fVar.put(obj3, obj);
        } else {
            if (!z3) {
                throw new NoSuchElementException();
            }
            k kVar = dVar.f6476d[dVar.f6477e];
            Object obj4 = kVar.f6493d[kVar.f6495f];
            fVar.put(obj3, obj);
            dVar.c(obj4 != null ? obj4.hashCode() : 0, fVar.f7147e, obj4, 0);
        }
        dVar.f6481j = fVar.f7149g;
        return obj2;
    }
}
