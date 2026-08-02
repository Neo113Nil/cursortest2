package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjr;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class HalfSheetMessage$SecondaryNavigationAction$DetailsPageToken extends zzjr {
    public final String value;

    public HalfSheetMessage$SecondaryNavigationAction$DetailsPageToken(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HalfSheetMessage$SecondaryNavigationAction$DetailsPageToken) && Intrinsics.areEqual(this.value, ((HalfSheetMessage$SecondaryNavigationAction$DetailsPageToken) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DetailsPageToken(value=", this.value, ")");
    }
}
