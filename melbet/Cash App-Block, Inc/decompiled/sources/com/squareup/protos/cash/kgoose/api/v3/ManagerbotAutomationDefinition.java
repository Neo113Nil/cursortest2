package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationDefinition;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationDefinition$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationTrigger;", "trigger", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationTrigger;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationAction;", "actions", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManagerbotAutomationDefinition extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ManagerbotAutomationDefinition> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ManagerbotAutomationAction#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<ManagerbotAutomationAction> actions;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ManagerbotAutomationTrigger#ADAPTER", schemaIndex = 0, tag = 1)
    public final ManagerbotAutomationTrigger trigger;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationDefinition$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationDefinition;", "<init>", "()V", "trigger", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationTrigger;", "actions", "", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationAction;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<ManagerbotAutomationAction> actions = EmptyList.INSTANCE;
        public ManagerbotAutomationTrigger trigger;

        public final Builder actions(List<ManagerbotAutomationAction> actions) {
            actions.getClass();
            TransactorKt.checkElementsNotNull(actions);
            this.actions = actions;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ManagerbotAutomationDefinition build() {
            return new ManagerbotAutomationDefinition(this.trigger, this.actions, buildUnknownFields());
        }

        public final Builder trigger(ManagerbotAutomationTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
    }

    static {
        ManagerbotAutomationDefinition$Companion$ADAPTER$1 managerbotAutomationDefinition$Companion$ADAPTER$1 = new ManagerbotAutomationDefinition$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ManagerbotAutomationDefinition.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ManagerbotAutomationDefinition", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = managerbotAutomationDefinition$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(managerbotAutomationDefinition$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagerbotAutomationDefinition(ManagerbotAutomationTrigger managerbotAutomationTrigger, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.trigger = managerbotAutomationTrigger;
        this.actions = TransactorKt.immutableCopyOf("actions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ManagerbotAutomationDefinition)) {
            return false;
        }
        ManagerbotAutomationDefinition managerbotAutomationDefinition = (ManagerbotAutomationDefinition) obj;
        return Intrinsics.areEqual(unknownFields(), managerbotAutomationDefinition.unknownFields()) && Intrinsics.areEqual(this.trigger, managerbotAutomationDefinition.trigger) && Intrinsics.areEqual(this.actions, managerbotAutomationDefinition.actions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ManagerbotAutomationTrigger managerbotAutomationTrigger = this.trigger;
        int hashCode2 = this.actions.hashCode() + ((hashCode + (managerbotAutomationTrigger != null ? managerbotAutomationTrigger.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.trigger = this.trigger;
        builder.actions = this.actions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ManagerbotAutomationTrigger managerbotAutomationTrigger = this.trigger;
        if (managerbotAutomationTrigger != null) {
            arrayList.add("trigger=" + managerbotAutomationTrigger);
        }
        if (!this.actions.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("actions=", arrayList, this.actions);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ManagerbotAutomationDefinition{", "}", 0, null, null, 56);
    }
}
