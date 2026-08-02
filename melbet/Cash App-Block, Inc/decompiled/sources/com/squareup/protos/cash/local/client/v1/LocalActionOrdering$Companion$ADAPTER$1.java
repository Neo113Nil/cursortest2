package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalActionOrdering;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalActionOrdering$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalActionOrdering((Boolean) obj, m, arrayList, arrayList2, (LocalActionOrdering.DiscountCodeMode) obj2, (String) obj3, (LocalActionOrdering.OrderingMode) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 2:
                    m.add(LocalActionOrdering.PopularOrder.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    arrayList.add(LocalActionOrdering.PastOrder.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    arrayList2.add(LocalCart.Line.Selection.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    try {
                        obj2 = LocalActionOrdering.DiscountCodeMode.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    try {
                        obj4 = LocalActionOrdering.OrderingMode.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalActionOrdering localActionOrdering = (LocalActionOrdering) obj;
        reverseProtoWriter.getClass();
        localActionOrdering.getClass();
        reverseProtoWriter.writeBytes(localActionOrdering.unknownFields());
        LocalActionOrdering.OrderingMode.ADAPTER.encodeWithTag(reverseProtoWriter, 7, localActionOrdering.ordering_mode);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, localActionOrdering.discount_code_label);
        LocalActionOrdering.DiscountCodeMode.ADAPTER.encodeWithTag(reverseProtoWriter, 5, localActionOrdering.discount_code_mode);
        LocalCart.Line.Selection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, localActionOrdering.reorderable_past_selections);
        LocalActionOrdering.PastOrder.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, localActionOrdering.past_orders);
        LocalActionOrdering.PopularOrder.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, localActionOrdering.popular_orders);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, localActionOrdering.enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalActionOrdering localActionOrdering = (LocalActionOrdering) obj;
        localActionOrdering.getClass();
        return LocalActionOrdering.OrderingMode.ADAPTER.encodedSizeWithTag(7, localActionOrdering.ordering_mode) + ProtoAdapter.STRING.encodedSizeWithTag(6, localActionOrdering.discount_code_label) + LocalActionOrdering.DiscountCodeMode.ADAPTER.encodedSizeWithTag(5, localActionOrdering.discount_code_mode) + LocalCart.Line.Selection.ADAPTER.asRepeated().encodedSizeWithTag(4, localActionOrdering.reorderable_past_selections) + LocalActionOrdering.PastOrder.ADAPTER.asRepeated().encodedSizeWithTag(3, localActionOrdering.past_orders) + LocalActionOrdering.PopularOrder.ADAPTER.asRepeated().encodedSizeWithTag(2, localActionOrdering.popular_orders) + ProtoAdapter.BOOL.encodedSizeWithTag(1, localActionOrdering.enabled) + localActionOrdering.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalActionOrdering localActionOrdering = (LocalActionOrdering) obj;
        localActionOrdering.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localActionOrdering.popular_orders, LocalActionOrdering.PopularOrder.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(localActionOrdering.past_orders, LocalActionOrdering.PastOrder.ADAPTER);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(localActionOrdering.reorderable_past_selections, LocalCart.Line.Selection.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = localActionOrdering.enabled;
        LocalActionOrdering.DiscountCodeMode discountCodeMode = localActionOrdering.discount_code_mode;
        String str = localActionOrdering.discount_code_label;
        LocalActionOrdering.OrderingMode orderingMode = localActionOrdering.ordering_mode;
        byteString.getClass();
        return new LocalActionOrdering(bool, m1169redactElements, m1169redactElements2, m1169redactElements3, discountCodeMode, str, orderingMode, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalActionOrdering localActionOrdering = (LocalActionOrdering) obj;
        localActionOrdering.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, localActionOrdering.enabled);
        LocalActionOrdering.PopularOrder.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, localActionOrdering.popular_orders);
        LocalActionOrdering.PastOrder.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, localActionOrdering.past_orders);
        LocalCart.Line.Selection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, localActionOrdering.reorderable_past_selections);
        LocalActionOrdering.DiscountCodeMode.ADAPTER.encodeWithTag(protoWriter, 5, localActionOrdering.discount_code_mode);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, localActionOrdering.discount_code_label);
        LocalActionOrdering.OrderingMode.ADAPTER.encodeWithTag(protoWriter, 7, localActionOrdering.ordering_mode);
        protoWriter.writeBytes(localActionOrdering.unknownFields());
    }
}
