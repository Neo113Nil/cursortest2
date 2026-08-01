package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ar extends RuntimeException {
    public final br f;
    public final Throwable g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(br brVar, Throwable th) {
        super(th);
        brVar.getClass();
        this.f = brVar;
        this.g = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.g;
    }
}
