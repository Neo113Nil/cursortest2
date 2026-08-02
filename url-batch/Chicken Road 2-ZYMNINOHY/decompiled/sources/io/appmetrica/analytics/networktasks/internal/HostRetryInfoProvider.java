package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public interface HostRetryInfoProvider {
    long getLastAttemptTimeSeconds();

    int getNextSendAttemptNumber();

    void saveLastAttemptTimeSeconds(long j4);

    void saveNextSendAttemptNumber(int i4);
}
