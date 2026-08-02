package com.squareup.protos.cash.pay;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.ExpenseSlice;
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
public final class CashAppPayPayoutRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppPayPayoutRenderData> CREATOR;
    public final CashAppPayInstrumentRenderData destination_instrument;
    public final Long display_date;
    public final CashAppPayMerchantRenderData merchant;
    public final String note;
    public final String payout_id;
    public final Money payout_money;

    static {
        CashAppPayPayoutRenderData$Companion$ADAPTER$1 cashAppPayPayoutRenderData$Companion$ADAPTER$1 = new CashAppPayPayoutRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppPayPayoutRenderData.class), "type.googleapis.com/squareup.cash.pay.CashAppPayPayoutRenderData", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_payout.proto");
        ADAPTER = cashAppPayPayoutRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayPayoutRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayPayoutRenderData(String str, CashAppPayMerchantRenderData cashAppPayMerchantRenderData, Money money, Long l, String str2, CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payout_id = str;
        this.merchant = cashAppPayMerchantRenderData;
        this.payout_money = money;
        this.display_date = l;
        this.note = str2;
        this.destination_instrument = cashAppPayInstrumentRenderData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppPayPayoutRenderData)) {
            return false;
        }
        CashAppPayPayoutRenderData cashAppPayPayoutRenderData = (CashAppPayPayoutRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppPayPayoutRenderData.unknownFields()) && Intrinsics.areEqual(this.payout_id, cashAppPayPayoutRenderData.payout_id) && Intrinsics.areEqual(this.merchant, cashAppPayPayoutRenderData.merchant) && Intrinsics.areEqual(this.payout_money, cashAppPayPayoutRenderData.payout_money) && Intrinsics.areEqual(this.display_date, cashAppPayPayoutRenderData.display_date) && Intrinsics.areEqual(this.note, cashAppPayPayoutRenderData.note) && Intrinsics.areEqual(this.destination_instrument, cashAppPayPayoutRenderData.destination_instrument);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.payout_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = this.merchant;
        int hashCode3 = (hashCode2 + (cashAppPayMerchantRenderData != null ? cashAppPayMerchantRenderData.hashCode() : 0)) * 37;
        Money money = this.payout_money;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        Long l = this.display_date;
        int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str2 = this.note;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData = this.destination_instrument;
        int hashCode7 = hashCode6 + (cashAppPayInstrumentRenderData != null ? cashAppPayInstrumentRenderData.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder(22);
        builder.slice_token = this.payout_id;
        builder.requester = this.merchant;
        builder.amount = this.payout_money;
        builder.responder = this.display_date;
        builder.status = this.note;
        builder.action = this.destination_instrument;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.payout_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payout_id=", arrayList);
        }
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = this.merchant;
        if (cashAppPayMerchantRenderData != null) {
            arrayList.add("merchant=" + cashAppPayMerchantRenderData);
        }
        Money money = this.payout_money;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("payout_money=", money, arrayList);
        }
        Long l = this.display_date;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("display_date=", l, arrayList);
        }
        String str2 = this.note;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "note=", arrayList);
        }
        CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData = this.destination_instrument;
        if (cashAppPayInstrumentRenderData != null) {
            arrayList.add("destination_instrument=" + cashAppPayInstrumentRenderData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppPayPayoutRenderData{", "}", 0, null, null, 56);
    }
}
