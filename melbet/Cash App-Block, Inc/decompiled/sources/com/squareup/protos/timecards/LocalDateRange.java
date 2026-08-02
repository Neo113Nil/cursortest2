package com.squareup.protos.timecards;

import android.os.Parcelable;
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
public final class LocalDateRange extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalDateRange> CREATOR;
    public final YearMonthDay start;
    public final YearMonthDay stop;

    static {
        LocalDateRange$Companion$ADAPTER$1 localDateRange$Companion$ADAPTER$1 = new LocalDateRange$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalDateRange.class), "type.googleapis.com/squareup.timecards.LocalDateRange", Syntax.PROTO_2, null, "squareup/timecards/time.proto");
        ADAPTER = localDateRange$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localDateRange$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalDateRange(YearMonthDay yearMonthDay, YearMonthDay yearMonthDay2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.start = yearMonthDay;
        this.stop = yearMonthDay2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalDateRange)) {
            return false;
        }
        LocalDateRange localDateRange = (LocalDateRange) obj;
        return Intrinsics.areEqual(unknownFields(), localDateRange.unknownFields()) && Intrinsics.areEqual(this.start, localDateRange.start) && Intrinsics.areEqual(this.stop, localDateRange.stop);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        YearMonthDay yearMonthDay = this.start;
        int hashCode2 = (hashCode + (yearMonthDay != null ? yearMonthDay.hashCode() : 0)) * 37;
        YearMonthDay yearMonthDay2 = this.stop;
        int hashCode3 = hashCode2 + (yearMonthDay2 != null ? yearMonthDay2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(25);
        builder.f1411android = this.start;
        builder.ios = this.stop;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        YearMonthDay yearMonthDay = this.start;
        if (yearMonthDay != null) {
            arrayList.add("start=" + yearMonthDay);
        }
        YearMonthDay yearMonthDay2 = this.stop;
        if (yearMonthDay2 != null) {
            arrayList.add("stop=" + yearMonthDay2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalDateRange{", "}", 0, null, null, 56);
    }
}
