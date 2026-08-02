package com.squareup.protos.cash.genericelements.ui;

import coil3.request.ViewTargetRequestManagerKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BaseElement$Element$Avatar extends ViewTargetRequestManagerKt {
    public final AvatarElement value;

    public BaseElement$Element$Avatar(AvatarElement avatarElement) {
        avatarElement.getClass();
        this.value = avatarElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseElement$Element$Avatar) && Intrinsics.areEqual(this.value, ((BaseElement$Element$Avatar) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Avatar(value=" + this.value + ")";
    }
}
