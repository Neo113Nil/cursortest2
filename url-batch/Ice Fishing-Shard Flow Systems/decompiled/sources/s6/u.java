package s6;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import l0.C0654a;
import n6.n0;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final C0654a f7857a = new C0654a("NO_THREAD_ELEMENTS", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final V5.a f7858b = new V5.a(6);

    /* renamed from: c, reason: collision with root package name */
    public static final V5.a f7859c = new V5.a(7);

    /* renamed from: d, reason: collision with root package name */
    public static final V5.a f7860d = new V5.a(8);

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f7857a) {
            return;
        }
        if (!(obj instanceof w)) {
            Object t6 = coroutineContext.t(null, f7859c);
            Intrinsics.c(t6, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            C4.p.o(t6);
            throw null;
        }
        w wVar = (w) obj;
        n0[] n0VarArr = wVar.f7865c;
        int length = n0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        n0 n0Var = n0VarArr[length];
        Intrinsics.b(null);
        Object obj2 = wVar.f7864b[length];
        throw null;
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object t6 = coroutineContext.t(0, f7858b);
        Intrinsics.b(t6);
        return t6;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return f7857a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.t(new w(((Number) obj).intValue(), coroutineContext), f7860d);
        }
        C4.p.o(obj);
        throw null;
    }
}
