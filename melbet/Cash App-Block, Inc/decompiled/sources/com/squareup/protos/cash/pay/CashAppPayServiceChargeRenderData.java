package com.squareup.protos.cash.pay;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.CreatePoolRequest;
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
public final class CashAppPayServiceChargeRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppPayServiceChargeRenderData> CREATOR;
    public final Money amount_money;
    public final String description;
    public final String name;

    static {
        CashAppPayServiceChargeRenderData$Companion$ADAPTER$1 cashAppPayServiceChargeRenderData$Companion$ADAPTER$1 = new CashAppPayServiceChargeRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppPayServiceChargeRenderData.class), "type.googleapis.com/squareup.cash.pay.CashAppPayServiceChargeRenderData", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_service_charge.proto");
        ADAPTER = cashAppPayServiceChargeRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayServiceChargeRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayServiceChargeRenderData(Money money, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = str;
        this.description = str2;
        this.amount_money = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppPayServiceChargeRenderData)) {
            return false;
        }
        CashAppPayServiceChargeRenderData cashAppPayServiceChargeRenderData = (CashAppPayServiceChargeRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppPayServiceChargeRenderData.unknownFields()) && Intrinsics.areEqual(this.name, cashAppPayServiceChargeRenderData.name) && Intrinsics.areEqual(this.description, cashAppPayServiceChargeRenderData.description) && Intrinsics.areEqual(this.amount_money, cashAppPayServiceChargeRenderData.amount_money);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.amount_money;
        int hashCode4 = hashCode3 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CreatePoolRequest.Builder builder = new CreatePoolRequest.Builder(1);
        builder.pool_name = this.name;
        builder.idempotency_key = this.description;
        builder.goal_amount = this.amount_money;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        Money money = this.amount_money;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount_money=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppPayServiceChargeRenderData{", "}", 0, null, null, 56);
    }
}
