package com.squareup.protos.lending.sync_values;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiPublicProfile;
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
public final class SupOffersTabCreditLine extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SupOffersTabCreditLine> CREATOR;
    public final Integer active_loan_count;
    public final Integer active_loan_limit;
    public final Money available_amount;
    public final Money credit_limit;
    public final Money outstanding_amount;
    public final String token;

    static {
        SupOffersTabCreditLine$Companion$ADAPTER$1 supOffersTabCreditLine$Companion$ADAPTER$1 = new SupOffersTabCreditLine$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SupOffersTabCreditLine.class), "type.googleapis.com/squareup.lending.sync_values.SupOffersTabCreditLine", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
        ADAPTER = supOffersTabCreditLine$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(supOffersTabCreditLine$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupOffersTabCreditLine(String str, Money money, Money money2, Money money3, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.credit_limit = money;
        this.available_amount = money2;
        this.outstanding_amount = money3;
        this.active_loan_limit = num;
        this.active_loan_count = num2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SupOffersTabCreditLine)) {
            return false;
        }
        SupOffersTabCreditLine supOffersTabCreditLine = (SupOffersTabCreditLine) obj;
        return Intrinsics.areEqual(unknownFields(), supOffersTabCreditLine.unknownFields()) && Intrinsics.areEqual(this.token, supOffersTabCreditLine.token) && Intrinsics.areEqual(this.credit_limit, supOffersTabCreditLine.credit_limit) && Intrinsics.areEqual(this.available_amount, supOffersTabCreditLine.available_amount) && Intrinsics.areEqual(this.outstanding_amount, supOffersTabCreditLine.outstanding_amount) && Intrinsics.areEqual(this.active_loan_limit, supOffersTabCreditLine.active_loan_limit) && Intrinsics.areEqual(this.active_loan_count, supOffersTabCreditLine.active_loan_count);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.credit_limit;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.available_amount;
        int hashCode4 = (hashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.outstanding_amount;
        int hashCode5 = (hashCode4 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Integer num = this.active_loan_limit;
        int hashCode6 = (hashCode5 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.active_loan_count;
        int hashCode7 = hashCode6 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiPublicProfile.Builder builder = new UiPublicProfile.Builder(23, false);
        builder.full_name = this.token;
        builder.photo_url = this.credit_limit;
        builder.synopsis = this.available_amount;
        builder.full_cashtag = this.outstanding_amount;
        builder.cashtag_url_enabled = this.active_loan_limit;
        builder.is_verified_account = this.active_loan_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        Money money = this.credit_limit;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("credit_limit=", money, arrayList);
        }
        Money money2 = this.available_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("available_amount=", money2, arrayList);
        }
        Money money3 = this.outstanding_amount;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("outstanding_amount=", money3, arrayList);
        }
        Integer num = this.active_loan_limit;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("active_loan_limit=", num, arrayList);
        }
        Integer num2 = this.active_loan_count;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("active_loan_count=", num2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SupOffersTabCreditLine{", "}", 0, null, null, 56);
    }
}
