package d0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f1817a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1818b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1819c;

    public e(int i2, String str, String str2) {
        this(str, str2, "io.flutter.embedding.android.", false);
    }

    public e(String str, String str2) {
        this(str, str2, "io.flutter.embedding.android.", true);
    }

    public e(String str, String str2, String str3, boolean z2) {
        this.f1817a = str;
        this.f1818b = str3.concat(str2);
        this.f1819c = z2;
    }
}
