package com.stripe.android.financialconnections.model;

import com.stripe.android.model.ConsumerSession$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class InstitutionResponse {
    public final List data;
    public final Boolean showManualEntry;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConsumerSession$$ExternalSyntheticLambda0(3))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/InstitutionResponse$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return InstitutionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InstitutionResponse(int i, Boolean bool, List list) {
        if (2 != (i & 2)) {
            TuplesKt.throwMissingFieldException(i, 2, InstitutionResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.showManualEntry = Boolean.FALSE;
        } else {
            this.showManualEntry = bool;
        }
        this.data = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstitutionResponse)) {
            return false;
        }
        InstitutionResponse institutionResponse = (InstitutionResponse) obj;
        return Intrinsics.areEqual(this.showManualEntry, institutionResponse.showManualEntry) && Intrinsics.areEqual(this.data, institutionResponse.data);
    }

    public final int hashCode() {
        Boolean bool = this.showManualEntry;
        return this.data.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
    }

    public final String toString() {
        return "InstitutionResponse(showManualEntry=" + this.showManualEntry + ", data=" + this.data + ")";
    }

    public InstitutionResponse(Boolean bool, EmptyList emptyList) {
        emptyList.getClass();
        this.showManualEntry = bool;
        this.data = emptyList;
    }
}
