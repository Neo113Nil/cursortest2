package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzim;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/ListAppointmentsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalBuyer$Builder;", "Builder", "com/google/android/gms/internal/mlkit_vision_common/zzim", "Success", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListAppointmentsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListAppointmentsResponse> CREATOR;
    public final zzim response;

    public final class Success extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Success> CREATOR;
        public final List appointments;
        public final String cursor;

        static {
            ListAppointmentsResponse$Success$Companion$ADAPTER$1 listAppointmentsResponse$Success$Companion$ADAPTER$1 = new ListAppointmentsResponse$Success$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Success.class), "type.googleapis.com/squareup.cash.local.client.v1.ListAppointmentsResponse.Success", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_appointment.proto");
            ADAPTER = listAppointmentsResponse$Success$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(listAppointmentsResponse$Success$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(List list, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.cursor = str;
            this.appointments = TransactorKt.immutableCopyOf("appointments", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(unknownFields(), success.unknownFields()) && Intrinsics.areEqual(this.appointments, success.appointments) && Intrinsics.areEqual(this.cursor, success.cursor);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.appointments);
            String str = this.cursor;
            int hashCode = m + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ToggleScreen.Builder builder = new ToggleScreen.Builder(20, false);
            builder.sections = this.appointments;
            builder.toggle_title = this.cursor;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.appointments;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("appointments=", arrayList, list);
            }
            String str = this.cursor;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cursor=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Success{", "}", 0, null, null, 56);
        }
    }

    static {
        ListAppointmentsResponse$Companion$ADAPTER$1 listAppointmentsResponse$Companion$ADAPTER$1 = new ListAppointmentsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ListAppointmentsResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.ListAppointmentsResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_appointment.proto");
        ADAPTER = listAppointmentsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(listAppointmentsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListAppointmentsResponse(zzim zzimVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = zzimVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListAppointmentsResponse)) {
            return false;
        }
        ListAppointmentsResponse listAppointmentsResponse = (ListAppointmentsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), listAppointmentsResponse.unknownFields()) && Intrinsics.areEqual(this.response, listAppointmentsResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzim zzimVar = this.response;
        int hashCode2 = hashCode + (zzimVar != null ? zzimVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(7);
        builder.local_buyer = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzim zzimVar = this.response;
        if (zzimVar != null) {
            arrayList.add("response=" + zzimVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListAppointmentsResponse{", "}", 0, null, null, 56);
    }
}
