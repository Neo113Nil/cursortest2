package f0;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f302a;

    /* renamed from: b, reason: collision with root package name */
    public final String f303b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f304c;

    public f(String str, String str2, String str3, boolean z2) {
        this.f302a = str;
        this.f303b = str3.concat(str2);
        this.f304c = z2;
    }

    public f(String str, String str2) {
        this(str, str2, "io.flutter.embedding.android.", true);
    }

    public f(int i2, String str, String str2) {
        this(str, str2, "io.flutter.embedding.android.", false);
    }
}
