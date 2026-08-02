package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RecurringPaymentRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RecurringPaymentRenderData> CREATOR;
    public final String cancel_recurring_payment_url;
    public final String edit_recurring_payment_url;
    public final String icon_url;
    public final Boolean is_managed_account;
    public final Long payment_datetime;
    public final String schedule_description;
    public final String skip_payment_url;
    public final State state;
    public final String time_zone;

    public enum State implements WireEnum {
        STATE_UNSPECIFIED(0),
        UPCOMING(1),
        FAILED(2),
        SKIPPED(3);

        public static final RecurringPaymentRenderData$State$Companion$ADAPTER$1 ADAPTER;
        public static final LinkResult.Companion Companion;
        public final int value;

        static {
            State state = STATE_UNSPECIFIED;
            Companion = new LinkResult.Companion();
            ADAPTER = new RecurringPaymentRenderData$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, state);
        }

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return UPCOMING;
            }
            if (i == 2) {
                return FAILED;
            }
            if (i != 3) {
                return null;
            }
            return SKIPPED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        RecurringPaymentRenderData$Companion$ADAPTER$1 recurringPaymentRenderData$Companion$ADAPTER$1 = new RecurringPaymentRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecurringPaymentRenderData.class), "type.googleapis.com/squareup.franklin.RecurringPaymentRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = recurringPaymentRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(recurringPaymentRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringPaymentRenderData(String str, String str2, String str3, State state, Long l, String str4, String str5, Boolean bool, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.edit_recurring_payment_url = str;
        this.cancel_recurring_payment_url = str2;
        this.skip_payment_url = str3;
        this.state = state;
        this.payment_datetime = l;
        this.time_zone = str4;
        this.icon_url = str5;
        this.is_managed_account = bool;
        this.schedule_description = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecurringPaymentRenderData)) {
            return false;
        }
        RecurringPaymentRenderData recurringPaymentRenderData = (RecurringPaymentRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), recurringPaymentRenderData.unknownFields()) && Intrinsics.areEqual(this.edit_recurring_payment_url, recurringPaymentRenderData.edit_recurring_payment_url) && Intrinsics.areEqual(this.cancel_recurring_payment_url, recurringPaymentRenderData.cancel_recurring_payment_url) && Intrinsics.areEqual(this.skip_payment_url, recurringPaymentRenderData.skip_payment_url) && this.state == recurringPaymentRenderData.state && Intrinsics.areEqual(this.payment_datetime, recurringPaymentRenderData.payment_datetime) && Intrinsics.areEqual(this.time_zone, recurringPaymentRenderData.time_zone) && Intrinsics.areEqual(this.icon_url, recurringPaymentRenderData.icon_url) && Intrinsics.areEqual(this.is_managed_account, recurringPaymentRenderData.is_managed_account) && Intrinsics.areEqual(this.schedule_description, recurringPaymentRenderData.schedule_description);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.edit_recurring_payment_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cancel_recurring_payment_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.skip_payment_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        State state = this.state;
        int hashCode5 = (hashCode4 + (state != null ? state.hashCode() : 0)) * 37;
        Long l = this.payment_datetime;
        int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str4 = this.time_zone;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.icon_url;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Boolean bool = this.is_managed_account;
        int hashCode9 = (hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str6 = this.schedule_description;
        int hashCode10 = hashCode9 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Transfer.Builder builder = new Transfer.Builder(11, false);
        builder.token = this.edit_recurring_payment_url;
        builder.source = this.cancel_recurring_payment_url;
        builder.target = this.skip_payment_url;
        builder.state = this.state;
        builder.created_at = this.payment_datetime;
        builder.amount = this.time_zone;
        builder.push_amount = this.icon_url;
        builder.completed_at = this.is_managed_account;
        builder.failed_at = this.schedule_description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.edit_recurring_payment_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "edit_recurring_payment_url=", arrayList);
        }
        String str2 = this.cancel_recurring_payment_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "cancel_recurring_payment_url=", arrayList);
        }
        String str3 = this.skip_payment_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "skip_payment_url=", arrayList);
        }
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        Long l = this.payment_datetime;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("payment_datetime=", l, arrayList);
        }
        String str4 = this.time_zone;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "time_zone=", arrayList);
        }
        String str5 = this.icon_url;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "icon_url=", arrayList);
        }
        Boolean bool = this.is_managed_account;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_managed_account=", bool, arrayList);
        }
        String str6 = this.schedule_description;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "schedule_description=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecurringPaymentRenderData{", "}", 0, null, null, 56);
    }
}
