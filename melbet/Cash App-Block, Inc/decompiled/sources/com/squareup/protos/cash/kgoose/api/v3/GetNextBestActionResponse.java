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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetNextBestActionResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetNextBestActionResponse$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/NextBestAction;", "action", "Lcom/squareup/protos/cash/kgoose/api/v3/NextBestAction;", "", "actions", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetNextBestActionResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetNextBestActionResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.NextBestAction#ADAPTER", schemaIndex = 0, tag = 1)
    public final NextBestAction action;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.NextBestAction#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<NextBestAction> actions;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetNextBestActionResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetNextBestActionResponse;", "<init>", "()V", "action", "Lcom/squareup/protos/cash/kgoose/api/v3/NextBestAction;", "actions", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public NextBestAction action;
        public List<NextBestAction> actions = EmptyList.INSTANCE;

        public final Builder action(NextBestAction action) {
            this.action = action;
            return this;
        }

        public final Builder actions(List<NextBestAction> actions) {
            actions.getClass();
            TransactorKt.checkElementsNotNull(actions);
            this.actions = actions;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetNextBestActionResponse build() {
            return new GetNextBestActionResponse(this.action, this.actions, buildUnknownFields());
        }
    }

    static {
        GetNextBestActionResponse$Companion$ADAPTER$1 getNextBestActionResponse$Companion$ADAPTER$1 = new GetNextBestActionResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetNextBestActionResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.GetNextBestActionResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/cash/next_best_action_messages.proto");
        ADAPTER = getNextBestActionResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getNextBestActionResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetNextBestActionResponse(NextBestAction nextBestAction, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.action = nextBestAction;
        this.actions = TransactorKt.immutableCopyOf("actions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetNextBestActionResponse)) {
            return false;
        }
        GetNextBestActionResponse getNextBestActionResponse = (GetNextBestActionResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getNextBestActionResponse.unknownFields()) && Intrinsics.areEqual(this.action, getNextBestActionResponse.action) && Intrinsics.areEqual(this.actions, getNextBestActionResponse.actions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        NextBestAction nextBestAction = this.action;
        int hashCode2 = this.actions.hashCode() + ((hashCode + (nextBestAction != null ? nextBestAction.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.action = this.action;
        builder.actions = this.actions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        NextBestAction nextBestAction = this.action;
        if (nextBestAction != null) {
            arrayList.add("action=" + nextBestAction);
        }
        if (!this.actions.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("actions=", arrayList, this.actions);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetNextBestActionResponse{", "}", 0, null, null, 56);
    }
}
