package com.squareup.protos.roster.business_hours;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import squareup.cash.bills.BillsApplet;

/* loaded from: classes8.dex */
public final class BusinessHoursPeriod extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BusinessHoursPeriod> CREATOR;
    public final DayOfWeek day_of_week;
    public final String end_local_time;
    public final String start_local_time;

    static {
        BusinessHoursPeriod$Companion$ADAPTER$1 businessHoursPeriod$Companion$ADAPTER$1 = new BusinessHoursPeriod$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BusinessHoursPeriod.class), "type.googleapis.com/squareup.roster.business_hours.BusinessHoursPeriod", Syntax.PROTO_2, null, "squareup/roster/business_hours.proto");
        ADAPTER = businessHoursPeriod$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(businessHoursPeriod$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessHoursPeriod(DayOfWeek dayOfWeek, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.day_of_week = dayOfWeek;
        this.start_local_time = str;
        this.end_local_time = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BusinessHoursPeriod)) {
            return false;
        }
        BusinessHoursPeriod businessHoursPeriod = (BusinessHoursPeriod) obj;
        return Intrinsics.areEqual(unknownFields(), businessHoursPeriod.unknownFields()) && this.day_of_week == businessHoursPeriod.day_of_week && Intrinsics.areEqual(this.start_local_time, businessHoursPeriod.start_local_time) && Intrinsics.areEqual(this.end_local_time, businessHoursPeriod.end_local_time);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DayOfWeek dayOfWeek = this.day_of_week;
        int hashCode2 = (hashCode + (dayOfWeek != null ? dayOfWeek.hashCode() : 0)) * 37;
        String str = this.start_local_time;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.end_local_time;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.Builder builder = new BillsApplet.Builder(4);
        builder.action = this.day_of_week;
        builder.full_applet = this.start_local_time;
        builder.half_applet = this.end_local_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DayOfWeek dayOfWeek = this.day_of_week;
        if (dayOfWeek != null) {
            arrayList.add("day_of_week=" + dayOfWeek);
        }
        String str = this.start_local_time;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "start_local_time=", arrayList);
        }
        String str2 = this.end_local_time;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "end_local_time=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BusinessHoursPeriod{", "}", 0, null, null, 56);
    }
}
