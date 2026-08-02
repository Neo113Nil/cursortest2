package com.squareup.protos.cash.local.client.app.v1.card;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.app.v1.card.LocalCard;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalCard$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002a. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        LocalCard$TypeDetails$BrandCardDetails localCard$TypeDetails$BrandCardDetails = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj11 = obj3;
            if (nextTag == -1) {
                return new LocalCard((String) obj2, (String) obj11, m, (String) obj4, arrayList, arrayList2, (String) obj5, localCard$TypeDetails$BrandCardDetails, (LocalCard.ColorPalette) obj6, (MiniCard) obj7, (Image) obj8, (String) obj9, (Color) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj11;
                    break;
                case 2:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    obj = obj2;
                    break;
                case 3:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    obj3 = obj11;
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj11;
                    obj = obj2;
                    break;
                case 5:
                    arrayList.add(LocalCard.ActionButton.ADAPTER.decode(protoReader));
                    obj = obj2;
                    obj3 = obj11;
                    break;
                case 6:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj11;
                    obj = obj2;
                    break;
                case 7:
                    localCard$TypeDetails$BrandCardDetails = new LocalCard$TypeDetails$BrandCardDetails((BrandCardDetails) BrandCardDetails.ADAPTER.decode(protoReader));
                    obj3 = obj11;
                    obj = obj2;
                    break;
                case 8:
                    m.add(Image.ADAPTER.decode(protoReader));
                    obj = obj2;
                    obj3 = obj11;
                    break;
                case 9:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalCard.ColorPalette.ADAPTER, protoReader, obj6);
                    obj3 = obj11;
                    obj = obj2;
                    break;
                case 10:
                    obj7 = TransactorKt.decodeMessageOrMerge(MiniCard.ADAPTER, protoReader, obj7);
                    obj3 = obj11;
                    obj = obj2;
                    break;
                case 11:
                    arrayList2.add(LocalCard.ActionButton.ADAPTER.decode(protoReader));
                    obj = obj2;
                    obj3 = obj11;
                    break;
                case 12:
                    obj8 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj8);
                    obj3 = obj11;
                    obj = obj2;
                    break;
                case 13:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj11;
                    obj = obj2;
                    break;
                case 14:
                    obj10 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj10);
                    obj3 = obj11;
                    obj = obj2;
                    break;
            }
            obj2 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalCard localCard = (LocalCard) obj;
        reverseProtoWriter.getClass();
        localCard.getClass();
        reverseProtoWriter.writeBytes(localCard.unknownFields());
        LocalCard$TypeDetails$BrandCardDetails localCard$TypeDetails$BrandCardDetails = localCard.type_details;
        if (localCard$TypeDetails$BrandCardDetails != null) {
            BrandCardDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 7, localCard$TypeDetails$BrandCardDetails.value);
        } else if (localCard$TypeDetails$BrandCardDetails != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 14, localCard.brand_card_outline_color);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, localCard.cashtag_with_prefix);
        ProtoAdapter protoAdapter2 = Image.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, localCard.artwork_image);
        MiniCard.ADAPTER.encodeWithTag(reverseProtoWriter, 10, localCard.mini_card);
        LocalCard.ColorPalette.ADAPTER.encodeWithTag(reverseProtoWriter, 9, localCard.color_palette);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, localCard.sort_key);
        ProtoAdapter protoAdapter3 = LocalCard.ActionButton.ADAPTER;
        protoAdapter3.asRepeated().encodeWithTag(reverseProtoWriter, 11, localCard.conditional_action_buttons);
        protoAdapter3.asRepeated().encodeWithTag(reverseProtoWriter, 5, localCard.action_buttons);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, localCard.client_route);
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 8, localCard.images);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localCard.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localCard.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalCard localCard = (LocalCard) obj;
        localCard.getClass();
        int size$okio = localCard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, localCard.title) + protoAdapter.encodedSizeWithTag(1, localCard.token) + size$okio;
        ProtoAdapter protoAdapter2 = Image.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(4, localCard.client_route) + protoAdapter2.asRepeated().encodedSizeWithTag(8, localCard.images) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = LocalCard.ActionButton.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(6, localCard.sort_key) + protoAdapter3.asRepeated().encodedSizeWithTag(11, localCard.conditional_action_buttons) + protoAdapter3.asRepeated().encodedSizeWithTag(5, localCard.action_buttons) + encodedSizeWithTag2;
        LocalCard$TypeDetails$BrandCardDetails localCard$TypeDetails$BrandCardDetails = localCard.type_details;
        if (localCard$TypeDetails$BrandCardDetails != null) {
            encodedSizeWithTag3 += BrandCardDetails.ADAPTER.encodedSizeWithTag(7, localCard$TypeDetails$BrandCardDetails.value);
        } else if (localCard$TypeDetails$BrandCardDetails != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        return Color.ADAPTER.encodedSizeWithTag(14, localCard.brand_card_outline_color) + protoAdapter.encodedSizeWithTag(13, localCard.cashtag_with_prefix) + protoAdapter2.encodedSizeWithTag(12, localCard.artwork_image) + MiniCard.ADAPTER.encodedSizeWithTag(10, localCard.mini_card) + LocalCard.ColorPalette.ADAPTER.encodedSizeWithTag(9, localCard.color_palette) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalCard localCard = (LocalCard) obj;
        localCard.getClass();
        List list = localCard.images;
        ProtoAdapter protoAdapter = Image.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        List list2 = localCard.action_buttons;
        ProtoAdapter protoAdapter2 = LocalCard.ActionButton.ADAPTER;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(list2, protoAdapter2);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(localCard.conditional_action_buttons, protoAdapter2);
        LocalCard.ColorPalette colorPalette = localCard.color_palette;
        LocalCard.ColorPalette colorPalette2 = colorPalette != null ? (LocalCard.ColorPalette) LocalCard.ColorPalette.ADAPTER.redact(colorPalette) : null;
        MiniCard miniCard = localCard.mini_card;
        MiniCard miniCard2 = miniCard != null ? (MiniCard) MiniCard.ADAPTER.redact(miniCard) : null;
        Image image = localCard.artwork_image;
        Image image2 = image != null ? (Image) protoAdapter.redact(image) : null;
        Color color = localCard.brand_card_outline_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localCard.token;
        String str2 = localCard.title;
        String str3 = localCard.client_route;
        String str4 = localCard.sort_key;
        LocalCard$TypeDetails$BrandCardDetails localCard$TypeDetails$BrandCardDetails = localCard.type_details;
        String str5 = localCard.cashtag_with_prefix;
        byteString.getClass();
        return new LocalCard(str, str2, m1169redactElements, str3, m1169redactElements2, m1169redactElements3, str4, localCard$TypeDetails$BrandCardDetails, colorPalette2, miniCard2, image2, str5, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalCard localCard = (LocalCard) obj;
        localCard.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localCard.token);
        protoAdapter.encodeWithTag(protoWriter, 2, localCard.title);
        ProtoAdapter protoAdapter2 = Image.ADAPTER;
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 8, localCard.images);
        protoAdapter.encodeWithTag(protoWriter, 4, localCard.client_route);
        ProtoAdapter protoAdapter3 = LocalCard.ActionButton.ADAPTER;
        protoAdapter3.asRepeated().encodeWithTag(protoWriter, 5, localCard.action_buttons);
        protoAdapter3.asRepeated().encodeWithTag(protoWriter, 11, localCard.conditional_action_buttons);
        protoAdapter.encodeWithTag(protoWriter, 6, localCard.sort_key);
        LocalCard.ColorPalette.ADAPTER.encodeWithTag(protoWriter, 9, localCard.color_palette);
        MiniCard.ADAPTER.encodeWithTag(protoWriter, 10, localCard.mini_card);
        protoAdapter2.encodeWithTag(protoWriter, 12, localCard.artwork_image);
        protoAdapter.encodeWithTag(protoWriter, 13, localCard.cashtag_with_prefix);
        Color.ADAPTER.encodeWithTag(protoWriter, 14, localCard.brand_card_outline_color);
        LocalCard$TypeDetails$BrandCardDetails localCard$TypeDetails$BrandCardDetails = localCard.type_details;
        if (localCard$TypeDetails$BrandCardDetails != null) {
            BrandCardDetails.ADAPTER.encodeWithTag(protoWriter, 7, localCard$TypeDetails$BrandCardDetails.value);
        } else if (localCard$TypeDetails$BrandCardDetails != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(localCard.unknownFields());
    }
}
