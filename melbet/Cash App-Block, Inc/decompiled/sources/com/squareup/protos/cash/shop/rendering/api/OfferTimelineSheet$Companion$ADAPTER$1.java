package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.OfferTimelineSheet;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OfferTimelineSheet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OfferTimelineSheet((OfferType) obj, (String) obj2, (Image) obj3, m, (Button) obj4, (Button) obj5, (LocalizedString) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 2:
                    try {
                        obj = OfferType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    m.add(OfferTimelineSheet.LineItem.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj5 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj5);
                    break;
                case 8:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OfferTimelineSheet offerTimelineSheet = (OfferTimelineSheet) obj;
        reverseProtoWriter.getClass();
        offerTimelineSheet.getClass();
        reverseProtoWriter.writeBytes(offerTimelineSheet.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, offerTimelineSheet.title);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 9, offerTimelineSheet.l_title);
        ProtoAdapter protoAdapter2 = Button.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, offerTimelineSheet.order_card_button);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, offerTimelineSheet.shop_button);
        OfferTimelineSheet.LineItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, offerTimelineSheet.line_items);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, offerTimelineSheet.picture);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, offerTimelineSheet.boost_token);
        OfferType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, offerTimelineSheet.offer_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OfferTimelineSheet offerTimelineSheet = (OfferTimelineSheet) obj;
        offerTimelineSheet.getClass();
        int encodedSizeWithTag = OfferType.ADAPTER.encodedSizeWithTag(2, offerTimelineSheet.offer_type) + offerTimelineSheet.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = OfferTimelineSheet.LineItem.ADAPTER.asRepeated().encodedSizeWithTag(4, offerTimelineSheet.line_items) + Image.ADAPTER.encodedSizeWithTag(3, offerTimelineSheet.picture) + protoAdapter.encodedSizeWithTag(6, offerTimelineSheet.boost_token) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = Button.ADAPTER;
        return protoAdapter.encodedSizeWithTag(8, offerTimelineSheet.title) + LocalizedString.ADAPTER.encodedSizeWithTag(9, offerTimelineSheet.l_title) + protoAdapter2.encodedSizeWithTag(7, offerTimelineSheet.order_card_button) + protoAdapter2.encodedSizeWithTag(5, offerTimelineSheet.shop_button) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OfferTimelineSheet offerTimelineSheet = (OfferTimelineSheet) obj;
        offerTimelineSheet.getClass();
        Image image = offerTimelineSheet.picture;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(offerTimelineSheet.line_items, OfferTimelineSheet.LineItem.ADAPTER);
        Button button = offerTimelineSheet.shop_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        Button button3 = offerTimelineSheet.order_card_button;
        Button button4 = button3 != null ? (Button) Button.ADAPTER.redact(button3) : null;
        LocalizedString localizedString = offerTimelineSheet.l_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        OfferType offerType = offerTimelineSheet.offer_type;
        String str = offerTimelineSheet.boost_token;
        String str2 = offerTimelineSheet.title;
        byteString.getClass();
        return new OfferTimelineSheet(offerType, str, image2, m1169redactElements, button2, button4, localizedString2, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OfferTimelineSheet offerTimelineSheet = (OfferTimelineSheet) obj;
        offerTimelineSheet.getClass();
        OfferType.ADAPTER.encodeWithTag(protoWriter, 2, offerTimelineSheet.offer_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 6, offerTimelineSheet.boost_token);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, offerTimelineSheet.picture);
        OfferTimelineSheet.LineItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, offerTimelineSheet.line_items);
        ProtoAdapter protoAdapter2 = Button.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 5, offerTimelineSheet.shop_button);
        protoAdapter2.encodeWithTag(protoWriter, 7, offerTimelineSheet.order_card_button);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 9, offerTimelineSheet.l_title);
        protoAdapter.encodeWithTag(protoWriter, 8, offerTimelineSheet.title);
        protoWriter.writeBytes(offerTimelineSheet.unknownFields());
    }
}
