package com.squareup.protos.wire.roster.mds;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.banklin.card_activation.CardActivationRiskResult;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.protos.franklin.common.IssuedCard;
import com.squareup.protos.franklin.common.PhysicalCardData;
import com.squareup.protos.merchants.api.UserLocale;
import com.squareup.protos.roster.business_hours.BusinessHours;
import com.squareup.protos.roster.business_hours.SpecialBusinessHours;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Unit extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Unit> CREATOR;
    public final List addresses;
    public final BusinessHours business_hours;
    public final BusinessIds business_ids;
    public final String business_type;
    public final BusinessUnit business_unit;
    public final UnitCapabilities capabilities;
    public final List contact_methods;
    public final Long created_ts;
    public final CurrencyCode currency_code;
    public final Boolean frozen;
    public final Boolean has_no_automatic_point_of_sale_image;
    public final List images;
    public final String legal_entity_token;
    public final UserLocale locale;
    public final String mcc;
    public final Merchant merchant;
    public final String merchant_token;
    public final Names name;
    public final String nickname;
    public final SpecialBusinessHours special_hours;
    public final StatusScope$Status status;
    public final String time_zone;
    public final String token;
    public final Long unit_id;
    public final Long updated_ts;
    public final Long version;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List addresses;
        public Serializable business_hours;
        public Serializable business_ids;
        public String business_type;
        public Enum business_unit;
        public Serializable capabilities;
        public Object contact_methods;
        public Object created_ts;
        public Serializable currency_code;
        public Boolean frozen;
        public Boolean has_no_automatic_point_of_sale_image;
        public Object images;
        public String legal_entity_token;
        public Serializable locale;
        public String mcc;
        public Serializable merchant;
        public String merchant_token;
        public Serializable name;
        public String nickname;
        public AndroidMessage special_hours;
        public Serializable status;
        public String time_zone;
        public String token;
        public Object unit_id;
        public Object updated_ts;
        public Long version;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    this.addresses = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Unit(this.token, this.version, this.merchant_token, (Merchant) this.merchant, this.frozen, (Names) this.name, this.nickname, (CurrencyCode) this.currency_code, this.addresses, (UserLocale) this.locale, this.business_type, this.mcc, (List) this.images, (StatusScope$Status) this.status, (List) this.contact_methods, (Long) this.created_ts, (Long) this.updated_ts, this.time_zone, (Long) this.unit_id, this.has_no_automatic_point_of_sale_image, (BusinessIds) this.business_ids, (UnitCapabilities) this.capabilities, (BusinessHours) this.business_hours, (SpecialBusinessHours) this.special_hours, (BusinessUnit) this.business_unit, this.legal_entity_token, buildUnknownFields());
                default:
                    return new IssuedCard(this.token, this.merchant_token, this.nickname, this.business_type, this.mcc, (InstrumentType) this.created_ts, this.time_zone, this.frozen, this.has_no_automatic_point_of_sale_image, (Boolean) this.updated_ts, (Boolean) this.unit_id, this.legal_entity_token, (String) this.merchant, (String) this.name, (PhysicalCardData) this.currency_code, (CardTheme) this.images, (Boolean) this.contact_methods, (String) this.locale, (LocalizableString) this.status, (Boolean) this.business_ids, (Boolean) this.capabilities, (IssuedCard.Issuer) this.business_hours, this.version, (TouchData) this.special_hours, this.addresses, (CardActivationRiskResult) this.business_unit, buildUnknownFields());
            }
        }
    }

    static {
        Unit$Companion$ADAPTER$1 unit$Companion$ADAPTER$1 = new Unit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Unit.class), "type.googleapis.com/squareup.roster.mds.Unit", Syntax.PROTO_2, null, "squareup/roster/mds.proto");
        ADAPTER = unit$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(unit$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Unit(String str, Long l, String str2, Merchant merchant, Boolean bool, Names names, String str3, CurrencyCode currencyCode, List list, UserLocale userLocale, String str4, String str5, List list2, StatusScope$Status statusScope$Status, List list3, Long l2, Long l3, String str6, Long l4, Boolean bool2, BusinessIds businessIds, UnitCapabilities unitCapabilities, BusinessHours businessHours, SpecialBusinessHours specialBusinessHours, BusinessUnit businessUnit, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.token = str;
        this.version = l;
        this.merchant_token = str2;
        this.merchant = merchant;
        this.frozen = bool;
        this.name = names;
        this.nickname = str3;
        this.currency_code = currencyCode;
        this.locale = userLocale;
        this.business_type = str4;
        this.mcc = str5;
        this.status = statusScope$Status;
        this.created_ts = l2;
        this.updated_ts = l3;
        this.time_zone = str6;
        this.unit_id = l4;
        this.has_no_automatic_point_of_sale_image = bool2;
        this.business_ids = businessIds;
        this.capabilities = unitCapabilities;
        this.business_hours = businessHours;
        this.special_hours = specialBusinessHours;
        this.business_unit = businessUnit;
        this.legal_entity_token = str7;
        this.addresses = TransactorKt.immutableCopyOf("addresses", list);
        this.images = TransactorKt.immutableCopyOf("images", list2);
        this.contact_methods = TransactorKt.immutableCopyOf("contact_methods", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Unit)) {
            return false;
        }
        Unit unit = (Unit) obj;
        return Intrinsics.areEqual(unknownFields(), unit.unknownFields()) && Intrinsics.areEqual(this.token, unit.token) && Intrinsics.areEqual(this.version, unit.version) && Intrinsics.areEqual(this.merchant_token, unit.merchant_token) && Intrinsics.areEqual(this.merchant, unit.merchant) && Intrinsics.areEqual(this.frozen, unit.frozen) && Intrinsics.areEqual(this.name, unit.name) && Intrinsics.areEqual(this.nickname, unit.nickname) && this.currency_code == unit.currency_code && Intrinsics.areEqual(this.addresses, unit.addresses) && Intrinsics.areEqual(this.locale, unit.locale) && Intrinsics.areEqual(this.business_type, unit.business_type) && Intrinsics.areEqual(this.mcc, unit.mcc) && Intrinsics.areEqual(this.images, unit.images) && this.status == unit.status && Intrinsics.areEqual(this.contact_methods, unit.contact_methods) && Intrinsics.areEqual(this.created_ts, unit.created_ts) && Intrinsics.areEqual(this.updated_ts, unit.updated_ts) && Intrinsics.areEqual(this.time_zone, unit.time_zone) && Intrinsics.areEqual(this.unit_id, unit.unit_id) && Intrinsics.areEqual(this.has_no_automatic_point_of_sale_image, unit.has_no_automatic_point_of_sale_image) && Intrinsics.areEqual(this.business_ids, unit.business_ids) && Intrinsics.areEqual(this.capabilities, unit.capabilities) && Intrinsics.areEqual(this.business_hours, unit.business_hours) && Intrinsics.areEqual(this.special_hours, unit.special_hours) && this.business_unit == unit.business_unit && Intrinsics.areEqual(this.legal_entity_token, unit.legal_entity_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.version;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str2 = this.merchant_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Merchant merchant = this.merchant;
        int hashCode5 = (hashCode4 + (merchant != null ? merchant.hashCode() : 0)) * 37;
        Boolean bool = this.frozen;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Names names = this.name;
        int hashCode7 = (hashCode6 + (names != null ? names.hashCode() : 0)) * 37;
        String str3 = this.nickname;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        CurrencyCode currencyCode = this.currency_code;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode8 + (currencyCode != null ? currencyCode.hashCode() : 0)) * 37, 37, this.addresses);
        UserLocale userLocale = this.locale;
        int hashCode9 = (m + (userLocale != null ? userLocale.hashCode() : 0)) * 37;
        String str4 = this.business_type;
        int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.mcc;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode10 + (str5 != null ? str5.hashCode() : 0)) * 37, 37, this.images);
        StatusScope$Status statusScope$Status = this.status;
        int m3 = Recorder$$ExternalSyntheticOutline2.m((m2 + (statusScope$Status != null ? statusScope$Status.hashCode() : 0)) * 37, 37, this.contact_methods);
        Long l2 = this.created_ts;
        int hashCode11 = (m3 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.updated_ts;
        int hashCode12 = (hashCode11 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        String str6 = this.time_zone;
        int hashCode13 = (hashCode12 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Long l4 = this.unit_id;
        int hashCode14 = (hashCode13 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        Boolean bool2 = this.has_no_automatic_point_of_sale_image;
        int hashCode15 = (hashCode14 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        BusinessIds businessIds = this.business_ids;
        int hashCode16 = (hashCode15 + (businessIds != null ? businessIds.hashCode() : 0)) * 37;
        UnitCapabilities unitCapabilities = this.capabilities;
        int hashCode17 = (hashCode16 + (unitCapabilities != null ? unitCapabilities.hashCode() : 0)) * 37;
        BusinessHours businessHours = this.business_hours;
        int hashCode18 = (hashCode17 + (businessHours != null ? businessHours.hashCode() : 0)) * 37;
        SpecialBusinessHours specialBusinessHours = this.special_hours;
        int hashCode19 = (hashCode18 + (specialBusinessHours != null ? specialBusinessHours.hashCode() : 0)) * 37;
        BusinessUnit businessUnit = this.business_unit;
        int hashCode20 = (hashCode19 + (businessUnit != null ? businessUnit.hashCode() : 0)) * 37;
        String str7 = this.legal_entity_token;
        int hashCode21 = hashCode20 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = hashCode21;
        return hashCode21;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.token = this.token;
        builder.version = this.version;
        builder.merchant_token = this.merchant_token;
        builder.merchant = this.merchant;
        builder.frozen = this.frozen;
        builder.name = this.name;
        builder.nickname = this.nickname;
        builder.currency_code = this.currency_code;
        builder.addresses = this.addresses;
        builder.locale = this.locale;
        builder.business_type = this.business_type;
        builder.mcc = this.mcc;
        builder.images = this.images;
        builder.status = this.status;
        builder.contact_methods = this.contact_methods;
        builder.created_ts = this.created_ts;
        builder.updated_ts = this.updated_ts;
        builder.time_zone = this.time_zone;
        builder.unit_id = this.unit_id;
        builder.has_no_automatic_point_of_sale_image = this.has_no_automatic_point_of_sale_image;
        builder.business_ids = this.business_ids;
        builder.capabilities = this.capabilities;
        builder.business_hours = this.business_hours;
        builder.special_hours = this.special_hours;
        builder.business_unit = this.business_unit;
        builder.legal_entity_token = this.legal_entity_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        String str2 = this.merchant_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "merchant_token=", arrayList);
        }
        Merchant merchant = this.merchant;
        if (merchant != null) {
            arrayList.add("merchant=" + merchant);
        }
        Boolean bool = this.frozen;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("frozen=", bool, arrayList);
        }
        Names names = this.name;
        if (names != null) {
            arrayList.add("name=" + names);
        }
        if (this.nickname != null) {
            arrayList.add("nickname=██");
        }
        CurrencyCode currencyCode = this.currency_code;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("currency_code=", currencyCode, arrayList);
        }
        List list = this.addresses;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("addresses=", arrayList, list);
        }
        UserLocale userLocale = this.locale;
        if (userLocale != null) {
            arrayList.add("locale=" + userLocale);
        }
        String str3 = this.business_type;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "business_type=", arrayList);
        }
        String str4 = this.mcc;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "mcc=", arrayList);
        }
        List list2 = this.images;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("images=", arrayList, list2);
        }
        StatusScope$Status statusScope$Status = this.status;
        if (statusScope$Status != null) {
            arrayList.add("status=" + statusScope$Status);
        }
        List list3 = this.contact_methods;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("contact_methods=", arrayList, list3);
        }
        Long l2 = this.created_ts;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_ts=", l2, arrayList);
        }
        Long l3 = this.updated_ts;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_ts=", l3, arrayList);
        }
        String str5 = this.time_zone;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "time_zone=", arrayList);
        }
        Long l4 = this.unit_id;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("unit_id=", l4, arrayList);
        }
        Boolean bool2 = this.has_no_automatic_point_of_sale_image;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_no_automatic_point_of_sale_image=", bool2, arrayList);
        }
        BusinessIds businessIds = this.business_ids;
        if (businessIds != null) {
            arrayList.add("business_ids=" + businessIds);
        }
        UnitCapabilities unitCapabilities = this.capabilities;
        if (unitCapabilities != null) {
            arrayList.add("capabilities=" + unitCapabilities);
        }
        BusinessHours businessHours = this.business_hours;
        if (businessHours != null) {
            arrayList.add("business_hours=" + businessHours);
        }
        SpecialBusinessHours specialBusinessHours = this.special_hours;
        if (specialBusinessHours != null) {
            arrayList.add("special_hours=" + specialBusinessHours);
        }
        BusinessUnit businessUnit = this.business_unit;
        if (businessUnit != null) {
            arrayList.add("business_unit=" + businessUnit);
        }
        String str6 = this.legal_entity_token;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "legal_entity_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Unit{", "}", 0, null, null, 56);
    }
}
