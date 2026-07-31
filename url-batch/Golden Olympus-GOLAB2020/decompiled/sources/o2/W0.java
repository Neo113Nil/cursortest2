package o2;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function2;
import u2.AbstractC3459b;

/* loaded from: classes3.dex */
public abstract class W0 {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        long f42030l;

        /* renamed from: m, reason: collision with root package name */
        Object f42031m;

        /* renamed from: n, reason: collision with root package name */
        Object f42032n;

        /* renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f42033o;

        /* renamed from: p, reason: collision with root package name */
        int f42034p;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f42033o = obj;
            this.f42034p |= Integer.MIN_VALUE;
            return W0.d(0L, null, this);
        }
    }

    public static final U0 a(long j4, T t4, InterfaceC3359v0 interfaceC3359v0) {
        return new U0("Timed out waiting for " + j4 + " ms", interfaceC3359v0);
    }

    private static final Object b(V0 v02, Function2 function2) {
        AbstractC3367z0.h(v02, U.b(v02.f46201e.getContext()).f(v02.f42028f, v02, v02.getContext()));
        return AbstractC3459b.c(v02, v02, function2);
    }

    public static final Object c(long j4, Function2 function2, kotlin.coroutines.d dVar) {
        if (j4 <= 0) {
            throw new U0("Timed out immediately");
        }
        Object b4 = b(new V0(j4, dVar), function2);
        if (b4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return b4;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(long j4, Function2 function2, kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        kotlin.jvm.internal.G g4;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.f42034p;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f42034p = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f42033o;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f42034p;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    if (j4 <= 0) {
                        return null;
                    }
                    kotlin.jvm.internal.G g5 = new kotlin.jvm.internal.G();
                    try {
                        aVar.f42031m = function2;
                        aVar.f42032n = g5;
                        aVar.f42030l = j4;
                        aVar.f42034p = 1;
                        V0 v02 = new V0(j4, aVar);
                        g5.f41132b = v02;
                        Object b4 = b(v02, function2);
                        if (b4 == AbstractC1241b.f()) {
                            kotlin.coroutines.jvm.internal.h.c(aVar);
                        }
                        return b4 == f4 ? f4 : b4;
                    } catch (U0 e4) {
                        e = e4;
                        g4 = g5;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g4 = (kotlin.jvm.internal.G) aVar.f42032n;
                    try {
                        ResultKt.a(obj);
                        return obj;
                    } catch (U0 e5) {
                        e = e5;
                    }
                }
                if (e.f42026b != g4.f41132b) {
                    return null;
                }
                throw e;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f42033o;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f42034p;
        if (i4 != 0) {
        }
        if (e.f42026b != g4.f41132b) {
        }
    }
}
