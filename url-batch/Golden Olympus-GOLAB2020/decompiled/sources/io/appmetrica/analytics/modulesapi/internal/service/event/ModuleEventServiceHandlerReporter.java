package io.appmetrica.analytics.modulesapi.internal.service.event;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface ModuleEventServiceHandlerReporter {
    boolean isMain();

    void report(@NotNull CounterReportApi counterReportApi);
}
