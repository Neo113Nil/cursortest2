package com.squareup.protos.cash.messagingplatformcommon.app;

import com.datadog.android.rum.model.ActionEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InAppNotificationMessage$VisualAsset$AssetUrl extends ActionEvent.Usr.Companion {
    public final String value;

    public InAppNotificationMessage$VisualAsset$AssetUrl(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppNotificationMessage$VisualAsset$AssetUrl) && Intrinsics.areEqual(this.value, ((InAppNotificationMessage$VisualAsset$AssetUrl) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssetUrl(value=", this.value, ")");
    }
}
