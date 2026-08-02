package com.squareup.protos.timecards;

import android.os.Parcelable;
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
public final class LocalDateTimeRange extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalDateTimeRange> CREATOR;
    public final LocalDateTime start;
    public final LocalDateTime stop;

    static {
        LocalDateTimeRange$Companion$ADAPTER$1 localDateTimeRange$Companion$ADAPTER$1 = new LocalDateTimeRange$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalDateTimeRange.class), "type.googleapis.com/squareup.timecards.LocalDateTimeRange", Syntax.PROTO_2, null, "squareup/timecards/time.proto");
        ADAPTER = localDateTimeRange$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localDateTimeRange$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalDateTimeRange(LocalDateTime localDateTime, LocalDateTime localDateTime2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.start = localDateTime;
        this.stop = localDateTime2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalDateTimeRange)) {
            return false;
        }
        LocalDateTimeRange localDateTimeRange = (LocalDateTimeRange) obj;
        return Intrinsics.areEqual(unknownFields(), localDateTimeRange.unknownFields()) && Intrinsics.areEqual(this.start, localDateTimeRange.start) && Intrinsics.areEqual(this.stop, localDateTimeRange.stop);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalDateTime localDateTime = this.start;
        int hashCode2 = (hashCode + (localDateTime != null ? localDateTime.hashCode() : 0)) * 37;
        LocalDateTime localDateTime2 = this.stop;
        int hashCode3 = hashCode2 + (localDateTime2 != null ? localDateTime2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(27);
        builder.f1411android = this.start;
        builder.ios = this.stop;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalDateTime localDateTime = this.start;
        if (localDateTime != null) {
            arrayList.add("start=" + localDateTime);
        }
        LocalDateTime localDateTime2 = this.stop;
        if (localDateTime2 != null) {
            arrayList.add("stop=" + localDateTime2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalDateTimeRange{", "}", 0, null, null, 56);
    }
}
