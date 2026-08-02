package io.appmetrica.analytics.coreapi.internal.servicecomponents;

/* loaded from: classes.dex */
public interface FirstExecutionDelayedTask {
    void setInitialDelaySeconds(long j3);

    boolean tryExecute(long j3);
}
