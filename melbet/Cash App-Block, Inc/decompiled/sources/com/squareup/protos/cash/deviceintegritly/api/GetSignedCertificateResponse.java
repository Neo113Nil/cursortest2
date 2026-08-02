package com.squareup.protos.cash.deviceintegritly.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.SandboxMetadata;
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

/* loaded from: classes7.dex */
public final class GetSignedCertificateResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetSignedCertificateResponse> CREATOR;
    public final List trifle_certificate_chain;

    static {
        GetSignedCertificateResponse$Companion$ADAPTER$1 getSignedCertificateResponse$Companion$ADAPTER$1 = new GetSignedCertificateResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetSignedCertificateResponse.class), "type.googleapis.com/squareup.cash.deviceintegritly.api.public.GetSignedCertificateResponse", Syntax.PROTO_2, null, "squareup/cash/deviceintegritly/api/public/public_service.proto");
        ADAPTER = getSignedCertificateResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getSignedCertificateResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignedCertificateResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.trifle_certificate_chain = TransactorKt.immutableCopyOf("trifle_certificate_chain", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSignedCertificateResponse)) {
            return false;
        }
        GetSignedCertificateResponse getSignedCertificateResponse = (GetSignedCertificateResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getSignedCertificateResponse.unknownFields()) && Intrinsics.areEqual(this.trifle_certificate_chain, getSignedCertificateResponse.trifle_certificate_chain);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.trifle_certificate_chain.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SandboxMetadata.Builder builder = new SandboxMetadata.Builder(7, false);
        builder.scenarios = this.trifle_certificate_chain;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.trifle_certificate_chain;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("trifle_certificate_chain=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSignedCertificateResponse{", "}", 0, null, null, 56);
    }
}
