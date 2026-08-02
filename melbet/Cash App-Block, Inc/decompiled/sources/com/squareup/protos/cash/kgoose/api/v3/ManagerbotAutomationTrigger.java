package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationTrigger;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationTrigger$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationTrigger$Trigger;", "trigger", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationTrigger$Trigger;", "Companion", "Builder", "Trigger", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManagerbotAutomationTrigger extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ManagerbotAutomationTrigger> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final Trigger trigger;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationTrigger$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationTrigger;", "<init>", "()V", "trigger", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationTrigger$Trigger;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Trigger trigger;

        @Override // com.squareup.wire.Message.Builder
        public ManagerbotAutomationTrigger build() {
            return new ManagerbotAutomationTrigger(this.trigger, buildUnknownFields());
        }

        public final Builder trigger(Trigger trigger) {
            this.trigger = trigger;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationTrigger$Trigger;", "", "ScheduleTrigger", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationTrigger$Trigger$ScheduleTrigger;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Trigger {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ManagerbotScheduleTriggerConfig#ADAPTER", declaredName = "schedule_trigger", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationTrigger$Trigger$ScheduleTrigger;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationTrigger$Trigger;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotScheduleTriggerConfig;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotScheduleTriggerConfig;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotScheduleTriggerConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ScheduleTrigger extends Trigger {
            private final ManagerbotScheduleTriggerConfig value;

            public ScheduleTrigger(ManagerbotScheduleTriggerConfig managerbotScheduleTriggerConfig) {
                managerbotScheduleTriggerConfig.getClass();
                this.value = managerbotScheduleTriggerConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ScheduleTrigger) && Intrinsics.areEqual(this.value, ((ScheduleTrigger) obj).value);
            }

            public final ManagerbotScheduleTriggerConfig getValue() {
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
        ManagerbotAutomationTrigger$Companion$ADAPTER$1 managerbotAutomationTrigger$Companion$ADAPTER$1 = new ManagerbotAutomationTrigger$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ManagerbotAutomationTrigger.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ManagerbotAutomationTrigger", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = managerbotAutomationTrigger$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(managerbotAutomationTrigger$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagerbotAutomationTrigger(Trigger trigger, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.trigger = trigger;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ManagerbotAutomationTrigger)) {
            return false;
        }
        ManagerbotAutomationTrigger managerbotAutomationTrigger = (ManagerbotAutomationTrigger) obj;
        return Intrinsics.areEqual(unknownFields(), managerbotAutomationTrigger.unknownFields()) && Intrinsics.areEqual(this.trigger, managerbotAutomationTrigger.trigger);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Trigger trigger = this.trigger;
        int hashCode2 = hashCode + (trigger != null ? trigger.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.trigger = this.trigger;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Trigger trigger = this.trigger;
        if (trigger != null) {
            arrayList.add("trigger=" + trigger);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ManagerbotAutomationTrigger{", "}", 0, null, null, 56);
    }
}
