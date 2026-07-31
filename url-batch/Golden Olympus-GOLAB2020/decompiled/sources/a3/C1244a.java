package a3;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1244a extends IllegalStateException {

    /* renamed from: b, reason: collision with root package name */
    private Throwable f9769b;

    C1244a(String str, Throwable th) {
        super(str);
        this.f9769b = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f9769b;
    }
}
