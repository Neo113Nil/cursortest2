package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class bi1 {
    public static final fv a = new fv("NO_THREAD_ELEMENTS", 1);
    public static final j61 b = new j61(22);
    public static final j61 c = new j61(23);
    public static final j61 d = new j61(24);

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof fi1)) {
            coroutineContext.p(null, c).getClass();
            af.c();
            return;
        }
        ai1[] ai1VarArr = ((fi1) obj).c;
        int length = ai1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        ai1 ai1Var = ai1VarArr[length];
        throw null;
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object p = coroutineContext.p(0, b);
        p.getClass();
        return p;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.p(new fi1(((Number) obj).intValue(), coroutineContext), d);
        }
        af.c();
        return null;
    }
}
