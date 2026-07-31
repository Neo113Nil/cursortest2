package y0;

import L1.z;
import e2.AbstractC0381e;
import z0.q;

/* loaded from: classes.dex */
public final class e extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public boolean f8802e;

    /* renamed from: f, reason: collision with root package name */
    public int f8803f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ float f8804g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f8805h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, P1.d dVar) {
        super(2, dVar);
        this.f8805h = fVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        e eVar = new e(this.f8805h, dVar);
        eVar.f8804g = ((Number) obj).floatValue();
        return eVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((e) create(Float.valueOf(((Number) obj).floatValue()), (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        boolean z3;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f8803f;
        if (i3 == 0) {
            I2.l.Q(obj);
            float f3 = this.f8804g;
            f fVar = this.f8805h;
            Object obj2 = fVar.f8806a.f8991d.f8982d.get(z0.h.f8961e);
            if (obj2 == null) {
                obj2 = null;
            }
            Y1.e eVar = (Y1.e) obj2;
            if (eVar == null) {
                AbstractC0381e.O("Required value was null.");
                throw null;
            }
            boolean z4 = ((z0.g) fVar.f8806a.f8991d.c(q.p)).f8956c;
            if (z4) {
                f3 = -f3;
            }
            a0.c cVar = new a0.c(I2.l.f(0.0f, f3));
            this.f8802e = z4;
            this.f8803f = 1;
            obj = eVar.g(cVar, this);
            if (obj == aVar) {
                return aVar;
            }
            z3 = z4;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = this.f8802e;
            I2.l.Q(obj);
        }
        float e3 = a0.c.e(((a0.c) obj).f3489a);
        if (z3) {
            e3 = -e3;
        }
        return new Float(e3);
    }
}
