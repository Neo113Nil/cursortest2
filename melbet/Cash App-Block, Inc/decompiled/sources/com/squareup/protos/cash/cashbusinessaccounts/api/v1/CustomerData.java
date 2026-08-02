package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.Error;
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
public final class CustomerData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CustomerData> CREATOR;
    public final String cashtag;
    public final String customer_token;
    public final String photo;
    public final Integer position;
    public final Integer sales;
    public final Money sales_amount;

    static {
        CustomerData$Companion$ADAPTER$1 customerData$Companion$ADAPTER$1 = new CustomerData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomerData.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.api.v1beta1.CustomerData", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/api/v1beta1/earnings_tracker.proto");
        ADAPTER = customerData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(customerData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerData(Integer num, Integer num2, Money money, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.position = num;
        this.sales = num2;
        this.sales_amount = money;
        this.customer_token = str;
        this.cashtag = str2;
        this.photo = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomerData)) {
            return false;
        }
        CustomerData customerData = (CustomerData) obj;
        return Intrinsics.areEqual(unknownFields(), customerData.unknownFields()) && Intrinsics.areEqual(this.position, customerData.position) && Intrinsics.areEqual(this.sales, customerData.sales) && Intrinsics.areEqual(this.sales_amount, customerData.sales_amount) && Intrinsics.areEqual(this.customer_token, customerData.customer_token) && Intrinsics.areEqual(this.cashtag, customerData.cashtag) && Intrinsics.areEqual(this.photo, customerData.photo);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.position;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.sales;
        int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Money money = this.sales_amount;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        String str = this.customer_token;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cashtag;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.photo;
        int hashCode7 = hashCode6 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(16, false);
        builder.category = this.position;
        builder.code = this.sales;
        builder.retryable = this.sales_amount;
        builder.description = this.customer_token;
        builder.field = this.cashtag;
        builder.metadata = this.photo;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.position;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("position=", num, arrayList);
        }
        Integer num2 = this.sales;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("sales=", num2, arrayList);
        }
        Money money = this.sales_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("sales_amount=", money, arrayList);
        }
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        if (this.photo != null) {
            arrayList.add("photo=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustomerData{", "}", 0, null, null, 56);
    }
}
