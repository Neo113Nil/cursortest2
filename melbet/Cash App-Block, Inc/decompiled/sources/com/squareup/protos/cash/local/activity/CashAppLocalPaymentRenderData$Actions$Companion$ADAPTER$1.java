package com.squareup.protos.cash.local.activity;

import com.squareup.protos.cash.local.activity.CashAppLocalPaymentRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppLocalPaymentRenderData$Actions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppLocalPaymentRenderData.Actions((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppLocalPaymentRenderData.Actions actions = (CashAppLocalPaymentRenderData.Actions) obj;
        reverseProtoWriter.getClass();
        actions.getClass();
        reverseProtoWriter.writeBytes(actions.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, actions.new_order_client_route);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppLocalPaymentRenderData.Actions actions = (CashAppLocalPaymentRenderData.Actions) obj;
        actions.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, actions.new_order_client_route) + actions.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppLocalPaymentRenderData.Actions actions = (CashAppLocalPaymentRenderData.Actions) obj;
        actions.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = actions.new_order_client_route;
        byteString.getClass();
        return new CashAppLocalPaymentRenderData.Actions(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppLocalPaymentRenderData.Actions actions = (CashAppLocalPaymentRenderData.Actions) obj;
        actions.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, actions.new_order_client_route);
        protoWriter.writeBytes(actions.unknownFields());
    }
}
