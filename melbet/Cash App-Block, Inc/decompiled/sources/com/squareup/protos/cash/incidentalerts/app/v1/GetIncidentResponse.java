package com.squareup.protos.cash.incidentalerts.app.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/incidentalerts/app/v1/GetIncidentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/GroupParticipant$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetIncidentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetIncidentResponse> CREATOR;
    public final Incident incident;

    static {
        GetIncidentResponse$Companion$ADAPTER$1 getIncidentResponse$Companion$ADAPTER$1 = new GetIncidentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetIncidentResponse.class), "type.googleapis.com/squareup.cash.incidentalerts.app.v1.GetIncidentResponse", Syntax.PROTO_2, null, "squareup/cash/incidentalerts/app/v1/app.proto");
        ADAPTER = getIncidentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getIncidentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetIncidentResponse(Incident incident, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.incident = incident;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetIncidentResponse)) {
            return false;
        }
        GetIncidentResponse getIncidentResponse = (GetIncidentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getIncidentResponse.unknownFields()) && Intrinsics.areEqual(this.incident, getIncidentResponse.incident);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Incident incident = this.incident;
        int hashCode2 = hashCode + (incident != null ? incident.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(2);
        builder.f1276type = this.incident;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Incident incident = this.incident;
        if (incident != null) {
            arrayList.add("incident=" + incident);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetIncidentResponse{", "}", 0, null, null, 56);
    }
}
