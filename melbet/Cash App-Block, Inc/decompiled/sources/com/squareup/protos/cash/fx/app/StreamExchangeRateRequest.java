package com.squareup.protos.cash.fx.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.common.CurrencyCode;
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

/* loaded from: classes7.dex */
public final class StreamExchangeRateRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StreamExchangeRateRequest> CREATOR;
    public final CurrencyCode from_currency;
    public final CurrencyCode to_currency;

    static {
        StreamExchangeRateRequest$Companion$ADAPTER$1 streamExchangeRateRequest$Companion$ADAPTER$1 = new StreamExchangeRateRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StreamExchangeRateRequest.class), "type.googleapis.com/squareup.cash.fx.app.StreamExchangeRateRequest", Syntax.PROTO_2, null, "squareup/cash/fx/app.proto");
        ADAPTER = streamExchangeRateRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(streamExchangeRateRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamExchangeRateRequest(CurrencyCode currencyCode, CurrencyCode currencyCode2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.from_currency = currencyCode;
        this.to_currency = currencyCode2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamExchangeRateRequest)) {
            return false;
        }
        StreamExchangeRateRequest streamExchangeRateRequest = (StreamExchangeRateRequest) obj;
        return Intrinsics.areEqual(unknownFields(), streamExchangeRateRequest.unknownFields()) && this.from_currency == streamExchangeRateRequest.from_currency && this.to_currency == streamExchangeRateRequest.to_currency;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CurrencyCode currencyCode = this.from_currency;
        int hashCode2 = (hashCode + (currencyCode != null ? currencyCode.hashCode() : 0)) * 37;
        CurrencyCode currencyCode2 = this.to_currency;
        int hashCode3 = hashCode2 + (currencyCode2 != null ? currencyCode2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(16);
        builder.f1268type = this.from_currency;
        builder.details = this.to_currency;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CurrencyCode currencyCode = this.from_currency;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("from_currency=", currencyCode, arrayList);
        }
        CurrencyCode currencyCode2 = this.to_currency;
        if (currencyCode2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("to_currency=", currencyCode2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamExchangeRateRequest{", "}", 0, null, null, 56);
    }
}
