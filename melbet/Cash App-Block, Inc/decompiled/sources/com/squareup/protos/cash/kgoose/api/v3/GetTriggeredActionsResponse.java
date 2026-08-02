package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionsResponse$Builder;", "", "next_cursor", "Ljava/lang/String;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredAction;", "triggered_actions", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetTriggeredActionsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetTriggeredActionsResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String next_cursor;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TriggeredAction#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<TriggeredAction> triggered_actions;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionsResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetTriggeredActionsResponse;", "<init>", "()V", "triggered_actions", "", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredAction;", "next_cursor", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String next_cursor;
        public List<TriggeredAction> triggered_actions = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public GetTriggeredActionsResponse build() {
            return new GetTriggeredActionsResponse(this.triggered_actions, this.next_cursor, buildUnknownFields());
        }

        public final Builder next_cursor(String next_cursor) {
            this.next_cursor = next_cursor;
            return this;
        }

        public final Builder triggered_actions(List<TriggeredAction> triggered_actions) {
            triggered_actions.getClass();
            TransactorKt.checkElementsNotNull(triggered_actions);
            this.triggered_actions = triggered_actions;
            return this;
        }
    }

    static {
        GetTriggeredActionsResponse$Companion$ADAPTER$1 getTriggeredActionsResponse$Companion$ADAPTER$1 = new GetTriggeredActionsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetTriggeredActionsResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.GetTriggeredActionsResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = getTriggeredActionsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getTriggeredActionsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTriggeredActionsResponse(List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.next_cursor = str;
        this.triggered_actions = TransactorKt.immutableCopyOf("triggered_actions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetTriggeredActionsResponse)) {
            return false;
        }
        GetTriggeredActionsResponse getTriggeredActionsResponse = (GetTriggeredActionsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getTriggeredActionsResponse.unknownFields()) && Intrinsics.areEqual(this.triggered_actions, getTriggeredActionsResponse.triggered_actions) && Intrinsics.areEqual(this.next_cursor, getTriggeredActionsResponse.next_cursor);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.triggered_actions);
        String str = this.next_cursor;
        int hashCode = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.triggered_actions = this.triggered_actions;
        builder.next_cursor = this.next_cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.triggered_actions.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("triggered_actions=", arrayList, this.triggered_actions);
        }
        String str = this.next_cursor;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "next_cursor=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTriggeredActionsResponse{", "}", 0, null, null, 56);
    }
}
