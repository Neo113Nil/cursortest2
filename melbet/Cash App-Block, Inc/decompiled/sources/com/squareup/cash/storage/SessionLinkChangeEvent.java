package com.squareup.cash.storage;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface SessionLinkChangeEvent {

    public final class ColdStart implements SessionLinkChangeEvent {
        public final String associatedAccountToken;

        public ColdStart(String str) {
            this.associatedAccountToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ColdStart) && Intrinsics.areEqual(this.associatedAccountToken, ((ColdStart) obj).associatedAccountToken);
        }

        @Override // com.squareup.cash.storage.SessionLinkChangeEvent
        public final String getAssociatedAccountToken() {
            return this.associatedAccountToken;
        }

        public final int hashCode() {
            String str = this.associatedAccountToken;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ColdStart(associatedAccountToken=", this.associatedAccountToken, ")");
        }
    }

    String getAssociatedAccountToken();
}
