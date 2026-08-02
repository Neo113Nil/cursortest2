package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.common.RequestContext;
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

/* loaded from: classes8.dex */
public final class SubmitLiteRecoveryEmailOtpBlockerRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitLiteRecoveryEmailOtpBlockerRequest> CREATOR;
    public final ClientSignature client_signature;
    public final RequestContext request_context;
    public final String verification_token;

    public final class ClientSignature extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ClientSignature> CREATOR;
        public final String message;
        public final String public_key;
        public final String scheme;
        public final String signature;

        static {
            SubmitLiteRecoveryEmailOtpBlockerRequest$ClientSignature$Companion$ADAPTER$1 submitLiteRecoveryEmailOtpBlockerRequest$ClientSignature$Companion$ADAPTER$1 = new SubmitLiteRecoveryEmailOtpBlockerRequest$ClientSignature$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientSignature.class), "type.googleapis.com/squareup.franklin.app.SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature", Syntax.PROTO_2, null, "squareup/franklin/app/lite_recovery_email_otp.proto");
            ADAPTER = submitLiteRecoveryEmailOtpBlockerRequest$ClientSignature$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(submitLiteRecoveryEmailOtpBlockerRequest$ClientSignature$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientSignature(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.public_key = str;
            this.message = str2;
            this.signature = str3;
            this.scheme = str4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClientSignature)) {
                return false;
            }
            ClientSignature clientSignature = (ClientSignature) obj;
            return Intrinsics.areEqual(unknownFields(), clientSignature.unknownFields()) && Intrinsics.areEqual(this.public_key, clientSignature.public_key) && Intrinsics.areEqual(this.message, clientSignature.message) && Intrinsics.areEqual(this.signature, clientSignature.signature) && Intrinsics.areEqual(this.scheme, clientSignature.scheme);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.public_key;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.message;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.signature;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.scheme;
            int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PoolOwner.Builder builder = new PoolOwner.Builder(18);
            builder.customer_token = this.public_key;
            builder.full_name = this.message;
            builder.profile_photo_url = this.signature;
            builder.cashtag = this.scheme;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.public_key;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "public_key=", arrayList);
            }
            String str2 = this.message;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message=", arrayList);
            }
            if (this.signature != null) {
                arrayList.add("signature=██");
            }
            String str3 = this.scheme;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "scheme=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ClientSignature{", "}", 0, null, null, 56);
        }
    }

    static {
        SubmitLiteRecoveryEmailOtpBlockerRequest$Companion$ADAPTER$1 submitLiteRecoveryEmailOtpBlockerRequest$Companion$ADAPTER$1 = new SubmitLiteRecoveryEmailOtpBlockerRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SubmitLiteRecoveryEmailOtpBlockerRequest.class), "type.googleapis.com/squareup.franklin.app.SubmitLiteRecoveryEmailOtpBlockerRequest", Syntax.PROTO_2, null, "squareup/franklin/app/lite_recovery_email_otp.proto");
        ADAPTER = submitLiteRecoveryEmailOtpBlockerRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(submitLiteRecoveryEmailOtpBlockerRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitLiteRecoveryEmailOtpBlockerRequest(RequestContext requestContext, String str, ClientSignature clientSignature, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.verification_token = str;
        this.client_signature = clientSignature;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitLiteRecoveryEmailOtpBlockerRequest)) {
            return false;
        }
        SubmitLiteRecoveryEmailOtpBlockerRequest submitLiteRecoveryEmailOtpBlockerRequest = (SubmitLiteRecoveryEmailOtpBlockerRequest) obj;
        return Intrinsics.areEqual(unknownFields(), submitLiteRecoveryEmailOtpBlockerRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, submitLiteRecoveryEmailOtpBlockerRequest.request_context) && Intrinsics.areEqual(this.verification_token, submitLiteRecoveryEmailOtpBlockerRequest.verification_token) && Intrinsics.areEqual(this.client_signature, submitLiteRecoveryEmailOtpBlockerRequest.client_signature);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.verification_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        ClientSignature clientSignature = this.client_signature;
        int hashCode4 = hashCode3 + (clientSignature != null ? clientSignature.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(8, false);
        builder.display_info = this.request_context;
        builder.institution_token = this.verification_token;
        builder.help_menu_items = this.client_signature;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.verification_token != null) {
            arrayList.add("verification_token=██");
        }
        ClientSignature clientSignature = this.client_signature;
        if (clientSignature != null) {
            arrayList.add("client_signature=" + clientSignature);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitLiteRecoveryEmailOtpBlockerRequest{", "}", 0, null, null, 56);
    }
}
