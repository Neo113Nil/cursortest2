package I;

import Y0.AbstractC0127v;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class H extends J0.g implements P0.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f539i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f540j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f541k;

    /* renamed from: l, reason: collision with root package name */
    public Object f542l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f543m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Serializable f544n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(P p2, H0.i iVar, P0.p pVar, H0.d dVar) {
        super(1, dVar);
        this.f541k = p2;
        this.f543m = iVar;
        this.f544n = (J0.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [J0.g, P0.p] */
    @Override // P0.l
    public final Object i(Object obj) {
        H0.d dVar = (H0.d) obj;
        switch (this.f539i) {
            case 0:
                return new H((Q0.o) this.f543m, this.f541k, (Q0.n) this.f544n, dVar).l(F0.h.f469a);
            default:
                return new H(this.f541k, (H0.i) this.f543m, (P0.p) this.f544n, dVar).l(F0.h.f469a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Type inference failed for: r6v2, types: [J0.g, P0.p] */
    @Override // J0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        Q0.o oVar;
        Q0.n nVar;
        C0069d c0069d;
        Object obj2;
        switch (this.f539i) {
            case 0:
                I0.a aVar = I0.a.f733e;
                int i2 = this.f540j;
                Q0.n nVar2 = (Q0.n) this.f544n;
                Q0.o oVar2 = (Q0.o) this.f543m;
                P p2 = this.f541k;
                try {
                } catch (C0068c unused) {
                    Object obj3 = oVar2.f983e;
                    this.f542l = nVar2;
                    this.f540j = 3;
                    obj = p2.j(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (i2 == 0) {
                    i1.a.G(obj);
                    this.f542l = oVar2;
                    this.f540j = 1;
                    obj = p2.i(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    oVar = oVar2;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            nVar = (Q0.n) ((Serializable) this.f542l);
                            i1.a.G(obj);
                            nVar.f982e = ((Number) obj).intValue();
                            return F0.h.f469a;
                        }
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        nVar2 = (Q0.n) ((Serializable) this.f542l);
                        i1.a.G(obj);
                        nVar2.f982e = ((Number) obj).intValue();
                        return F0.h.f469a;
                    }
                    oVar = (Q0.o) ((Serializable) this.f542l);
                    i1.a.G(obj);
                }
                oVar.f983e = obj;
                j0 g2 = p2.g();
                this.f542l = nVar2;
                this.f540j = 2;
                obj = g2.a();
                if (obj == aVar) {
                    return aVar;
                }
                nVar = nVar2;
                nVar.f982e = ((Number) obj).intValue();
                return F0.h.f469a;
            default:
                I0.a aVar2 = I0.a.f733e;
                int i3 = this.f540j;
                P p3 = this.f541k;
                if (i3 == 0) {
                    i1.a.G(obj);
                    this.f540j = 1;
                    obj = P.f(p3, true, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f542l;
                            i1.a.G(obj);
                            return obj4;
                        }
                        c0069d = (C0069d) this.f542l;
                        i1.a.G(obj);
                        obj2 = c0069d.f623b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == c0069d.f624c) {
                            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        }
                        if (!Q0.h.a(c0069d.f623b, obj)) {
                            this.f542l = obj;
                            this.f540j = 3;
                            if (p3.j(obj, true, this) == aVar2) {
                                return aVar2;
                            }
                        }
                        return obj;
                    }
                    i1.a.G(obj);
                }
                c0069d = (C0069d) obj;
                J j2 = new J((J0.g) this.f544n, c0069d, null);
                this.f542l = c0069d;
                this.f540j = 2;
                obj = AbstractC0127v.n((H0.i) this.f543m, j2, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                obj2 = c0069d.f623b;
                if ((obj2 == null ? obj2.hashCode() : 0) == c0069d.f624c) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Q0.o oVar, P p2, Q0.n nVar, H0.d dVar) {
        super(1, dVar);
        this.f543m = oVar;
        this.f541k = p2;
        this.f544n = nVar;
    }
}
