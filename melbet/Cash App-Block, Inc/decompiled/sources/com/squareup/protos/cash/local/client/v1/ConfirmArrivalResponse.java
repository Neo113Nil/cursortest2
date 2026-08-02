package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.datadog.android.core.internal.utils.ByteArrayExtKt;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/ConfirmArrivalResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/GroupParticipant$Builder;", "Builder", "com/datadog/android/core/internal/utils/ByteArrayExtKt", "Success", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConfirmArrivalResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ConfirmArrivalResponse> CREATOR;
    public final ByteArrayExtKt response;

    public final class Success extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Success> CREATOR;
        public final LocalOrder order;

        static {
            ConfirmArrivalResponse$Success$Companion$ADAPTER$1 confirmArrivalResponse$Success$Companion$ADAPTER$1 = new ConfirmArrivalResponse$Success$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Success.class), "type.googleapis.com/squareup.cash.local.client.v1.ConfirmArrivalResponse.Success", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = confirmArrivalResponse$Success$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(confirmArrivalResponse$Success$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(LocalOrder localOrder, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.order = localOrder;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(unknownFields(), success.unknownFields()) && Intrinsics.areEqual(this.order, success.order);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalOrder localOrder = this.order;
            int hashCode2 = hashCode + (localOrder != null ? localOrder.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GroupParticipant.Builder builder = new GroupParticipant.Builder(19);
            builder.f1276type = this.order;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalOrder localOrder = this.order;
            if (localOrder != null) {
                arrayList.add("order=" + localOrder);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Success{", "}", 0, null, null, 56);
        }
    }

    static {
        ConfirmArrivalResponse$Companion$ADAPTER$1 confirmArrivalResponse$Companion$ADAPTER$1 = new ConfirmArrivalResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ConfirmArrivalResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.ConfirmArrivalResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = confirmArrivalResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(confirmArrivalResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmArrivalResponse(ByteArrayExtKt byteArrayExtKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = byteArrayExtKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConfirmArrivalResponse)) {
            return false;
        }
        ConfirmArrivalResponse confirmArrivalResponse = (ConfirmArrivalResponse) obj;
        return Intrinsics.areEqual(unknownFields(), confirmArrivalResponse.unknownFields()) && Intrinsics.areEqual(this.response, confirmArrivalResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteArrayExtKt byteArrayExtKt = this.response;
        int hashCode2 = hashCode + (byteArrayExtKt != null ? byteArrayExtKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(18);
        builder.f1276type = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteArrayExtKt byteArrayExtKt = this.response;
        if (byteArrayExtKt != null) {
            arrayList.add("response=" + byteArrayExtKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmArrivalResponse{", "}", 0, null, null, 56);
    }
}
