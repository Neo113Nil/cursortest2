package c4;

import java.util.Objects;

/* loaded from: classes.dex */
final class p1 extends l1 {

    /* renamed from: b, reason: collision with root package name */
    private final o1 f2071b = new o1();

    p1() {
    }

    @Override // c4.l1
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
        this.f2071b.a(th, true).add(th2);
    }
}
