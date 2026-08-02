package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import com.google.android.gms.internal.mlkit_vision_common.zzjy;
import com.squareup.protos.cash.localization.LocalizableString;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Variable$Message$LocalizableString extends zzjy {
    public final LocalizableString value;

    public Variable$Message$LocalizableString(LocalizableString localizableString) {
        localizableString.getClass();
        this.value = localizableString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Variable$Message$LocalizableString) && Intrinsics.areEqual(this.value, ((Variable$Message$LocalizableString) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LocalizableString(value=" + this.value + ")";
    }
}
