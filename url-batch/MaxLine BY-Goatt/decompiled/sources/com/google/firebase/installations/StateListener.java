package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
interface StateListener {
    boolean onException(Exception exc);

    boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry);
}
