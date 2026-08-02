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
import xyz.block.protos.genie.IdValue;

/* loaded from: classes8.dex */
public final class TimePeriod extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TimePeriod> CREATOR;
    public final String end_local_time;
    public final String start_local_time;

    static {
        TimePeriod$Companion$ADAPTER$1 timePeriod$Companion$ADAPTER$1 = new TimePeriod$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TimePeriod.class), "type.googleapis.com/squareup.roster.business_hours.TimePeriod", Syntax.PROTO_2, null, "squareup/roster/business_hours.proto");
        ADAPTER = timePeriod$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(timePeriod$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePeriod(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.start_local_time = str;
        this.end_local_time = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimePeriod)) {
            return false;
        }
        TimePeriod timePeriod = (TimePeriod) obj;
        return Intrinsics.areEqual(unknownFields(), timePeriod.unknownFields()) && Intrinsics.areEqual(this.start_local_time, timePeriod.start_local_time) && Intrinsics.areEqual(this.end_local_time, timePeriod.end_local_time);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.start_local_time;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.end_local_time;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IdValue.Builder builder = new IdValue.Builder(17);
        builder.server = this.start_local_time;
        builder.local = this.end_local_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.start_local_time;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "start_local_time=", arrayList);
        }
        String str2 = this.end_local_time;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "end_local_time=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TimePeriod{", "}", 0, null, null, 56);
    }
}
