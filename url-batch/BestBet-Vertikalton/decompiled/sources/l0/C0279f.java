package l0;

import G1.AbstractC0001b;

/* renamed from: l0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279f extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f3516a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f3517b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0279f(int i, Throwable th) {
        super(th);
        AbstractC0001b.j("callbackName", i);
        this.f3516a = i;
        this.f3517b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f3517b;
    }
}
