package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/CreateLightningInvoiceResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteflow/api/v1/Row$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateLightningInvoiceResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateLightningInvoiceResponse> CREATOR;
    public final String customer_token;
    public final String idempotency_token;
    public final LightningReceiveArtifact lightning;

    static {
        CreateLightningInvoiceResponse$Companion$ADAPTER$1 createLightningInvoiceResponse$Companion$ADAPTER$1 = new CreateLightningInvoiceResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateLightningInvoiceResponse.class), "type.googleapis.com/squareup.cash.cashliteorchestrator.api.v1beta1.CreateLightningInvoiceResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteorchestrator/api/v1beta1/orchestrator.proto");
        ADAPTER = createLightningInvoiceResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createLightningInvoiceResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateLightningInvoiceResponse(String str, String str2, LightningReceiveArtifact lightningReceiveArtifact, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.idempotency_token = str2;
        this.lightning = lightningReceiveArtifact;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateLightningInvoiceResponse)) {
            return false;
        }
        CreateLightningInvoiceResponse createLightningInvoiceResponse = (CreateLightningInvoiceResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createLightningInvoiceResponse.unknownFields()) && Intrinsics.areEqual(this.customer_token, createLightningInvoiceResponse.customer_token) && Intrinsics.areEqual(this.idempotency_token, createLightningInvoiceResponse.idempotency_token) && Intrinsics.areEqual(this.lightning, createLightningInvoiceResponse.lightning);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.idempotency_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LightningReceiveArtifact lightningReceiveArtifact = this.lightning;
        int hashCode4 = hashCode3 + (lightningReceiveArtifact != null ? lightningReceiveArtifact.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder(16);
        builder.title = this.customer_token;
        builder.subtitle = this.idempotency_token;
        builder.action = this.lightning;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        String str2 = this.idempotency_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "idempotency_token=", arrayList);
        }
        LightningReceiveArtifact lightningReceiveArtifact = this.lightning;
        if (lightningReceiveArtifact != null) {
            arrayList.add("lightning=" + lightningReceiveArtifact);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateLightningInvoiceResponse{", "}", 0, null, null, 56);
    }
}
