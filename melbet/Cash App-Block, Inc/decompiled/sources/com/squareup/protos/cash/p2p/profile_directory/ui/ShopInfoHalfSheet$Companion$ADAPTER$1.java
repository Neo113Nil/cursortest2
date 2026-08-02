package com.squareup.protos.cash.p2p.profile_directory.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import com.squareup.protos.cash.p2p.profile_directory.ui.ShopInfoHalfSheet;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.AppLinks;
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
        Object obj;
        zzkd shopInfoHalfSheet$Content$Picture;
        zzkd zzkdVar;
        Object obj2;
        Object obj3;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        zzkd zzkdVar2 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShopInfoHalfSheet(zzkdVar2, (Integer) obj4, (HorizontalAlignment) obj5, (Text) obj6, (Text) obj7, m, (Button) obj8, (Text) obj9, (ShopInfoHalfSheet.DisplayCriteria) obj10, (AppLinks) obj11, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj4;
                    shopInfoHalfSheet$Content$Picture = new ShopInfoHalfSheet$Content$Picture((Image) Image.ADAPTER.decode(protoReader));
                    zzkdVar2 = shopInfoHalfSheet$Content$Picture;
                    obj4 = obj;
                    break;
                case 2:
                    obj = obj4;
                    obj6 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj6);
                    obj4 = obj;
                    break;
                case 3:
                    obj = obj4;
                    obj7 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj7);
                    obj4 = obj;
                    break;
                case 4:
                    zzkdVar = zzkdVar2;
                    obj = obj4;
                    obj2 = obj10;
                    obj3 = obj11;
                    m.add(Bullet.ADAPTER.decode(protoReader));
                    zzkdVar2 = zzkdVar;
                    obj11 = obj3;
                    obj10 = obj2;
                    obj4 = obj;
                    break;
                case 5:
                    obj = obj4;
                    obj8 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj8);
                    obj4 = obj;
                    break;
                case 6:
                    obj = obj4;
                    obj9 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj9);
                    obj4 = obj;
                    break;
                case 7:
                    obj = obj4;
                    shopInfoHalfSheet$Content$Picture = new ShopInfoHalfSheet$Content$Avatar((Avatar) Avatar.ADAPTER.decode(protoReader));
                    zzkdVar2 = shopInfoHalfSheet$Content$Picture;
                    obj4 = obj;
                    break;
                case 8:
                    obj4 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 9:
                    zzkdVar = zzkdVar2;
                    obj = obj4;
                    try {
                        zzkdVar2 = zzkdVar;
                        obj5 = HorizontalAlignment.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj2 = obj10;
                        obj3 = obj11;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj4 = obj;
                    break;
                case 10:
                    try {
                        obj10 = ShopInfoHalfSheet.DisplayCriteria.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        zzkdVar = zzkdVar2;
                        obj = obj4;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 11:
                    obj11 = TransactorKt.decodeMessageOrMerge(AppLinks.ADAPTER, protoReader, obj11);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    zzkdVar = zzkdVar2;
                    obj = obj4;
                    obj2 = obj10;
                    obj3 = obj11;
                    zzkdVar2 = zzkdVar;
                    obj11 = obj3;
                    obj10 = obj2;
                    obj4 = obj;
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
        zzkd zzkdVar = shopInfoHalfSheet.content;
        if (zzkdVar instanceof ShopInfoHalfSheet$Content$Picture) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ShopInfoHalfSheet$Content$Picture) zzkdVar).value);
        } else if (zzkdVar instanceof ShopInfoHalfSheet$Content$Avatar) {
            Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((ShopInfoHalfSheet$Content$Avatar) zzkdVar).value);
        } else if (zzkdVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        AppLinks.ADAPTER.encodeWithTag(reverseProtoWriter, 11, shopInfoHalfSheet.app_links);
        ShopInfoHalfSheet.DisplayCriteria.ADAPTER.encodeWithTag(reverseProtoWriter, 10, shopInfoHalfSheet.display_criteria);
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
        zzkd zzkdVar = shopInfoHalfSheet.content;
        if (zzkdVar instanceof ShopInfoHalfSheet$Content$Picture) {
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, ((ShopInfoHalfSheet$Content$Picture) zzkdVar).value);
        } else {
            if (!(zzkdVar instanceof ShopInfoHalfSheet$Content$Avatar)) {
                if (zzkdVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                int encodedSizeWithTag2 = HorizontalAlignment.ADAPTER.encodedSizeWithTag(9, shopInfoHalfSheet.image_horizontal_alignment) + ProtoAdapter.INT32.encodedSizeWithTag(8, shopInfoHalfSheet.image_max_px_height) + size$okio;
                ProtoAdapter protoAdapter = Text.ADAPTER;
                return AppLinks.ADAPTER.encodedSizeWithTag(11, shopInfoHalfSheet.app_links) + ShopInfoHalfSheet.DisplayCriteria.ADAPTER.encodedSizeWithTag(10, shopInfoHalfSheet.display_criteria) + protoAdapter.encodedSizeWithTag(6, shopInfoHalfSheet.footer) + Button.ADAPTER.encodedSizeWithTag(5, shopInfoHalfSheet.action_button) + Bullet.ADAPTER.asRepeated().encodedSizeWithTag(4, shopInfoHalfSheet.bullets) + protoAdapter.encodedSizeWithTag(3, shopInfoHalfSheet.subtitle) + protoAdapter.encodedSizeWithTag(2, shopInfoHalfSheet.title) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(7, ((ShopInfoHalfSheet$Content$Avatar) zzkdVar).value);
        }
        size$okio += encodedSizeWithTag;
        int encodedSizeWithTag22 = HorizontalAlignment.ADAPTER.encodedSizeWithTag(9, shopInfoHalfSheet.image_horizontal_alignment) + ProtoAdapter.INT32.encodedSizeWithTag(8, shopInfoHalfSheet.image_max_px_height) + size$okio;
        ProtoAdapter protoAdapter2 = Text.ADAPTER;
        return AppLinks.ADAPTER.encodedSizeWithTag(11, shopInfoHalfSheet.app_links) + ShopInfoHalfSheet.DisplayCriteria.ADAPTER.encodedSizeWithTag(10, shopInfoHalfSheet.display_criteria) + protoAdapter2.encodedSizeWithTag(6, shopInfoHalfSheet.footer) + Button.ADAPTER.encodedSizeWithTag(5, shopInfoHalfSheet.action_button) + Bullet.ADAPTER.asRepeated().encodedSizeWithTag(4, shopInfoHalfSheet.bullets) + protoAdapter2.encodedSizeWithTag(3, shopInfoHalfSheet.subtitle) + protoAdapter2.encodedSizeWithTag(2, shopInfoHalfSheet.title) + encodedSizeWithTag22;
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
        AppLinks appLinks = shopInfoHalfSheet.app_links;
        AppLinks appLinks2 = appLinks != null ? (AppLinks) AppLinks.ADAPTER.redact(appLinks) : null;
        ByteString byteString = ByteString.EMPTY;
        zzkd zzkdVar = shopInfoHalfSheet.content;
        Integer num = shopInfoHalfSheet.image_max_px_height;
        HorizontalAlignment horizontalAlignment = shopInfoHalfSheet.image_horizontal_alignment;
        ShopInfoHalfSheet.DisplayCriteria displayCriteria = shopInfoHalfSheet.display_criteria;
        byteString.getClass();
        return new ShopInfoHalfSheet(zzkdVar, num, horizontalAlignment, text2, text4, m1169redactElements, button2, text6, displayCriteria, appLinks2, byteString);
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
        ShopInfoHalfSheet.DisplayCriteria.ADAPTER.encodeWithTag(protoWriter, 10, shopInfoHalfSheet.display_criteria);
        AppLinks.ADAPTER.encodeWithTag(protoWriter, 11, shopInfoHalfSheet.app_links);
        zzkd zzkdVar = shopInfoHalfSheet.content;
        if (zzkdVar instanceof ShopInfoHalfSheet$Content$Picture) {
            Image.ADAPTER.encodeWithTag(protoWriter, 1, ((ShopInfoHalfSheet$Content$Picture) zzkdVar).value);
        } else if (zzkdVar instanceof ShopInfoHalfSheet$Content$Avatar) {
            Avatar.ADAPTER.encodeWithTag(protoWriter, 7, ((ShopInfoHalfSheet$Content$Avatar) zzkdVar).value);
        } else if (zzkdVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(shopInfoHalfSheet.unknownFields());
    }
}
