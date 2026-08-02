package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.datadog.android.rum.Rum;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/GetAppointmentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/GroupParticipant$Builder;", "Builder", "com/datadog/android/rum/Rum", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetAppointmentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAppointmentResponse> CREATOR;
    public final Rum response;

    static {
        GetAppointmentResponse$Companion$ADAPTER$1 getAppointmentResponse$Companion$ADAPTER$1 = new GetAppointmentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetAppointmentResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.GetAppointmentResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_appointment.proto");
        ADAPTER = getAppointmentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getAppointmentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAppointmentResponse(Rum rum, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = rum;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAppointmentResponse)) {
            return false;
        }
        GetAppointmentResponse getAppointmentResponse = (GetAppointmentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getAppointmentResponse.unknownFields()) && Intrinsics.areEqual(this.response, getAppointmentResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Rum rum = this.response;
        int hashCode2 = hashCode + (rum != null ? rum.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(24);
        builder.f1276type = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Rum rum = this.response;
        if (rum != null) {
            arrayList.add("response=" + rum);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAppointmentResponse{", "}", 0, null, null, 56);
    }
}
