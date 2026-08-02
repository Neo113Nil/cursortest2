package com.squareup.protos.cash.local.client.app.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ActiveOffer$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ?? r3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Long l = null;
        Long l2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Long l3 = null;
        Integer num = null;
        Long l4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            String str7 = r3;
            if (nextTag == -1) {
                return new ActiveOffer(str7, str, str2, str3, l, l2, str4, str5, str6, l3, num, l4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    r3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    str = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 6:
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 7:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    l3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 11:
                    num = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 12:
                    l4 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
            r3 = str7;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActiveOffer activeOffer = (ActiveOffer) obj;
        reverseProtoWriter.getClass();
        activeOffer.getClass();
        reverseProtoWriter.writeBytes(activeOffer.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, activeOffer.max_discount_amount_cents);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 11, activeOffer.discount_bps);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, activeOffer.discount_amount_cents);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, activeOffer.custom_discount_code);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, activeOffer.discount_code);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, activeOffer.buyer_offer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, activeOffer.ends_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, activeOffer.starts_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, activeOffer.offer_type);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, activeOffer.subject_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, activeOffer.subject_type);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, activeOffer.offer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActiveOffer activeOffer = (ActiveOffer) obj;
        activeOffer.getClass();
        int size$okio = activeOffer.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, activeOffer.offer_type) + protoAdapter.encodedSizeWithTag(3, activeOffer.subject_token) + protoAdapter.encodedSizeWithTag(2, activeOffer.subject_type) + protoAdapter.encodedSizeWithTag(1, activeOffer.offer_token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return protoAdapter2.encodedSizeWithTag(12, activeOffer.max_discount_amount_cents) + ProtoAdapter.INT32.encodedSizeWithTag(11, activeOffer.discount_bps) + protoAdapter2.encodedSizeWithTag(10, activeOffer.discount_amount_cents) + protoAdapter.encodedSizeWithTag(9, activeOffer.custom_discount_code) + protoAdapter.encodedSizeWithTag(8, activeOffer.discount_code) + protoAdapter.encodedSizeWithTag(7, activeOffer.buyer_offer_token) + protoAdapter2.encodedSizeWithTag(6, activeOffer.ends_at) + protoAdapter2.encodedSizeWithTag(5, activeOffer.starts_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActiveOffer activeOffer = (ActiveOffer) obj;
        activeOffer.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = activeOffer.offer_token;
        String str2 = activeOffer.subject_type;
        String str3 = activeOffer.subject_token;
        String str4 = activeOffer.offer_type;
        Long l = activeOffer.starts_at;
        Long l2 = activeOffer.ends_at;
        String str5 = activeOffer.buyer_offer_token;
        String str6 = activeOffer.discount_code;
        String str7 = activeOffer.custom_discount_code;
        Long l3 = activeOffer.discount_amount_cents;
        Integer num = activeOffer.discount_bps;
        Long l4 = activeOffer.max_discount_amount_cents;
        byteString.getClass();
        return new ActiveOffer(str, str2, str3, str4, l, l2, str5, str6, str7, l3, num, l4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActiveOffer activeOffer = (ActiveOffer) obj;
        activeOffer.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, activeOffer.offer_token);
        protoAdapter.encodeWithTag(protoWriter, 2, activeOffer.subject_type);
        protoAdapter.encodeWithTag(protoWriter, 3, activeOffer.subject_token);
        protoAdapter.encodeWithTag(protoWriter, 4, activeOffer.offer_type);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 5, activeOffer.starts_at);
        protoAdapter2.encodeWithTag(protoWriter, 6, activeOffer.ends_at);
        protoAdapter.encodeWithTag(protoWriter, 7, activeOffer.buyer_offer_token);
        protoAdapter.encodeWithTag(protoWriter, 8, activeOffer.discount_code);
        protoAdapter.encodeWithTag(protoWriter, 9, activeOffer.custom_discount_code);
        protoAdapter2.encodeWithTag(protoWriter, 10, activeOffer.discount_amount_cents);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, activeOffer.discount_bps);
        protoAdapter2.encodeWithTag(protoWriter, 12, activeOffer.max_discount_amount_cents);
        protoWriter.writeBytes(activeOffer.unknownFields());
    }
}
