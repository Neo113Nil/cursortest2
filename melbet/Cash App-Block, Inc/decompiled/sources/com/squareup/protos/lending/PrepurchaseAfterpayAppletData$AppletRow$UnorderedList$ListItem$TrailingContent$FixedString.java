package com.squareup.protos.lending;

import com.google.android.gms.internal.mlkit_vision_face.zzjc;
import com.squareup.protos.cash.localization.LocalizedString;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$TrailingContent$FixedString extends zzjc {
    public final LocalizedString value;

    public PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$TrailingContent$FixedString(LocalizedString localizedString) {
        localizedString.getClass();
        this.value = localizedString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$TrailingContent$FixedString) && Intrinsics.areEqual(this.value, ((PrepurchaseAfterpayAppletData$AppletRow$UnorderedList$ListItem$TrailingContent$FixedString) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "FixedString(value=" + this.value + ")";
    }
}
