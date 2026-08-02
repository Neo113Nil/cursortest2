package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.Offer;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Offer$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Long l;
        String str;
        String str2;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        String str3 = null;
        Long l2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Object obj = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        Offer.OfferStatus offerStatus = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Offer(str3, l2, str4, str5, m, str6, str7, str8, str9, (LocalImage) obj, str10, str11, str12, offerStatus, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 3:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 4:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 5:
                    l = l2;
                    str = str4;
                    str2 = str5;
                    m.add(LocalCart.Line.ADAPTER.decode(protoReader));
                    decode = str3;
                    l2 = l;
                    str4 = str;
                    str5 = str2;
                    break;
                case 6:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 7:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 8:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 9:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 10:
                    obj = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj);
                    decode = str3;
                    break;
                case 11:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 12:
                    str11 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 13:
                    str12 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 14:
                    try {
                        offerStatus = Offer.OfferStatus.ADAPTER.decode(protoReader);
                        decode = str3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        l = l2;
                        str = str4;
                        str2 = str5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    l = l2;
                    str = str4;
                    str2 = str5;
                    decode = str3;
                    l2 = l;
                    str4 = str;
                    str5 = str2;
                    break;
            }
            str3 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Offer offer = (Offer) obj;
        reverseProtoWriter.getClass();
        offer.getClass();
        reverseProtoWriter.writeBytes(offer.unknownFields());
        Offer.OfferStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 14, offer.status);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, offer.eligible_items);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, offer.validity_terms);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, offer.discount_description);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 10, offer.image);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, offer.terms_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, offer.terms_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, offer.validity_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, offer.redemption_instructions);
        LocalCart.Line.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, offer.offer_lines);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, offer.display_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, offer.coupon_code);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, offer.expires_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, offer.offer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Offer offer = (Offer) obj;
        offer.getClass();
        int size$okio = offer.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Offer.OfferStatus.ADAPTER.encodedSizeWithTag(14, offer.status) + protoAdapter.encodedSizeWithTag(13, offer.eligible_items) + protoAdapter.encodedSizeWithTag(12, offer.validity_terms) + protoAdapter.encodedSizeWithTag(11, offer.discount_description) + LocalImage.ADAPTER.encodedSizeWithTag(10, offer.image) + protoAdapter.encodedSizeWithTag(9, offer.terms_url) + protoAdapter.encodedSizeWithTag(8, offer.terms_text) + protoAdapter.encodedSizeWithTag(7, offer.validity_text) + protoAdapter.encodedSizeWithTag(6, offer.redemption_instructions) + LocalCart.Line.ADAPTER.asRepeated().encodedSizeWithTag(5, offer.offer_lines) + protoAdapter.encodedSizeWithTag(4, offer.display_title) + protoAdapter.encodedSizeWithTag(3, offer.coupon_code) + ProtoAdapter.INT64.encodedSizeWithTag(2, offer.expires_at) + protoAdapter.encodedSizeWithTag(1, offer.offer_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Offer offer = (Offer) obj;
        offer.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(offer.offer_lines, LocalCart.Line.ADAPTER);
        LocalImage localImage = offer.image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = offer.offer_token;
        Long l = offer.expires_at;
        String str2 = offer.coupon_code;
        String str3 = offer.display_title;
        String str4 = offer.redemption_instructions;
        String str5 = offer.validity_text;
        String str6 = offer.terms_text;
        String str7 = offer.terms_url;
        String str8 = offer.discount_description;
        String str9 = offer.validity_terms;
        String str10 = offer.eligible_items;
        Offer.OfferStatus offerStatus = offer.status;
        byteString.getClass();
        return new Offer(str, l, str2, str3, m1169redactElements, str4, str5, str6, str7, localImage2, str8, str9, str10, offerStatus, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Offer offer = (Offer) obj;
        offer.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, offer.offer_token);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, offer.expires_at);
        protoAdapter.encodeWithTag(protoWriter, 3, offer.coupon_code);
        protoAdapter.encodeWithTag(protoWriter, 4, offer.display_title);
        LocalCart.Line.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, offer.offer_lines);
        protoAdapter.encodeWithTag(protoWriter, 6, offer.redemption_instructions);
        protoAdapter.encodeWithTag(protoWriter, 7, offer.validity_text);
        protoAdapter.encodeWithTag(protoWriter, 8, offer.terms_text);
        protoAdapter.encodeWithTag(protoWriter, 9, offer.terms_url);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 10, offer.image);
        protoAdapter.encodeWithTag(protoWriter, 11, offer.discount_description);
        protoAdapter.encodeWithTag(protoWriter, 12, offer.validity_terms);
        protoAdapter.encodeWithTag(protoWriter, 13, offer.eligible_items);
        Offer.OfferStatus.ADAPTER.encodeWithTag(protoWriter, 14, offer.status);
        protoWriter.writeBytes(offer.unknownFields());
    }
}
