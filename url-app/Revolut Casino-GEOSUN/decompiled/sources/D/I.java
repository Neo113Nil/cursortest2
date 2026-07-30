package D;

import M0.AbstractC0063v;
import java.io.Serializable;
import u0.C0247g;

/* loaded from: classes.dex */
public final class I extends y0.f implements E0.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f94i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f95j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f96k;

    /* renamed from: l, reason: collision with root package name */
    public Object f97l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f98m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Serializable f99n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(S s2, w0.i iVar, E0.p pVar, w0.d dVar) {
        super(1, dVar);
        this.f96k = s2;
        this.f98m = iVar;
        this.f99n = (y0.f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [E0.p, y0.f] */
    @Override // E0.l
    public final Object i(Object obj) {
        w0.d dVar = (w0.d) obj;
        switch (this.f94i) {
            case 0:
                return new I((F0.p) this.f98m, this.f96k, (F0.o) this.f99n, dVar).l(C0247g.f3005a);
            default:
                return new I(this.f96k, (w0.i) this.f98m, (E0.p) this.f99n, dVar).l(C0247g.f3005a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Type inference failed for: r6v2, types: [E0.p, y0.f] */
    @Override // y0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        F0.p pVar;
        F0.o oVar;
        C0003d c0003d;
        Object obj2;
        switch (this.f94i) {
            case 0:
                x0.a aVar = x0.a.f3094e;
                int i2 = this.f95j;
                F0.o oVar2 = (F0.o) this.f99n;
                F0.p pVar2 = (F0.p) this.f98m;
                S s2 = this.f96k;
                try {
                } catch (C0002c unused) {
                    Object obj3 = pVar2.f324e;
                    this.f97l = oVar2;
                    this.f95j = 3;
                    obj = s2.k(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (i2 == 0) {
                    o.g.z(obj);
                    this.f97l = pVar2;
                    this.f95j = 1;
                    obj = s2.i(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    pVar = pVar2;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            oVar = (F0.o) ((Serializable) this.f97l);
                            o.g.z(obj);
                            oVar.f323e = ((Number) obj).intValue();
                            return C0247g.f3005a;
                        }
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oVar2 = (F0.o) ((Serializable) this.f97l);
                        o.g.z(obj);
                        oVar2.f323e = ((Number) obj).intValue();
                        return C0247g.f3005a;
                    }
                    pVar = (F0.p) ((Serializable) this.f97l);
                    o.g.z(obj);
                }
                pVar.f324e = obj;
                l0 g2 = s2.g();
                this.f97l = oVar2;
                this.f95j = 2;
                obj = g2.a();
                if (obj == aVar) {
                    return aVar;
                }
                oVar = oVar2;
                oVar.f323e = ((Number) obj).intValue();
                return C0247g.f3005a;
            default:
                x0.a aVar2 = x0.a.f3094e;
                int i3 = this.f95j;
                S s3 = this.f96k;
                if (i3 == 0) {
                    o.g.z(obj);
                    this.f95j = 1;
                    obj = S.f(s3, true, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f97l;
                            o.g.z(obj);
                            return obj4;
                        }
                        c0003d = (C0003d) this.f97l;
                        o.g.z(obj);
                        obj2 = c0003d.f175b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == c0003d.f176c) {
                            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        }
                        if (!F0.i.a(c0003d.f175b, obj)) {
                            this.f97l = obj;
                            this.f95j = 3;
                            if (s3.k(obj, true, this) == aVar2) {
                                return aVar2;
                            }
                        }
                        return obj;
                    }
                    o.g.z(obj);
                }
                c0003d = (C0003d) obj;
                K k2 = new K((y0.f) this.f99n, c0003d, null);
                this.f97l = c0003d;
                this.f95j = 2;
                obj = AbstractC0063v.n((w0.i) this.f98m, k2, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                obj2 = c0003d.f175b;
                if ((obj2 == null ? obj2.hashCode() : 0) == c0003d.f176c) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(F0.p pVar, S s2, F0.o oVar, w0.d dVar) {
        super(1, dVar);
        this.f98m = pVar;
        this.f96k = s2;
        this.f99n = oVar;
    }
}
