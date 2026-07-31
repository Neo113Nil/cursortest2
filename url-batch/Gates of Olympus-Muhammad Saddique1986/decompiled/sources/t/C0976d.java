package t;

/* renamed from: t.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0976d implements U.o {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8473a;

    /* renamed from: b, reason: collision with root package name */
    public V1.k f8474b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(X1.c cVar) {
        C0975c c0975c;
        int i3;
        V1.k kVar;
        if (cVar instanceof C0975c) {
            c0975c = (C0975c) cVar;
            int i4 = c0975c.f8472j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0975c.f8472j = i4 - Integer.MIN_VALUE;
                Object obj = c0975c.f8470h;
                W1.a aVar = W1.a.f4608d;
                i3 = c0975c.f8472j;
                R1.y yVar = R1.y.f4171a;
                if (i3 != 0) {
                    R1.a.e(obj);
                    if (!this.f8473a) {
                        V1.k kVar2 = this.f8474b;
                        c0975c.f8469g = kVar2;
                        c0975c.f8472j = 1;
                        V1.k kVar3 = new V1.k(l0.c.B(c0975c), W1.a.f4609e);
                        this.f8474b = kVar3;
                        if (kVar3.a() == aVar) {
                            return aVar;
                        }
                        kVar = kVar2;
                    }
                    return yVar;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar = c0975c.f8469g;
                R1.a.e(obj);
                if (kVar != null) {
                    kVar.u(yVar);
                }
                return yVar;
            }
        }
        c0975c = new C0975c(this, cVar);
        Object obj2 = c0975c.f8470h;
        W1.a aVar2 = W1.a.f4608d;
        i3 = c0975c.f8472j;
        R1.y yVar2 = R1.y.f4171a;
        if (i3 != 0) {
        }
        if (kVar != null) {
        }
        return yVar2;
    }
}
