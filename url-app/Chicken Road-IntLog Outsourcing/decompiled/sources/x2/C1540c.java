package x2;

/* renamed from: x2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1540c {

    /* renamed from: a, reason: collision with root package name */
    public final String f12271a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12272b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12273c;

    public C1540c(String str, String str2, int i2) {
        this(str, str2, "io.flutter.embedding.android.", false);
    }

    public C1540c(String str, String str2) {
        this(str, str2, "io.flutter.embedding.android.", true);
    }

    public C1540c(String str, String str2, String str3, boolean z) {
        this.f12271a = str;
        this.f12272b = str3.concat(str2);
        this.f12273c = z;
    }
}
