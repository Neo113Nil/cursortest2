package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ConfirmTriggeredActionResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ConfirmTriggeredActionResponse$Builder;", "", "success", "Ljava/lang/Boolean;", "", "error_msg", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredAction;", "triggered_action", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredAction;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConfirmTriggeredActionResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ConfirmTriggeredActionResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String error_msg;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    public final Boolean success;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TriggeredAction#ADAPTER", schemaIndex = 2, tag = 3)
    public final TriggeredAction triggered_action;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ConfirmTriggeredActionResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ConfirmTriggeredActionResponse;", "<init>", "()V", "success", "", "Ljava/lang/Boolean;", "error_msg", "", "triggered_action", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredAction;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/ConfirmTriggeredActionResponse$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String error_msg;
        public Boolean success;
        public TriggeredAction triggered_action;

        @Override // com.squareup.wire.Message.Builder
        public ConfirmTriggeredActionResponse build() {
            return new ConfirmTriggeredActionResponse(this.triggered_action, this.success, this.error_msg, buildUnknownFields());
        }

        public final Builder error_msg(String error_msg) {
            this.error_msg = error_msg;
            return this;
        }

        public final Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public final Builder triggered_action(TriggeredAction triggered_action) {
            this.triggered_action = triggered_action;
            return this;
        }
    }

    static {
        ConfirmTriggeredActionResponse$Companion$ADAPTER$1 confirmTriggeredActionResponse$Companion$ADAPTER$1 = new ConfirmTriggeredActionResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ConfirmTriggeredActionResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ConfirmTriggeredActionResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = confirmTriggeredActionResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(confirmTriggeredActionResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmTriggeredActionResponse(TriggeredAction triggeredAction, Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.success = bool;
        this.error_msg = str;
        this.triggered_action = triggeredAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConfirmTriggeredActionResponse)) {
            return false;
        }
        ConfirmTriggeredActionResponse confirmTriggeredActionResponse = (ConfirmTriggeredActionResponse) obj;
        return Intrinsics.areEqual(unknownFields(), confirmTriggeredActionResponse.unknownFields()) && Intrinsics.areEqual(this.success, confirmTriggeredActionResponse.success) && Intrinsics.areEqual(this.error_msg, confirmTriggeredActionResponse.error_msg) && Intrinsics.areEqual(this.triggered_action, confirmTriggeredActionResponse.triggered_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.success;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.error_msg;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        TriggeredAction triggeredAction = this.triggered_action;
        int hashCode4 = hashCode3 + (triggeredAction != null ? triggeredAction.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.success = this.success;
        builder.error_msg = this.error_msg;
        builder.triggered_action = this.triggered_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.success;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("success=", bool, arrayList);
        }
        String str = this.error_msg;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "error_msg=", arrayList);
        }
        TriggeredAction triggeredAction = this.triggered_action;
        if (triggeredAction != null) {
            arrayList.add("triggered_action=" + triggeredAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmTriggeredActionResponse{", "}", 0, null, null, 56);
    }
}
