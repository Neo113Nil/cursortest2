package com.squareup.protos.cash.janus.api;

import com.bumptech.glide.module.AppGlideModule;
import com.squareup.protos.cash.janus.api.StartWebAuthnAuthenticationRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class StartWebAuthnAuthenticationRequest$LoginEntity$Customer extends AppGlideModule {
    public final StartWebAuthnAuthenticationRequest.Customer value;

    public StartWebAuthnAuthenticationRequest$LoginEntity$Customer(StartWebAuthnAuthenticationRequest.Customer customer) {
        customer.getClass();
        this.value = customer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StartWebAuthnAuthenticationRequest$LoginEntity$Customer) && Intrinsics.areEqual(this.value, ((StartWebAuthnAuthenticationRequest$LoginEntity$Customer) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Customer(value=" + this.value + ")";
    }
}
