package coil.util;

import kotlin.jvm.functions.Function0;

/* compiled from: Time.kt */
/* loaded from: classes13.dex */
public final class Time {
    public static final Time INSTANCE = new Time();
    private static Function0 provider = Time$provider$1.INSTANCE;

    private Time() {
    }

    public final long currentMillis() {
        return ((Number) provider.mo4828invoke()).longValue();
    }
}
