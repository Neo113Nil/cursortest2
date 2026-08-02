package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxy {
    public static final boolean a = a("GRPC_ENABLE_RFC3986_URIS", true);

    public static boolean a(String str, boolean z) {
        String str2 = System.getenv(str);
        if (str2 == null) {
            str2 = System.getProperty(str);
        }
        if (str2 != null) {
            str2 = str2.trim();
        }
        return z ? hoq.S(str2) || Boolean.parseBoolean(str2) : !hoq.S(str2) && Boolean.parseBoolean(str2);
    }
}
