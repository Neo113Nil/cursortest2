package com.squareup.protos.cash.taply.app.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.taply.app.v1.LockPaymentTokenDeviceResponse;
import com.squareup.protos.cash.taply.model.v1.PaymentTokenDevice;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/taply/app/v1/UnlockPaymentTokenDeviceResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/taply/app/v1/LockPaymentTokenDeviceResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnlockPaymentTokenDeviceResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UnlockPaymentTokenDeviceResponse> CREATOR;
    public final PaymentTokenDevice payment_token_device;

    static {
        UnlockPaymentTokenDeviceResponse$Companion$ADAPTER$1 unlockPaymentTokenDeviceResponse$Companion$ADAPTER$1 = new UnlockPaymentTokenDeviceResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UnlockPaymentTokenDeviceResponse.class), "type.googleapis.com/squareup.cash.taply.app.v1beta1.UnlockPaymentTokenDeviceResponse", Syntax.PROTO_2, null, "squareup/cash/taply/app/v1beta1/unlock_payment_token_device_app.proto");
        ADAPTER = unlockPaymentTokenDeviceResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(unlockPaymentTokenDeviceResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockPaymentTokenDeviceResponse(PaymentTokenDevice paymentTokenDevice, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payment_token_device = paymentTokenDevice;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnlockPaymentTokenDeviceResponse)) {
            return false;
        }
        UnlockPaymentTokenDeviceResponse unlockPaymentTokenDeviceResponse = (UnlockPaymentTokenDeviceResponse) obj;
        return Intrinsics.areEqual(unknownFields(), unlockPaymentTokenDeviceResponse.unknownFields()) && Intrinsics.areEqual(this.payment_token_device, unlockPaymentTokenDeviceResponse.payment_token_device);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PaymentTokenDevice paymentTokenDevice = this.payment_token_device;
        int hashCode2 = hashCode + (paymentTokenDevice != null ? paymentTokenDevice.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LockPaymentTokenDeviceResponse.Builder builder = new LockPaymentTokenDeviceResponse.Builder(1);
        builder.payment_token_device = this.payment_token_device;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PaymentTokenDevice paymentTokenDevice = this.payment_token_device;
        if (paymentTokenDevice != null) {
            arrayList.add("payment_token_device=" + paymentTokenDevice);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UnlockPaymentTokenDeviceResponse{", "}", 0, null, null, 56);
    }
}
