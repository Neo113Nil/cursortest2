package com.stripe.android.financialconnections.lite.repository.model;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes8.dex */
public final class FinancialConnectionsSessionManifest {
    public static final Companion Companion = new Companion();
    public final String cancelUrl;
    public final String hostedAuthUrl;
    public final String successUrl;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-lite_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return FinancialConnectionsSessionManifest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinancialConnectionsSessionManifest(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.cancelUrl = null;
        } else {
            this.cancelUrl = str;
        }
        if ((i & 2) == 0) {
            this.hostedAuthUrl = null;
        } else {
            this.hostedAuthUrl = str2;
        }
        if ((i & 4) == 0) {
            this.successUrl = null;
        } else {
            this.successUrl = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialConnectionsSessionManifest)) {
            return false;
        }
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) obj;
        return Intrinsics.areEqual(this.cancelUrl, financialConnectionsSessionManifest.cancelUrl) && Intrinsics.areEqual(this.hostedAuthUrl, financialConnectionsSessionManifest.hostedAuthUrl) && Intrinsics.areEqual(this.successUrl, financialConnectionsSessionManifest.successUrl);
    }

    public final int hashCode() {
        String str = this.cancelUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hostedAuthUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.successUrl;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FinancialConnectionsSessionManifest(cancelUrl=", this.cancelUrl, ", hostedAuthUrl=", this.hostedAuthUrl, ", successUrl="), this.successUrl, ")");
    }
}
