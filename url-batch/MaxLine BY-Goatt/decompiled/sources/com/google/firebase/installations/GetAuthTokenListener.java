package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;
import defpackage.kt2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
class GetAuthTokenListener implements StateListener {
    private final kt2 resultTaskCompletionSource;
    private final Utils utils;

    public GetAuthTokenListener(Utils utils, kt2 kt2Var) {
        this.utils = utils;
        this.resultTaskCompletionSource = kt2Var;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(Exception exc) {
        this.resultTaskCompletionSource.b(exc);
        return true;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isRegistered() || this.utils.isAuthTokenExpired(persistedInstallationEntry)) {
            return false;
        }
        this.resultTaskCompletionSource.a(InstallationTokenResult.builder().setToken(persistedInstallationEntry.getAuthToken()).setTokenExpirationTimestamp(persistedInstallationEntry.getExpiresInSecs()).setTokenCreationTimestamp(persistedInstallationEntry.getTokenCreationEpochInSecs()).build());
        return true;
    }
}
