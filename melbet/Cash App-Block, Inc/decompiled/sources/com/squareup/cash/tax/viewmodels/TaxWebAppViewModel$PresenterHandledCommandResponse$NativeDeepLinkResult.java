package com.squareup.cash.tax.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TaxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult implements TaxBridgeCommand {
    public final String eventId;
    public final boolean isHandled;

    public TaxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult(String str, boolean z) {
        str.getClass();
        this.eventId = str;
        this.isHandled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult)) {
            return false;
        }
        TaxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult taxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult = (TaxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult) obj;
        return Intrinsics.areEqual(this.eventId, taxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult.eventId) && this.isHandled == taxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult.isHandled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isHandled) + (this.eventId.hashCode() * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("NativeDeepLinkResult(eventId=", this.eventId, ", isHandled=", ")", this.isHandled);
    }
}
