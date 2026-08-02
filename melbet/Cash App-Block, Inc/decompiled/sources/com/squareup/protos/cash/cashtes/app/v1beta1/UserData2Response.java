package com.squareup.protos.cash.cashtes.app.v1beta1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.franklin.common.PaymentRewardStatus;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/cashtes/app/v1beta1/UserData2Response;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/lending/PrepurchaseCashCardAppletData$Builder;", "Builder", "InteractionEvents", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserData2Response extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UserData2Response> CREATOR;
    public final InteractionEvents event_status;
    public final Boolean has_bitcoin_availability;
    public final Boolean has_consented;
    public final String header;
    public final String header_emphasized;
    public final String header_regular;
    public final ReturnStatus progress;
    public final Integer progress_percent;
    public final String subheader;

    public final class InteractionEvents extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InteractionEvents> CREATOR;
        public final String badge_text;
        public final Boolean show_badge;

        static {
            UserData2Response$InteractionEvents$Companion$ADAPTER$1 userData2Response$InteractionEvents$Companion$ADAPTER$1 = new UserData2Response$InteractionEvents$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InteractionEvents.class), "type.googleapis.com/squareup.cash.cashtes.app.v1beta1.UserData2Response.InteractionEvents", Syntax.PROTO_2, null, "squareup/cash/cashtes/app/v1beta1/user_data_2.proto");
            ADAPTER = userData2Response$InteractionEvents$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(userData2Response$InteractionEvents$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InteractionEvents(String str, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.show_badge = bool;
            this.badge_text = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InteractionEvents)) {
                return false;
            }
            InteractionEvents interactionEvents = (InteractionEvents) obj;
            return Intrinsics.areEqual(unknownFields(), interactionEvents.unknownFields()) && Intrinsics.areEqual(this.show_badge, interactionEvents.show_badge) && Intrinsics.areEqual(this.badge_text, interactionEvents.badge_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.show_badge;
            int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            String str = this.badge_text;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PaymentRewardStatus.Builder builder = new PaymentRewardStatus.Builder(3);
            builder.show_payments = this.show_badge;
            builder.main_text = this.badge_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Boolean bool = this.show_badge;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("show_badge=", bool, arrayList);
            }
            if (this.badge_text != null) {
                arrayList.add("badge_text=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InteractionEvents{", "}", 0, null, null, 56);
        }
    }

    static {
        UserData2Response$Companion$ADAPTER$1 userData2Response$Companion$ADAPTER$1 = new UserData2Response$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UserData2Response.class), "type.googleapis.com/squareup.cash.cashtes.app.v1beta1.UserData2Response", Syntax.PROTO_2, null, "squareup/cash/cashtes/app/v1beta1/user_data_2.proto");
        ADAPTER = userData2Response$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(userData2Response$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserData2Response(Boolean bool, InteractionEvents interactionEvents, ReturnStatus returnStatus, String str, String str2, Integer num, String str3, String str4, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.has_consented = bool;
        this.event_status = interactionEvents;
        this.progress = returnStatus;
        this.header = str;
        this.subheader = str2;
        this.progress_percent = num;
        this.header_emphasized = str3;
        this.header_regular = str4;
        this.has_bitcoin_availability = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserData2Response)) {
            return false;
        }
        UserData2Response userData2Response = (UserData2Response) obj;
        return Intrinsics.areEqual(unknownFields(), userData2Response.unknownFields()) && Intrinsics.areEqual(this.has_consented, userData2Response.has_consented) && Intrinsics.areEqual(this.event_status, userData2Response.event_status) && this.progress == userData2Response.progress && Intrinsics.areEqual(this.header, userData2Response.header) && Intrinsics.areEqual(this.subheader, userData2Response.subheader) && Intrinsics.areEqual(this.progress_percent, userData2Response.progress_percent) && Intrinsics.areEqual(this.header_emphasized, userData2Response.header_emphasized) && Intrinsics.areEqual(this.header_regular, userData2Response.header_regular) && Intrinsics.areEqual(this.has_bitcoin_availability, userData2Response.has_bitcoin_availability);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.has_consented;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        InteractionEvents interactionEvents = this.event_status;
        int hashCode3 = (hashCode2 + (interactionEvents != null ? interactionEvents.hashCode() : 0)) * 37;
        ReturnStatus returnStatus = this.progress;
        int hashCode4 = (hashCode3 + (returnStatus != null ? returnStatus.hashCode() : 0)) * 37;
        String str = this.header;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subheader;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.progress_percent;
        int hashCode7 = (hashCode6 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str3 = this.header_emphasized;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.header_regular;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool2 = this.has_bitcoin_availability;
        int hashCode10 = hashCode9 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(13, false);
        builder.locale = this.has_consented;
        builder.title = this.event_status;
        builder.info_rows_header = this.progress;
        builder.footer_text = this.header;
        builder.loadable_subtitle = this.subheader;
        builder.info_rows = this.progress_percent;
        builder.primary_footer_button_state = this.header_emphasized;
        builder.secondary_footer_button_state = this.header_regular;
        builder.payment_plans_data = this.has_bitcoin_availability;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.has_consented;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_consented=", bool, arrayList);
        }
        InteractionEvents interactionEvents = this.event_status;
        if (interactionEvents != null) {
            arrayList.add("event_status=" + interactionEvents);
        }
        if (this.progress != null) {
            arrayList.add("progress=██");
        }
        if (this.header != null) {
            arrayList.add("header=██");
        }
        if (this.subheader != null) {
            arrayList.add("subheader=██");
        }
        if (this.progress_percent != null) {
            arrayList.add("progress_percent=██");
        }
        if (this.header_emphasized != null) {
            arrayList.add("header_emphasized=██");
        }
        if (this.header_regular != null) {
            arrayList.add("header_regular=██");
        }
        if (this.has_bitcoin_availability != null) {
            arrayList.add("has_bitcoin_availability=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UserData2Response{", "}", 0, null, null, 56);
    }
}
