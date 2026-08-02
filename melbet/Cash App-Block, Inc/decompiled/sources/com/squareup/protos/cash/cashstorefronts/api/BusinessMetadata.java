package com.squareup.protos.cash.cashstorefronts.api;

import android.os.Parcelable;
import com.squareup.protos.cash.api.Error;
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
public final class BusinessMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BusinessMetadata> CREATOR;
    public final AfterpayAppMetadata afterpay_app_metadata;
    public final AfterpayAppMetadata afterpay_app_sup_metadata;
    public final CashAppAfterpayMetadata cash_app_afterpay_metadata;
    public final CashAppGenericBusinessMetadata cash_app_generic_business_metadata;
    public final CashAppPayLaterMetadata cash_app_pay_later_metadata;
    public final CashAppPayLaterMetadata cash_app_sup_metadata;

    static {
        BusinessMetadata$Companion$ADAPTER$1 businessMetadata$Companion$ADAPTER$1 = new BusinessMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BusinessMetadata.class), "type.googleapis.com/squareup.cash.cashstorefronts.api.BusinessMetadata", Syntax.PROTO_2, null, "squareup/cash/cashstorefronts/api/BusinessProfile.proto");
        ADAPTER = businessMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(businessMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessMetadata(CashAppGenericBusinessMetadata cashAppGenericBusinessMetadata, AfterpayAppMetadata afterpayAppMetadata, CashAppAfterpayMetadata cashAppAfterpayMetadata, CashAppPayLaterMetadata cashAppPayLaterMetadata, CashAppPayLaterMetadata cashAppPayLaterMetadata2, AfterpayAppMetadata afterpayAppMetadata2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cash_app_generic_business_metadata = cashAppGenericBusinessMetadata;
        this.afterpay_app_metadata = afterpayAppMetadata;
        this.cash_app_afterpay_metadata = cashAppAfterpayMetadata;
        this.cash_app_pay_later_metadata = cashAppPayLaterMetadata;
        this.cash_app_sup_metadata = cashAppPayLaterMetadata2;
        this.afterpay_app_sup_metadata = afterpayAppMetadata2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BusinessMetadata)) {
            return false;
        }
        BusinessMetadata businessMetadata = (BusinessMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), businessMetadata.unknownFields()) && Intrinsics.areEqual(this.cash_app_generic_business_metadata, businessMetadata.cash_app_generic_business_metadata) && Intrinsics.areEqual(this.afterpay_app_metadata, businessMetadata.afterpay_app_metadata) && Intrinsics.areEqual(this.cash_app_afterpay_metadata, businessMetadata.cash_app_afterpay_metadata) && Intrinsics.areEqual(this.cash_app_pay_later_metadata, businessMetadata.cash_app_pay_later_metadata) && Intrinsics.areEqual(this.cash_app_sup_metadata, businessMetadata.cash_app_sup_metadata) && Intrinsics.areEqual(this.afterpay_app_sup_metadata, businessMetadata.afterpay_app_sup_metadata);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CashAppGenericBusinessMetadata cashAppGenericBusinessMetadata = this.cash_app_generic_business_metadata;
        int hashCode2 = (hashCode + (cashAppGenericBusinessMetadata != null ? cashAppGenericBusinessMetadata.hashCode() : 0)) * 37;
        AfterpayAppMetadata afterpayAppMetadata = this.afterpay_app_metadata;
        int hashCode3 = (hashCode2 + (afterpayAppMetadata != null ? afterpayAppMetadata.hashCode() : 0)) * 37;
        CashAppAfterpayMetadata cashAppAfterpayMetadata = this.cash_app_afterpay_metadata;
        int hashCode4 = (hashCode3 + (cashAppAfterpayMetadata != null ? cashAppAfterpayMetadata.hashCode() : 0)) * 37;
        CashAppPayLaterMetadata cashAppPayLaterMetadata = this.cash_app_pay_later_metadata;
        int hashCode5 = (hashCode4 + (cashAppPayLaterMetadata != null ? cashAppPayLaterMetadata.hashCode() : 0)) * 37;
        CashAppPayLaterMetadata cashAppPayLaterMetadata2 = this.cash_app_sup_metadata;
        int hashCode6 = (hashCode5 + (cashAppPayLaterMetadata2 != null ? cashAppPayLaterMetadata2.hashCode() : 0)) * 37;
        AfterpayAppMetadata afterpayAppMetadata2 = this.afterpay_app_sup_metadata;
        int hashCode7 = hashCode6 + (afterpayAppMetadata2 != null ? afterpayAppMetadata2.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(20, false);
        builder.category = this.cash_app_generic_business_metadata;
        builder.code = this.afterpay_app_metadata;
        builder.description = this.cash_app_afterpay_metadata;
        builder.field = this.cash_app_pay_later_metadata;
        builder.retryable = this.cash_app_sup_metadata;
        builder.metadata = this.afterpay_app_sup_metadata;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CashAppGenericBusinessMetadata cashAppGenericBusinessMetadata = this.cash_app_generic_business_metadata;
        if (cashAppGenericBusinessMetadata != null) {
            arrayList.add("cash_app_generic_business_metadata=" + cashAppGenericBusinessMetadata);
        }
        AfterpayAppMetadata afterpayAppMetadata = this.afterpay_app_metadata;
        if (afterpayAppMetadata != null) {
            arrayList.add("afterpay_app_metadata=" + afterpayAppMetadata);
        }
        CashAppAfterpayMetadata cashAppAfterpayMetadata = this.cash_app_afterpay_metadata;
        if (cashAppAfterpayMetadata != null) {
            arrayList.add("cash_app_afterpay_metadata=" + cashAppAfterpayMetadata);
        }
        CashAppPayLaterMetadata cashAppPayLaterMetadata = this.cash_app_pay_later_metadata;
        if (cashAppPayLaterMetadata != null) {
            arrayList.add("cash_app_pay_later_metadata=" + cashAppPayLaterMetadata);
        }
        CashAppPayLaterMetadata cashAppPayLaterMetadata2 = this.cash_app_sup_metadata;
        if (cashAppPayLaterMetadata2 != null) {
            arrayList.add("cash_app_sup_metadata=" + cashAppPayLaterMetadata2);
        }
        AfterpayAppMetadata afterpayAppMetadata2 = this.afterpay_app_sup_metadata;
        if (afterpayAppMetadata2 != null) {
            arrayList.add("afterpay_app_sup_metadata=" + afterpayAppMetadata2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BusinessMetadata{", "}", 0, null, null, 56);
    }
}
