package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ScheduleTriggerInfo;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ScheduleTriggerInfo$Builder;", "", "schedule", "Ljava/lang/String;", "time_zone", "Lcom/squareup/protos/cash/kgoose/api/v3/RunConfiguration;", "run_configuration", "Lcom/squareup/protos/cash/kgoose/api/v3/RunConfiguration;", "", "execution_count", "Ljava/lang/Integer;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ScheduleTriggerInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ScheduleTriggerInfo> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 3, tag = 4)
    public final Integer execution_count;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.RunConfiguration#ADAPTER", schemaIndex = 2, tag = 3)
    public final RunConfiguration run_configuration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String schedule;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String time_zone;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ScheduleTriggerInfo$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ScheduleTriggerInfo;", "<init>", "()V", "schedule", "", "time_zone", "run_configuration", "Lcom/squareup/protos/cash/kgoose/api/v3/RunConfiguration;", "execution_count", "", "Ljava/lang/Integer;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/kgoose/api/v3/ScheduleTriggerInfo$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Integer execution_count;
        public RunConfiguration run_configuration;
        public String schedule;
        public String time_zone;

        @Override // com.squareup.wire.Message.Builder
        public ScheduleTriggerInfo build() {
            return new ScheduleTriggerInfo(this.schedule, this.time_zone, this.run_configuration, this.execution_count, buildUnknownFields());
        }

        public final Builder execution_count(Integer execution_count) {
            this.execution_count = execution_count;
            return this;
        }

        public final Builder run_configuration(RunConfiguration run_configuration) {
            this.run_configuration = run_configuration;
            return this;
        }

        public final Builder schedule(String schedule) {
            this.schedule = schedule;
            return this;
        }

        public final Builder time_zone(String time_zone) {
            this.time_zone = time_zone;
            return this;
        }
    }

    static {
        ScheduleTriggerInfo$Companion$ADAPTER$1 scheduleTriggerInfo$Companion$ADAPTER$1 = new ScheduleTriggerInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ScheduleTriggerInfo.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ScheduleTriggerInfo", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = scheduleTriggerInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(scheduleTriggerInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduleTriggerInfo(String str, String str2, RunConfiguration runConfiguration, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.schedule = str;
        this.time_zone = str2;
        this.run_configuration = runConfiguration;
        this.execution_count = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScheduleTriggerInfo)) {
            return false;
        }
        ScheduleTriggerInfo scheduleTriggerInfo = (ScheduleTriggerInfo) obj;
        return Intrinsics.areEqual(unknownFields(), scheduleTriggerInfo.unknownFields()) && Intrinsics.areEqual(this.schedule, scheduleTriggerInfo.schedule) && Intrinsics.areEqual(this.time_zone, scheduleTriggerInfo.time_zone) && Intrinsics.areEqual(this.run_configuration, scheduleTriggerInfo.run_configuration) && Intrinsics.areEqual(this.execution_count, scheduleTriggerInfo.execution_count);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.schedule;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.time_zone;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        RunConfiguration runConfiguration = this.run_configuration;
        int hashCode4 = (hashCode3 + (runConfiguration != null ? runConfiguration.hashCode() : 0)) * 37;
        Integer num = this.execution_count;
        int hashCode5 = hashCode4 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.schedule = this.schedule;
        builder.time_zone = this.time_zone;
        builder.run_configuration = this.run_configuration;
        builder.execution_count = this.execution_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.schedule;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "schedule=", arrayList);
        }
        String str2 = this.time_zone;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "time_zone=", arrayList);
        }
        RunConfiguration runConfiguration = this.run_configuration;
        if (runConfiguration != null) {
            arrayList.add("run_configuration=" + runConfiguration);
        }
        Integer num = this.execution_count;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("execution_count=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScheduleTriggerInfo{", "}", 0, null, null, 56);
    }
}
