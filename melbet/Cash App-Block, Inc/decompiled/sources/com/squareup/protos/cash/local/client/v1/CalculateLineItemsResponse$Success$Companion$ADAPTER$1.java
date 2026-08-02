package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.CalculateLineItemsResponse;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CalculateLineItemsResponse$Success$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CalculateLineItemsResponse.Success(m, (LocalMoney) obj, arrayList, (LocalMoney) obj2, (LocalFulfillment) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 4:
                    m.add(LocalCart.Line.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    obj = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj);
                    break;
                case 6:
                    arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 7:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj2);
                    break;
                case 8:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalFulfillment.ADAPTER, protoReader, obj3);
                    break;
                case 9:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CalculateLineItemsResponse.Success success = (CalculateLineItemsResponse.Success) obj;
        reverseProtoWriter.getClass();
        success.getClass();
        reverseProtoWriter.writeBytes(success.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 9, success.includes_preorder_items);
        LocalFulfillment.ADAPTER.encodeWithTag(reverseProtoWriter, 8, success.fulfillment);
        ProtoAdapter protoAdapter = LocalMoney.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, success.lines_subtotal_before_discounts);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 6, success.applied_discount_codes);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, success.lines_subtotal);
        LocalCart.Line.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, success.lines);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CalculateLineItemsResponse.Success success = (CalculateLineItemsResponse.Success) obj;
        success.getClass();
        int encodedSizeWithTag = LocalCart.Line.ADAPTER.asRepeated().encodedSizeWithTag(4, success.lines) + success.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalMoney.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(9, success.includes_preorder_items) + LocalFulfillment.ADAPTER.encodedSizeWithTag(8, success.fulfillment) + protoAdapter.encodedSizeWithTag(7, success.lines_subtotal_before_discounts) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, success.applied_discount_codes) + protoAdapter.encodedSizeWithTag(5, success.lines_subtotal) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CalculateLineItemsResponse.Success success = (CalculateLineItemsResponse.Success) obj;
        success.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(success.lines, LocalCart.Line.ADAPTER);
        LocalMoney localMoney = success.lines_subtotal;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        LocalMoney localMoney3 = success.lines_subtotal_before_discounts;
        LocalMoney localMoney4 = localMoney3 != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney3) : null;
        LocalFulfillment localFulfillment = success.fulfillment;
        LocalFulfillment localFulfillment2 = localFulfillment != null ? (LocalFulfillment) LocalFulfillment.ADAPTER.redact(localFulfillment) : null;
        ByteString byteString = ByteString.EMPTY;
        List list = success.applied_discount_codes;
        Boolean bool = success.includes_preorder_items;
        list.getClass();
        byteString.getClass();
        return new CalculateLineItemsResponse.Success(m1169redactElements, localMoney2, list, localMoney4, localFulfillment2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CalculateLineItemsResponse.Success success = (CalculateLineItemsResponse.Success) obj;
        success.getClass();
        LocalCart.Line.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, success.lines);
        ProtoAdapter protoAdapter = LocalMoney.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 5, success.lines_subtotal);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, success.applied_discount_codes);
        protoAdapter.encodeWithTag(protoWriter, 7, success.lines_subtotal_before_discounts);
        LocalFulfillment.ADAPTER.encodeWithTag(protoWriter, 8, success.fulfillment);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, success.includes_preorder_items);
        protoWriter.writeBytes(success.unknownFields());
    }
}
