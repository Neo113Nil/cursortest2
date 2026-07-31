package w1;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final int f8585d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f8586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i3, Throwable th) {
        super(th);
        AbstractC0080b.s("callbackName", i3);
        this.f8585d = i3;
        this.f8586e = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f8586e;
    }
}
