package E3;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f632a;

    /* renamed from: b, reason: collision with root package name */
    public final String f633b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f634c;

    public e(String str, int i7, String str2) {
        this(str, str2, "io.flutter.embedding.android.", false);
    }

    public e(String str, String str2) {
        this(str, str2, "io.flutter.embedding.android.", true);
    }

    public e(String str, String str2, String str3, boolean z5) {
        this.f632a = str;
        this.f633b = str3.concat(str2);
        this.f634c = z5;
    }
}
