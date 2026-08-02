package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cryptoinvestflow.api.blockers.v1.BitcoinP2pConversionPercentageInputs;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitBitcoinP2pConversionPercentageRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitBitcoinP2pConversionPercentageRequest> CREATOR;
    public final BitcoinP2pConversionPercentageInputs inputs;
    public final RequestContext request_context;

    static {
        SubmitBitcoinP2pConversionPercentageRequest$Companion$ADAPTER$1 submitBitcoinP2pConversionPercentageRequest$Companion$ADAPTER$1 = new SubmitBitcoinP2pConversionPercentageRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SubmitBitcoinP2pConversionPercentageRequest.class), "type.googleapis.com/squareup.franklin.app.SubmitBitcoinP2pConversionPercentageRequest", Syntax.PROTO_2, null, "squareup/franklin/app/bitcoin_p2p_conversion.proto");
        ADAPTER = submitBitcoinP2pConversionPercentageRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(submitBitcoinP2pConversionPercentageRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitBitcoinP2pConversionPercentageRequest(RequestContext requestContext, BitcoinP2pConversionPercentageInputs bitcoinP2pConversionPercentageInputs, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.inputs = bitcoinP2pConversionPercentageInputs;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitBitcoinP2pConversionPercentageRequest)) {
            return false;
        }
        SubmitBitcoinP2pConversionPercentageRequest submitBitcoinP2pConversionPercentageRequest = (SubmitBitcoinP2pConversionPercentageRequest) obj;
        return Intrinsics.areEqual(unknownFields(), submitBitcoinP2pConversionPercentageRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, submitBitcoinP2pConversionPercentageRequest.request_context) && Intrinsics.areEqual(this.inputs, submitBitcoinP2pConversionPercentageRequest.inputs);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        BitcoinP2pConversionPercentageInputs bitcoinP2pConversionPercentageInputs = this.inputs;
        int hashCode3 = hashCode2 + (bitcoinP2pConversionPercentageInputs != null ? bitcoinP2pConversionPercentageInputs.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SetAmountRequest.Builder builder = new SetAmountRequest.Builder(19);
        builder.request_context = this.request_context;
        builder.result = this.inputs;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        BitcoinP2pConversionPercentageInputs bitcoinP2pConversionPercentageInputs = this.inputs;
        if (bitcoinP2pConversionPercentageInputs != null) {
            arrayList.add("inputs=" + bitcoinP2pConversionPercentageInputs);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitBitcoinP2pConversionPercentageRequest{", "}", 0, null, null, 56);
    }
}
