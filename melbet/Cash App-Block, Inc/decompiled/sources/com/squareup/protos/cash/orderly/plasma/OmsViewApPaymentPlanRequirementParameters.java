package com.squareup.protos.cash.orderly.plasma;

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

/* loaded from: classes7.dex */
public final class OmsViewApPaymentPlanRequirementParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OmsViewApPaymentPlanRequirementParameters> CREATOR;
    public final String loan_id;
    public final String order_id;

    static {
        OmsViewApPaymentPlanRequirementParameters$Companion$ADAPTER$1 omsViewApPaymentPlanRequirementParameters$Companion$ADAPTER$1 = new OmsViewApPaymentPlanRequirementParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OmsViewApPaymentPlanRequirementParameters.class), "type.googleapis.com/squareup.cash.orderly.plasma.OmsViewApPaymentPlanRequirementParameters", Syntax.PROTO_2, null, "squareup/cash/orderly/plasma/oms_view_ap_payment_plan_requirement.proto");
        ADAPTER = omsViewApPaymentPlanRequirementParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(omsViewApPaymentPlanRequirementParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OmsViewApPaymentPlanRequirementParameters(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.order_id = str;
        this.loan_id = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OmsViewApPaymentPlanRequirementParameters)) {
            return false;
        }
        OmsViewApPaymentPlanRequirementParameters omsViewApPaymentPlanRequirementParameters = (OmsViewApPaymentPlanRequirementParameters) obj;
        return Intrinsics.areEqual(unknownFields(), omsViewApPaymentPlanRequirementParameters.unknownFields()) && Intrinsics.areEqual(this.order_id, omsViewApPaymentPlanRequirementParameters.order_id) && Intrinsics.areEqual(this.loan_id, omsViewApPaymentPlanRequirementParameters.loan_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.order_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.loan_id;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Header.Builder builder = new Header.Builder(4);
        builder.name = this.order_id;
        builder.value = this.loan_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.order_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "order_id=", arrayList);
        }
        String str2 = this.loan_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "loan_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OmsViewApPaymentPlanRequirementParameters{", "}", 0, null, null, 56);
    }
}
