package t;

import a0.e0;
import c7.a0;
import c7.x;
import d6.z;
import j6.i;
import r1.a1;
import r6.l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f extends i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f8720g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f8721h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a1 f8722i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f8723j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m.h f8724k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(g gVar, a1 a1Var, q6.a aVar, m.h hVar, h6.d dVar) {
        super(2, dVar);
        this.f8721h = gVar;
        this.f8722i = a1Var;
        this.f8723j = (l) aVar;
        this.f8724k = hVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [q6.a, r6.l] */
    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        f fVar = new f(this.f8721h, this.f8722i, this.f8723j, this.f8724k, dVar);
        fVar.f8720g = obj;
        return fVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((f) create((x) obj, (h6.d) obj2)).invokeSuspend(z.f2639a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [q6.a, r6.l] */
    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        d6.a.e(obj);
        x xVar = (x) this.f8720g;
        a1 a1Var = this.f8722i;
        ?? r22 = this.f8723j;
        g gVar = this.f8721h;
        a0.p(xVar, null, null, new a0.a0(gVar, a1Var, (q6.a) r22, (h6.d) null), 3);
        return a0.p(xVar, null, null, new e0(gVar, this.f8724k, null, 26), 3);
    }
}
