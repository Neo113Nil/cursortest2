package kotlinx.coroutines;

/* loaded from: classes3.dex */
public abstract class s1 {
    private static final int FALSE = 0;
    private static final int RETRY = -1;
    private static final int TRUE = 1;
    private static final kotlinx.coroutines.internal.g0 COMPLETING_ALREADY = new kotlinx.coroutines.internal.g0("COMPLETING_ALREADY");
    public static final kotlinx.coroutines.internal.g0 COMPLETING_WAITING_CHILDREN = new kotlinx.coroutines.internal.g0("COMPLETING_WAITING_CHILDREN");
    private static final kotlinx.coroutines.internal.g0 COMPLETING_RETRY = new kotlinx.coroutines.internal.g0("COMPLETING_RETRY");
    private static final kotlinx.coroutines.internal.g0 TOO_LATE_TO_CANCEL = new kotlinx.coroutines.internal.g0("TOO_LATE_TO_CANCEL");
    private static final kotlinx.coroutines.internal.g0 SEALED = new kotlinx.coroutines.internal.g0("SEALED");
    private static final x0 EMPTY_NEW = new x0(false);
    private static final x0 EMPTY_ACTIVE = new x0(true);

    public static final Object boxIncomplete(Object obj) {
        return obj instanceof g1 ? new h1((g1) obj) : obj;
    }

    public static final Object unboxState(Object obj) {
        g1 g1Var;
        h1 h1Var = obj instanceof h1 ? (h1) obj : null;
        return (h1Var == null || (g1Var = h1Var.state) == null) ? obj : g1Var;
    }
}
