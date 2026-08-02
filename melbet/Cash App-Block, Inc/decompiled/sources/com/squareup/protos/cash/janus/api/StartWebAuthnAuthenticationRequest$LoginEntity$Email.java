package com.squareup.protos.cash.janus.api;

import com.bumptech.glide.module.AppGlideModule;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class StartWebAuthnAuthenticationRequest$LoginEntity$Email extends AppGlideModule {
    public final String value;

    public StartWebAuthnAuthenticationRequest$LoginEntity$Email(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StartWebAuthnAuthenticationRequest$LoginEntity$Email) && Intrinsics.areEqual(this.value, ((StartWebAuthnAuthenticationRequest$LoginEntity$Email) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Email(value=", this.value, ")");
    }
}
