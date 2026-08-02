package com.squareup.protos.cash.spendinginsights.appapi;

import android.os.Parcelable;
import com.squareup.protos.franklin.app.GetProfileRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BillsSubscriptionsHomeUiConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BillsSubscriptionsHomeUiConfig> CREATOR;

    static {
        BillsSubscriptionsHomeUiConfig$Companion$ADAPTER$1 billsSubscriptionsHomeUiConfig$Companion$ADAPTER$1 = new BillsSubscriptionsHomeUiConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BillsSubscriptionsHomeUiConfig.class), "type.googleapis.com/squareup.cash.spendinginsights.appapi.BillsSubscriptionsHomeUiConfig", Syntax.PROTO_2, null, "squareup/cash/spendinginsights/app/spending_insights_app_service.proto");
        ADAPTER = billsSubscriptionsHomeUiConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(billsSubscriptionsHomeUiConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillsSubscriptionsHomeUiConfig(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BillsSubscriptionsHomeUiConfig) && Intrinsics.areEqual(unknownFields(), ((BillsSubscriptionsHomeUiConfig) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GetProfileRequest.Builder builder = new GetProfileRequest.Builder(1);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "BillsSubscriptionsHomeUiConfig{}";
    }
}
