package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class gl {
    private static final /* synthetic */ hn $ENTRIES;
    private static final /* synthetic */ gl[] $VALUES;
    private final TimeUnit timeUnit;
    public static final gl NANOSECONDS = new gl("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final gl MICROSECONDS = new gl("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final gl MILLISECONDS = new gl("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final gl SECONDS = new gl("SECONDS", 3, TimeUnit.SECONDS);
    public static final gl MINUTES = new gl("MINUTES", 4, TimeUnit.MINUTES);
    public static final gl HOURS = new gl("HOURS", 5, TimeUnit.HOURS);
    public static final gl DAYS = new gl("DAYS", 6, TimeUnit.DAYS);

    private static final /* synthetic */ gl[] $values() {
        return new gl[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    static {
        gl[] $values = $values();
        $VALUES = $values;
        $ENTRIES = n9.k($values);
    }

    private gl(String str, int i, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static hn getEntries() {
        return $ENTRIES;
    }

    public static gl valueOf(String str) {
        return (gl) Enum.valueOf(gl.class, str);
    }

    public static gl[] values() {
        return (gl[]) $VALUES.clone();
    }

    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
