package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import android.os.Parcelable;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningResponseData;
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
public final class AndroidCardData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AndroidCardData> CREATOR;
    public final ByteString encrypted_pan_data;
    public final ByteString encryption_iv;
    public final ByteString hmac_pan;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public ByteString encrypted_pan_data;
        public ByteString encryption_iv;
        public ByteString hmac_pan;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new AndroidCardData(this.encrypted_pan_data, this.encryption_iv, this.hmac_pan, buildUnknownFields());
                default:
                    return new DigitalWalletTokenProvisioningResponseData.ApplePayResponse(this.encrypted_pan_data, this.encryption_iv, this.hmac_pan, buildUnknownFields());
            }
        }
    }

    static {
        AndroidCardData$Companion$ADAPTER$1 androidCardData$Companion$ADAPTER$1 = new AndroidCardData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AndroidCardData.class), "type.googleapis.com/squareup.cash.cashbusinesspayments.api.v1beta1.AndroidCardData", Syntax.PROTO_2, null, "squareup/cash/cashbusinesspayments/api/v1beta1/client_service.proto");
        ADAPTER = androidCardData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(androidCardData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCardData(ByteString byteString, ByteString byteString2, ByteString byteString3, ByteString byteString4) {
        super(ADAPTER, byteString4);
        byteString4.getClass();
        this.encrypted_pan_data = byteString;
        this.encryption_iv = byteString2;
        this.hmac_pan = byteString3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidCardData)) {
            return false;
        }
        AndroidCardData androidCardData = (AndroidCardData) obj;
        return Intrinsics.areEqual(unknownFields(), androidCardData.unknownFields()) && Intrinsics.areEqual(this.encrypted_pan_data, androidCardData.encrypted_pan_data) && Intrinsics.areEqual(this.encryption_iv, androidCardData.encryption_iv) && Intrinsics.areEqual(this.hmac_pan, androidCardData.hmac_pan);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.encrypted_pan_data;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        ByteString byteString2 = this.encryption_iv;
        int hashCode3 = (hashCode2 + (byteString2 != null ? byteString2.hashCode() : 0)) * 37;
        ByteString byteString3 = this.hmac_pan;
        int hashCode4 = hashCode3 + (byteString3 != null ? byteString3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.encrypted_pan_data = this.encrypted_pan_data;
        builder.encryption_iv = this.encryption_iv;
        builder.hmac_pan = this.hmac_pan;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.encrypted_pan_data != null) {
            arrayList.add("encrypted_pan_data=██");
        }
        if (this.encryption_iv != null) {
            arrayList.add("encryption_iv=██");
        }
        if (this.hmac_pan != null) {
            arrayList.add("hmac_pan=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AndroidCardData{", "}", 0, null, null, 56);
    }
}
