package M4;

/* loaded from: classes.dex */
public final class g extends Throwable {

    /* renamed from: d, reason: collision with root package name */
    public final String f1748d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1749e;

    /* renamed from: i, reason: collision with root package name */
    public final a f1750i;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f1751l;

    public g(a aVar) {
        super("Thread [" + Thread.currentThread().getName() + "] opened scope for " + aVar + " here:");
        this.f1748d = Thread.currentThread().getName();
        this.f1749e = Thread.currentThread().getId();
        this.f1750i = aVar;
    }
}
