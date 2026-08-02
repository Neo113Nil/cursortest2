package io.appmetrica.analytics.coreapi.internal.servicecomponents;

/* loaded from: classes.dex */
public interface FirstExecutionDelayedTask {
    void setInitialDelaySeconds(long j4);

    boolean tryExecute(long j4);
}
