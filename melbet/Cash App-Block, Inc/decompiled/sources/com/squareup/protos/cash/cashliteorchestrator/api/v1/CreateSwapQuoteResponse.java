package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.cashface.api.Activity;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/CreateSwapQuoteResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashface/api/Activity$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateSwapQuoteResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateSwapQuoteResponse> CREATOR;
    public final SwapQuote quote;

    static {
        CreateSwapQuoteResponse$Companion$ADAPTER$1 createSwapQuoteResponse$Companion$ADAPTER$1 = new CreateSwapQuoteResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateSwapQuoteResponse.class), "type.googleapis.com/squareup.cash.cashliteorchestrator.api.v1beta1.CreateSwapQuoteResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteorchestrator/api/v1beta1/orchestrator.proto");
        ADAPTER = createSwapQuoteResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createSwapQuoteResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSwapQuoteResponse(SwapQuote swapQuote, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.quote = swapQuote;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateSwapQuoteResponse)) {
            return false;
        }
        CreateSwapQuoteResponse createSwapQuoteResponse = (CreateSwapQuoteResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createSwapQuoteResponse.unknownFields()) && Intrinsics.areEqual(this.quote, createSwapQuoteResponse.quote);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SwapQuote swapQuote = this.quote;
        int hashCode2 = hashCode + (swapQuote != null ? swapQuote.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(15);
        builder.activity = this.quote;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SwapQuote swapQuote = this.quote;
        if (swapQuote != null) {
            arrayList.add("quote=" + swapQuote);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateSwapQuoteResponse{", "}", 0, null, null, 56);
    }
}
