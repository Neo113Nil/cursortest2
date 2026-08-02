package com.squareup.protos.cash.deviceintegritly.api;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.badging.api.Badge;
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

/* loaded from: classes.dex */
public final class ValidateAttestationRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ValidateAttestationRequest> CREATOR;
    public final String app_token;
    public final ByteString attestation_result;
    public final String customer_token;
    public final ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation device_attestation;
    public final ByteString device_check_token;
    public final Integer gms_api_status;
    public final String nonce;
    public final Integer safetynet_api_status;

    static {
        ValidateAttestationRequest$Companion$ADAPTER$1 validateAttestationRequest$Companion$ADAPTER$1 = new ValidateAttestationRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ValidateAttestationRequest.class), "type.googleapis.com/squareup.cash.deviceintegritly.api.ValidateAttestationRequest", Syntax.PROTO_2, null, "squareup/cash/deviceintegritly/api/service.proto");
        ADAPTER = validateAttestationRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(validateAttestationRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateAttestationRequest(String str, String str2, String str3, ByteString byteString, Integer num, Integer num2, ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation, ByteString byteString2, ByteString byteString3) {
        super(ADAPTER, byteString3);
        byteString3.getClass();
        this.app_token = str;
        this.customer_token = str2;
        this.nonce = str3;
        this.attestation_result = byteString;
        this.safetynet_api_status = num;
        this.gms_api_status = num2;
        this.device_attestation = validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation;
        this.device_check_token = byteString2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValidateAttestationRequest)) {
            return false;
        }
        ValidateAttestationRequest validateAttestationRequest = (ValidateAttestationRequest) obj;
        return Intrinsics.areEqual(unknownFields(), validateAttestationRequest.unknownFields()) && Intrinsics.areEqual(this.app_token, validateAttestationRequest.app_token) && Intrinsics.areEqual(this.customer_token, validateAttestationRequest.customer_token) && Intrinsics.areEqual(this.nonce, validateAttestationRequest.nonce) && Intrinsics.areEqual(this.attestation_result, validateAttestationRequest.attestation_result) && Intrinsics.areEqual(this.safetynet_api_status, validateAttestationRequest.safetynet_api_status) && Intrinsics.areEqual(this.gms_api_status, validateAttestationRequest.gms_api_status) && Intrinsics.areEqual(this.device_attestation, validateAttestationRequest.device_attestation) && Intrinsics.areEqual(this.device_check_token, validateAttestationRequest.device_check_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.app_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.customer_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.nonce;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        ByteString byteString = this.attestation_result;
        int hashCode5 = (hashCode4 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        Integer num = this.safetynet_api_status;
        int hashCode6 = (hashCode5 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.gms_api_status;
        int hashCode7 = (hashCode6 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation = this.device_attestation;
        int hashCode8 = (hashCode7 + (validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation != null ? validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation.hashCode() : 0)) * 37;
        ByteString byteString2 = this.device_check_token;
        int hashCode9 = hashCode8 + (byteString2 != null ? byteString2.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(19, false);
        builder.external_token = this.app_token;
        builder.customer_token = this.customer_token;
        builder.external_version = this.nonce;
        builder.updated_at = this.attestation_result;
        builder.created_at = this.safetynet_api_status;
        builder.is_badged = this.gms_api_status;
        builder.item_type = this.device_attestation;
        builder.count_groups = this.device_check_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.app_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "app_token=", arrayList);
        }
        String str2 = this.customer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "customer_token=", arrayList);
        }
        if (this.nonce != null) {
            arrayList.add("nonce=██");
        }
        ByteString byteString = this.attestation_result;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("attestation_result=", byteString, arrayList);
        }
        Integer num = this.safetynet_api_status;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("safetynet_api_status=", num, arrayList);
        }
        Integer num2 = this.gms_api_status;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("gms_api_status=", num2, arrayList);
        }
        ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation = this.device_attestation;
        if (validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation != null) {
            arrayList.add("device_attestation=" + validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation);
        }
        if (this.device_check_token != null) {
            arrayList.add("device_check_token=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValidateAttestationRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ ValidateAttestationRequest(String str, String str2, String str3, ValidateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation, int i) {
        this(str, str2, (i & 4) != 0 ? null : str3, null, null, null, validateAttestationRequest$DeviceAttestation$PlayIntegrityAttestation, null, ByteString.EMPTY);
    }
}
