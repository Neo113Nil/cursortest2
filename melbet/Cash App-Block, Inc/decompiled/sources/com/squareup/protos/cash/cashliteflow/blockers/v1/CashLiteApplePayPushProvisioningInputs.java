package com.squareup.protos.cash.cashliteflow.blockers.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.composer.app.Card;
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
public final class CashLiteApplePayPushProvisioningInputs extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashLiteApplePayPushProvisioningInputs> CREATOR;
    public final ApplePayPushProvisioningFailureReason failure_reason;
    public final PushProvisioningStatus status;

    static {
        CashLiteApplePayPushProvisioningInputs$Companion$ADAPTER$1 cashLiteApplePayPushProvisioningInputs$Companion$ADAPTER$1 = new CashLiteApplePayPushProvisioningInputs$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashLiteApplePayPushProvisioningInputs.class), "type.googleapis.com/squareup.cash.cashliteflow.blockers.v1beta1.CashLiteApplePayPushProvisioningInputs", Syntax.PROTO_2, null, "squareup/cash/cashliteflow/blockers/v1beta1/push_provisioning_blockers.proto");
        ADAPTER = cashLiteApplePayPushProvisioningInputs$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashLiteApplePayPushProvisioningInputs$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashLiteApplePayPushProvisioningInputs(PushProvisioningStatus pushProvisioningStatus, ApplePayPushProvisioningFailureReason applePayPushProvisioningFailureReason, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = pushProvisioningStatus;
        this.failure_reason = applePayPushProvisioningFailureReason;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashLiteApplePayPushProvisioningInputs)) {
            return false;
        }
        CashLiteApplePayPushProvisioningInputs cashLiteApplePayPushProvisioningInputs = (CashLiteApplePayPushProvisioningInputs) obj;
        return Intrinsics.areEqual(unknownFields(), cashLiteApplePayPushProvisioningInputs.unknownFields()) && this.status == cashLiteApplePayPushProvisioningInputs.status && this.failure_reason == cashLiteApplePayPushProvisioningInputs.failure_reason;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PushProvisioningStatus pushProvisioningStatus = this.status;
        int hashCode2 = (hashCode + (pushProvisioningStatus != null ? pushProvisioningStatus.hashCode() : 0)) * 37;
        ApplePayPushProvisioningFailureReason applePayPushProvisioningFailureReason = this.failure_reason;
        int hashCode3 = hashCode2 + (applePayPushProvisioningFailureReason != null ? applePayPushProvisioningFailureReason.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(2);
        builder.image_url = this.status;
        builder.asset = this.failure_reason;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PushProvisioningStatus pushProvisioningStatus = this.status;
        if (pushProvisioningStatus != null) {
            arrayList.add("status=" + pushProvisioningStatus);
        }
        ApplePayPushProvisioningFailureReason applePayPushProvisioningFailureReason = this.failure_reason;
        if (applePayPushProvisioningFailureReason != null) {
            arrayList.add("failure_reason=" + applePayPushProvisioningFailureReason);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashLiteApplePayPushProvisioningInputs{", "}", 0, null, null, 56);
    }
}
