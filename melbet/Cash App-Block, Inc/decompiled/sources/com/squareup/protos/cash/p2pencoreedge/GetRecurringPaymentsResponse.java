package com.squareup.protos.cash.p2pencoreedge;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.p2pencore.v1.RecurringPayment;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.protos.cash.local.client.v1.GiftCard;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/p2pencoreedge/GetRecurringPaymentsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashsuggest/api/ToggleScreen$Builder;", "Builder", "RecurringPaymentWrapper", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetRecurringPaymentsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetRecurringPaymentsResponse> CREATOR;
    public final String create_url;
    public final List recurring_payments;

    public final class RecurringPaymentWrapper extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RecurringPaymentWrapper> CREATOR;
        public final String edit_url;
        public final RecurringPayment recurring_payment;
        public final String schedule_description;
        public final String time_to_payment;

        static {
            GetRecurringPaymentsResponse$RecurringPaymentWrapper$Companion$ADAPTER$1 getRecurringPaymentsResponse$RecurringPaymentWrapper$Companion$ADAPTER$1 = new GetRecurringPaymentsResponse$RecurringPaymentWrapper$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecurringPaymentWrapper.class), "type.googleapis.com/squareup.cash.p2pencoreedge.GetRecurringPaymentsResponse.RecurringPaymentWrapper", Syntax.PROTO_2, null, "squareup/cash/p2pencoreedge/service.proto");
            ADAPTER = getRecurringPaymentsResponse$RecurringPaymentWrapper$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getRecurringPaymentsResponse$RecurringPaymentWrapper$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecurringPaymentWrapper(RecurringPayment recurringPayment, String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.recurring_payment = recurringPayment;
            this.edit_url = str;
            this.schedule_description = str2;
            this.time_to_payment = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RecurringPaymentWrapper)) {
                return false;
            }
            RecurringPaymentWrapper recurringPaymentWrapper = (RecurringPaymentWrapper) obj;
            return Intrinsics.areEqual(unknownFields(), recurringPaymentWrapper.unknownFields()) && Intrinsics.areEqual(this.recurring_payment, recurringPaymentWrapper.recurring_payment) && Intrinsics.areEqual(this.edit_url, recurringPaymentWrapper.edit_url) && Intrinsics.areEqual(this.schedule_description, recurringPaymentWrapper.schedule_description) && Intrinsics.areEqual(this.time_to_payment, recurringPaymentWrapper.time_to_payment);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            RecurringPayment recurringPayment = this.recurring_payment;
            int hashCode2 = (hashCode + (recurringPayment != null ? recurringPayment.hashCode() : 0)) * 37;
            String str = this.edit_url;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.schedule_description;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.time_to_payment;
            int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GiftCard.Builder builder = new GiftCard.Builder(28, false);
            builder.gift_card_amount = this.recurring_payment;
            builder.id = this.edit_url;
            builder.last_4 = this.schedule_description;
            builder.gift_card_id = this.time_to_payment;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            RecurringPayment recurringPayment = this.recurring_payment;
            if (recurringPayment != null) {
                arrayList.add("recurring_payment=" + recurringPayment);
            }
            String str = this.edit_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "edit_url=", arrayList);
            }
            String str2 = this.schedule_description;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "schedule_description=", arrayList);
            }
            String str3 = this.time_to_payment;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "time_to_payment=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RecurringPaymentWrapper{", "}", 0, null, null, 56);
        }
    }

    static {
        GetRecurringPaymentsResponse$Companion$ADAPTER$1 getRecurringPaymentsResponse$Companion$ADAPTER$1 = new GetRecurringPaymentsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetRecurringPaymentsResponse.class), "type.googleapis.com/squareup.cash.p2pencoreedge.GetRecurringPaymentsResponse", Syntax.PROTO_2, null, "squareup/cash/p2pencoreedge/service.proto");
        ADAPTER = getRecurringPaymentsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getRecurringPaymentsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRecurringPaymentsResponse(List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.create_url = str;
        this.recurring_payments = TransactorKt.immutableCopyOf("recurring_payments", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetRecurringPaymentsResponse)) {
            return false;
        }
        GetRecurringPaymentsResponse getRecurringPaymentsResponse = (GetRecurringPaymentsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getRecurringPaymentsResponse.unknownFields()) && Intrinsics.areEqual(this.recurring_payments, getRecurringPaymentsResponse.recurring_payments) && Intrinsics.areEqual(this.create_url, getRecurringPaymentsResponse.create_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.recurring_payments);
        String str = this.create_url;
        int hashCode = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ToggleScreen.Builder builder = new ToggleScreen.Builder(28, false);
        builder.sections = this.recurring_payments;
        builder.toggle_title = this.create_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.recurring_payments;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("recurring_payments=", arrayList, list);
        }
        String str = this.create_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "create_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRecurringPaymentsResponse{", "}", 0, null, null, 56);
    }
}
