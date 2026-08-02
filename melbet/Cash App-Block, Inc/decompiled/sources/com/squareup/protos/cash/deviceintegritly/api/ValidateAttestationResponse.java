package com.squareup.protos.cash.deviceintegritly.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/deviceintegritly/api/ValidateAttestationResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/moneta/api/v1_0/CashInRequest$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ValidateAttestationResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ValidateAttestationResponse> CREATOR;
    public final Boolean basic_integrity_passed;
    public final Long completed_at;
    public final Long created_at;
    public final Boolean cts_profile_match;
    public final String evaluation_type;
    public final Boolean is_nonce_valid;
    public final Boolean is_public_release;
    public final Boolean is_signature_valid;
    public final PlayIntegrityVerdict play_integrity_verdict;
    public final String result_code;

    static {
        ValidateAttestationResponse$Companion$ADAPTER$1 validateAttestationResponse$Companion$ADAPTER$1 = new ValidateAttestationResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ValidateAttestationResponse.class), "type.googleapis.com/squareup.cash.deviceintegritly.api.ValidateAttestationResponse", Syntax.PROTO_2, null, "squareup/cash/deviceintegritly/api/service.proto");
        ADAPTER = validateAttestationResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(validateAttestationResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateAttestationResponse(Long l, Long l2, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2, PlayIntegrityVerdict playIntegrityVerdict, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.created_at = l;
        this.completed_at = l2;
        this.result_code = str;
        this.is_nonce_valid = bool;
        this.is_public_release = bool2;
        this.is_signature_valid = bool3;
        this.cts_profile_match = bool4;
        this.basic_integrity_passed = bool5;
        this.evaluation_type = str2;
        this.play_integrity_verdict = playIntegrityVerdict;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValidateAttestationResponse)) {
            return false;
        }
        ValidateAttestationResponse validateAttestationResponse = (ValidateAttestationResponse) obj;
        return Intrinsics.areEqual(unknownFields(), validateAttestationResponse.unknownFields()) && Intrinsics.areEqual(this.created_at, validateAttestationResponse.created_at) && Intrinsics.areEqual(this.completed_at, validateAttestationResponse.completed_at) && Intrinsics.areEqual(this.result_code, validateAttestationResponse.result_code) && Intrinsics.areEqual(this.is_nonce_valid, validateAttestationResponse.is_nonce_valid) && Intrinsics.areEqual(this.is_public_release, validateAttestationResponse.is_public_release) && Intrinsics.areEqual(this.is_signature_valid, validateAttestationResponse.is_signature_valid) && Intrinsics.areEqual(this.cts_profile_match, validateAttestationResponse.cts_profile_match) && Intrinsics.areEqual(this.basic_integrity_passed, validateAttestationResponse.basic_integrity_passed) && Intrinsics.areEqual(this.evaluation_type, validateAttestationResponse.evaluation_type) && Intrinsics.areEqual(this.play_integrity_verdict, validateAttestationResponse.play_integrity_verdict);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.created_at;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.completed_at;
        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str = this.result_code;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.is_nonce_valid;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.is_public_release;
        int hashCode6 = (hashCode5 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.is_signature_valid;
        int hashCode7 = (hashCode6 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Boolean bool4 = this.cts_profile_match;
        int hashCode8 = (hashCode7 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        Boolean bool5 = this.basic_integrity_passed;
        int hashCode9 = (hashCode8 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        String str2 = this.evaluation_type;
        int hashCode10 = (hashCode9 + (str2 != null ? str2.hashCode() : 0)) * 37;
        PlayIntegrityVerdict playIntegrityVerdict = this.play_integrity_verdict;
        int hashCode11 = hashCode10 + (playIntegrityVerdict != null ? playIntegrityVerdict.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashInRequest.Builder builder = new CashInRequest.Builder(4);
        builder.request_context = this.created_at;
        builder.external_client_transfer_token = this.completed_at;
        builder.external_id = this.result_code;
        builder.source = this.is_nonce_valid;
        builder.target = this.is_public_release;
        builder.amount = this.is_signature_valid;
        builder.call_context = this.cts_profile_match;
        builder.forwarded_call_context = this.basic_integrity_passed;
        builder.passcode_token = this.evaluation_type;
        builder.client_verified_digital_wallet = this.play_integrity_verdict;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        Long l2 = this.completed_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("completed_at=", l2, arrayList);
        }
        String str = this.result_code;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "result_code=", arrayList);
        }
        Boolean bool = this.is_nonce_valid;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_nonce_valid=", bool, arrayList);
        }
        Boolean bool2 = this.is_public_release;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_public_release=", bool2, arrayList);
        }
        Boolean bool3 = this.is_signature_valid;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_signature_valid=", bool3, arrayList);
        }
        Boolean bool4 = this.cts_profile_match;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("cts_profile_match=", bool4, arrayList);
        }
        Boolean bool5 = this.basic_integrity_passed;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("basic_integrity_passed=", bool5, arrayList);
        }
        String str2 = this.evaluation_type;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "evaluation_type=", arrayList);
        }
        PlayIntegrityVerdict playIntegrityVerdict = this.play_integrity_verdict;
        if (playIntegrityVerdict != null) {
            arrayList.add("play_integrity_verdict=" + playIntegrityVerdict);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValidateAttestationResponse{", "}", 0, null, null, 56);
    }
}
