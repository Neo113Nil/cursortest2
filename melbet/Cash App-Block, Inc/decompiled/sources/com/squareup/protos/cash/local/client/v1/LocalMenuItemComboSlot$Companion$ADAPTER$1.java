package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuItemComboSlot$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuItemComboSlot((String) obj, (String) obj2, (String) obj3, m, arrayList, (String) obj4, (Integer) obj5, arrayList2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 5:
                    arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 6:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj5 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 8:
                    arrayList2.add(LocalComboSlotPriceAdjustment.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuItemComboSlot localMenuItemComboSlot = (LocalMenuItemComboSlot) obj;
        reverseProtoWriter.getClass();
        localMenuItemComboSlot.getClass();
        reverseProtoWriter.writeBytes(localMenuItemComboSlot.unknownFields());
        LocalComboSlotPriceAdjustment.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 8, localMenuItemComboSlot.price_adjustments);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 7, localMenuItemComboSlot.num_selections);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, localMenuItemComboSlot.default_variation_token);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 5, localMenuItemComboSlot.available_variation_tokens);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, localMenuItemComboSlot.available_item_tokens);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localMenuItemComboSlot.combo_category_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localMenuItemComboSlot.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localMenuItemComboSlot.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuItemComboSlot localMenuItemComboSlot = (LocalMenuItemComboSlot) obj;
        localMenuItemComboSlot.getClass();
        int size$okio = localMenuItemComboSlot.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalComboSlotPriceAdjustment.ADAPTER.asRepeated().encodedSizeWithTag(8, localMenuItemComboSlot.price_adjustments) + ProtoAdapter.INT32.encodedSizeWithTag(7, localMenuItemComboSlot.num_selections) + protoAdapter.encodedSizeWithTag(6, localMenuItemComboSlot.default_variation_token) + protoAdapter.asRepeated().encodedSizeWithTag(5, localMenuItemComboSlot.available_variation_tokens) + protoAdapter.asRepeated().encodedSizeWithTag(4, localMenuItemComboSlot.available_item_tokens) + protoAdapter.encodedSizeWithTag(3, localMenuItemComboSlot.combo_category_token) + protoAdapter.encodedSizeWithTag(2, localMenuItemComboSlot.name) + protoAdapter.encodedSizeWithTag(1, localMenuItemComboSlot.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuItemComboSlot localMenuItemComboSlot = (LocalMenuItemComboSlot) obj;
        localMenuItemComboSlot.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localMenuItemComboSlot.price_adjustments, LocalComboSlotPriceAdjustment.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = localMenuItemComboSlot.token;
        String str2 = localMenuItemComboSlot.name;
        String str3 = localMenuItemComboSlot.combo_category_token;
        List list = localMenuItemComboSlot.available_item_tokens;
        List list2 = localMenuItemComboSlot.available_variation_tokens;
        String str4 = localMenuItemComboSlot.default_variation_token;
        Integer num = localMenuItemComboSlot.num_selections;
        list.getClass();
        list2.getClass();
        byteString.getClass();
        return new LocalMenuItemComboSlot(str, str2, str3, list, list2, str4, num, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuItemComboSlot localMenuItemComboSlot = (LocalMenuItemComboSlot) obj;
        localMenuItemComboSlot.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localMenuItemComboSlot.token);
        protoAdapter.encodeWithTag(protoWriter, 2, localMenuItemComboSlot.name);
        protoAdapter.encodeWithTag(protoWriter, 3, localMenuItemComboSlot.combo_category_token);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, localMenuItemComboSlot.available_item_tokens);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, localMenuItemComboSlot.available_variation_tokens);
        protoAdapter.encodeWithTag(protoWriter, 6, localMenuItemComboSlot.default_variation_token);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, localMenuItemComboSlot.num_selections);
        LocalComboSlotPriceAdjustment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, localMenuItemComboSlot.price_adjustments);
        protoWriter.writeBytes(localMenuItemComboSlot.unknownFields());
    }
}
