package com.squareup.protos.cash.genericelements.ui;

import coil3.request.ViewTargetRequestManagerKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BaseElement$Element$ArcadeBadgedAvatar extends ViewTargetRequestManagerKt {
    public final ArcadeBadgedAvatarElement value;

    public BaseElement$Element$ArcadeBadgedAvatar(ArcadeBadgedAvatarElement arcadeBadgedAvatarElement) {
        arcadeBadgedAvatarElement.getClass();
        this.value = arcadeBadgedAvatarElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseElement$Element$ArcadeBadgedAvatar) && Intrinsics.areEqual(this.value, ((BaseElement$Element$ArcadeBadgedAvatar) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ArcadeBadgedAvatar(value=" + this.value + ")";
    }
}
