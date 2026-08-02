package com.squareup.protos.timecards.scheduling;

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
public final class LocalDateRange extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalDateRange> CREATOR;
    public final String start_datetime;
    public final String stop_datetime;

    static {
        LocalDateRange$Companion$ADAPTER$1 localDateRange$Companion$ADAPTER$1 = new LocalDateRange$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalDateRange.class), "type.googleapis.com/squareup.timecards.scheduling.LocalDateRange", Syntax.PROTO_2, null, "squareup/timecards/scheduling/models.proto");
        ADAPTER = localDateRange$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localDateRange$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalDateRange(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.start_datetime = str;
        this.stop_datetime = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalDateRange)) {
            return false;
        }
        LocalDateRange localDateRange = (LocalDateRange) obj;
        return Intrinsics.areEqual(unknownFields(), localDateRange.unknownFields()) && Intrinsics.areEqual(this.start_datetime, localDateRange.start_datetime) && Intrinsics.areEqual(this.stop_datetime, localDateRange.stop_datetime);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.start_datetime;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.stop_datetime;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IdValue.Builder builder = new IdValue.Builder(22);
        builder.server = this.start_datetime;
        builder.local = this.stop_datetime;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.start_datetime;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "start_datetime=", arrayList);
        }
        String str2 = this.stop_datetime;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "stop_datetime=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalDateRange{", "}", 0, null, null, 56);
    }
}
