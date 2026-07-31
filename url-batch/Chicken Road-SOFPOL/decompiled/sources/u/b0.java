package u;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b0 extends i6.h implements p6.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6934f = 1;

    /* renamed from: g, reason: collision with root package name */
    public Object f6935g;

    /* renamed from: h, reason: collision with root package name */
    public int f6936h;
    public /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c6.c f6937j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.lifecycle.m0 m0Var, g6.c cVar) {
        super(cVar);
        this.f6937j = m0Var;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f6934f) {
            case 0:
                return ((b0) l((g6.c) obj2, (q1.r) obj)).p(c6.m.f1757a);
            default:
                return ((b0) l((g6.c) obj2, (x6.f) obj)).p(c6.m.f1757a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [i6.h, p6.e] */
    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f6934f) {
            case 0:
                b0 b0Var = new b0((g6.h) this.i, (i6.h) this.f6937j, cVar);
                b0Var.f6935g = obj;
                return b0Var;
            default:
                b0 b0Var2 = new b0((androidx.lifecycle.m0) this.f6937j, cVar);
                b0Var2.i = obj;
                return b0Var2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, q1.r] */
    /* JADX WARN: Type inference failed for: r1v8, types: [i6.h, p6.e] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003c -> B:7:0x003d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009f -> B:25:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00b4 -> B:25:0x006e). Please report as a decompilation issue!!! */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        Object h8;
        q1.r rVar;
        q1.r rVar2;
        x6.f fVar;
        Object b8;
        switch (this.f6934f) {
            case 0:
                g6.h hVar = (g6.h) this.i;
                q1.r rVar3 = this.f6936h;
                q1.g gVar = q1.g.f5990f;
                h6.a aVar = h6.a.f3204d;
                try {
                } catch (CancellationException e8) {
                    e = e8;
                    if (a7.x.m(hVar)) {
                        throw e;
                    }
                    this.f6935g = rVar3;
                    this.f6936h = 3;
                    Object h9 = r2.r.h(rVar3, gVar, this);
                    rVar2 = rVar3;
                    if (h9 == aVar) {
                        return aVar;
                    }
                    rVar = rVar2;
                    if (a7.x.m(hVar)) {
                    }
                }
                if (rVar3 == 0) {
                    s6.a.K(obj);
                    rVar = (q1.r) this.f6935g;
                    if (a7.x.m(hVar)) {
                    }
                } else if (rVar3 != 1) {
                    if (rVar3 == 2) {
                        q1.r rVar4 = (q1.r) this.f6935g;
                        s6.a.K(obj);
                        rVar2 = rVar4;
                    } else {
                        if (rVar3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        q1.r rVar5 = (q1.r) this.f6935g;
                        s6.a.K(obj);
                        rVar2 = rVar5;
                    }
                    rVar = rVar2;
                    if (a7.x.m(hVar)) {
                        try {
                        } catch (CancellationException e9) {
                            rVar3 = rVar;
                            e = e9;
                            if (a7.x.m(hVar)) {
                            }
                        }
                        ?? r12 = (i6.h) this.f6937j;
                        this.f6935g = rVar;
                        this.f6936h = 1;
                        if (r12.g(rVar, this) == aVar) {
                            return aVar;
                        }
                        rVar3 = rVar;
                        this.f6935g = rVar3;
                        this.f6936h = 2;
                        h8 = r2.r.h(rVar3, gVar, this);
                        rVar2 = rVar3;
                        if (h8 == aVar) {
                            return aVar;
                        }
                        rVar = rVar2;
                        if (a7.x.m(hVar)) {
                            return c6.m.f1757a;
                        }
                    }
                } else {
                    q1.r rVar6 = (q1.r) this.f6935g;
                    s6.a.K(obj);
                    rVar3 = rVar6;
                    this.f6935g = rVar3;
                    this.f6936h = 2;
                    h8 = r2.r.h(rVar3, gVar, this);
                    rVar2 = rVar3;
                    if (h8 == aVar) {
                    }
                    rVar = rVar2;
                    if (a7.x.m(hVar)) {
                    }
                }
            default:
                int i = this.f6936h;
                if (i == 0) {
                    s6.a.K(obj);
                    fVar = (x6.f) this.i;
                    b8 = ((androidx.lifecycle.m0) this.f6937j).b();
                    if (b8 != null) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.f6935g;
                    fVar = (x6.f) this.i;
                    s6.a.K(obj);
                    if (obj2 == null) {
                        return c6.m.f1757a;
                    }
                    b8 = ((androidx.lifecycle.m0) this.f6937j).b();
                    if (b8 != null) {
                        this.i = fVar;
                        this.f6935g = b8;
                        this.f6936h = 1;
                        fVar.b(b8, this);
                        return h6.a.f3204d;
                    }
                    obj2 = null;
                    if (obj2 == null) {
                    }
                    b8 = ((androidx.lifecycle.m0) this.f6937j).b();
                    if (b8 != null) {
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(g6.h hVar, p6.e eVar, g6.c cVar) {
        super(cVar);
        this.i = hVar;
        this.f6937j = (i6.h) eVar;
    }
}
