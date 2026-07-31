package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;

/* loaded from: classes.dex */
public final class TransportRuntime_Factory implements Factory<TransportRuntime> {
    private final V1.a eventClockProvider;
    private final V1.a initializerProvider;
    private final V1.a schedulerProvider;
    private final V1.a uploaderProvider;
    private final V1.a uptimeClockProvider;

    public TransportRuntime_Factory(V1.a aVar, V1.a aVar2, V1.a aVar3, V1.a aVar4, V1.a aVar5) {
        this.eventClockProvider = aVar;
        this.uptimeClockProvider = aVar2;
        this.schedulerProvider = aVar3;
        this.uploaderProvider = aVar4;
        this.initializerProvider = aVar5;
    }

    public static TransportRuntime_Factory create(V1.a aVar, V1.a aVar2, V1.a aVar3, V1.a aVar4, V1.a aVar5) {
        return new TransportRuntime_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static TransportRuntime newInstance(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        return new TransportRuntime(clock, clock2, scheduler, uploader, workInitializer);
    }

    @Override // V1.a
    public TransportRuntime get() {
        return newInstance((Clock) this.eventClockProvider.get(), (Clock) this.uptimeClockProvider.get(), (Scheduler) this.schedulerProvider.get(), (Uploader) this.uploaderProvider.get(), (WorkInitializer) this.initializerProvider.get());
    }
}
