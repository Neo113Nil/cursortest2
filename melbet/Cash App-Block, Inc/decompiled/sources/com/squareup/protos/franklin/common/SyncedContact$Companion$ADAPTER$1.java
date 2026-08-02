package com.squareup.protos.franklin.common;

import com.squareup.protos.common.countries.Country;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncedContact$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        String str;
        String str2;
        String str3;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ByteString byteString = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Boolean bool = null;
        String str7 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Long l = null;
        Country country = null;
        Boolean bool4 = null;
        String str8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncedContact(byteString, str4, str5, str6, bool, str7, bool2, bool3, l, country, bool4, str8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.BYTES.decode(protoReader);
                    break;
                case 2:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = byteString;
                    break;
                case 3:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = byteString;
                    break;
                case 4:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = byteString;
                    break;
                case 5:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    decode = byteString;
                    break;
                case 6:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = byteString;
                    break;
                case 7:
                    bool2 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = byteString;
                    break;
                case 8:
                    bool3 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = byteString;
                    break;
                case 9:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    decode = byteString;
                    break;
                case 10:
                    try {
                        country = Country.ADAPTER.decode(protoReader);
                        decode = byteString;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        str = str4;
                        str2 = str5;
                        str3 = str6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 11:
                default:
                    protoReader.readUnknownField(nextTag);
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    decode = byteString;
                    str4 = str;
                    str5 = str2;
                    str6 = str3;
                    break;
                case 12:
                    bool4 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = byteString;
                    break;
                case 13:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = byteString;
                    break;
            }
            byteString = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncedContact syncedContact = (SyncedContact) obj;
        reverseProtoWriter.getClass();
        syncedContact.getClass();
        reverseProtoWriter.writeBytes(syncedContact.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, syncedContact.hashed_alias_id);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, syncedContact.is_cash_customer);
        Country.ADAPTER.encodeWithTag(reverseProtoWriter, 10, syncedContact.country_code);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 9, syncedContact.credit_card_fee_bps);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, syncedContact.is_verified_account);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, syncedContact.is_business);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, syncedContact.customer_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, syncedContact.can_accept_payments);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, syncedContact.display_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, syncedContact.cashtag);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, syncedContact.photo_url);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, syncedContact.hashed_alias);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncedContact syncedContact = (SyncedContact) obj;
        syncedContact.getClass();
        int encodedSizeWithTag = ProtoAdapter.BYTES.encodedSizeWithTag(1, syncedContact.hashed_alias) + syncedContact.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(4, syncedContact.display_name) + protoAdapter.encodedSizeWithTag(3, syncedContact.cashtag) + protoAdapter.encodedSizeWithTag(2, syncedContact.photo_url) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(13, syncedContact.hashed_alias_id) + protoAdapter2.encodedSizeWithTag(12, syncedContact.is_cash_customer) + Country.ADAPTER.encodedSizeWithTag(10, syncedContact.country_code) + ProtoAdapter.INT64.encodedSizeWithTag(9, syncedContact.credit_card_fee_bps) + protoAdapter2.encodedSizeWithTag(8, syncedContact.is_verified_account) + protoAdapter2.encodedSizeWithTag(7, syncedContact.is_business) + protoAdapter.encodedSizeWithTag(6, syncedContact.customer_token) + protoAdapter2.encodedSizeWithTag(5, syncedContact.can_accept_payments) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncedContact syncedContact = (SyncedContact) obj;
        syncedContact.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = syncedContact.can_accept_payments;
        String str = syncedContact.customer_token;
        Boolean bool2 = syncedContact.is_business;
        Boolean bool3 = syncedContact.is_verified_account;
        Long l = syncedContact.credit_card_fee_bps;
        Country country = syncedContact.country_code;
        Boolean bool4 = syncedContact.is_cash_customer;
        String str2 = syncedContact.hashed_alias_id;
        byteString.getClass();
        return new SyncedContact(null, null, null, null, bool, str, bool2, bool3, l, country, bool4, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncedContact syncedContact = (SyncedContact) obj;
        syncedContact.getClass();
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, syncedContact.hashed_alias);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, syncedContact.photo_url);
        protoAdapter.encodeWithTag(protoWriter, 3, syncedContact.cashtag);
        protoAdapter.encodeWithTag(protoWriter, 4, syncedContact.display_name);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 5, syncedContact.can_accept_payments);
        protoAdapter.encodeWithTag(protoWriter, 6, syncedContact.customer_token);
        protoAdapter2.encodeWithTag(protoWriter, 7, syncedContact.is_business);
        protoAdapter2.encodeWithTag(protoWriter, 8, syncedContact.is_verified_account);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, syncedContact.credit_card_fee_bps);
        Country.ADAPTER.encodeWithTag(protoWriter, 10, syncedContact.country_code);
        protoAdapter2.encodeWithTag(protoWriter, 12, syncedContact.is_cash_customer);
        protoAdapter.encodeWithTag(protoWriter, 13, syncedContact.hashed_alias_id);
        protoWriter.writeBytes(syncedContact.unknownFields());
    }
}
