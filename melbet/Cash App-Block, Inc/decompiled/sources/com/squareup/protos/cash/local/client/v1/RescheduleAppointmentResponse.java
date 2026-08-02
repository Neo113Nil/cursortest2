package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzjb;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/RescheduleAppointmentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalBuyer$Builder;", "Builder", "com/google/android/gms/internal/mlkit_vision_common/zzjb", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RescheduleAppointmentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RescheduleAppointmentResponse> CREATOR;
    public final zzjb response;

    static {
        RescheduleAppointmentResponse$Companion$ADAPTER$1 rescheduleAppointmentResponse$Companion$ADAPTER$1 = new RescheduleAppointmentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RescheduleAppointmentResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.RescheduleAppointmentResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_appointment.proto");
        ADAPTER = rescheduleAppointmentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(rescheduleAppointmentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RescheduleAppointmentResponse(zzjb zzjbVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = zzjbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RescheduleAppointmentResponse)) {
            return false;
        }
        RescheduleAppointmentResponse rescheduleAppointmentResponse = (RescheduleAppointmentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), rescheduleAppointmentResponse.unknownFields()) && Intrinsics.areEqual(this.response, rescheduleAppointmentResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzjb zzjbVar = this.response;
        int hashCode2 = hashCode + (zzjbVar != null ? zzjbVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(10);
        builder.local_buyer = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzjb zzjbVar = this.response;
        if (zzjbVar != null) {
            arrayList.add("response=" + zzjbVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RescheduleAppointmentResponse{", "}", 0, null, null, 56);
    }
}
