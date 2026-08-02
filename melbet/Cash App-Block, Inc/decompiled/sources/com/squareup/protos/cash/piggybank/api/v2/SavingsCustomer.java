package com.squareup.protos.cash.piggybank.api.v2;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.time.DateTime;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.time.Instant;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SavingsCustomer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsCustomer> CREATOR;
    public final Instant auto_save_upsell_dismissed_at;
    public final SavingsCustomerStatus customer_status;
    public final Boolean eligible_for_savings;
    public final String token;
    public final YieldEligibilityStatus yield_eligibility_status;

    static {
        SavingsCustomer$Companion$ADAPTER$1 savingsCustomer$Companion$ADAPTER$1 = new SavingsCustomer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsCustomer.class), "type.googleapis.com/squareup.cash.piggybank.api.v2.SavingsCustomer", Syntax.PROTO_2, null, "squareup/cash/piggybank/api/v2/models.proto");
        ADAPTER = savingsCustomer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsCustomer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsCustomer(String str, Instant instant, Boolean bool, SavingsCustomerStatus savingsCustomerStatus, YieldEligibilityStatus yieldEligibilityStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.auto_save_upsell_dismissed_at = instant;
        this.eligible_for_savings = bool;
        this.customer_status = savingsCustomerStatus;
        this.yield_eligibility_status = yieldEligibilityStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsCustomer)) {
            return false;
        }
        SavingsCustomer savingsCustomer = (SavingsCustomer) obj;
        return Intrinsics.areEqual(unknownFields(), savingsCustomer.unknownFields()) && Intrinsics.areEqual(this.token, savingsCustomer.token) && Intrinsics.areEqual(this.auto_save_upsell_dismissed_at, savingsCustomer.auto_save_upsell_dismissed_at) && Intrinsics.areEqual(this.eligible_for_savings, savingsCustomer.eligible_for_savings) && this.customer_status == savingsCustomer.customer_status && this.yield_eligibility_status == savingsCustomer.yield_eligibility_status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Instant instant = this.auto_save_upsell_dismissed_at;
        int hashCode3 = (hashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        Boolean bool = this.eligible_for_savings;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        SavingsCustomerStatus savingsCustomerStatus = this.customer_status;
        int hashCode5 = (hashCode4 + (savingsCustomerStatus != null ? savingsCustomerStatus.hashCode() : 0)) * 37;
        YieldEligibilityStatus yieldEligibilityStatus = this.yield_eligibility_status;
        int hashCode6 = hashCode5 + (yieldEligibilityStatus != null ? yieldEligibilityStatus.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(1, false);
        builder.posix_tz = this.token;
        builder.instant_usec = this.auto_save_upsell_dismissed_at;
        builder.ordinal = this.eligible_for_savings;
        builder.timezone_offset_min = this.customer_status;
        builder.tz_name = this.yield_eligibility_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        Instant instant = this.auto_save_upsell_dismissed_at;
        if (instant != null) {
            Matcher$$ExternalSyntheticOutline0.m("auto_save_upsell_dismissed_at=", instant, arrayList);
        }
        Boolean bool = this.eligible_for_savings;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("eligible_for_savings=", bool, arrayList);
        }
        SavingsCustomerStatus savingsCustomerStatus = this.customer_status;
        if (savingsCustomerStatus != null) {
            arrayList.add("customer_status=" + savingsCustomerStatus);
        }
        YieldEligibilityStatus yieldEligibilityStatus = this.yield_eligibility_status;
        if (yieldEligibilityStatus != null) {
            arrayList.add("yield_eligibility_status=" + yieldEligibilityStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsCustomer{", "}", 0, null, null, 56);
    }
}
