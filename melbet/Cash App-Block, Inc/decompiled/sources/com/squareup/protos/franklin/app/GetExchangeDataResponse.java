package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.common.ExchangeData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/GetExchangeDataResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/BankingConfig$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetExchangeDataResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetExchangeDataResponse> CREATOR;
    public final List equity_data;
    public final ExchangeData exchange_data;

    static {
        GetExchangeDataResponse$Companion$ADAPTER$1 getExchangeDataResponse$Companion$ADAPTER$1 = new GetExchangeDataResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetExchangeDataResponse.class), "type.googleapis.com/squareup.franklin.app.GetExchangeDataResponse", Syntax.PROTO_2, null, "squareup/franklin/app/exchange_data.proto");
        ADAPTER = getExchangeDataResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getExchangeDataResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetExchangeDataResponse(ExchangeData exchangeData, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.exchange_data = exchangeData;
        this.equity_data = TransactorKt.immutableCopyOf("equity_data", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetExchangeDataResponse)) {
            return false;
        }
        GetExchangeDataResponse getExchangeDataResponse = (GetExchangeDataResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getExchangeDataResponse.unknownFields()) && Intrinsics.areEqual(this.exchange_data, getExchangeDataResponse.exchange_data) && Intrinsics.areEqual(this.equity_data, getExchangeDataResponse.equity_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ExchangeData exchangeData = this.exchange_data;
        int hashCode2 = this.equity_data.hashCode() + ((hashCode + (exchangeData != null ? exchangeData.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(15);
        builder.strings = this.exchange_data;
        builder.recurring_deposits_dda_upsell = this.equity_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ExchangeData exchangeData = this.exchange_data;
        if (exchangeData != null) {
            arrayList.add("exchange_data=" + exchangeData);
        }
        List list = this.equity_data;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("equity_data=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetExchangeDataResponse{", "}", 0, null, null, 56);
    }
}
