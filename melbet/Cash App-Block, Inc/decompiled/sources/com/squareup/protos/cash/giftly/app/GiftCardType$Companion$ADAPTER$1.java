package com.squareup.protos.cash.giftly.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GiftCardType$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GiftCardType((String) obj, (String) obj2, (String) obj3, (String) obj4, (Image) obj5, (String) obj6, m, (Color) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj5 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj5);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GiftCardType giftCardType = (GiftCardType) obj;
        reverseProtoWriter.getClass();
        giftCardType.getClass();
        reverseProtoWriter.writeBytes(giftCardType.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 7, giftCardType.themed_color);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 6, giftCardType.category_tokens);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, giftCardType.discount_text);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 8, giftCardType.icon_image);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, giftCardType.dark_theme_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, giftCardType.icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, giftCardType.display_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, giftCardType.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GiftCardType giftCardType = (GiftCardType) obj;
        giftCardType.getClass();
        int size$okio = giftCardType.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Color.ADAPTER.encodedSizeWithTag(7, giftCardType.themed_color) + protoAdapter.asRepeated().encodedSizeWithTag(6, giftCardType.category_tokens) + protoAdapter.encodedSizeWithTag(5, giftCardType.discount_text) + Image.ADAPTER.encodedSizeWithTag(8, giftCardType.icon_image) + protoAdapter.encodedSizeWithTag(4, giftCardType.dark_theme_icon_url) + protoAdapter.encodedSizeWithTag(3, giftCardType.icon_url) + protoAdapter.encodedSizeWithTag(2, giftCardType.display_name) + protoAdapter.encodedSizeWithTag(1, giftCardType.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GiftCardType giftCardType = (GiftCardType) obj;
        giftCardType.getClass();
        Image image = giftCardType.icon_image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Color color = giftCardType.themed_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = giftCardType.token;
        String str2 = giftCardType.display_name;
        String str3 = giftCardType.discount_text;
        List list = giftCardType.category_tokens;
        list.getClass();
        byteString.getClass();
        return new GiftCardType(str, str2, null, null, image2, str3, list, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GiftCardType giftCardType = (GiftCardType) obj;
        giftCardType.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, giftCardType.token);
        protoAdapter.encodeWithTag(protoWriter, 2, giftCardType.display_name);
        protoAdapter.encodeWithTag(protoWriter, 3, giftCardType.icon_url);
        protoAdapter.encodeWithTag(protoWriter, 4, giftCardType.dark_theme_icon_url);
        Image.ADAPTER.encodeWithTag(protoWriter, 8, giftCardType.icon_image);
        protoAdapter.encodeWithTag(protoWriter, 5, giftCardType.discount_text);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 6, giftCardType.category_tokens);
        Color.ADAPTER.encodeWithTag(protoWriter, 7, giftCardType.themed_color);
        protoWriter.writeBytes(giftCardType.unknownFields());
    }
}
