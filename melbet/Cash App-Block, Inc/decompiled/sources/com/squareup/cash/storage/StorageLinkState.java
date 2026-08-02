package com.squareup.cash.storage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class StorageLinkState {
    public final SessionLinkChangeEvent event;
    public final StorageLink link;

    public StorageLinkState(StorageLink storageLink, SessionLinkChangeEvent sessionLinkChangeEvent) {
        storageLink.getClass();
        this.link = storageLink;
        this.event = sessionLinkChangeEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageLinkState)) {
            return false;
        }
        StorageLinkState storageLinkState = (StorageLinkState) obj;
        return Intrinsics.areEqual(this.link, storageLinkState.link) && this.event.equals(storageLinkState.event);
    }

    public final int hashCode() {
        return this.event.hashCode() + (this.link.hashCode() * 31);
    }

    public final String toString() {
        return "StorageLinkState(link=" + this.link + ", event=" + this.event + ")";
    }
}
