package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.composer.app.Card;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/CreateBitcoinAddressResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/composer/app/Card$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateBitcoinAddressResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateBitcoinAddressResponse> CREATOR;
    public final BitcoinReceiveArtifact bitcoin;
    public final String customer_token;

    static {
        CreateBitcoinAddressResponse$Companion$ADAPTER$1 createBitcoinAddressResponse$Companion$ADAPTER$1 = new CreateBitcoinAddressResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateBitcoinAddressResponse.class), "type.googleapis.com/squareup.cash.cashliteorchestrator.api.v1beta1.CreateBitcoinAddressResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteorchestrator/api/v1beta1/orchestrator.proto");
        ADAPTER = createBitcoinAddressResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createBitcoinAddressResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateBitcoinAddressResponse(String str, BitcoinReceiveArtifact bitcoinReceiveArtifact, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.bitcoin = bitcoinReceiveArtifact;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateBitcoinAddressResponse)) {
            return false;
        }
        CreateBitcoinAddressResponse createBitcoinAddressResponse = (CreateBitcoinAddressResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createBitcoinAddressResponse.unknownFields()) && Intrinsics.areEqual(this.customer_token, createBitcoinAddressResponse.customer_token) && Intrinsics.areEqual(this.bitcoin, createBitcoinAddressResponse.bitcoin);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        BitcoinReceiveArtifact bitcoinReceiveArtifact = this.bitcoin;
        int hashCode3 = hashCode2 + (bitcoinReceiveArtifact != null ? bitcoinReceiveArtifact.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(4);
        builder.image_url = this.customer_token;
        builder.asset = this.bitcoin;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        BitcoinReceiveArtifact bitcoinReceiveArtifact = this.bitcoin;
        if (bitcoinReceiveArtifact != null) {
            arrayList.add("bitcoin=" + bitcoinReceiveArtifact);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateBitcoinAddressResponse{", "}", 0, null, null, 56);
    }
}
