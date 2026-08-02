package kotlin.time;

/* loaded from: classes3.dex */
public interface Clock {

    public final class System implements Clock {
        public static final System INSTANCE = new System();

        @Override // kotlin.time.Clock
        public final Instant now() {
            return InstantJvmKt.systemClockNow();
        }
    }

    Instant now();
}
