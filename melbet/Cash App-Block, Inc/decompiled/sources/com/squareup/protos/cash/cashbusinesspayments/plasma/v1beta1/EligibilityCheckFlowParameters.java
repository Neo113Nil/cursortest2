package com.squareup.protos.cash.cashbusinesspayments.plasma.v1beta1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.common.Money;
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
public final class EligibilityCheckFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EligibilityCheckFlowParameters> CREATOR;
    public final String idempotency_token;
    public final Money payment_amount;
    public final SignedSerializedMRIContext signed_mri_context;

    static {
        EligibilityCheckFlowParameters$Companion$ADAPTER$1 eligibilityCheckFlowParameters$Companion$ADAPTER$1 = new EligibilityCheckFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EligibilityCheckFlowParameters.class), "type.googleapis.com/squareup.cash.cashbusinesspayments.plasma.v1beta1.EligibilityCheckFlowParameters", Syntax.PROTO_2, null, "squareup/cash/cashbusinesspayments/plasma/v1beta1/eligibility_check_flow.proto");
        ADAPTER = eligibilityCheckFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(eligibilityCheckFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EligibilityCheckFlowParameters(String str, Money money, SignedSerializedMRIContext signedSerializedMRIContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.idempotency_token = str;
        this.payment_amount = money;
        this.signed_mri_context = signedSerializedMRIContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EligibilityCheckFlowParameters)) {
            return false;
        }
        EligibilityCheckFlowParameters eligibilityCheckFlowParameters = (EligibilityCheckFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), eligibilityCheckFlowParameters.unknownFields()) && Intrinsics.areEqual(this.idempotency_token, eligibilityCheckFlowParameters.idempotency_token) && Intrinsics.areEqual(this.payment_amount, eligibilityCheckFlowParameters.payment_amount) && Intrinsics.areEqual(this.signed_mri_context, eligibilityCheckFlowParameters.signed_mri_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.idempotency_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.payment_amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        SignedSerializedMRIContext signedSerializedMRIContext = this.signed_mri_context;
        int hashCode4 = hashCode3 + (signedSerializedMRIContext != null ? signedSerializedMRIContext.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder(2);
        builder.title = this.idempotency_token;
        builder.subtitle = this.payment_amount;
        builder.action = this.signed_mri_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.idempotency_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "idempotency_token=", arrayList);
        }
        Money money = this.payment_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("payment_amount=", money, arrayList);
        }
        SignedSerializedMRIContext signedSerializedMRIContext = this.signed_mri_context;
        if (signedSerializedMRIContext != null) {
            arrayList.add("signed_mri_context=" + signedSerializedMRIContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EligibilityCheckFlowParameters{", "}", 0, null, null, 56);
    }
}
