package t2;

import e2.InterfaceC0427f;

/* renamed from: t2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1058k implements InterfaceC1053f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1053f f9033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X1.i f9034e;

    /* JADX WARN: Multi-variable type inference failed */
    public C1058k(InterfaceC1053f interfaceC1053f, InterfaceC0427f interfaceC0427f) {
        this.f9033d = interfaceC1053f;
        this.f9034e = (X1.i) interfaceC0427f;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v4, types: [X1.i, e2.f] */
    /* JADX WARN: Type inference failed for: r9v6, types: [X1.i, e2.f] */
    @Override // t2.InterfaceC1053f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(InterfaceC1054g interfaceC1054g, V1.d dVar) {
        C1057j c1057j;
        W1.a aVar;
        int i3;
        C1058k c1058k;
        C1047S c1047s;
        ?? r22;
        u2.y yVar;
        Throwable th;
        u2.y yVar2;
        ?? r9;
        try {
            if (dVar instanceof C1057j) {
                c1057j = (C1057j) dVar;
                int i4 = c1057j.f9029h;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c1057j.f9029h = i4 - Integer.MIN_VALUE;
                    Object obj = c1057j.f9028g;
                    aVar = W1.a.f4608d;
                    i3 = c1057j.f9029h;
                    if (i3 != 0) {
                        R1.a.e(obj);
                        try {
                            InterfaceC1053f interfaceC1053f = this.f9033d;
                            c1057j.f9031j = this;
                            c1057j.f9032k = interfaceC1054g;
                            c1057j.f9029h = 1;
                            if (interfaceC1053f.d(interfaceC1054g, c1057j) == aVar) {
                                return aVar;
                            }
                            c1058k = this;
                        } catch (Throwable th2) {
                            th = th2;
                            c1058k = this;
                            c1047s = new C1047S(th);
                            r22 = c1058k.f9034e;
                            c1057j.f9031j = th;
                            c1057j.f9032k = null;
                            c1057j.f9029h = 2;
                            if (AbstractC1035F.d(c1047s, r22, th, c1057j) != aVar) {
                                return aVar;
                            }
                            throw th;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                Throwable th3 = (Throwable) c1057j.f9031j;
                                R1.a.e(obj);
                                throw th3;
                            }
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            yVar2 = (u2.y) c1057j.f9031j;
                            try {
                                R1.a.e(obj);
                                yVar2.r();
                                return R1.y.f4171a;
                            } catch (Throwable th4) {
                                th = th4;
                                yVar2.r();
                                throw th;
                            }
                        }
                        interfaceC1054g = c1057j.f9032k;
                        c1058k = (C1058k) c1057j.f9031j;
                        try {
                            R1.a.e(obj);
                        } catch (Throwable th5) {
                            th = th5;
                            c1047s = new C1047S(th);
                            r22 = c1058k.f9034e;
                            c1057j.f9031j = th;
                            c1057j.f9032k = null;
                            c1057j.f9029h = 2;
                            if (AbstractC1035F.d(c1047s, r22, th, c1057j) != aVar) {
                            }
                        }
                    }
                    V1.i iVar = c1057j.f4642e;
                    f2.j.c(iVar);
                    yVar = new u2.y(interfaceC1054g, iVar);
                    r9 = c1058k.f9034e;
                    c1057j.f9031j = yVar;
                    c1057j.f9032k = null;
                    c1057j.f9029h = 3;
                    if (r9.g(yVar, null, c1057j) != aVar) {
                        return aVar;
                    }
                    yVar2 = yVar;
                    yVar2.r();
                    return R1.y.f4171a;
                }
            }
            r9 = c1058k.f9034e;
            c1057j.f9031j = yVar;
            c1057j.f9032k = null;
            c1057j.f9029h = 3;
            if (r9.g(yVar, null, c1057j) != aVar) {
            }
        } catch (Throwable th6) {
            th = th6;
            yVar2 = yVar;
            yVar2.r();
            throw th;
        }
        c1057j = new C1057j(this, dVar);
        Object obj2 = c1057j.f9028g;
        aVar = W1.a.f4608d;
        i3 = c1057j.f9029h;
        if (i3 != 0) {
        }
        V1.i iVar2 = c1057j.f4642e;
        f2.j.c(iVar2);
        yVar = new u2.y(interfaceC1054g, iVar2);
    }
}
