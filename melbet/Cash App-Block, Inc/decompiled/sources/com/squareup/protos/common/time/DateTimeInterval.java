package com.squareup.protos.common.time;

import android.os.Parcelable;
import com.squareup.protos.cash.ui.SplitButtons;
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
public final class DateTimeInterval extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DateTimeInterval> CREATOR;
    public final DateTime exclusive_end;
    public final DateTime inclusive_start;

    static {
        DateTimeInterval$Companion$ADAPTER$1 dateTimeInterval$Companion$ADAPTER$1 = new DateTimeInterval$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DateTimeInterval.class), "type.googleapis.com/squareup.common.time.DateTimeInterval", Syntax.PROTO_2, null, "squareup/common/time.proto");
        ADAPTER = dateTimeInterval$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(dateTimeInterval$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateTimeInterval(DateTime dateTime, DateTime dateTime2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.inclusive_start = dateTime;
        this.exclusive_end = dateTime2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DateTimeInterval)) {
            return false;
        }
        DateTimeInterval dateTimeInterval = (DateTimeInterval) obj;
        return Intrinsics.areEqual(unknownFields(), dateTimeInterval.unknownFields()) && Intrinsics.areEqual(this.inclusive_start, dateTimeInterval.inclusive_start) && Intrinsics.areEqual(this.exclusive_end, dateTimeInterval.exclusive_end);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DateTime dateTime = this.inclusive_start;
        int hashCode2 = (hashCode + (dateTime != null ? dateTime.hashCode() : 0)) * 37;
        DateTime dateTime2 = this.exclusive_end;
        int hashCode3 = hashCode2 + (dateTime2 != null ? dateTime2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(27);
        builder.primary_button = this.inclusive_start;
        builder.secondary_button = this.exclusive_end;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DateTime dateTime = this.inclusive_start;
        if (dateTime != null) {
            arrayList.add("inclusive_start=" + dateTime);
        }
        DateTime dateTime2 = this.exclusive_end;
        if (dateTime2 != null) {
            arrayList.add("exclusive_end=" + dateTime2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DateTimeInterval{", "}", 0, null, null, 56);
    }
}
