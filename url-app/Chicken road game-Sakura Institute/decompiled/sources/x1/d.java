package x1;

import d6.z;
import u3.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public int f9650g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ float f9651h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f9652i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, h6.d dVar) {
        super(2, dVar);
        this.f9652i = eVar;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        d dVar2 = new d(this.f9652i, dVar);
        dVar2.f9651h = ((Number) obj).floatValue();
        return dVar2;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((d) create(Float.valueOf(((Number) obj).floatValue()), (h6.d) obj2)).invokeSuspend(z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f9650g;
        if (i7 == 0) {
            d6.a.e(obj);
            float f9 = this.f9651h;
            e eVar = this.f9652i;
            Object obj2 = eVar.f9653a.f9840d.f9832f.get(y1.h.f9810e);
            if (obj2 == null) {
                obj2 = null;
            }
            q6.e eVar2 = (q6.e) obj2;
            if (eVar2 == null) {
                a.a.N("Required value was null.");
                throw null;
            }
            y0.c cVar = new y0.c(r.a(0.0f, f9));
            this.f9650g = 1;
            obj = eVar2.d(cVar, this);
            i6.a aVar = i6.a.f4956f;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d6.a.e(obj);
        }
        return new Float(y0.c.e(((y0.c) obj).f9778a));
    }
}
