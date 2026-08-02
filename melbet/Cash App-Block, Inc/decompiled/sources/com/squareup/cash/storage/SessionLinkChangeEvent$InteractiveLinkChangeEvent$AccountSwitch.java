package com.squareup.cash.storage;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class SessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch implements SessionLinkChangeEvent {
    public final String associatedAccountToken;

    public SessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch(String str) {
        this.associatedAccountToken = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch) && this.associatedAccountToken.equals(((SessionLinkChangeEvent$InteractiveLinkChangeEvent$AccountSwitch) obj).associatedAccountToken);
    }

    @Override // com.squareup.cash.storage.SessionLinkChangeEvent
    public final String getAssociatedAccountToken() {
        return this.associatedAccountToken;
    }

    public final int hashCode() {
        return this.associatedAccountToken.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountSwitch(associatedAccountToken=", this.associatedAccountToken, ")");
    }
}
