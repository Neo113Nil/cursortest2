package com.squareup.protos.cash.cryptoinvestflow.service;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Action;
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
public final class DisableRecurringCryptoBuyInitiationData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DisableRecurringCryptoBuyInitiationData> CREATOR;
    public final Money amount;
    public final RecurringSchedule recurring_schedule;

    static {
        DisableRecurringCryptoBuyInitiationData$Companion$ADAPTER$1 disableRecurringCryptoBuyInitiationData$Companion$ADAPTER$1 = new DisableRecurringCryptoBuyInitiationData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DisableRecurringCryptoBuyInitiationData.class), "type.googleapis.com/squareup.cash.cryptoinvestflow.service.DisableRecurringCryptoBuyInitiationData", Syntax.PROTO_2, null, "squareup/cash/cryptoinvestflow/service/flow.proto");
        ADAPTER = disableRecurringCryptoBuyInitiationData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(disableRecurringCryptoBuyInitiationData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisableRecurringCryptoBuyInitiationData(Money money, RecurringSchedule recurringSchedule, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount = money;
        this.recurring_schedule = recurringSchedule;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DisableRecurringCryptoBuyInitiationData)) {
            return false;
        }
        DisableRecurringCryptoBuyInitiationData disableRecurringCryptoBuyInitiationData = (DisableRecurringCryptoBuyInitiationData) obj;
        return Intrinsics.areEqual(unknownFields(), disableRecurringCryptoBuyInitiationData.unknownFields()) && Intrinsics.areEqual(this.amount, disableRecurringCryptoBuyInitiationData.amount) && Intrinsics.areEqual(this.recurring_schedule, disableRecurringCryptoBuyInitiationData.recurring_schedule);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.amount;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        RecurringSchedule recurringSchedule = this.recurring_schedule;
        int hashCode3 = hashCode2 + (recurringSchedule != null ? recurringSchedule.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(2);
        builder.f1268type = this.amount;
        builder.details = this.recurring_schedule;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        RecurringSchedule recurringSchedule = this.recurring_schedule;
        if (recurringSchedule != null) {
            arrayList.add("recurring_schedule=" + recurringSchedule);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisableRecurringCryptoBuyInitiationData{", "}", 0, null, null, 56);
    }
}
