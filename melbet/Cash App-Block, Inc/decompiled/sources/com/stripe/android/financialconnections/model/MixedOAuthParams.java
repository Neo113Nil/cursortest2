package com.stripe.android.financialconnections.model;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class MixedOAuthParams {
    public static final Companion Companion = new Companion();
    public final String code;
    public final String publicToken;
    public final String state;
    public final String status;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/MixedOAuthParams$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/MixedOAuthParams;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return MixedOAuthParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MixedOAuthParams(String str, int i, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            TuplesKt.throwMissingFieldException(i, 15, MixedOAuthParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.state = str;
        this.code = str2;
        this.status = str3;
        this.publicToken = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixedOAuthParams)) {
            return false;
        }
        MixedOAuthParams mixedOAuthParams = (MixedOAuthParams) obj;
        return Intrinsics.areEqual(this.state, mixedOAuthParams.state) && Intrinsics.areEqual(this.code, mixedOAuthParams.code) && Intrinsics.areEqual(this.status, mixedOAuthParams.status) && Intrinsics.areEqual(this.publicToken, mixedOAuthParams.publicToken);
    }

    public final int hashCode() {
        int hashCode = this.state.hashCode() * 31;
        String str = this.code;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.status;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.publicToken;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MixedOAuthParams(state=", this.state, ", code=", this.code, ", status="), this.status, ", publicToken=", this.publicToken, ")");
    }
}
