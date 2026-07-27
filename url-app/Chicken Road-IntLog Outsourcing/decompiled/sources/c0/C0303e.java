package c0;

import b2.AbstractC0279e;

/* renamed from: c0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f4874a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f4875b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0303e(int i2, Throwable th) {
        super(th);
        AbstractC0279e.k(i2, "callbackName");
        this.f4874a = i2;
        this.f4875b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f4875b;
    }
}
