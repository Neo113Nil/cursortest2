package com.squareup.protos.common.time;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
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
public final class LocalTime extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalTime> CREATOR;
    public final Integer hour_of_day;
    public final Integer millis_of_second;
    public final Integer minute_of_hour;
    public final Integer second_of_minute;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Integer hour_of_day;
        public Integer millis_of_second;
        public Integer minute_of_hour;
        public Integer second_of_minute;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new LocalTime(this.hour_of_day, this.minute_of_hour, this.second_of_minute, this.millis_of_second, buildUnknownFields());
                default:
                    return new NotificationCategoryExtraConfig.PriceMovementConfiguration(this.hour_of_day, this.minute_of_hour, this.second_of_minute, this.millis_of_second, buildUnknownFields());
            }
        }
    }

    static {
        LocalTime$Companion$ADAPTER$1 localTime$Companion$ADAPTER$1 = new LocalTime$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalTime.class), "type.googleapis.com/squareup.common.time.LocalTime", Syntax.PROTO_2, null, "squareup/common/time.proto");
        ADAPTER = localTime$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localTime$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTime(Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.hour_of_day = num;
        this.minute_of_hour = num2;
        this.second_of_minute = num3;
        this.millis_of_second = num4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalTime)) {
            return false;
        }
        LocalTime localTime = (LocalTime) obj;
        return Intrinsics.areEqual(unknownFields(), localTime.unknownFields()) && Intrinsics.areEqual(this.hour_of_day, localTime.hour_of_day) && Intrinsics.areEqual(this.minute_of_hour, localTime.minute_of_hour) && Intrinsics.areEqual(this.second_of_minute, localTime.second_of_minute) && Intrinsics.areEqual(this.millis_of_second, localTime.millis_of_second);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.hour_of_day;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.minute_of_hour;
        int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Integer num3 = this.second_of_minute;
        int hashCode4 = (hashCode3 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 37;
        Integer num4 = this.millis_of_second;
        int hashCode5 = hashCode4 + (num4 != null ? Integer.hashCode(num4.intValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.hour_of_day = this.hour_of_day;
        builder.minute_of_hour = this.minute_of_hour;
        builder.second_of_minute = this.second_of_minute;
        builder.millis_of_second = this.millis_of_second;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.hour_of_day;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("hour_of_day=", num, arrayList);
        }
        Integer num2 = this.minute_of_hour;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("minute_of_hour=", num2, arrayList);
        }
        Integer num3 = this.second_of_minute;
        if (num3 != null) {
            re$$ExternalSyntheticOutline0.m("second_of_minute=", num3, arrayList);
        }
        Integer num4 = this.millis_of_second;
        if (num4 != null) {
            re$$ExternalSyntheticOutline0.m("millis_of_second=", num4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalTime{", "}", 0, null, null, 56);
    }
}
