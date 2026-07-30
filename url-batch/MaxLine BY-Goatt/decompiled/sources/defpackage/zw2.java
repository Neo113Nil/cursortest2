package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class zw2 {
    public static final ng0 a = new ng0("NO_THREAD_ELEMENTS", 1);
    public static final ee2 b = new ee2(16);
    public static final ee2 c = new ee2(17);
    public static final ee2 d = new ee2(18);

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof gx2)) {
            Object y = coroutineContext.y(null, c);
            y.getClass();
            ((ax2) ((yw2) y)).n.set(obj);
            return;
        }
        gx2 gx2Var = (gx2) obj;
        yw2[] yw2VarArr = gx2Var.c;
        int length = yw2VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            yw2 yw2Var = yw2VarArr[length];
            yw2Var.getClass();
            ((ax2) yw2Var).n.set(gx2Var.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object y = coroutineContext.y(0, b);
        y.getClass();
        return y;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.y(new gx2(((Number) obj).intValue(), coroutineContext), d);
        }
        ax2 ax2Var = (ax2) ((yw2) obj);
        ThreadLocal threadLocal = ax2Var.n;
        Object obj2 = threadLocal.get();
        threadLocal.set(ax2Var.m);
        return obj2;
    }
}
