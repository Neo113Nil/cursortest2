package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.common.ScheduleRFC2445;
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

/* loaded from: classes8.dex */
public final class ScheduledPaymentsConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ScheduledPaymentsConfig> CREATOR;
    public final List supported_schedules;

    public final class SupportedSchedule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SupportedSchedule> CREATOR;
        public final String description;
        public final ScheduleRFC2445 schedule;

        static {
            ScheduledPaymentsConfig$SupportedSchedule$Companion$ADAPTER$1 scheduledPaymentsConfig$SupportedSchedule$Companion$ADAPTER$1 = new ScheduledPaymentsConfig$SupportedSchedule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SupportedSchedule.class), "type.googleapis.com/squareup.franklin.app.ScheduledPaymentsConfig.SupportedSchedule", Syntax.PROTO_2, null, "squareup/franklin/app/scheduled_payments_config.proto");
            ADAPTER = scheduledPaymentsConfig$SupportedSchedule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(scheduledPaymentsConfig$SupportedSchedule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SupportedSchedule(String str, ScheduleRFC2445 scheduleRFC2445, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.description = str;
            this.schedule = scheduleRFC2445;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SupportedSchedule)) {
                return false;
            }
            SupportedSchedule supportedSchedule = (SupportedSchedule) obj;
            return Intrinsics.areEqual(unknownFields(), supportedSchedule.unknownFields()) && Intrinsics.areEqual(this.description, supportedSchedule.description) && Intrinsics.areEqual(this.schedule, supportedSchedule.schedule);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.description;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            ScheduleRFC2445 scheduleRFC2445 = this.schedule;
            int hashCode3 = hashCode2 + (scheduleRFC2445 != null ? scheduleRFC2445.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SetAmountRequest.Builder builder = new SetAmountRequest.Builder(1);
            builder.request_context = this.description;
            builder.result = this.schedule;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.description;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "description=", arrayList);
            }
            ScheduleRFC2445 scheduleRFC2445 = this.schedule;
            if (scheduleRFC2445 != null) {
                arrayList.add("schedule=" + scheduleRFC2445);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SupportedSchedule{", "}", 0, null, null, 56);
        }
    }

    static {
        ScheduledPaymentsConfig$Companion$ADAPTER$1 scheduledPaymentsConfig$Companion$ADAPTER$1 = new ScheduledPaymentsConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ScheduledPaymentsConfig.class), "type.googleapis.com/squareup.franklin.app.ScheduledPaymentsConfig", Syntax.PROTO_2, null, "squareup/franklin/app/scheduled_payments_config.proto");
        ADAPTER = scheduledPaymentsConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(scheduledPaymentsConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledPaymentsConfig(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.supported_schedules = TransactorKt.immutableCopyOf("supported_schedules", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScheduledPaymentsConfig)) {
            return false;
        }
        ScheduledPaymentsConfig scheduledPaymentsConfig = (ScheduledPaymentsConfig) obj;
        return Intrinsics.areEqual(unknownFields(), scheduledPaymentsConfig.unknownFields()) && Intrinsics.areEqual(this.supported_schedules, scheduledPaymentsConfig.supported_schedules);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.supported_schedules.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(16, false);
        builder.header = this.supported_schedules;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.supported_schedules;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("supported_schedules=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScheduledPaymentsConfig{", "}", 0, null, null, 56);
    }
}
