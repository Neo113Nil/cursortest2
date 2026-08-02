package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzjc;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.protos.cash.postcard.CopyCardNumber;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/SetOrderLiveActivityTokenResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalBuyer$Builder;", "Builder", "com/google/android/gms/internal/mlkit_vision_common/zzjc", "Success", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetOrderLiveActivityTokenResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetOrderLiveActivityTokenResponse> CREATOR;
    public final zzjc response;

    public final class Success extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Success> CREATOR;

        static {
            SetOrderLiveActivityTokenResponse$Success$Companion$ADAPTER$1 setOrderLiveActivityTokenResponse$Success$Companion$ADAPTER$1 = new SetOrderLiveActivityTokenResponse$Success$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Success.class), "type.googleapis.com/squareup.cash.local.client.v1.SetOrderLiveActivityTokenResponse.Success", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = setOrderLiveActivityTokenResponse$Success$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(setOrderLiveActivityTokenResponse$Success$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(unknownFields(), ((Success) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CopyCardNumber.Builder builder = new CopyCardNumber.Builder(2);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "Success{}";
        }
    }

    static {
        SetOrderLiveActivityTokenResponse$Companion$ADAPTER$1 setOrderLiveActivityTokenResponse$Companion$ADAPTER$1 = new SetOrderLiveActivityTokenResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetOrderLiveActivityTokenResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.SetOrderLiveActivityTokenResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = setOrderLiveActivityTokenResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setOrderLiveActivityTokenResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetOrderLiveActivityTokenResponse(zzjc zzjcVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = zzjcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetOrderLiveActivityTokenResponse)) {
            return false;
        }
        SetOrderLiveActivityTokenResponse setOrderLiveActivityTokenResponse = (SetOrderLiveActivityTokenResponse) obj;
        return Intrinsics.areEqual(unknownFields(), setOrderLiveActivityTokenResponse.unknownFields()) && Intrinsics.areEqual(this.response, setOrderLiveActivityTokenResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzjc zzjcVar = this.response;
        int hashCode2 = hashCode + (zzjcVar != null ? zzjcVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(11);
        builder.local_buyer = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzjc zzjcVar = this.response;
        if (zzjcVar != null) {
            arrayList.add("response=" + zzjcVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetOrderLiveActivityTokenResponse{", "}", 0, null, null, 56);
    }
}
