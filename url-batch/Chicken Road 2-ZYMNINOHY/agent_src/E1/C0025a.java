package E1;

/* renamed from: E1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f562a;

    /* renamed from: b, reason: collision with root package name */
    public String f563b;

    /* renamed from: c, reason: collision with root package name */
    public String f564c;

    public C0049z a() {
        if ("first_party".equals(this.f564c)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        }
        if (this.f563b == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        }
        if (this.f564c != null) {
            return new C0049z(this);
        }
        throw new IllegalArgumentException("Product type must be provided.");
    }

    public String toString() {
        switch (this.f562a) {
            case 2:
                return this.f563b + ", " + this.f564c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0025a(String str, String str2, int i4) {
        this.f562a = i4;
        this.f563b = str;
        this.f564c = str2;
    }
}
