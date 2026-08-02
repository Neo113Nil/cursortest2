package com.squareup.protos.wire.roster.mds;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.merchants.api.UserLocale;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Merchant$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x004b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ?? decode;
        Country country;
        StatusScope$Status statusScope$Status;
        Long l;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Country country2 = null;
        StatusScope$Status statusScope$Status2 = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        String str2 = null;
        Object obj4 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool = null;
        BusinessUnit businessUnit = null;
        String str6 = null;
        String str7 = null;
        Long l5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Merchant(str, l5, (Names) obj2, m, (UserLocale) obj3, country2, statusScope$Status2, l2, l3, l4, str2, (Unit) obj4, str3, str4, str5, bool, (MerchantCapabilities) obj, businessUnit, str6, str7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag != 1) {
                if (nextTag == 2) {
                    l5 = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 6) {
                    if (nextTag == 7) {
                        country = country2;
                        statusScope$Status = statusScope$Status2;
                        l = l2;
                        m.add(AddressEntry.ADAPTER.decode(protoReader));
                    } else if (nextTag != 8) {
                        if (nextTag == 10) {
                            country = country2;
                            statusScope$Status = statusScope$Status2;
                            l = l2;
                            try {
                                statusScope$Status2 = StatusScope$Status.ADAPTER.decode(protoReader);
                                country2 = country;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag == 12) {
                            l2 = ProtoAdapter.INT64.decode(protoReader);
                        } else if (nextTag != 13) {
                            switch (nextTag) {
                                case 20:
                                    l4 = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 21:
                                    str2 = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 22:
                                    obj4 = TransactorKt.decodeMessageOrMerge(Unit.ADAPTER, protoReader, obj4);
                                    break;
                                case 23:
                                    country = country2;
                                    statusScope$Status = statusScope$Status2;
                                    l = l2;
                                    try {
                                        country2 = Country.ADAPTER.decode(protoReader);
                                        statusScope$Status2 = statusScope$Status;
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 24:
                                    str3 = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 25:
                                    str4 = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 26:
                                    str5 = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 27:
                                    bool = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 28:
                                    obj = TransactorKt.decodeMessageOrMerge(MerchantCapabilities.ADAPTER, protoReader, obj);
                                    break;
                                case 29:
                                    try {
                                        businessUnit = BusinessUnit.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        country = country2;
                                        statusScope$Status = statusScope$Status2;
                                        l = l2;
                                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 30:
                                    str6 = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 31:
                                    str7 = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                default:
                                    protoReader.readUnknownField(nextTag);
                                    country = country2;
                                    statusScope$Status = statusScope$Status2;
                                    l = l2;
                                    break;
                            }
                        } else {
                            l3 = ProtoAdapter.INT64.decode(protoReader);
                        }
                        l2 = l;
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(UserLocale.ADAPTER, protoReader, obj3);
                    }
                    decode = str;
                    country2 = country;
                    statusScope$Status2 = statusScope$Status;
                    l2 = l;
                } else {
                    obj2 = TransactorKt.decodeMessageOrMerge(Names.ADAPTER, protoReader, obj2);
                }
                decode = str;
            } else {
                decode = ProtoAdapter.STRING.decode(protoReader);
            }
            str = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Merchant merchant = (Merchant) obj;
        reverseProtoWriter.getClass();
        merchant.getClass();
        reverseProtoWriter.writeBytes(merchant.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 31, merchant.main_unit_token_override);
        protoAdapter.encodeWithTag(reverseProtoWriter, 30, merchant.legal_entity_token);
        BusinessUnit.ADAPTER.encodeWithTag(reverseProtoWriter, 29, merchant.business_unit);
        MerchantCapabilities.ADAPTER.encodeWithTag(reverseProtoWriter, 28, merchant.capabilities);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 27, merchant.platform_hidden);
        protoAdapter.encodeWithTag(reverseProtoWriter, 26, merchant.platform_account_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 25, merchant.reserved_merchant_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 24, merchant.oldest_unit_token);
        Unit.ADAPTER.encodeWithTag(reverseProtoWriter, 22, merchant.main_unit);
        protoAdapter.encodeWithTag(reverseProtoWriter, 21, merchant.main_unit_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 20, merchant.merchant_id);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, merchant.updated_ts);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, merchant.created_ts);
        StatusScope$Status.ADAPTER.encodeWithTag(reverseProtoWriter, 10, merchant.status);
        Country.ADAPTER.encodeWithTag(reverseProtoWriter, 23, merchant.country);
        UserLocale.ADAPTER.encodeWithTag(reverseProtoWriter, 8, merchant.locale);
        AddressEntry.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, merchant.addresses);
        Names.ADAPTER.encodeWithTag(reverseProtoWriter, 6, merchant.name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, merchant.version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, merchant.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Merchant merchant = (Merchant) obj;
        merchant.getClass();
        int size$okio = merchant.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, merchant.token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(31, merchant.main_unit_token_override) + protoAdapter.encodedSizeWithTag(30, merchant.legal_entity_token) + BusinessUnit.ADAPTER.encodedSizeWithTag(29, merchant.business_unit) + MerchantCapabilities.ADAPTER.encodedSizeWithTag(28, merchant.capabilities) + ProtoAdapter.BOOL.encodedSizeWithTag(27, merchant.platform_hidden) + protoAdapter.encodedSizeWithTag(26, merchant.platform_account_token) + protoAdapter.encodedSizeWithTag(25, merchant.reserved_merchant_token) + protoAdapter.encodedSizeWithTag(24, merchant.oldest_unit_token) + Unit.ADAPTER.encodedSizeWithTag(22, merchant.main_unit) + protoAdapter.encodedSizeWithTag(21, merchant.main_unit_token) + protoAdapter2.encodedSizeWithTag(20, merchant.merchant_id) + protoAdapter2.encodedSizeWithTag(13, merchant.updated_ts) + protoAdapter2.encodedSizeWithTag(12, merchant.created_ts) + StatusScope$Status.ADAPTER.encodedSizeWithTag(10, merchant.status) + Country.ADAPTER.encodedSizeWithTag(23, merchant.country) + UserLocale.ADAPTER.encodedSizeWithTag(8, merchant.locale) + AddressEntry.ADAPTER.asRepeated().encodedSizeWithTag(7, merchant.addresses) + Names.ADAPTER.encodedSizeWithTag(6, merchant.name) + protoAdapter2.encodedSizeWithTag(2, merchant.version) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Merchant merchant = (Merchant) obj;
        merchant.getClass();
        Names names = merchant.name;
        Names names2 = names != null ? (Names) Names.ADAPTER.redact(names) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(merchant.addresses, AddressEntry.ADAPTER);
        UserLocale userLocale = merchant.locale;
        UserLocale userLocale2 = userLocale != null ? (UserLocale) UserLocale.ADAPTER.redact(userLocale) : null;
        Unit unit = merchant.main_unit;
        Unit unit2 = unit != null ? (Unit) Unit.ADAPTER.redact(unit) : null;
        MerchantCapabilities merchantCapabilities = merchant.capabilities;
        MerchantCapabilities merchantCapabilities2 = merchantCapabilities != null ? (MerchantCapabilities) MerchantCapabilities.ADAPTER.redact(merchantCapabilities) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = merchant.token;
        Long l = merchant.version;
        Country country = merchant.country;
        StatusScope$Status statusScope$Status = merchant.status;
        Long l2 = merchant.created_ts;
        Long l3 = merchant.updated_ts;
        Long l4 = merchant.merchant_id;
        String str2 = merchant.main_unit_token;
        String str3 = merchant.oldest_unit_token;
        String str4 = merchant.reserved_merchant_token;
        String str5 = merchant.platform_account_token;
        Boolean bool = merchant.platform_hidden;
        BusinessUnit businessUnit = merchant.business_unit;
        String str6 = merchant.legal_entity_token;
        String str7 = merchant.main_unit_token_override;
        byteString.getClass();
        return new Merchant(str, l, names2, m1169redactElements, userLocale2, country, statusScope$Status, l2, l3, l4, str2, unit2, str3, str4, str5, bool, merchantCapabilities2, businessUnit, str6, str7, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Merchant merchant = (Merchant) obj;
        merchant.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, merchant.token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, merchant.version);
        Names.ADAPTER.encodeWithTag(protoWriter, 6, merchant.name);
        AddressEntry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, merchant.addresses);
        UserLocale.ADAPTER.encodeWithTag(protoWriter, 8, merchant.locale);
        Country.ADAPTER.encodeWithTag(protoWriter, 23, merchant.country);
        StatusScope$Status.ADAPTER.encodeWithTag(protoWriter, 10, merchant.status);
        protoAdapter2.encodeWithTag(protoWriter, 12, merchant.created_ts);
        protoAdapter2.encodeWithTag(protoWriter, 13, merchant.updated_ts);
        protoAdapter2.encodeWithTag(protoWriter, 20, merchant.merchant_id);
        protoAdapter.encodeWithTag(protoWriter, 21, merchant.main_unit_token);
        Unit.ADAPTER.encodeWithTag(protoWriter, 22, merchant.main_unit);
        protoAdapter.encodeWithTag(protoWriter, 24, merchant.oldest_unit_token);
        protoAdapter.encodeWithTag(protoWriter, 25, merchant.reserved_merchant_token);
        protoAdapter.encodeWithTag(protoWriter, 26, merchant.platform_account_token);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, merchant.platform_hidden);
        MerchantCapabilities.ADAPTER.encodeWithTag(protoWriter, 28, merchant.capabilities);
        BusinessUnit.ADAPTER.encodeWithTag(protoWriter, 29, merchant.business_unit);
        protoAdapter.encodeWithTag(protoWriter, 30, merchant.legal_entity_token);
        protoAdapter.encodeWithTag(protoWriter, 31, merchant.main_unit_token_override);
        protoWriter.writeBytes(merchant.unknownFields());
    }
}
