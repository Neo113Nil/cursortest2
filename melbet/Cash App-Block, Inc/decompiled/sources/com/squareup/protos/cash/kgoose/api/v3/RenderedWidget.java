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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/RenderedWidget;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/RenderedWidget$Builder;", "", "widget_id", "Ljava/lang/String;", "", "created_at", "Ljava/lang/Long;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable;", "client_renderable", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable;", "session_id", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientKickoffParams;", "kickoff_params", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientKickoffParams;", "getKickoff_params$annotations", "()V", "Lcom/squareup/protos/cash/kgoose/api/v3/TapAction;", "tap_action", "Lcom/squareup/protos/cash/kgoose/api/v3/TapAction;", "getTap_action$annotations", "", "permanent", "Ljava/lang/Boolean;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RenderedWidget extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RenderedWidget> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ClientRenderable#ADAPTER", schemaIndex = 2, tag = 3)
    public final ClientRenderable client_renderable;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 1, tag = 2)
    public final Long created_at;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ClientKickoffParams#ADAPTER", schemaIndex = 4, tag = 5)
    public final ClientKickoffParams kickoff_params;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 6, tag = 7)
    public final Boolean permanent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String session_id;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TapAction#ADAPTER", schemaIndex = 5, tag = 6)
    public final TapAction tap_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String widget_id;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0014J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0012\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u0015\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/RenderedWidget$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/RenderedWidget;", "<init>", "()V", "widget_id", "", "created_at", "", "Ljava/lang/Long;", "client_renderable", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable;", "session_id", "kickoff_params", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientKickoffParams;", "tap_action", "Lcom/squareup/protos/cash/kgoose/api/v3/TapAction;", "permanent", "", "Ljava/lang/Boolean;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/kgoose/api/v3/RenderedWidget$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/RenderedWidget$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ClientRenderable client_renderable;
        public Long created_at;
        public ClientKickoffParams kickoff_params;
        public Boolean permanent;
        public String session_id;
        public TapAction tap_action;
        public String widget_id;

        @Override // com.squareup.wire.Message.Builder
        public RenderedWidget build() {
            return new RenderedWidget(this.widget_id, this.created_at, this.client_renderable, this.session_id, this.kickoff_params, this.tap_action, this.permanent, buildUnknownFields());
        }

        public final Builder client_renderable(ClientRenderable client_renderable) {
            this.client_renderable = client_renderable;
            return this;
        }

        public final Builder created_at(Long created_at) {
            this.created_at = created_at;
            return this;
        }

        @Deprecated
        public final Builder kickoff_params(ClientKickoffParams kickoff_params) {
            this.kickoff_params = kickoff_params;
            return this;
        }

        public final Builder permanent(Boolean permanent) {
            this.permanent = permanent;
            return this;
        }

        public final Builder session_id(String session_id) {
            this.session_id = session_id;
            return this;
        }

        @Deprecated
        public final Builder tap_action(TapAction tap_action) {
            this.tap_action = tap_action;
            return this;
        }

        public final Builder widget_id(String widget_id) {
            this.widget_id = widget_id;
            return this;
        }
    }

    static {
        RenderedWidget$Companion$ADAPTER$1 renderedWidget$Companion$ADAPTER$1 = new RenderedWidget$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RenderedWidget.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.RenderedWidget", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/cash/widget_messages.proto");
        ADAPTER = renderedWidget$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(renderedWidget$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderedWidget(String str, Long l, ClientRenderable clientRenderable, String str2, ClientKickoffParams clientKickoffParams, TapAction tapAction, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.widget_id = str;
        this.created_at = l;
        this.client_renderable = clientRenderable;
        this.session_id = str2;
        this.kickoff_params = clientKickoffParams;
        this.tap_action = tapAction;
        this.permanent = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RenderedWidget)) {
            return false;
        }
        RenderedWidget renderedWidget = (RenderedWidget) obj;
        return Intrinsics.areEqual(unknownFields(), renderedWidget.unknownFields()) && Intrinsics.areEqual(this.widget_id, renderedWidget.widget_id) && Intrinsics.areEqual(this.created_at, renderedWidget.created_at) && Intrinsics.areEqual(this.client_renderable, renderedWidget.client_renderable) && Intrinsics.areEqual(this.session_id, renderedWidget.session_id) && Intrinsics.areEqual(this.kickoff_params, renderedWidget.kickoff_params) && Intrinsics.areEqual(this.tap_action, renderedWidget.tap_action) && Intrinsics.areEqual(this.permanent, renderedWidget.permanent);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.widget_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        ClientRenderable clientRenderable = this.client_renderable;
        int hashCode4 = (hashCode3 + (clientRenderable != null ? clientRenderable.hashCode() : 0)) * 37;
        String str2 = this.session_id;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        ClientKickoffParams clientKickoffParams = this.kickoff_params;
        int hashCode6 = (hashCode5 + (clientKickoffParams != null ? clientKickoffParams.hashCode() : 0)) * 37;
        TapAction tapAction = this.tap_action;
        int hashCode7 = (hashCode6 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
        Boolean bool = this.permanent;
        int hashCode8 = hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.widget_id = this.widget_id;
        builder.created_at = this.created_at;
        builder.client_renderable = this.client_renderable;
        builder.session_id = this.session_id;
        builder.kickoff_params = this.kickoff_params;
        builder.tap_action = this.tap_action;
        builder.permanent = this.permanent;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.widget_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "widget_id=", arrayList);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        ClientRenderable clientRenderable = this.client_renderable;
        if (clientRenderable != null) {
            arrayList.add("client_renderable=" + clientRenderable);
        }
        String str2 = this.session_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "session_id=", arrayList);
        }
        ClientKickoffParams clientKickoffParams = this.kickoff_params;
        if (clientKickoffParams != null) {
            arrayList.add("kickoff_params=" + clientKickoffParams);
        }
        TapAction tapAction = this.tap_action;
        if (tapAction != null) {
            arrayList.add("tap_action=" + tapAction);
        }
        Boolean bool = this.permanent;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("permanent=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RenderedWidget{", "}", 0, null, null, 56);
    }
}
