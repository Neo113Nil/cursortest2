package com.squareup.protos.multipass.service;

import com.google.android.gms.internal.mlkit_vision_face.zzjo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ClientCredentials$Session$AccessToken extends zzjo {
    public final String value;

    public ClientCredentials$Session$AccessToken(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientCredentials$Session$AccessToken) && Intrinsics.areEqual(this.value, ((ClientCredentials$Session$AccessToken) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccessToken(value=", this.value, ")");
    }
}
