package com.squareup.protos.cash.deviceintegritly.api;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.LoanOption;
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
public final class GetSignedCertificateRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetSignedCertificateRequest> CREATOR;
    public final String challenge;
    public final GetSignedCertificateRequest$DeviceAssertion$AppAttestAssertion device_assertion;
    public final ByteString trifle_mobile_cert_request;

    static {
        GetSignedCertificateRequest$Companion$ADAPTER$1 getSignedCertificateRequest$Companion$ADAPTER$1 = new GetSignedCertificateRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetSignedCertificateRequest.class), "type.googleapis.com/squareup.cash.deviceintegritly.api.public.GetSignedCertificateRequest", Syntax.PROTO_2, null, "squareup/cash/deviceintegritly/api/public/public_service.proto");
        ADAPTER = getSignedCertificateRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getSignedCertificateRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignedCertificateRequest(ByteString byteString, String str, GetSignedCertificateRequest$DeviceAssertion$AppAttestAssertion getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.trifle_mobile_cert_request = byteString;
        this.challenge = str;
        this.device_assertion = getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSignedCertificateRequest)) {
            return false;
        }
        GetSignedCertificateRequest getSignedCertificateRequest = (GetSignedCertificateRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getSignedCertificateRequest.unknownFields()) && Intrinsics.areEqual(this.trifle_mobile_cert_request, getSignedCertificateRequest.trifle_mobile_cert_request) && Intrinsics.areEqual(this.challenge, getSignedCertificateRequest.challenge) && Intrinsics.areEqual(this.device_assertion, getSignedCertificateRequest.device_assertion);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.trifle_mobile_cert_request;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str = this.challenge;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        GetSignedCertificateRequest$DeviceAssertion$AppAttestAssertion getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion = this.device_assertion;
        int hashCode4 = hashCode3 + (getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion != null ? getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(7);
        builder.loan_type = this.trifle_mobile_cert_request;
        builder.payment_schedule = this.challenge;
        builder.tila_data = this.device_assertion;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.trifle_mobile_cert_request;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("trifle_mobile_cert_request=", byteString, arrayList);
        }
        String str = this.challenge;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "challenge=", arrayList);
        }
        GetSignedCertificateRequest$DeviceAssertion$AppAttestAssertion getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion = this.device_assertion;
        if (getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion != null) {
            arrayList.add("device_assertion=" + getSignedCertificateRequest$DeviceAssertion$AppAttestAssertion);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSignedCertificateRequest{", "}", 0, null, null, 56);
    }
}
