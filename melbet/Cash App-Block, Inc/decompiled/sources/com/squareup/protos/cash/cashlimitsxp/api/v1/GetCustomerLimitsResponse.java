package com.squareup.protos.cash.cashlimitsxp.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import app.cash.local.viewmodels.MenuItemAvailability;
import app.cash.local.viewmodels.OrderBuilderModel;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuh;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.cash.cashface.api.TrustsData;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.GetSparkWalletBalanceResponse;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.SyncContactsRequest;
import com.squareup.protos.timecards.LaborCostTotal;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/cashlimitsxp/api/v1/GetCustomerLimitsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/api/ResponseMetadata$Builder;", "Builder", "OrderType", "GroupedLimits", "FlatLimits", "LimitsSection", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetCustomerLimitsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCustomerLimitsResponse> CREATOR;
    public final OrderBuilderModel.OrderType limits;
    public final List limits_sections;

    public final class FlatLimits extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FlatLimits> CREATOR;
        public final String header_text;
        public final List limits_categories;

        public final class LimitUsage extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<LimitUsage> CREATOR;
            public final Double consumed_proportion;
            public final String limit_threshold_type_text;
            public final MenuItemAvailability limit_value;

            public final class CountLimit extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<CountLimit> CREATOR;
                public final Long count_remaining;
                public final Long count_used;
                public final Long limit_threshold_count;

                static {
                    GetCustomerLimitsResponse$FlatLimits$LimitUsage$CountLimit$Companion$ADAPTER$1 getCustomerLimitsResponse$FlatLimits$LimitUsage$CountLimit$Companion$ADAPTER$1 = new GetCustomerLimitsResponse$FlatLimits$LimitUsage$CountLimit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CountLimit.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/customer_limits.proto");
                    ADAPTER = getCustomerLimitsResponse$FlatLimits$LimitUsage$CountLimit$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerLimitsResponse$FlatLimits$LimitUsage$CountLimit$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CountLimit(Long l, Long l2, Long l3, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.count_used = l;
                    this.count_remaining = l2;
                    this.limit_threshold_count = l3;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof CountLimit)) {
                        return false;
                    }
                    CountLimit countLimit = (CountLimit) obj;
                    return Intrinsics.areEqual(unknownFields(), countLimit.unknownFields()) && Intrinsics.areEqual(this.count_used, countLimit.count_used) && Intrinsics.areEqual(this.count_remaining, countLimit.count_remaining) && Intrinsics.areEqual(this.limit_threshold_count, countLimit.limit_threshold_count);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    Long l = this.count_used;
                    int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
                    Long l2 = this.count_remaining;
                    int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
                    Long l3 = this.limit_threshold_count;
                    int hashCode4 = hashCode3 + (l3 != null ? Long.hashCode(l3.longValue()) : 0);
                    this.hashCode = hashCode4;
                    return hashCode4;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    GetSparkWalletBalanceResponse.Builder builder = new GetSparkWalletBalanceResponse.Builder(1);
                    builder.spendable_balance_sats = this.count_used;
                    builder.unclaimed_immature_deposit_balance_sats = this.count_remaining;
                    builder.unclaimed_mature_deposit_balance_sats = this.limit_threshold_count;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    Long l = this.count_used;
                    if (l != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("count_used=", l, arrayList);
                    }
                    Long l2 = this.count_remaining;
                    if (l2 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("count_remaining=", l2, arrayList);
                    }
                    Long l3 = this.limit_threshold_count;
                    if (l3 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("limit_threshold_count=", l3, arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "CountLimit{", "}", 0, null, null, 56);
                }
            }

            public final class MoneyLimit extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<MoneyLimit> CREATOR;
                public final Money amount_remaining;
                public final Money amount_used;
                public final Money limit_threshold_amount;

                static {
                    GetCustomerLimitsResponse$FlatLimits$LimitUsage$MoneyLimit$Companion$ADAPTER$1 getCustomerLimitsResponse$FlatLimits$LimitUsage$MoneyLimit$Companion$ADAPTER$1 = new GetCustomerLimitsResponse$FlatLimits$LimitUsage$MoneyLimit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MoneyLimit.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse.FlatLimits.LimitUsage.MoneyLimit", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/customer_limits.proto");
                    ADAPTER = getCustomerLimitsResponse$FlatLimits$LimitUsage$MoneyLimit$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerLimitsResponse$FlatLimits$LimitUsage$MoneyLimit$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public MoneyLimit(Money money, Money money2, Money money3, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.amount_used = money;
                    this.amount_remaining = money2;
                    this.limit_threshold_amount = money3;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof MoneyLimit)) {
                        return false;
                    }
                    MoneyLimit moneyLimit = (MoneyLimit) obj;
                    return Intrinsics.areEqual(unknownFields(), moneyLimit.unknownFields()) && Intrinsics.areEqual(this.amount_used, moneyLimit.amount_used) && Intrinsics.areEqual(this.amount_remaining, moneyLimit.amount_remaining) && Intrinsics.areEqual(this.limit_threshold_amount, moneyLimit.limit_threshold_amount);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    Money money = this.amount_used;
                    int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
                    Money money2 = this.amount_remaining;
                    int hashCode3 = (hashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
                    Money money3 = this.limit_threshold_amount;
                    int hashCode4 = hashCode3 + (money3 != null ? money3.hashCode() : 0);
                    this.hashCode = hashCode4;
                    return hashCode4;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    LaborCostTotal.Builder builder = new LaborCostTotal.Builder(1);
                    builder.regular_labor_money = this.amount_used;
                    builder.overtime_labor_money = this.amount_remaining;
                    builder.doubletime_labor_money = this.limit_threshold_amount;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    Money money = this.amount_used;
                    if (money != null) {
                        Matcher$$ExternalSyntheticOutline0.m("amount_used=", money, arrayList);
                    }
                    Money money2 = this.amount_remaining;
                    if (money2 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("amount_remaining=", money2, arrayList);
                    }
                    Money money3 = this.limit_threshold_amount;
                    if (money3 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("limit_threshold_amount=", money3, arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "MoneyLimit{", "}", 0, null, null, 56);
                }
            }

            static {
                GetCustomerLimitsResponse$FlatLimits$LimitUsage$Companion$ADAPTER$1 getCustomerLimitsResponse$FlatLimits$LimitUsage$Companion$ADAPTER$1 = new GetCustomerLimitsResponse$FlatLimits$LimitUsage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LimitUsage.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse.FlatLimits.LimitUsage", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/customer_limits.proto");
                ADAPTER = getCustomerLimitsResponse$FlatLimits$LimitUsage$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerLimitsResponse$FlatLimits$LimitUsage$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LimitUsage(Double d, String str, MenuItemAvailability menuItemAvailability, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.consumed_proportion = d;
                this.limit_threshold_type_text = str;
                this.limit_value = menuItemAvailability;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof LimitUsage)) {
                    return false;
                }
                LimitUsage limitUsage = (LimitUsage) obj;
                return Intrinsics.areEqual(unknownFields(), limitUsage.unknownFields()) && Intrinsics.areEqual(this.consumed_proportion, limitUsage.consumed_proportion) && Intrinsics.areEqual(this.limit_threshold_type_text, limitUsage.limit_threshold_type_text) && Intrinsics.areEqual(this.limit_value, limitUsage.limit_value);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Double d = this.consumed_proportion;
                int hashCode2 = (hashCode + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
                String str = this.limit_threshold_type_text;
                int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
                MenuItemAvailability menuItemAvailability = this.limit_value;
                int hashCode4 = hashCode3 + (menuItemAvailability != null ? menuItemAvailability.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Row.Builder builder = new Row.Builder(9);
                builder.subtitle = this.consumed_proportion;
                builder.title = this.limit_threshold_type_text;
                builder.action = this.limit_value;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Double d = this.consumed_proportion;
                if (d != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("consumed_proportion=", d, arrayList);
                }
                String str = this.limit_threshold_type_text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "limit_threshold_type_text=", arrayList);
                }
                MenuItemAvailability menuItemAvailability = this.limit_value;
                if (menuItemAvailability != null) {
                    arrayList.add("limit_value=" + menuItemAvailability);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "LimitUsage{", "}", 0, null, null, 56);
            }
        }

        public final class LimitsCategory extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<LimitsCategory> CREATOR;
            public final String header_text;
            public final List limit_usages;

            static {
                GetCustomerLimitsResponse$FlatLimits$LimitsCategory$Companion$ADAPTER$1 getCustomerLimitsResponse$FlatLimits$LimitsCategory$Companion$ADAPTER$1 = new GetCustomerLimitsResponse$FlatLimits$LimitsCategory$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LimitsCategory.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse.FlatLimits.LimitsCategory", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/customer_limits.proto");
                ADAPTER = getCustomerLimitsResponse$FlatLimits$LimitsCategory$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerLimitsResponse$FlatLimits$LimitsCategory$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LimitsCategory(String str, List list, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.header_text = str;
                this.limit_usages = TransactorKt.immutableCopyOf("limit_usages", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof LimitsCategory)) {
                    return false;
                }
                LimitsCategory limitsCategory = (LimitsCategory) obj;
                return Intrinsics.areEqual(unknownFields(), limitsCategory.unknownFields()) && Intrinsics.areEqual(this.header_text, limitsCategory.header_text) && Intrinsics.areEqual(this.limit_usages, limitsCategory.limit_usages);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.header_text;
                int hashCode2 = this.limit_usages.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ToggleScreen.Builder builder = new ToggleScreen.Builder(10, false);
                builder.toggle_title = this.header_text;
                builder.sections = this.limit_usages;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.header_text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header_text=", arrayList);
                }
                List list = this.limit_usages;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("limit_usages=", arrayList, list);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "LimitsCategory{", "}", 0, null, null, 56);
            }
        }

        static {
            GetCustomerLimitsResponse$FlatLimits$Companion$ADAPTER$1 getCustomerLimitsResponse$FlatLimits$Companion$ADAPTER$1 = new GetCustomerLimitsResponse$FlatLimits$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FlatLimits.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse.FlatLimits", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/customer_limits.proto");
            ADAPTER = getCustomerLimitsResponse$FlatLimits$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerLimitsResponse$FlatLimits$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FlatLimits(String str, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.header_text = str;
            this.limits_categories = TransactorKt.immutableCopyOf("limits_categories", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FlatLimits)) {
                return false;
            }
            FlatLimits flatLimits = (FlatLimits) obj;
            return Intrinsics.areEqual(unknownFields(), flatLimits.unknownFields()) && Intrinsics.areEqual(this.header_text, flatLimits.header_text) && Intrinsics.areEqual(this.limits_categories, flatLimits.limits_categories);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.header_text;
            int hashCode2 = this.limits_categories.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ToggleScreen.Builder builder = new ToggleScreen.Builder(9, false);
            builder.toggle_title = this.header_text;
            builder.sections = this.limits_categories;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.header_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header_text=", arrayList);
            }
            List list = this.limits_categories;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("limits_categories=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FlatLimits{", "}", 0, null, null, 56);
        }
    }

    public final class GroupedLimits extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<GroupedLimits> CREATOR;
        public final List limits_sections;

        static {
            GetCustomerLimitsResponse$GroupedLimits$Companion$ADAPTER$1 getCustomerLimitsResponse$GroupedLimits$Companion$ADAPTER$1 = new GetCustomerLimitsResponse$GroupedLimits$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GroupedLimits.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse.GroupedLimits", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/customer_limits.proto");
            ADAPTER = getCustomerLimitsResponse$GroupedLimits$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerLimitsResponse$GroupedLimits$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GroupedLimits(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.limits_sections = TransactorKt.immutableCopyOf("limits_sections", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GroupedLimits)) {
                return false;
            }
            GroupedLimits groupedLimits = (GroupedLimits) obj;
            return Intrinsics.areEqual(unknownFields(), groupedLimits.unknownFields()) && Intrinsics.areEqual(this.limits_sections, groupedLimits.limits_sections);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.limits_sections.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            TrustsData.Builder builder = new TrustsData.Builder(4);
            builder.trust = this.limits_sections;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.limits_sections;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("limits_sections=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GroupedLimits{", "}", 0, null, null, 56);
        }
    }

    public final class LimitsSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LimitsSection> CREATOR;
        public final String description_text;
        public final String header_text;
        public final List limits_categories;
        public final SectionType section_type;
        public final String subtitle_text;

        public final class LimitsCategory extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<LimitsCategory> CREATOR;
            public final String header_text;
            public final List limit_usages;
            public final List progress_bars;

            public final class LimitUsage extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<LimitUsage> CREATOR;
                public final Long amount_remaining_in_cents;
                public final Long amount_used_in_cents;
                public final Double consumed_proportion;
                public final String header_text;
                public final Long limit_threshold_amount_in_cents;
                public final String limit_threshold_text;
                public final String limit_threshold_type_text;
                public final zzuh limit_value;

                public final class CountLimit extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<CountLimit> CREATOR;
                    public final Long count_remaining;
                    public final Long count_used;
                    public final Long limit_threshold_count;

                    static {
                        GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$CountLimit$Companion$ADAPTER$1 getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$CountLimit$Companion$ADAPTER$1 = new GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$CountLimit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CountLimit.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.CountLimit", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/customer_limits.proto");
                        ADAPTER = getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$CountLimit$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$CountLimit$Companion$ADAPTER$1);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public CountLimit(Long l, Long l2, Long l3, ByteString byteString) {
                        super(ADAPTER, byteString);
                        byteString.getClass();
                        this.count_used = l;
                        this.count_remaining = l2;
                        this.limit_threshold_count = l3;
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof CountLimit)) {
                            return false;
                        }
                        CountLimit countLimit = (CountLimit) obj;
                        return Intrinsics.areEqual(unknownFields(), countLimit.unknownFields()) && Intrinsics.areEqual(this.count_used, countLimit.count_used) && Intrinsics.areEqual(this.count_remaining, countLimit.count_remaining) && Intrinsics.areEqual(this.limit_threshold_count, countLimit.limit_threshold_count);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        Long l = this.count_used;
                        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
                        Long l2 = this.count_remaining;
                        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
                        Long l3 = this.limit_threshold_count;
                        int hashCode4 = hashCode3 + (l3 != null ? Long.hashCode(l3.longValue()) : 0);
                        this.hashCode = hashCode4;
                        return hashCode4;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        GetSparkWalletBalanceResponse.Builder builder = new GetSparkWalletBalanceResponse.Builder(2);
                        builder.spendable_balance_sats = this.count_used;
                        builder.unclaimed_immature_deposit_balance_sats = this.count_remaining;
                        builder.unclaimed_mature_deposit_balance_sats = this.limit_threshold_count;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        Long l = this.count_used;
                        if (l != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m("count_used=", l, arrayList);
                        }
                        Long l2 = this.count_remaining;
                        if (l2 != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m("count_remaining=", l2, arrayList);
                        }
                        Long l3 = this.limit_threshold_count;
                        if (l3 != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m("limit_threshold_count=", l3, arrayList);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "CountLimit{", "}", 0, null, null, 56);
                    }
                }

                public final class MoneyLimit extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<MoneyLimit> CREATOR;
                    public final Money amount_remaining;
                    public final Money amount_used;
                    public final Money limit_threshold_amount;

                    static {
                        GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$MoneyLimit$Companion$ADAPTER$1 getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$MoneyLimit$Companion$ADAPTER$1 = new GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$MoneyLimit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MoneyLimit.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/customer_limits.proto");
                        ADAPTER = getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$MoneyLimit$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$MoneyLimit$Companion$ADAPTER$1);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public MoneyLimit(Money money, Money money2, Money money3, ByteString byteString) {
                        super(ADAPTER, byteString);
                        byteString.getClass();
                        this.amount_used = money;
                        this.amount_remaining = money2;
                        this.limit_threshold_amount = money3;
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof MoneyLimit)) {
                            return false;
                        }
                        MoneyLimit moneyLimit = (MoneyLimit) obj;
                        return Intrinsics.areEqual(unknownFields(), moneyLimit.unknownFields()) && Intrinsics.areEqual(this.amount_used, moneyLimit.amount_used) && Intrinsics.areEqual(this.amount_remaining, moneyLimit.amount_remaining) && Intrinsics.areEqual(this.limit_threshold_amount, moneyLimit.limit_threshold_amount);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        Money money = this.amount_used;
                        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
                        Money money2 = this.amount_remaining;
                        int hashCode3 = (hashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
                        Money money3 = this.limit_threshold_amount;
                        int hashCode4 = hashCode3 + (money3 != null ? money3.hashCode() : 0);
                        this.hashCode = hashCode4;
                        return hashCode4;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        LaborCostTotal.Builder builder = new LaborCostTotal.Builder(2);
                        builder.regular_labor_money = this.amount_used;
                        builder.overtime_labor_money = this.amount_remaining;
                        builder.doubletime_labor_money = this.limit_threshold_amount;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        Money money = this.amount_used;
                        if (money != null) {
                            Matcher$$ExternalSyntheticOutline0.m("amount_used=", money, arrayList);
                        }
                        Money money2 = this.amount_remaining;
                        if (money2 != null) {
                            Matcher$$ExternalSyntheticOutline0.m("amount_remaining=", money2, arrayList);
                        }
                        Money money3 = this.limit_threshold_amount;
                        if (money3 != null) {
                            Matcher$$ExternalSyntheticOutline0.m("limit_threshold_amount=", money3, arrayList);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "MoneyLimit{", "}", 0, null, null, 56);
                    }
                }

                static {
                    GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$Companion$ADAPTER$1 getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$Companion$ADAPTER$1 = new GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LimitUsage.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/customer_limits.proto");
                    ADAPTER = getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public LimitUsage(Long l, Long l2, Long l3, Double d, String str, String str2, String str3, zzuh zzuhVar, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.amount_used_in_cents = l;
                    this.amount_remaining_in_cents = l2;
                    this.limit_threshold_amount_in_cents = l3;
                    this.consumed_proportion = d;
                    this.limit_threshold_text = str;
                    this.header_text = str2;
                    this.limit_threshold_type_text = str3;
                    this.limit_value = zzuhVar;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof LimitUsage)) {
                        return false;
                    }
                    LimitUsage limitUsage = (LimitUsage) obj;
                    return Intrinsics.areEqual(unknownFields(), limitUsage.unknownFields()) && Intrinsics.areEqual(this.amount_used_in_cents, limitUsage.amount_used_in_cents) && Intrinsics.areEqual(this.amount_remaining_in_cents, limitUsage.amount_remaining_in_cents) && Intrinsics.areEqual(this.limit_threshold_amount_in_cents, limitUsage.limit_threshold_amount_in_cents) && Intrinsics.areEqual(this.consumed_proportion, limitUsage.consumed_proportion) && Intrinsics.areEqual(this.limit_threshold_text, limitUsage.limit_threshold_text) && Intrinsics.areEqual(this.header_text, limitUsage.header_text) && Intrinsics.areEqual(this.limit_threshold_type_text, limitUsage.limit_threshold_type_text) && Intrinsics.areEqual(this.limit_value, limitUsage.limit_value);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    Long l = this.amount_used_in_cents;
                    int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
                    Long l2 = this.amount_remaining_in_cents;
                    int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
                    Long l3 = this.limit_threshold_amount_in_cents;
                    int hashCode4 = (hashCode3 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
                    Double d = this.consumed_proportion;
                    int hashCode5 = (hashCode4 + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
                    String str = this.limit_threshold_text;
                    int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 37;
                    String str2 = this.header_text;
                    int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
                    String str3 = this.limit_threshold_type_text;
                    int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
                    zzuh zzuhVar = this.limit_value;
                    int hashCode9 = hashCode8 + (zzuhVar != null ? zzuhVar.hashCode() : 0);
                    this.hashCode = hashCode9;
                    return hashCode9;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    Badge.Builder builder = new Badge.Builder(11, false);
                    builder.external_version = this.amount_used_in_cents;
                    builder.updated_at = this.amount_remaining_in_cents;
                    builder.created_at = this.limit_threshold_amount_in_cents;
                    builder.is_badged = this.consumed_proportion;
                    builder.external_token = this.limit_threshold_text;
                    builder.customer_token = this.header_text;
                    builder.item_type = this.limit_threshold_type_text;
                    builder.count_groups = this.limit_value;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    Long l = this.amount_used_in_cents;
                    if (l != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("amount_used_in_cents=", l, arrayList);
                    }
                    Long l2 = this.amount_remaining_in_cents;
                    if (l2 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("amount_remaining_in_cents=", l2, arrayList);
                    }
                    Long l3 = this.limit_threshold_amount_in_cents;
                    if (l3 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("limit_threshold_amount_in_cents=", l3, arrayList);
                    }
                    Double d = this.consumed_proportion;
                    if (d != null) {
                        SizeMode$EnumUnboxingLocalUtility.m("consumed_proportion=", d, arrayList);
                    }
                    String str = this.limit_threshold_text;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "limit_threshold_text=", arrayList);
                    }
                    String str2 = this.header_text;
                    if (str2 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "header_text=", arrayList);
                    }
                    String str3 = this.limit_threshold_type_text;
                    if (str3 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "limit_threshold_type_text=", arrayList);
                    }
                    zzuh zzuhVar = this.limit_value;
                    if (zzuhVar != null) {
                        arrayList.add("limit_value=" + zzuhVar);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "LimitUsage{", "}", 0, null, null, 56);
                }
            }

            public final class ProgressBar extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<ProgressBar> CREATOR;
                public final String color;
                public final String primary_display_text;
                public final Double progress;
                public final String secondary_display_text;

                /* renamed from: type, reason: collision with root package name */
                public final Type f1249type;

                public enum Type implements WireEnum {
                    TYPE_UNSPECIFIED(0),
                    TYPE_FIAT(1);

                    public static final GetCustomerLimitsResponse$LimitsSection$LimitsCategory$ProgressBar$Type$Companion$ADAPTER$1 ADAPTER;
                    public static final Channel.Companion Companion;
                    public final int value;

                    static {
                        Type type2 = TYPE_UNSPECIFIED;
                        Companion = new Channel.Companion();
                        ADAPTER = new GetCustomerLimitsResponse$LimitsSection$LimitsCategory$ProgressBar$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, type2);
                    }

                    Type(int i) {
                        this.value = i;
                    }

                    public static final Type fromValue(int i) {
                        Companion.getClass();
                        if (i == 0) {
                            return TYPE_UNSPECIFIED;
                        }
                        if (i != 1) {
                            return null;
                        }
                        return TYPE_FIAT;
                    }

                    @Override // com.squareup.wire.WireEnum
                    public final int getValue() {
                        return this.value;
                    }
                }

                static {
                    GetCustomerLimitsResponse$LimitsSection$LimitsCategory$ProgressBar$Companion$ADAPTER$1 getCustomerLimitsResponse$LimitsSection$LimitsCategory$ProgressBar$Companion$ADAPTER$1 = new GetCustomerLimitsResponse$LimitsSection$LimitsCategory$ProgressBar$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProgressBar.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/customer_limits.proto");
                    ADAPTER = getCustomerLimitsResponse$LimitsSection$LimitsCategory$ProgressBar$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerLimitsResponse$LimitsSection$LimitsCategory$ProgressBar$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ProgressBar(String str, String str2, Double d, Type type2, String str3, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.primary_display_text = str;
                    this.secondary_display_text = str2;
                    this.progress = d;
                    this.f1249type = type2;
                    this.color = str3;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof ProgressBar)) {
                        return false;
                    }
                    ProgressBar progressBar = (ProgressBar) obj;
                    return Intrinsics.areEqual(unknownFields(), progressBar.unknownFields()) && Intrinsics.areEqual(this.primary_display_text, progressBar.primary_display_text) && Intrinsics.areEqual(this.secondary_display_text, progressBar.secondary_display_text) && Intrinsics.areEqual(this.progress, progressBar.progress) && this.f1249type == progressBar.f1249type && Intrinsics.areEqual(this.color, progressBar.color);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    String str = this.primary_display_text;
                    int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                    String str2 = this.secondary_display_text;
                    int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                    Double d = this.progress;
                    int hashCode4 = (hashCode3 + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
                    Type type2 = this.f1249type;
                    int hashCode5 = (hashCode4 + (type2 != null ? type2.hashCode() : 0)) * 37;
                    String str3 = this.color;
                    int hashCode6 = hashCode5 + (str3 != null ? str3.hashCode() : 0);
                    this.hashCode = hashCode6;
                    return hashCode6;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    Account.Builder builder = new Account.Builder(9, false);
                    builder.customer_token = this.primary_display_text;
                    builder.account_token = this.secondary_display_text;
                    builder.account_type = this.progress;
                    builder.is_sponsored_account = this.f1249type;
                    builder.display_name = this.color;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.primary_display_text;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "primary_display_text=", arrayList);
                    }
                    String str2 = this.secondary_display_text;
                    if (str2 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "secondary_display_text=", arrayList);
                    }
                    Double d = this.progress;
                    if (d != null) {
                        SizeMode$EnumUnboxingLocalUtility.m("progress=", d, arrayList);
                    }
                    Type type2 = this.f1249type;
                    if (type2 != null) {
                        arrayList.add("type=" + type2);
                    }
                    String str3 = this.color;
                    if (str3 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "color=", arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "ProgressBar{", "}", 0, null, null, 56);
                }
            }

            static {
                GetCustomerLimitsResponse$LimitsSection$LimitsCategory$Companion$ADAPTER$1 getCustomerLimitsResponse$LimitsSection$LimitsCategory$Companion$ADAPTER$1 = new GetCustomerLimitsResponse$LimitsSection$LimitsCategory$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LimitsCategory.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse.LimitsSection.LimitsCategory", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/customer_limits.proto");
                ADAPTER = getCustomerLimitsResponse$LimitsSection$LimitsCategory$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerLimitsResponse$LimitsSection$LimitsCategory$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LimitsCategory(String str, List list, List list2, ByteString byteString) {
                super(ADAPTER, byteString);
                BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
                this.header_text = str;
                this.progress_bars = TransactorKt.immutableCopyOf("progress_bars", list);
                this.limit_usages = TransactorKt.immutableCopyOf("limit_usages", list2);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof LimitsCategory)) {
                    return false;
                }
                LimitsCategory limitsCategory = (LimitsCategory) obj;
                return Intrinsics.areEqual(unknownFields(), limitsCategory.unknownFields()) && Intrinsics.areEqual(this.header_text, limitsCategory.header_text) && Intrinsics.areEqual(this.progress_bars, limitsCategory.progress_bars) && Intrinsics.areEqual(this.limit_usages, limitsCategory.limit_usages);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.header_text;
                int hashCode2 = this.limit_usages.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.progress_bars);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                SyncContactsRequest.Builder builder = new SyncContactsRequest.Builder(3, false);
                builder.sync_token = this.header_text;
                builder.add_hashed_aliases = this.progress_bars;
                builder.remove_hashed_aliases = this.limit_usages;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.header_text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header_text=", arrayList);
                }
                List list = this.progress_bars;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("progress_bars=", arrayList, list);
                }
                List list2 = this.limit_usages;
                if (!list2.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("limit_usages=", arrayList, list2);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "LimitsCategory{", "}", 0, null, null, 56);
            }
        }

        public enum SectionType implements WireEnum {
            SECTION_TYPE_UNSPECIFIED(0),
            SECTION_TYPE_SEND_AND_RECEIVE(1),
            SECTION_TYPE_DEPOSIT_AND_WITHDRAW(2),
            SECTION_TYPE_CASH_CARD(3),
            SECTION_TYPE_BITCOIN(4),
            SECTION_TYPE_STOCKS(5);

            public static final GetCustomerLimitsResponse$LimitsSection$SectionType$Companion$ADAPTER$1 ADAPTER;
            public static final RadioType.Companion Companion;
            public final int value;

            static {
                SectionType sectionType = SECTION_TYPE_UNSPECIFIED;
                Companion = new RadioType.Companion();
                ADAPTER = new GetCustomerLimitsResponse$LimitsSection$SectionType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SectionType.class), Syntax.PROTO_2, sectionType);
            }

            SectionType(int i) {
                this.value = i;
            }

            public static final SectionType fromValue(int i) {
                Companion.getClass();
                return RadioType.Companion.fromValue(i);
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            GetCustomerLimitsResponse$LimitsSection$Companion$ADAPTER$1 getCustomerLimitsResponse$LimitsSection$Companion$ADAPTER$1 = new GetCustomerLimitsResponse$LimitsSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LimitsSection.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse.LimitsSection", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/customer_limits.proto");
            ADAPTER = getCustomerLimitsResponse$LimitsSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerLimitsResponse$LimitsSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LimitsSection(String str, List list, String str2, SectionType sectionType, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.header_text = str;
            this.description_text = str2;
            this.section_type = sectionType;
            this.subtitle_text = str3;
            this.limits_categories = TransactorKt.immutableCopyOf("limits_categories", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LimitsSection)) {
                return false;
            }
            LimitsSection limitsSection = (LimitsSection) obj;
            return Intrinsics.areEqual(unknownFields(), limitsSection.unknownFields()) && Intrinsics.areEqual(this.header_text, limitsSection.header_text) && Intrinsics.areEqual(this.limits_categories, limitsSection.limits_categories) && Intrinsics.areEqual(this.description_text, limitsSection.description_text) && this.section_type == limitsSection.section_type && Intrinsics.areEqual(this.subtitle_text, limitsSection.subtitle_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.header_text;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.limits_categories);
            String str2 = this.description_text;
            int hashCode2 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
            SectionType sectionType = this.section_type;
            int hashCode3 = (hashCode2 + (sectionType != null ? sectionType.hashCode() : 0)) * 37;
            String str3 = this.subtitle_text;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Account.Builder builder = new Account.Builder(8, false);
            builder.customer_token = this.header_text;
            builder.account_type = this.limits_categories;
            builder.account_token = this.description_text;
            builder.is_sponsored_account = this.section_type;
            builder.display_name = this.subtitle_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.header_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header_text=", arrayList);
            }
            List list = this.limits_categories;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("limits_categories=", arrayList, list);
            }
            String str2 = this.description_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description_text=", arrayList);
            }
            SectionType sectionType = this.section_type;
            if (sectionType != null) {
                arrayList.add("section_type=" + sectionType);
            }
            String str3 = this.subtitle_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "subtitle_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LimitsSection{", "}", 0, null, null, 56);
        }
    }

    static {
        GetCustomerLimitsResponse$Companion$ADAPTER$1 getCustomerLimitsResponse$Companion$ADAPTER$1 = new GetCustomerLimitsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetCustomerLimitsResponse.class), "type.googleapis.com/squareup.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse", Syntax.PROTO_2, null, "squareup/cash/cashlimitsxp/api/v1/customer_limits.proto");
        ADAPTER = getCustomerLimitsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerLimitsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCustomerLimitsResponse(List list, OrderBuilderModel.OrderType orderType, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.limits = orderType;
        this.limits_sections = TransactorKt.immutableCopyOf("limits_sections", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCustomerLimitsResponse)) {
            return false;
        }
        GetCustomerLimitsResponse getCustomerLimitsResponse = (GetCustomerLimitsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getCustomerLimitsResponse.unknownFields()) && Intrinsics.areEqual(this.limits_sections, getCustomerLimitsResponse.limits_sections) && Intrinsics.areEqual(this.limits, getCustomerLimitsResponse.limits);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.limits_sections);
        OrderBuilderModel.OrderType orderType = this.limits;
        int hashCode = m + (orderType != null ? orderType.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(27);
        builder.errors = this.limits_sections;
        builder.result = this.limits;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.limits_sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("limits_sections=", arrayList, list);
        }
        OrderBuilderModel.OrderType orderType = this.limits;
        if (orderType != null) {
            arrayList.add("limits=" + orderType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCustomerLimitsResponse{", "}", 0, null, null, 56);
    }
}
