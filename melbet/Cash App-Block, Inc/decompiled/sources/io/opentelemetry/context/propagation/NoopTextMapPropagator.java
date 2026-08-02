package io.opentelemetry.context.propagation;

/* loaded from: classes9.dex */
public final class NoopTextMapPropagator {
    public final /* synthetic */ int $r8$classId;
    public static final NoopTextMapPropagator NOOP = new NoopTextMapPropagator(1);
    public static final NoopTextMapPropagator INSTANCE = new NoopTextMapPropagator(0);

    public /* synthetic */ NoopTextMapPropagator(int i) {
        this.$r8$classId = i;
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "NoopTextMapPropagator";
            default:
                return "DefaultContextPropagators{textMapPropagator=" + INSTANCE + "}";
        }
    }
}
