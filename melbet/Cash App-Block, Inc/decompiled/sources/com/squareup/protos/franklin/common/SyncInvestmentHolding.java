package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.protos.person.Alias;
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
import okio.internal.ResourceFileSystem;

/* loaded from: classes8.dex */
public final class SyncInvestmentHolding extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncInvestmentHolding> CREATOR;
    public final Money active_invested_amount;
    public final Money average_cost;
    public final DailyGainParams daily_gain_params;
    public final String investment_entity_token;
    public final ScheduledReloadData scheduled_buy_data;
    public final InvestmentHoldingState state;
    public final String units;

    /* loaded from: classes.dex */
    public final class DailyGainParams extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DailyGainParams> CREATOR;
        public final Money day_cash_value_change;
        public final String units_at_market_open;
        public final Long valid_until_seconds;

        static {
            SyncInvestmentHolding$DailyGainParams$Companion$ADAPTER$1 syncInvestmentHolding$DailyGainParams$Companion$ADAPTER$1 = new SyncInvestmentHolding$DailyGainParams$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DailyGainParams.class), "type.googleapis.com/squareup.franklin.SyncInvestmentHolding.DailyGainParams", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
            ADAPTER = syncInvestmentHolding$DailyGainParams$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(syncInvestmentHolding$DailyGainParams$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DailyGainParams(Long l, String str, Money money, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.valid_until_seconds = l;
            this.units_at_market_open = str;
            this.day_cash_value_change = money;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DailyGainParams)) {
                return false;
            }
            DailyGainParams dailyGainParams = (DailyGainParams) obj;
            return Intrinsics.areEqual(unknownFields(), dailyGainParams.unknownFields()) && Intrinsics.areEqual(this.valid_until_seconds, dailyGainParams.valid_until_seconds) && Intrinsics.areEqual(this.units_at_market_open, dailyGainParams.units_at_market_open) && Intrinsics.areEqual(this.day_cash_value_change, dailyGainParams.day_cash_value_change);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.valid_until_seconds;
            int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            String str = this.units_at_market_open;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            Money money = this.day_cash_value_change;
            int hashCode4 = hashCode3 + (money != null ? money.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GiftCard.Options.Builder builder = new GiftCard.Options.Builder(1);
            builder.localizable_label = this.valid_until_seconds;
            builder.label = this.units_at_market_open;
            builder.client_scenario = this.day_cash_value_change;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Long l = this.valid_until_seconds;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("valid_until_seconds=", l, arrayList);
            }
            String str = this.units_at_market_open;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "units_at_market_open=", arrayList);
            }
            Money money = this.day_cash_value_change;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("day_cash_value_change=", money, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DailyGainParams{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes.dex */
    public enum InvestmentHoldingState implements WireEnum {
        DO_NOT_USE_INVESTMENT_HOLDING_STATE(0),
        OWNED(1),
        FOLLOWED(2),
        UNFOLLOWED(3);

        public static final SyncInvestmentHolding$InvestmentHoldingState$Companion$ADAPTER$1 ADAPTER;
        public static final ResourceFileSystem.Companion Companion;
        public final int value;

        static {
            InvestmentHoldingState investmentHoldingState = DO_NOT_USE_INVESTMENT_HOLDING_STATE;
            Companion = new ResourceFileSystem.Companion();
            ADAPTER = new SyncInvestmentHolding$InvestmentHoldingState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InvestmentHoldingState.class), Syntax.PROTO_2, investmentHoldingState);
        }

        InvestmentHoldingState(int i) {
            this.value = i;
        }

        public static final InvestmentHoldingState fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return DO_NOT_USE_INVESTMENT_HOLDING_STATE;
            }
            if (i == 1) {
                return OWNED;
            }
            if (i == 2) {
                return FOLLOWED;
            }
            if (i != 3) {
                return null;
            }
            return UNFOLLOWED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SyncInvestmentHolding$Companion$ADAPTER$1 syncInvestmentHolding$Companion$ADAPTER$1 = new SyncInvestmentHolding$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncInvestmentHolding.class), "type.googleapis.com/squareup.franklin.SyncInvestmentHolding", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncInvestmentHolding$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncInvestmentHolding$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncInvestmentHolding(String str, String str2, Money money, InvestmentHoldingState investmentHoldingState, ScheduledReloadData scheduledReloadData, DailyGainParams dailyGainParams, Money money2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.investment_entity_token = str;
        this.units = str2;
        this.active_invested_amount = money;
        this.state = investmentHoldingState;
        this.scheduled_buy_data = scheduledReloadData;
        this.daily_gain_params = dailyGainParams;
        this.average_cost = money2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncInvestmentHolding)) {
            return false;
        }
        SyncInvestmentHolding syncInvestmentHolding = (SyncInvestmentHolding) obj;
        return Intrinsics.areEqual(unknownFields(), syncInvestmentHolding.unknownFields()) && Intrinsics.areEqual(this.investment_entity_token, syncInvestmentHolding.investment_entity_token) && Intrinsics.areEqual(this.units, syncInvestmentHolding.units) && Intrinsics.areEqual(this.active_invested_amount, syncInvestmentHolding.active_invested_amount) && this.state == syncInvestmentHolding.state && Intrinsics.areEqual(this.scheduled_buy_data, syncInvestmentHolding.scheduled_buy_data) && Intrinsics.areEqual(this.daily_gain_params, syncInvestmentHolding.daily_gain_params) && Intrinsics.areEqual(this.average_cost, syncInvestmentHolding.average_cost);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.investment_entity_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.units;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.active_invested_amount;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        InvestmentHoldingState investmentHoldingState = this.state;
        int hashCode5 = (hashCode4 + (investmentHoldingState != null ? investmentHoldingState.hashCode() : 0)) * 37;
        ScheduledReloadData scheduledReloadData = this.scheduled_buy_data;
        int hashCode6 = (hashCode5 + (scheduledReloadData != null ? scheduledReloadData.hashCode() : 0)) * 37;
        DailyGainParams dailyGainParams = this.daily_gain_params;
        int hashCode7 = (hashCode6 + (dailyGainParams != null ? dailyGainParams.hashCode() : 0)) * 37;
        Money money2 = this.average_cost;
        int hashCode8 = hashCode7 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(11, false);
        builder.scope = this.investment_entity_token;
        builder.value = this.units;
        builder.f1407type = this.active_invested_amount;
        builder.first_verified_at_ms = this.state;
        builder.last_verified_at_ms = this.scheduled_buy_data;
        builder.created_at = this.daily_gain_params;
        builder.updated_at = this.average_cost;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.investment_entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "investment_entity_token=", arrayList);
        }
        String str2 = this.units;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "units=", arrayList);
        }
        Money money = this.active_invested_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("active_invested_amount=", money, arrayList);
        }
        InvestmentHoldingState investmentHoldingState = this.state;
        if (investmentHoldingState != null) {
            arrayList.add("state=" + investmentHoldingState);
        }
        ScheduledReloadData scheduledReloadData = this.scheduled_buy_data;
        if (scheduledReloadData != null) {
            arrayList.add("scheduled_buy_data=" + scheduledReloadData);
        }
        DailyGainParams dailyGainParams = this.daily_gain_params;
        if (dailyGainParams != null) {
            arrayList.add("daily_gain_params=" + dailyGainParams);
        }
        Money money2 = this.average_cost;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("average_cost=", money2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncInvestmentHolding{", "}", 0, null, null, 56);
    }
}
