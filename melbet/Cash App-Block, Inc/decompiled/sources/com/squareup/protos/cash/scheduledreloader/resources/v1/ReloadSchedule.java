package com.squareup.protos.cash.scheduledreloader.resources.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.common.time.DateTime;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ReloadSchedule extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ReloadSchedule> CREATOR;
    public final Integer day_of_period;
    public final List days_of_period;
    public final Frequency frequency;
    public final Integer time_of_day;
    public final String timezone;

    /* loaded from: classes8.dex */
    public enum Frequency implements WireEnum {
        FREQUENCY_UNSPECIFIED(0),
        FREQUENCY_EVERY_DAY(1),
        FREQUENCY_EVERY_WEEK(2),
        FREQUENCY_EVERY_TWO_WEEKS(3),
        FREQUENCY_EVERY_MONTH(4);

        public static final ReloadSchedule$Frequency$Companion$ADAPTER$1 ADAPTER;
        public static final TaxEnvironment.Companion Companion;
        public final int value;

        static {
            Frequency frequency = FREQUENCY_UNSPECIFIED;
            Companion = new TaxEnvironment.Companion();
            ADAPTER = new ReloadSchedule$Frequency$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Frequency.class), Syntax.PROTO_2, frequency);
        }

        Frequency(int i) {
            this.value = i;
        }

        public static final Frequency fromValue(int i) {
            Companion.getClass();
            return TaxEnvironment.Companion.m3925fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ReloadSchedule$Companion$ADAPTER$1 reloadSchedule$Companion$ADAPTER$1 = new ReloadSchedule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ReloadSchedule.class), "type.googleapis.com/squareup.cash.scheduledreloader.resources.v1.ReloadSchedule", Syntax.PROTO_2, null, "squareup/cash/scheduledreloader/resources/v1/scheduled_reload.proto");
        ADAPTER = reloadSchedule$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(reloadSchedule$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReloadSchedule(Frequency frequency, List list, String str, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.frequency = frequency;
        this.timezone = str;
        this.time_of_day = num;
        this.day_of_period = num2;
        this.days_of_period = TransactorKt.immutableCopyOf("days_of_period", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReloadSchedule)) {
            return false;
        }
        ReloadSchedule reloadSchedule = (ReloadSchedule) obj;
        return Intrinsics.areEqual(unknownFields(), reloadSchedule.unknownFields()) && this.frequency == reloadSchedule.frequency && Intrinsics.areEqual(this.days_of_period, reloadSchedule.days_of_period) && Intrinsics.areEqual(this.timezone, reloadSchedule.timezone) && Intrinsics.areEqual(this.time_of_day, reloadSchedule.time_of_day) && Intrinsics.areEqual(this.day_of_period, reloadSchedule.day_of_period);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Frequency frequency = this.frequency;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (frequency != null ? frequency.hashCode() : 0)) * 37, 37, this.days_of_period);
        String str = this.timezone;
        int hashCode2 = (m + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.time_of_day;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.day_of_period;
        int hashCode4 = hashCode3 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(12, false);
        builder.instant_usec = this.frequency;
        builder.tz_name = this.days_of_period;
        builder.posix_tz = this.timezone;
        builder.timezone_offset_min = this.time_of_day;
        builder.ordinal = this.day_of_period;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Frequency frequency = this.frequency;
        if (frequency != null) {
            arrayList.add("frequency=" + frequency);
        }
        List list = this.days_of_period;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("days_of_period=", arrayList, list);
        }
        String str = this.timezone;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "timezone=", arrayList);
        }
        Integer num = this.time_of_day;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("time_of_day=", num, arrayList);
        }
        Integer num2 = this.day_of_period;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("day_of_period=", num2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReloadSchedule{", "}", 0, null, null, 56);
    }
}
