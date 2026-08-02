package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjq;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DetailsPageView$PrimaryContent$EmptyContent extends zzjq {
    public final EmptyPrimaryContent value;

    public DetailsPageView$PrimaryContent$EmptyContent(EmptyPrimaryContent emptyPrimaryContent) {
        emptyPrimaryContent.getClass();
        this.value = emptyPrimaryContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DetailsPageView$PrimaryContent$EmptyContent) && Intrinsics.areEqual(this.value, ((DetailsPageView$PrimaryContent$EmptyContent) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EmptyContent(value=" + this.value + ")";
    }
}
