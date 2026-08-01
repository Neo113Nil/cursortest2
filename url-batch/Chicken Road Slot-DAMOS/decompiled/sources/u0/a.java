package u0;

import kotlin.collections.i0;
import s.s;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends s implements xd.d {

    /* renamed from: r, reason: collision with root package name */
    public final kotlin.collections.h f9574r;

    /* renamed from: s, reason: collision with root package name */
    public Object f9575s;

    public a(kotlin.collections.h hVar, Object obj, Object obj2) {
        super(1, obj, obj2);
        this.f9574r = hVar;
        this.f9575s = obj2;
    }

    @Override // s.s, java.util.Map.Entry
    public final Object getValue() {
        return this.f9575s;
    }

    @Override // s.s, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f9575s;
        this.f9575s = obj;
        d dVar = (d) this.f9574r.f5566e;
        x0.g gVar = dVar.f9582r;
        Object obj3 = this.f8371e;
        if (!gVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z10 = dVar.f9581i;
        if (!z10) {
            gVar.put(obj3, obj);
        } else {
            if (!z10) {
                i0.c();
                return null;
            }
            j jVar = dVar.f9579d[dVar.f9580e];
            Object obj4 = jVar.f9595d[jVar.f9597i];
            gVar.put(obj3, obj);
            dVar.c(obj4 != null ? obj4.hashCode() : 0, gVar.f10229e, obj4, 0);
        }
        dVar.f9585u = gVar.f10231r;
        return obj2;
    }
}
