package com.squareup.protos.cash.customersearch.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyOutcome;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyTerminationReason;
import com.squareup.protos.cash.blockuserjourneys.api.v1.RecordCompletedJourneyRequest;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.pay.CashAppPayLoanSummaryRenderData;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.InstrumentLinkingConfig;
import com.squareup.protos.franklin.common.scenarios.BankAccountLinkingConfig;
import com.squareup.protos.franklin.common.scenarios.MenuItem;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public final class Metadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Metadata> CREATOR;
    public final String app_feature_client_route;
    public final String app_feature_name;
    public final String business_name;
    public final String business_token;
    public final String entity_attributes;
    public final String entity_name;
    public final String entity_token;
    public final EntityType entity_type;
    public final Boolean is_c4b_account;
    public final Boolean is_cash_customer;
    public final Boolean is_first_linked_account;
    public final Boolean is_linked_account;
    public final Boolean is_multiple_account_holder;
    public final List match_fields;
    public final Integer match_length;
    public final List merchant_tags;
    public final String model_version;
    public final String offer_id;
    public final OfferType offer_type;
    public final String query_token;
    public final String search_text;
    public final String stock_ticker;

    public enum EntityType implements WireEnum {
        UNKNOWN(0),
        CUSTOMER(1),
        AP_STORE(2),
        BOOST_MERCHANT(3),
        PRODUCT(4),
        SQ_MERCHANT(5),
        CAP(6),
        APP_FEATURE(7),
        STOCK(8),
        OFFER(9),
        BUSINESS(10),
        CASH_AFTERPAY(11),
        LOCAL_BRAND(12);

        public static final Metadata$EntityType$Companion$ADAPTER$1 ADAPTER;
        public static final UiAlias.Type.Companion Companion;
        public final int value;

        static {
            EntityType entityType = UNKNOWN;
            Companion = new UiAlias.Type.Companion();
            ADAPTER = new Metadata$EntityType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EntityType.class), Syntax.PROTO_2, entityType);
        }

        EntityType(int i) {
            this.value = i;
        }

        public static final EntityType fromValue(int i) {
            Companion.getClass();
            return UiAlias.Type.Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes7.dex */
    public enum OfferType implements WireEnum {
        UNKNOWN_OFFER_TYPE(0),
        CASH_APP_PAY(1),
        BOOST(2),
        BNPL(3),
        SQ_LOYALTY(4),
        SQ_COUPON(5),
        CASH_AP_INN(6),
        CASH_AP_OON(7);

        public static final Metadata$OfferType$Companion$ADAPTER$1 ADAPTER;
        public static final Alignment.Companion Companion;
        public final int value;

        static {
            OfferType offerType = UNKNOWN_OFFER_TYPE;
            Companion = new Alignment.Companion();
            ADAPTER = new Metadata$OfferType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OfferType.class), Syntax.PROTO_2, offerType);
        }

        OfferType(int i) {
            this.value = i;
        }

        public static final OfferType fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 0:
                    return UNKNOWN_OFFER_TYPE;
                case 1:
                    return CASH_APP_PAY;
                case 2:
                    return BOOST;
                case 3:
                    return BNPL;
                case 4:
                    return SQ_LOYALTY;
                case 5:
                    return SQ_COUPON;
                case 6:
                    return CASH_AP_INN;
                case 7:
                    return CASH_AP_OON;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Metadata$Companion$ADAPTER$1 metadata$Companion$ADAPTER$1 = new Metadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Metadata.class), "type.googleapis.com/squareup.cash.customersearch.api.Metadata", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/SearchCommon.proto");
        ADAPTER = metadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(metadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Metadata(String str, Integer num, Boolean bool, List list, String str2, String str3, EntityType entityType, String str4, String str5, List list2, String str6, String str7, String str8, OfferType offerType, String str9, String str10, String str11, String str12, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.model_version = str;
        this.match_length = num;
        this.is_cash_customer = bool;
        this.search_text = str2;
        this.query_token = str3;
        this.entity_type = entityType;
        this.entity_token = str4;
        this.entity_attributes = str5;
        this.entity_name = str6;
        this.business_token = str7;
        this.business_name = str8;
        this.offer_type = offerType;
        this.app_feature_name = str9;
        this.app_feature_client_route = str10;
        this.offer_id = str11;
        this.stock_ticker = str12;
        this.is_linked_account = bool2;
        this.is_c4b_account = bool3;
        this.is_multiple_account_holder = bool4;
        this.is_first_linked_account = bool5;
        this.match_fields = TransactorKt.immutableCopyOf("match_fields", list);
        this.merchant_tags = TransactorKt.immutableCopyOf("merchant_tags", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return Intrinsics.areEqual(unknownFields(), metadata.unknownFields()) && Intrinsics.areEqual(this.model_version, metadata.model_version) && Intrinsics.areEqual(this.match_length, metadata.match_length) && Intrinsics.areEqual(this.is_cash_customer, metadata.is_cash_customer) && Intrinsics.areEqual(this.match_fields, metadata.match_fields) && Intrinsics.areEqual(this.search_text, metadata.search_text) && Intrinsics.areEqual(this.query_token, metadata.query_token) && this.entity_type == metadata.entity_type && Intrinsics.areEqual(this.entity_token, metadata.entity_token) && Intrinsics.areEqual(this.entity_attributes, metadata.entity_attributes) && Intrinsics.areEqual(this.merchant_tags, metadata.merchant_tags) && Intrinsics.areEqual(this.entity_name, metadata.entity_name) && Intrinsics.areEqual(this.business_token, metadata.business_token) && Intrinsics.areEqual(this.business_name, metadata.business_name) && this.offer_type == metadata.offer_type && Intrinsics.areEqual(this.app_feature_name, metadata.app_feature_name) && Intrinsics.areEqual(this.app_feature_client_route, metadata.app_feature_client_route) && Intrinsics.areEqual(this.offer_id, metadata.offer_id) && Intrinsics.areEqual(this.stock_ticker, metadata.stock_ticker) && Intrinsics.areEqual(this.is_linked_account, metadata.is_linked_account) && Intrinsics.areEqual(this.is_c4b_account, metadata.is_c4b_account) && Intrinsics.areEqual(this.is_multiple_account_holder, metadata.is_multiple_account_holder) && Intrinsics.areEqual(this.is_first_linked_account, metadata.is_first_linked_account);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.model_version;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.match_length;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Boolean bool = this.is_cash_customer;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.match_fields);
        String str2 = this.search_text;
        int hashCode4 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.query_token;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        EntityType entityType = this.entity_type;
        int hashCode6 = (hashCode5 + (entityType != null ? entityType.hashCode() : 0)) * 37;
        String str4 = this.entity_token;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.entity_attributes;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37, 37, this.merchant_tags);
        String str6 = this.entity_name;
        int hashCode8 = (m2 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.business_token;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.business_name;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 37;
        OfferType offerType = this.offer_type;
        int hashCode11 = (hashCode10 + (offerType != null ? offerType.hashCode() : 0)) * 37;
        String str9 = this.app_feature_name;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.app_feature_client_route;
        int hashCode13 = (hashCode12 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.offer_id;
        int hashCode14 = (hashCode13 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.stock_ticker;
        int hashCode15 = (hashCode14 + (str12 != null ? str12.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_linked_account;
        int hashCode16 = (hashCode15 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.is_c4b_account;
        int hashCode17 = (hashCode16 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Boolean bool4 = this.is_multiple_account_holder;
        int hashCode18 = (hashCode17 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        Boolean bool5 = this.is_first_linked_account;
        int hashCode19 = hashCode18 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0);
        this.hashCode = hashCode19;
        return hashCode19;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.model_version = this.model_version;
        builder.match_length = this.match_length;
        builder.is_cash_customer = this.is_cash_customer;
        builder.match_fields = this.match_fields;
        builder.search_text = this.search_text;
        builder.query_token = this.query_token;
        builder.entity_type = this.entity_type;
        builder.entity_token = this.entity_token;
        builder.entity_attributes = this.entity_attributes;
        builder.merchant_tags = this.merchant_tags;
        builder.entity_name = this.entity_name;
        builder.business_token = this.business_token;
        builder.business_name = this.business_name;
        builder.offer_type = this.offer_type;
        builder.app_feature_name = this.app_feature_name;
        builder.app_feature_client_route = this.app_feature_client_route;
        builder.offer_id = this.offer_id;
        builder.stock_ticker = this.stock_ticker;
        builder.is_linked_account = this.is_linked_account;
        builder.is_c4b_account = this.is_c4b_account;
        builder.is_multiple_account_holder = this.is_multiple_account_holder;
        builder.is_first_linked_account = this.is_first_linked_account;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.model_version != null) {
            arrayList.add("model_version=██");
        }
        Integer num = this.match_length;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("match_length=", num, arrayList);
        }
        Boolean bool = this.is_cash_customer;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_cash_customer=", bool, arrayList);
        }
        List list = this.match_fields;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("match_fields=", arrayList, list);
        }
        if (this.search_text != null) {
            arrayList.add("search_text=██");
        }
        String str = this.query_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "query_token=", arrayList);
        }
        EntityType entityType = this.entity_type;
        if (entityType != null) {
            arrayList.add("entity_type=" + entityType);
        }
        String str2 = this.entity_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "entity_token=", arrayList);
        }
        String str3 = this.entity_attributes;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "entity_attributes=", arrayList);
        }
        List list2 = this.merchant_tags;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("merchant_tags=", arrayList, list2);
        }
        String str4 = this.entity_name;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "entity_name=", arrayList);
        }
        String str5 = this.business_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "business_token=", arrayList);
        }
        String str6 = this.business_name;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "business_name=", arrayList);
        }
        OfferType offerType = this.offer_type;
        if (offerType != null) {
            arrayList.add("offer_type=" + offerType);
        }
        String str7 = this.app_feature_name;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "app_feature_name=", arrayList);
        }
        String str8 = this.app_feature_client_route;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "app_feature_client_route=", arrayList);
        }
        String str9 = this.offer_id;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "offer_id=", arrayList);
        }
        String str10 = this.stock_ticker;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "stock_ticker=", arrayList);
        }
        Boolean bool2 = this.is_linked_account;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_linked_account=", bool2, arrayList);
        }
        Boolean bool3 = this.is_c4b_account;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_c4b_account=", bool3, arrayList);
        }
        Boolean bool4 = this.is_multiple_account_holder;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_multiple_account_holder=", bool4, arrayList);
        }
        Boolean bool5 = this.is_first_linked_account;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_first_linked_account=", bool5, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Metadata{", "}", 0, null, null, 56);
    }

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Serializable app_feature_client_route;
        public Serializable app_feature_name;
        public Serializable business_name;
        public String business_token;
        public String entity_attributes;
        public String entity_name;
        public String entity_token;
        public Object entity_type;
        public Object is_c4b_account;
        public Object is_cash_customer;
        public Object is_first_linked_account;
        public Object is_linked_account;
        public Object is_multiple_account_holder;
        public List match_fields;
        public Object match_length;
        public Object merchant_tags;
        public String model_version;
        public Serializable offer_id;
        public Object offer_type;
        public String query_token;
        public String search_text;
        public Serializable stock_ticker;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.match_fields = emptyList;
                    this.merchant_tags = emptyList;
                    this.offer_type = emptyList;
                    break;
                default:
                    EmptyList emptyList2 = EmptyList.INSTANCE;
                    this.match_fields = emptyList2;
                    this.merchant_tags = emptyList2;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Metadata(this.model_version, (Integer) this.match_length, (Boolean) this.is_cash_customer, this.match_fields, this.search_text, this.query_token, (EntityType) this.entity_type, this.entity_token, this.entity_attributes, (List) this.merchant_tags, this.entity_name, this.business_token, (String) this.business_name, (OfferType) this.offer_type, (String) this.app_feature_name, (String) this.app_feature_client_route, (String) this.offer_id, (String) this.stock_ticker, (Boolean) this.is_linked_account, (Boolean) this.is_c4b_account, (Boolean) this.is_multiple_account_holder, (Boolean) this.is_first_linked_account, buildUnknownFields());
                case 1:
                    return new RecordCompletedJourneyRequest(this.model_version, this.search_text, (com.squareup.protos.cash.blockuserjourneys.api.v1.EntityType) this.match_length, this.query_token, this.entity_token, this.entity_attributes, this.entity_name, this.business_token, (String) this.business_name, (String) this.app_feature_name, (String) this.app_feature_client_route, (Long) this.is_linked_account, (Long) this.is_c4b_account, (Long) this.is_multiple_account_holder, (JourneyOutcome) this.is_first_linked_account, (JourneyTerminationReason) this.entity_type, (String) this.offer_id, this.match_fields, (List) this.merchant_tags, (List) this.offer_type, (String) this.stock_ticker, (Boolean) this.is_cash_customer, buildUnknownFields());
                case 2:
                    return new CashAppPayLoanSummaryRenderData(this.model_version, (Money) this.app_feature_client_route, (Money) this.offer_id, (Money) this.stock_ticker, (Long) this.is_cash_customer, this.search_text, this.query_token, this.entity_token, this.entity_attributes, this.entity_name, this.business_token, (String) this.business_name, (Long) this.is_linked_account, (Long) this.is_c4b_account, this.match_fields, (List) this.merchant_tags, (CashAppPayLoanSummaryRenderData.AutoPayState) this.is_multiple_account_holder, (CashAppPayLoanSummaryRenderData.LendingProduct) this.is_first_linked_account, (CashAppPayLoanSummaryRenderData.LoanState) this.entity_type, (String) this.app_feature_name, (Integer) this.match_length, (Long) this.offer_type, buildUnknownFields());
                default:
                    return new InstrumentLinkingConfig((MenuItem) this.business_name, (MenuItem) this.app_feature_name, (MenuItem) this.app_feature_client_route, (MenuItem) this.offer_id, this.model_version, this.search_text, this.query_token, this.entity_token, this.entity_attributes, this.entity_name, (Boolean) this.is_cash_customer, (Integer) this.match_length, (Long) this.stock_ticker, (Boolean) this.is_linked_account, (Boolean) this.is_c4b_account, (InstrumentLinkingConfig.IssuedCardDisabledStyle) this.merchant_tags, (Boolean) this.is_multiple_account_holder, this.business_token, this.match_fields, (Boolean) this.is_first_linked_account, (Boolean) this.entity_type, (BankAccountLinkingConfig) this.offer_type, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
