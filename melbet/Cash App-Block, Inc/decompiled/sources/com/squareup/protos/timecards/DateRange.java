package com.squareup.protos.timecards;

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
public final class DateRange extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DateRange> CREATOR;
    public final String start_date;
    public final String stop_date;

    static {
        DateRange$Companion$ADAPTER$1 dateRange$Companion$ADAPTER$1 = new DateRange$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DateRange.class), "type.googleapis.com/squareup.timecards.DateRange", Syntax.PROTO_2, null, "squareup/timecards/service.proto");
        ADAPTER = dateRange$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(dateRange$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRange(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.start_date = str;
        this.stop_date = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DateRange)) {
            return false;
        }
        DateRange dateRange = (DateRange) obj;
        return Intrinsics.areEqual(unknownFields(), dateRange.unknownFields()) && Intrinsics.areEqual(this.start_date, dateRange.start_date) && Intrinsics.areEqual(this.stop_date, dateRange.stop_date);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.start_date;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.stop_date;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IdValue.Builder builder = new IdValue.Builder(19);
        builder.server = this.start_date;
        builder.local = this.stop_date;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.start_date;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "start_date=", arrayList);
        }
        String str2 = this.stop_date;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "stop_date=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DateRange{", "}", 0, null, null, 56);
    }
}
