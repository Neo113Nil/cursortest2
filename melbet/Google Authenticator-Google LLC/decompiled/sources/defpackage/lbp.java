package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbp {
    public static final boolean a;

    static {
        String property = System.getProperty("kotlinx.coroutines.google.stacktrace.recovery");
        a = property != null ? Boolean.parseBoolean(property) : System.getenv("TEST_SRCDIR") != null;
    }
}
