package com.squareup.protos.cash.taply.plasma.flows.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.lending.OpaqueRoute;
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
public final class LockPaymentTokenDeviceFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LockPaymentTokenDeviceFlowParameters> CREATOR;
    public final String device_id;

    static {
        LockPaymentTokenDeviceFlowParameters$Companion$ADAPTER$1 lockPaymentTokenDeviceFlowParameters$Companion$ADAPTER$1 = new LockPaymentTokenDeviceFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LockPaymentTokenDeviceFlowParameters.class), "type.googleapis.com/squareup.cash.taply.plasma.flows.v1.LockPaymentTokenDeviceFlowParameters", Syntax.PROTO_2, null, "squareup/cash/taply/plasma/flows/v1/lock_payment_token_device_flow_parameters.proto");
        ADAPTER = lockPaymentTokenDeviceFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(lockPaymentTokenDeviceFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockPaymentTokenDeviceFlowParameters(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.device_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LockPaymentTokenDeviceFlowParameters)) {
            return false;
        }
        LockPaymentTokenDeviceFlowParameters lockPaymentTokenDeviceFlowParameters = (LockPaymentTokenDeviceFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), lockPaymentTokenDeviceFlowParameters.unknownFields()) && Intrinsics.areEqual(this.device_id, lockPaymentTokenDeviceFlowParameters.device_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.device_id;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OpaqueRoute.Builder builder = new OpaqueRoute.Builder(1);
        builder.client_route = this.device_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.device_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "device_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LockPaymentTokenDeviceFlowParameters{", "}", 0, null, null, 56);
    }
}
