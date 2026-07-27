package a3;

/* renamed from: a3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188g extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final String f3864a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3865b;

    /* renamed from: c, reason: collision with root package name */
    public final C0182a f3866c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f3867d;

    public C0188g(C0182a c0182a) {
        super("Thread [" + Thread.currentThread().getName() + "] opened scope for " + c0182a + " here:");
        this.f3864a = Thread.currentThread().getName();
        this.f3865b = Thread.currentThread().getId();
        this.f3866c = c0182a;
    }
}
