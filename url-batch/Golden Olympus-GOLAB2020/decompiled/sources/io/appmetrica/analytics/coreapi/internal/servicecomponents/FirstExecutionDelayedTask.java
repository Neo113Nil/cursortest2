package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import kotlin.Metadata;

@Metadata
/* loaded from: classes3.dex */
public interface FirstExecutionDelayedTask {
    void setInitialDelaySeconds(long j4);

    boolean tryExecute(long j4);
}
