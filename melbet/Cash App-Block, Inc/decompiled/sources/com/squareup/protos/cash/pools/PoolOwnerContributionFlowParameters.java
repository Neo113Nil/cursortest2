package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentType;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.BalanceSnapshot;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PoolOwnerContributionFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PoolOwnerContributionFlowParameters> CREATOR;
    public final Money amount;
    public final String external_id;
    public final String instrument_token;
    public final InstrumentType instrument_type;
    public final BalanceSnapshot main_cash_balance_snapshot;
    public final String pool_contributor_comment;
    public final String pool_token;

    static {
        PoolOwnerContributionFlowParameters$Companion$ADAPTER$1 poolOwnerContributionFlowParameters$Companion$ADAPTER$1 = new PoolOwnerContributionFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PoolOwnerContributionFlowParameters.class), "type.googleapis.com/squareup.cash.pools.v1beta.PoolOwnerContributionFlowParameters", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/money_pool_owner_contribution.proto");
        ADAPTER = poolOwnerContributionFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(poolOwnerContributionFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolOwnerContributionFlowParameters(String str, Money money, String str2, BalanceSnapshot balanceSnapshot, InstrumentType instrumentType, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.pool_token = str;
        this.amount = money;
        this.external_id = str2;
        this.main_cash_balance_snapshot = balanceSnapshot;
        this.instrument_type = instrumentType;
        this.instrument_token = str3;
        this.pool_contributor_comment = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PoolOwnerContributionFlowParameters)) {
            return false;
        }
        PoolOwnerContributionFlowParameters poolOwnerContributionFlowParameters = (PoolOwnerContributionFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), poolOwnerContributionFlowParameters.unknownFields()) && Intrinsics.areEqual(this.pool_token, poolOwnerContributionFlowParameters.pool_token) && Intrinsics.areEqual(this.amount, poolOwnerContributionFlowParameters.amount) && Intrinsics.areEqual(this.external_id, poolOwnerContributionFlowParameters.external_id) && Intrinsics.areEqual(this.main_cash_balance_snapshot, poolOwnerContributionFlowParameters.main_cash_balance_snapshot) && this.instrument_type == poolOwnerContributionFlowParameters.instrument_type && Intrinsics.areEqual(this.instrument_token, poolOwnerContributionFlowParameters.instrument_token) && Intrinsics.areEqual(this.pool_contributor_comment, poolOwnerContributionFlowParameters.pool_contributor_comment);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.pool_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        String str2 = this.external_id;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        BalanceSnapshot balanceSnapshot = this.main_cash_balance_snapshot;
        int hashCode5 = (hashCode4 + (balanceSnapshot != null ? balanceSnapshot.hashCode() : 0)) * 37;
        InstrumentType instrumentType = this.instrument_type;
        int hashCode6 = (hashCode5 + (instrumentType != null ? instrumentType.hashCode() : 0)) * 37;
        String str3 = this.instrument_token;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.pool_contributor_comment;
        int hashCode8 = hashCode7 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(14);
        builder.customer_identifier = this.pool_token;
        builder.aggregated_contribution_amount = this.amount;
        builder.full_name = this.external_id;
        builder.added_at = this.main_cash_balance_snapshot;
        builder.participant_type = this.instrument_type;
        builder.profile_photo_url = this.instrument_token;
        builder.cashtag = this.pool_contributor_comment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.pool_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "pool_token=", arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        String str2 = this.external_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "external_id=", arrayList);
        }
        BalanceSnapshot balanceSnapshot = this.main_cash_balance_snapshot;
        if (balanceSnapshot != null) {
            arrayList.add("main_cash_balance_snapshot=" + balanceSnapshot);
        }
        InstrumentType instrumentType = this.instrument_type;
        if (instrumentType != null) {
            arrayList.add("instrument_type=" + instrumentType);
        }
        String str3 = this.instrument_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "instrument_token=", arrayList);
        }
        if (this.pool_contributor_comment != null) {
            arrayList.add("pool_contributor_comment=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PoolOwnerContributionFlowParameters{", "}", 0, null, null, 56);
    }
}
