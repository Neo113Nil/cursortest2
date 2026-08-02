package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
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
public final class SchedulingTime extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SchedulingTime> CREATOR;
    public final LocalFulfillment fulfillment;
    public final String scheduling_day_time_token;
    public final String time_label;

    static {
        SchedulingTime$Companion$ADAPTER$1 schedulingTime$Companion$ADAPTER$1 = new SchedulingTime$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SchedulingTime.class), "type.googleapis.com/squareup.cash.local.client.v1.SchedulingTime", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_fulfillment.proto");
        ADAPTER = schedulingTime$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(schedulingTime$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SchedulingTime(String str, String str2, LocalFulfillment localFulfillment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.scheduling_day_time_token = str;
        this.time_label = str2;
        this.fulfillment = localFulfillment;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulingTime)) {
            return false;
        }
        SchedulingTime schedulingTime = (SchedulingTime) obj;
        return Intrinsics.areEqual(unknownFields(), schedulingTime.unknownFields()) && Intrinsics.areEqual(this.scheduling_day_time_token, schedulingTime.scheduling_day_time_token) && Intrinsics.areEqual(this.time_label, schedulingTime.time_label) && Intrinsics.areEqual(this.fulfillment, schedulingTime.fulfillment);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.scheduling_day_time_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.time_label;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalFulfillment localFulfillment = this.fulfillment;
        int hashCode4 = hashCode3 + (localFulfillment != null ? localFulfillment.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(6, false);
        builder.advertisement_data = this.scheduling_day_time_token;
        builder.transmission_level = this.time_label;
        builder.frequency = this.fulfillment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.scheduling_day_time_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "scheduling_day_time_token=", arrayList);
        }
        String str2 = this.time_label;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "time_label=", arrayList);
        }
        LocalFulfillment localFulfillment = this.fulfillment;
        if (localFulfillment != null) {
            arrayList.add("fulfillment=" + localFulfillment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SchedulingTime{", "}", 0, null, null, 56);
    }
}
