package com.squareup.protos.unicorn;

import android.os.Parcelable;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FdicInsuranceCustomerStatus extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FdicInsuranceCustomerStatus> CREATOR;
    public final FdicDisclosureCopy account_profile_disclosure;
    public final FdicDisclosureCopy balance_home_disclosure;
    public final FdicDisclosureCopy benefits_booklet_disclosure;
    public final FdicDisclosureCopy benefits_home_disclosure;
    public final FdicDisclosureCopy cards_home_disclosure;
    public final boolean is_fdic_insured;
    public final FdicDisclosureCopy money_tab_disclosure;
    public final FdicDisclosureCopy paychecks_disclosure;
    public final FdicDisclosureCopy savings_home_disclosure;

    static {
        FdicInsuranceCustomerStatus$Companion$ADAPTER$1 fdicInsuranceCustomerStatus$Companion$ADAPTER$1 = new FdicInsuranceCustomerStatus$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FdicInsuranceCustomerStatus.class), "type.googleapis.com/squareup.unicorn.FdicInsuranceCustomerStatus", Syntax.PROTO_2, null, "squareup/unicorn/fdic_insurance_sync_value.proto");
        ADAPTER = fdicInsuranceCustomerStatus$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(fdicInsuranceCustomerStatus$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FdicInsuranceCustomerStatus(boolean z, FdicDisclosureCopy fdicDisclosureCopy, FdicDisclosureCopy fdicDisclosureCopy2, FdicDisclosureCopy fdicDisclosureCopy3, FdicDisclosureCopy fdicDisclosureCopy4, FdicDisclosureCopy fdicDisclosureCopy5, FdicDisclosureCopy fdicDisclosureCopy6, FdicDisclosureCopy fdicDisclosureCopy7, FdicDisclosureCopy fdicDisclosureCopy8, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.is_fdic_insured = z;
        this.balance_home_disclosure = fdicDisclosureCopy;
        this.cards_home_disclosure = fdicDisclosureCopy2;
        this.account_profile_disclosure = fdicDisclosureCopy3;
        this.savings_home_disclosure = fdicDisclosureCopy4;
        this.paychecks_disclosure = fdicDisclosureCopy5;
        this.money_tab_disclosure = fdicDisclosureCopy6;
        this.benefits_booklet_disclosure = fdicDisclosureCopy7;
        this.benefits_home_disclosure = fdicDisclosureCopy8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FdicInsuranceCustomerStatus)) {
            return false;
        }
        FdicInsuranceCustomerStatus fdicInsuranceCustomerStatus = (FdicInsuranceCustomerStatus) obj;
        return Intrinsics.areEqual(unknownFields(), fdicInsuranceCustomerStatus.unknownFields()) && this.is_fdic_insured == fdicInsuranceCustomerStatus.is_fdic_insured && Intrinsics.areEqual(this.balance_home_disclosure, fdicInsuranceCustomerStatus.balance_home_disclosure) && Intrinsics.areEqual(this.cards_home_disclosure, fdicInsuranceCustomerStatus.cards_home_disclosure) && Intrinsics.areEqual(this.account_profile_disclosure, fdicInsuranceCustomerStatus.account_profile_disclosure) && Intrinsics.areEqual(this.savings_home_disclosure, fdicInsuranceCustomerStatus.savings_home_disclosure) && Intrinsics.areEqual(this.paychecks_disclosure, fdicInsuranceCustomerStatus.paychecks_disclosure) && Intrinsics.areEqual(this.money_tab_disclosure, fdicInsuranceCustomerStatus.money_tab_disclosure) && Intrinsics.areEqual(this.benefits_booklet_disclosure, fdicInsuranceCustomerStatus.benefits_booklet_disclosure) && Intrinsics.areEqual(this.benefits_home_disclosure, fdicInsuranceCustomerStatus.benefits_home_disclosure);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.is_fdic_insured);
        FdicDisclosureCopy fdicDisclosureCopy = this.balance_home_disclosure;
        int hashCode = (m + (fdicDisclosureCopy != null ? fdicDisclosureCopy.hashCode() : 0)) * 37;
        FdicDisclosureCopy fdicDisclosureCopy2 = this.cards_home_disclosure;
        int hashCode2 = (hashCode + (fdicDisclosureCopy2 != null ? fdicDisclosureCopy2.hashCode() : 0)) * 37;
        FdicDisclosureCopy fdicDisclosureCopy3 = this.account_profile_disclosure;
        int hashCode3 = (hashCode2 + (fdicDisclosureCopy3 != null ? fdicDisclosureCopy3.hashCode() : 0)) * 37;
        FdicDisclosureCopy fdicDisclosureCopy4 = this.savings_home_disclosure;
        int hashCode4 = (hashCode3 + (fdicDisclosureCopy4 != null ? fdicDisclosureCopy4.hashCode() : 0)) * 37;
        FdicDisclosureCopy fdicDisclosureCopy5 = this.paychecks_disclosure;
        int hashCode5 = (hashCode4 + (fdicDisclosureCopy5 != null ? fdicDisclosureCopy5.hashCode() : 0)) * 37;
        FdicDisclosureCopy fdicDisclosureCopy6 = this.money_tab_disclosure;
        int hashCode6 = (hashCode5 + (fdicDisclosureCopy6 != null ? fdicDisclosureCopy6.hashCode() : 0)) * 37;
        FdicDisclosureCopy fdicDisclosureCopy7 = this.benefits_booklet_disclosure;
        int hashCode7 = (hashCode6 + (fdicDisclosureCopy7 != null ? fdicDisclosureCopy7.hashCode() : 0)) * 37;
        FdicDisclosureCopy fdicDisclosureCopy8 = this.benefits_home_disclosure;
        int hashCode8 = hashCode7 + (fdicDisclosureCopy8 != null ? fdicDisclosureCopy8.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Transfer.Builder builder = new Transfer.Builder(19, false);
        builder.token = Boolean.valueOf(this.is_fdic_insured);
        builder.source = this.balance_home_disclosure;
        builder.target = this.cards_home_disclosure;
        builder.state = this.account_profile_disclosure;
        builder.amount = this.savings_home_disclosure;
        builder.push_amount = this.paychecks_disclosure;
        builder.created_at = this.money_tab_disclosure;
        builder.completed_at = this.benefits_booklet_disclosure;
        builder.failed_at = this.benefits_home_disclosure;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_fdic_insured=" + this.is_fdic_insured);
        FdicDisclosureCopy fdicDisclosureCopy = this.balance_home_disclosure;
        if (fdicDisclosureCopy != null) {
            arrayList.add("balance_home_disclosure=" + fdicDisclosureCopy);
        }
        FdicDisclosureCopy fdicDisclosureCopy2 = this.cards_home_disclosure;
        if (fdicDisclosureCopy2 != null) {
            arrayList.add("cards_home_disclosure=" + fdicDisclosureCopy2);
        }
        FdicDisclosureCopy fdicDisclosureCopy3 = this.account_profile_disclosure;
        if (fdicDisclosureCopy3 != null) {
            arrayList.add("account_profile_disclosure=" + fdicDisclosureCopy3);
        }
        FdicDisclosureCopy fdicDisclosureCopy4 = this.savings_home_disclosure;
        if (fdicDisclosureCopy4 != null) {
            arrayList.add("savings_home_disclosure=" + fdicDisclosureCopy4);
        }
        FdicDisclosureCopy fdicDisclosureCopy5 = this.paychecks_disclosure;
        if (fdicDisclosureCopy5 != null) {
            arrayList.add("paychecks_disclosure=" + fdicDisclosureCopy5);
        }
        FdicDisclosureCopy fdicDisclosureCopy6 = this.money_tab_disclosure;
        if (fdicDisclosureCopy6 != null) {
            arrayList.add("money_tab_disclosure=" + fdicDisclosureCopy6);
        }
        FdicDisclosureCopy fdicDisclosureCopy7 = this.benefits_booklet_disclosure;
        if (fdicDisclosureCopy7 != null) {
            arrayList.add("benefits_booklet_disclosure=" + fdicDisclosureCopy7);
        }
        FdicDisclosureCopy fdicDisclosureCopy8 = this.benefits_home_disclosure;
        if (fdicDisclosureCopy8 != null) {
            arrayList.add("benefits_home_disclosure=" + fdicDisclosureCopy8);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FdicInsuranceCustomerStatus{", "}", 0, null, null, 56);
    }
}
