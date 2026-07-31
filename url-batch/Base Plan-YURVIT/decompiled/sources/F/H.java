package F;

import W0.AbstractC0081v;
import a.AbstractC0086a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class H extends I0.g implements O0.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f257i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f258j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f259k;

    /* renamed from: l, reason: collision with root package name */
    public Object f260l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f261m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Serializable f262n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(P p2, G0.i iVar, O0.p pVar, G0.d dVar) {
        super(1, dVar);
        this.f259k = p2;
        this.f261m = iVar;
        this.f262n = (I0.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [I0.g, O0.p] */
    @Override // O0.l
    public final Object j(Object obj) {
        G0.d dVar = (G0.d) obj;
        switch (this.f257i) {
            case 0:
                return new H((P0.o) this.f261m, this.f259k, (P0.n) this.f262n, dVar).m(D0.h.f206a);
            default:
                return new H(this.f259k, (G0.i) this.f261m, (O0.p) this.f262n, dVar).m(D0.h.f206a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Type inference failed for: r7v3, types: [I0.g, O0.p] */
    @Override // I0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj) {
        P0.o oVar;
        P0.n nVar;
        C0022d c0022d;
        Object obj2;
        switch (this.f257i) {
            case 0:
                P0.n nVar2 = (P0.n) this.f262n;
                P0.o oVar2 = (P0.o) this.f261m;
                int i2 = this.f258j;
                P p2 = this.f259k;
                H0.a aVar = H0.a.f511e;
                try {
                } catch (C0021c unused) {
                    Object obj3 = oVar2.f807e;
                    this.f260l = nVar2;
                    this.f258j = 3;
                    obj = p2.j(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (i2 == 0) {
                    AbstractC0086a.I(obj);
                    this.f260l = oVar2;
                    this.f258j = 1;
                    obj = p2.i(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    oVar = oVar2;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            nVar = (P0.n) ((Serializable) this.f260l);
                            AbstractC0086a.I(obj);
                            nVar.f806e = ((Number) obj).intValue();
                            return D0.h.f206a;
                        }
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        nVar2 = (P0.n) ((Serializable) this.f260l);
                        AbstractC0086a.I(obj);
                        nVar2.f806e = ((Number) obj).intValue();
                        return D0.h.f206a;
                    }
                    oVar = (P0.o) ((Serializable) this.f260l);
                    AbstractC0086a.I(obj);
                }
                oVar.f807e = obj;
                k0 g2 = p2.g();
                this.f260l = nVar2;
                this.f258j = 2;
                obj = g2.a();
                if (obj == aVar) {
                    return aVar;
                }
                nVar = nVar2;
                nVar.f806e = ((Number) obj).intValue();
                return D0.h.f206a;
            default:
                int i3 = this.f258j;
                P p3 = this.f259k;
                H0.a aVar2 = H0.a.f511e;
                if (i3 == 0) {
                    AbstractC0086a.I(obj);
                    this.f258j = 1;
                    obj = P.e(p3, true, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f260l;
                            AbstractC0086a.I(obj);
                            return obj4;
                        }
                        c0022d = (C0022d) this.f260l;
                        AbstractC0086a.I(obj);
                        obj2 = c0022d.f342b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == c0022d.f343c) {
                            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        }
                        if (!P0.h.a(c0022d.f342b, obj)) {
                            this.f260l = obj;
                            this.f258j = 3;
                            if (p3.j(obj, true, this) == aVar2) {
                                return aVar2;
                            }
                        }
                        return obj;
                    }
                    AbstractC0086a.I(obj);
                }
                c0022d = (C0022d) obj;
                G0.i iVar = (G0.i) this.f261m;
                J j2 = new J((I0.g) this.f262n, c0022d, null);
                this.f260l = c0022d;
                this.f258j = 2;
                obj = AbstractC0081v.m(iVar, j2, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                obj2 = c0022d.f342b;
                if ((obj2 == null ? obj2.hashCode() : 0) == c0022d.f343c) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(P0.o oVar, P p2, P0.n nVar, G0.d dVar) {
        super(1, dVar);
        this.f261m = oVar;
        this.f259k = p2;
        this.f262n = nVar;
    }
}
