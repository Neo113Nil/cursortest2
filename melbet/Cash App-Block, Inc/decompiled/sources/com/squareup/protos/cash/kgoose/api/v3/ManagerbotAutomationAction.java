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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationAction$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationAction$Action;", "action", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationAction$Action;", "Companion", "Builder", "Action", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManagerbotAutomationAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ManagerbotAutomationAction> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final Action action;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationAction$Action;", "", "RunCustomPrompt", "SendReportingData", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationAction$Action$RunCustomPrompt;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationAction$Action$SendReportingData;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Action {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.RunCustomPromptAction#ADAPTER", declaredName = "run_custom_prompt", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationAction$Action$RunCustomPrompt;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationAction$Action;", "Lcom/squareup/protos/cash/kgoose/api/v3/RunCustomPromptAction;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/RunCustomPromptAction;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/RunCustomPromptAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RunCustomPrompt extends Action {
            private final RunCustomPromptAction value;

            public RunCustomPrompt(RunCustomPromptAction runCustomPromptAction) {
                runCustomPromptAction.getClass();
                this.value = runCustomPromptAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RunCustomPrompt) && Intrinsics.areEqual(this.value, ((RunCustomPrompt) obj).value);
            }

            public final RunCustomPromptAction getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "RunCustomPrompt(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.SendReportingDataAction#ADAPTER", declaredName = "send_reporting_data", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationAction$Action$SendReportingData;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationAction$Action;", "Lcom/squareup/protos/cash/kgoose/api/v3/SendReportingDataAction;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/SendReportingDataAction;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/SendReportingDataAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SendReportingData extends Action {
            private final SendReportingDataAction value;

            public SendReportingData(SendReportingDataAction sendReportingDataAction) {
                sendReportingDataAction.getClass();
                this.value = sendReportingDataAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SendReportingData) && Intrinsics.areEqual(this.value, ((SendReportingData) obj).value);
            }

            public final SendReportingDataAction getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SendReportingData(value=" + this.value + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationAction;", "<init>", "()V", "action", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationAction$Action;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Action action;

        public final Builder action(Action action) {
            this.action = action;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ManagerbotAutomationAction build() {
            return new ManagerbotAutomationAction(this.action, buildUnknownFields());
        }
    }

    static {
        ManagerbotAutomationAction$Companion$ADAPTER$1 managerbotAutomationAction$Companion$ADAPTER$1 = new ManagerbotAutomationAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ManagerbotAutomationAction.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ManagerbotAutomationAction", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = managerbotAutomationAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(managerbotAutomationAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagerbotAutomationAction(Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action = action;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ManagerbotAutomationAction)) {
            return false;
        }
        ManagerbotAutomationAction managerbotAutomationAction = (ManagerbotAutomationAction) obj;
        return Intrinsics.areEqual(unknownFields(), managerbotAutomationAction.unknownFields()) && Intrinsics.areEqual(this.action, managerbotAutomationAction.action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Action action = this.action;
        int hashCode2 = hashCode + (action != null ? action.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.action = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ManagerbotAutomationAction{", "}", 0, null, null, 56);
    }
}
