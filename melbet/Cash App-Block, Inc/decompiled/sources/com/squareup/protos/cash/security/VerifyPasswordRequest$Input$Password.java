package com.squareup.protos.cash.security;

import com.google.android.gms.internal.mlkit_vision_common.zzkp;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class VerifyPasswordRequest$Input$Password extends zzkp {
    public final String value;

    public VerifyPasswordRequest$Input$Password(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerifyPasswordRequest$Input$Password) && Intrinsics.areEqual(this.value, ((VerifyPasswordRequest$Input$Password) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Password(value=", this.value, ")");
    }
}
