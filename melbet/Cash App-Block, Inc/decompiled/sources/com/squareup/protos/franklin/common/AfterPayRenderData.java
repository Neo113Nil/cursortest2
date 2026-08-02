package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ResourceEvent;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.document.Document;
import com.squareup.protos.franklin.app.ClaimData;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AfterPayRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AfterPayRenderData> CREATOR;
    public final ResourceEvent.Companion rowType;

    public final class Installment extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Installment> CREATOR;
        public final String ap_consumer_uuid;
        public final Long installment_sequence_number;
        public final Boolean is_partial_payment;
        public final String order_id;
        public final Long total_number_of_installments;
        public final Money total_order_amount;

        static {
            AfterPayRenderData$Installment$Companion$ADAPTER$1 afterPayRenderData$Installment$Companion$ADAPTER$1 = new AfterPayRenderData$Installment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Installment.class), "type.googleapis.com/squareup.franklin.AfterPayRenderData.Installment", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = afterPayRenderData$Installment$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(afterPayRenderData$Installment$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Installment(String str, Money money, Long l, Long l2, Boolean bool, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.order_id = str;
            this.total_order_amount = money;
            this.total_number_of_installments = l;
            this.installment_sequence_number = l2;
            this.is_partial_payment = bool;
            this.ap_consumer_uuid = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Installment)) {
                return false;
            }
            Installment installment = (Installment) obj;
            return Intrinsics.areEqual(unknownFields(), installment.unknownFields()) && Intrinsics.areEqual(this.order_id, installment.order_id) && Intrinsics.areEqual(this.total_order_amount, installment.total_order_amount) && Intrinsics.areEqual(this.total_number_of_installments, installment.total_number_of_installments) && Intrinsics.areEqual(this.installment_sequence_number, installment.installment_sequence_number) && Intrinsics.areEqual(this.is_partial_payment, installment.is_partial_payment) && Intrinsics.areEqual(this.ap_consumer_uuid, installment.ap_consumer_uuid);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.order_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Money money = this.total_order_amount;
            int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
            Long l = this.total_number_of_installments;
            int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Long l2 = this.installment_sequence_number;
            int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
            Boolean bool = this.is_partial_payment;
            int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            String str2 = this.ap_consumer_uuid;
            int hashCode7 = hashCode6 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Document.Builder builder = new Document.Builder(21, false);
            builder.category = this.order_id;
            builder.title = this.total_order_amount;
            builder.document_date = this.total_number_of_installments;
            builder.url = this.installment_sequence_number;
            builder.owner_token = this.is_partial_payment;
            builder.token = this.ap_consumer_uuid;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.order_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "order_id=", arrayList);
            }
            Money money = this.total_order_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("total_order_amount=", money, arrayList);
            }
            Long l = this.total_number_of_installments;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("total_number_of_installments=", l, arrayList);
            }
            Long l2 = this.installment_sequence_number;
            if (l2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("installment_sequence_number=", l2, arrayList);
            }
            Boolean bool = this.is_partial_payment;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_partial_payment=", bool, arrayList);
            }
            String str2 = this.ap_consumer_uuid;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "ap_consumer_uuid=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Installment{", "}", 0, null, null, 56);
        }
    }

    public final class Summary extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Summary> CREATOR;
        public final String due_date;
        public final List merchant_logos;
        public final Money next_amount_due;
        public final String next_merchant_name;
        public final Long number_of_active_payments;
        public final Status status;

        public enum Status implements WireEnum {
            NORMAL(1),
            OVERDUE(2),
            MULTIPLE_OVERDUE(3),
            ACCOUNT_ONHOLD(4);

            public final int value;
            public static final LinkResult.Companion Companion = new LinkResult.Companion();
            public static final AfterPayRenderData$Summary$Status$Companion$ADAPTER$1 ADAPTER = new AfterPayRenderData$Summary$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, null);

            Status(int i) {
                this.value = i;
            }

            public static final Status fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return NORMAL;
                }
                if (i == 2) {
                    return OVERDUE;
                }
                if (i == 3) {
                    return MULTIPLE_OVERDUE;
                }
                if (i != 4) {
                    return null;
                }
                return ACCOUNT_ONHOLD;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            AfterPayRenderData$Summary$Companion$ADAPTER$1 afterPayRenderData$Summary$Companion$ADAPTER$1 = new AfterPayRenderData$Summary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Summary.class), "type.googleapis.com/squareup.franklin.AfterPayRenderData.Summary", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = afterPayRenderData$Summary$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(afterPayRenderData$Summary$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Summary(List list, Long l, Money money, String str, Status status, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.number_of_active_payments = l;
            this.next_amount_due = money;
            this.due_date = str;
            this.status = status;
            this.next_merchant_name = str2;
            this.merchant_logos = TransactorKt.immutableCopyOf("merchant_logos", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Summary)) {
                return false;
            }
            Summary summary = (Summary) obj;
            return Intrinsics.areEqual(unknownFields(), summary.unknownFields()) && Intrinsics.areEqual(this.merchant_logos, summary.merchant_logos) && Intrinsics.areEqual(this.number_of_active_payments, summary.number_of_active_payments) && Intrinsics.areEqual(this.next_amount_due, summary.next_amount_due) && Intrinsics.areEqual(this.due_date, summary.due_date) && this.status == summary.status && Intrinsics.areEqual(this.next_merchant_name, summary.next_merchant_name);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.merchant_logos);
            Long l = this.number_of_active_payments;
            int hashCode = (m + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Money money = this.next_amount_due;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            String str = this.due_date;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            Status status = this.status;
            int hashCode4 = (hashCode3 + (status != null ? status.hashCode() : 0)) * 37;
            String str2 = this.next_merchant_name;
            int hashCode5 = hashCode4 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Document.Builder builder = new Document.Builder(22, false);
            builder.title = this.merchant_logos;
            builder.document_date = this.number_of_active_payments;
            builder.url = this.next_amount_due;
            builder.category = this.due_date;
            builder.owner_token = this.status;
            builder.token = this.next_merchant_name;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.merchant_logos;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("merchant_logos=", arrayList, list);
            }
            Long l = this.number_of_active_payments;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("number_of_active_payments=", l, arrayList);
            }
            Money money = this.next_amount_due;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("next_amount_due=", money, arrayList);
            }
            String str = this.due_date;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "due_date=", arrayList);
            }
            Status status = this.status;
            if (status != null) {
                arrayList.add("status=" + status);
            }
            String str2 = this.next_merchant_name;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "next_merchant_name=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Summary{", "}", 0, null, null, 56);
        }
    }

    static {
        AfterPayRenderData$Companion$ADAPTER$1 afterPayRenderData$Companion$ADAPTER$1 = new AfterPayRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AfterPayRenderData.class), "type.googleapis.com/squareup.franklin.AfterPayRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = afterPayRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(afterPayRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterPayRenderData(ResourceEvent.Companion companion, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.rowType = companion;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AfterPayRenderData)) {
            return false;
        }
        AfterPayRenderData afterPayRenderData = (AfterPayRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), afterPayRenderData.unknownFields()) && Intrinsics.areEqual(this.rowType, afterPayRenderData.rowType);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResourceEvent.Companion companion = this.rowType;
        int hashCode2 = hashCode + (companion != null ? companion.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClaimData.Builder builder = new ClaimData.Builder(23);
        builder.claimable_payment = this.rowType;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResourceEvent.Companion companion = this.rowType;
        if (companion != null) {
            arrayList.add("rowType=" + companion);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AfterPayRenderData{", "}", 0, null, null, 56);
    }
}
