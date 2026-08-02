package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gso extends IllegalStateException {
    public gso(String str) {
        super(a(null, str));
    }

    private static String a(String str, String str2) {
        return "Starting new trace " + str2 + " when already associated with a trace" + (str == null ? "" : ": ".concat(str)) + ". For more help, see http://go/tiktok-tracing#fixing-duplicate-trace-issues";
    }

    public gso(String str, String str2, Throwable th) {
        super(a(str, str2), th);
    }
}
