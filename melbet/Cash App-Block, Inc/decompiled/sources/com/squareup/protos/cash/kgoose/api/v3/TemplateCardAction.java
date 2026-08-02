package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\u000b\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction$Action;", "action", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction$Action;", "Lsquareup/cash/analytics/CdfEvent;", "tap_cdf_event", "Lsquareup/cash/analytics/CdfEvent;", "Companion", "Builder", "Action", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TemplateCardAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TemplateCardAction> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final Action action;

    @WireField(adapter = "squareup.cash.analytics.CdfEvent#ADAPTER", schemaIndex = 1, tag = 3)
    public final CdfEvent tap_cdf_event;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction$Action;", "", "ServerToolCall", "ClientRouteUrlTemplate", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction$Action$ClientRouteUrlTemplate;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction$Action$ServerToolCall;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Action {

        @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "client_route_url_template", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction$Action$ClientRouteUrlTemplate;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction$Action;", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ClientRouteUrlTemplate extends Action {
            private final String value;

            public ClientRouteUrlTemplate(String str) {
                str.getClass();
                this.value = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClientRouteUrlTemplate) && Intrinsics.areEqual(this.value, ((ClientRouteUrlTemplate) obj).value);
            }

            public final String getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRouteUrlTemplate(value=", this.value, ")");
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TemplateCardServerToolCall#ADAPTER", declaredName = "server_tool_call", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction$Action$ServerToolCall;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction$Action;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardServerToolCall;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardServerToolCall;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardServerToolCall;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ServerToolCall extends Action {
            private final TemplateCardServerToolCall value;

            public ServerToolCall(TemplateCardServerToolCall templateCardServerToolCall) {
                templateCardServerToolCall.getClass();
                this.value = templateCardServerToolCall;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ServerToolCall) && Intrinsics.areEqual(this.value, ((ServerToolCall) obj).value);
            }

            public final TemplateCardServerToolCall getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ServerToolCall(value=" + this.value + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction;", "<init>", "()V", "action", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardAction$Action;", "tap_cdf_event", "Lsquareup/cash/analytics/CdfEvent;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Action action;
        public CdfEvent tap_cdf_event;

        public final Builder action(Action action) {
            this.action = action;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public TemplateCardAction build() {
            return new TemplateCardAction(this.action, this.tap_cdf_event, buildUnknownFields());
        }

        public final Builder tap_cdf_event(CdfEvent tap_cdf_event) {
            this.tap_cdf_event = tap_cdf_event;
            return this;
        }
    }

    static {
        TemplateCardAction$Companion$ADAPTER$1 templateCardAction$Companion$ADAPTER$1 = new TemplateCardAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TemplateCardAction.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.TemplateCardAction", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = templateCardAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(templateCardAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateCardAction(Action action, CdfEvent cdfEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action = action;
        this.tap_cdf_event = cdfEvent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TemplateCardAction)) {
            return false;
        }
        TemplateCardAction templateCardAction = (TemplateCardAction) obj;
        return Intrinsics.areEqual(unknownFields(), templateCardAction.unknownFields()) && Intrinsics.areEqual(this.action, templateCardAction.action) && Intrinsics.areEqual(this.tap_cdf_event, templateCardAction.tap_cdf_event);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Action action = this.action;
        int hashCode2 = (hashCode + (action != null ? action.hashCode() : 0)) * 37;
        CdfEvent cdfEvent = this.tap_cdf_event;
        int hashCode3 = hashCode2 + (cdfEvent != null ? cdfEvent.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.action = this.action;
        builder.tap_cdf_event = this.tap_cdf_event;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        CdfEvent cdfEvent = this.tap_cdf_event;
        if (cdfEvent != null) {
            arrayList.add("tap_cdf_event=" + cdfEvent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TemplateCardAction{", "}", 0, null, null, 56);
    }
}
