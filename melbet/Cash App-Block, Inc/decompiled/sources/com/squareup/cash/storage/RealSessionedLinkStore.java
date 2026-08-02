package com.squareup.cash.storage;

import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAppDatabaseImpl;
import com.squareup.preferences.KeyValue;

/* loaded from: classes.dex */
public final class RealSessionedLinkStore implements SessionedLink$Store {
    public final KeyValue persistedStorageLink;
    public final RealSessionedLink$Factory$Impl sessionedLinkFactory;
    public final SessionQueries storageLinkQueries;

    public RealSessionedLinkStore(CashAppDatabaseImpl cashAppDatabaseImpl, RealSessionedLink$Factory$Impl realSessionedLink$Factory$Impl, KeyValue keyValue) {
        this.sessionedLinkFactory = realSessionedLink$Factory$Impl;
        this.persistedStorageLink = keyValue;
        this.storageLinkQueries = cashAppDatabaseImpl.storageLinkQueries;
    }
}
