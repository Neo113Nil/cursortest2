package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.lending.Loan;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashbusinessaccounts/api/v1/EarningsTrackerDataResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/lending/Loan$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EarningsTrackerDataResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarningsTrackerDataResponse> CREATOR;
    public final List customer_data;
    public final List daily_data;
    public final List monthly_data;
    public final Money net_earnings;
    public final Integer number_of_cash_app_transactions;
    public final Integer number_of_listings_transactions;
    public final Integer number_of_transactions;
    public final Integer number_of_ttp_transactions;
    public final Money processing_fees;
    public final ResponseContext response_context;
    public final Money total_earnings;
    public final Trend trend;
    public final Integer ttl_in_ms;
    public final List yearly_data;

    static {
        EarningsTrackerDataResponse$Companion$ADAPTER$1 earningsTrackerDataResponse$Companion$ADAPTER$1 = new EarningsTrackerDataResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarningsTrackerDataResponse.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.api.v1beta1.EarningsTrackerDataResponse", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/api/v1beta1/earnings_tracker.proto");
        ADAPTER = earningsTrackerDataResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earningsTrackerDataResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsTrackerDataResponse(List list, List list2, List list3, Trend trend, Money money, Money money2, Integer num, List list4, Money money3, ResponseContext responseContext, Integer num2, Integer num3, Integer num4, Integer num5, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        byteString.getClass();
        this.trend = trend;
        this.processing_fees = money;
        this.total_earnings = money2;
        this.number_of_transactions = num;
        this.net_earnings = money3;
        this.response_context = responseContext;
        this.ttl_in_ms = num2;
        this.number_of_cash_app_transactions = num3;
        this.number_of_ttp_transactions = num4;
        this.number_of_listings_transactions = num5;
        this.daily_data = TransactorKt.immutableCopyOf("daily_data", list);
        this.monthly_data = TransactorKt.immutableCopyOf("monthly_data", list2);
        this.yearly_data = TransactorKt.immutableCopyOf("yearly_data", list3);
        this.customer_data = TransactorKt.immutableCopyOf("customer_data", list4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarningsTrackerDataResponse)) {
            return false;
        }
        EarningsTrackerDataResponse earningsTrackerDataResponse = (EarningsTrackerDataResponse) obj;
        return Intrinsics.areEqual(unknownFields(), earningsTrackerDataResponse.unknownFields()) && Intrinsics.areEqual(this.daily_data, earningsTrackerDataResponse.daily_data) && Intrinsics.areEqual(this.monthly_data, earningsTrackerDataResponse.monthly_data) && Intrinsics.areEqual(this.yearly_data, earningsTrackerDataResponse.yearly_data) && Intrinsics.areEqual(this.trend, earningsTrackerDataResponse.trend) && Intrinsics.areEqual(this.processing_fees, earningsTrackerDataResponse.processing_fees) && Intrinsics.areEqual(this.total_earnings, earningsTrackerDataResponse.total_earnings) && Intrinsics.areEqual(this.number_of_transactions, earningsTrackerDataResponse.number_of_transactions) && Intrinsics.areEqual(this.customer_data, earningsTrackerDataResponse.customer_data) && Intrinsics.areEqual(this.net_earnings, earningsTrackerDataResponse.net_earnings) && Intrinsics.areEqual(this.response_context, earningsTrackerDataResponse.response_context) && Intrinsics.areEqual(this.ttl_in_ms, earningsTrackerDataResponse.ttl_in_ms) && Intrinsics.areEqual(this.number_of_cash_app_transactions, earningsTrackerDataResponse.number_of_cash_app_transactions) && Intrinsics.areEqual(this.number_of_ttp_transactions, earningsTrackerDataResponse.number_of_ttp_transactions) && Intrinsics.areEqual(this.number_of_listings_transactions, earningsTrackerDataResponse.number_of_listings_transactions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.daily_data), 37, this.monthly_data), 37, this.yearly_data);
        Trend trend = this.trend;
        int hashCode = (m + (trend != null ? trend.hashCode() : 0)) * 37;
        Money money = this.processing_fees;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.total_earnings;
        int hashCode3 = (hashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Integer num = this.number_of_transactions;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37, 37, this.customer_data);
        Money money3 = this.net_earnings;
        int hashCode4 = (m2 + (money3 != null ? money3.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode5 = (hashCode4 + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        Integer num2 = this.ttl_in_ms;
        int hashCode6 = (hashCode5 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Integer num3 = this.number_of_cash_app_transactions;
        int hashCode7 = (hashCode6 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 37;
        Integer num4 = this.number_of_ttp_transactions;
        int hashCode8 = (hashCode7 + (num4 != null ? Integer.hashCode(num4.intValue()) : 0)) * 37;
        Integer num5 = this.number_of_listings_transactions;
        int hashCode9 = hashCode8 + (num5 != null ? Integer.hashCode(num5.intValue()) : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Loan.Builder builder = new Loan.Builder(2);
        builder.detail_rows = this.daily_data;
        builder.token = this.monthly_data;
        builder.credit_line_token = this.yearly_data;
        builder.borrowed_at = this.trend;
        builder.principal_amount = this.processing_fees;
        builder.setup_fee_amount = this.total_earnings;
        builder.setup_fee_bps = this.number_of_transactions;
        builder.due_at = this.customer_data;
        builder.outstanding_amount = this.net_earnings;
        builder.late_fee_amount = this.response_context;
        builder.interest_amount = this.ttl_in_ms;
        builder.state = this.number_of_cash_app_transactions;
        builder.lending_product = this.number_of_ttp_transactions;
        builder.bnpl_data = this.number_of_listings_transactions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.daily_data;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("daily_data=", arrayList, list);
        }
        List list2 = this.monthly_data;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("monthly_data=", arrayList, list2);
        }
        List list3 = this.yearly_data;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("yearly_data=", arrayList, list3);
        }
        Trend trend = this.trend;
        if (trend != null) {
            arrayList.add("trend=" + trend);
        }
        Money money = this.processing_fees;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("processing_fees=", money, arrayList);
        }
        Money money2 = this.total_earnings;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_earnings=", money2, arrayList);
        }
        Integer num = this.number_of_transactions;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("number_of_transactions=", num, arrayList);
        }
        List list4 = this.customer_data;
        if (!list4.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("customer_data=", arrayList, list4);
        }
        Money money3 = this.net_earnings;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("net_earnings=", money3, arrayList);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        Integer num2 = this.ttl_in_ms;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("ttl_in_ms=", num2, arrayList);
        }
        Integer num3 = this.number_of_cash_app_transactions;
        if (num3 != null) {
            re$$ExternalSyntheticOutline0.m("number_of_cash_app_transactions=", num3, arrayList);
        }
        Integer num4 = this.number_of_ttp_transactions;
        if (num4 != null) {
            re$$ExternalSyntheticOutline0.m("number_of_ttp_transactions=", num4, arrayList);
        }
        Integer num5 = this.number_of_listings_transactions;
        if (num5 != null) {
            re$$ExternalSyntheticOutline0.m("number_of_listings_transactions=", num5, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningsTrackerDataResponse{", "}", 0, null, null, 56);
    }
}
