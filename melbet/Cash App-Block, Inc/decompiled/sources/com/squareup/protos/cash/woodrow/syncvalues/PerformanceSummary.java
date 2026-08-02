package com.squareup.protos.cash.woodrow.syncvalues;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.time.DateTime;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.time.Instant;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PerformanceSummary extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PerformanceSummary> CREATOR;
    public final Money realized_gain_loss;
    public final Money realized_total_cost;
    public final Money unrealized_quantity;
    public final Money unrealized_total_cost;
    public final Instant version;

    static {
        PerformanceSummary$Companion$ADAPTER$1 performanceSummary$Companion$ADAPTER$1 = new PerformanceSummary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PerformanceSummary.class), "type.googleapis.com/squareup.cash.woodrow.syncvalues.PerformanceSummary", Syntax.PROTO_3, null, "squareup/cash/woodrow/syncvalues/types.proto");
        ADAPTER = performanceSummary$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(performanceSummary$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceSummary(Money money, Money money2, Money money3, Money money4, Instant instant, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.realized_gain_loss = money;
        this.realized_total_cost = money2;
        this.unrealized_quantity = money3;
        this.unrealized_total_cost = money4;
        this.version = instant;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PerformanceSummary)) {
            return false;
        }
        PerformanceSummary performanceSummary = (PerformanceSummary) obj;
        return Intrinsics.areEqual(unknownFields(), performanceSummary.unknownFields()) && Intrinsics.areEqual(this.realized_gain_loss, performanceSummary.realized_gain_loss) && Intrinsics.areEqual(this.realized_total_cost, performanceSummary.realized_total_cost) && Intrinsics.areEqual(this.unrealized_quantity, performanceSummary.unrealized_quantity) && Intrinsics.areEqual(this.unrealized_total_cost, performanceSummary.unrealized_total_cost) && Intrinsics.areEqual(this.version, performanceSummary.version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.realized_gain_loss;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.realized_total_cost;
        int hashCode3 = (hashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.unrealized_quantity;
        int hashCode4 = (hashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.unrealized_total_cost;
        int hashCode5 = (hashCode4 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Instant instant = this.version;
        int hashCode6 = hashCode5 + (instant != null ? instant.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(24, false);
        builder.instant_usec = this.realized_gain_loss;
        builder.ordinal = this.realized_total_cost;
        builder.timezone_offset_min = this.unrealized_quantity;
        builder.posix_tz = this.unrealized_total_cost;
        builder.tz_name = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.realized_gain_loss;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("realized_gain_loss=", money, arrayList);
        }
        Money money2 = this.realized_total_cost;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("realized_total_cost=", money2, arrayList);
        }
        Money money3 = this.unrealized_quantity;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("unrealized_quantity=", money3, arrayList);
        }
        Money money4 = this.unrealized_total_cost;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("unrealized_total_cost=", money4, arrayList);
        }
        Instant instant = this.version;
        if (instant != null) {
            Matcher$$ExternalSyntheticOutline0.m("version=", instant, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PerformanceSummary{", "}", 0, null, null, 56);
    }
}
