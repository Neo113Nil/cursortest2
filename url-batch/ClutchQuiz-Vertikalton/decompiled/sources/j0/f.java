package j0;

import X.V;

/* loaded from: classes.dex */
public final class f extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f2655a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f2656b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i, Throwable th) {
        super(th);
        V.g("callbackName", i);
        this.f2655a = i;
        this.f2656b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f2656b;
    }
}
