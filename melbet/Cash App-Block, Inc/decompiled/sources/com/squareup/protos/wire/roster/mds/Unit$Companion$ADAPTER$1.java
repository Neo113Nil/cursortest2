package com.squareup.protos.wire.roster.mds;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.merchants.api.UserLocale;
import com.squareup.protos.roster.business_hours.BusinessHours;
import com.squareup.protos.roster.business_hours.SpecialBusinessHours;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Unit$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0049. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x004c. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        long j;
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
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
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        Object obj21 = null;
        Object obj22 = null;
        Object obj23 = null;
        Object obj24 = null;
        Object obj25 = null;
        Object obj26 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Unit((String) obj4, (Long) obj21, (String) obj22, (Merchant) obj8, (Boolean) obj23, (Names) obj10, (String) obj26, (CurrencyCode) obj11, m, (UserLocale) obj12, (String) obj13, (String) obj14, arrayList, (StatusScope$Status) obj15, arrayList2, (Long) obj16, (Long) obj17, (String) obj18, (Long) obj19, (Boolean) obj20, (BusinessIds) obj5, (UnitCapabilities) obj6, (BusinessHours) obj7, (SpecialBusinessHours) obj9, (BusinessUnit) obj24, (String) obj25, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag != 1) {
                if (nextTag != 2) {
                    switch (nextTag) {
                        case 6:
                            j = beginMessage;
                            obj = obj11;
                            obj22 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            j = beginMessage;
                            obj = obj11;
                            obj8 = TransactorKt.decodeMessageOrMerge(Merchant.ADAPTER, protoReader, obj8);
                            break;
                        case 8:
                            j = beginMessage;
                            obj = obj11;
                            obj10 = TransactorKt.decodeMessageOrMerge(Names.ADAPTER, protoReader, obj10);
                            break;
                        case 9:
                            j = beginMessage;
                            obj = obj11;
                            obj26 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            j = beginMessage;
                            obj = obj11;
                            obj3 = obj5;
                            try {
                                obj5 = obj3;
                                obj11 = CurrencyCode.ADAPTER.decode(protoReader);
                                obj2 = obj4;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 11:
                            j = beginMessage;
                            obj = obj11;
                            obj3 = obj5;
                            m.add(AddressEntry.ADAPTER.decode(protoReader));
                            obj2 = obj4;
                            obj5 = obj3;
                            break;
                        case 12:
                            j = beginMessage;
                            obj = obj11;
                            obj12 = TransactorKt.decodeMessageOrMerge(UserLocale.ADAPTER, protoReader, obj12);
                            break;
                        case 13:
                            j = beginMessage;
                            obj = obj11;
                            obj13 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            j = beginMessage;
                            obj = obj11;
                            obj3 = obj5;
                            arrayList.add(ImageEntry.ADAPTER.decode(protoReader));
                            obj2 = obj4;
                            obj5 = obj3;
                            break;
                        case 15:
                            j = beginMessage;
                            obj = obj11;
                            try {
                                obj15 = StatusScope$Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                obj3 = obj5;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 16:
                            j = beginMessage;
                            obj = obj11;
                            arrayList2.add(ContactMethod.ADAPTER.decode(protoReader));
                            obj3 = obj5;
                            obj2 = obj4;
                            obj5 = obj3;
                            break;
                        case 17:
                            j = beginMessage;
                            obj16 = ProtoAdapter.INT64.decode(protoReader);
                            obj2 = obj4;
                            break;
                        case 18:
                            j = beginMessage;
                            obj17 = ProtoAdapter.INT64.decode(protoReader);
                            obj2 = obj4;
                            break;
                        case 19:
                            j = beginMessage;
                            obj18 = ProtoAdapter.STRING.decode(protoReader);
                            obj2 = obj4;
                            break;
                        default:
                            switch (nextTag) {
                                case 25:
                                    j = beginMessage;
                                    obj14 = ProtoAdapter.STRING.decode(protoReader);
                                    obj2 = obj4;
                                    break;
                                case 26:
                                    j = beginMessage;
                                    obj19 = ProtoAdapter.INT64.decode(protoReader);
                                    obj2 = obj4;
                                    break;
                                case 27:
                                    j = beginMessage;
                                    obj23 = ProtoAdapter.BOOL.decode(protoReader);
                                    obj2 = obj4;
                                    break;
                                case 28:
                                    j = beginMessage;
                                    obj20 = ProtoAdapter.BOOL.decode(protoReader);
                                    obj2 = obj4;
                                    break;
                                case 29:
                                    j = beginMessage;
                                    obj5 = TransactorKt.decodeMessageOrMerge(BusinessIds.ADAPTER, protoReader, obj5);
                                    obj2 = obj4;
                                    break;
                                case 30:
                                    j = beginMessage;
                                    obj6 = TransactorKt.decodeMessageOrMerge(UnitCapabilities.ADAPTER, protoReader, obj6);
                                    obj2 = obj4;
                                    break;
                                case 31:
                                    j = beginMessage;
                                    obj7 = TransactorKt.decodeMessageOrMerge(BusinessHours.ADAPTER, protoReader, obj7);
                                    obj2 = obj4;
                                    break;
                                case 32:
                                    j = beginMessage;
                                    obj9 = TransactorKt.decodeMessageOrMerge(SpecialBusinessHours.ADAPTER, protoReader, obj9);
                                    obj2 = obj4;
                                    break;
                                case 33:
                                    try {
                                        obj24 = BusinessUnit.ADAPTER.decode(protoReader);
                                        j = beginMessage;
                                        obj2 = obj4;
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        obj = obj11;
                                        j = beginMessage;
                                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 34:
                                    obj25 = ProtoAdapter.STRING.decode(protoReader);
                                    j = beginMessage;
                                    obj2 = obj4;
                                    break;
                                default:
                                    protoReader.readUnknownField(nextTag);
                                    j = beginMessage;
                                    obj = obj11;
                                    obj3 = obj5;
                                    obj2 = obj4;
                                    obj5 = obj3;
                                    break;
                            }
                    }
                    obj4 = obj2;
                    beginMessage = j;
                } else {
                    j = beginMessage;
                    obj = obj11;
                    obj21 = ProtoAdapter.INT64.decode(protoReader);
                }
                obj11 = obj;
                obj2 = obj4;
                obj4 = obj2;
                beginMessage = j;
            } else {
                j = beginMessage;
                obj = obj11;
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
            obj11 = obj;
            obj4 = obj2;
            beginMessage = j;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Unit unit = (Unit) obj;
        reverseProtoWriter.getClass();
        unit.getClass();
        reverseProtoWriter.writeBytes(unit.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 34, unit.legal_entity_token);
        BusinessUnit.ADAPTER.encodeWithTag(reverseProtoWriter, 33, unit.business_unit);
        SpecialBusinessHours.ADAPTER.encodeWithTag(reverseProtoWriter, 32, unit.special_hours);
        BusinessHours.ADAPTER.encodeWithTag(reverseProtoWriter, 31, unit.business_hours);
        UnitCapabilities.ADAPTER.encodeWithTag(reverseProtoWriter, 30, unit.capabilities);
        BusinessIds.ADAPTER.encodeWithTag(reverseProtoWriter, 29, unit.business_ids);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 28, unit.has_no_automatic_point_of_sale_image);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 26, unit.unit_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 19, unit.time_zone);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 18, unit.updated_ts);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 17, unit.created_ts);
        ContactMethod.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 16, unit.contact_methods);
        StatusScope$Status.ADAPTER.encodeWithTag(reverseProtoWriter, 15, unit.status);
        ImageEntry.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 14, unit.images);
        protoAdapter.encodeWithTag(reverseProtoWriter, 25, unit.mcc);
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, unit.business_type);
        UserLocale.ADAPTER.encodeWithTag(reverseProtoWriter, 12, unit.locale);
        AddressEntry.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 11, unit.addresses);
        CurrencyCode.ADAPTER.encodeWithTag(reverseProtoWriter, 10, unit.currency_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, unit.nickname);
        Names.ADAPTER.encodeWithTag(reverseProtoWriter, 8, unit.name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 27, unit.frozen);
        Merchant.ADAPTER.encodeWithTag(reverseProtoWriter, 7, unit.merchant);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, unit.merchant_token);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, unit.version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, unit.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Unit unit = (Unit) obj;
        unit.getClass();
        int size$okio = unit.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, unit.token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = Merchant.ADAPTER.encodedSizeWithTag(7, unit.merchant) + protoAdapter.encodedSizeWithTag(6, unit.merchant_token) + protoAdapter2.encodedSizeWithTag(2, unit.version) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(34, unit.legal_entity_token) + BusinessUnit.ADAPTER.encodedSizeWithTag(33, unit.business_unit) + SpecialBusinessHours.ADAPTER.encodedSizeWithTag(32, unit.special_hours) + BusinessHours.ADAPTER.encodedSizeWithTag(31, unit.business_hours) + UnitCapabilities.ADAPTER.encodedSizeWithTag(30, unit.capabilities) + BusinessIds.ADAPTER.encodedSizeWithTag(29, unit.business_ids) + protoAdapter3.encodedSizeWithTag(28, unit.has_no_automatic_point_of_sale_image) + protoAdapter2.encodedSizeWithTag(26, unit.unit_id) + protoAdapter.encodedSizeWithTag(19, unit.time_zone) + protoAdapter2.encodedSizeWithTag(18, unit.updated_ts) + protoAdapter2.encodedSizeWithTag(17, unit.created_ts) + ContactMethod.ADAPTER.asRepeated().encodedSizeWithTag(16, unit.contact_methods) + StatusScope$Status.ADAPTER.encodedSizeWithTag(15, unit.status) + ImageEntry.ADAPTER.asRepeated().encodedSizeWithTag(14, unit.images) + protoAdapter.encodedSizeWithTag(25, unit.mcc) + protoAdapter.encodedSizeWithTag(13, unit.business_type) + UserLocale.ADAPTER.encodedSizeWithTag(12, unit.locale) + AddressEntry.ADAPTER.asRepeated().encodedSizeWithTag(11, unit.addresses) + CurrencyCode.ADAPTER.encodedSizeWithTag(10, unit.currency_code) + protoAdapter.encodedSizeWithTag(9, unit.nickname) + Names.ADAPTER.encodedSizeWithTag(8, unit.name) + protoAdapter3.encodedSizeWithTag(27, unit.frozen) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Unit unit = (Unit) obj;
        unit.getClass();
        Merchant merchant = unit.merchant;
        Merchant merchant2 = merchant != null ? (Merchant) Merchant.ADAPTER.redact(merchant) : null;
        Names names = unit.name;
        Names names2 = names != null ? (Names) Names.ADAPTER.redact(names) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(unit.addresses, AddressEntry.ADAPTER);
        UserLocale userLocale = unit.locale;
        UserLocale userLocale2 = userLocale != null ? (UserLocale) UserLocale.ADAPTER.redact(userLocale) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(unit.images, ImageEntry.ADAPTER);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(unit.contact_methods, ContactMethod.ADAPTER);
        BusinessIds businessIds = unit.business_ids;
        BusinessIds businessIds2 = businessIds != null ? (BusinessIds) BusinessIds.ADAPTER.redact(businessIds) : null;
        UnitCapabilities unitCapabilities = unit.capabilities;
        UnitCapabilities unitCapabilities2 = unitCapabilities != null ? (UnitCapabilities) UnitCapabilities.ADAPTER.redact(unitCapabilities) : null;
        BusinessHours businessHours = unit.business_hours;
        BusinessHours businessHours2 = businessHours != null ? (BusinessHours) BusinessHours.ADAPTER.redact(businessHours) : null;
        SpecialBusinessHours specialBusinessHours = unit.special_hours;
        SpecialBusinessHours specialBusinessHours2 = specialBusinessHours != null ? (SpecialBusinessHours) SpecialBusinessHours.ADAPTER.redact(specialBusinessHours) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = unit.token;
        Long l = unit.version;
        String str2 = unit.merchant_token;
        Boolean bool = unit.frozen;
        CurrencyCode currencyCode = unit.currency_code;
        String str3 = unit.business_type;
        String str4 = unit.mcc;
        StatusScope$Status statusScope$Status = unit.status;
        Long l2 = unit.created_ts;
        Long l3 = unit.updated_ts;
        String str5 = unit.time_zone;
        Long l4 = unit.unit_id;
        Boolean bool2 = unit.has_no_automatic_point_of_sale_image;
        BusinessUnit businessUnit = unit.business_unit;
        String str6 = unit.legal_entity_token;
        byteString.getClass();
        return new Unit(str, l, str2, merchant2, bool, names2, null, currencyCode, m1169redactElements, userLocale2, str3, str4, m1169redactElements2, statusScope$Status, m1169redactElements3, l2, l3, str5, l4, bool2, businessIds2, unitCapabilities2, businessHours2, specialBusinessHours2, businessUnit, str6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Unit unit = (Unit) obj;
        unit.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, unit.token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, unit.version);
        protoAdapter.encodeWithTag(protoWriter, 6, unit.merchant_token);
        Merchant.ADAPTER.encodeWithTag(protoWriter, 7, unit.merchant);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 27, unit.frozen);
        Names.ADAPTER.encodeWithTag(protoWriter, 8, unit.name);
        protoAdapter.encodeWithTag(protoWriter, 9, unit.nickname);
        CurrencyCode.ADAPTER.encodeWithTag(protoWriter, 10, unit.currency_code);
        AddressEntry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, unit.addresses);
        UserLocale.ADAPTER.encodeWithTag(protoWriter, 12, unit.locale);
        protoAdapter.encodeWithTag(protoWriter, 13, unit.business_type);
        protoAdapter.encodeWithTag(protoWriter, 25, unit.mcc);
        ImageEntry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 14, unit.images);
        StatusScope$Status.ADAPTER.encodeWithTag(protoWriter, 15, unit.status);
        ContactMethod.ADAPTER.asRepeated().encodeWithTag(protoWriter, 16, unit.contact_methods);
        protoAdapter2.encodeWithTag(protoWriter, 17, unit.created_ts);
        protoAdapter2.encodeWithTag(protoWriter, 18, unit.updated_ts);
        protoAdapter.encodeWithTag(protoWriter, 19, unit.time_zone);
        protoAdapter2.encodeWithTag(protoWriter, 26, unit.unit_id);
        protoAdapter3.encodeWithTag(protoWriter, 28, unit.has_no_automatic_point_of_sale_image);
        BusinessIds.ADAPTER.encodeWithTag(protoWriter, 29, unit.business_ids);
        UnitCapabilities.ADAPTER.encodeWithTag(protoWriter, 30, unit.capabilities);
        BusinessHours.ADAPTER.encodeWithTag(protoWriter, 31, unit.business_hours);
        SpecialBusinessHours.ADAPTER.encodeWithTag(protoWriter, 32, unit.special_hours);
        BusinessUnit.ADAPTER.encodeWithTag(protoWriter, 33, unit.business_unit);
        protoAdapter.encodeWithTag(protoWriter, 34, unit.legal_entity_token);
        protoWriter.writeBytes(unit.unknownFields());
    }
}
