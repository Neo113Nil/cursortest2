package com.squareup.protos.cash.messagingplatformcommon.app;

import com.datadog.android.rum.model.ActionEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardMessage$VisualAsset$Animation extends ActionEvent.Os.Companion {
    public final Animation value;

    public CardMessage$VisualAsset$Animation(Animation animation) {
        animation.getClass();
        this.value = animation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardMessage$VisualAsset$Animation) && Intrinsics.areEqual(this.value, ((CardMessage$VisualAsset$Animation) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Animation(value=" + this.value + ")";
    }
}
