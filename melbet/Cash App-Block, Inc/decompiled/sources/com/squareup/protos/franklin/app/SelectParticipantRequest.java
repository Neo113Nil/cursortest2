package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.InviteContactsRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SelectParticipantRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SelectParticipantRequest> CREATOR;
    public final List participants;
    public final RequestContext request_context;

    static {
        SelectParticipantRequest$Companion$ADAPTER$1 selectParticipantRequest$Companion$ADAPTER$1 = new SelectParticipantRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SelectParticipantRequest.class), "type.googleapis.com/squareup.franklin.app.SelectParticipantRequest", Syntax.PROTO_2, null, "squareup/franklin/app/participant.proto");
        ADAPTER = selectParticipantRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(selectParticipantRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectParticipantRequest(RequestContext requestContext, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.participants = TransactorKt.immutableCopyOf("participants", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectParticipantRequest)) {
            return false;
        }
        SelectParticipantRequest selectParticipantRequest = (SelectParticipantRequest) obj;
        return Intrinsics.areEqual(unknownFields(), selectParticipantRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, selectParticipantRequest.request_context) && Intrinsics.areEqual(this.participants, selectParticipantRequest.participants);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = this.participants.hashCode() + ((hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InviteContactsRequest.Builder builder = new InviteContactsRequest.Builder(7);
        builder.request_context = this.request_context;
        builder.email_addresses = this.participants;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        List list = this.participants;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("participants=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectParticipantRequest{", "}", 0, null, null, 56);
    }
}
