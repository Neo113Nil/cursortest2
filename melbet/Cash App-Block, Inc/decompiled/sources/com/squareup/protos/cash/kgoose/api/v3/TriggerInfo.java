package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\u000b\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TriggerInfo;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggerInfo$Builder;", "", "trigger_id", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggerInfo$Trigger;", "trigger", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggerInfo$Trigger;", "Companion", "Builder", "Trigger", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TriggerInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TriggerInfo> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 1)
    public final Trigger trigger;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String trigger_id;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TriggerInfo$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggerInfo;", "<init>", "()V", "trigger_id", "", "trigger", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggerInfo$Trigger;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Trigger trigger;
        public String trigger_id;

        @Override // com.squareup.wire.Message.Builder
        public TriggerInfo build() {
            return new TriggerInfo(this.trigger_id, this.trigger, buildUnknownFields());
        }

        public final Builder trigger(Trigger trigger) {
            this.trigger = trigger;
            return this;
        }

        public final Builder trigger_id(String trigger_id) {
            this.trigger_id = trigger_id;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TriggerInfo$Trigger;", "", "ScheduleTrigger", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggerInfo$Trigger$ScheduleTrigger;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Trigger {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ScheduleTriggerInfo#ADAPTER", declaredName = "schedule_trigger", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TriggerInfo$Trigger$ScheduleTrigger;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggerInfo$Trigger;", "Lcom/squareup/protos/cash/kgoose/api/v3/ScheduleTriggerInfo;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ScheduleTriggerInfo;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ScheduleTriggerInfo;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ScheduleTrigger extends Trigger {
            private final ScheduleTriggerInfo value;

            public ScheduleTrigger(ScheduleTriggerInfo scheduleTriggerInfo) {
                scheduleTriggerInfo.getClass();
                this.value = scheduleTriggerInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ScheduleTrigger) && Intrinsics.areEqual(this.value, ((ScheduleTrigger) obj).value);
            }

            public final ScheduleTriggerInfo getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ScheduleTrigger(value=" + this.value + ")";
            }
        }
    }

    static {
        TriggerInfo$Companion$ADAPTER$1 triggerInfo$Companion$ADAPTER$1 = new TriggerInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TriggerInfo.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.TriggerInfo", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = triggerInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(triggerInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerInfo(String str, Trigger trigger, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.trigger_id = str;
        this.trigger = trigger;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TriggerInfo)) {
            return false;
        }
        TriggerInfo triggerInfo = (TriggerInfo) obj;
        return Intrinsics.areEqual(unknownFields(), triggerInfo.unknownFields()) && Intrinsics.areEqual(this.trigger_id, triggerInfo.trigger_id) && Intrinsics.areEqual(this.trigger, triggerInfo.trigger);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.trigger_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Trigger trigger = this.trigger;
        int hashCode3 = hashCode2 + (trigger != null ? trigger.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.trigger_id = this.trigger_id;
        builder.trigger = this.trigger;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.trigger_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "trigger_id=", arrayList);
        }
        Trigger trigger = this.trigger;
        if (trigger != null) {
            arrayList.add("trigger=" + trigger);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TriggerInfo{", "}", 0, null, null, 56);
    }
}
