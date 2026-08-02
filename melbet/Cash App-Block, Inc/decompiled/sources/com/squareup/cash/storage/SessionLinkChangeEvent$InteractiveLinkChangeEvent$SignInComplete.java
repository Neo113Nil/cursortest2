package com.squareup.cash.storage;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class SessionLinkChangeEvent$InteractiveLinkChangeEvent$SignInComplete implements SessionLinkChangeEvent {
    public final String associatedAccountToken;

    public SessionLinkChangeEvent$InteractiveLinkChangeEvent$SignInComplete(String str) {
        this.associatedAccountToken = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SessionLinkChangeEvent$InteractiveLinkChangeEvent$SignInComplete) && this.associatedAccountToken.equals(((SessionLinkChangeEvent$InteractiveLinkChangeEvent$SignInComplete) obj).associatedAccountToken);
    }

    @Override // com.squareup.cash.storage.SessionLinkChangeEvent
    public final String getAssociatedAccountToken() {
        return this.associatedAccountToken;
    }

    public final int hashCode() {
        return this.associatedAccountToken.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SignInComplete(associatedAccountToken=", this.associatedAccountToken, ")");
    }
}
