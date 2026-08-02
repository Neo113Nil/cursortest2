package com.stripe.android.core.utils;

import android.os.SystemClock;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.utils.DurationProvider;
import java.util.LinkedHashMap;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes8.dex */
public final class DefaultDurationProvider implements DurationProvider {
    public static final DefaultDurationProvider instance = new DefaultDurationProvider();
    public final Logger$Companion$NOOP_LOGGER$1 logger = Logger$Companion.NOOP_LOGGER;
    public final LinkedHashMap store = new LinkedHashMap();

    /* renamed from: end-LV8wdWc, reason: not valid java name */
    public final Duration m4011endLV8wdWc(DurationProvider.Key key) {
        Long l = (Long) this.store.remove(key);
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        long uptimeMillis = SystemClock.uptimeMillis();
        key.name();
        this.logger.getClass();
        Duration.Companion companion = Duration.Companion;
        return new Duration(DurationKt.toDuration(uptimeMillis - longValue, DurationUnit.MILLISECONDS));
    }
}
