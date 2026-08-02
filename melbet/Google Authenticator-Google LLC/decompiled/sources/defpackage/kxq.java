package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxq {
    public static final boolean a;
    public static final StackTraceElement b;
    public static final StackTraceElement c;
    public static final StackTraceElement d;
    public static final StackTraceElement e;

    static {
        boolean z = lbp.a;
        boolean z2 = true;
        if (!lbp.a && kvo.b) {
            z2 = false;
        }
        a = z2;
        b = new StackTraceElement("kotlinx.coroutines", "launch", null, -1);
        c = new StackTraceElement("kotlinx.coroutines", "async", null, -1);
        d = new StackTraceElement("kotlinx.coroutines.guava", "future", null, -1);
        e = new StackTraceElement("kotlinx.coroutines", "runBlocking", null, -1);
    }
}
