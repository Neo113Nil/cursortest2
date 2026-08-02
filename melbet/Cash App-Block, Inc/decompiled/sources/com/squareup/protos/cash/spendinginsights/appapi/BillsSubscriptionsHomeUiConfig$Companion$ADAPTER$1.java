package com.squareup.protos.cash.spendinginsights.appapi;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BillsSubscriptionsHomeUiConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BillsSubscriptionsHomeUiConfig(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BillsSubscriptionsHomeUiConfig billsSubscriptionsHomeUiConfig = (BillsSubscriptionsHomeUiConfig) obj;
        reverseProtoWriter.getClass();
        billsSubscriptionsHomeUiConfig.getClass();
        reverseProtoWriter.writeBytes(billsSubscriptionsHomeUiConfig.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BillsSubscriptionsHomeUiConfig billsSubscriptionsHomeUiConfig = (BillsSubscriptionsHomeUiConfig) obj;
        billsSubscriptionsHomeUiConfig.getClass();
        return billsSubscriptionsHomeUiConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((BillsSubscriptionsHomeUiConfig) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BillsSubscriptionsHomeUiConfig(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BillsSubscriptionsHomeUiConfig billsSubscriptionsHomeUiConfig = (BillsSubscriptionsHomeUiConfig) obj;
        billsSubscriptionsHomeUiConfig.getClass();
        protoWriter.writeBytes(billsSubscriptionsHomeUiConfig.unknownFields());
    }
}
