package n0;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1139a {

    /* renamed from: a, reason: collision with root package name */
    public String f10052a;

    /* renamed from: b, reason: collision with root package name */
    public String f10053b;

    public C1157s a() {
        if ("first_party".equals(this.f10053b)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        }
        if (this.f10052a == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        }
        if (this.f10053b != null) {
            return new C1157s(this);
        }
        throw new IllegalArgumentException("Product type must be provided.");
    }
}
