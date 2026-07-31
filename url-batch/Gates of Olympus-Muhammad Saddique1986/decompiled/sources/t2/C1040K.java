package t2;

import e2.InterfaceC0427f;
import q2.AbstractC0837y;

/* renamed from: t2.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1040K extends X1.i implements InterfaceC0427f {

    /* renamed from: h, reason: collision with root package name */
    public int f8988h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ InterfaceC1054g f8989i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ int f8990j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1042M f8991k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1040K(C1042M c1042m, V1.d dVar) {
        super(3, dVar);
        this.f8991k = c1042m;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        C1040K c1040k = new C1040K(this.f8991k, (V1.d) obj3);
        c1040k.f8989i = (InterfaceC1054g) obj;
        c1040k.f8990j = intValue;
        return c1040k.q(R1.y.f4171a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        InterfaceC1054g interfaceC1054g;
        long j3;
        EnumC1037H enumC1037H;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f8988h;
        C1042M c1042m = this.f8991k;
        if (i3 == 0) {
            R1.a.e(obj);
            interfaceC1054g = this.f8989i;
            if (this.f8990j > 0) {
                EnumC1037H enumC1037H2 = EnumC1037H.f8981d;
                this.f8988h = 1;
                if (interfaceC1054g.e(enumC1037H2, this) == aVar) {
                    return aVar;
                }
                return R1.y.f4171a;
            }
            long j4 = c1042m.f8993a;
            this.f8989i = interfaceC1054g;
            this.f8988h = 2;
            if (AbstractC0837y.f(j4, this) == aVar) {
                return aVar;
            }
            if (c1042m.f8994b > 0) {
            }
            enumC1037H = EnumC1037H.f8983f;
            this.f8989i = null;
            this.f8988h = 5;
            if (interfaceC1054g.e(enumC1037H, this) == aVar) {
            }
            return R1.y.f4171a;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                interfaceC1054g = this.f8989i;
                R1.a.e(obj);
                if (c1042m.f8994b > 0) {
                    EnumC1037H enumC1037H3 = EnumC1037H.f8982e;
                    this.f8989i = interfaceC1054g;
                    this.f8988h = 3;
                    if (interfaceC1054g.e(enumC1037H3, this) == aVar) {
                        return aVar;
                    }
                    j3 = c1042m.f8994b;
                    this.f8989i = interfaceC1054g;
                    this.f8988h = 4;
                    if (AbstractC0837y.f(j3, this) == aVar) {
                    }
                }
                enumC1037H = EnumC1037H.f8983f;
                this.f8989i = null;
                this.f8988h = 5;
                if (interfaceC1054g.e(enumC1037H, this) == aVar) {
                }
                return R1.y.f4171a;
            }
            if (i3 == 3) {
                interfaceC1054g = this.f8989i;
                R1.a.e(obj);
                j3 = c1042m.f8994b;
                this.f8989i = interfaceC1054g;
                this.f8988h = 4;
                if (AbstractC0837y.f(j3, this) == aVar) {
                    return aVar;
                }
                enumC1037H = EnumC1037H.f8983f;
                this.f8989i = null;
                this.f8988h = 5;
                if (interfaceC1054g.e(enumC1037H, this) == aVar) {
                }
                return R1.y.f4171a;
            }
            if (i3 == 4) {
                interfaceC1054g = this.f8989i;
                R1.a.e(obj);
                enumC1037H = EnumC1037H.f8983f;
                this.f8989i = null;
                this.f8988h = 5;
                if (interfaceC1054g.e(enumC1037H, this) == aVar) {
                    return aVar;
                }
                return R1.y.f4171a;
            }
            if (i3 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        R1.a.e(obj);
        return R1.y.f4171a;
    }
}
