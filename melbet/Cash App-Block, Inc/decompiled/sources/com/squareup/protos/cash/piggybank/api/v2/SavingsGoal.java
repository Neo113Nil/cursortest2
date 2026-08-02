package com.squareup.protos.cash.piggybank.api.v2;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SavingsGoal extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsGoal> CREATOR;
    public final String emoji_text;
    public final Money goal_amount;
    public final Money goal_balance_amount;
    public final Long goal_balance_version;
    public final GoalSchemaVersion goal_schema_version;
    public final GoalState goal_state;
    public final Boolean is_active;
    public final String label;
    public final SavingsGoalEmoji title;
    public final String token;

    public enum GoalSchemaVersion implements WireEnum {
        GOAL_SCHEMA_VERSION_DEFAULT_UNSPECIFIED(0),
        GOAL_SCHEMA_VERSION_V1(1),
        GOAL_SCHEMA_VERSION_V2(2);

        public static final SavingsGoal$GoalSchemaVersion$Companion$ADAPTER$1 ADAPTER;
        public static final TextSize.Companion Companion;
        public final int value;

        static {
            GoalSchemaVersion goalSchemaVersion = GOAL_SCHEMA_VERSION_DEFAULT_UNSPECIFIED;
            Companion = new TextSize.Companion();
            ADAPTER = new SavingsGoal$GoalSchemaVersion$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(GoalSchemaVersion.class), Syntax.PROTO_2, goalSchemaVersion);
        }

        GoalSchemaVersion(int i) {
            this.value = i;
        }

        public static final GoalSchemaVersion fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return GOAL_SCHEMA_VERSION_DEFAULT_UNSPECIFIED;
            }
            if (i == 1) {
                return GOAL_SCHEMA_VERSION_V1;
            }
            if (i != 2) {
                return null;
            }
            return GOAL_SCHEMA_VERSION_V2;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes8.dex */
    public enum GoalState implements WireEnum {
        GOAL_STATE_DEFAULT_UNSPECIFIED(0),
        GOAL_STATE_IN_PROGRESS(1),
        GOAL_STATE_COMPLETED(2),
        GOAL_STATE_REPLACED(3),
        GOAL_STATE_CANCELLED(4);

        public static final SavingsGoal$GoalState$Companion$ADAPTER$1 ADAPTER;
        public static final TransactionType.Companion Companion;
        public final int value;

        static {
            GoalState goalState = GOAL_STATE_DEFAULT_UNSPECIFIED;
            Companion = new TransactionType.Companion();
            ADAPTER = new SavingsGoal$GoalState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(GoalState.class), Syntax.PROTO_2, goalState);
        }

        GoalState(int i) {
            this.value = i;
        }

        public static final GoalState fromValue(int i) {
            Companion.getClass();
            return TransactionType.Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SavingsGoal$Companion$ADAPTER$1 savingsGoal$Companion$ADAPTER$1 = new SavingsGoal$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsGoal.class), "type.googleapis.com/squareup.cash.piggybank.api.v2.SavingsGoal", Syntax.PROTO_2, null, "squareup/cash/piggybank/api/v2/models.proto");
        ADAPTER = savingsGoal$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsGoal$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsGoal(String str, String str2, Money money, GoalState goalState, SavingsGoalEmoji savingsGoalEmoji, String str3, GoalSchemaVersion goalSchemaVersion, Boolean bool, Money money2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.emoji_text = str2;
        this.goal_amount = money;
        this.goal_state = goalState;
        this.title = savingsGoalEmoji;
        this.label = str3;
        this.goal_schema_version = goalSchemaVersion;
        this.is_active = bool;
        this.goal_balance_amount = money2;
        this.goal_balance_version = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsGoal)) {
            return false;
        }
        SavingsGoal savingsGoal = (SavingsGoal) obj;
        return Intrinsics.areEqual(unknownFields(), savingsGoal.unknownFields()) && Intrinsics.areEqual(this.token, savingsGoal.token) && Intrinsics.areEqual(this.emoji_text, savingsGoal.emoji_text) && Intrinsics.areEqual(this.goal_amount, savingsGoal.goal_amount) && this.goal_state == savingsGoal.goal_state && Intrinsics.areEqual(this.title, savingsGoal.title) && Intrinsics.areEqual(this.label, savingsGoal.label) && this.goal_schema_version == savingsGoal.goal_schema_version && Intrinsics.areEqual(this.is_active, savingsGoal.is_active) && Intrinsics.areEqual(this.goal_balance_amount, savingsGoal.goal_balance_amount) && Intrinsics.areEqual(this.goal_balance_version, savingsGoal.goal_balance_version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.emoji_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.goal_amount;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        GoalState goalState = this.goal_state;
        int hashCode5 = (hashCode4 + (goalState != null ? goalState.hashCode() : 0)) * 37;
        SavingsGoalEmoji savingsGoalEmoji = this.title;
        int hashCode6 = (hashCode5 + (savingsGoalEmoji != null ? savingsGoalEmoji.hashCode() : 0)) * 37;
        String str3 = this.label;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        GoalSchemaVersion goalSchemaVersion = this.goal_schema_version;
        int hashCode8 = (hashCode7 + (goalSchemaVersion != null ? goalSchemaVersion.hashCode() : 0)) * 37;
        Boolean bool = this.is_active;
        int hashCode9 = (hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Money money2 = this.goal_balance_amount;
        int hashCode10 = (hashCode9 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Long l = this.goal_balance_version;
        int hashCode11 = hashCode10 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashInRequest.Builder builder = new CashInRequest.Builder(15);
        builder.external_id = this.token;
        builder.passcode_token = this.emoji_text;
        builder.amount = this.goal_amount;
        builder.request_context = this.goal_state;
        builder.source = this.title;
        builder.external_client_transfer_token = this.label;
        builder.target = this.goal_schema_version;
        builder.call_context = this.is_active;
        builder.forwarded_call_context = this.goal_balance_amount;
        builder.client_verified_digital_wallet = this.goal_balance_version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.emoji_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "emoji_text=", arrayList);
        }
        Money money = this.goal_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("goal_amount=", money, arrayList);
        }
        GoalState goalState = this.goal_state;
        if (goalState != null) {
            arrayList.add("goal_state=" + goalState);
        }
        SavingsGoalEmoji savingsGoalEmoji = this.title;
        if (savingsGoalEmoji != null) {
            arrayList.add("title=" + savingsGoalEmoji);
        }
        String str3 = this.label;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "label=", arrayList);
        }
        GoalSchemaVersion goalSchemaVersion = this.goal_schema_version;
        if (goalSchemaVersion != null) {
            arrayList.add("goal_schema_version=" + goalSchemaVersion);
        }
        Boolean bool = this.is_active;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_active=", bool, arrayList);
        }
        Money money2 = this.goal_balance_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("goal_balance_amount=", money2, arrayList);
        }
        Long l = this.goal_balance_version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("goal_balance_version=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsGoal{", "}", 0, null, null, 56);
    }
}
