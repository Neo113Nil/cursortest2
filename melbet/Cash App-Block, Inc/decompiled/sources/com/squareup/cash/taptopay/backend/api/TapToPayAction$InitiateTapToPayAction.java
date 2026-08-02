package com.squareup.cash.taptopay.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TapToPayAction$InitiateTapToPayAction {
    public final String externalId;

    public TapToPayAction$InitiateTapToPayAction(String str) {
        str.getClass();
        this.externalId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TapToPayAction$InitiateTapToPayAction) && Intrinsics.areEqual(this.externalId, ((TapToPayAction$InitiateTapToPayAction) obj).externalId);
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final int hashCode() {
        return this.externalId.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InitiateTapToPayAction(externalId=", this.externalId, ")");
    }
}
