package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.common.RoundUpsElement;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RoundUpsElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RoundUpsElement((RoundUpsElement.Icon) obj4, (String) obj5, (LocalizableString) obj6, (String) obj7, (LocalizableString) obj8, (Color) obj9, (Color) obj10, (String) obj11, (LocalizableString) obj12, (RoundUpsElement.Font) obj13, (String) obj14, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    try {
                        obj4 = RoundUpsElement.Icon.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj5 = obj2;
                    obj6 = obj3;
                    break;
                case 2:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj9 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj9);
                    break;
                case 5:
                    obj10 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj10);
                    break;
                case 6:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    try {
                        obj13 = RoundUpsElement.Font.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj4;
                        obj2 = obj5;
                        obj3 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 8:
                    obj14 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj6);
                    break;
                case 10:
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj8);
                    break;
                case 11:
                    obj12 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj12);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    obj4 = obj;
                    obj5 = obj2;
                    obj6 = obj3;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RoundUpsElement roundUpsElement = (RoundUpsElement) obj;
        reverseProtoWriter.getClass();
        roundUpsElement.getClass();
        reverseProtoWriter.writeBytes(roundUpsElement.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, roundUpsElement.client_route);
        RoundUpsElement.Font.ADAPTER.encodeWithTag(reverseProtoWriter, 7, roundUpsElement.info_text_font);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, roundUpsElement.localizable_accessibility_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, roundUpsElement.accessibility_text);
        ProtoAdapter protoAdapter3 = Color.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, roundUpsElement.info_text_background_color);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 4, roundUpsElement.info_text_color);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, roundUpsElement.localizable_info_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, roundUpsElement.info_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, roundUpsElement.localizable_main_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, roundUpsElement.main_text);
        RoundUpsElement.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, roundUpsElement.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RoundUpsElement roundUpsElement = (RoundUpsElement) obj;
        roundUpsElement.getClass();
        int encodedSizeWithTag = RoundUpsElement.Icon.ADAPTER.encodedSizeWithTag(1, roundUpsElement.icon) + roundUpsElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, roundUpsElement.main_text) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(10, roundUpsElement.localizable_info_text) + protoAdapter.encodedSizeWithTag(3, roundUpsElement.info_text) + protoAdapter2.encodedSizeWithTag(9, roundUpsElement.localizable_main_text) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = Color.ADAPTER;
        return protoAdapter.encodedSizeWithTag(8, roundUpsElement.client_route) + RoundUpsElement.Font.ADAPTER.encodedSizeWithTag(7, roundUpsElement.info_text_font) + protoAdapter2.encodedSizeWithTag(11, roundUpsElement.localizable_accessibility_text) + protoAdapter.encodedSizeWithTag(6, roundUpsElement.accessibility_text) + protoAdapter3.encodedSizeWithTag(5, roundUpsElement.info_text_background_color) + protoAdapter3.encodedSizeWithTag(4, roundUpsElement.info_text_color) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RoundUpsElement roundUpsElement = (RoundUpsElement) obj;
        roundUpsElement.getClass();
        LocalizableString localizableString = roundUpsElement.localizable_main_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = roundUpsElement.localizable_info_text;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        Color color = roundUpsElement.info_text_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = roundUpsElement.info_text_background_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        LocalizableString localizableString5 = roundUpsElement.localizable_accessibility_text;
        return RoundUpsElement.copy$default(roundUpsElement, localizableString2, null, localizableString4, color2, color4, localizableString5 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString5) : null, ByteString.EMPTY, 1675);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RoundUpsElement roundUpsElement = (RoundUpsElement) obj;
        roundUpsElement.getClass();
        RoundUpsElement.Icon.ADAPTER.encodeWithTag(protoWriter, 1, roundUpsElement.icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, roundUpsElement.main_text);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 9, roundUpsElement.localizable_main_text);
        protoAdapter.encodeWithTag(protoWriter, 3, roundUpsElement.info_text);
        protoAdapter2.encodeWithTag(protoWriter, 10, roundUpsElement.localizable_info_text);
        ProtoAdapter protoAdapter3 = Color.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 4, roundUpsElement.info_text_color);
        protoAdapter3.encodeWithTag(protoWriter, 5, roundUpsElement.info_text_background_color);
        protoAdapter.encodeWithTag(protoWriter, 6, roundUpsElement.accessibility_text);
        protoAdapter2.encodeWithTag(protoWriter, 11, roundUpsElement.localizable_accessibility_text);
        RoundUpsElement.Font.ADAPTER.encodeWithTag(protoWriter, 7, roundUpsElement.info_text_font);
        protoAdapter.encodeWithTag(protoWriter, 8, roundUpsElement.client_route);
        protoWriter.writeBytes(roundUpsElement.unknownFields());
    }
}
