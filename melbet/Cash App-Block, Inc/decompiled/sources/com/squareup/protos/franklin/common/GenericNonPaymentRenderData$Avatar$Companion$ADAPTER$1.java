package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.GenericNonPaymentRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GenericNonPaymentRenderData$Avatar$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericNonPaymentRenderData.Avatar((Boolean) obj5, (String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericNonPaymentRenderData.Avatar avatar = (GenericNonPaymentRenderData.Avatar) obj;
        reverseProtoWriter.getClass();
        avatar.getClass();
        reverseProtoWriter.writeBytes(avatar.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, avatar.initial);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, avatar.colorize_image);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, avatar.dark_theme_accent_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, avatar.dark_theme_image_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, avatar.accent_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, avatar.image_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericNonPaymentRenderData.Avatar avatar = (GenericNonPaymentRenderData.Avatar) obj;
        avatar.getClass();
        int size$okio = avatar.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, avatar.initial) + ProtoAdapter.BOOL.encodedSizeWithTag(5, avatar.colorize_image) + protoAdapter.encodedSizeWithTag(4, avatar.dark_theme_accent_color) + protoAdapter.encodedSizeWithTag(3, avatar.dark_theme_image_url) + protoAdapter.encodedSizeWithTag(2, avatar.accent_color) + protoAdapter.encodedSizeWithTag(1, avatar.image_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericNonPaymentRenderData.Avatar avatar = (GenericNonPaymentRenderData.Avatar) obj;
        avatar.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = avatar.image_url;
        String str2 = avatar.accent_color;
        String str3 = avatar.dark_theme_image_url;
        String str4 = avatar.dark_theme_accent_color;
        Boolean bool = avatar.colorize_image;
        byteString.getClass();
        return new GenericNonPaymentRenderData.Avatar(bool, str, str2, str3, str4, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericNonPaymentRenderData.Avatar avatar = (GenericNonPaymentRenderData.Avatar) obj;
        avatar.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, avatar.image_url);
        protoAdapter.encodeWithTag(protoWriter, 2, avatar.accent_color);
        protoAdapter.encodeWithTag(protoWriter, 3, avatar.dark_theme_image_url);
        protoAdapter.encodeWithTag(protoWriter, 4, avatar.dark_theme_accent_color);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, avatar.colorize_image);
        protoAdapter.encodeWithTag(protoWriter, 6, avatar.initial);
        protoWriter.writeBytes(avatar.unknownFields());
    }
}
