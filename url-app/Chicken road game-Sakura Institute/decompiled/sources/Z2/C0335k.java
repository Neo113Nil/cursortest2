package Z2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* renamed from: Z2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335k implements InterfaceC0330f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0330f f4689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E2.j f4690e;

    /* JADX WARN: Multi-variable type inference failed */
    public C0335k(InterfaceC0330f interfaceC0330f, L2.c cVar) {
        this.f4689d = interfaceC0330f;
        this.f4690e = (E2.j) cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v4, types: [E2.j, L2.c] */
    /* JADX WARN: Type inference failed for: r9v6, types: [E2.j, L2.c] */
    @Override // Z2.InterfaceC0330f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(InterfaceC0331g interfaceC0331g, C2.a aVar) {
        C0334j c0334j;
        D2.a aVar2;
        int i2;
        C0335k c0335k;
        U u4;
        ?? r2;
        a3.t tVar;
        Throwable th;
        a3.t tVar2;
        ?? r9;
        try {
            if (aVar instanceof C0334j) {
                c0334j = (C0334j) aVar;
                int i4 = c0334j.f4685k;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0334j.f4685k = i4 - Integer.MIN_VALUE;
                    Object obj = c0334j.f4684j;
                    aVar2 = D2.a.f2163d;
                    i2 = c0334j.f4685k;
                    if (i2 != 0) {
                        AbstractC1343r.b(obj);
                        try {
                            InterfaceC0330f interfaceC0330f = this.f4689d;
                            c0334j.f4687m = this;
                            c0334j.f4688n = interfaceC0331g;
                            c0334j.f4685k = 1;
                            if (interfaceC0330f.e(interfaceC0331g, c0334j) == aVar2) {
                                return aVar2;
                            }
                            c0335k = this;
                        } catch (Throwable th2) {
                            th = th2;
                            c0335k = this;
                            u4 = new U(th);
                            r2 = c0335k.f4690e;
                            c0334j.f4687m = th;
                            c0334j.f4688n = null;
                            c0334j.f4685k = 2;
                            if (H.d(u4, r2, th, c0334j) != aVar2) {
                                return aVar2;
                            }
                            throw th;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                Throwable th3 = (Throwable) c0334j.f4687m;
                                AbstractC1343r.b(obj);
                                throw th3;
                            }
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            tVar2 = (a3.t) c0334j.f4687m;
                            try {
                                AbstractC1343r.b(obj);
                                tVar2.m();
                                return Unit.f7487a;
                            } catch (Throwable th4) {
                                th = th4;
                                tVar2.m();
                                throw th;
                            }
                        }
                        interfaceC0331g = c0334j.f4688n;
                        c0335k = (C0335k) c0334j.f4687m;
                        try {
                            AbstractC1343r.b(obj);
                        } catch (Throwable th5) {
                            th = th5;
                            u4 = new U(th);
                            r2 = c0335k.f4690e;
                            c0334j.f4687m = th;
                            c0334j.f4688n = null;
                            c0334j.f4685k = 2;
                            if (H.d(u4, r2, th, c0334j) != aVar2) {
                            }
                        }
                    }
                    CoroutineContext coroutineContext = c0334j.f2311e;
                    Intrinsics.c(coroutineContext);
                    tVar = new a3.t(interfaceC0331g, coroutineContext);
                    r9 = c0335k.f4690e;
                    c0334j.f4687m = tVar;
                    c0334j.f4688n = null;
                    c0334j.f4685k = 3;
                    if (r9.g(tVar, null, c0334j) != aVar2) {
                        return aVar2;
                    }
                    tVar2 = tVar;
                    tVar2.m();
                    return Unit.f7487a;
                }
            }
            r9 = c0335k.f4690e;
            c0334j.f4687m = tVar;
            c0334j.f4688n = null;
            c0334j.f4685k = 3;
            if (r9.g(tVar, null, c0334j) != aVar2) {
            }
        } catch (Throwable th6) {
            th = th6;
            tVar2 = tVar;
            tVar2.m();
            throw th;
        }
        c0334j = new C0334j(this, aVar);
        Object obj2 = c0334j.f4684j;
        aVar2 = D2.a.f2163d;
        i2 = c0334j.f4685k;
        if (i2 != 0) {
        }
        CoroutineContext coroutineContext2 = c0334j.f2311e;
        Intrinsics.c(coroutineContext2);
        tVar = new a3.t(interfaceC0331g, coroutineContext2);
    }
}
