package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public final class DefaultResponseValidityChecker implements ResponseValidityChecker {
    @Override // io.appmetrica.analytics.networktasks.internal.ResponseValidityChecker
    public boolean isResponseValid(int i4) {
        return (i4 == 400 || i4 == 500) ? false : true;
    }
}
