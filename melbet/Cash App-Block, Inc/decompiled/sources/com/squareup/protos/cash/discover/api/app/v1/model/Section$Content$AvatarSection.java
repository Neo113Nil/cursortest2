package com.squareup.protos.cash.discover.api.app.v1.model;

import coil3.Uri_androidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Section$Content$AvatarSection extends Uri_androidKt {
    public final AvatarSection value;

    public Section$Content$AvatarSection(AvatarSection avatarSection) {
        avatarSection.getClass();
        this.value = avatarSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Section$Content$AvatarSection) && Intrinsics.areEqual(this.value, ((Section$Content$AvatarSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AvatarSection(value=" + this.value + ")";
    }
}
