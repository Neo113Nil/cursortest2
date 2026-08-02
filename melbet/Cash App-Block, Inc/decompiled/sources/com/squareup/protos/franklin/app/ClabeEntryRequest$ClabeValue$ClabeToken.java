package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdc;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ClabeEntryRequest$ClabeValue$ClabeToken extends zzdc {
    public final String value;

    public ClabeEntryRequest$ClabeValue$ClabeToken(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClabeEntryRequest$ClabeValue$ClabeToken) && Intrinsics.areEqual(this.value, ((ClabeEntryRequest$ClabeValue$ClabeToken) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClabeToken(value=", this.value, ")");
    }
}
