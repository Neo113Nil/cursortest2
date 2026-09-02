package f4;

/* renamed from: f4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380g extends Throwable {

    /* renamed from: f, reason: collision with root package name */
    public final String f4228f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4229g;

    /* renamed from: h, reason: collision with root package name */
    public final C0374a f4230h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f4231i;

    public C0380g(C0374a c0374a) {
        super("Thread [" + Thread.currentThread().getName() + "] opened scope for " + c0374a + " here:");
        this.f4228f = Thread.currentThread().getName();
        this.f4229g = Thread.currentThread().getId();
        this.f4230h = c0374a;
    }
}
