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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/FireTriggeredActionRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/FireTriggeredActionRequest$Builder;", "", "triggered_action_id", "Ljava/lang/String;", "creator", "event_type", "event_id", "trigger_reason", "event_payload_json", "", "run_after", "Ljava/lang/Long;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FireTriggeredActionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FireTriggeredActionRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String creator;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String event_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String event_payload_json;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String event_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 6, tag = 7)
    public final Long run_after;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String trigger_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String triggered_action_id;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/FireTriggeredActionRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/FireTriggeredActionRequest;", "<init>", "()V", "triggered_action_id", "", "creator", "event_type", "event_id", "trigger_reason", "event_payload_json", "run_after", "", "Ljava/lang/Long;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/kgoose/api/v3/FireTriggeredActionRequest$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String creator;
        public String event_id;
        public String event_payload_json;
        public String event_type;
        public Long run_after;
        public String trigger_reason;
        public String triggered_action_id;

        @Override // com.squareup.wire.Message.Builder
        public FireTriggeredActionRequest build() {
            return new FireTriggeredActionRequest(this.triggered_action_id, this.creator, this.event_type, this.event_id, this.trigger_reason, this.event_payload_json, this.run_after, buildUnknownFields());
        }

        public final Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        public final Builder event_id(String event_id) {
            this.event_id = event_id;
            return this;
        }

        public final Builder event_payload_json(String event_payload_json) {
            this.event_payload_json = event_payload_json;
            return this;
        }

        public final Builder event_type(String event_type) {
            this.event_type = event_type;
            return this;
        }

        public final Builder run_after(Long run_after) {
            this.run_after = run_after;
            return this;
        }

        public final Builder trigger_reason(String trigger_reason) {
            this.trigger_reason = trigger_reason;
            return this;
        }

        public final Builder triggered_action_id(String triggered_action_id) {
            this.triggered_action_id = triggered_action_id;
            return this;
        }
    }

    static {
        FireTriggeredActionRequest$Companion$ADAPTER$1 fireTriggeredActionRequest$Companion$ADAPTER$1 = new FireTriggeredActionRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FireTriggeredActionRequest.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.FireTriggeredActionRequest", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = fireTriggeredActionRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(fireTriggeredActionRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FireTriggeredActionRequest(String str, String str2, String str3, String str4, String str5, String str6, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.triggered_action_id = str;
        this.creator = str2;
        this.event_type = str3;
        this.event_id = str4;
        this.trigger_reason = str5;
        this.event_payload_json = str6;
        this.run_after = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FireTriggeredActionRequest)) {
            return false;
        }
        FireTriggeredActionRequest fireTriggeredActionRequest = (FireTriggeredActionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), fireTriggeredActionRequest.unknownFields()) && Intrinsics.areEqual(this.triggered_action_id, fireTriggeredActionRequest.triggered_action_id) && Intrinsics.areEqual(this.creator, fireTriggeredActionRequest.creator) && Intrinsics.areEqual(this.event_type, fireTriggeredActionRequest.event_type) && Intrinsics.areEqual(this.event_id, fireTriggeredActionRequest.event_id) && Intrinsics.areEqual(this.trigger_reason, fireTriggeredActionRequest.trigger_reason) && Intrinsics.areEqual(this.event_payload_json, fireTriggeredActionRequest.event_payload_json) && Intrinsics.areEqual(this.run_after, fireTriggeredActionRequest.run_after);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.triggered_action_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.creator;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.event_type;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.event_id;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.trigger_reason;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.event_payload_json;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Long l = this.run_after;
        int hashCode8 = hashCode7 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.triggered_action_id = this.triggered_action_id;
        builder.creator = this.creator;
        builder.event_type = this.event_type;
        builder.event_id = this.event_id;
        builder.trigger_reason = this.trigger_reason;
        builder.event_payload_json = this.event_payload_json;
        builder.run_after = this.run_after;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.triggered_action_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "triggered_action_id=", arrayList);
        }
        String str2 = this.creator;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "creator=", arrayList);
        }
        String str3 = this.event_type;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "event_type=", arrayList);
        }
        String str4 = this.event_id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "event_id=", arrayList);
        }
        String str5 = this.trigger_reason;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "trigger_reason=", arrayList);
        }
        String str6 = this.event_payload_json;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "event_payload_json=", arrayList);
        }
        Long l = this.run_after;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("run_after=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FireTriggeredActionRequest{", "}", 0, null, null, 56);
    }
}
