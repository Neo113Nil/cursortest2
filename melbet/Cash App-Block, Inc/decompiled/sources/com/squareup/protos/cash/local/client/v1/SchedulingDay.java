package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SchedulingDay extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SchedulingDay> CREATOR;
    public final String day_date_label;
    public final String day_label;
    public final List day_times;
    public final Boolean is_in_context;
    public final String scheduling_day_token;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String day_date_label;
        public String day_label;
        public List day_times;
        public Boolean is_in_context;
        public String scheduling_day_token;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new SchedulingDay(this.is_in_context, this.scheduling_day_token, this.day_label, this.day_date_label, this.day_times, buildUnknownFields());
                default:
                    return new LocalTippingConfiguration(this.is_in_context, this.scheduling_day_token, this.day_label, this.day_date_label, this.day_times, buildUnknownFields());
            }
        }
    }

    static {
        SchedulingDay$Companion$ADAPTER$1 schedulingDay$Companion$ADAPTER$1 = new SchedulingDay$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SchedulingDay.class), "type.googleapis.com/squareup.cash.local.client.v1.SchedulingDay", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_fulfillment.proto");
        ADAPTER = schedulingDay$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(schedulingDay$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SchedulingDay(Boolean bool, String str, String str2, String str3, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.scheduling_day_token = str;
        this.is_in_context = bool;
        this.day_label = str2;
        this.day_date_label = str3;
        this.day_times = TransactorKt.immutableCopyOf("day_times", list);
    }

    public static SchedulingDay copy$default(SchedulingDay schedulingDay, ArrayList arrayList, ByteString byteString, int i) {
        String str = schedulingDay.scheduling_day_token;
        Boolean bool = schedulingDay.is_in_context;
        String str2 = schedulingDay.day_label;
        String str3 = schedulingDay.day_date_label;
        if ((i & 32) != 0) {
            byteString = schedulingDay.unknownFields();
        }
        ByteString byteString2 = byteString;
        schedulingDay.getClass();
        byteString2.getClass();
        return new SchedulingDay(bool, str, str2, str3, arrayList, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulingDay)) {
            return false;
        }
        SchedulingDay schedulingDay = (SchedulingDay) obj;
        return Intrinsics.areEqual(unknownFields(), schedulingDay.unknownFields()) && Intrinsics.areEqual(this.scheduling_day_token, schedulingDay.scheduling_day_token) && Intrinsics.areEqual(this.is_in_context, schedulingDay.is_in_context) && Intrinsics.areEqual(this.day_label, schedulingDay.day_label) && Intrinsics.areEqual(this.day_date_label, schedulingDay.day_date_label) && Intrinsics.areEqual(this.day_times, schedulingDay.day_times);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.scheduling_day_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.is_in_context;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str2 = this.day_label;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.day_date_label;
        int hashCode5 = this.day_times.hashCode() + ((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.scheduling_day_token = this.scheduling_day_token;
        builder.is_in_context = this.is_in_context;
        builder.day_label = this.day_label;
        builder.day_date_label = this.day_date_label;
        builder.day_times = this.day_times;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.scheduling_day_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "scheduling_day_token=", arrayList);
        }
        Boolean bool = this.is_in_context;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_in_context=", bool, arrayList);
        }
        String str2 = this.day_label;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "day_label=", arrayList);
        }
        String str3 = this.day_date_label;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "day_date_label=", arrayList);
        }
        List list = this.day_times;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("day_times=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SchedulingDay{", "}", 0, null, null, 56);
    }
}
