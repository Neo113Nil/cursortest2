package com.google.android.datatransport.runtime.scheduling;

import V1.a;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;

/* loaded from: classes.dex */
public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {
    private final a clockProvider;

    public SchedulingConfigModule_ConfigFactory(a aVar) {
        this.clockProvider = aVar;
    }

    public static SchedulerConfig config(Clock clock) {
        return (SchedulerConfig) Preconditions.checkNotNull(SchedulingConfigModule.config(clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static SchedulingConfigModule_ConfigFactory create(a aVar) {
        return new SchedulingConfigModule_ConfigFactory(aVar);
    }

    @Override // V1.a
    public SchedulerConfig get() {
        return config((Clock) this.clockProvider.get());
    }
}
