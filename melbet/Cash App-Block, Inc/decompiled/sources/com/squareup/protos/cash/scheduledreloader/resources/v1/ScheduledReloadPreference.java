package com.squareup.protos.cash.scheduledreloader.resources.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.cash.ui.ActionType;
import com.squareup.protos.common.Money;
import com.squareup.protos.rewardly.ui.UiReward;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ScheduledReloadPreference extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ScheduledReloadPreference> CREATOR;
    public final Money amount;
    public final PreferenceDisabledReason disable_reason;
    public final Boolean enabled;
    public final Instant next_reload_at;
    public final ScheduledReloadStatus next_reload_status;
    public final ReloadSchedule reload_schedule;
    public final Integer remaining_failures_until_cancellation;
    public final Integer reminder_minutes_before;
    public final ReminderMode reminder_mode;
    public final String source_identifier;
    public final SourceType source_type;
    public final Instant start_reloading_at;
    public final Instant stop_reloading_at;
    public final String target_identifier_token;
    public final TargetIdentifierTokenType target_identifier_token_type;
    public final String token;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1335type;
    public final List upcoming_reload_dates;
    public final Instant updated_at;
    public final Long version;

    public enum PreferenceDisabledReason implements WireEnum {
        PREFERENCE_DISABLED_REASON_UNSPECIFIED(0),
        PREFERENCE_DISABLED_REASON_CUSTOMER_UPDATED_PREFERENCE(1),
        PREFERENCE_DISABLED_REASON_RELOAD_FAILURE(2),
        PREFERENCE_DISABLED_REASON_DISABLED_BY_PRODUCT_SERVICE(3),
        PREFERENCE_DISABLED_REASON_END_DATE_REACHED(4),
        PREFERENCE_DISABLED_REASON_UNKNOWN(5),
        PREFERENCE_DISABLED_REASON_DISABLED_BY_CCO(6);

        public static final ScheduledReloadPreference$PreferenceDisabledReason$Companion$ADAPTER$1 ADAPTER;
        public static final TextSize.Companion Companion;
        public final int value;

        static {
            PreferenceDisabledReason preferenceDisabledReason = PREFERENCE_DISABLED_REASON_UNSPECIFIED;
            Companion = new TextSize.Companion();
            ADAPTER = new ScheduledReloadPreference$PreferenceDisabledReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PreferenceDisabledReason.class), Syntax.PROTO_2, preferenceDisabledReason);
        }

        PreferenceDisabledReason(int i) {
            this.value = i;
        }

        public static final PreferenceDisabledReason fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 0:
                    return PREFERENCE_DISABLED_REASON_UNSPECIFIED;
                case 1:
                    return PREFERENCE_DISABLED_REASON_CUSTOMER_UPDATED_PREFERENCE;
                case 2:
                    return PREFERENCE_DISABLED_REASON_RELOAD_FAILURE;
                case 3:
                    return PREFERENCE_DISABLED_REASON_DISABLED_BY_PRODUCT_SERVICE;
                case 4:
                    return PREFERENCE_DISABLED_REASON_END_DATE_REACHED;
                case 5:
                    return PREFERENCE_DISABLED_REASON_UNKNOWN;
                case 6:
                    return PREFERENCE_DISABLED_REASON_DISABLED_BY_CCO;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum ReminderMode implements WireEnum {
        REMINDER_MODE_UNSPECIFIED(0),
        REMINDER_MODE_OFF(1),
        REMINDER_MODE_ALL_RELOADS(2);

        public static final ScheduledReloadPreference$ReminderMode$Companion$ADAPTER$1 ADAPTER;
        public static final TransactionType.Companion Companion;
        public final int value;

        static {
            ReminderMode reminderMode = REMINDER_MODE_UNSPECIFIED;
            Companion = new TransactionType.Companion();
            ADAPTER = new ScheduledReloadPreference$ReminderMode$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ReminderMode.class), Syntax.PROTO_2, reminderMode);
        }

        ReminderMode(int i) {
            this.value = i;
        }

        public static final ReminderMode fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return REMINDER_MODE_UNSPECIFIED;
            }
            if (i == 1) {
                return REMINDER_MODE_OFF;
            }
            if (i != 2) {
                return null;
            }
            return REMINDER_MODE_ALL_RELOADS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum SourceType implements WireEnum {
        SOURCE_TYPE_UNSPECIFIED(0),
        SOURCE_TYPE_DEBIT_CARD(1),
        SOURCE_TYPE_CASH_BALANCE(2);

        public static final ScheduledReloadPreference$SourceType$Companion$ADAPTER$1 ADAPTER;
        public static final ActionType.Companion Companion;
        public final int value;

        static {
            SourceType sourceType = SOURCE_TYPE_UNSPECIFIED;
            Companion = new ActionType.Companion();
            ADAPTER = new ScheduledReloadPreference$SourceType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SourceType.class), Syntax.PROTO_2, sourceType);
        }

        SourceType(int i) {
            this.value = i;
        }

        public static final SourceType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return SOURCE_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return SOURCE_TYPE_DEBIT_CARD;
            }
            if (i != 2) {
                return null;
            }
            return SOURCE_TYPE_CASH_BALANCE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum TargetIdentifierTokenType implements WireEnum {
        TARGET_IDENTIFIER_TOKEN_TYPE_UNSPECIFIED(0),
        TARGET_IDENTIFIER_TOKEN_TYPE_GOAL(1),
        TARGET_IDENTIFIER_TOKEN_TYPE_GENERAL_SAVINGS(2),
        TARGET_IDENTIFIER_TOKEN_TYPE_SAVINGS_BALANCE(3);

        public static final ScheduledReloadPreference$TargetIdentifierTokenType$Companion$ADAPTER$1 ADAPTER;
        public static final PoolVisibility.Companion Companion;
        public final int value;

        static {
            TargetIdentifierTokenType targetIdentifierTokenType = TARGET_IDENTIFIER_TOKEN_TYPE_UNSPECIFIED;
            Companion = new PoolVisibility.Companion();
            ADAPTER = new ScheduledReloadPreference$TargetIdentifierTokenType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TargetIdentifierTokenType.class), Syntax.PROTO_2, targetIdentifierTokenType);
        }

        TargetIdentifierTokenType(int i) {
            this.value = i;
        }

        public static final TargetIdentifierTokenType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return TARGET_IDENTIFIER_TOKEN_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return TARGET_IDENTIFIER_TOKEN_TYPE_GOAL;
            }
            if (i == 2) {
                return TARGET_IDENTIFIER_TOKEN_TYPE_GENERAL_SAVINGS;
            }
            if (i != 3) {
                return null;
            }
            return TARGET_IDENTIFIER_TOKEN_TYPE_SAVINGS_BALANCE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes8.dex */
    public enum Type implements WireEnum {
        TYPE_UNSPECIFIED(0),
        TYPE_CASH_IN(1),
        TYPE_BTC_BUY(2),
        TYPE_EQUITY_BUY(3),
        TYPE_SAVINGS_TRANSFER(4);

        public static final ScheduledReloadPreference$Type$Companion$ADAPTER$1 ADAPTER;
        public static final TaxEnvironment.Companion Companion;
        public final int value;

        static {
            Type type2 = TYPE_UNSPECIFIED;
            Companion = new TaxEnvironment.Companion();
            ADAPTER = new ScheduledReloadPreference$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, type2);
        }

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            return TaxEnvironment.Companion.m3926fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ScheduledReloadPreference$Companion$ADAPTER$1 scheduledReloadPreference$Companion$ADAPTER$1 = new ScheduledReloadPreference$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ScheduledReloadPreference.class), "type.googleapis.com/squareup.cash.scheduledreloader.resources.v1.ScheduledReloadPreference", Syntax.PROTO_2, null, "squareup/cash/scheduledreloader/resources/v1/scheduled_reload.proto");
        ADAPTER = scheduledReloadPreference$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(scheduledReloadPreference$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledReloadPreference(Boolean bool, Money money, ReloadSchedule reloadSchedule, Type type2, String str, Instant instant, String str2, Instant instant2, Integer num, TargetIdentifierTokenType targetIdentifierTokenType, String str3, SourceType sourceType, List list, ReminderMode reminderMode, Integer num2, Instant instant3, Long l, PreferenceDisabledReason preferenceDisabledReason, Instant instant4, ScheduledReloadStatus scheduledReloadStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.enabled = bool;
        this.amount = money;
        this.reload_schedule = reloadSchedule;
        this.f1335type = type2;
        this.target_identifier_token = str;
        this.next_reload_at = instant;
        this.token = str2;
        this.start_reloading_at = instant2;
        this.remaining_failures_until_cancellation = num;
        this.target_identifier_token_type = targetIdentifierTokenType;
        this.source_identifier = str3;
        this.source_type = sourceType;
        this.reminder_mode = reminderMode;
        this.reminder_minutes_before = num2;
        this.stop_reloading_at = instant3;
        this.version = l;
        this.disable_reason = preferenceDisabledReason;
        this.updated_at = instant4;
        this.next_reload_status = scheduledReloadStatus;
        this.upcoming_reload_dates = TransactorKt.immutableCopyOf("upcoming_reload_dates", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    public static ScheduledReloadPreference copy$default(ScheduledReloadPreference scheduledReloadPreference, Money money, ReloadSchedule reloadSchedule, Instant instant, Instant instant2, ArrayList arrayList, Instant instant3, Instant instant4, ByteString byteString, int i) {
        Boolean bool = Boolean.FALSE;
        if ((i & 1) != 0) {
            bool = scheduledReloadPreference.enabled;
        }
        Boolean bool2 = bool;
        Money money2 = (i & 2) != 0 ? scheduledReloadPreference.amount : money;
        ReloadSchedule reloadSchedule2 = (i & 4) != 0 ? scheduledReloadPreference.reload_schedule : reloadSchedule;
        Type type2 = scheduledReloadPreference.f1335type;
        String str = scheduledReloadPreference.target_identifier_token;
        Instant instant5 = (i & 32) != 0 ? scheduledReloadPreference.next_reload_at : instant;
        String str2 = scheduledReloadPreference.token;
        Instant instant6 = (i & 128) != 0 ? scheduledReloadPreference.start_reloading_at : instant2;
        Integer num = scheduledReloadPreference.remaining_failures_until_cancellation;
        TargetIdentifierTokenType targetIdentifierTokenType = scheduledReloadPreference.target_identifier_token_type;
        String str3 = scheduledReloadPreference.source_identifier;
        SourceType sourceType = scheduledReloadPreference.source_type;
        ArrayList arrayList2 = (i & 4096) != 0 ? scheduledReloadPreference.upcoming_reload_dates : arrayList;
        ReminderMode reminderMode = scheduledReloadPreference.reminder_mode;
        Integer num2 = scheduledReloadPreference.reminder_minutes_before;
        Instant instant7 = (i & 32768) != 0 ? scheduledReloadPreference.stop_reloading_at : instant3;
        Long l = scheduledReloadPreference.version;
        PreferenceDisabledReason preferenceDisabledReason = scheduledReloadPreference.disable_reason;
        Instant instant8 = (i & PKIFailureInfo.transactionIdInUse) != 0 ? scheduledReloadPreference.updated_at : instant4;
        ScheduledReloadStatus scheduledReloadStatus = scheduledReloadPreference.next_reload_status;
        ByteString unknownFields = (i & PKIFailureInfo.badCertTemplate) != 0 ? scheduledReloadPreference.unknownFields() : byteString;
        scheduledReloadPreference.getClass();
        arrayList2.getClass();
        unknownFields.getClass();
        return new ScheduledReloadPreference(bool2, money2, reloadSchedule2, type2, str, instant5, str2, instant6, num, targetIdentifierTokenType, str3, sourceType, arrayList2, reminderMode, num2, instant7, l, preferenceDisabledReason, instant8, scheduledReloadStatus, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScheduledReloadPreference)) {
            return false;
        }
        ScheduledReloadPreference scheduledReloadPreference = (ScheduledReloadPreference) obj;
        return Intrinsics.areEqual(unknownFields(), scheduledReloadPreference.unknownFields()) && Intrinsics.areEqual(this.enabled, scheduledReloadPreference.enabled) && Intrinsics.areEqual(this.amount, scheduledReloadPreference.amount) && Intrinsics.areEqual(this.reload_schedule, scheduledReloadPreference.reload_schedule) && this.f1335type == scheduledReloadPreference.f1335type && Intrinsics.areEqual(this.target_identifier_token, scheduledReloadPreference.target_identifier_token) && Intrinsics.areEqual(this.next_reload_at, scheduledReloadPreference.next_reload_at) && Intrinsics.areEqual(this.token, scheduledReloadPreference.token) && Intrinsics.areEqual(this.start_reloading_at, scheduledReloadPreference.start_reloading_at) && Intrinsics.areEqual(this.remaining_failures_until_cancellation, scheduledReloadPreference.remaining_failures_until_cancellation) && this.target_identifier_token_type == scheduledReloadPreference.target_identifier_token_type && Intrinsics.areEqual(this.source_identifier, scheduledReloadPreference.source_identifier) && this.source_type == scheduledReloadPreference.source_type && Intrinsics.areEqual(this.upcoming_reload_dates, scheduledReloadPreference.upcoming_reload_dates) && this.reminder_mode == scheduledReloadPreference.reminder_mode && Intrinsics.areEqual(this.reminder_minutes_before, scheduledReloadPreference.reminder_minutes_before) && Intrinsics.areEqual(this.stop_reloading_at, scheduledReloadPreference.stop_reloading_at) && Intrinsics.areEqual(this.version, scheduledReloadPreference.version) && this.disable_reason == scheduledReloadPreference.disable_reason && Intrinsics.areEqual(this.updated_at, scheduledReloadPreference.updated_at) && this.next_reload_status == scheduledReloadPreference.next_reload_status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.enabled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Money money = this.amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        ReloadSchedule reloadSchedule = this.reload_schedule;
        int hashCode4 = (hashCode3 + (reloadSchedule != null ? reloadSchedule.hashCode() : 0)) * 37;
        Type type2 = this.f1335type;
        int hashCode5 = (hashCode4 + (type2 != null ? type2.hashCode() : 0)) * 37;
        String str = this.target_identifier_token;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 37;
        Instant instant = this.next_reload_at;
        int hashCode7 = (hashCode6 + (instant != null ? instant.hashCode() : 0)) * 37;
        String str2 = this.token;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Instant instant2 = this.start_reloading_at;
        int hashCode9 = (hashCode8 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Integer num = this.remaining_failures_until_cancellation;
        int hashCode10 = (hashCode9 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        TargetIdentifierTokenType targetIdentifierTokenType = this.target_identifier_token_type;
        int hashCode11 = (hashCode10 + (targetIdentifierTokenType != null ? targetIdentifierTokenType.hashCode() : 0)) * 37;
        String str3 = this.source_identifier;
        int hashCode12 = (hashCode11 + (str3 != null ? str3.hashCode() : 0)) * 37;
        SourceType sourceType = this.source_type;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode12 + (sourceType != null ? sourceType.hashCode() : 0)) * 37, 37, this.upcoming_reload_dates);
        ReminderMode reminderMode = this.reminder_mode;
        int hashCode13 = (m + (reminderMode != null ? reminderMode.hashCode() : 0)) * 37;
        Integer num2 = this.reminder_minutes_before;
        int hashCode14 = (hashCode13 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Instant instant3 = this.stop_reloading_at;
        int hashCode15 = (hashCode14 + (instant3 != null ? instant3.hashCode() : 0)) * 37;
        Long l = this.version;
        int hashCode16 = (hashCode15 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        PreferenceDisabledReason preferenceDisabledReason = this.disable_reason;
        int hashCode17 = (hashCode16 + (preferenceDisabledReason != null ? preferenceDisabledReason.hashCode() : 0)) * 37;
        Instant instant4 = this.updated_at;
        int hashCode18 = (hashCode17 + (instant4 != null ? instant4.hashCode() : 0)) * 37;
        ScheduledReloadStatus scheduledReloadStatus = this.next_reload_status;
        int hashCode19 = hashCode18 + (scheduledReloadStatus != null ? scheduledReloadStatus.hashCode() : 0);
        this.hashCode = hashCode19;
        return hashCode19;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiReward.Builder builder = new UiReward.Builder(4);
        builder.draggable = this.enabled;
        builder.main_text = this.amount;
        builder.affiliate_link_url = this.reload_schedule;
        builder.user_agent = this.f1335type;
        builder.token = this.target_identifier_token;
        builder.full_title_text = this.next_reload_at;
        builder.category = this.token;
        builder.discount_text = this.start_reloading_at;
        builder.merchant_name = this.remaining_failures_until_cancellation;
        builder.offerly_token = this.target_identifier_token_type;
        builder.title = this.source_identifier;
        builder.reward_avatars = this.source_type;
        builder.boost_attributes = this.upcoming_reload_dates;
        builder.expiration_date_time_ms = this.reminder_mode;
        builder.merchant_tokens = this.reminder_minutes_before;
        builder.is_custom_offer = this.stop_reloading_at;
        builder.activation_date_time_ms = this.version;
        builder.redeemable_with_cash_card = this.disable_reason;
        builder.redeemable_with_cash_app_pay = this.updated_at;
        builder.app_links = this.next_reload_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        ReloadSchedule reloadSchedule = this.reload_schedule;
        if (reloadSchedule != null) {
            arrayList.add("reload_schedule=" + reloadSchedule);
        }
        Type type2 = this.f1335type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        String str = this.target_identifier_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "target_identifier_token=", arrayList);
        }
        Instant instant = this.next_reload_at;
        if (instant != null) {
            Matcher$$ExternalSyntheticOutline0.m("next_reload_at=", instant, arrayList);
        }
        String str2 = this.token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "token=", arrayList);
        }
        Instant instant2 = this.start_reloading_at;
        if (instant2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("start_reloading_at=", instant2, arrayList);
        }
        Integer num = this.remaining_failures_until_cancellation;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("remaining_failures_until_cancellation=", num, arrayList);
        }
        TargetIdentifierTokenType targetIdentifierTokenType = this.target_identifier_token_type;
        if (targetIdentifierTokenType != null) {
            arrayList.add("target_identifier_token_type=" + targetIdentifierTokenType);
        }
        String str3 = this.source_identifier;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "source_identifier=", arrayList);
        }
        SourceType sourceType = this.source_type;
        if (sourceType != null) {
            arrayList.add("source_type=" + sourceType);
        }
        List list = this.upcoming_reload_dates;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("upcoming_reload_dates=", arrayList, list);
        }
        ReminderMode reminderMode = this.reminder_mode;
        if (reminderMode != null) {
            arrayList.add("reminder_mode=" + reminderMode);
        }
        Integer num2 = this.reminder_minutes_before;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("reminder_minutes_before=", num2, arrayList);
        }
        Instant instant3 = this.stop_reloading_at;
        if (instant3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("stop_reloading_at=", instant3, arrayList);
        }
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        PreferenceDisabledReason preferenceDisabledReason = this.disable_reason;
        if (preferenceDisabledReason != null) {
            arrayList.add("disable_reason=" + preferenceDisabledReason);
        }
        Instant instant4 = this.updated_at;
        if (instant4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("updated_at=", instant4, arrayList);
        }
        ScheduledReloadStatus scheduledReloadStatus = this.next_reload_status;
        if (scheduledReloadStatus != null) {
            arrayList.add("next_reload_status=" + scheduledReloadStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScheduledReloadPreference{", "}", 0, null, null, 56);
    }
}
