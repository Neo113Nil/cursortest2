package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import app.cash.redwood.yoga.internal.detail.GlobalMembers;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ShopInfoResponse;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ShopInfoResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        GlobalMembers globalMembers;
        GlobalMembers shopInfoResponse$Picture$Image;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        GlobalMembers globalMembers2 = null;
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
                return new ShopInfoResponse(globalMembers2, (Integer) obj, (HorizontalAlignment) obj2, (Text) obj3, (Text) obj4, m, (Button) obj5, (Text) obj6, (ShopInfoResponse.DisplayCriteria) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    shopInfoResponse$Picture$Image = new ShopInfoResponse$Picture$Image((Image) Image.ADAPTER.decode(protoReader));
                    globalMembers2 = shopInfoResponse$Picture$Image;
                    break;
                case 2:
                    obj3 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj3);
                    break;
                case 3:
                    obj4 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj4);
                    break;
                case 4:
                    globalMembers = globalMembers2;
                    m.add(Bullet.ADAPTER.decode(protoReader));
                    globalMembers2 = globalMembers;
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    shopInfoResponse$Picture$Image = new ShopInfoResponse$Picture$Avatar((Avatar) Avatar.ADAPTER.decode(protoReader));
                    globalMembers2 = shopInfoResponse$Picture$Image;
                    break;
                case 8:
                    obj = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 9:
                    globalMembers = globalMembers2;
                    Object obj8 = obj;
                    try {
                        globalMembers2 = globalMembers;
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
                        obj7 = ShopInfoResponse.DisplayCriteria.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        globalMembers = globalMembers2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        obj = obj;
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    globalMembers = globalMembers2;
                    globalMembers2 = globalMembers;
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
        GlobalMembers globalMembers = shopInfoResponse.picture;
        if (globalMembers instanceof ShopInfoResponse$Picture$Image) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ShopInfoResponse$Picture$Image) globalMembers).getValue());
        } else if (globalMembers instanceof ShopInfoResponse$Picture$Avatar) {
            Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((ShopInfoResponse$Picture$Avatar) globalMembers).getValue());
        } else if (globalMembers != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ShopInfoResponse.DisplayCriteria.ADAPTER.encodeWithTag(reverseProtoWriter, 10, shopInfoResponse.display_criteria);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, shopInfoResponse.footer);
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 5, shopInfoResponse.action_button);
        Bullet.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, shopInfoResponse.bullets);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, shopInfoResponse.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, shopInfoResponse.title);
        HorizontalAlignment.ADAPTER.encodeWithTag(reverseProtoWriter, 9, shopInfoResponse.picture_horizontal_alignment);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 8, shopInfoResponse.picture_max_px_height);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ShopInfoResponse shopInfoResponse = (ShopInfoResponse) obj;
        shopInfoResponse.getClass();
        int size$okio = shopInfoResponse.unknownFields().getSize$okio();
        GlobalMembers globalMembers = shopInfoResponse.picture;
        if (globalMembers instanceof ShopInfoResponse$Picture$Image) {
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, ((ShopInfoResponse$Picture$Image) globalMembers).getValue());
        } else {
            if (!(globalMembers instanceof ShopInfoResponse$Picture$Avatar)) {
                if (globalMembers != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                int encodedSizeWithTag2 = HorizontalAlignment.ADAPTER.encodedSizeWithTag(9, shopInfoResponse.picture_horizontal_alignment) + ProtoAdapter.INT32.encodedSizeWithTag(8, shopInfoResponse.picture_max_px_height) + size$okio;
                ProtoAdapter protoAdapter = Text.ADAPTER;
                return ShopInfoResponse.DisplayCriteria.ADAPTER.encodedSizeWithTag(10, shopInfoResponse.display_criteria) + protoAdapter.encodedSizeWithTag(6, shopInfoResponse.footer) + Button.ADAPTER.encodedSizeWithTag(5, shopInfoResponse.action_button) + Bullet.ADAPTER.asRepeated().encodedSizeWithTag(4, shopInfoResponse.bullets) + protoAdapter.encodedSizeWithTag(3, shopInfoResponse.subtitle) + protoAdapter.encodedSizeWithTag(2, shopInfoResponse.title) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(7, ((ShopInfoResponse$Picture$Avatar) globalMembers).getValue());
        }
        size$okio += encodedSizeWithTag;
        int encodedSizeWithTag22 = HorizontalAlignment.ADAPTER.encodedSizeWithTag(9, shopInfoResponse.picture_horizontal_alignment) + ProtoAdapter.INT32.encodedSizeWithTag(8, shopInfoResponse.picture_max_px_height) + size$okio;
        ProtoAdapter protoAdapter2 = Text.ADAPTER;
        return ShopInfoResponse.DisplayCriteria.ADAPTER.encodedSizeWithTag(10, shopInfoResponse.display_criteria) + protoAdapter2.encodedSizeWithTag(6, shopInfoResponse.footer) + Button.ADAPTER.encodedSizeWithTag(5, shopInfoResponse.action_button) + Bullet.ADAPTER.asRepeated().encodedSizeWithTag(4, shopInfoResponse.bullets) + protoAdapter2.encodedSizeWithTag(3, shopInfoResponse.subtitle) + protoAdapter2.encodedSizeWithTag(2, shopInfoResponse.title) + encodedSizeWithTag22;
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
        GlobalMembers globalMembers = shopInfoResponse.picture;
        Integer num = shopInfoResponse.picture_max_px_height;
        HorizontalAlignment horizontalAlignment = shopInfoResponse.picture_horizontal_alignment;
        ShopInfoResponse.DisplayCriteria displayCriteria = shopInfoResponse.display_criteria;
        byteString.getClass();
        return new ShopInfoResponse(globalMembers, num, horizontalAlignment, text2, text4, m1169redactElements, button2, text6, displayCriteria, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShopInfoResponse shopInfoResponse = (ShopInfoResponse) obj;
        shopInfoResponse.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, shopInfoResponse.picture_max_px_height);
        HorizontalAlignment.ADAPTER.encodeWithTag(protoWriter, 9, shopInfoResponse.picture_horizontal_alignment);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, shopInfoResponse.title);
        protoAdapter.encodeWithTag(protoWriter, 3, shopInfoResponse.subtitle);
        Bullet.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, shopInfoResponse.bullets);
        Button.ADAPTER.encodeWithTag(protoWriter, 5, shopInfoResponse.action_button);
        protoAdapter.encodeWithTag(protoWriter, 6, shopInfoResponse.footer);
        ShopInfoResponse.DisplayCriteria.ADAPTER.encodeWithTag(protoWriter, 10, shopInfoResponse.display_criteria);
        GlobalMembers globalMembers = shopInfoResponse.picture;
        if (globalMembers instanceof ShopInfoResponse$Picture$Image) {
            Image.ADAPTER.encodeWithTag(protoWriter, 1, ((ShopInfoResponse$Picture$Image) globalMembers).getValue());
        } else if (globalMembers instanceof ShopInfoResponse$Picture$Avatar) {
            Avatar.ADAPTER.encodeWithTag(protoWriter, 7, ((ShopInfoResponse$Picture$Avatar) globalMembers).getValue());
        } else if (globalMembers != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(shopInfoResponse.unknownFields());
    }
}
