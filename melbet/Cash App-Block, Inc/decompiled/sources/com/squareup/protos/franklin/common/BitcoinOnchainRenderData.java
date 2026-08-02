package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.employeejobs.Job;
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

/* loaded from: classes8.dex */
public final class BitcoinOnchainRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BitcoinOnchainRenderData> CREATOR;
    public final Money bitcoin_amount;
    public final Money bitcoin_fee_amount;
    public final String block_explorer_link;
    public final Money fiat_equivalent;
    public final Money fiat_fee_equivalent;
    public final NetworkCongestionLevel network_congestion_level;
    public final Long selected_wait_time;
    public final Long speed_upgradable_until;
    public final List statuses;
    public final String token;
    public final OnchainTransactionType transaction_type;

    static {
        BitcoinOnchainRenderData$Companion$ADAPTER$1 bitcoinOnchainRenderData$Companion$ADAPTER$1 = new BitcoinOnchainRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BitcoinOnchainRenderData.class), "type.googleapis.com/squareup.franklin.BitcoinOnchainRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = bitcoinOnchainRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bitcoinOnchainRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinOnchainRenderData(String str, Money money, Money money2, Money money3, Money money4, Long l, List list, NetworkCongestionLevel networkCongestionLevel, String str2, OnchainTransactionType onchainTransactionType, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.token = str;
        this.bitcoin_amount = money;
        this.fiat_equivalent = money2;
        this.bitcoin_fee_amount = money3;
        this.fiat_fee_equivalent = money4;
        this.selected_wait_time = l;
        this.network_congestion_level = networkCongestionLevel;
        this.block_explorer_link = str2;
        this.transaction_type = onchainTransactionType;
        this.speed_upgradable_until = l2;
        this.statuses = TransactorKt.immutableCopyOf("statuses", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitcoinOnchainRenderData)) {
            return false;
        }
        BitcoinOnchainRenderData bitcoinOnchainRenderData = (BitcoinOnchainRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), bitcoinOnchainRenderData.unknownFields()) && Intrinsics.areEqual(this.token, bitcoinOnchainRenderData.token) && Intrinsics.areEqual(this.bitcoin_amount, bitcoinOnchainRenderData.bitcoin_amount) && Intrinsics.areEqual(this.fiat_equivalent, bitcoinOnchainRenderData.fiat_equivalent) && Intrinsics.areEqual(this.bitcoin_fee_amount, bitcoinOnchainRenderData.bitcoin_fee_amount) && Intrinsics.areEqual(this.fiat_fee_equivalent, bitcoinOnchainRenderData.fiat_fee_equivalent) && Intrinsics.areEqual(this.selected_wait_time, bitcoinOnchainRenderData.selected_wait_time) && Intrinsics.areEqual(this.statuses, bitcoinOnchainRenderData.statuses) && this.network_congestion_level == bitcoinOnchainRenderData.network_congestion_level && Intrinsics.areEqual(this.block_explorer_link, bitcoinOnchainRenderData.block_explorer_link) && this.transaction_type == bitcoinOnchainRenderData.transaction_type && Intrinsics.areEqual(this.speed_upgradable_until, bitcoinOnchainRenderData.speed_upgradable_until);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.bitcoin_amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.fiat_equivalent;
        int hashCode4 = (hashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.bitcoin_fee_amount;
        int hashCode5 = (hashCode4 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.fiat_fee_equivalent;
        int hashCode6 = (hashCode5 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Long l = this.selected_wait_time;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37, 37, this.statuses);
        NetworkCongestionLevel networkCongestionLevel = this.network_congestion_level;
        int hashCode7 = (m + (networkCongestionLevel != null ? networkCongestionLevel.hashCode() : 0)) * 37;
        String str2 = this.block_explorer_link;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        OnchainTransactionType onchainTransactionType = this.transaction_type;
        int hashCode9 = (hashCode8 + (onchainTransactionType != null ? onchainTransactionType.hashCode() : 0)) * 37;
        Long l2 = this.speed_upgradable_until;
        int hashCode10 = hashCode9 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Job.Builder builder = new Job.Builder(14);
        builder.token = this.token;
        builder.title = this.bitcoin_amount;
        builder.default_wage = this.fiat_equivalent;
        builder.deleted_at_timestamp_ms = this.bitcoin_fee_amount;
        builder.team_member_count = this.fiat_fee_equivalent;
        builder.created_at_timestamp_ms = this.selected_wait_time;
        builder.version = this.statuses;
        builder.tip_eligible = this.network_congestion_level;
        builder.merchant_token = this.block_explorer_link;
        builder.default_color_scheme = this.transaction_type;
        builder.updated_at_timestamp_ms = this.speed_upgradable_until;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        Money money = this.bitcoin_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("bitcoin_amount=", money, arrayList);
        }
        Money money2 = this.fiat_equivalent;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("fiat_equivalent=", money2, arrayList);
        }
        Money money3 = this.bitcoin_fee_amount;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("bitcoin_fee_amount=", money3, arrayList);
        }
        Money money4 = this.fiat_fee_equivalent;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("fiat_fee_equivalent=", money4, arrayList);
        }
        Long l = this.selected_wait_time;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("selected_wait_time=", l, arrayList);
        }
        List list = this.statuses;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("statuses=", arrayList, list);
        }
        NetworkCongestionLevel networkCongestionLevel = this.network_congestion_level;
        if (networkCongestionLevel != null) {
            arrayList.add("network_congestion_level=" + networkCongestionLevel);
        }
        String str2 = this.block_explorer_link;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "block_explorer_link=", arrayList);
        }
        OnchainTransactionType onchainTransactionType = this.transaction_type;
        if (onchainTransactionType != null) {
            arrayList.add("transaction_type=" + onchainTransactionType);
        }
        Long l2 = this.speed_upgradable_until;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("speed_upgradable_until=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BitcoinOnchainRenderData{", "}", 0, null, null, 56);
    }
}
