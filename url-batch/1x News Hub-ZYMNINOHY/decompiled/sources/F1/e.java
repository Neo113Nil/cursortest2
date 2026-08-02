package F1;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f498a;

    /* renamed from: b, reason: collision with root package name */
    public final String f499b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f500c;

    public e(String str, String str2, int i3) {
        this(str, false, str2, "io.flutter.embedding.android.");
    }

    public e(String str, String str2) {
        this(str, true, str2, "io.flutter.embedding.android.");
    }

    public e(String str, boolean z, String str2, String str3) {
        this.f498a = str;
        this.f499b = str3.concat(str2);
        this.f500c = z;
    }
}
