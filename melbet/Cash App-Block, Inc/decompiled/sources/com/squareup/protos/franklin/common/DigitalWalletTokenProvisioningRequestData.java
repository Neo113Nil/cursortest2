package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import app.cash.trifle.protos.api.alpha.SignedData;
import com.google.android.gms.internal.mlkit_vision_face.zzdt;
import com.squareup.protos.franklin.common.AppLinks;
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
import xyz.block.protos.genie.IdValue;

/* loaded from: classes8.dex */
public final class DigitalWalletTokenProvisioningRequestData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DigitalWalletTokenProvisioningRequestData> CREATOR;
    public final DigitalWalletToken$Issuer digital_wallet_issuer;
    public final zzdt provider_request;

    public final class ApplePayRequest extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ApplePayRequest> CREATOR;
        public final List certificates;
        public final ByteString nonce;
        public final ByteString nonce_signature;

        static {
            DigitalWalletTokenProvisioningRequestData$ApplePayRequest$Companion$ADAPTER$1 digitalWalletTokenProvisioningRequestData$ApplePayRequest$Companion$ADAPTER$1 = new DigitalWalletTokenProvisioningRequestData$ApplePayRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ApplePayRequest.class), "type.googleapis.com/squareup.franklin.common.DigitalWalletTokenProvisioningRequestData.ApplePayRequest", Syntax.PROTO_2, null, "squareup/franklin/common/digital_wallet_token.proto");
            ADAPTER = digitalWalletTokenProvisioningRequestData$ApplePayRequest$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(digitalWalletTokenProvisioningRequestData$ApplePayRequest$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplePayRequest(List list, ByteString byteString, ByteString byteString2, ByteString byteString3) {
            super(ADAPTER, byteString3);
            list.getClass();
            byteString3.getClass();
            this.nonce = byteString;
            this.nonce_signature = byteString2;
            this.certificates = TransactorKt.immutableCopyOf("certificates", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ApplePayRequest)) {
                return false;
            }
            ApplePayRequest applePayRequest = (ApplePayRequest) obj;
            return Intrinsics.areEqual(unknownFields(), applePayRequest.unknownFields()) && Intrinsics.areEqual(this.certificates, applePayRequest.certificates) && Intrinsics.areEqual(this.nonce, applePayRequest.nonce) && Intrinsics.areEqual(this.nonce_signature, applePayRequest.nonce_signature);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.certificates);
            ByteString byteString = this.nonce;
            int hashCode = (m + (byteString != null ? byteString.hashCode() : 0)) * 37;
            ByteString byteString2 = this.nonce_signature;
            int hashCode2 = hashCode + (byteString2 != null ? byteString2.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SignedData.Builder builder = new SignedData.Builder(1);
            builder.certificates = this.certificates;
            builder.enveloped_data = this.nonce;
            builder.signature = this.nonce_signature;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.certificates.isEmpty()) {
                arrayList.add("certificates=██");
            }
            if (this.nonce != null) {
                arrayList.add("nonce=██");
            }
            if (this.nonce_signature != null) {
                arrayList.add("nonce_signature=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ApplePayRequest{", "}", 0, null, null, 56);
        }
    }

    public final class GooglePayRequest extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<GooglePayRequest> CREATOR;
        public final String device_id;
        public final String wallet_account_id;

        static {
            DigitalWalletTokenProvisioningRequestData$GooglePayRequest$Companion$ADAPTER$1 digitalWalletTokenProvisioningRequestData$GooglePayRequest$Companion$ADAPTER$1 = new DigitalWalletTokenProvisioningRequestData$GooglePayRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GooglePayRequest.class), "type.googleapis.com/squareup.franklin.common.DigitalWalletTokenProvisioningRequestData.GooglePayRequest", Syntax.PROTO_2, null, "squareup/franklin/common/digital_wallet_token.proto");
            ADAPTER = digitalWalletTokenProvisioningRequestData$GooglePayRequest$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(digitalWalletTokenProvisioningRequestData$GooglePayRequest$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GooglePayRequest(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.wallet_account_id = str;
            this.device_id = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GooglePayRequest)) {
                return false;
            }
            GooglePayRequest googlePayRequest = (GooglePayRequest) obj;
            return Intrinsics.areEqual(unknownFields(), googlePayRequest.unknownFields()) && Intrinsics.areEqual(this.wallet_account_id, googlePayRequest.wallet_account_id) && Intrinsics.areEqual(this.device_id, googlePayRequest.device_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.wallet_account_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.device_id;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            IdValue.Builder builder = new IdValue.Builder(4);
            builder.server = this.wallet_account_id;
            builder.local = this.device_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.wallet_account_id != null) {
                arrayList.add("wallet_account_id=██");
            }
            if (this.device_id != null) {
                arrayList.add("device_id=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GooglePayRequest{", "}", 0, null, null, 56);
        }
    }

    static {
        DigitalWalletTokenProvisioningRequestData$Companion$ADAPTER$1 digitalWalletTokenProvisioningRequestData$Companion$ADAPTER$1 = new DigitalWalletTokenProvisioningRequestData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DigitalWalletTokenProvisioningRequestData.class), "type.googleapis.com/squareup.franklin.common.DigitalWalletTokenProvisioningRequestData", Syntax.PROTO_2, null, "squareup/franklin/common/digital_wallet_token.proto");
        ADAPTER = digitalWalletTokenProvisioningRequestData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(digitalWalletTokenProvisioningRequestData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalWalletTokenProvisioningRequestData(DigitalWalletToken$Issuer digitalWalletToken$Issuer, zzdt zzdtVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.digital_wallet_issuer = digitalWalletToken$Issuer;
        this.provider_request = zzdtVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DigitalWalletTokenProvisioningRequestData)) {
            return false;
        }
        DigitalWalletTokenProvisioningRequestData digitalWalletTokenProvisioningRequestData = (DigitalWalletTokenProvisioningRequestData) obj;
        return Intrinsics.areEqual(unknownFields(), digitalWalletTokenProvisioningRequestData.unknownFields()) && this.digital_wallet_issuer == digitalWalletTokenProvisioningRequestData.digital_wallet_issuer && Intrinsics.areEqual(this.provider_request, digitalWalletTokenProvisioningRequestData.provider_request);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DigitalWalletToken$Issuer digitalWalletToken$Issuer = this.digital_wallet_issuer;
        int hashCode2 = (hashCode + (digitalWalletToken$Issuer != null ? digitalWalletToken$Issuer.hashCode() : 0)) * 37;
        zzdt zzdtVar = this.provider_request;
        int hashCode3 = hashCode2 + (zzdtVar != null ? zzdtVar.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(7);
        builder.f1372android = this.digital_wallet_issuer;
        builder.ios = this.provider_request;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DigitalWalletToken$Issuer digitalWalletToken$Issuer = this.digital_wallet_issuer;
        if (digitalWalletToken$Issuer != null) {
            arrayList.add("digital_wallet_issuer=" + digitalWalletToken$Issuer);
        }
        zzdt zzdtVar = this.provider_request;
        if (zzdtVar != null) {
            arrayList.add("provider_request=" + zzdtVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DigitalWalletTokenProvisioningRequestData{", "}", 0, null, null, 56);
    }
}
