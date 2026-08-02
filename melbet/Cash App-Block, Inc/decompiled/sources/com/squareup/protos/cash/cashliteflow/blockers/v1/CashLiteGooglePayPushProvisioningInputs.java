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
public final class CashLiteGooglePayPushProvisioningInputs extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashLiteGooglePayPushProvisioningInputs> CREATOR;
    public final GooglePayPushProvisioningFailureReason failure_reason;
    public final PushProvisioningStatus status;

    static {
        CashLiteGooglePayPushProvisioningInputs$Companion$ADAPTER$1 cashLiteGooglePayPushProvisioningInputs$Companion$ADAPTER$1 = new CashLiteGooglePayPushProvisioningInputs$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashLiteGooglePayPushProvisioningInputs.class), "type.googleapis.com/squareup.cash.cashliteflow.blockers.v1beta1.CashLiteGooglePayPushProvisioningInputs", Syntax.PROTO_2, null, "squareup/cash/cashliteflow/blockers/v1beta1/push_provisioning_blockers.proto");
        ADAPTER = cashLiteGooglePayPushProvisioningInputs$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashLiteGooglePayPushProvisioningInputs$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashLiteGooglePayPushProvisioningInputs(PushProvisioningStatus pushProvisioningStatus, GooglePayPushProvisioningFailureReason googlePayPushProvisioningFailureReason, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = pushProvisioningStatus;
        this.failure_reason = googlePayPushProvisioningFailureReason;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashLiteGooglePayPushProvisioningInputs)) {
            return false;
        }
        CashLiteGooglePayPushProvisioningInputs cashLiteGooglePayPushProvisioningInputs = (CashLiteGooglePayPushProvisioningInputs) obj;
        return Intrinsics.areEqual(unknownFields(), cashLiteGooglePayPushProvisioningInputs.unknownFields()) && this.status == cashLiteGooglePayPushProvisioningInputs.status && this.failure_reason == cashLiteGooglePayPushProvisioningInputs.failure_reason;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PushProvisioningStatus pushProvisioningStatus = this.status;
        int hashCode2 = (hashCode + (pushProvisioningStatus != null ? pushProvisioningStatus.hashCode() : 0)) * 37;
        GooglePayPushProvisioningFailureReason googlePayPushProvisioningFailureReason = this.failure_reason;
        int hashCode3 = hashCode2 + (googlePayPushProvisioningFailureReason != null ? googlePayPushProvisioningFailureReason.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(3);
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
        GooglePayPushProvisioningFailureReason googlePayPushProvisioningFailureReason = this.failure_reason;
        if (googlePayPushProvisioningFailureReason != null) {
            arrayList.add("failure_reason=" + googlePayPushProvisioningFailureReason);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashLiteGooglePayPushProvisioningInputs{", "}", 0, null, null, 56);
    }
}
