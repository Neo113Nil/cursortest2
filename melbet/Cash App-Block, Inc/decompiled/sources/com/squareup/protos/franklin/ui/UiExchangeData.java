package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.protos.franklin.common.ExchangeData;
import com.squareup.protos.franklin.ui.UiCashLimits;
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
public final class UiExchangeData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiExchangeData> CREATOR;
    public final ExchangeData exchange_data;

    static {
        UiExchangeData$Companion$ADAPTER$1 uiExchangeData$Companion$ADAPTER$1 = new UiExchangeData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiExchangeData.class), "type.googleapis.com/squareup.franklin.ui.UiExchangeData", Syntax.PROTO_2, null, "squareup/franklin/ui/exchange_data.proto");
        ADAPTER = uiExchangeData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiExchangeData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiExchangeData(ExchangeData exchangeData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.exchange_data = exchangeData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiExchangeData)) {
            return false;
        }
        UiExchangeData uiExchangeData = (UiExchangeData) obj;
        return Intrinsics.areEqual(unknownFields(), uiExchangeData.unknownFields()) && Intrinsics.areEqual(this.exchange_data, uiExchangeData.exchange_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ExchangeData exchangeData = this.exchange_data;
        int hashCode2 = hashCode + (exchangeData != null ? exchangeData.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(20);
        builder.cash_limit_group = this.exchange_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ExchangeData exchangeData = this.exchange_data;
        if (exchangeData != null) {
            arrayList.add("exchange_data=" + exchangeData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiExchangeData{", "}", 0, null, null, 56);
    }
}
