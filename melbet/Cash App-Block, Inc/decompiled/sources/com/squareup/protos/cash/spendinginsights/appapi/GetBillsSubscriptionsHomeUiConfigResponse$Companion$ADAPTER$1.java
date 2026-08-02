package com.squareup.protos.cash.spendinginsights.appapi;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetBillsSubscriptionsHomeUiConfigResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBillsSubscriptionsHomeUiConfigResponse((BillsSubscriptionsHomeUiConfig) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BillsSubscriptionsHomeUiConfig.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBillsSubscriptionsHomeUiConfigResponse getBillsSubscriptionsHomeUiConfigResponse = (GetBillsSubscriptionsHomeUiConfigResponse) obj;
        reverseProtoWriter.getClass();
        getBillsSubscriptionsHomeUiConfigResponse.getClass();
        reverseProtoWriter.writeBytes(getBillsSubscriptionsHomeUiConfigResponse.unknownFields());
        BillsSubscriptionsHomeUiConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getBillsSubscriptionsHomeUiConfigResponse.bills_subscriptions_home_ui_config);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBillsSubscriptionsHomeUiConfigResponse getBillsSubscriptionsHomeUiConfigResponse = (GetBillsSubscriptionsHomeUiConfigResponse) obj;
        getBillsSubscriptionsHomeUiConfigResponse.getClass();
        return BillsSubscriptionsHomeUiConfig.ADAPTER.encodedSizeWithTag(1, getBillsSubscriptionsHomeUiConfigResponse.bills_subscriptions_home_ui_config) + getBillsSubscriptionsHomeUiConfigResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBillsSubscriptionsHomeUiConfigResponse getBillsSubscriptionsHomeUiConfigResponse = (GetBillsSubscriptionsHomeUiConfigResponse) obj;
        getBillsSubscriptionsHomeUiConfigResponse.getClass();
        BillsSubscriptionsHomeUiConfig billsSubscriptionsHomeUiConfig = getBillsSubscriptionsHomeUiConfigResponse.bills_subscriptions_home_ui_config;
        BillsSubscriptionsHomeUiConfig billsSubscriptionsHomeUiConfig2 = billsSubscriptionsHomeUiConfig != null ? (BillsSubscriptionsHomeUiConfig) BillsSubscriptionsHomeUiConfig.ADAPTER.redact(billsSubscriptionsHomeUiConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetBillsSubscriptionsHomeUiConfigResponse(billsSubscriptionsHomeUiConfig2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBillsSubscriptionsHomeUiConfigResponse getBillsSubscriptionsHomeUiConfigResponse = (GetBillsSubscriptionsHomeUiConfigResponse) obj;
        getBillsSubscriptionsHomeUiConfigResponse.getClass();
        BillsSubscriptionsHomeUiConfig.ADAPTER.encodeWithTag(protoWriter, 1, getBillsSubscriptionsHomeUiConfigResponse.bills_subscriptions_home_ui_config);
        protoWriter.writeBytes(getBillsSubscriptionsHomeUiConfigResponse.unknownFields());
    }
}
