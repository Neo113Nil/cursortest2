package com.squareup.protos.cash.postbank.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/postbank/api/GetDirectDepositFormResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/document/DocumentEntity$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetDirectDepositFormResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetDirectDepositFormResponse> CREATOR;
    public final Boolean add_signature;
    public final String amount;
    public final Money amount_money;
    public final String customer_name;
    public final String employer_name;
    public final String file_url;
    public final Long file_url_expires_at;
    public final String percentage;

    static {
        GetDirectDepositFormResponse$Companion$ADAPTER$1 getDirectDepositFormResponse$Companion$ADAPTER$1 = new GetDirectDepositFormResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetDirectDepositFormResponse.class), "type.googleapis.com/squareup.cash.postbank.api.GetDirectDepositFormResponse", Syntax.PROTO_2, null, "squareup/cash/postbank/api/GetDirectDepositForm.proto");
        ADAPTER = getDirectDepositFormResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getDirectDepositFormResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDirectDepositFormResponse(String str, String str2, String str3, String str4, Boolean bool, String str5, Long l, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_name = str;
        this.employer_name = str2;
        this.amount = str3;
        this.percentage = str4;
        this.add_signature = bool;
        this.file_url = str5;
        this.file_url_expires_at = l;
        this.amount_money = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetDirectDepositFormResponse)) {
            return false;
        }
        GetDirectDepositFormResponse getDirectDepositFormResponse = (GetDirectDepositFormResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getDirectDepositFormResponse.unknownFields()) && Intrinsics.areEqual(this.customer_name, getDirectDepositFormResponse.customer_name) && Intrinsics.areEqual(this.employer_name, getDirectDepositFormResponse.employer_name) && Intrinsics.areEqual(this.amount, getDirectDepositFormResponse.amount) && Intrinsics.areEqual(this.percentage, getDirectDepositFormResponse.percentage) && Intrinsics.areEqual(this.add_signature, getDirectDepositFormResponse.add_signature) && Intrinsics.areEqual(this.file_url, getDirectDepositFormResponse.file_url) && Intrinsics.areEqual(this.file_url_expires_at, getDirectDepositFormResponse.file_url_expires_at) && Intrinsics.areEqual(this.amount_money, getDirectDepositFormResponse.amount_money);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.employer_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.amount;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.percentage;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool = this.add_signature;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str5 = this.file_url;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Long l = this.file_url_expires_at;
        int hashCode8 = (hashCode7 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Money money = this.amount_money;
        int hashCode9 = hashCode8 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(12, false);
        builder.category = this.customer_name;
        builder.token = this.employer_name;
        builder.title = this.amount;
        builder.client_route = this.percentage;
        builder.owner_token = this.add_signature;
        builder.url = this.file_url;
        builder.version_data = this.file_url_expires_at;
        builder.localizable_title = this.amount_money;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.customer_name != null) {
            arrayList.add("customer_name=██");
        }
        if (this.employer_name != null) {
            arrayList.add("employer_name=██");
        }
        if (this.amount != null) {
            arrayList.add("amount=██");
        }
        if (this.percentage != null) {
            arrayList.add("percentage=██");
        }
        Boolean bool = this.add_signature;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("add_signature=", bool, arrayList);
        }
        String str = this.file_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "file_url=", arrayList);
        }
        Long l = this.file_url_expires_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("file_url_expires_at=", l, arrayList);
        }
        Money money = this.amount_money;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount_money=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetDirectDepositFormResponse{", "}", 0, null, null, 56);
    }
}
