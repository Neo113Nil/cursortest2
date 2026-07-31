package V;

import W4.o;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: f, reason: collision with root package name */
    public final int f2686f;

    /* renamed from: g, reason: collision with root package name */
    public final Throwable f2687g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i7, Throwable th) {
        super(th);
        o.f("callbackName", i7);
        this.f2686f = i7;
        this.f2687g = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f2687g;
    }
}
