package u0;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8064a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8065b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8066c;

    /* renamed from: d, reason: collision with root package name */
    public final t f8067d;

    public u(String str, String str2, boolean z7, t tVar) {
        if (str2.isEmpty() || str2.charAt(0) != '/') {
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }
        if (!str2.endsWith("/")) {
            throw new IllegalArgumentException("Path should end with a slash '/'");
        }
        this.f8065b = str;
        this.f8066c = str2;
        this.f8064a = z7;
        this.f8067d = tVar;
    }
}
