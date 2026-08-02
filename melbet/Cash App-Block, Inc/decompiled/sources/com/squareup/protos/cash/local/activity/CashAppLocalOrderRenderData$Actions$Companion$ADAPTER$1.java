package com.squareup.protos.cash.local.activity;

import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppLocalOrderRenderData$Actions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppLocalOrderRenderData.Actions((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppLocalOrderRenderData.Actions actions = (CashAppLocalOrderRenderData.Actions) obj;
        reverseProtoWriter.getClass();
        actions.getClass();
        reverseProtoWriter.writeBytes(actions.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, actions.follow_brand_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, actions.view_square_receipt_external_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, actions.show_order_confirmation_screen_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, actions.show_local_cash_detail_sheet_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, actions.new_order_client_route);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppLocalOrderRenderData.Actions actions = (CashAppLocalOrderRenderData.Actions) obj;
        actions.getClass();
        int size$okio = actions.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, actions.follow_brand_client_route) + protoAdapter.encodedSizeWithTag(4, actions.view_square_receipt_external_route) + protoAdapter.encodedSizeWithTag(3, actions.show_order_confirmation_screen_client_route) + protoAdapter.encodedSizeWithTag(2, actions.show_local_cash_detail_sheet_client_route) + protoAdapter.encodedSizeWithTag(1, actions.new_order_client_route) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppLocalOrderRenderData.Actions actions = (CashAppLocalOrderRenderData.Actions) obj;
        actions.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = actions.new_order_client_route;
        String str2 = actions.show_local_cash_detail_sheet_client_route;
        String str3 = actions.show_order_confirmation_screen_client_route;
        String str4 = actions.view_square_receipt_external_route;
        String str5 = actions.follow_brand_client_route;
        byteString.getClass();
        return new CashAppLocalOrderRenderData.Actions(str, str2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppLocalOrderRenderData.Actions actions = (CashAppLocalOrderRenderData.Actions) obj;
        actions.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, actions.new_order_client_route);
        protoAdapter.encodeWithTag(protoWriter, 2, actions.show_local_cash_detail_sheet_client_route);
        protoAdapter.encodeWithTag(protoWriter, 3, actions.show_order_confirmation_screen_client_route);
        protoAdapter.encodeWithTag(protoWriter, 4, actions.view_square_receipt_external_route);
        protoAdapter.encodeWithTag(protoWriter, 5, actions.follow_brand_client_route);
        protoWriter.writeBytes(actions.unknownFields());
    }
}
