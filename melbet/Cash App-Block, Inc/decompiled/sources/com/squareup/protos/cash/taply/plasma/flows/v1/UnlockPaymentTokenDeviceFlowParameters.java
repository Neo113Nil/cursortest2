package com.squareup.protos.cash.taply.plasma.flows.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Header;
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
public final class UnlockPaymentTokenDeviceFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UnlockPaymentTokenDeviceFlowParameters> CREATOR;
    public final String device_id;
    public final String passcode_token;

    static {
        UnlockPaymentTokenDeviceFlowParameters$Companion$ADAPTER$1 unlockPaymentTokenDeviceFlowParameters$Companion$ADAPTER$1 = new UnlockPaymentTokenDeviceFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UnlockPaymentTokenDeviceFlowParameters.class), "type.googleapis.com/squareup.cash.taply.plasma.flows.v1.UnlockPaymentTokenDeviceFlowParameters", Syntax.PROTO_2, null, "squareup/cash/taply/plasma/flows/v1/unlock_payment_token_device_flow_parameters.proto");
        ADAPTER = unlockPaymentTokenDeviceFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(unlockPaymentTokenDeviceFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockPaymentTokenDeviceFlowParameters(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.device_id = str;
        this.passcode_token = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnlockPaymentTokenDeviceFlowParameters)) {
            return false;
        }
        UnlockPaymentTokenDeviceFlowParameters unlockPaymentTokenDeviceFlowParameters = (UnlockPaymentTokenDeviceFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), unlockPaymentTokenDeviceFlowParameters.unknownFields()) && Intrinsics.areEqual(this.device_id, unlockPaymentTokenDeviceFlowParameters.device_id) && Intrinsics.areEqual(this.passcode_token, unlockPaymentTokenDeviceFlowParameters.passcode_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.device_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.passcode_token;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Header.Builder builder = new Header.Builder(17);
        builder.name = this.device_id;
        builder.value = this.passcode_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.device_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "device_id=", arrayList);
        }
        if (this.passcode_token != null) {
            arrayList.add("passcode_token=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UnlockPaymentTokenDeviceFlowParameters{", "}", 0, null, null, 56);
    }
}
