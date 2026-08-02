package com.squareup.protos.cash.nearby.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.local.client.v1.InputValue;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/nearby/api/v1/GetNearbySessionResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/InputValue$Builder;", "Builder", "ErrorCode", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetNearbySessionResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetNearbySessionResponse> CREATOR;
    public final ErrorCode error_code;
    public final NearbySession nearby_session;

    public enum ErrorCode implements WireEnum {
        ERROR_CODE_UNSPECIFIED(0),
        ERROR_CODE_SESSION_NOT_FOUND(1),
        ERROR_CODE_INVALID_UUID_FORMAT(2);

        public static final GetNearbySessionResponse$ErrorCode$Companion$ADAPTER$1 ADAPTER;
        public static final Origin.Companion Companion;
        public final int value;

        static {
            ErrorCode errorCode = ERROR_CODE_UNSPECIFIED;
            Companion = new Origin.Companion();
            ADAPTER = new GetNearbySessionResponse$ErrorCode$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ErrorCode.class), Syntax.PROTO_2, errorCode);
        }

        ErrorCode(int i) {
            this.value = i;
        }

        public static final ErrorCode fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return ERROR_CODE_UNSPECIFIED;
            }
            if (i == 1) {
                return ERROR_CODE_SESSION_NOT_FOUND;
            }
            if (i != 2) {
                return null;
            }
            return ERROR_CODE_INVALID_UUID_FORMAT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        GetNearbySessionResponse$Companion$ADAPTER$1 getNearbySessionResponse$Companion$ADAPTER$1 = new GetNearbySessionResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetNearbySessionResponse.class), "type.googleapis.com/squareup.cash.nearby.api.v1beta1.GetNearbySessionResponse", Syntax.PROTO_2, null, "squareup/cash/nearby/api/v1beta1/endpoint_get_nearby_session.proto");
        ADAPTER = getNearbySessionResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getNearbySessionResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetNearbySessionResponse(NearbySession nearbySession, ErrorCode errorCode, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.nearby_session = nearbySession;
        this.error_code = errorCode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetNearbySessionResponse)) {
            return false;
        }
        GetNearbySessionResponse getNearbySessionResponse = (GetNearbySessionResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getNearbySessionResponse.unknownFields()) && Intrinsics.areEqual(this.nearby_session, getNearbySessionResponse.nearby_session) && this.error_code == getNearbySessionResponse.error_code;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        NearbySession nearbySession = this.nearby_session;
        int hashCode2 = (hashCode + (nearbySession != null ? nearbySession.hashCode() : 0)) * 37;
        ErrorCode errorCode = this.error_code;
        int hashCode3 = hashCode2 + (errorCode != null ? errorCode.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InputValue.Builder builder = new InputValue.Builder(29);
        builder.input_id = this.nearby_session;
        builder.value = this.error_code;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        NearbySession nearbySession = this.nearby_session;
        if (nearbySession != null) {
            arrayList.add("nearby_session=" + nearbySession);
        }
        ErrorCode errorCode = this.error_code;
        if (errorCode != null) {
            arrayList.add("error_code=" + errorCode);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetNearbySessionResponse{", "}", 0, null, null, 56);
    }
}
