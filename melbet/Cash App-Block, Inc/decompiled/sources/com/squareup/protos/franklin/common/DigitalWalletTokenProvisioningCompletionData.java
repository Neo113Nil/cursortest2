package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.protos.hieroglyph.KeyScope;
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

/* loaded from: classes8.dex */
public final class DigitalWalletTokenProvisioningCompletionData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DigitalWalletTokenProvisioningCompletionData> CREATOR;
    public final DigitalWalletToken$Issuer digital_wallet_issuer;
    public final ProvisioningResult provisioning_result;

    public enum ProvisioningResult implements WireEnum {
        SUCCESS(1),
        USER_CANCELED(2),
        UNKNOWN_ERROR(3),
        INVALID_DATA_ERROR(4),
        UNSUPPORTED_VERSION_ERROR(5),
        INVALID_SIGNATURE(6),
        NOT_ENTITLED_ERROR(7),
        ACTIVATION_FAILED(8),
        PARTIAL_ACTIVATION(9),
        NO_ACTIVE_WALLET(10),
        TOKEN_NOT_FOUND(11),
        INVALID_TOKEN_STATE(12),
        ATTESTATION_ERROR(13),
        TAP_AND_PAY_UNAVAILABLE(14);

        public final int value;
        public static final KeyScope.Companion Companion = new KeyScope.Companion();
        public static final DigitalWalletTokenProvisioningCompletionData$ProvisioningResult$Companion$ADAPTER$1 ADAPTER = new DigitalWalletTokenProvisioningCompletionData$ProvisioningResult$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ProvisioningResult.class), Syntax.PROTO_2, null);

        ProvisioningResult(int i) {
            this.value = i;
        }

        public static final ProvisioningResult fromValue(int i) {
            Companion.getClass();
            return KeyScope.Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        DigitalWalletTokenProvisioningCompletionData$Companion$ADAPTER$1 digitalWalletTokenProvisioningCompletionData$Companion$ADAPTER$1 = new DigitalWalletTokenProvisioningCompletionData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DigitalWalletTokenProvisioningCompletionData.class), "type.googleapis.com/squareup.franklin.common.DigitalWalletTokenProvisioningCompletionData", Syntax.PROTO_2, null, "squareup/franklin/common/digital_wallet_token.proto");
        ADAPTER = digitalWalletTokenProvisioningCompletionData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(digitalWalletTokenProvisioningCompletionData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalWalletTokenProvisioningCompletionData(DigitalWalletToken$Issuer digitalWalletToken$Issuer, ProvisioningResult provisioningResult, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.digital_wallet_issuer = digitalWalletToken$Issuer;
        this.provisioning_result = provisioningResult;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DigitalWalletTokenProvisioningCompletionData)) {
            return false;
        }
        DigitalWalletTokenProvisioningCompletionData digitalWalletTokenProvisioningCompletionData = (DigitalWalletTokenProvisioningCompletionData) obj;
        return Intrinsics.areEqual(unknownFields(), digitalWalletTokenProvisioningCompletionData.unknownFields()) && this.digital_wallet_issuer == digitalWalletTokenProvisioningCompletionData.digital_wallet_issuer && this.provisioning_result == digitalWalletTokenProvisioningCompletionData.provisioning_result;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DigitalWalletToken$Issuer digitalWalletToken$Issuer = this.digital_wallet_issuer;
        int hashCode2 = (hashCode + (digitalWalletToken$Issuer != null ? digitalWalletToken$Issuer.hashCode() : 0)) * 37;
        ProvisioningResult provisioningResult = this.provisioning_result;
        int hashCode3 = hashCode2 + (provisioningResult != null ? provisioningResult.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(6);
        builder.f1372android = this.digital_wallet_issuer;
        builder.ios = this.provisioning_result;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DigitalWalletToken$Issuer digitalWalletToken$Issuer = this.digital_wallet_issuer;
        if (digitalWalletToken$Issuer != null) {
            arrayList.add("digital_wallet_issuer=" + digitalWalletToken$Issuer);
        }
        ProvisioningResult provisioningResult = this.provisioning_result;
        if (provisioningResult != null) {
            arrayList.add("provisioning_result=" + provisioningResult);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DigitalWalletTokenProvisioningCompletionData{", "}", 0, null, null, 56);
    }

    public /* synthetic */ DigitalWalletTokenProvisioningCompletionData(ProvisioningResult provisioningResult) {
        this(DigitalWalletToken$Issuer.ANDROID_PAY, provisioningResult, ByteString.EMPTY);
    }
}
