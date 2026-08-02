package com.squareup.protos.cash.portfolios;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.protos.cash.portfolios.model.UnitType;
import com.squareup.protos.common.Money;
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
public final class HoldingBalanceTick extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<HoldingBalanceTick> CREATOR;
    public final Money cumulative_realized_gain_amount;
    public final Money market_value;
    public final Money price;
    public final Long time_sec;
    public final Money total_gain_amount;
    public final Long total_gain_bps;
    public final UnitType unit_type;
    public final Long units;
    public final Money unrealized_gain_amount;
    public final Long unrealized_gain_bps;

    static {
        HoldingBalanceTick$Companion$ADAPTER$1 holdingBalanceTick$Companion$ADAPTER$1 = new HoldingBalanceTick$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HoldingBalanceTick.class), "type.googleapis.com/squareup.cash.portfolios.HoldingBalanceTick", Syntax.PROTO_2, null, "squareup/cash/portfolios/service.proto");
        ADAPTER = holdingBalanceTick$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(holdingBalanceTick$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoldingBalanceTick(Long l, Money money, Long l2, UnitType unitType, Money money2, Money money3, Long l3, Money money4, Money money5, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.time_sec = l;
        this.market_value = money;
        this.units = l2;
        this.unit_type = unitType;
        this.price = money2;
        this.unrealized_gain_amount = money3;
        this.unrealized_gain_bps = l3;
        this.cumulative_realized_gain_amount = money4;
        this.total_gain_amount = money5;
        this.total_gain_bps = l4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HoldingBalanceTick)) {
            return false;
        }
        HoldingBalanceTick holdingBalanceTick = (HoldingBalanceTick) obj;
        return Intrinsics.areEqual(unknownFields(), holdingBalanceTick.unknownFields()) && Intrinsics.areEqual(this.time_sec, holdingBalanceTick.time_sec) && Intrinsics.areEqual(this.market_value, holdingBalanceTick.market_value) && Intrinsics.areEqual(this.units, holdingBalanceTick.units) && this.unit_type == holdingBalanceTick.unit_type && Intrinsics.areEqual(this.price, holdingBalanceTick.price) && Intrinsics.areEqual(this.unrealized_gain_amount, holdingBalanceTick.unrealized_gain_amount) && Intrinsics.areEqual(this.unrealized_gain_bps, holdingBalanceTick.unrealized_gain_bps) && Intrinsics.areEqual(this.cumulative_realized_gain_amount, holdingBalanceTick.cumulative_realized_gain_amount) && Intrinsics.areEqual(this.total_gain_amount, holdingBalanceTick.total_gain_amount) && Intrinsics.areEqual(this.total_gain_bps, holdingBalanceTick.total_gain_bps);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.time_sec;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Money money = this.market_value;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Long l2 = this.units;
        int hashCode4 = (hashCode3 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        UnitType unitType = this.unit_type;
        int hashCode5 = (hashCode4 + (unitType != null ? unitType.hashCode() : 0)) * 37;
        Money money2 = this.price;
        int hashCode6 = (hashCode5 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.unrealized_gain_amount;
        int hashCode7 = (hashCode6 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Long l3 = this.unrealized_gain_bps;
        int hashCode8 = (hashCode7 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Money money4 = this.cumulative_realized_gain_amount;
        int hashCode9 = (hashCode8 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.total_gain_amount;
        int hashCode10 = (hashCode9 + (money5 != null ? money5.hashCode() : 0)) * 37;
        Long l4 = this.total_gain_bps;
        int hashCode11 = hashCode10 + (l4 != null ? Long.hashCode(l4.longValue()) : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashInRequest.Builder builder = new CashInRequest.Builder(17);
        builder.request_context = this.time_sec;
        builder.amount = this.market_value;
        builder.external_id = this.units;
        builder.passcode_token = this.unit_type;
        builder.external_client_transfer_token = this.price;
        builder.source = this.unrealized_gain_amount;
        builder.target = this.unrealized_gain_bps;
        builder.call_context = this.cumulative_realized_gain_amount;
        builder.forwarded_call_context = this.total_gain_amount;
        builder.client_verified_digital_wallet = this.total_gain_bps;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.time_sec;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("time_sec=", l, arrayList);
        }
        if (this.market_value != null) {
            arrayList.add("market_value=██");
        }
        Long l2 = this.units;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("units=", l2, arrayList);
        }
        UnitType unitType = this.unit_type;
        if (unitType != null) {
            arrayList.add("unit_type=" + unitType);
        }
        Money money = this.price;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("price=", money, arrayList);
        }
        if (this.unrealized_gain_amount != null) {
            arrayList.add("unrealized_gain_amount=██");
        }
        Long l3 = this.unrealized_gain_bps;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("unrealized_gain_bps=", l3, arrayList);
        }
        if (this.cumulative_realized_gain_amount != null) {
            arrayList.add("cumulative_realized_gain_amount=██");
        }
        if (this.total_gain_amount != null) {
            arrayList.add("total_gain_amount=██");
        }
        Long l4 = this.total_gain_bps;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("total_gain_bps=", l4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HoldingBalanceTick{", "}", 0, null, null, 56);
    }
}
