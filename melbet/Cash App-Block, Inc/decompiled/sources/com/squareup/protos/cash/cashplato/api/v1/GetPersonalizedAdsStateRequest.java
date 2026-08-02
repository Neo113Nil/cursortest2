package com.squareup.protos.cash.cashplato.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.cashface.api.Activity;
import com.squareup.protos.consentsys.service.CopyParameters;
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
public final class GetPersonalizedAdsStateRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPersonalizedAdsStateRequest> CREATOR;
    public final CopyParameters copy_parameters;

    static {
        GetPersonalizedAdsStateRequest$Companion$ADAPTER$1 getPersonalizedAdsStateRequest$Companion$ADAPTER$1 = new GetPersonalizedAdsStateRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPersonalizedAdsStateRequest.class), "type.googleapis.com/squareup.cash.cashplato.api.v1.GetPersonalizedAdsStateRequest", Syntax.PROTO_2, null, "squareup/cash/cashplato/api/v1/cash_plato_service.proto");
        ADAPTER = getPersonalizedAdsStateRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPersonalizedAdsStateRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPersonalizedAdsStateRequest(CopyParameters copyParameters, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.copy_parameters = copyParameters;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPersonalizedAdsStateRequest)) {
            return false;
        }
        GetPersonalizedAdsStateRequest getPersonalizedAdsStateRequest = (GetPersonalizedAdsStateRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getPersonalizedAdsStateRequest.unknownFields()) && Intrinsics.areEqual(this.copy_parameters, getPersonalizedAdsStateRequest.copy_parameters);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CopyParameters copyParameters = this.copy_parameters;
        int hashCode2 = hashCode + (copyParameters != null ? copyParameters.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(19);
        builder.activity = this.copy_parameters;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CopyParameters copyParameters = this.copy_parameters;
        if (copyParameters != null) {
            arrayList.add("copy_parameters=" + copyParameters);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPersonalizedAdsStateRequest{", "}", 0, null, null, 56);
    }
}
