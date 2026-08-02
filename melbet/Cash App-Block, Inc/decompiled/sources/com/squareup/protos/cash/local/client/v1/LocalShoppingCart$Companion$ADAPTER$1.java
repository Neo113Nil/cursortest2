package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalShoppingCart$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalShoppingCart(m, (LocalMoney) obj, (LocalMoney) obj2, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LocalCart.Line.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalShoppingCart localShoppingCart = (LocalShoppingCart) obj;
        reverseProtoWriter.getClass();
        localShoppingCart.getClass();
        reverseProtoWriter.writeBytes(localShoppingCart.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 4, localShoppingCart.applied_discount_codes);
        ProtoAdapter protoAdapter = LocalMoney.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localShoppingCart.lines_subtotal_before_discounts);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localShoppingCart.lines_subtotal);
        LocalCart.Line.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, localShoppingCart.lines);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalShoppingCart localShoppingCart = (LocalShoppingCart) obj;
        localShoppingCart.getClass();
        int encodedSizeWithTag = LocalCart.Line.ADAPTER.asRepeated().encodedSizeWithTag(1, localShoppingCart.lines) + localShoppingCart.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalMoney.ADAPTER;
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, localShoppingCart.applied_discount_codes) + protoAdapter.encodedSizeWithTag(3, localShoppingCart.lines_subtotal_before_discounts) + protoAdapter.encodedSizeWithTag(2, localShoppingCart.lines_subtotal) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalShoppingCart localShoppingCart = (LocalShoppingCart) obj;
        localShoppingCart.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localShoppingCart.lines, LocalCart.Line.ADAPTER);
        LocalMoney localMoney = localShoppingCart.lines_subtotal;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        LocalMoney localMoney3 = localShoppingCart.lines_subtotal_before_discounts;
        LocalMoney localMoney4 = localMoney3 != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney3) : null;
        ByteString byteString = ByteString.EMPTY;
        List list = localShoppingCart.applied_discount_codes;
        list.getClass();
        byteString.getClass();
        return new LocalShoppingCart(m1169redactElements, localMoney2, localMoney4, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalShoppingCart localShoppingCart = (LocalShoppingCart) obj;
        localShoppingCart.getClass();
        LocalCart.Line.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, localShoppingCart.lines);
        ProtoAdapter protoAdapter = LocalMoney.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, localShoppingCart.lines_subtotal);
        protoAdapter.encodeWithTag(protoWriter, 3, localShoppingCart.lines_subtotal_before_discounts);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, localShoppingCart.applied_discount_codes);
        protoWriter.writeBytes(localShoppingCart.unknownFields());
    }
}
