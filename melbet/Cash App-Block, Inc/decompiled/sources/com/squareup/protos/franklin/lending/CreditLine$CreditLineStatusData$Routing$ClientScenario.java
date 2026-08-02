package com.squareup.protos.franklin.lending;

import com.google.android.gms.internal.mlkit_vision_face.zzeb;
import com.squareup.protos.franklin.api.ClientScenario;

/* loaded from: classes8.dex */
public final class CreditLine$CreditLineStatusData$Routing$ClientScenario extends zzeb {
    public final ClientScenario value;

    public CreditLine$CreditLineStatusData$Routing$ClientScenario(ClientScenario clientScenario) {
        clientScenario.getClass();
        this.value = clientScenario;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreditLine$CreditLineStatusData$Routing$ClientScenario) && this.value == ((CreditLine$CreditLineStatusData$Routing$ClientScenario) obj).value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ClientScenario(value=" + this.value + ")";
    }
}
