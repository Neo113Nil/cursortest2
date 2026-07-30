package i4;

/* renamed from: i4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548d {

    /* renamed from: a, reason: collision with root package name */
    public final String f5524a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5525b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5526c;

    public C0548d(int i2, String str, String str2) {
        this(str, str2, "io.flutter.embedding.android.", false);
    }

    public C0548d(String str, String str2) {
        this(str, str2, "io.flutter.embedding.android.", true);
    }

    public C0548d(String str, String str2, String str3, boolean z7) {
        this.f5524a = str;
        this.f5525b = str3.concat(str2);
        this.f5526c = z7;
    }
}
