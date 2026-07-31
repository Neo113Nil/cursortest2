package I;

/* renamed from: I.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103k extends IllegalStateException {

    /* renamed from: d, reason: collision with root package name */
    public final String f2266d;

    public C0103k(String str) {
        this.f2266d = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f2266d;
    }
}
