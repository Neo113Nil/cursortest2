package le;

import ge.t1;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final a8.f f6002a = new a8.f("NO_THREAD_ELEMENTS", 3);

    /* renamed from: b, reason: collision with root package name */
    public static final a1.e f6003b;

    /* renamed from: c, reason: collision with root package name */
    public static final a1.e f6004c;

    /* renamed from: d, reason: collision with root package name */
    public static final a1.e f6005d;

    static {
        byte b10 = 0;
        f6003b = new a1.e(15, b10);
        f6004c = new a1.e(16, b10);
        f6005d = new a1.e(17, b10);
    }

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f6002a) {
            return;
        }
        if (!(obj instanceof z)) {
            Object z10 = coroutineContext.z(null, f6004c);
            z10.getClass();
            ((t1) z10).v(obj);
            return;
        }
        z zVar = (z) obj;
        t1[] t1VarArr = zVar.f6014c;
        int length = t1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = length - 1;
            t1 t1Var = t1VarArr[length];
            t1Var.getClass();
            t1Var.v(zVar.f6013b[length]);
            if (i3 < 0) {
                return;
            } else {
                length = i3;
            }
        }
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object z10 = coroutineContext.z(0, f6003b);
        z10.getClass();
        return z10;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        return obj == 0 ? f6002a : obj instanceof Integer ? coroutineContext.z(new z(((Number) obj).intValue(), coroutineContext), f6005d) : ((t1) obj).j();
    }
}
