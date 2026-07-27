package b3;

import W2.t0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import r0.B;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final t f5691a = new t("NO_THREAD_ELEMENTS", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final W2.r f5692b = new W2.r(4);

    /* renamed from: c, reason: collision with root package name */
    public static final W2.r f5693c = new W2.r(5);

    /* renamed from: d, reason: collision with root package name */
    public static final W2.r f5694d = new W2.r(6);

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f5691a) {
            return;
        }
        if (!(obj instanceof x)) {
            Object i2 = coroutineContext.i(null, f5693c);
            Intrinsics.d(i2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            B.c(i2);
            throw null;
        }
        x xVar = (x) obj;
        t0[] t0VarArr = xVar.f5699c;
        int length = t0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        t0 t0Var = t0VarArr[length];
        Intrinsics.c(null);
        Object obj2 = xVar.f5698b[length];
        throw null;
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object i2 = coroutineContext.i(0, f5692b);
        Intrinsics.c(i2);
        return i2;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return f5691a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.i(new x(((Number) obj).intValue(), coroutineContext), f5694d);
        }
        B.c(obj);
        throw null;
    }
}
