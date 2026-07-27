package f1;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final e3.c f6554a;

    /* renamed from: b, reason: collision with root package name */
    public final C0607a f6555b;

    /* renamed from: c, reason: collision with root package name */
    public final Z2.C f6556c;

    public X(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f6554a = e3.d.a();
        this.f6555b = new C0607a(0);
        this.f6556c = new Z2.C(new W(2, null));
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f6555b.f6561e).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Function1 function1, E2.c cVar) {
        U u4;
        D2.a aVar;
        int i2;
        e3.c cVar2;
        Throwable th;
        e3.a aVar2;
        Object invoke;
        try {
            if (cVar instanceof U) {
                u4 = (U) cVar;
                int i4 = u4.f6548n;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    u4.f6548n = i4 - Integer.MIN_VALUE;
                    Object obj = u4.f6546l;
                    aVar = D2.a.f2163d;
                    i2 = u4.f6548n;
                    if (i2 != 0) {
                        AbstractC1343r.b(obj);
                        u4.f6544j = function1;
                        cVar2 = this.f6554a;
                        u4.f6545k = cVar2;
                        u4.f6548n = 1;
                        if (cVar2.c(null, u4) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (e3.a) u4.f6544j;
                            try {
                                AbstractC1343r.b(obj);
                                ((e3.c) aVar2).e(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ((e3.c) aVar2).e(null);
                                throw th;
                            }
                        }
                        e3.c cVar3 = u4.f6545k;
                        Function1 function12 = (Function1) u4.f6544j;
                        AbstractC1343r.b(obj);
                        cVar2 = cVar3;
                        function1 = function12;
                    }
                    u4.f6544j = cVar2;
                    u4.f6545k = null;
                    u4.f6548n = 2;
                    invoke = function1.invoke(u4);
                    if (invoke != aVar) {
                        return aVar;
                    }
                    e3.c cVar4 = cVar2;
                    obj = invoke;
                    aVar2 = cVar4;
                    ((e3.c) aVar2).e(null);
                    return obj;
                }
            }
            u4.f6544j = cVar2;
            u4.f6545k = null;
            u4.f6548n = 2;
            invoke = function1.invoke(u4);
            if (invoke != aVar) {
            }
        } catch (Throwable th3) {
            e3.c cVar5 = cVar2;
            th = th3;
            aVar2 = cVar5;
            ((e3.c) aVar2).e(null);
            throw th;
        }
        u4 = new U(this, cVar);
        Object obj2 = u4.f6546l;
        aVar = D2.a.f2163d;
        i2 = u4.f6548n;
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
    public final Object c(Function2 function2, E2.c cVar) {
        V v4;
        int i2;
        e3.c cVar2;
        Throwable th;
        boolean z4;
        if (cVar instanceof V) {
            v4 = (V) cVar;
            int i4 = v4.f6553n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                v4.f6553n = i4 - Integer.MIN_VALUE;
                Object obj = v4.f6551l;
                Object obj2 = D2.a.f2163d;
                i2 = v4.f6553n;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    e3.c cVar3 = this.f6554a;
                    boolean d4 = cVar3.d(null);
                    try {
                        Object valueOf = Boolean.valueOf(d4);
                        v4.f6549j = cVar3;
                        v4.f6550k = d4;
                        v4.f6553n = 1;
                        Object h4 = function2.h(valueOf, v4);
                        if (h4 == obj2) {
                            return obj2;
                        }
                        cVar2 = cVar3;
                        obj = h4;
                        z4 = d4;
                    } catch (Throwable th2) {
                        cVar2 = cVar3;
                        th = th2;
                        z4 = d4;
                        if (z4) {
                            cVar2.e(null);
                        }
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z4 = v4.f6550k;
                    cVar2 = v4.f6549j;
                    try {
                        AbstractC1343r.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z4) {
                        }
                        throw th;
                    }
                }
                if (z4) {
                    cVar2.e(null);
                }
                return obj;
            }
        }
        v4 = new V(this, cVar);
        Object obj3 = v4.f6551l;
        Object obj22 = D2.a.f2163d;
        i2 = v4.f6553n;
        if (i2 != 0) {
        }
        if (z4) {
        }
        return obj3;
    }
}
