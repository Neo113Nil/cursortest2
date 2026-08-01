package l0;

import G1.AbstractC0001b;

/* loaded from: classes.dex */
public final class f extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f3254a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f3255b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i, Throwable th) {
        super(th);
        AbstractC0001b.j("callbackName", i);
        this.f3254a = i;
        this.f3255b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f3255b;
    }
}
