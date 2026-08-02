package io.reactivex.rxjava3.internal.schedulers;

import com.google.common.primitives.Longs;

/* loaded from: classes9.dex */
public abstract class SchedulerPoolFactory {
    public static final boolean PURGE_ENABLED;

    static {
        boolean z = true;
        try {
            String property = System.getProperty("rx3.purge-enabled");
            if (property != null) {
                z = "true".equals(property);
            }
        } catch (Throwable th) {
            Longs.throwIfFatal(th);
        }
        PURGE_ENABLED = z;
    }
}
