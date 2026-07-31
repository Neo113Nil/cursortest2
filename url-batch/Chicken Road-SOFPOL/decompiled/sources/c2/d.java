package c2;

import a0.q;
import c6.m;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public int f1590h;
    public /* synthetic */ float i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f1591j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, g6.c cVar) {
        super(2, cVar);
        this.f1591j = eVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        return ((d) l((g6.c) obj2, Float.valueOf(((Number) obj).floatValue()))).p(m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        d dVar = new d(this.f1591j, cVar);
        dVar.i = ((Number) obj).floatValue();
        return dVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        int i = this.f1590h;
        if (i == 0) {
            s6.a.K(obj);
            float f6 = this.i;
            e eVar = this.f1591j;
            Object g3 = eVar.f1592a.f2159d.f2150d.g(d2.i.f2129e);
            if (g3 == null) {
                g3 = null;
            }
            p6.e eVar2 = (p6.e) g3;
            if (eVar2 == null) {
                throw q.f("Required value was null.");
            }
            e1.b bVar = new e1.b((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
            this.f1590h = 1;
            obj = eVar2.g(bVar, this);
            h6.a aVar = h6.a.f3204d;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s6.a.K(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((e1.b) obj).f2455a & 4294967295L)));
    }
}
