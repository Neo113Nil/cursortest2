package com.stripe.android.financialconnections.lite.repository.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class SynchronizeSessionResponse {
    public static final Companion Companion = new Companion();
    public final FinancialConnectionsSessionManifest manifest;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-lite_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return SynchronizeSessionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SynchronizeSessionResponse(int i, FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        if (1 == (i & 1)) {
            this.manifest = financialConnectionsSessionManifest;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, SynchronizeSessionResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SynchronizeSessionResponse) && Intrinsics.areEqual(this.manifest, ((SynchronizeSessionResponse) obj).manifest);
    }

    public final int hashCode() {
        return this.manifest.hashCode();
    }

    public final String toString() {
        return "SynchronizeSessionResponse(manifest=" + this.manifest + ")";
    }
}
