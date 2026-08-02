package com.squareup.protos.cash.discover.api.app.v1.model;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.decode.ImageSource;
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
public final class ShopInfoHalfSheet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ImageSource.Metadata metadata;
        ImageSource.Metadata shopInfoHalfSheet$Content$Picture;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        ImageSource.Metadata metadata2 = null;
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
                return new ShopInfoHalfSheet(metadata2, (Integer) obj, (HorizontalAlignment) obj2, (Text) obj3, (Text) obj4, m, (Button) obj5, (Text) obj6, (DisplayCriteria) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    shopInfoHalfSheet$Content$Picture = new ShopInfoHalfSheet$Content$Picture((Image) Image.ADAPTER.decode(protoReader));
                    metadata2 = shopInfoHalfSheet$Content$Picture;
                    break;
                case 2:
                    obj3 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj3);
                    break;
                case 3:
                    obj4 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj4);
                    break;
                case 4:
                    metadata = metadata2;
                    m.add(Bullet.ADAPTER.decode(protoReader));
                    metadata2 = metadata;
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    shopInfoHalfSheet$Content$Picture = new ShopInfoHalfSheet$Content$Avatar((Avatar) Avatar.ADAPTER.decode(protoReader));
                    metadata2 = shopInfoHalfSheet$Content$Picture;
                    break;
                case 8:
                    obj = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 9:
                    metadata = metadata2;
                    Object obj8 = obj;
                    try {
                        metadata2 = metadata;
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
                        metadata = metadata2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        obj = obj;
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    metadata = metadata2;
                    metadata2 = metadata;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShopInfoHalfSheet shopInfoHalfSheet = (ShopInfoHalfSheet) obj;
        reverseProtoWriter.getClass();
        shopInfoHalfSheet.getClass();
        reverseProtoWriter.writeBytes(shopInfoHalfSheet.unknownFields());
        ImageSource.Metadata metadata = shopInfoHalfSheet.content;
        if (metadata instanceof ShopInfoHalfSheet$Content$Picture) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ShopInfoHalfSheet$Content$Picture) metadata).value);
        } else if (metadata instanceof ShopInfoHalfSheet$Content$Avatar) {
            Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((ShopInfoHalfSheet$Content$Avatar) metadata).value);
        } else if (metadata != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        DisplayCriteria.ADAPTER.encodeWithTag(reverseProtoWriter, 10, shopInfoHalfSheet.display_criteria);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, shopInfoHalfSheet.footer);
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 5, shopInfoHalfSheet.action_button);
        Bullet.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, shopInfoHalfSheet.bullets);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, shopInfoHalfSheet.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, shopInfoHalfSheet.title);
        HorizontalAlignment.ADAPTER.encodeWithTag(reverseProtoWriter, 9, shopInfoHalfSheet.image_horizontal_alignment);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 8, shopInfoHalfSheet.image_max_px_height);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ShopInfoHalfSheet shopInfoHalfSheet = (ShopInfoHalfSheet) obj;
        shopInfoHalfSheet.getClass();
        int size$okio = shopInfoHalfSheet.unknownFields().getSize$okio();
        ImageSource.Metadata metadata = shopInfoHalfSheet.content;
        if (metadata instanceof ShopInfoHalfSheet$Content$Picture) {
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, ((ShopInfoHalfSheet$Content$Picture) metadata).value);
        } else {
            if (!(metadata instanceof ShopInfoHalfSheet$Content$Avatar)) {
                if (metadata != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                int encodedSizeWithTag2 = HorizontalAlignment.ADAPTER.encodedSizeWithTag(9, shopInfoHalfSheet.image_horizontal_alignment) + ProtoAdapter.INT32.encodedSizeWithTag(8, shopInfoHalfSheet.image_max_px_height) + size$okio;
                ProtoAdapter protoAdapter = Text.ADAPTER;
                return DisplayCriteria.ADAPTER.encodedSizeWithTag(10, shopInfoHalfSheet.display_criteria) + protoAdapter.encodedSizeWithTag(6, shopInfoHalfSheet.footer) + Button.ADAPTER.encodedSizeWithTag(5, shopInfoHalfSheet.action_button) + Bullet.ADAPTER.asRepeated().encodedSizeWithTag(4, shopInfoHalfSheet.bullets) + protoAdapter.encodedSizeWithTag(3, shopInfoHalfSheet.subtitle) + protoAdapter.encodedSizeWithTag(2, shopInfoHalfSheet.title) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(7, ((ShopInfoHalfSheet$Content$Avatar) metadata).value);
        }
        size$okio += encodedSizeWithTag;
        int encodedSizeWithTag22 = HorizontalAlignment.ADAPTER.encodedSizeWithTag(9, shopInfoHalfSheet.image_horizontal_alignment) + ProtoAdapter.INT32.encodedSizeWithTag(8, shopInfoHalfSheet.image_max_px_height) + size$okio;
        ProtoAdapter protoAdapter2 = Text.ADAPTER;
        return DisplayCriteria.ADAPTER.encodedSizeWithTag(10, shopInfoHalfSheet.display_criteria) + protoAdapter2.encodedSizeWithTag(6, shopInfoHalfSheet.footer) + Button.ADAPTER.encodedSizeWithTag(5, shopInfoHalfSheet.action_button) + Bullet.ADAPTER.asRepeated().encodedSizeWithTag(4, shopInfoHalfSheet.bullets) + protoAdapter2.encodedSizeWithTag(3, shopInfoHalfSheet.subtitle) + protoAdapter2.encodedSizeWithTag(2, shopInfoHalfSheet.title) + encodedSizeWithTag22;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShopInfoHalfSheet shopInfoHalfSheet = (ShopInfoHalfSheet) obj;
        shopInfoHalfSheet.getClass();
        Text text = shopInfoHalfSheet.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = shopInfoHalfSheet.subtitle;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(shopInfoHalfSheet.bullets, Bullet.ADAPTER);
        Button button = shopInfoHalfSheet.action_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        Text text5 = shopInfoHalfSheet.footer;
        Text text6 = text5 != null ? (Text) Text.ADAPTER.redact(text5) : null;
        ByteString byteString = ByteString.EMPTY;
        ImageSource.Metadata metadata = shopInfoHalfSheet.content;
        Integer num = shopInfoHalfSheet.image_max_px_height;
        HorizontalAlignment horizontalAlignment = shopInfoHalfSheet.image_horizontal_alignment;
        DisplayCriteria displayCriteria = shopInfoHalfSheet.display_criteria;
        byteString.getClass();
        return new ShopInfoHalfSheet(metadata, num, horizontalAlignment, text2, text4, m1169redactElements, button2, text6, displayCriteria, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShopInfoHalfSheet shopInfoHalfSheet = (ShopInfoHalfSheet) obj;
        shopInfoHalfSheet.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, shopInfoHalfSheet.image_max_px_height);
        HorizontalAlignment.ADAPTER.encodeWithTag(protoWriter, 9, shopInfoHalfSheet.image_horizontal_alignment);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, shopInfoHalfSheet.title);
        protoAdapter.encodeWithTag(protoWriter, 3, shopInfoHalfSheet.subtitle);
        Bullet.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, shopInfoHalfSheet.bullets);
        Button.ADAPTER.encodeWithTag(protoWriter, 5, shopInfoHalfSheet.action_button);
        protoAdapter.encodeWithTag(protoWriter, 6, shopInfoHalfSheet.footer);
        DisplayCriteria.ADAPTER.encodeWithTag(protoWriter, 10, shopInfoHalfSheet.display_criteria);
        ImageSource.Metadata metadata = shopInfoHalfSheet.content;
        if (metadata instanceof ShopInfoHalfSheet$Content$Picture) {
            Image.ADAPTER.encodeWithTag(protoWriter, 1, ((ShopInfoHalfSheet$Content$Picture) metadata).value);
        } else if (metadata instanceof ShopInfoHalfSheet$Content$Avatar) {
            Avatar.ADAPTER.encodeWithTag(protoWriter, 7, ((ShopInfoHalfSheet$Content$Avatar) metadata).value);
        } else if (metadata != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(shopInfoHalfSheet.unknownFields());
    }
}
