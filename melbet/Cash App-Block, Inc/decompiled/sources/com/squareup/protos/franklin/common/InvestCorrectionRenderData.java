package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Transfer;
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
public final class InvestCorrectionRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvestCorrectionRenderData> CREATOR;
    public final Money amount;
    public final String investment_entity_token;
    public final String original_payment_token;
    public final Money original_share_price;
    public final Money original_total_cost;
    public final Long settlement_date;
    public final String symbol_display_name;
    public final Money updated_share_price;
    public final Money updated_total_cost;

    static {
        InvestCorrectionRenderData$Companion$ADAPTER$1 investCorrectionRenderData$Companion$ADAPTER$1 = new InvestCorrectionRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InvestCorrectionRenderData.class), "type.googleapis.com/squareup.franklin.InvestCorrectionRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = investCorrectionRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(investCorrectionRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestCorrectionRenderData(String str, String str2, Money money, Money money2, Money money3, Money money4, Money money5, Long l, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.symbol_display_name = str;
        this.original_payment_token = str2;
        this.original_share_price = money;
        this.updated_share_price = money2;
        this.original_total_cost = money3;
        this.updated_total_cost = money4;
        this.amount = money5;
        this.settlement_date = l;
        this.investment_entity_token = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvestCorrectionRenderData)) {
            return false;
        }
        InvestCorrectionRenderData investCorrectionRenderData = (InvestCorrectionRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), investCorrectionRenderData.unknownFields()) && Intrinsics.areEqual(this.symbol_display_name, investCorrectionRenderData.symbol_display_name) && Intrinsics.areEqual(this.original_payment_token, investCorrectionRenderData.original_payment_token) && Intrinsics.areEqual(this.original_share_price, investCorrectionRenderData.original_share_price) && Intrinsics.areEqual(this.updated_share_price, investCorrectionRenderData.updated_share_price) && Intrinsics.areEqual(this.original_total_cost, investCorrectionRenderData.original_total_cost) && Intrinsics.areEqual(this.updated_total_cost, investCorrectionRenderData.updated_total_cost) && Intrinsics.areEqual(this.amount, investCorrectionRenderData.amount) && Intrinsics.areEqual(this.settlement_date, investCorrectionRenderData.settlement_date) && Intrinsics.areEqual(this.investment_entity_token, investCorrectionRenderData.investment_entity_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.symbol_display_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.original_payment_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.original_share_price;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.updated_share_price;
        int hashCode5 = (hashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.original_total_cost;
        int hashCode6 = (hashCode5 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.updated_total_cost;
        int hashCode7 = (hashCode6 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.amount;
        int hashCode8 = (hashCode7 + (money5 != null ? money5.hashCode() : 0)) * 37;
        Long l = this.settlement_date;
        int hashCode9 = (hashCode8 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str3 = this.investment_entity_token;
        int hashCode10 = hashCode9 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Transfer.Builder builder = new Transfer.Builder(9, false);
        builder.token = this.symbol_display_name;
        builder.source = this.original_payment_token;
        builder.amount = this.original_share_price;
        builder.push_amount = this.updated_share_price;
        builder.target = this.original_total_cost;
        builder.state = this.updated_total_cost;
        builder.completed_at = this.amount;
        builder.created_at = this.settlement_date;
        builder.failed_at = this.investment_entity_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.symbol_display_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "symbol_display_name=", arrayList);
        }
        String str2 = this.original_payment_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "original_payment_token=", arrayList);
        }
        Money money = this.original_share_price;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("original_share_price=", money, arrayList);
        }
        Money money2 = this.updated_share_price;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("updated_share_price=", money2, arrayList);
        }
        Money money3 = this.original_total_cost;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("original_total_cost=", money3, arrayList);
        }
        Money money4 = this.updated_total_cost;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("updated_total_cost=", money4, arrayList);
        }
        Money money5 = this.amount;
        if (money5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money5, arrayList);
        }
        Long l = this.settlement_date;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("settlement_date=", l, arrayList);
        }
        String str3 = this.investment_entity_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "investment_entity_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestCorrectionRenderData{", "}", 0, null, null, 56);
    }
}
