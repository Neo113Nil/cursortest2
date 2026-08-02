package com.squareup.protos.cash.contacts.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PostalAddress$Companion$ADAPTER$1 extends ProtoAdapter {
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
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            String str12 = r3;
            if (nextTag == -1) {
                return new PostalAddress(str12, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 11:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 12:
                    str11 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
            r3 = str12;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PostalAddress postalAddress = (PostalAddress) obj;
        reverseProtoWriter.getClass();
        postalAddress.getClass();
        reverseProtoWriter.writeBytes(postalAddress.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, postalAddress.label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, postalAddress.sublocality);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, postalAddress.subadministrative_area);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, postalAddress.iso_country_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, postalAddress.region);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, postalAddress.country);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, postalAddress.postal_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, postalAddress.state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, postalAddress.city);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, postalAddress.neighborhood);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, postalAddress.po_box);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, postalAddress.street);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PostalAddress postalAddress = (PostalAddress) obj;
        postalAddress.getClass();
        int size$okio = postalAddress.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(12, postalAddress.label) + protoAdapter.encodedSizeWithTag(11, postalAddress.sublocality) + protoAdapter.encodedSizeWithTag(10, postalAddress.subadministrative_area) + protoAdapter.encodedSizeWithTag(9, postalAddress.iso_country_code) + protoAdapter.encodedSizeWithTag(8, postalAddress.region) + protoAdapter.encodedSizeWithTag(7, postalAddress.country) + protoAdapter.encodedSizeWithTag(6, postalAddress.postal_code) + protoAdapter.encodedSizeWithTag(5, postalAddress.state) + protoAdapter.encodedSizeWithTag(4, postalAddress.city) + protoAdapter.encodedSizeWithTag(3, postalAddress.neighborhood) + protoAdapter.encodedSizeWithTag(2, postalAddress.po_box) + protoAdapter.encodedSizeWithTag(1, postalAddress.street) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PostalAddress postalAddress = (PostalAddress) obj;
        postalAddress.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = postalAddress.street;
        String str2 = postalAddress.po_box;
        String str3 = postalAddress.neighborhood;
        String str4 = postalAddress.city;
        String str5 = postalAddress.state;
        String str6 = postalAddress.postal_code;
        String str7 = postalAddress.country;
        String str8 = postalAddress.region;
        String str9 = postalAddress.iso_country_code;
        String str10 = postalAddress.subadministrative_area;
        String str11 = postalAddress.sublocality;
        String str12 = postalAddress.label;
        byteString.getClass();
        return new PostalAddress(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PostalAddress postalAddress = (PostalAddress) obj;
        postalAddress.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, postalAddress.street);
        protoAdapter.encodeWithTag(protoWriter, 2, postalAddress.po_box);
        protoAdapter.encodeWithTag(protoWriter, 3, postalAddress.neighborhood);
        protoAdapter.encodeWithTag(protoWriter, 4, postalAddress.city);
        protoAdapter.encodeWithTag(protoWriter, 5, postalAddress.state);
        protoAdapter.encodeWithTag(protoWriter, 6, postalAddress.postal_code);
        protoAdapter.encodeWithTag(protoWriter, 7, postalAddress.country);
        protoAdapter.encodeWithTag(protoWriter, 8, postalAddress.region);
        protoAdapter.encodeWithTag(protoWriter, 9, postalAddress.iso_country_code);
        protoAdapter.encodeWithTag(protoWriter, 10, postalAddress.subadministrative_area);
        protoAdapter.encodeWithTag(protoWriter, 11, postalAddress.sublocality);
        protoAdapter.encodeWithTag(protoWriter, 12, postalAddress.label);
        protoWriter.writeBytes(postalAddress.unknownFields());
    }
}
