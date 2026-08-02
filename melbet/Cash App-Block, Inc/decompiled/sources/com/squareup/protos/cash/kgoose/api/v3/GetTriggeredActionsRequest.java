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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionsRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionsRequest$Builder;", "", "cursor", "Ljava/lang/String;", "", "limit", "Ljava/lang/Integer;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionStatusFilter;", "status_filter", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionStatusFilter;", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "on_behalf_of", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "", "include_instructions", "Ljava/lang/Boolean;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetTriggeredActionsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetTriggeredActionsRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 5)
    public final Boolean include_instructions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
    public final Integer limit;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.OnBehalfOf#ADAPTER", schemaIndex = 3, tag = 4)
    public final OnBehalfOf on_behalf_of;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TriggeredActionStatusFilter#ADAPTER", schemaIndex = 2, tag = 3)
    public final TriggeredActionStatusFilter status_filter;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0011J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionsRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionsRequest;", "<init>", "()V", "cursor", "", "limit", "", "Ljava/lang/Integer;", "status_filter", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionStatusFilter;", "on_behalf_of", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "include_instructions", "", "Ljava/lang/Boolean;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionsRequest$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionsRequest$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String cursor;
        public Boolean include_instructions;
        public Integer limit;
        public OnBehalfOf on_behalf_of;
        public TriggeredActionStatusFilter status_filter;

        @Override // com.squareup.wire.Message.Builder
        public GetTriggeredActionsRequest build() {
            return new GetTriggeredActionsRequest(this.cursor, this.limit, this.status_filter, this.on_behalf_of, this.include_instructions, buildUnknownFields());
        }

        public final Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public final Builder include_instructions(Boolean include_instructions) {
            this.include_instructions = include_instructions;
            return this;
        }

        public final Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public final Builder on_behalf_of(OnBehalfOf on_behalf_of) {
            this.on_behalf_of = on_behalf_of;
            return this;
        }

        public final Builder status_filter(TriggeredActionStatusFilter status_filter) {
            this.status_filter = status_filter;
            return this;
        }
    }

    static {
        GetTriggeredActionsRequest$Companion$ADAPTER$1 getTriggeredActionsRequest$Companion$ADAPTER$1 = new GetTriggeredActionsRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetTriggeredActionsRequest.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.GetTriggeredActionsRequest", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = getTriggeredActionsRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getTriggeredActionsRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTriggeredActionsRequest(String str, Integer num, TriggeredActionStatusFilter triggeredActionStatusFilter, OnBehalfOf onBehalfOf, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cursor = str;
        this.limit = num;
        this.status_filter = triggeredActionStatusFilter;
        this.on_behalf_of = onBehalfOf;
        this.include_instructions = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetTriggeredActionsRequest)) {
            return false;
        }
        GetTriggeredActionsRequest getTriggeredActionsRequest = (GetTriggeredActionsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getTriggeredActionsRequest.unknownFields()) && Intrinsics.areEqual(this.cursor, getTriggeredActionsRequest.cursor) && Intrinsics.areEqual(this.limit, getTriggeredActionsRequest.limit) && this.status_filter == getTriggeredActionsRequest.status_filter && Intrinsics.areEqual(this.on_behalf_of, getTriggeredActionsRequest.on_behalf_of) && Intrinsics.areEqual(this.include_instructions, getTriggeredActionsRequest.include_instructions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.cursor;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.limit;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        TriggeredActionStatusFilter triggeredActionStatusFilter = this.status_filter;
        int hashCode4 = (hashCode3 + (triggeredActionStatusFilter != null ? triggeredActionStatusFilter.hashCode() : 0)) * 37;
        OnBehalfOf onBehalfOf = this.on_behalf_of;
        int hashCode5 = (hashCode4 + (onBehalfOf != null ? onBehalfOf.hashCode() : 0)) * 37;
        Boolean bool = this.include_instructions;
        int hashCode6 = hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.cursor = this.cursor;
        builder.limit = this.limit;
        builder.status_filter = this.status_filter;
        builder.on_behalf_of = this.on_behalf_of;
        builder.include_instructions = this.include_instructions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.cursor;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cursor=", arrayList);
        }
        Integer num = this.limit;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("limit=", num, arrayList);
        }
        TriggeredActionStatusFilter triggeredActionStatusFilter = this.status_filter;
        if (triggeredActionStatusFilter != null) {
            arrayList.add("status_filter=" + triggeredActionStatusFilter);
        }
        OnBehalfOf onBehalfOf = this.on_behalf_of;
        if (onBehalfOf != null) {
            arrayList.add("on_behalf_of=" + onBehalfOf);
        }
        Boolean bool = this.include_instructions;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_instructions=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTriggeredActionsRequest{", "}", 0, null, null, 56);
    }
}
