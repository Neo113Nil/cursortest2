package com.squareup.protos.cash.taply.app.v1;

import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/taply/app/v1/LockPaymentTokenDeviceResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/taply/app/v1/LockPaymentTokenDeviceResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LockPaymentTokenDeviceResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LockPaymentTokenDeviceResponse> CREATOR;
    public final PaymentTokenDevice payment_token_device;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public PaymentTokenDevice payment_token_device;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new LockPaymentTokenDeviceResponse(this.payment_token_device, buildUnknownFields());
                default:
                    return new UnlockPaymentTokenDeviceResponse(this.payment_token_device, buildUnknownFields());
            }
        }
    }

    static {
        LockPaymentTokenDeviceResponse$Companion$ADAPTER$1 lockPaymentTokenDeviceResponse$Companion$ADAPTER$1 = new LockPaymentTokenDeviceResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LockPaymentTokenDeviceResponse.class), "type.googleapis.com/squareup.cash.taply.app.v1beta1.LockPaymentTokenDeviceResponse", Syntax.PROTO_2, null, "squareup/cash/taply/app/v1beta1/lock_payment_token_device_app.proto");
        ADAPTER = lockPaymentTokenDeviceResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(lockPaymentTokenDeviceResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockPaymentTokenDeviceResponse(PaymentTokenDevice paymentTokenDevice, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payment_token_device = paymentTokenDevice;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LockPaymentTokenDeviceResponse)) {
            return false;
        }
        LockPaymentTokenDeviceResponse lockPaymentTokenDeviceResponse = (LockPaymentTokenDeviceResponse) obj;
        return Intrinsics.areEqual(unknownFields(), lockPaymentTokenDeviceResponse.unknownFields()) && Intrinsics.areEqual(this.payment_token_device, lockPaymentTokenDeviceResponse.payment_token_device);
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
        Builder builder = new Builder(0);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "LockPaymentTokenDeviceResponse{", "}", 0, null, null, 56);
    }
}
