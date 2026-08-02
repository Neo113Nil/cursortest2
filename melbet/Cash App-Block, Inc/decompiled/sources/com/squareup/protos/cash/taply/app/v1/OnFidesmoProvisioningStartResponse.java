package com.squareup.protos.cash.taply.app.v1;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/taply/app/v1/OnFidesmoProvisioningStartResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/ui/SplitButtons$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OnFidesmoProvisioningStartResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OnFidesmoProvisioningStartResponse> CREATOR;
    public final ProvisioningEligibility provisioning_eligibility;
    public final ResponseContext response_context;

    static {
        OnFidesmoProvisioningStartResponse$Companion$ADAPTER$1 onFidesmoProvisioningStartResponse$Companion$ADAPTER$1 = new OnFidesmoProvisioningStartResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OnFidesmoProvisioningStartResponse.class), "type.googleapis.com/squareup.cash.taply.app.v1beta1.OnFidesmoProvisioningStartResponse", Syntax.PROTO_2, null, "squareup/cash/taply/app/v1beta1/on_fidesmo_provisioning_start.proto");
        ADAPTER = onFidesmoProvisioningStartResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(onFidesmoProvisioningStartResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnFidesmoProvisioningStartResponse(ProvisioningEligibility provisioningEligibility, ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.provisioning_eligibility = provisioningEligibility;
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OnFidesmoProvisioningStartResponse)) {
            return false;
        }
        OnFidesmoProvisioningStartResponse onFidesmoProvisioningStartResponse = (OnFidesmoProvisioningStartResponse) obj;
        return Intrinsics.areEqual(unknownFields(), onFidesmoProvisioningStartResponse.unknownFields()) && Intrinsics.areEqual(this.provisioning_eligibility, onFidesmoProvisioningStartResponse.provisioning_eligibility) && Intrinsics.areEqual(this.response_context, onFidesmoProvisioningStartResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ProvisioningEligibility provisioningEligibility = this.provisioning_eligibility;
        int hashCode2 = (hashCode + (provisioningEligibility != null ? provisioningEligibility.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode3 = hashCode2 + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(14);
        builder.primary_button = this.provisioning_eligibility;
        builder.secondary_button = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ProvisioningEligibility provisioningEligibility = this.provisioning_eligibility;
        if (provisioningEligibility != null) {
            arrayList.add("provisioning_eligibility=" + provisioningEligibility);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OnFidesmoProvisioningStartResponse{", "}", 0, null, null, 56);
    }
}
