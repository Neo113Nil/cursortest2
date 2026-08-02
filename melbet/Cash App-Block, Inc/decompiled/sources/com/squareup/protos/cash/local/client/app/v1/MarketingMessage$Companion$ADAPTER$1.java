package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MarketingMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        MarketingMessageSubjectType marketingMessageSubjectType;
        String str;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str2 = null;
        Object obj2 = null;
        MarketingMessageSubjectType marketingMessageSubjectType2 = null;
        String str3 = null;
        Object obj3 = null;
        Long l = null;
        Long l2 = null;
        String str4 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Long l3 = null;
        MarketingMessageType marketingMessageType = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MarketingMessage(str2, marketingMessageType, marketingMessageSubjectType2, str3, (MarketingMessageContent) obj3, l, l2, str4, (LocalColor) obj4, (LocalColor) obj5, (LocalImage) obj6, l3, (MarketingMessageBadge) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj = obj2;
                    marketingMessageSubjectType = marketingMessageSubjectType2;
                    str = str3;
                    try {
                        marketingMessageType = MarketingMessageType.ADAPTER.decode(protoReader);
                        obj2 = obj;
                        str3 = str;
                        marketingMessageSubjectType2 = marketingMessageSubjectType;
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    try {
                        marketingMessageSubjectType2 = MarketingMessageSubjectType.ADAPTER.decode(protoReader);
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj2;
                        marketingMessageSubjectType = marketingMessageSubjectType2;
                        str = str3;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 4:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 5:
                    obj3 = TransactorKt.decodeMessageOrMerge(MarketingMessageContent.ADAPTER, protoReader, obj3);
                    decode = str2;
                    break;
                case 6:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    decode = str2;
                    break;
                case 7:
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str2;
                    break;
                case 8:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 9:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj4);
                    decode = str2;
                    break;
                case 10:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj5);
                    decode = str2;
                    break;
                case 11:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj6);
                    decode = str2;
                    break;
                case 12:
                    l3 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str2;
                    break;
                case 13:
                    obj2 = TransactorKt.decodeMessageOrMerge(MarketingMessageBadge.ADAPTER, protoReader, obj2);
                    decode = str2;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    marketingMessageSubjectType = marketingMessageSubjectType2;
                    str = str3;
                    decode = str2;
                    obj2 = obj;
                    str3 = str;
                    marketingMessageSubjectType2 = marketingMessageSubjectType;
                    break;
            }
            str2 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MarketingMessage marketingMessage = (MarketingMessage) obj;
        reverseProtoWriter.getClass();
        marketingMessage.getClass();
        reverseProtoWriter.writeBytes(marketingMessage.unknownFields());
        MarketingMessageBadge.ADAPTER.encodeWithTag(reverseProtoWriter, 13, marketingMessage.badge);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, marketingMessage.viewed_at_ms);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 11, marketingMessage.logo);
        ProtoAdapter protoAdapter2 = LocalColor.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, marketingMessage.background_color);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, marketingMessage.foreground_color);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 8, marketingMessage.cashtag);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, marketingMessage.ends_at_ms);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, marketingMessage.starts_at_ms);
        MarketingMessageContent.ADAPTER.encodeWithTag(reverseProtoWriter, 5, marketingMessage.content);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 4, marketingMessage.subject_token);
        MarketingMessageSubjectType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, marketingMessage.subject_type);
        MarketingMessageType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, marketingMessage.f1303type);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, marketingMessage.story_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MarketingMessage marketingMessage = (MarketingMessage) obj;
        marketingMessage.getClass();
        int size$okio = marketingMessage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = MarketingMessageContent.ADAPTER.encodedSizeWithTag(5, marketingMessage.content) + protoAdapter.encodedSizeWithTag(4, marketingMessage.subject_token) + MarketingMessageSubjectType.ADAPTER.encodedSizeWithTag(3, marketingMessage.subject_type) + MarketingMessageType.ADAPTER.encodedSizeWithTag(2, marketingMessage.f1303type) + protoAdapter.encodedSizeWithTag(1, marketingMessage.story_token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(8, marketingMessage.cashtag) + protoAdapter2.encodedSizeWithTag(7, marketingMessage.ends_at_ms) + protoAdapter2.encodedSizeWithTag(6, marketingMessage.starts_at_ms) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = LocalColor.ADAPTER;
        return MarketingMessageBadge.ADAPTER.encodedSizeWithTag(13, marketingMessage.badge) + protoAdapter2.encodedSizeWithTag(12, marketingMessage.viewed_at_ms) + LocalImage.ADAPTER.encodedSizeWithTag(11, marketingMessage.logo) + protoAdapter3.encodedSizeWithTag(10, marketingMessage.background_color) + protoAdapter3.encodedSizeWithTag(9, marketingMessage.foreground_color) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MarketingMessage marketingMessage = (MarketingMessage) obj;
        marketingMessage.getClass();
        MarketingMessageContent marketingMessageContent = marketingMessage.content;
        MarketingMessageContent marketingMessageContent2 = marketingMessageContent != null ? (MarketingMessageContent) MarketingMessageContent.ADAPTER.redact(marketingMessageContent) : null;
        LocalColor localColor = marketingMessage.foreground_color;
        LocalColor localColor2 = localColor != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor) : null;
        LocalColor localColor3 = marketingMessage.background_color;
        LocalColor localColor4 = localColor3 != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor3) : null;
        LocalImage localImage = marketingMessage.logo;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        MarketingMessageBadge marketingMessageBadge = marketingMessage.badge;
        MarketingMessageBadge marketingMessageBadge2 = marketingMessageBadge != null ? (MarketingMessageBadge) MarketingMessageBadge.ADAPTER.redact(marketingMessageBadge) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = marketingMessage.story_token;
        MarketingMessageType marketingMessageType = marketingMessage.f1303type;
        MarketingMessageSubjectType marketingMessageSubjectType = marketingMessage.subject_type;
        String str2 = marketingMessage.subject_token;
        Long l = marketingMessage.starts_at_ms;
        Long l2 = marketingMessage.ends_at_ms;
        Long l3 = marketingMessage.viewed_at_ms;
        byteString.getClass();
        return new MarketingMessage(str, marketingMessageType, marketingMessageSubjectType, str2, marketingMessageContent2, l, l2, null, localColor2, localColor4, localImage2, l3, marketingMessageBadge2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MarketingMessage marketingMessage = (MarketingMessage) obj;
        marketingMessage.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, marketingMessage.story_token);
        MarketingMessageType.ADAPTER.encodeWithTag(protoWriter, 2, marketingMessage.f1303type);
        MarketingMessageSubjectType.ADAPTER.encodeWithTag(protoWriter, 3, marketingMessage.subject_type);
        protoAdapter.encodeWithTag(protoWriter, 4, marketingMessage.subject_token);
        MarketingMessageContent.ADAPTER.encodeWithTag(protoWriter, 5, marketingMessage.content);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 6, marketingMessage.starts_at_ms);
        protoAdapter2.encodeWithTag(protoWriter, 7, marketingMessage.ends_at_ms);
        protoAdapter.encodeWithTag(protoWriter, 8, marketingMessage.cashtag);
        ProtoAdapter protoAdapter3 = LocalColor.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 9, marketingMessage.foreground_color);
        protoAdapter3.encodeWithTag(protoWriter, 10, marketingMessage.background_color);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 11, marketingMessage.logo);
        protoAdapter2.encodeWithTag(protoWriter, 12, marketingMessage.viewed_at_ms);
        MarketingMessageBadge.ADAPTER.encodeWithTag(protoWriter, 13, marketingMessage.badge);
        protoWriter.writeBytes(marketingMessage.unknownFields());
    }
}
