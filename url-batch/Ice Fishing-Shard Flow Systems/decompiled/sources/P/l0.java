package P;

import i.C0511M;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import v6.InterfaceC0979a;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final v6.c f2125a;

    /* renamed from: b, reason: collision with root package name */
    public final B.f f2126b;

    /* renamed from: c, reason: collision with root package name */
    public final C0511M f2127c;

    public l0(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f2125a = new v6.c();
        this.f2126b = new B.f(10);
        this.f2127c = new C0511M(new k0(2, null));
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f2126b.f152e).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r9.c(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Function1 function1, X5.c cVar) {
        i0 i0Var;
        W5.a aVar;
        int i2;
        v6.c cVar2;
        Throwable th;
        InterfaceC0979a interfaceC0979a;
        Object invoke;
        try {
            if (cVar instanceof i0) {
                i0Var = (i0) cVar;
                int i5 = i0Var.f2103m;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    i0Var.f2103m = i5 - Integer.MIN_VALUE;
                    Object obj = i0Var.f2101i;
                    aVar = W5.a.f2787d;
                    i2 = i0Var.f2103m;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        i0Var.f2099d = function1;
                        cVar2 = this.f2125a;
                        i0Var.f2100e = cVar2;
                        i0Var.f2103m = 1;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0979a = (InterfaceC0979a) i0Var.f2099d;
                            try {
                                V6.b.P(obj);
                                ((v6.c) interfaceC0979a).e(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ((v6.c) interfaceC0979a).e(null);
                                throw th;
                            }
                        }
                        v6.c cVar3 = i0Var.f2100e;
                        Function1 function12 = (Function1) i0Var.f2099d;
                        V6.b.P(obj);
                        cVar2 = cVar3;
                        function1 = function12;
                    }
                    i0Var.f2099d = cVar2;
                    i0Var.f2100e = null;
                    i0Var.f2103m = 2;
                    invoke = function1.invoke(i0Var);
                    if (invoke != aVar) {
                        v6.c cVar4 = cVar2;
                        obj = invoke;
                        interfaceC0979a = cVar4;
                        ((v6.c) interfaceC0979a).e(null);
                        return obj;
                    }
                    return aVar;
                }
            }
            i0Var.f2099d = cVar2;
            i0Var.f2100e = null;
            i0Var.f2103m = 2;
            invoke = function1.invoke(i0Var);
            if (invoke != aVar) {
            }
            return aVar;
        } catch (Throwable th3) {
            v6.c cVar5 = cVar2;
            th = th3;
            interfaceC0979a = cVar5;
            ((v6.c) interfaceC0979a).e(null);
            throw th;
        }
        i0Var = new i0(this, cVar);
        Object obj2 = i0Var.f2101i;
        aVar = W5.a.f2787d;
        i2 = i0Var.f2103m;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Function2 function2, X5.c cVar) {
        j0 j0Var;
        int i2;
        v6.c cVar2;
        Throwable th;
        boolean z7;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i5 = j0Var.f2112m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                j0Var.f2112m = i5 - Integer.MIN_VALUE;
                Object obj = j0Var.f2110i;
                Object obj2 = W5.a.f2787d;
                i2 = j0Var.f2112m;
                if (i2 != 0) {
                    V6.b.P(obj);
                    v6.c cVar3 = this.f2125a;
                    boolean d7 = cVar3.d();
                    try {
                        Object valueOf = Boolean.valueOf(d7);
                        j0Var.f2108d = cVar3;
                        j0Var.f2109e = d7;
                        j0Var.f2112m = 1;
                        Object invoke = function2.invoke(valueOf, j0Var);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        cVar2 = cVar3;
                        obj = invoke;
                        z7 = d7;
                    } catch (Throwable th2) {
                        cVar2 = cVar3;
                        th = th2;
                        z7 = d7;
                        if (z7) {
                            cVar2.e(null);
                        }
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z7 = j0Var.f2109e;
                    cVar2 = j0Var.f2108d;
                    try {
                        V6.b.P(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z7) {
                        }
                        throw th;
                    }
                }
                if (z7) {
                    cVar2.e(null);
                }
                return obj;
            }
        }
        j0Var = new j0(this, cVar);
        Object obj3 = j0Var.f2110i;
        Object obj22 = W5.a.f2787d;
        i2 = j0Var.f2112m;
        if (i2 != 0) {
        }
        if (z7) {
        }
        return obj3;
    }
}
