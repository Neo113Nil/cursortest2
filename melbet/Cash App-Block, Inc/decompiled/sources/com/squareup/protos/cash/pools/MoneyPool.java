package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.timecards.Timecard;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MoneyPool extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MoneyPool> CREATOR;
    public final Money balance;
    public final Long closed_at;
    public final Long contributions_count;
    public final Long created_at;
    public final Long goal_reached_at;
    public final PoolGoalState goal_state;
    public final Long latest_contribution_at;
    public final String name;
    public final PoolOwner owner;
    public final List participants;
    public final Integer participants_count;
    public final String pool_token;
    public final PoolVisibility pool_visibility;
    public final String share_link;
    public final PoolState status;
    public final PoolSurcharge surcharge;
    public final Money target;

    static {
        MoneyPool$Companion$ADAPTER$1 moneyPool$Companion$ADAPTER$1 = new MoneyPool$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MoneyPool.class), "type.googleapis.com/squareup.cash.pools.v1beta.MoneyPool", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = moneyPool$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(moneyPool$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyPool(String str, String str2, Money money, PoolOwner poolOwner, List list, Money money2, PoolState poolState, Long l, Long l2, Long l3, Long l4, PoolVisibility poolVisibility, String str3, PoolGoalState poolGoalState, Long l5, Integer num, PoolSurcharge poolSurcharge, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.pool_token = str;
        this.name = str2;
        this.target = money;
        this.owner = poolOwner;
        this.balance = money2;
        this.status = poolState;
        this.created_at = l;
        this.closed_at = l2;
        this.contributions_count = l3;
        this.latest_contribution_at = l4;
        this.pool_visibility = poolVisibility;
        this.share_link = str3;
        this.goal_state = poolGoalState;
        this.goal_reached_at = l5;
        this.participants_count = num;
        this.surcharge = poolSurcharge;
        this.participants = TransactorKt.immutableCopyOf("participants", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MoneyPool)) {
            return false;
        }
        MoneyPool moneyPool = (MoneyPool) obj;
        return Intrinsics.areEqual(unknownFields(), moneyPool.unknownFields()) && Intrinsics.areEqual(this.pool_token, moneyPool.pool_token) && Intrinsics.areEqual(this.name, moneyPool.name) && Intrinsics.areEqual(this.target, moneyPool.target) && Intrinsics.areEqual(this.owner, moneyPool.owner) && Intrinsics.areEqual(this.participants, moneyPool.participants) && Intrinsics.areEqual(this.balance, moneyPool.balance) && this.status == moneyPool.status && Intrinsics.areEqual(this.created_at, moneyPool.created_at) && Intrinsics.areEqual(this.closed_at, moneyPool.closed_at) && Intrinsics.areEqual(this.contributions_count, moneyPool.contributions_count) && Intrinsics.areEqual(this.latest_contribution_at, moneyPool.latest_contribution_at) && this.pool_visibility == moneyPool.pool_visibility && Intrinsics.areEqual(this.share_link, moneyPool.share_link) && this.goal_state == moneyPool.goal_state && Intrinsics.areEqual(this.goal_reached_at, moneyPool.goal_reached_at) && Intrinsics.areEqual(this.participants_count, moneyPool.participants_count) && Intrinsics.areEqual(this.surcharge, moneyPool.surcharge);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.pool_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.target;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        PoolOwner poolOwner = this.owner;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (poolOwner != null ? poolOwner.hashCode() : 0)) * 37, 37, this.participants);
        Money money2 = this.balance;
        int hashCode5 = (m + (money2 != null ? money2.hashCode() : 0)) * 37;
        PoolState poolState = this.status;
        int hashCode6 = (hashCode5 + (poolState != null ? poolState.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode7 = (hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.closed_at;
        int hashCode8 = (hashCode7 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.contributions_count;
        int hashCode9 = (hashCode8 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.latest_contribution_at;
        int hashCode10 = (hashCode9 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        PoolVisibility poolVisibility = this.pool_visibility;
        int hashCode11 = (hashCode10 + (poolVisibility != null ? poolVisibility.hashCode() : 0)) * 37;
        String str3 = this.share_link;
        int hashCode12 = (hashCode11 + (str3 != null ? str3.hashCode() : 0)) * 37;
        PoolGoalState poolGoalState = this.goal_state;
        int hashCode13 = (hashCode12 + (poolGoalState != null ? poolGoalState.hashCode() : 0)) * 37;
        Long l5 = this.goal_reached_at;
        int hashCode14 = (hashCode13 + (l5 != null ? Long.hashCode(l5.longValue()) : 0)) * 37;
        Integer num = this.participants_count;
        int hashCode15 = (hashCode14 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        PoolSurcharge poolSurcharge = this.surcharge;
        int hashCode16 = hashCode15 + (poolSurcharge != null ? poolSurcharge.hashCode() : 0);
        this.hashCode = hashCode16;
        return hashCode16;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Timecard.Builder builder = new Timecard.Builder(6);
        builder.token = this.pool_token;
        builder.shift_id = this.name;
        builder.hourly_wage = this.target;
        builder.employee_token = this.owner;
        builder.clockin_unit_token = this.participants;
        builder.declared_tip = this.balance;
        builder.clockout_unit_token = this.status;
        builder.clockin_timestamp_ms = this.created_at;
        builder.clockout_timestamp_ms = this.closed_at;
        builder.created_at_timestamp_ms = this.contributions_count;
        builder.updated_at_timestamp_ms = this.latest_contribution_at;
        builder.note = this.pool_visibility;
        builder.merchant_token = this.share_link;
        builder.employee = this.goal_state;
        builder.deleted = this.goal_reached_at;
        builder.was_automatically_clocked_out = this.participants_count;
        builder.employee_job_info = this.surcharge;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.pool_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "pool_token=", arrayList);
        }
        if (this.name != null) {
            arrayList.add("name=██");
        }
        Money money = this.target;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("target=", money, arrayList);
        }
        PoolOwner poolOwner = this.owner;
        if (poolOwner != null) {
            arrayList.add("owner=" + poolOwner);
        }
        List list = this.participants;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("participants=", arrayList, list);
        }
        if (this.balance != null) {
            arrayList.add("balance=██");
        }
        PoolState poolState = this.status;
        if (poolState != null) {
            arrayList.add("status=" + poolState);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        Long l2 = this.closed_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("closed_at=", l2, arrayList);
        }
        Long l3 = this.contributions_count;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("contributions_count=", l3, arrayList);
        }
        Long l4 = this.latest_contribution_at;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("latest_contribution_at=", l4, arrayList);
        }
        PoolVisibility poolVisibility = this.pool_visibility;
        if (poolVisibility != null) {
            arrayList.add("pool_visibility=" + poolVisibility);
        }
        String str2 = this.share_link;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "share_link=", arrayList);
        }
        PoolGoalState poolGoalState = this.goal_state;
        if (poolGoalState != null) {
            arrayList.add("goal_state=" + poolGoalState);
        }
        Long l5 = this.goal_reached_at;
        if (l5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("goal_reached_at=", l5, arrayList);
        }
        Integer num = this.participants_count;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("participants_count=", num, arrayList);
        }
        PoolSurcharge poolSurcharge = this.surcharge;
        if (poolSurcharge != null) {
            arrayList.add("surcharge=" + poolSurcharge);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MoneyPool{", "}", 0, null, null, 56);
    }
}
