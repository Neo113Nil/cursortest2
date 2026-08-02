package com.squareup.protos.cash.discover.api.app.v1.model;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.decode.ImageSourceKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ShopInfoResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ImageSourceKt imageSourceKt;
        ImageSourceKt shopInfoResponse$Content$Picture;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        ImageSourceKt imageSourceKt2 = null;
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
                return new ShopInfoResponse(imageSourceKt2, (Integer) obj, (HorizontalAlignment) obj2, (Text) obj3, (Text) obj4, m, (Button) obj5, (Text) obj6, (DisplayCriteria) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    shopInfoResponse$Content$Picture = new ShopInfoResponse$Content$Picture((Image) Image.ADAPTER.decode(protoReader));
                    imageSourceKt2 = shopInfoResponse$Content$Picture;
                    break;
                case 2:
                    obj3 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj3);
                    break;
                case 3:
                    obj4 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj4);
                    break;
                case 4:
                    imageSourceKt = imageSourceKt2;
                    m.add(Bullet.ADAPTER.decode(protoReader));
                    imageSourceKt2 = imageSourceKt;
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    shopInfoResponse$Content$Picture = new ShopInfoResponse$Content$Avatar((Avatar) Avatar.ADAPTER.decode(protoReader));
                    imageSourceKt2 = shopInfoResponse$Content$Picture;
                    break;
                case 8:
                    obj = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 9:
                    imageSourceKt = imageSourceKt2;
                    Object obj8 = obj;
                    try {
                        imageSourceKt2 = imageSourceKt;
                        obj2 = HorizontalAlignment.ADAPTER.decode(protoReader);
                        obj = obj8;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj8;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 10:
                    try {
                        obj7 = DisplayCriteria.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        imageSourceKt = imageSourceKt2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        obj = obj;
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    imageSourceKt = imageSourceKt2;
                    imageSourceKt2 = imageSourceKt;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShopInfoResponse shopInfoResponse = (ShopInfoResponse) obj;
        reverseProtoWriter.getClass();
        shopInfoResponse.getClass();
        reverseProtoWriter.writeBytes(shopInfoResponse.unknownFields());
        ImageSourceKt imageSourceKt = shopInfoResponse.content;
        if (imageSourceKt instanceof ShopInfoResponse$Content$Picture) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ShopInfoResponse$Content$Picture) imageSourceKt).value);
        } else if (imageSourceKt instanceof ShopInfoResponse$Content$Avatar) {
            Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((ShopInfoResponse$Content$Avatar) imageSourceKt).value);
        } else if (imageSourceKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        DisplayCriteria.ADAPTER.encodeWithTag(reverseProtoWriter, 10, shopInfoResponse.display_criteria);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, shopInfoResponse.footer);
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 5, shopInfoResponse.action_button);
        Bullet.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, shopInfoResponse.bullets);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, shopInfoResponse.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, shopInfoResponse.title);
        HorizontalAlignment.ADAPTER.encodeWithTag(reverseProtoWriter, 9, shopInfoResponse.image_horizontal_alignment);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 8, shopInfoResponse.image_max_px_height);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ShopInfoResponse shopInfoResponse = (ShopInfoResponse) obj;
        shopInfoResponse.getClass();
        int size$okio = shopInfoResponse.unknownFields().getSize$okio();
        ImageSourceKt imageSourceKt = shopInfoResponse.content;
        if (imageSourceKt instanceof ShopInfoResponse$Content$Picture) {
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, ((ShopInfoResponse$Content$Picture) imageSourceKt).value);
        } else {
            if (!(imageSourceKt instanceof ShopInfoResponse$Content$Avatar)) {
                if (imageSourceKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                int encodedSizeWithTag2 = HorizontalAlignment.ADAPTER.encodedSizeWithTag(9, shopInfoResponse.image_horizontal_alignment) + ProtoAdapter.INT32.encodedSizeWithTag(8, shopInfoResponse.image_max_px_height) + size$okio;
                ProtoAdapter protoAdapter = Text.ADAPTER;
                return DisplayCriteria.ADAPTER.encodedSizeWithTag(10, shopInfoResponse.display_criteria) + protoAdapter.encodedSizeWithTag(6, shopInfoResponse.footer) + Button.ADAPTER.encodedSizeWithTag(5, shopInfoResponse.action_button) + Bullet.ADAPTER.asRepeated().encodedSizeWithTag(4, shopInfoResponse.bullets) + protoAdapter.encodedSizeWithTag(3, shopInfoResponse.subtitle) + protoAdapter.encodedSizeWithTag(2, shopInfoResponse.title) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(7, ((ShopInfoResponse$Content$Avatar) imageSourceKt).value);
        }
        size$okio += encodedSizeWithTag;
        int encodedSizeWithTag22 = HorizontalAlignment.ADAPTER.encodedSizeWithTag(9, shopInfoResponse.image_horizontal_alignment) + ProtoAdapter.INT32.encodedSizeWithTag(8, shopInfoResponse.image_max_px_height) + size$okio;
        ProtoAdapter protoAdapter2 = Text.ADAPTER;
        return DisplayCriteria.ADAPTER.encodedSizeWithTag(10, shopInfoResponse.display_criteria) + protoAdapter2.encodedSizeWithTag(6, shopInfoResponse.footer) + Button.ADAPTER.encodedSizeWithTag(5, shopInfoResponse.action_button) + Bullet.ADAPTER.asRepeated().encodedSizeWithTag(4, shopInfoResponse.bullets) + protoAdapter2.encodedSizeWithTag(3, shopInfoResponse.subtitle) + protoAdapter2.encodedSizeWithTag(2, shopInfoResponse.title) + encodedSizeWithTag22;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShopInfoResponse shopInfoResponse = (ShopInfoResponse) obj;
        shopInfoResponse.getClass();
        Text text = shopInfoResponse.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = shopInfoResponse.subtitle;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(shopInfoResponse.bullets, Bullet.ADAPTER);
        Button button = shopInfoResponse.action_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        Text text5 = shopInfoResponse.footer;
        Text text6 = text5 != null ? (Text) Text.ADAPTER.redact(text5) : null;
        ByteString byteString = ByteString.EMPTY;
        ImageSourceKt imageSourceKt = shopInfoResponse.content;
        Integer num = shopInfoResponse.image_max_px_height;
        HorizontalAlignment horizontalAlignment = shopInfoResponse.image_horizontal_alignment;
        DisplayCriteria displayCriteria = shopInfoResponse.display_criteria;
        byteString.getClass();
        return new ShopInfoResponse(imageSourceKt, num, horizontalAlignment, text2, text4, m1169redactElements, button2, text6, displayCriteria, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShopInfoResponse shopInfoResponse = (ShopInfoResponse) obj;
        shopInfoResponse.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, shopInfoResponse.image_max_px_height);
        HorizontalAlignment.ADAPTER.encodeWithTag(protoWriter, 9, shopInfoResponse.image_horizontal_alignment);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, shopInfoResponse.title);
        protoAdapter.encodeWithTag(protoWriter, 3, shopInfoResponse.subtitle);
        Bullet.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, shopInfoResponse.bullets);
        Button.ADAPTER.encodeWithTag(protoWriter, 5, shopInfoResponse.action_button);
        protoAdapter.encodeWithTag(protoWriter, 6, shopInfoResponse.footer);
        DisplayCriteria.ADAPTER.encodeWithTag(protoWriter, 10, shopInfoResponse.display_criteria);
        ImageSourceKt imageSourceKt = shopInfoResponse.content;
        if (imageSourceKt instanceof ShopInfoResponse$Content$Picture) {
            Image.ADAPTER.encodeWithTag(protoWriter, 1, ((ShopInfoResponse$Content$Picture) imageSourceKt).value);
        } else if (imageSourceKt instanceof ShopInfoResponse$Content$Avatar) {
            Avatar.ADAPTER.encodeWithTag(protoWriter, 7, ((ShopInfoResponse$Content$Avatar) imageSourceKt).value);
        } else if (imageSourceKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(shopInfoResponse.unknownFields());
    }
}
