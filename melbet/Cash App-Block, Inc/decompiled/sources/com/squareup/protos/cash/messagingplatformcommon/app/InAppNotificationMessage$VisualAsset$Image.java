package com.squareup.protos.cash.messagingplatformcommon.app;

import com.datadog.android.rum.model.ActionEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InAppNotificationMessage$VisualAsset$Image extends ActionEvent.Usr.Companion {
    public final Image value;

    public InAppNotificationMessage$VisualAsset$Image(Image image) {
        image.getClass();
        this.value = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppNotificationMessage$VisualAsset$Image) && Intrinsics.areEqual(this.value, ((InAppNotificationMessage$VisualAsset$Image) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Image(value=" + this.value + ")";
    }
}
