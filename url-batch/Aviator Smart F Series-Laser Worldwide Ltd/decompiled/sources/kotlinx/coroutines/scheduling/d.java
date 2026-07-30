package kotlinx.coroutines.scheduling;

/* loaded from: classes5.dex */
public final class d extends f {
    public static final d INSTANCE = new d();

    private d() {
    }

    @Override // kotlinx.coroutines.scheduling.f
    public long nanoTime() {
        return System.nanoTime();
    }
}
