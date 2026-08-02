package com.squareup.protos.cash.fiatly.api.v2;

import android.os.Parcelable;
import coil3.intercept.EngineInterceptorKt;
import com.squareup.protos.cash.composer.app.Asset;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetPaymentUpdatesBySessionResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPaymentUpdatesBySessionResponse> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final EngineInterceptorKt f1262type;

    static {
        GetPaymentUpdatesBySessionResponse$Companion$ADAPTER$1 getPaymentUpdatesBySessionResponse$Companion$ADAPTER$1 = new GetPaymentUpdatesBySessionResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPaymentUpdatesBySessionResponse.class), "type.googleapis.com/squareup.cash.fiatly.api.v2beta.GetPaymentUpdatesBySessionResponse", Syntax.PROTO_2, null, "squareup/cash/fiatly/api/v2beta/p2p_real_time_service.proto");
        ADAPTER = getPaymentUpdatesBySessionResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPaymentUpdatesBySessionResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPaymentUpdatesBySessionResponse(EngineInterceptorKt engineInterceptorKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1262type = engineInterceptorKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPaymentUpdatesBySessionResponse)) {
            return false;
        }
        GetPaymentUpdatesBySessionResponse getPaymentUpdatesBySessionResponse = (GetPaymentUpdatesBySessionResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getPaymentUpdatesBySessionResponse.unknownFields()) && Intrinsics.areEqual(this.f1262type, getPaymentUpdatesBySessionResponse.f1262type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EngineInterceptorKt engineInterceptorKt = this.f1262type;
        int hashCode2 = hashCode + (engineInterceptorKt != null ? engineInterceptorKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Asset.Builder builder = new Asset.Builder(20);
        builder.asset_type = this.f1262type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        EngineInterceptorKt engineInterceptorKt = this.f1262type;
        if (engineInterceptorKt != null) {
            arrayList.add("type=" + engineInterceptorKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPaymentUpdatesBySessionResponse{", "}", 0, null, null, 56);
    }
}
