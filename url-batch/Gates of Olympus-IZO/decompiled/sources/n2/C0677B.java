package n2;

/* renamed from: n2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0677B implements InterfaceC0700f {

    /* renamed from: d, reason: collision with root package name */
    public final R1.i f6273d;

    /* JADX WARN: Multi-variable type inference failed */
    public C0677B(Y1.e eVar) {
        this.f6273d = (R1.i) eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v3, types: [R1.i, Y1.e] */
    @Override // n2.InterfaceC0700f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC0701g interfaceC0701g, P1.d dVar) {
        C0695a c0695a;
        int i3;
        Throwable th;
        o2.s sVar;
        if (dVar instanceof C0695a) {
            c0695a = (C0695a) dVar;
            int i4 = c0695a.f6327g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0695a.f6327g = i4 - Integer.MIN_VALUE;
                Object obj = c0695a.f6325e;
                Q1.a aVar = Q1.a.f3113d;
                i3 = c0695a.f6327g;
                L1.z zVar = L1.z.f2729a;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    o2.s sVar2 = new o2.s(interfaceC0701g, c0695a.getContext());
                    try {
                        c0695a.f6324d = sVar2;
                        c0695a.f6327g = 1;
                        Object g3 = this.f6273d.g(sVar2, c0695a);
                        if (g3 != aVar) {
                            g3 = zVar;
                        }
                        if (g3 == aVar) {
                            return aVar;
                        }
                        sVar = sVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        sVar = sVar2;
                        sVar.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = c0695a.f6324d;
                    try {
                        I2.l.Q(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        sVar.releaseIntercepted();
                        throw th;
                    }
                }
                sVar.releaseIntercepted();
                return zVar;
            }
        }
        c0695a = new C0695a(this, dVar);
        Object obj2 = c0695a.f6325e;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = c0695a.f6327g;
        L1.z zVar2 = L1.z.f2729a;
        if (i3 != 0) {
        }
        sVar.releaseIntercepted();
        return zVar2;
    }
}
