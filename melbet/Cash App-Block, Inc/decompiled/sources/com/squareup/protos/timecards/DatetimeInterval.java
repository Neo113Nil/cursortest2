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
public final class DatetimeInterval extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DatetimeInterval> CREATOR;
    public final String end;
    public final String start;

    static {
        DatetimeInterval$Companion$ADAPTER$1 datetimeInterval$Companion$ADAPTER$1 = new DatetimeInterval$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DatetimeInterval.class), "type.googleapis.com/squareup.timecards.DatetimeInterval", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
        ADAPTER = datetimeInterval$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(datetimeInterval$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatetimeInterval(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.start = str;
        this.end = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DatetimeInterval)) {
            return false;
        }
        DatetimeInterval datetimeInterval = (DatetimeInterval) obj;
        return Intrinsics.areEqual(unknownFields(), datetimeInterval.unknownFields()) && Intrinsics.areEqual(this.start, datetimeInterval.start) && Intrinsics.areEqual(this.end, datetimeInterval.end);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.start;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.end;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IdValue.Builder builder = new IdValue.Builder(20);
        builder.server = this.start;
        builder.local = this.end;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.start;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "start=", arrayList);
        }
        String str2 = this.end;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "end=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DatetimeInterval{", "}", 0, null, null, 56);
    }
}
