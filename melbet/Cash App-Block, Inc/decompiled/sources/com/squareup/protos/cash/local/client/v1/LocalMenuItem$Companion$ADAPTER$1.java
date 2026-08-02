package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalMenuItem;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuItem$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Object obj = null;
        Object obj2 = null;
        String str2 = null;
        String str3 = null;
        LocalMenuAvailability localMenuAvailability = null;
        Boolean bool = null;
        Integer num = null;
        Integer num2 = null;
        LocalImage localImage = null;
        LocalMoney localMoney = null;
        LocalMenuItemDeal localMenuItemDeal = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuItem(str, str2, localImage, localMoney, localMenuItemDeal, num, str3, m, arrayList4, localMenuAvailability, arrayList5, bool, (LocalMenuHours) obj3, arrayList6, arrayList7, num2, arrayList8, arrayList9, (LocalMenuItem.ReservationData) obj, arrayList10, arrayList11, arrayList12, (LocalMenuItem.PreorderingItemSummary) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 3:
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    localImage = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, localImage);
                    decode = str;
                    break;
                case 4:
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    localMoney = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, localMoney);
                    decode = str;
                    break;
                case 5:
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    localMenuItemDeal = TransactorKt.decodeMessageOrMerge(LocalMenuItemDeal.ADAPTER, protoReader, localMenuItemDeal);
                    decode = str;
                    break;
                case 6:
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    num = ProtoAdapter.INT32.decode(protoReader);
                    decode = str;
                    break;
                case 7:
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 8:
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    m.add(LocalMenuItemVariation.ADAPTER.decode(protoReader));
                    decode = str;
                    break;
                case 9:
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    arrayList4.add(LocalMenuItem.ModifierListConfig.ADAPTER.decode(protoReader));
                    decode = str;
                    break;
                case 10:
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    try {
                        localMenuAvailability = LocalMenuAvailability.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                    decode = str;
                    break;
                case 11:
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    arrayList5.add(LocalMenuItem.ItemOptionsConfig.ADAPTER.decode(protoReader));
                    decode = str;
                    break;
                case 12:
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str;
                    break;
                case 13:
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalMenuHours.ADAPTER, protoReader, obj3);
                    decode = str;
                    break;
                case 14:
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    arrayList6.add(LocalMenuItemComboSlot.ADAPTER.decode(protoReader));
                    decode = str;
                    break;
                case 15:
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    try {
                        LocalDietaryPreference.ADAPTER.tryDecode(protoReader, arrayList7);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                    }
                    decode = str;
                    break;
                case 16:
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    num2 = ProtoAdapter.INT32.decode(protoReader);
                    decode = str;
                    break;
                case 17:
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    try {
                        LocalIngredient.ADAPTER.tryDecode(protoReader, arrayList8);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                    }
                    decode = str;
                    break;
                case 18:
                    try {
                        LocalMenuItem.LocalMenuItemFeature.ADAPTER.tryDecode(protoReader, arrayList9);
                        arrayList = arrayList9;
                        arrayList2 = arrayList10;
                        arrayList3 = arrayList11;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        arrayList = arrayList9;
                        arrayList2 = arrayList10;
                        arrayList3 = arrayList11;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                    }
                    decode = str;
                    break;
                case 19:
                    obj = TransactorKt.decodeMessageOrMerge(LocalMenuItem.ReservationData.ADAPTER, protoReader, obj);
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    decode = str;
                    break;
                case 20:
                    arrayList10.add(LocalImage.ADAPTER.decode(protoReader));
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    decode = str;
                    break;
                case 21:
                    arrayList11.add(ProtoAdapter.STRING.decode(protoReader));
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    decode = str;
                    break;
                case 22:
                    arrayList12.add(ProtoAdapter.STRING.decode(protoReader));
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    decode = str;
                    break;
                case 23:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalMenuItem.PreorderingItemSummary.ADAPTER, protoReader, obj2);
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    decode = str;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    arrayList = arrayList9;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                    decode = str;
                    break;
            }
            str = decode;
            arrayList9 = arrayList;
            arrayList10 = arrayList2;
            arrayList11 = arrayList3;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuItem localMenuItem = (LocalMenuItem) obj;
        reverseProtoWriter.getClass();
        localMenuItem.getClass();
        reverseProtoWriter.writeBytes(localMenuItem.unknownFields());
        LocalMenuItem.PreorderingItemSummary.ADAPTER.encodeWithTag(reverseProtoWriter, 23, localMenuItem.preordering_summary);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 22, localMenuItem.discount_tokens);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 21, localMenuItem.popular_modifier_tokens);
        ProtoAdapter protoAdapter2 = LocalImage.ADAPTER;
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 20, localMenuItem.images);
        LocalMenuItem.ReservationData.ADAPTER.encodeWithTag(reverseProtoWriter, 19, localMenuItem.reservation_data);
        LocalMenuItem.LocalMenuItemFeature.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 18, localMenuItem.features);
        LocalIngredient.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 17, localMenuItem.ingredients);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 16, localMenuItem.total_calories);
        LocalDietaryPreference.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 15, localMenuItem.dietary_preferences);
        LocalMenuItemComboSlot.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 14, localMenuItem.combo_slots);
        LocalMenuHours.ADAPTER.encodeWithTag(reverseProtoWriter, 13, localMenuItem.menu_hours);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 12, localMenuItem.is_alcoholic);
        LocalMenuItem.ItemOptionsConfig.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 11, localMenuItem.item_options_configs);
        LocalMenuAvailability.ADAPTER.encodeWithTag(reverseProtoWriter, 10, localMenuItem.availability);
        LocalMenuItem.ModifierListConfig.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 9, localMenuItem.modifier_list_configs);
        LocalMenuItemVariation.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 8, localMenuItem.variations);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, localMenuItem.description);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 6, localMenuItem.max_order_quantity);
        LocalMenuItemDeal.ADAPTER.encodeWithTag(reverseProtoWriter, 5, localMenuItem.deal);
        LocalMoney.ADAPTER.encodeWithTag(reverseProtoWriter, 4, localMenuItem.price);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, localMenuItem.image);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localMenuItem.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localMenuItem.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuItem localMenuItem = (LocalMenuItem) obj;
        localMenuItem.getClass();
        int size$okio = localMenuItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, localMenuItem.name) + protoAdapter.encodedSizeWithTag(1, localMenuItem.token) + size$okio;
        ProtoAdapter protoAdapter2 = LocalImage.ADAPTER;
        int encodedSizeWithTag2 = LocalMenuItemDeal.ADAPTER.encodedSizeWithTag(5, localMenuItem.deal) + LocalMoney.ADAPTER.encodedSizeWithTag(4, localMenuItem.price) + protoAdapter2.encodedSizeWithTag(3, localMenuItem.image) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
        return LocalMenuItem.PreorderingItemSummary.ADAPTER.encodedSizeWithTag(23, localMenuItem.preordering_summary) + protoAdapter.asRepeated().encodedSizeWithTag(22, localMenuItem.discount_tokens) + protoAdapter.asRepeated().encodedSizeWithTag(21, localMenuItem.popular_modifier_tokens) + protoAdapter2.asRepeated().encodedSizeWithTag(20, localMenuItem.images) + LocalMenuItem.ReservationData.ADAPTER.encodedSizeWithTag(19, localMenuItem.reservation_data) + LocalMenuItem.LocalMenuItemFeature.ADAPTER.asRepeated().encodedSizeWithTag(18, localMenuItem.features) + LocalIngredient.ADAPTER.asRepeated().encodedSizeWithTag(17, localMenuItem.ingredients) + protoAdapter3.encodedSizeWithTag(16, localMenuItem.total_calories) + LocalDietaryPreference.ADAPTER.asRepeated().encodedSizeWithTag(15, localMenuItem.dietary_preferences) + LocalMenuItemComboSlot.ADAPTER.asRepeated().encodedSizeWithTag(14, localMenuItem.combo_slots) + LocalMenuHours.ADAPTER.encodedSizeWithTag(13, localMenuItem.menu_hours) + ProtoAdapter.BOOL.encodedSizeWithTag(12, localMenuItem.is_alcoholic) + LocalMenuItem.ItemOptionsConfig.ADAPTER.asRepeated().encodedSizeWithTag(11, localMenuItem.item_options_configs) + LocalMenuAvailability.ADAPTER.encodedSizeWithTag(10, localMenuItem.availability) + LocalMenuItem.ModifierListConfig.ADAPTER.asRepeated().encodedSizeWithTag(9, localMenuItem.modifier_list_configs) + LocalMenuItemVariation.ADAPTER.asRepeated().encodedSizeWithTag(8, localMenuItem.variations) + protoAdapter.encodedSizeWithTag(7, localMenuItem.description) + protoAdapter3.encodedSizeWithTag(6, localMenuItem.max_order_quantity) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuItem localMenuItem = (LocalMenuItem) obj;
        localMenuItem.getClass();
        LocalImage localImage = localMenuItem.image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        LocalMoney localMoney = localMenuItem.price;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        LocalMenuItemDeal localMenuItemDeal = localMenuItem.deal;
        LocalMenuItemDeal localMenuItemDeal2 = localMenuItemDeal != null ? (LocalMenuItemDeal) LocalMenuItemDeal.ADAPTER.redact(localMenuItemDeal) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localMenuItem.variations, LocalMenuItemVariation.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(localMenuItem.modifier_list_configs, LocalMenuItem.ModifierListConfig.ADAPTER);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(localMenuItem.item_options_configs, LocalMenuItem.ItemOptionsConfig.ADAPTER);
        LocalMenuHours localMenuHours = localMenuItem.menu_hours;
        LocalMenuHours localMenuHours2 = localMenuHours != null ? (LocalMenuHours) LocalMenuHours.ADAPTER.redact(localMenuHours) : null;
        ArrayList m1169redactElements4 = TransactorKt.m1169redactElements(localMenuItem.combo_slots, LocalMenuItemComboSlot.ADAPTER);
        LocalMenuItem.ReservationData reservationData = localMenuItem.reservation_data;
        LocalMenuItem.ReservationData reservationData2 = reservationData != null ? (LocalMenuItem.ReservationData) LocalMenuItem.ReservationData.ADAPTER.redact(reservationData) : null;
        ArrayList m1169redactElements5 = TransactorKt.m1169redactElements(localMenuItem.images, LocalImage.ADAPTER);
        LocalMenuItem.PreorderingItemSummary preorderingItemSummary = localMenuItem.preordering_summary;
        LocalMenuItem.PreorderingItemSummary preorderingItemSummary2 = preorderingItemSummary != null ? (LocalMenuItem.PreorderingItemSummary) LocalMenuItem.PreorderingItemSummary.ADAPTER.redact(preorderingItemSummary) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localMenuItem.token;
        String str2 = localMenuItem.name;
        Integer num = localMenuItem.max_order_quantity;
        String str3 = localMenuItem.description;
        LocalMenuAvailability localMenuAvailability = localMenuItem.availability;
        Boolean bool = localMenuItem.is_alcoholic;
        List list = localMenuItem.dietary_preferences;
        Integer num2 = localMenuItem.total_calories;
        List list2 = localMenuItem.ingredients;
        List list3 = localMenuItem.features;
        List list4 = localMenuItem.popular_modifier_tokens;
        List list5 = localMenuItem.discount_tokens;
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        byteString.getClass();
        return new LocalMenuItem(str, str2, localImage2, localMoney2, localMenuItemDeal2, num, str3, m1169redactElements, m1169redactElements2, localMenuAvailability, m1169redactElements3, bool, localMenuHours2, m1169redactElements4, list, num2, list2, list3, reservationData2, m1169redactElements5, list4, list5, preorderingItemSummary2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuItem localMenuItem = (LocalMenuItem) obj;
        localMenuItem.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localMenuItem.token);
        protoAdapter.encodeWithTag(protoWriter, 2, localMenuItem.name);
        ProtoAdapter protoAdapter2 = LocalImage.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, localMenuItem.image);
        LocalMoney.ADAPTER.encodeWithTag(protoWriter, 4, localMenuItem.price);
        LocalMenuItemDeal.ADAPTER.encodeWithTag(protoWriter, 5, localMenuItem.deal);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 6, localMenuItem.max_order_quantity);
        protoAdapter.encodeWithTag(protoWriter, 7, localMenuItem.description);
        LocalMenuItemVariation.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, localMenuItem.variations);
        LocalMenuItem.ModifierListConfig.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, localMenuItem.modifier_list_configs);
        LocalMenuAvailability.ADAPTER.encodeWithTag(protoWriter, 10, localMenuItem.availability);
        LocalMenuItem.ItemOptionsConfig.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, localMenuItem.item_options_configs);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, localMenuItem.is_alcoholic);
        LocalMenuHours.ADAPTER.encodeWithTag(protoWriter, 13, localMenuItem.menu_hours);
        LocalMenuItemComboSlot.ADAPTER.asRepeated().encodeWithTag(protoWriter, 14, localMenuItem.combo_slots);
        LocalDietaryPreference.ADAPTER.asRepeated().encodeWithTag(protoWriter, 15, localMenuItem.dietary_preferences);
        protoAdapter3.encodeWithTag(protoWriter, 16, localMenuItem.total_calories);
        LocalIngredient.ADAPTER.asRepeated().encodeWithTag(protoWriter, 17, localMenuItem.ingredients);
        LocalMenuItem.LocalMenuItemFeature.ADAPTER.asRepeated().encodeWithTag(protoWriter, 18, localMenuItem.features);
        LocalMenuItem.ReservationData.ADAPTER.encodeWithTag(protoWriter, 19, localMenuItem.reservation_data);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 20, localMenuItem.images);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 21, localMenuItem.popular_modifier_tokens);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 22, localMenuItem.discount_tokens);
        LocalMenuItem.PreorderingItemSummary.ADAPTER.encodeWithTag(protoWriter, 23, localMenuItem.preordering_summary);
        protoWriter.writeBytes(localMenuItem.unknownFields());
    }
}
