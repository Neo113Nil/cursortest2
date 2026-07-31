package a3;

/* renamed from: a3.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1246c extends IllegalStateException {

    /* renamed from: b, reason: collision with root package name */
    private Throwable f9770b;

    C1246c(String str, Throwable th) {
        super(str);
        this.f9770b = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f9770b;
    }
}
