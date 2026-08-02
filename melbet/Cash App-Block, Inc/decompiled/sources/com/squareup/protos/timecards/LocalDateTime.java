package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.protos.common.time.LocalTime;
import com.squareup.protos.common.time.YearMonthDay;
import com.squareup.protos.rewardly.ui.AppLinks;
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

/* loaded from: classes8.dex */
public final class LocalDateTime extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalDateTime> CREATOR;
    public final YearMonthDay local_date;
    public final LocalTime local_time;

    static {
        LocalDateTime$Companion$ADAPTER$1 localDateTime$Companion$ADAPTER$1 = new LocalDateTime$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalDateTime.class), "type.googleapis.com/squareup.timecards.LocalDateTime", Syntax.PROTO_2, null, "squareup/timecards/time.proto");
        ADAPTER = localDateTime$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localDateTime$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalDateTime(YearMonthDay yearMonthDay, LocalTime localTime, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.local_date = yearMonthDay;
        this.local_time = localTime;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return Intrinsics.areEqual(unknownFields(), localDateTime.unknownFields()) && Intrinsics.areEqual(this.local_date, localDateTime.local_date) && Intrinsics.areEqual(this.local_time, localDateTime.local_time);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        YearMonthDay yearMonthDay = this.local_date;
        int hashCode2 = (hashCode + (yearMonthDay != null ? yearMonthDay.hashCode() : 0)) * 37;
        LocalTime localTime = this.local_time;
        int hashCode3 = hashCode2 + (localTime != null ? localTime.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(26);
        builder.f1411android = this.local_date;
        builder.ios = this.local_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        YearMonthDay yearMonthDay = this.local_date;
        if (yearMonthDay != null) {
            arrayList.add("local_date=" + yearMonthDay);
        }
        LocalTime localTime = this.local_time;
        if (localTime != null) {
            arrayList.add("local_time=" + localTime);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalDateTime{", "}", 0, null, null, 56);
    }
}
