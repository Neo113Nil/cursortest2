package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.timecards.Timecard;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashapproxy/api/GetApOrderDetailsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/timecards/Timecard$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetApOrderDetailsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetApOrderDetailsResponse> CREATOR;
    public final List available_payment_methods;
    public final Avatar avatar;
    public final Text balance_summary;
    public final Text info_text;
    public final InfoTile info_tile;
    public final List order_details_rows;
    public final Text order_details_title;
    public final OrderPaymentMethod order_payment_method;
    public final List overflow_actions;
    public final Button primary_action_button;
    public final List schedule_payments;
    public final Button secondary_action_button;
    public final Text subtitle;
    public final SingleUsePaymentSummary sup_card;
    public final Text sup_message;
    public final SupTransactions sup_transactions;
    public final Text title;

    static {
        GetApOrderDetailsResponse$Companion$ADAPTER$1 getApOrderDetailsResponse$Companion$ADAPTER$1 = new GetApOrderDetailsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetApOrderDetailsResponse.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.GetApOrderDetailsResponse", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/order_details.proto");
        ADAPTER = getApOrderDetailsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getApOrderDetailsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetApOrderDetailsResponse(Avatar avatar, Text text, Text text2, OrderPaymentMethod orderPaymentMethod, Text text3, List list, Text text4, Text text5, List list2, List list3, Button button, InfoTile infoTile, SingleUsePaymentSummary singleUsePaymentSummary, Text text6, SupTransactions supTransactions, Button button2, List list4, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        byteString.getClass();
        this.avatar = avatar;
        this.title = text;
        this.subtitle = text2;
        this.order_payment_method = orderPaymentMethod;
        this.balance_summary = text3;
        this.info_text = text4;
        this.order_details_title = text5;
        this.primary_action_button = button;
        this.info_tile = infoTile;
        this.sup_card = singleUsePaymentSummary;
        this.sup_message = text6;
        this.sup_transactions = supTransactions;
        this.secondary_action_button = button2;
        this.schedule_payments = TransactorKt.immutableCopyOf("schedule_payments", list);
        this.order_details_rows = TransactorKt.immutableCopyOf("order_details_rows", list2);
        this.overflow_actions = TransactorKt.immutableCopyOf("overflow_actions", list3);
        this.available_payment_methods = TransactorKt.immutableCopyOf("available_payment_methods", list4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetApOrderDetailsResponse)) {
            return false;
        }
        GetApOrderDetailsResponse getApOrderDetailsResponse = (GetApOrderDetailsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getApOrderDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.avatar, getApOrderDetailsResponse.avatar) && Intrinsics.areEqual(this.title, getApOrderDetailsResponse.title) && Intrinsics.areEqual(this.subtitle, getApOrderDetailsResponse.subtitle) && Intrinsics.areEqual(this.order_payment_method, getApOrderDetailsResponse.order_payment_method) && Intrinsics.areEqual(this.balance_summary, getApOrderDetailsResponse.balance_summary) && Intrinsics.areEqual(this.schedule_payments, getApOrderDetailsResponse.schedule_payments) && Intrinsics.areEqual(this.info_text, getApOrderDetailsResponse.info_text) && Intrinsics.areEqual(this.order_details_title, getApOrderDetailsResponse.order_details_title) && Intrinsics.areEqual(this.order_details_rows, getApOrderDetailsResponse.order_details_rows) && Intrinsics.areEqual(this.overflow_actions, getApOrderDetailsResponse.overflow_actions) && Intrinsics.areEqual(this.primary_action_button, getApOrderDetailsResponse.primary_action_button) && Intrinsics.areEqual(this.info_tile, getApOrderDetailsResponse.info_tile) && Intrinsics.areEqual(this.sup_card, getApOrderDetailsResponse.sup_card) && Intrinsics.areEqual(this.sup_message, getApOrderDetailsResponse.sup_message) && Intrinsics.areEqual(this.sup_transactions, getApOrderDetailsResponse.sup_transactions) && Intrinsics.areEqual(this.secondary_action_button, getApOrderDetailsResponse.secondary_action_button) && Intrinsics.areEqual(this.available_payment_methods, getApOrderDetailsResponse.available_payment_methods);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Avatar avatar = this.avatar;
        int hashCode2 = (hashCode + (avatar != null ? avatar.hashCode() : 0)) * 37;
        Text text = this.title;
        int hashCode3 = (hashCode2 + (text != null ? text.hashCode() : 0)) * 37;
        Text text2 = this.subtitle;
        int hashCode4 = (hashCode3 + (text2 != null ? text2.hashCode() : 0)) * 37;
        OrderPaymentMethod orderPaymentMethod = this.order_payment_method;
        int hashCode5 = (hashCode4 + (orderPaymentMethod != null ? orderPaymentMethod.hashCode() : 0)) * 37;
        Text text3 = this.balance_summary;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (text3 != null ? text3.hashCode() : 0)) * 37, 37, this.schedule_payments);
        Text text4 = this.info_text;
        int hashCode6 = (m + (text4 != null ? text4.hashCode() : 0)) * 37;
        Text text5 = this.order_details_title;
        int m2 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (text5 != null ? text5.hashCode() : 0)) * 37, 37, this.order_details_rows), 37, this.overflow_actions);
        Button button = this.primary_action_button;
        int hashCode7 = (m2 + (button != null ? button.hashCode() : 0)) * 37;
        InfoTile infoTile = this.info_tile;
        int hashCode8 = (hashCode7 + (infoTile != null ? infoTile.hashCode() : 0)) * 37;
        SingleUsePaymentSummary singleUsePaymentSummary = this.sup_card;
        int hashCode9 = (hashCode8 + (singleUsePaymentSummary != null ? singleUsePaymentSummary.hashCode() : 0)) * 37;
        Text text6 = this.sup_message;
        int hashCode10 = (hashCode9 + (text6 != null ? text6.hashCode() : 0)) * 37;
        SupTransactions supTransactions = this.sup_transactions;
        int hashCode11 = (hashCode10 + (supTransactions != null ? supTransactions.hashCode() : 0)) * 37;
        Button button2 = this.secondary_action_button;
        int hashCode12 = this.available_payment_methods.hashCode() + ((hashCode11 + (button2 != null ? button2.hashCode() : 0)) * 37);
        this.hashCode = hashCode12;
        return hashCode12;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Timecard.Builder builder = new Timecard.Builder(1);
        builder.token = this.avatar;
        builder.shift_id = this.title;
        builder.merchant_token = this.subtitle;
        builder.employee_token = this.order_payment_method;
        builder.clockin_unit_token = this.balance_summary;
        builder.clockout_unit_token = this.schedule_payments;
        builder.note = this.info_text;
        builder.employee = this.order_details_title;
        builder.deleted = this.order_details_rows;
        builder.was_automatically_clocked_out = this.overflow_actions;
        builder.clockin_timestamp_ms = this.primary_action_button;
        builder.clockout_timestamp_ms = this.info_tile;
        builder.created_at_timestamp_ms = this.sup_card;
        builder.updated_at_timestamp_ms = this.sup_message;
        builder.hourly_wage = this.sup_transactions;
        builder.declared_tip = this.secondary_action_button;
        builder.employee_job_info = this.available_payment_methods;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Avatar avatar = this.avatar;
        if (avatar != null) {
            arrayList.add("avatar=" + avatar);
        }
        Text text = this.title;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("title=", text, arrayList);
        }
        Text text2 = this.subtitle;
        if (text2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("subtitle=", text2, arrayList);
        }
        OrderPaymentMethod orderPaymentMethod = this.order_payment_method;
        if (orderPaymentMethod != null) {
            arrayList.add("order_payment_method=" + orderPaymentMethod);
        }
        Text text3 = this.balance_summary;
        if (text3 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("balance_summary=", text3, arrayList);
        }
        List list = this.schedule_payments;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("schedule_payments=", arrayList, list);
        }
        Text text4 = this.info_text;
        if (text4 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("info_text=", text4, arrayList);
        }
        Text text5 = this.order_details_title;
        if (text5 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("order_details_title=", text5, arrayList);
        }
        List list2 = this.order_details_rows;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("order_details_rows=", arrayList, list2);
        }
        List list3 = this.overflow_actions;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("overflow_actions=", arrayList, list3);
        }
        Button button = this.primary_action_button;
        if (button != null) {
            arrayList.add("primary_action_button=" + button);
        }
        InfoTile infoTile = this.info_tile;
        if (infoTile != null) {
            arrayList.add("info_tile=" + infoTile);
        }
        SingleUsePaymentSummary singleUsePaymentSummary = this.sup_card;
        if (singleUsePaymentSummary != null) {
            arrayList.add("sup_card=" + singleUsePaymentSummary);
        }
        Text text6 = this.sup_message;
        if (text6 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("sup_message=", text6, arrayList);
        }
        SupTransactions supTransactions = this.sup_transactions;
        if (supTransactions != null) {
            arrayList.add("sup_transactions=" + supTransactions);
        }
        Button button2 = this.secondary_action_button;
        if (button2 != null) {
            arrayList.add("secondary_action_button=" + button2);
        }
        List list4 = this.available_payment_methods;
        if (!list4.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("available_payment_methods=", arrayList, list4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetApOrderDetailsResponse{", "}", 0, null, null, 56);
    }
}
