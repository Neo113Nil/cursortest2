package n2;

import k2.AbstractC0552y;

/* renamed from: n2.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0687L extends R1.i implements Y1.f {

    /* renamed from: e, reason: collision with root package name */
    public int f6305e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ InterfaceC0701g f6306f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int f6307g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0689N f6308h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0687L(C0689N c0689n, P1.d dVar) {
        super(3, dVar);
        this.f6308h = c0689n;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        C0687L c0687l = new C0687L(this.f6308h, (P1.d) obj3);
        c0687l.f6306f = (InterfaceC0701g) obj;
        c0687l.f6307g = intValue;
        return c0687l.invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC0701g interfaceC0701g;
        long j3;
        EnumC0684I enumC0684I;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6305e;
        C0689N c0689n = this.f6308h;
        if (i3 == 0) {
            I2.l.Q(obj);
            interfaceC0701g = this.f6306f;
            if (this.f6307g > 0) {
                EnumC0684I enumC0684I2 = EnumC0684I.f6298d;
                this.f6305e = 1;
                if (interfaceC0701g.emit(enumC0684I2, this) == aVar) {
                    return aVar;
                }
                return L1.z.f2729a;
            }
            long j4 = c0689n.f6310a;
            this.f6306f = interfaceC0701g;
            this.f6305e = 2;
            if (AbstractC0552y.e(j4, this) == aVar) {
                return aVar;
            }
            if (c0689n.f6311b > 0) {
            }
            enumC0684I = EnumC0684I.f6300f;
            this.f6306f = null;
            this.f6305e = 5;
            if (interfaceC0701g.emit(enumC0684I, this) == aVar) {
            }
            return L1.z.f2729a;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                interfaceC0701g = this.f6306f;
                I2.l.Q(obj);
                if (c0689n.f6311b > 0) {
                    EnumC0684I enumC0684I3 = EnumC0684I.f6299e;
                    this.f6306f = interfaceC0701g;
                    this.f6305e = 3;
                    if (interfaceC0701g.emit(enumC0684I3, this) == aVar) {
                        return aVar;
                    }
                    j3 = c0689n.f6311b;
                    this.f6306f = interfaceC0701g;
                    this.f6305e = 4;
                    if (AbstractC0552y.e(j3, this) == aVar) {
                    }
                }
                enumC0684I = EnumC0684I.f6300f;
                this.f6306f = null;
                this.f6305e = 5;
                if (interfaceC0701g.emit(enumC0684I, this) == aVar) {
                }
                return L1.z.f2729a;
            }
            if (i3 == 3) {
                interfaceC0701g = this.f6306f;
                I2.l.Q(obj);
                j3 = c0689n.f6311b;
                this.f6306f = interfaceC0701g;
                this.f6305e = 4;
                if (AbstractC0552y.e(j3, this) == aVar) {
                    return aVar;
                }
                enumC0684I = EnumC0684I.f6300f;
                this.f6306f = null;
                this.f6305e = 5;
                if (interfaceC0701g.emit(enumC0684I, this) == aVar) {
                }
                return L1.z.f2729a;
            }
            if (i3 == 4) {
                interfaceC0701g = this.f6306f;
                I2.l.Q(obj);
                enumC0684I = EnumC0684I.f6300f;
                this.f6306f = null;
                this.f6305e = 5;
                if (interfaceC0701g.emit(enumC0684I, this) == aVar) {
                    return aVar;
                }
                return L1.z.f2729a;
            }
            if (i3 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        I2.l.Q(obj);
        return L1.z.f2729a;
    }
}
