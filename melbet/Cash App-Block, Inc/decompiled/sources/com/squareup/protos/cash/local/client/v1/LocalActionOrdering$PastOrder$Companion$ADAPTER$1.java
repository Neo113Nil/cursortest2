package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalActionOrdering;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalActionOrdering$PastOrder$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalActionOrdering.PastOrder((Long) obj, m, (String) obj2, (LocalMoney) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(LocalCart.Line.Selection.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalActionOrdering.PastOrder pastOrder = (LocalActionOrdering.PastOrder) obj;
        reverseProtoWriter.getClass();
        pastOrder.getClass();
        reverseProtoWriter.writeBytes(pastOrder.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, pastOrder.order_token);
        LocalMoney.ADAPTER.encodeWithTag(reverseProtoWriter, 4, pastOrder.total_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, pastOrder.receipt_url);
        LocalCart.Line.Selection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, pastOrder.cart_line_selections);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, pastOrder.last_ordered_at);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalActionOrdering.PastOrder pastOrder = (LocalActionOrdering.PastOrder) obj;
        pastOrder.getClass();
        int encodedSizeWithTag = LocalCart.Line.Selection.ADAPTER.asRepeated().encodedSizeWithTag(2, pastOrder.cart_line_selections) + ProtoAdapter.INT64.encodedSizeWithTag(1, pastOrder.last_ordered_at) + pastOrder.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, pastOrder.order_token) + LocalMoney.ADAPTER.encodedSizeWithTag(4, pastOrder.total_amount) + protoAdapter.encodedSizeWithTag(3, pastOrder.receipt_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalActionOrdering.PastOrder pastOrder = (LocalActionOrdering.PastOrder) obj;
        pastOrder.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(pastOrder.cart_line_selections, LocalCart.Line.Selection.ADAPTER);
        LocalMoney localMoney = pastOrder.total_amount;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = pastOrder.last_ordered_at;
        String str = pastOrder.receipt_url;
        String str2 = pastOrder.order_token;
        byteString.getClass();
        return new LocalActionOrdering.PastOrder(l, m1169redactElements, str, localMoney2, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalActionOrdering.PastOrder pastOrder = (LocalActionOrdering.PastOrder) obj;
        pastOrder.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, pastOrder.last_ordered_at);
        LocalCart.Line.Selection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, pastOrder.cart_line_selections);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, pastOrder.receipt_url);
        LocalMoney.ADAPTER.encodeWithTag(protoWriter, 4, pastOrder.total_amount);
        protoAdapter.encodeWithTag(protoWriter, 5, pastOrder.order_token);
        protoWriter.writeBytes(pastOrder.unknownFields());
    }
}
