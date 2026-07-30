package g7;

import g4.g1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v extends j6.c implements f7.g {

    /* renamed from: f, reason: collision with root package name */
    public final f7.g f4526f;

    /* renamed from: g, reason: collision with root package name */
    public final h6.i f4527g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4528h;

    /* renamed from: i, reason: collision with root package name */
    public h6.i f4529i;

    /* renamed from: j, reason: collision with root package name */
    public h6.d f4530j;

    public v(f7.g gVar, h6.i iVar) {
        super(t.f4524f, h6.j.f4661f);
        this.f4526f = gVar;
        this.f4527g = iVar;
        this.f4528h = ((Number) iVar.D(0, new c7.q(9))).intValue();
    }

    @Override // j6.a, j6.d
    public final j6.d getCallerFrame() {
        h6.d dVar = this.f4530j;
        if (dVar instanceof j6.d) {
            return (j6.d) dVar;
        }
        return null;
    }

    @Override // j6.c, h6.d
    public final h6.i getContext() {
        h6.i iVar = this.f4529i;
        return iVar == null ? h6.j.f4661f : iVar;
    }

    @Override // j6.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        Throwable a3 = d6.m.a(obj);
        if (a3 != null) {
            this.f4529i = new q(getContext(), a3);
        }
        h6.d dVar = this.f4530j;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return i6.a.f4956f;
    }

    @Override // f7.g
    public final Object k(Object obj, h6.d dVar) {
        try {
            Object m8 = m(dVar, obj);
            return m8 == i6.a.f4956f ? m8 : d6.z.f2639a;
        } catch (Throwable th) {
            this.f4529i = new q(dVar.getContext(), th);
            throw th;
        }
    }

    public final Object m(h6.d dVar, Object obj) {
        h6.i context = dVar.getContext();
        c7.a0.f(context);
        h6.i iVar = this.f4529i;
        if (iVar != context) {
            if (iVar instanceof q) {
                throw new IllegalStateException(z6.i.m("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((q) iVar).f4523g + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.D(0, new g1(this))).intValue() != this.f4528h) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f4527g + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f4529i = context;
        }
        this.f4530j = dVar;
        q6.f fVar = x.f4532a;
        f7.g gVar = this.f4526f;
        r6.k.d(gVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object c4 = fVar.c(gVar, obj, this);
        if (!r6.k.a(c4, i6.a.f4956f)) {
            this.f4530j = null;
        }
        return c4;
    }
}
