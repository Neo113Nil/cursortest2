package s;

import m.p0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c0 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public int f7988g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d0 f7989h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7990i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, int i7, h6.d dVar) {
        super(2, dVar);
        this.f7989h = d0Var;
        this.f7990i = i7;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        return new c0(this.f7989h, this.f7990i, dVar);
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((c0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f7988g;
        d6.z zVar = d6.z.f2639a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d6.a.e(obj);
            return zVar;
        }
        d6.a.e(obj);
        r.c cVar = this.f7989h.f7992t;
        this.f7988g = 1;
        r.s sVar = cVar.f7595a;
        androidx.room.c cVar2 = r.s.f7673w;
        sVar.getClass();
        Object b9 = sVar.b(p0.f6228f, new r.r(sVar, this.f7990i, (h6.d) null), this);
        i6.a aVar = i6.a.f4956f;
        if (b9 != aVar) {
            b9 = zVar;
        }
        if (b9 != aVar) {
            b9 = zVar;
        }
        return b9 == aVar ? aVar : zVar;
    }
}
