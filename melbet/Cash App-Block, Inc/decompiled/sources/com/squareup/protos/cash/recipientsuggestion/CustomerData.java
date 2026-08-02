package com.squareup.protos.cash.recipientsuggestion;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.document.Document;
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
    public final String full_name;
    public final Boolean is_business;
    public final Boolean is_verified_account;
    public final Image photo;

    static {
        CustomerData$Companion$ADAPTER$1 customerData$Companion$ADAPTER$1 = new CustomerData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomerData.class), "type.googleapis.com/squareup.cash.recipientsuggestion.CustomerData", Syntax.PROTO_2, null, "squareup/cash/recipientsuggestion/RecipientSuggestions.proto");
        ADAPTER = customerData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(customerData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerData(String str, String str2, String str3, Image image, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.cashtag = str2;
        this.full_name = str3;
        this.photo = image;
        this.is_business = bool;
        this.is_verified_account = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomerData)) {
            return false;
        }
        CustomerData customerData = (CustomerData) obj;
        return Intrinsics.areEqual(unknownFields(), customerData.unknownFields()) && Intrinsics.areEqual(this.customer_token, customerData.customer_token) && Intrinsics.areEqual(this.cashtag, customerData.cashtag) && Intrinsics.areEqual(this.full_name, customerData.full_name) && Intrinsics.areEqual(this.photo, customerData.photo) && Intrinsics.areEqual(this.is_business, customerData.is_business) && Intrinsics.areEqual(this.is_verified_account, customerData.is_verified_account);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cashtag;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.full_name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Image image = this.photo;
        int hashCode5 = (hashCode4 + (image != null ? image.hashCode() : 0)) * 37;
        Boolean bool = this.is_business;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.is_verified_account;
        int hashCode7 = hashCode6 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(1, false);
        builder.category = this.customer_token;
        builder.token = this.cashtag;
        builder.title = this.full_name;
        builder.url = this.photo;
        builder.owner_token = this.is_business;
        builder.document_date = this.is_verified_account;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        if (this.full_name != null) {
            arrayList.add("full_name=██");
        }
        if (this.photo != null) {
            arrayList.add("photo=██");
        }
        Boolean bool = this.is_business;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_business=", bool, arrayList);
        }
        Boolean bool2 = this.is_verified_account;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_verified_account=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustomerData{", "}", 0, null, null, 56);
    }
}
