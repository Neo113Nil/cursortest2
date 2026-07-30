package o;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k1 extends j6.h implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6668g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f6669h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6670i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c7.x f6671j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m0 f6672k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6673l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Serializable f6674m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k1(c7.x xVar, q6.f fVar, q6.c cVar, m0 m0Var, h6.d dVar) {
        super(2, dVar);
        this.f6671j = xVar;
        this.f6673l = (j6.i) fVar;
        this.f6674m = (r6.l) cVar;
        this.f6672k = m0Var;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [j6.i, q6.f] */
    /* JADX WARN: Type inference failed for: r5v1, types: [q6.c, r6.l] */
    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f6668g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k1 k1Var = new k1(this.f6671j, (q6.f) this.f6673l, (q6.c) this.f6674m, this.f6672k, dVar);
                k1Var.f6670i = obj;
                return k1Var;
            default:
                k1 k1Var2 = new k1(this.f6671j, (w.j) this.f6673l, (r6.v) this.f6674m, this.f6672k, dVar);
                k1Var2.f6670i = obj;
                return k1Var2;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        l1.c0 c0Var = (l1.c0) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f6668g) {
        }
        return ((k1) create(c0Var, dVar)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Type inference failed for: r0v7, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r4v2, types: [j6.i, q6.f] */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        l1.c0 c0Var;
        l1.v vVar;
        switch (this.f6668g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f6669h;
                c7.x xVar = this.f6671j;
                m0 m0Var = this.f6672k;
                i6.a aVar = i6.a.f4956f;
                if (i7 == 0) {
                    d6.a.e(obj);
                    c0Var = (l1.c0) this.f6670i;
                    c7.a0.p(xVar, null, null, new i1(m0Var, null, 0), 3);
                    this.f6670i = c0Var;
                    this.f6669h = 1;
                    obj = p1.b(c0Var, (r3 & 1) != 0, l1.k.f5816g, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d6.a.e(obj);
                        vVar = (l1.v) obj;
                        if (vVar != null) {
                            c7.a0.p(xVar, null, null, new j1(m0Var, null, 0), 3);
                        } else {
                            vVar.a();
                            c7.a0.p(xVar, null, null, new j1(m0Var, null, 1), 3);
                            ((r6.l) this.f6674m).f(new y0.c(vVar.f5832c));
                        }
                        return d6.z.f2639a;
                    }
                    c0Var = (l1.c0) this.f6670i;
                    d6.a.e(obj);
                }
                l1.v vVar2 = (l1.v) obj;
                vVar2.a();
                ?? r42 = (j6.i) this.f6673l;
                if (r42 != p1.f6716a) {
                    c7.a0.p(xVar, null, null, new a0.a0((q6.f) r42, m0Var, vVar2, (h6.d) null), 3);
                }
                this.f6670i = null;
                this.f6669h = 2;
                obj = p1.d(c0Var, l1.k.f5816g, this);
                if (obj == aVar) {
                    return aVar;
                }
                vVar = (l1.v) obj;
                if (vVar != null) {
                }
                return d6.z.f2639a;
            default:
                int i8 = this.f6669h;
                if (i8 == 0) {
                    d6.a.e(obj);
                    l1.c0 c0Var2 = (l1.c0) this.f6670i;
                    this.f6669h = 1;
                    obj = p1.d(c0Var2, l1.k.f5816g, this);
                    i6.a aVar2 = i6.a.f4956f;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                l1.v vVar3 = (l1.v) obj;
                c7.x xVar2 = this.f6671j;
                m0 m0Var2 = this.f6672k;
                if (vVar3 != null) {
                    vVar3.a();
                    c7.a0.p(xVar2, null, null, new j1(m0Var2, null, 6), 3);
                    throw null;
                }
                c7.a0.p(xVar2, null, null, new j1(m0Var2, null, 7), 3);
                w.j jVar = (w.j) this.f6673l;
                long j8 = ((l1.v) ((r6.v) this.f6674m).f7968f).f5832c;
                jVar.f9254h.o();
                return d6.z.f2639a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(c7.x xVar, w.j jVar, r6.v vVar, m0 m0Var, h6.d dVar) {
        super(2, dVar);
        this.f6671j = xVar;
        this.f6673l = jVar;
        this.f6674m = vVar;
        this.f6672k = m0Var;
    }
}
