package com.squareup.protos.timecards.scheduling;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.PoolsConfig;
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
public final class ZonedDateRange extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ZonedDateRange> CREATOR;
    public final String start_time;
    public final String stop_time;
    public final String timezone;

    static {
        ZonedDateRange$Companion$ADAPTER$1 zonedDateRange$Companion$ADAPTER$1 = new ZonedDateRange$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ZonedDateRange.class), "type.googleapis.com/squareup.timecards.scheduling.ZonedDateRange", Syntax.PROTO_2, null, "squareup/timecards/scheduling/models.proto");
        ADAPTER = zonedDateRange$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(zonedDateRange$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZonedDateRange(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.timezone = str;
        this.start_time = str2;
        this.stop_time = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZonedDateRange)) {
            return false;
        }
        ZonedDateRange zonedDateRange = (ZonedDateRange) obj;
        return Intrinsics.areEqual(unknownFields(), zonedDateRange.unknownFields()) && Intrinsics.areEqual(this.timezone, zonedDateRange.timezone) && Intrinsics.areEqual(this.start_time, zonedDateRange.start_time) && Intrinsics.areEqual(this.stop_time, zonedDateRange.stop_time);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.timezone;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.start_time;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.stop_time;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolsConfig.Builder builder = new PoolsConfig.Builder(12);
        builder.nux_details_img_url = this.timezone;
        builder.nux_activity_img_url = this.start_time;
        builder.share_background_img_url = this.stop_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.timezone;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "timezone=", arrayList);
        }
        String str2 = this.start_time;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "start_time=", arrayList);
        }
        String str3 = this.stop_time;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "stop_time=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ZonedDateRange{", "}", 0, null, null, 56);
    }
}
