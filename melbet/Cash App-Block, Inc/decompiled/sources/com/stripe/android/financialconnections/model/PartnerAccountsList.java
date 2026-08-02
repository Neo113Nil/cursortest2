package com.stripe.android.financialconnections.model;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.model.ConsumerSession$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class PartnerAccountsList {
    public final List data;
    public final FinancialConnectionsSessionManifest.Pane nextPane;
    public final Boolean skipAccountSelection;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConsumerSession$$ExternalSyntheticLambda0(13)), null, null};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/PartnerAccountsList$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return PartnerAccountsList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PartnerAccountsList(int i, List list, FinancialConnectionsSessionManifest.Pane pane, Boolean bool) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, PartnerAccountsList$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.data = list;
        this.nextPane = pane;
        if ((i & 4) == 0) {
            this.skipAccountSelection = null;
        } else {
            this.skipAccountSelection = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartnerAccountsList)) {
            return false;
        }
        PartnerAccountsList partnerAccountsList = (PartnerAccountsList) obj;
        return Intrinsics.areEqual(this.data, partnerAccountsList.data) && this.nextPane == partnerAccountsList.nextPane && Intrinsics.areEqual(this.skipAccountSelection, partnerAccountsList.skipAccountSelection);
    }

    public final int hashCode() {
        int hashCode = (this.nextPane.hashCode() + (this.data.hashCode() * 31)) * 31;
        Boolean bool = this.skipAccountSelection;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnerAccountsList(data=");
        sb.append(this.data);
        sb.append(", nextPane=");
        sb.append(this.nextPane);
        sb.append(", skipAccountSelection=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.skipAccountSelection, ")");
    }
}
