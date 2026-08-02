package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.plasma.LinkBankAccountPlaidThenRedirectFlowParameters;
import com.squareup.protos.cash.bitcoin.BitcoinBuyClientRouteParams;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import com.squareup.protos.cash.pay.CashAppPayLineItemRenderData;
import com.squareup.protos.cash.pay.CashAppPayPaymentRenderData;
import com.squareup.protos.common.Money;
import com.squareup.protos.timecards.OvertimeReportByTimecardForEmployeeResponse;
import com.squareup.protos.timecards.PaidBreakOverageConversionSummary;
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
import squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse;

/* loaded from: classes8.dex */
public final class BalanceImpact extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BalanceImpact> CREATOR;
    public final Money amount;
    public final String balance_name;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Money amount;
        public String balance_name;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new BalanceImpact(this.amount, this.balance_name, buildUnknownFields());
                case 1:
                    return new LinkBankAccountPlaidThenRedirectFlowParameters.BitcoinBuyClientRouteContext(this.amount, this.balance_name, buildUnknownFields());
                case 2:
                    return new BitcoinBuyClientRouteParams(this.amount, this.balance_name, buildUnknownFields());
                case 3:
                    return new InAppBrowserMetadata.IABMetadataSUP(this.amount, this.balance_name, buildUnknownFields());
                case 4:
                    return new CashAppPayLineItemRenderData.LineItemIncentive(this.amount, this.balance_name, buildUnknownFields());
                case 5:
                    return new CashAppPayLineItemRenderData.LineItemTax(this.amount, this.balance_name, buildUnknownFields());
                case 6:
                    return new CashAppPayPaymentRenderData.DiscountRenderData(this.amount, this.balance_name, buildUnknownFields());
                case 7:
                    return new OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ConvertedPaidBreakOverage(this.amount, this.balance_name, buildUnknownFields());
                case 8:
                    return new PaidBreakOverageConversionSummary(this.amount, this.balance_name, buildUnknownFields());
                default:
                    return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees(this.amount, this.balance_name, buildUnknownFields());
            }
        }
    }

    static {
        BalanceImpact$Companion$ADAPTER$1 balanceImpact$Companion$ADAPTER$1 = new BalanceImpact$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BalanceImpact.class), "type.googleapis.com/squareup.franklin.BalanceImpact", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = balanceImpact$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(balanceImpact$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalanceImpact(Money money, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.balance_name = str;
        this.amount = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BalanceImpact)) {
            return false;
        }
        BalanceImpact balanceImpact = (BalanceImpact) obj;
        return Intrinsics.areEqual(unknownFields(), balanceImpact.unknownFields()) && Intrinsics.areEqual(this.balance_name, balanceImpact.balance_name) && Intrinsics.areEqual(this.amount, balanceImpact.amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.balance_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode3 = hashCode2 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.balance_name = this.balance_name;
        builder.amount = this.amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.balance_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "balance_name=", arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BalanceImpact{", "}", 0, null, null, 56);
    }
}
