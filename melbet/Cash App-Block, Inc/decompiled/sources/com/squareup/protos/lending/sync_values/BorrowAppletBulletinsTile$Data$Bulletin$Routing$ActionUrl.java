package com.squareup.protos.lending.sync_values;

import com.google.android.gms.internal.mlkit_vision_face.zzjg;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl extends zzjg {
    public final String value;

    public BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl) && Intrinsics.areEqual(this.value, ((BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActionUrl(value=", this.value, ")");
    }
}
