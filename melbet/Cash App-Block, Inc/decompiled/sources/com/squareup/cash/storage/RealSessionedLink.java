package com.squareup.cash.storage;

import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.storage.StorageLink;
import com.squareup.util.cash.Countries;
import dev.zacsweers.metro.Provider;
import papa.internal.AppUpdateDetector$$ExternalSyntheticLambda0;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealSessionedLink {
    public final AppUpdateDetector$$ExternalSyntheticLambda0 checkAndResetForceLegacy;
    public final RealSandboxer sandboxer;
    public final SessionQueries storageLinkQueries;

    public final class MetroFactory {
        public final Provider sandboxer;
    }

    public RealSessionedLink(RealSandboxer realSandboxer, SessionQueries sessionQueries, AppUpdateDetector$$ExternalSyntheticLambda0 appUpdateDetector$$ExternalSyntheticLambda0) {
        sessionQueries.getClass();
        this.sandboxer = realSandboxer;
        this.storageLinkQueries = sessionQueries;
        this.checkAndResetForceLegacy = appUpdateDetector$$ExternalSyntheticLambda0;
    }

    public final StorageLink getActiveLink() {
        StorageLink rawActiveLink = Countries.getRawActiveLink(this.storageLinkQueries);
        if (rawActiveLink != null) {
            return rawActiveLink;
        }
        Timber.Forest.e("Invariant violation: active link is null", new Object[0]);
        return StorageLink.Legacy.INSTANCE;
    }
}
