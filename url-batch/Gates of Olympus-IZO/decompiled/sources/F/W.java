package F;

import I.C0089d;
import I.C0113p;

/* loaded from: classes.dex */
public final class W extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1128e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q.a f1129f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1130g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y1.a f1131h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1132i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1133j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1134k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1135l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Q.a aVar, Q.a aVar2, Q.a aVar3, Q.a aVar4, boolean z3, Y1.a aVar5, int i3) {
        super(2);
        this.f1129f = aVar;
        this.f1133j = aVar2;
        this.f1134k = aVar3;
        this.f1135l = aVar4;
        this.f1130g = z3;
        this.f1131h = aVar5;
        this.f1132i = i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f1128e) {
            case 0:
                ((Number) obj2).intValue();
                int T2 = C0089d.T(this.f1132i | 1);
                Q.a aVar = this.f1129f;
                boolean z3 = this.f1130g;
                V v3 = (V) this.f1134k;
                A0.d(this.f1131h, (U.l) this.f1133j, z3, v3, (q.j) this.f1135l, aVar, (C0113p) obj, T2);
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC0062r0.c(this.f1129f, (Q.a) this.f1133j, (Q.a) this.f1134k, (Q.a) this.f1135l, this.f1130g, this.f1131h, (C0113p) obj, C0089d.T(this.f1132i | 1));
                break;
        }
        return L1.z.f2729a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Y1.a aVar, U.l lVar, boolean z3, V v3, q.j jVar, Q.a aVar2, int i3) {
        super(2);
        this.f1131h = aVar;
        this.f1133j = lVar;
        this.f1130g = z3;
        this.f1134k = v3;
        this.f1135l = jVar;
        this.f1129f = aVar2;
        this.f1132i = i3;
    }
}
