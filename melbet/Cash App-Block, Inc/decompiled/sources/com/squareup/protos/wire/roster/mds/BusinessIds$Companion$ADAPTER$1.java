package com.squareup.protos.wire.roster.mds;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BusinessIds$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BusinessIds((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, (String) obj9, (String) obj10, (String) obj11, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 11:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BusinessIds businessIds = (BusinessIds) obj;
        reverseProtoWriter.getClass();
        businessIds.getClass();
        reverseProtoWriter.writeBytes(businessIds.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, businessIds.au_acn);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, businessIds.au_abn);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, businessIds.jp_qii_number);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, businessIds.es_nif);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, businessIds.gb_vat_number);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, businessIds.fr_rcs_place);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, businessIds.fr_rcs);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, businessIds.fr_naf);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, businessIds.fr_siret);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, businessIds.eu_vat_number);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, businessIds.ie_vat_number);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BusinessIds businessIds = (BusinessIds) obj;
        businessIds.getClass();
        int size$okio = businessIds.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(11, businessIds.au_acn) + protoAdapter.encodedSizeWithTag(10, businessIds.au_abn) + protoAdapter.encodedSizeWithTag(9, businessIds.jp_qii_number) + protoAdapter.encodedSizeWithTag(8, businessIds.es_nif) + protoAdapter.encodedSizeWithTag(7, businessIds.gb_vat_number) + protoAdapter.encodedSizeWithTag(6, businessIds.fr_rcs_place) + protoAdapter.encodedSizeWithTag(5, businessIds.fr_rcs) + protoAdapter.encodedSizeWithTag(4, businessIds.fr_naf) + protoAdapter.encodedSizeWithTag(3, businessIds.fr_siret) + protoAdapter.encodedSizeWithTag(2, businessIds.eu_vat_number) + protoAdapter.encodedSizeWithTag(1, businessIds.ie_vat_number) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BusinessIds businessIds = (BusinessIds) obj;
        businessIds.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = businessIds.ie_vat_number;
        String str2 = businessIds.eu_vat_number;
        String str3 = businessIds.fr_siret;
        String str4 = businessIds.fr_naf;
        String str5 = businessIds.fr_rcs;
        String str6 = businessIds.fr_rcs_place;
        String str7 = businessIds.gb_vat_number;
        String str8 = businessIds.es_nif;
        String str9 = businessIds.jp_qii_number;
        String str10 = businessIds.au_abn;
        String str11 = businessIds.au_acn;
        byteString.getClass();
        return new BusinessIds(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BusinessIds businessIds = (BusinessIds) obj;
        businessIds.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, businessIds.ie_vat_number);
        protoAdapter.encodeWithTag(protoWriter, 2, businessIds.eu_vat_number);
        protoAdapter.encodeWithTag(protoWriter, 3, businessIds.fr_siret);
        protoAdapter.encodeWithTag(protoWriter, 4, businessIds.fr_naf);
        protoAdapter.encodeWithTag(protoWriter, 5, businessIds.fr_rcs);
        protoAdapter.encodeWithTag(protoWriter, 6, businessIds.fr_rcs_place);
        protoAdapter.encodeWithTag(protoWriter, 7, businessIds.gb_vat_number);
        protoAdapter.encodeWithTag(protoWriter, 8, businessIds.es_nif);
        protoAdapter.encodeWithTag(protoWriter, 9, businessIds.jp_qii_number);
        protoAdapter.encodeWithTag(protoWriter, 10, businessIds.au_abn);
        protoAdapter.encodeWithTag(protoWriter, 11, businessIds.au_acn);
        protoWriter.writeBytes(businessIds.unknownFields());
    }
}
