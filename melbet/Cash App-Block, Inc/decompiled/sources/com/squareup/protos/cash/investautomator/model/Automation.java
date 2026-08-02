package com.squareup.protos.cash.investautomator.model;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.cash.mosaic.personalization.api.v1.Entity;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.time.Instant;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.earnings.EarningsYearToDate;

/* loaded from: classes7.dex */
public final class Automation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Automation> CREATOR;
    public final AllocationStrategy allocation_strategy;
    public final String customer_token;
    public final Instant disabled_at;
    public final Instant enabled_at;
    public final AutomationStatus status;
    public final AutomationTarget target;
    public final String token;
    public final AutomationTrigger trigger;
    public final Integer version;

    public enum AutomationStatus implements WireEnum {
        COULD_NOT_PARSE_AUTOMATION_STATUS_UNSPECIFIED(0),
        ACTIVE(1),
        INACTIVE(2);

        public static final Automation$AutomationStatus$Companion$ADAPTER$1 ADAPTER;
        public static final FeeType.Companion Companion;
        public final int value;

        static {
            AutomationStatus automationStatus = COULD_NOT_PARSE_AUTOMATION_STATUS_UNSPECIFIED;
            Companion = new FeeType.Companion();
            ADAPTER = new Automation$AutomationStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AutomationStatus.class), Syntax.PROTO_2, automationStatus);
        }

        AutomationStatus(int i) {
            this.value = i;
        }

        public static final AutomationStatus fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return COULD_NOT_PARSE_AUTOMATION_STATUS_UNSPECIFIED;
            }
            if (i == 1) {
                return ACTIVE;
            }
            if (i != 2) {
                return null;
            }
            return INACTIVE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum AutomationTrigger implements WireEnum {
        COULD_NOT_PARSE_AUTOMATION_TRIGGER_UNSPECIFIED(0),
        CASH_CARD_PURCHASE(1),
        PAYCHECK_ALLOCATION(2);

        public static final Automation$AutomationTrigger$Companion$ADAPTER$1 ADAPTER;
        public static final RetailerType.Companion Companion;
        public final int value;

        static {
            AutomationTrigger automationTrigger = COULD_NOT_PARSE_AUTOMATION_TRIGGER_UNSPECIFIED;
            Companion = new RetailerType.Companion();
            ADAPTER = new Automation$AutomationTrigger$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AutomationTrigger.class), Syntax.PROTO_2, automationTrigger);
        }

        AutomationTrigger(int i) {
            this.value = i;
        }

        public static final AutomationTrigger fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return COULD_NOT_PARSE_AUTOMATION_TRIGGER_UNSPECIFIED;
            }
            if (i == 1) {
                return CASH_CARD_PURCHASE;
            }
            if (i != 2) {
                return null;
            }
            return PAYCHECK_ALLOCATION;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Automation$Companion$ADAPTER$1 automation$Companion$ADAPTER$1 = new Automation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Automation.class), "type.googleapis.com/squareup.cash.investautomator.model.Automation", Syntax.PROTO_2, null, "squareup/cash/investautomator/model/automation.proto");
        ADAPTER = automation$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(automation$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Automation(String str, String str2, Integer num, AutomationStatus automationStatus, AutomationTrigger automationTrigger, AllocationStrategy allocationStrategy, AutomationTarget automationTarget, Instant instant, Instant instant2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.customer_token = str2;
        this.version = num;
        this.status = automationStatus;
        this.trigger = automationTrigger;
        this.allocation_strategy = allocationStrategy;
        this.target = automationTarget;
        this.disabled_at = instant;
        this.enabled_at = instant2;
    }

    public static Automation copy$default(Automation automation, AutomationStatus automationStatus, AllocationStrategy allocationStrategy, AutomationTarget automationTarget, Instant instant, Instant instant2, ByteString byteString, int i) {
        String str = automation.token;
        String str2 = automation.customer_token;
        Integer num = automation.version;
        if ((i & 8) != 0) {
            automationStatus = automation.status;
        }
        AutomationStatus automationStatus2 = automationStatus;
        AutomationTrigger automationTrigger = automation.trigger;
        if ((i & 32) != 0) {
            allocationStrategy = automation.allocation_strategy;
        }
        AllocationStrategy allocationStrategy2 = allocationStrategy;
        if ((i & 64) != 0) {
            automationTarget = automation.target;
        }
        AutomationTarget automationTarget2 = automationTarget;
        Instant instant3 = (i & 128) != 0 ? automation.disabled_at : instant;
        Instant instant4 = (i & 256) != 0 ? automation.enabled_at : instant2;
        ByteString unknownFields = (i & 512) != 0 ? automation.unknownFields() : byteString;
        automation.getClass();
        unknownFields.getClass();
        return new Automation(str, str2, num, automationStatus2, automationTrigger, allocationStrategy2, automationTarget2, instant3, instant4, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Automation)) {
            return false;
        }
        Automation automation = (Automation) obj;
        return Intrinsics.areEqual(unknownFields(), automation.unknownFields()) && Intrinsics.areEqual(this.token, automation.token) && Intrinsics.areEqual(this.customer_token, automation.customer_token) && Intrinsics.areEqual(this.version, automation.version) && this.status == automation.status && this.trigger == automation.trigger && Intrinsics.areEqual(this.allocation_strategy, automation.allocation_strategy) && Intrinsics.areEqual(this.target, automation.target) && Intrinsics.areEqual(this.disabled_at, automation.disabled_at) && Intrinsics.areEqual(this.enabled_at, automation.enabled_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.customer_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.version;
        int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        AutomationStatus automationStatus = this.status;
        int hashCode5 = (hashCode4 + (automationStatus != null ? automationStatus.hashCode() : 0)) * 37;
        AutomationTrigger automationTrigger = this.trigger;
        int hashCode6 = (hashCode5 + (automationTrigger != null ? automationTrigger.hashCode() : 0)) * 37;
        AllocationStrategy allocationStrategy = this.allocation_strategy;
        int hashCode7 = (hashCode6 + (allocationStrategy != null ? allocationStrategy.hashCode() : 0)) * 37;
        AutomationTarget automationTarget = this.target;
        int hashCode8 = (hashCode7 + (automationTarget != null ? automationTarget.hashCode() : 0)) * 37;
        Instant instant = this.disabled_at;
        int hashCode9 = (hashCode8 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.enabled_at;
        int hashCode10 = hashCode9 + (instant2 != null ? instant2.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(20, false);
        builder.locale = this.token;
        builder.title = this.customer_token;
        builder.info_rows_header = this.version;
        builder.footer_text = this.status;
        builder.loadable_subtitle = this.trigger;
        builder.info_rows = this.allocation_strategy;
        builder.primary_footer_button_state = this.target;
        builder.secondary_footer_button_state = this.disabled_at;
        builder.payment_plans_data = this.enabled_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.customer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "customer_token=", arrayList);
        }
        Integer num = this.version;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("version=", num, arrayList);
        }
        AutomationStatus automationStatus = this.status;
        if (automationStatus != null) {
            arrayList.add("status=" + automationStatus);
        }
        AutomationTrigger automationTrigger = this.trigger;
        if (automationTrigger != null) {
            arrayList.add("trigger=" + automationTrigger);
        }
        AllocationStrategy allocationStrategy = this.allocation_strategy;
        if (allocationStrategy != null) {
            arrayList.add("allocation_strategy=" + allocationStrategy);
        }
        AutomationTarget automationTarget = this.target;
        if (automationTarget != null) {
            arrayList.add("target=" + automationTarget);
        }
        Instant instant = this.disabled_at;
        if (instant != null) {
            Matcher$$ExternalSyntheticOutline0.m("disabled_at=", instant, arrayList);
        }
        Instant instant2 = this.enabled_at;
        if (instant2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("enabled_at=", instant2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Automation{", "}", 0, null, null, 56);
    }

    public final class AllocationStrategy extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AllocationStrategy> CREATOR;

        /* renamed from: type, reason: collision with root package name */
        public final ImageHeaderParserUtils f1278type;

        public final class Fixed extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Fixed> CREATOR;
            public final Money amount;

            static {
                Automation$AllocationStrategy$Fixed$Companion$ADAPTER$1 automation$AllocationStrategy$Fixed$Companion$ADAPTER$1 = new Automation$AllocationStrategy$Fixed$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Fixed.class), "type.googleapis.com/squareup.cash.investautomator.model.Automation.AllocationStrategy.Fixed", Syntax.PROTO_2, null, "squareup/cash/investautomator/model/automation.proto");
                ADAPTER = automation$AllocationStrategy$Fixed$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(automation$AllocationStrategy$Fixed$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Fixed(Money money, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.amount = money;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Fixed)) {
                    return false;
                }
                Fixed fixed = (Fixed) obj;
                return Intrinsics.areEqual(unknownFields(), fixed.unknownFields()) && Intrinsics.areEqual(this.amount, fixed.amount);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Money money = this.amount;
                int hashCode2 = hashCode + (money != null ? money.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Entity.Payment.Builder builder = new Entity.Payment.Builder(3);
                builder.amount = this.amount;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Money money = this.amount;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Fixed{", "}", 0, null, null, 56);
            }
        }

        static {
            Automation$AllocationStrategy$Companion$ADAPTER$1 automation$AllocationStrategy$Companion$ADAPTER$1 = new Automation$AllocationStrategy$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AllocationStrategy.class), "type.googleapis.com/squareup.cash.investautomator.model.Automation.AllocationStrategy", Syntax.PROTO_2, null, "squareup/cash/investautomator/model/automation.proto");
            ADAPTER = automation$AllocationStrategy$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(automation$AllocationStrategy$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AllocationStrategy(ImageHeaderParserUtils imageHeaderParserUtils, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.f1278type = imageHeaderParserUtils;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AllocationStrategy)) {
                return false;
            }
            AllocationStrategy allocationStrategy = (AllocationStrategy) obj;
            return Intrinsics.areEqual(unknownFields(), allocationStrategy.unknownFields()) && Intrinsics.areEqual(this.f1278type, allocationStrategy.f1278type);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ImageHeaderParserUtils imageHeaderParserUtils = this.f1278type;
            int hashCode2 = hashCode + (imageHeaderParserUtils != null ? imageHeaderParserUtils.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GroupParticipant.Builder builder = new GroupParticipant.Builder(6);
            builder.f1276type = this.f1278type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ImageHeaderParserUtils imageHeaderParserUtils = this.f1278type;
            if (imageHeaderParserUtils != null) {
                arrayList.add("type=" + imageHeaderParserUtils);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AllocationStrategy{", "}", 0, null, null, 56);
        }

        public final class RoundUp extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<RoundUp> CREATOR;
            public final Integer multiplier;

            static {
                Automation$AllocationStrategy$RoundUp$Companion$ADAPTER$1 automation$AllocationStrategy$RoundUp$Companion$ADAPTER$1 = new Automation$AllocationStrategy$RoundUp$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RoundUp.class), "type.googleapis.com/squareup.cash.investautomator.model.Automation.AllocationStrategy.RoundUp", Syntax.PROTO_2, null, "squareup/cash/investautomator/model/automation.proto");
                ADAPTER = automation$AllocationStrategy$RoundUp$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(automation$AllocationStrategy$RoundUp$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RoundUp(Integer num, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.multiplier = num;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RoundUp)) {
                    return false;
                }
                RoundUp roundUp = (RoundUp) obj;
                return Intrinsics.areEqual(unknownFields(), roundUp.unknownFields()) && Intrinsics.areEqual(this.multiplier, roundUp.multiplier);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Integer num = this.multiplier;
                int hashCode2 = hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                EarningsYearToDate.Builder builder = new EarningsYearToDate.Builder(4);
                builder.year = this.multiplier;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Integer num = this.multiplier;
                if (num != null) {
                    re$$ExternalSyntheticOutline0.m("multiplier=", num, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "RoundUp{", "}", 0, null, null, 56);
            }

            public /* synthetic */ RoundUp(Integer num) {
                this(num, ByteString.EMPTY);
            }
        }

        public /* synthetic */ AllocationStrategy(Automation$AllocationStrategy$Type$RoundUp automation$AllocationStrategy$Type$RoundUp) {
            this(automation$AllocationStrategy$Type$RoundUp, ByteString.EMPTY);
        }
    }

    public /* synthetic */ Automation(AllocationStrategy allocationStrategy, AutomationTarget automationTarget) {
        this(null, null, null, AutomationStatus.ACTIVE, AutomationTrigger.CASH_CARD_PURCHASE, allocationStrategy, automationTarget, null, null, ByteString.EMPTY);
    }

    public final class AutomationTarget extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AutomationTarget> CREATOR;
        public final String alt_display_icon_url;
        public final String alt_display_name;
        public final Color background_color;
        public final Color border_color;
        public final String display_icon_url;
        public final String display_name;
        public final String icon_id;
        public final String icon_unicode;
        public final String identifier;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1279type;

        public enum Type implements WireEnum {
            COULD_NOT_PARSE_AUTOMATION_TARGET_TYPE_UNSPECIFIED(0),
            INVESTMENT_ENTITY(1),
            CRYPTOCURRENCY(2),
            SAVINGS_BALANCE(4),
            SAVINGS_GOAL(5);

            public static final Automation$AutomationTarget$Type$Companion$ADAPTER$1 ADAPTER;
            public static final ContactAliasType.Companion Companion;
            public final int value;

            static {
                Type type2 = COULD_NOT_PARSE_AUTOMATION_TARGET_TYPE_UNSPECIFIED;
                Companion = new ContactAliasType.Companion();
                ADAPTER = new Automation$AutomationTarget$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, type2);
            }

            Type(int i) {
                this.value = i;
            }

            public static final Type fromValue(int i) {
                Companion.getClass();
                return ContactAliasType.Companion.fromValue(i);
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            Automation$AutomationTarget$Companion$ADAPTER$1 automation$AutomationTarget$Companion$ADAPTER$1 = new Automation$AutomationTarget$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AutomationTarget.class), "type.googleapis.com/squareup.cash.investautomator.model.Automation.AutomationTarget", Syntax.PROTO_2, null, "squareup/cash/investautomator/model/automation.proto");
            ADAPTER = automation$AutomationTarget$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(automation$AutomationTarget$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutomationTarget(Type type2, String str, String str2, String str3, String str4, String str5, Color color, Color color2, String str6, String str7, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.f1279type = type2;
            this.identifier = str;
            this.display_name = str2;
            this.display_icon_url = str3;
            this.alt_display_name = str4;
            this.alt_display_icon_url = str5;
            this.border_color = color;
            this.background_color = color2;
            this.icon_unicode = str6;
            this.icon_id = str7;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AutomationTarget)) {
                return false;
            }
            AutomationTarget automationTarget = (AutomationTarget) obj;
            return Intrinsics.areEqual(unknownFields(), automationTarget.unknownFields()) && this.f1279type == automationTarget.f1279type && Intrinsics.areEqual(this.identifier, automationTarget.identifier) && Intrinsics.areEqual(this.display_name, automationTarget.display_name) && Intrinsics.areEqual(this.display_icon_url, automationTarget.display_icon_url) && Intrinsics.areEqual(this.alt_display_name, automationTarget.alt_display_name) && Intrinsics.areEqual(this.alt_display_icon_url, automationTarget.alt_display_icon_url) && Intrinsics.areEqual(this.border_color, automationTarget.border_color) && Intrinsics.areEqual(this.background_color, automationTarget.background_color) && Intrinsics.areEqual(this.icon_unicode, automationTarget.icon_unicode) && Intrinsics.areEqual(this.icon_id, automationTarget.icon_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Type type2 = this.f1279type;
            int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
            String str = this.identifier;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.display_name;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.display_icon_url;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.alt_display_name;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.alt_display_icon_url;
            int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
            Color color = this.border_color;
            int hashCode8 = (hashCode7 + (color != null ? color.hashCode() : 0)) * 37;
            Color color2 = this.background_color;
            int hashCode9 = (hashCode8 + (color2 != null ? color2.hashCode() : 0)) * 37;
            String str6 = this.icon_unicode;
            int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37;
            String str7 = this.icon_id;
            int hashCode11 = hashCode10 + (str7 != null ? str7.hashCode() : 0);
            this.hashCode = hashCode11;
            return hashCode11;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CashInRequest.Builder builder = new CashInRequest.Builder(5);
            builder.request_context = this.f1279type;
            builder.external_id = this.identifier;
            builder.passcode_token = this.display_name;
            builder.external_client_transfer_token = this.display_icon_url;
            builder.source = this.alt_display_name;
            builder.target = this.alt_display_icon_url;
            builder.amount = this.border_color;
            builder.call_context = this.background_color;
            builder.forwarded_call_context = this.icon_unicode;
            builder.client_verified_digital_wallet = this.icon_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Type type2 = this.f1279type;
            if (type2 != null) {
                arrayList.add("type=" + type2);
            }
            String str = this.identifier;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "identifier=", arrayList);
            }
            String str2 = this.display_name;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "display_name=", arrayList);
            }
            String str3 = this.display_icon_url;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "display_icon_url=", arrayList);
            }
            String str4 = this.alt_display_name;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "alt_display_name=", arrayList);
            }
            String str5 = this.alt_display_icon_url;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "alt_display_icon_url=", arrayList);
            }
            Color color = this.border_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("border_color=", color, arrayList);
            }
            Color color2 = this.background_color;
            if (color2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color2, arrayList);
            }
            String str6 = this.icon_unicode;
            if (str6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "icon_unicode=", arrayList);
            }
            String str7 = this.icon_id;
            if (str7 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "icon_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AutomationTarget{", "}", 0, null, null, 56);
        }

        public /* synthetic */ AutomationTarget(String str) {
            this(Type.CRYPTOCURRENCY, str, null, null, null, null, null, null, null, null, ByteString.EMPTY);
        }
    }
}
