package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.lending.Loan;
import com.squareup.protos.hieroglyph.KeyScope;
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
public final class RemittancePaymentRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RemittancePaymentRenderData> CREATOR;
    public final Long action_required_by;
    public final String bank_account_number;
    public final String cancel_payment_url;
    public final Long delivery_date;
    public final String delivery_location;
    public final DeliveryType delivery_type;
    public final String exchange_rate;
    public final List fee_render_data;
    public final RecipientPaymentRenderData recipient_details;
    public final String recipient_reference_code;
    public final String recipient_reference_issuer;
    public final String repeat_payment_url;
    public final String scam_flow_url;
    public final ScamReportStatus scam_report_status;

    public enum DeliveryType implements WireEnum {
        BANK_DEPOSIT(1),
        CASH_PICKUP(2);

        public final int value;
        public static final Trigger.Companion Companion = new Trigger.Companion();
        public static final RemittancePaymentRenderData$DeliveryType$Companion$ADAPTER$1 ADAPTER = new RemittancePaymentRenderData$DeliveryType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DeliveryType.class), Syntax.PROTO_2, null);

        DeliveryType(int i) {
            this.value = i;
        }

        public static final DeliveryType fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return BANK_DEPOSIT;
            }
            if (i != 2) {
                return null;
            }
            return CASH_PICKUP;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class RecipientPaymentRenderData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RecipientPaymentRenderData> CREATOR;
        public final GlobalAddress address;
        public final String phone_number;

        static {
            RemittancePaymentRenderData$RecipientPaymentRenderData$Companion$ADAPTER$1 remittancePaymentRenderData$RecipientPaymentRenderData$Companion$ADAPTER$1 = new RemittancePaymentRenderData$RecipientPaymentRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecipientPaymentRenderData.class), "type.googleapis.com/squareup.franklin.RemittancePaymentRenderData.RecipientPaymentRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = remittancePaymentRenderData$RecipientPaymentRenderData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(remittancePaymentRenderData$RecipientPaymentRenderData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecipientPaymentRenderData(String str, GlobalAddress globalAddress, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.phone_number = str;
            this.address = globalAddress;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RecipientPaymentRenderData)) {
                return false;
            }
            RecipientPaymentRenderData recipientPaymentRenderData = (RecipientPaymentRenderData) obj;
            return Intrinsics.areEqual(unknownFields(), recipientPaymentRenderData.unknownFields()) && Intrinsics.areEqual(this.phone_number, recipientPaymentRenderData.phone_number) && Intrinsics.areEqual(this.address, recipientPaymentRenderData.address);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.phone_number;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            GlobalAddress globalAddress = this.address;
            int hashCode3 = hashCode2 + (globalAddress != null ? globalAddress.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            AppLinks.Builder builder = new AppLinks.Builder(14);
            builder.f1372android = this.phone_number;
            builder.ios = this.address;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.phone_number != null) {
                arrayList.add("phone_number=██");
            }
            GlobalAddress globalAddress = this.address;
            if (globalAddress != null) {
                arrayList.add("address=" + globalAddress);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RecipientPaymentRenderData{", "}", 0, null, null, 56);
        }
    }

    public enum ScamReportStatus implements WireEnum {
        NOT_SUBMITTED(1),
        SUBMITTED(2);

        public final int value;
        public static final KeyScope.Companion Companion = new KeyScope.Companion();
        public static final RemittancePaymentRenderData$ScamReportStatus$Companion$ADAPTER$1 ADAPTER = new RemittancePaymentRenderData$ScamReportStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ScamReportStatus.class), Syntax.PROTO_2, null);

        ScamReportStatus(int i) {
            this.value = i;
        }

        public static final ScamReportStatus fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return NOT_SUBMITTED;
            }
            if (i != 2) {
                return null;
            }
            return SUBMITTED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        RemittancePaymentRenderData$Companion$ADAPTER$1 remittancePaymentRenderData$Companion$ADAPTER$1 = new RemittancePaymentRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RemittancePaymentRenderData.class), "type.googleapis.com/squareup.franklin.RemittancePaymentRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = remittancePaymentRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(remittancePaymentRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemittancePaymentRenderData(String str, List list, DeliveryType deliveryType, String str2, String str3, String str4, String str5, Long l, String str6, Long l2, RecipientPaymentRenderData recipientPaymentRenderData, String str7, String str8, ScamReportStatus scamReportStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.exchange_rate = str;
        this.delivery_type = deliveryType;
        this.delivery_location = str2;
        this.recipient_reference_code = str3;
        this.recipient_reference_issuer = str4;
        this.bank_account_number = str5;
        this.action_required_by = l;
        this.repeat_payment_url = str6;
        this.delivery_date = l2;
        this.recipient_details = recipientPaymentRenderData;
        this.cancel_payment_url = str7;
        this.scam_flow_url = str8;
        this.scam_report_status = scamReportStatus;
        this.fee_render_data = TransactorKt.immutableCopyOf("fee_render_data", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemittancePaymentRenderData)) {
            return false;
        }
        RemittancePaymentRenderData remittancePaymentRenderData = (RemittancePaymentRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), remittancePaymentRenderData.unknownFields()) && Intrinsics.areEqual(this.exchange_rate, remittancePaymentRenderData.exchange_rate) && Intrinsics.areEqual(this.fee_render_data, remittancePaymentRenderData.fee_render_data) && this.delivery_type == remittancePaymentRenderData.delivery_type && Intrinsics.areEqual(this.delivery_location, remittancePaymentRenderData.delivery_location) && Intrinsics.areEqual(this.recipient_reference_code, remittancePaymentRenderData.recipient_reference_code) && Intrinsics.areEqual(this.recipient_reference_issuer, remittancePaymentRenderData.recipient_reference_issuer) && Intrinsics.areEqual(this.bank_account_number, remittancePaymentRenderData.bank_account_number) && Intrinsics.areEqual(this.action_required_by, remittancePaymentRenderData.action_required_by) && Intrinsics.areEqual(this.repeat_payment_url, remittancePaymentRenderData.repeat_payment_url) && Intrinsics.areEqual(this.delivery_date, remittancePaymentRenderData.delivery_date) && Intrinsics.areEqual(this.recipient_details, remittancePaymentRenderData.recipient_details) && Intrinsics.areEqual(this.cancel_payment_url, remittancePaymentRenderData.cancel_payment_url) && Intrinsics.areEqual(this.scam_flow_url, remittancePaymentRenderData.scam_flow_url) && this.scam_report_status == remittancePaymentRenderData.scam_report_status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.exchange_rate;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.fee_render_data);
        DeliveryType deliveryType = this.delivery_type;
        int hashCode2 = (m + (deliveryType != null ? deliveryType.hashCode() : 0)) * 37;
        String str2 = this.delivery_location;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.recipient_reference_code;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.recipient_reference_issuer;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.bank_account_number;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Long l = this.action_required_by;
        int hashCode7 = (hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str6 = this.repeat_payment_url;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Long l2 = this.delivery_date;
        int hashCode9 = (hashCode8 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        RecipientPaymentRenderData recipientPaymentRenderData = this.recipient_details;
        int hashCode10 = (hashCode9 + (recipientPaymentRenderData != null ? recipientPaymentRenderData.hashCode() : 0)) * 37;
        String str7 = this.cancel_payment_url;
        int hashCode11 = (hashCode10 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.scam_flow_url;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 37;
        ScamReportStatus scamReportStatus = this.scam_report_status;
        int hashCode13 = hashCode12 + (scamReportStatus != null ? scamReportStatus.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Loan.Builder builder = new Loan.Builder(11);
        builder.token = this.exchange_rate;
        builder.detail_rows = this.fee_render_data;
        builder.principal_amount = this.delivery_type;
        builder.credit_line_token = this.delivery_location;
        builder.setup_fee_amount = this.recipient_reference_code;
        builder.outstanding_amount = this.recipient_reference_issuer;
        builder.late_fee_amount = this.bank_account_number;
        builder.borrowed_at = this.action_required_by;
        builder.interest_amount = this.repeat_payment_url;
        builder.due_at = this.delivery_date;
        builder.setup_fee_bps = this.recipient_details;
        builder.state = this.cancel_payment_url;
        builder.lending_product = this.scam_flow_url;
        builder.bnpl_data = this.scam_report_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.exchange_rate;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "exchange_rate=", arrayList);
        }
        List list = this.fee_render_data;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("fee_render_data=", arrayList, list);
        }
        DeliveryType deliveryType = this.delivery_type;
        if (deliveryType != null) {
            arrayList.add("delivery_type=" + deliveryType);
        }
        String str2 = this.delivery_location;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "delivery_location=", arrayList);
        }
        String str3 = this.recipient_reference_code;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "recipient_reference_code=", arrayList);
        }
        String str4 = this.recipient_reference_issuer;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "recipient_reference_issuer=", arrayList);
        }
        if (this.bank_account_number != null) {
            arrayList.add("bank_account_number=██");
        }
        Long l = this.action_required_by;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("action_required_by=", l, arrayList);
        }
        String str5 = this.repeat_payment_url;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "repeat_payment_url=", arrayList);
        }
        Long l2 = this.delivery_date;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("delivery_date=", l2, arrayList);
        }
        if (this.recipient_details != null) {
            arrayList.add("recipient_details=██");
        }
        String str6 = this.cancel_payment_url;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "cancel_payment_url=", arrayList);
        }
        String str7 = this.scam_flow_url;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "scam_flow_url=", arrayList);
        }
        ScamReportStatus scamReportStatus = this.scam_report_status;
        if (scamReportStatus != null) {
            arrayList.add("scam_report_status=" + scamReportStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RemittancePaymentRenderData{", "}", 0, null, null, 56);
    }
}
