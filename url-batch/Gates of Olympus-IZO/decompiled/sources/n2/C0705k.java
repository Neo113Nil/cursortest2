package n2;

/* renamed from: n2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0705k implements InterfaceC0700f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0700f f6350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ R1.i f6351e;

    /* JADX WARN: Multi-variable type inference failed */
    public C0705k(InterfaceC0700f interfaceC0700f, Y1.f fVar) {
        this.f6350d = interfaceC0700f;
        this.f6351e = (R1.i) fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v4, types: [R1.i, Y1.f] */
    /* JADX WARN: Type inference failed for: r9v6, types: [R1.i, Y1.f] */
    @Override // n2.InterfaceC0700f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC0701g interfaceC0701g, P1.d dVar) {
        C0704j c0704j;
        Q1.a aVar;
        int i3;
        C0705k c0705k;
        C0694T c0694t;
        ?? r22;
        o2.s sVar;
        Throwable th;
        o2.s sVar2;
        ?? r9;
        try {
            if (dVar instanceof C0704j) {
                c0704j = (C0704j) dVar;
                int i4 = c0704j.f6346e;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0704j.f6346e = i4 - Integer.MIN_VALUE;
                    Object obj = c0704j.f6345d;
                    aVar = Q1.a.f3113d;
                    i3 = c0704j.f6346e;
                    if (i3 != 0) {
                        I2.l.Q(obj);
                        try {
                            InterfaceC0700f interfaceC0700f = this.f6350d;
                            c0704j.f6348g = this;
                            c0704j.f6349h = interfaceC0701g;
                            c0704j.f6346e = 1;
                            if (interfaceC0700f.collect(interfaceC0701g, c0704j) == aVar) {
                                return aVar;
                            }
                            c0705k = this;
                        } catch (Throwable th2) {
                            th = th2;
                            c0705k = this;
                            c0694t = new C0694T(th);
                            r22 = c0705k.f6351e;
                            c0704j.f6348g = th;
                            c0704j.f6349h = null;
                            c0704j.f6346e = 2;
                            if (AbstractC0682G.c(c0694t, r22, th, c0704j) != aVar) {
                                return aVar;
                            }
                            throw th;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                Throwable th3 = (Throwable) c0704j.f6348g;
                                I2.l.Q(obj);
                                throw th3;
                            }
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sVar2 = (o2.s) c0704j.f6348g;
                            try {
                                I2.l.Q(obj);
                                sVar2.releaseIntercepted();
                                return L1.z.f2729a;
                            } catch (Throwable th4) {
                                th = th4;
                                sVar2.releaseIntercepted();
                                throw th;
                            }
                        }
                        interfaceC0701g = c0704j.f6349h;
                        c0705k = (C0705k) c0704j.f6348g;
                        try {
                            I2.l.Q(obj);
                        } catch (Throwable th5) {
                            th = th5;
                            c0694t = new C0694T(th);
                            r22 = c0705k.f6351e;
                            c0704j.f6348g = th;
                            c0704j.f6349h = null;
                            c0704j.f6346e = 2;
                            if (AbstractC0682G.c(c0694t, r22, th, c0704j) != aVar) {
                            }
                        }
                    }
                    sVar = new o2.s(interfaceC0701g, c0704j.getContext());
                    r9 = c0705k.f6351e;
                    c0704j.f6348g = sVar;
                    c0704j.f6349h = null;
                    c0704j.f6346e = 3;
                    if (r9.f(sVar, null, c0704j) != aVar) {
                        return aVar;
                    }
                    sVar2 = sVar;
                    sVar2.releaseIntercepted();
                    return L1.z.f2729a;
                }
            }
            r9 = c0705k.f6351e;
            c0704j.f6348g = sVar;
            c0704j.f6349h = null;
            c0704j.f6346e = 3;
            if (r9.f(sVar, null, c0704j) != aVar) {
            }
        } catch (Throwable th6) {
            th = th6;
            sVar2 = sVar;
            sVar2.releaseIntercepted();
            throw th;
        }
        c0704j = new C0704j(this, dVar);
        Object obj2 = c0704j.f6345d;
        aVar = Q1.a.f3113d;
        i3 = c0704j.f6346e;
        if (i3 != 0) {
        }
        sVar = new o2.s(interfaceC0701g, c0704j.getContext());
    }
}
