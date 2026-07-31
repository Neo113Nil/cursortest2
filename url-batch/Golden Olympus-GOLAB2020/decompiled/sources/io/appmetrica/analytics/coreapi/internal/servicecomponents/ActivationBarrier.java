package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface ActivationBarrier {
    void subscribe(long j4, @NotNull ICommonExecutor iCommonExecutor, @NotNull ActivationBarrierCallback activationBarrierCallback);
}
