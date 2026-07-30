package o5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: f, reason: collision with root package name */
    public long f6848f;

    public long a() {
        return Math.max(0L, this.f6848f - System.nanoTime());
    }

    @Override // o5.a
    public long millis() {
        return System.currentTimeMillis() + this.f6848f;
    }
}
