package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashregistrar.Account;
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
public final class SignedEnvelope extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SignedEnvelope> CREATOR;
    public final String authenticator_data;
    public final String client_data_json;
    public final String credential_id;
    public final String signature;
    public final ByteString signing_envelope;

    static {
        SignedEnvelope$Companion$ADAPTER$1 signedEnvelope$Companion$ADAPTER$1 = new SignedEnvelope$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SignedEnvelope.class), "type.googleapis.com/squareup.cash.cashliteorchestrator.api.v1beta1.SignedEnvelope", Syntax.PROTO_2, null, "squareup/cash/cashliteorchestrator/api/v1beta1/orchestrator.proto");
        ADAPTER = signedEnvelope$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(signedEnvelope$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignedEnvelope(ByteString byteString, String str, String str2, String str3, String str4, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.signing_envelope = byteString;
        this.client_data_json = str;
        this.authenticator_data = str2;
        this.signature = str3;
        this.credential_id = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignedEnvelope)) {
            return false;
        }
        SignedEnvelope signedEnvelope = (SignedEnvelope) obj;
        return Intrinsics.areEqual(unknownFields(), signedEnvelope.unknownFields()) && Intrinsics.areEqual(this.signing_envelope, signedEnvelope.signing_envelope) && Intrinsics.areEqual(this.client_data_json, signedEnvelope.client_data_json) && Intrinsics.areEqual(this.authenticator_data, signedEnvelope.authenticator_data) && Intrinsics.areEqual(this.signature, signedEnvelope.signature) && Intrinsics.areEqual(this.credential_id, signedEnvelope.credential_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.signing_envelope;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str = this.client_data_json;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.authenticator_data;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.signature;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.credential_id;
        int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(13, false);
        builder.account_type = this.signing_envelope;
        builder.customer_token = this.client_data_json;
        builder.account_token = this.authenticator_data;
        builder.display_name = this.signature;
        builder.is_sponsored_account = this.credential_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.signing_envelope;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("signing_envelope=", byteString, arrayList);
        }
        String str = this.client_data_json;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_data_json=", arrayList);
        }
        String str2 = this.authenticator_data;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "authenticator_data=", arrayList);
        }
        String str3 = this.signature;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "signature=", arrayList);
        }
        String str4 = this.credential_id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "credential_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SignedEnvelope{", "}", 0, null, null, 56);
    }
}
