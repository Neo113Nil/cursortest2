package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;
import defpackage.kt2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
class GetIdListener implements StateListener {
    final kt2 taskCompletionSource;

    public GetIdListener(kt2 kt2Var) {
        this.taskCompletionSource = kt2Var;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isUnregistered() && !persistedInstallationEntry.isRegistered() && !persistedInstallationEntry.isErrored()) {
            return false;
        }
        this.taskCompletionSource.c(persistedInstallationEntry.getFirebaseInstallationId());
        return true;
    }
}
