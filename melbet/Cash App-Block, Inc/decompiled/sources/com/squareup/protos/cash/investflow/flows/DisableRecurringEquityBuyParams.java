package com.squareup.protos.cash.investflow.flows;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.Group;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
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
public final class DisableRecurringEquityBuyParams extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DisableRecurringEquityBuyParams> CREATOR;
    public final Money amount;
    public final String investment_entity_token;
    public final RecurringSchedule recurring_schedule;

    static {
        DisableRecurringEquityBuyParams$Companion$ADAPTER$1 disableRecurringEquityBuyParams$Companion$ADAPTER$1 = new DisableRecurringEquityBuyParams$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DisableRecurringEquityBuyParams.class), "type.googleapis.com/squareup.cash.investflow.flows.DisableRecurringEquityBuyParams", Syntax.PROTO_2, null, "squareup/cash/investflow/flows/flows.proto");
        ADAPTER = disableRecurringEquityBuyParams$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(disableRecurringEquityBuyParams$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisableRecurringEquityBuyParams(String str, Money money, RecurringSchedule recurringSchedule, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.investment_entity_token = str;
        this.amount = money;
        this.recurring_schedule = recurringSchedule;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DisableRecurringEquityBuyParams)) {
            return false;
        }
        DisableRecurringEquityBuyParams disableRecurringEquityBuyParams = (DisableRecurringEquityBuyParams) obj;
        return Intrinsics.areEqual(unknownFields(), disableRecurringEquityBuyParams.unknownFields()) && Intrinsics.areEqual(this.investment_entity_token, disableRecurringEquityBuyParams.investment_entity_token) && Intrinsics.areEqual(this.amount, disableRecurringEquityBuyParams.amount) && Intrinsics.areEqual(this.recurring_schedule, disableRecurringEquityBuyParams.recurring_schedule);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.investment_entity_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        RecurringSchedule recurringSchedule = this.recurring_schedule;
        int hashCode4 = hashCode3 + (recurringSchedule != null ? recurringSchedule.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(7);
        builder.name = this.investment_entity_token;
        builder.group_image = this.amount;
        builder.participants = this.recurring_schedule;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.investment_entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "investment_entity_token=", arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        RecurringSchedule recurringSchedule = this.recurring_schedule;
        if (recurringSchedule != null) {
            arrayList.add("recurring_schedule=" + recurringSchedule);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisableRecurringEquityBuyParams{", "}", 0, null, null, 56);
    }
}
