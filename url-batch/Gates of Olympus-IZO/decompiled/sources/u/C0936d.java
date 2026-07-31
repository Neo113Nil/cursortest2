package u;

/* renamed from: u.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0936d implements U.j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8062a;

    /* renamed from: b, reason: collision with root package name */
    public P1.k f8063b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(R1.c cVar) {
        C0935c c0935c;
        int i3;
        P1.k kVar;
        if (cVar instanceof C0935c) {
            c0935c = (C0935c) cVar;
            int i4 = c0935c.f8061g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0935c.f8061g = i4 - Integer.MIN_VALUE;
                Object obj = c0935c.f8059e;
                Q1.a aVar = Q1.a.f3113d;
                i3 = c0935c.f8061g;
                L1.z zVar = L1.z.f2729a;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    if (!this.f8062a) {
                        P1.k kVar2 = this.f8063b;
                        c0935c.f8058d = kVar2;
                        c0935c.f8061g = 1;
                        P1.k kVar3 = new P1.k(M1.B.G(c0935c), Q1.a.f3114e);
                        this.f8063b = kVar3;
                        if (kVar3.a() == aVar) {
                            return aVar;
                        }
                        kVar = kVar2;
                    }
                    return zVar;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar = c0935c.f8058d;
                I2.l.Q(obj);
                if (kVar != null) {
                    kVar.resumeWith(zVar);
                }
                return zVar;
            }
        }
        c0935c = new C0935c(this, cVar);
        Object obj2 = c0935c.f8059e;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = c0935c.f8061g;
        L1.z zVar2 = L1.z.f2729a;
        if (i3 != 0) {
        }
        if (kVar != null) {
        }
        return zVar2;
    }
}
