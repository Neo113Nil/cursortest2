package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.protos.franklin.ui.UiAvatar;
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
public final class ReceiptData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ReceiptData> CREATOR;
    public final UiAvatar avatar;
    public final String cashtag;
    public final PaymentActivity payment_activity;
    public final String profile_photo_url;
    public final String seller_name;

    static {
        ReceiptData$Companion$ADAPTER$1 receiptData$Companion$ADAPTER$1 = new ReceiptData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ReceiptData.class), "type.googleapis.com/squareup.cash.cashbusinesspayments.api.v1beta1.ReceiptData", Syntax.PROTO_2, null, "squareup/cash/cashbusinesspayments/api/v1beta1/receipt_data.proto");
        ADAPTER = receiptData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(receiptData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptData(String str, String str2, String str3, PaymentActivity paymentActivity, UiAvatar uiAvatar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cashtag = str;
        this.seller_name = str2;
        this.profile_photo_url = str3;
        this.payment_activity = paymentActivity;
        this.avatar = uiAvatar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReceiptData)) {
            return false;
        }
        ReceiptData receiptData = (ReceiptData) obj;
        return Intrinsics.areEqual(unknownFields(), receiptData.unknownFields()) && Intrinsics.areEqual(this.cashtag, receiptData.cashtag) && Intrinsics.areEqual(this.seller_name, receiptData.seller_name) && Intrinsics.areEqual(this.profile_photo_url, receiptData.profile_photo_url) && Intrinsics.areEqual(this.payment_activity, receiptData.payment_activity) && Intrinsics.areEqual(this.avatar, receiptData.avatar);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.cashtag;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.seller_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.profile_photo_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        PaymentActivity paymentActivity = this.payment_activity;
        int hashCode5 = (hashCode4 + (paymentActivity != null ? paymentActivity.hashCode() : 0)) * 37;
        UiAvatar uiAvatar = this.avatar;
        int hashCode6 = hashCode5 + (uiAvatar != null ? uiAvatar.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(2, false);
        builder.customer_token = this.cashtag;
        builder.account_token = this.seller_name;
        builder.display_name = this.profile_photo_url;
        builder.account_type = this.payment_activity;
        builder.is_sponsored_account = this.avatar;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        if (this.seller_name != null) {
            arrayList.add("seller_name=██");
        }
        String str = this.profile_photo_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "profile_photo_url=", arrayList);
        }
        PaymentActivity paymentActivity = this.payment_activity;
        if (paymentActivity != null) {
            arrayList.add("payment_activity=" + paymentActivity);
        }
        UiAvatar uiAvatar = this.avatar;
        if (uiAvatar != null) {
            Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReceiptData{", "}", 0, null, null, 56);
    }
}
