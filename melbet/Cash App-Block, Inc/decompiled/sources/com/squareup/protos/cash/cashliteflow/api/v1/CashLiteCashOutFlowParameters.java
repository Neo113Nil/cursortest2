package com.squareup.protos.cash.cashliteflow.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
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
public final class CashLiteCashOutFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashLiteCashOutFlowParameters> CREATOR;
    public final Money customer_supplied_amount;
    public final String external_id;

    /* renamed from: type, reason: collision with root package name */
    public final CashOutType f1250type;

    static {
        CashLiteCashOutFlowParameters$Companion$ADAPTER$1 cashLiteCashOutFlowParameters$Companion$ADAPTER$1 = new CashLiteCashOutFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashLiteCashOutFlowParameters.class), "type.googleapis.com/squareup.cash.cashliteflow.api.v1beta1.CashLiteCashOutFlowParameters", Syntax.PROTO_2, null, "squareup/cash/cashliteflow/api/v1beta1/cash_out.proto");
        ADAPTER = cashLiteCashOutFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashLiteCashOutFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashLiteCashOutFlowParameters(String str, Money money, CashOutType cashOutType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.external_id = str;
        this.customer_supplied_amount = money;
        this.f1250type = cashOutType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashLiteCashOutFlowParameters)) {
            return false;
        }
        CashLiteCashOutFlowParameters cashLiteCashOutFlowParameters = (CashLiteCashOutFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), cashLiteCashOutFlowParameters.unknownFields()) && Intrinsics.areEqual(this.external_id, cashLiteCashOutFlowParameters.external_id) && Intrinsics.areEqual(this.customer_supplied_amount, cashLiteCashOutFlowParameters.customer_supplied_amount) && this.f1250type == cashLiteCashOutFlowParameters.f1250type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.external_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.customer_supplied_amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        CashOutType cashOutType = this.f1250type;
        int hashCode4 = hashCode3 + (cashOutType != null ? cashOutType.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder(11);
        builder.title = this.external_id;
        builder.subtitle = this.customer_supplied_amount;
        builder.action = this.f1250type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.external_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "external_id=", arrayList);
        }
        Money money = this.customer_supplied_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("customer_supplied_amount=", money, arrayList);
        }
        CashOutType cashOutType = this.f1250type;
        if (cashOutType != null) {
            arrayList.add("type=" + cashOutType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashLiteCashOutFlowParameters{", "}", 0, null, null, 56);
    }
}
