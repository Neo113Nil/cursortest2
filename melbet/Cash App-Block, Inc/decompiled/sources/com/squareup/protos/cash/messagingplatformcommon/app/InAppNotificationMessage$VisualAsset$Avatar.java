package com.squareup.protos.cash.messagingplatformcommon.app;

import com.datadog.android.rum.model.ActionEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InAppNotificationMessage$VisualAsset$Avatar extends ActionEvent.Usr.Companion {
    public final Image value;

    public InAppNotificationMessage$VisualAsset$Avatar(Image image) {
        image.getClass();
        this.value = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppNotificationMessage$VisualAsset$Avatar) && Intrinsics.areEqual(this.value, ((InAppNotificationMessage$VisualAsset$Avatar) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Avatar(value=" + this.value + ")";
    }
}
