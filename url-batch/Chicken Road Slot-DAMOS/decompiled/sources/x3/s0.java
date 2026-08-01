package x3;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import v.c1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final oe.c f10451a = new oe.c();

    /* renamed from: b, reason: collision with root package name */
    public final c1 f10452b = new c1(5);

    /* renamed from: c, reason: collision with root package name */
    public final je.x f10453c = new je.x(new d2.j0(2, 2, null));

    public s0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f10452b.f9767e).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        if (r9.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Function1 function1, nd.c cVar) {
        q0 q0Var;
        md.a aVar;
        int i3;
        oe.c cVar2;
        Throwable th;
        oe.a aVar2;
        Object invoke;
        try {
            if (cVar instanceof q0) {
                q0Var = (q0) cVar;
                int i10 = q0Var.f10436s;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    q0Var.f10436s = i10 - Integer.MIN_VALUE;
                    Object obj = q0Var.f10434i;
                    aVar = md.a.f6622d;
                    i3 = q0Var.f10436s;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        q0Var.f10432d = function1;
                        cVar2 = this.f10451a;
                        q0Var.f10433e = cVar2;
                        q0Var.f10436s = 1;
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            aVar2 = (oe.a) q0Var.f10432d;
                            try {
                                cf.c.M(obj);
                                aVar2.d(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2.d(null);
                                throw th;
                            }
                        }
                        oe.c cVar3 = q0Var.f10433e;
                        Function1 function12 = (Function1) q0Var.f10432d;
                        cf.c.M(obj);
                        cVar2 = cVar3;
                        function1 = function12;
                    }
                    q0Var.f10432d = cVar2;
                    q0Var.f10433e = null;
                    q0Var.f10436s = 2;
                    invoke = function1.invoke(q0Var);
                    if (invoke != aVar) {
                        oe.c cVar4 = cVar2;
                        obj = invoke;
                        aVar2 = cVar4;
                        aVar2.d(null);
                        return obj;
                    }
                    return aVar;
                }
            }
            q0Var.f10432d = cVar2;
            q0Var.f10433e = null;
            q0Var.f10436s = 2;
            invoke = function1.invoke(q0Var);
            if (invoke != aVar) {
            }
            return aVar;
        } catch (Throwable th3) {
            oe.c cVar5 = cVar2;
            th = th3;
            aVar2 = cVar5;
            aVar2.d(null);
            throw th;
        }
        q0Var = new q0(this, cVar);
        Object obj2 = q0Var.f10434i;
        aVar = md.a.f6622d;
        i3 = q0Var.f10436s;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Function2 function2, nd.c cVar) {
        r0 r0Var;
        int i3;
        oe.c cVar2;
        Throwable th;
        boolean z10;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i10 = r0Var.f10445s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                r0Var.f10445s = i10 - Integer.MIN_VALUE;
                Object obj = r0Var.f10443i;
                Object obj2 = md.a.f6622d;
                i3 = r0Var.f10445s;
                if (i3 != 0) {
                    cf.c.M(obj);
                    oe.c cVar3 = this.f10451a;
                    boolean e2 = cVar3.e();
                    try {
                        Object valueOf = Boolean.valueOf(e2);
                        r0Var.f10441d = cVar3;
                        r0Var.f10442e = e2;
                        r0Var.f10445s = 1;
                        Object invoke = function2.invoke(valueOf, r0Var);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        cVar2 = cVar3;
                        obj = invoke;
                        z10 = e2;
                    } catch (Throwable th2) {
                        cVar2 = cVar3;
                        th = th2;
                        z10 = e2;
                        if (z10) {
                            cVar2.d(null);
                        }
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z10 = r0Var.f10442e;
                    cVar2 = r0Var.f10441d;
                    try {
                        cf.c.M(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z10) {
                        }
                        throw th;
                    }
                }
                if (z10) {
                    cVar2.d(null);
                }
                return obj;
            }
        }
        r0Var = new r0(this, cVar);
        Object obj3 = r0Var.f10443i;
        Object obj22 = md.a.f6622d;
        i3 = r0Var.f10445s;
        if (i3 != 0) {
        }
        if (z10) {
        }
        return obj3;
    }
}
