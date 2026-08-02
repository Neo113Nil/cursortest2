package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzdu;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.AndroidCardData;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.lending.OpaqueRoute;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import okio.internal.ResourceFileSystem;

/* loaded from: classes8.dex */
public final class DigitalWalletTokenProvisioningResponseData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DigitalWalletTokenProvisioningResponseData> CREATOR;
    public final DigitalWalletToken$Issuer digital_wallet_issuer;
    public final zzdu provider_response;
    public final Status status;

    /* loaded from: classes7.dex */
    public final class ApplePayResponse extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ApplePayResponse> CREATOR;
        public final ByteString activation_data;
        public final ByteString encrypted_pass_data;
        public final ByteString ephemeral_public_key;

        static {
            DigitalWalletTokenProvisioningResponseData$ApplePayResponse$Companion$ADAPTER$1 digitalWalletTokenProvisioningResponseData$ApplePayResponse$Companion$ADAPTER$1 = new DigitalWalletTokenProvisioningResponseData$ApplePayResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ApplePayResponse.class), "type.googleapis.com/squareup.franklin.common.DigitalWalletTokenProvisioningResponseData.ApplePayResponse", Syntax.PROTO_2, null, "squareup/franklin/common/digital_wallet_token.proto");
            ADAPTER = digitalWalletTokenProvisioningResponseData$ApplePayResponse$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(digitalWalletTokenProvisioningResponseData$ApplePayResponse$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplePayResponse(ByteString byteString, ByteString byteString2, ByteString byteString3, ByteString byteString4) {
            super(ADAPTER, byteString4);
            byteString4.getClass();
            this.encrypted_pass_data = byteString;
            this.activation_data = byteString2;
            this.ephemeral_public_key = byteString3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ApplePayResponse)) {
                return false;
            }
            ApplePayResponse applePayResponse = (ApplePayResponse) obj;
            return Intrinsics.areEqual(unknownFields(), applePayResponse.unknownFields()) && Intrinsics.areEqual(this.encrypted_pass_data, applePayResponse.encrypted_pass_data) && Intrinsics.areEqual(this.activation_data, applePayResponse.activation_data) && Intrinsics.areEqual(this.ephemeral_public_key, applePayResponse.ephemeral_public_key);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ByteString byteString = this.encrypted_pass_data;
            int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
            ByteString byteString2 = this.activation_data;
            int hashCode3 = (hashCode2 + (byteString2 != null ? byteString2.hashCode() : 0)) * 37;
            ByteString byteString3 = this.ephemeral_public_key;
            int hashCode4 = hashCode3 + (byteString3 != null ? byteString3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            AndroidCardData.Builder builder = new AndroidCardData.Builder(1);
            builder.encrypted_pan_data = this.encrypted_pass_data;
            builder.encryption_iv = this.activation_data;
            builder.hmac_pan = this.ephemeral_public_key;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.encrypted_pass_data != null) {
                arrayList.add("encrypted_pass_data=██");
            }
            if (this.activation_data != null) {
                arrayList.add("activation_data=██");
            }
            if (this.ephemeral_public_key != null) {
                arrayList.add("ephemeral_public_key=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ApplePayResponse{", "}", 0, null, null, 56);
        }
    }

    public final class GooglePayResponse extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<GooglePayResponse> CREATOR;
        public final String opaque_payment_card;

        static {
            DigitalWalletTokenProvisioningResponseData$GooglePayResponse$Companion$ADAPTER$1 digitalWalletTokenProvisioningResponseData$GooglePayResponse$Companion$ADAPTER$1 = new DigitalWalletTokenProvisioningResponseData$GooglePayResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GooglePayResponse.class), "type.googleapis.com/squareup.franklin.common.DigitalWalletTokenProvisioningResponseData.GooglePayResponse", Syntax.PROTO_2, null, "squareup/franklin/common/digital_wallet_token.proto");
            ADAPTER = digitalWalletTokenProvisioningResponseData$GooglePayResponse$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(digitalWalletTokenProvisioningResponseData$GooglePayResponse$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GooglePayResponse(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.opaque_payment_card = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GooglePayResponse)) {
                return false;
            }
            GooglePayResponse googlePayResponse = (GooglePayResponse) obj;
            return Intrinsics.areEqual(unknownFields(), googlePayResponse.unknownFields()) && Intrinsics.areEqual(this.opaque_payment_card, googlePayResponse.opaque_payment_card);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.opaque_payment_card;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            OpaqueRoute.Builder builder = new OpaqueRoute.Builder(18);
            builder.client_route = this.opaque_payment_card;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.opaque_payment_card != null) {
                arrayList.add("opaque_payment_card=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GooglePayResponse{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes.dex */
    public enum Status implements WireEnum {
        SUCCESS(1),
        FAILED(2);

        public final int value;
        public static final ResourceFileSystem.Companion Companion = new ResourceFileSystem.Companion();
        public static final DigitalWalletTokenProvisioningResponseData$Status$Companion$ADAPTER$1 ADAPTER = new DigitalWalletTokenProvisioningResponseData$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, null);

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return SUCCESS;
            }
            if (i != 2) {
                return null;
            }
            return FAILED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        DigitalWalletTokenProvisioningResponseData$Companion$ADAPTER$1 digitalWalletTokenProvisioningResponseData$Companion$ADAPTER$1 = new DigitalWalletTokenProvisioningResponseData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DigitalWalletTokenProvisioningResponseData.class), "type.googleapis.com/squareup.franklin.common.DigitalWalletTokenProvisioningResponseData", Syntax.PROTO_2, null, "squareup/franklin/common/digital_wallet_token.proto");
        ADAPTER = digitalWalletTokenProvisioningResponseData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(digitalWalletTokenProvisioningResponseData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalWalletTokenProvisioningResponseData(DigitalWalletToken$Issuer digitalWalletToken$Issuer, zzdu zzduVar, Status status, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.digital_wallet_issuer = digitalWalletToken$Issuer;
        this.provider_response = zzduVar;
        this.status = status;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DigitalWalletTokenProvisioningResponseData)) {
            return false;
        }
        DigitalWalletTokenProvisioningResponseData digitalWalletTokenProvisioningResponseData = (DigitalWalletTokenProvisioningResponseData) obj;
        return Intrinsics.areEqual(unknownFields(), digitalWalletTokenProvisioningResponseData.unknownFields()) && this.digital_wallet_issuer == digitalWalletTokenProvisioningResponseData.digital_wallet_issuer && Intrinsics.areEqual(this.provider_response, digitalWalletTokenProvisioningResponseData.provider_response) && this.status == digitalWalletTokenProvisioningResponseData.status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DigitalWalletToken$Issuer digitalWalletToken$Issuer = this.digital_wallet_issuer;
        int hashCode2 = (hashCode + (digitalWalletToken$Issuer != null ? digitalWalletToken$Issuer.hashCode() : 0)) * 37;
        zzdu zzduVar = this.provider_response;
        int hashCode3 = (hashCode2 + (zzduVar != null ? zzduVar.hashCode() : 0)) * 37;
        Status status = this.status;
        int hashCode4 = hashCode3 + (status != null ? status.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(15, false);
        builder.institution_token = this.digital_wallet_issuer;
        builder.display_info = this.provider_response;
        builder.help_menu_items = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DigitalWalletToken$Issuer digitalWalletToken$Issuer = this.digital_wallet_issuer;
        if (digitalWalletToken$Issuer != null) {
            arrayList.add("digital_wallet_issuer=" + digitalWalletToken$Issuer);
        }
        zzdu zzduVar = this.provider_response;
        if (zzduVar != null) {
            arrayList.add("provider_response=" + zzduVar);
        }
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DigitalWalletTokenProvisioningResponseData{", "}", 0, null, null, 56);
    }
}
