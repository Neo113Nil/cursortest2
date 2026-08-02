package com.squareup.protos.cash.cashtes.app.v1beta1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.protos.franklin.ui.UiAppLock;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/cashtes/app/v1beta1/UserDataResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/ExpenseSlice$Builder;", "Builder", "InteractionEvents", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserDataResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UserDataResponse> CREATOR;
    public final InteractionEvents event_status;
    public final Boolean has_consented;
    public final String header;
    public final ReturnStatus progress;
    public final Integer progress_percent;
    public final String subheader;

    public final class InteractionEvents extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InteractionEvents> CREATOR;
        public final Boolean show_badge;

        static {
            UserDataResponse$InteractionEvents$Companion$ADAPTER$1 userDataResponse$InteractionEvents$Companion$ADAPTER$1 = new UserDataResponse$InteractionEvents$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InteractionEvents.class), "type.googleapis.com/squareup.cash.cashtes.app.v1beta1.UserDataResponse.InteractionEvents", Syntax.PROTO_2, null, "squareup/cash/cashtes/app/v1beta1/user_data.proto");
            ADAPTER = userDataResponse$InteractionEvents$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(userDataResponse$InteractionEvents$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InteractionEvents(Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.show_badge = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InteractionEvents)) {
                return false;
            }
            InteractionEvents interactionEvents = (InteractionEvents) obj;
            return Intrinsics.areEqual(unknownFields(), interactionEvents.unknownFields()) && Intrinsics.areEqual(this.show_badge, interactionEvents.show_badge);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.show_badge;
            int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiAppLock.Builder builder = new UiAppLock.Builder(5);
            builder.activated = this.show_badge;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Boolean bool = this.show_badge;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("show_badge=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InteractionEvents{", "}", 0, null, null, 56);
        }
    }

    static {
        UserDataResponse$Companion$ADAPTER$1 userDataResponse$Companion$ADAPTER$1 = new UserDataResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UserDataResponse.class), "type.googleapis.com/squareup.cash.cashtes.app.v1beta1.UserDataResponse", Syntax.PROTO_2, null, "squareup/cash/cashtes/app/v1beta1/user_data.proto");
        ADAPTER = userDataResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(userDataResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserDataResponse(Boolean bool, InteractionEvents interactionEvents, ReturnStatus returnStatus, String str, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.has_consented = bool;
        this.event_status = interactionEvents;
        this.progress = returnStatus;
        this.header = str;
        this.subheader = str2;
        this.progress_percent = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserDataResponse)) {
            return false;
        }
        UserDataResponse userDataResponse = (UserDataResponse) obj;
        return Intrinsics.areEqual(unknownFields(), userDataResponse.unknownFields()) && Intrinsics.areEqual(this.has_consented, userDataResponse.has_consented) && Intrinsics.areEqual(this.event_status, userDataResponse.event_status) && this.progress == userDataResponse.progress && Intrinsics.areEqual(this.header, userDataResponse.header) && Intrinsics.areEqual(this.subheader, userDataResponse.subheader) && Intrinsics.areEqual(this.progress_percent, userDataResponse.progress_percent);
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
        int hashCode7 = hashCode6 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder(2);
        builder.requester = this.has_consented;
        builder.responder = this.event_status;
        builder.amount = this.progress;
        builder.slice_token = this.header;
        builder.status = this.subheader;
        builder.action = this.progress_percent;
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "UserDataResponse{", "}", 0, null, null, 56);
    }
}
