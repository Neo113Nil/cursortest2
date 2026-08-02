package com.squareup.protos.cash.incidentalerts.app.v1;

import android.os.Parcelable;
import com.bugsnag.android.internal.StringUtils;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.favorites.Favorite;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.groups.GroupParticipant;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/incidentalerts/app/v1/SubscribeToIncidentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/GroupParticipant$Builder;", "Builder", "com/bugsnag/android/internal/StringUtils", "Success", "Failure", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SubscribeToIncidentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubscribeToIncidentResponse> CREATOR;
    public final StringUtils result;

    public final class Failure extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Failure> CREATOR;
        public final String reason;

        static {
            SubscribeToIncidentResponse$Failure$Companion$ADAPTER$1 subscribeToIncidentResponse$Failure$Companion$ADAPTER$1 = new SubscribeToIncidentResponse$Failure$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Failure.class), "type.googleapis.com/squareup.cash.incidentalerts.app.v1.SubscribeToIncidentResponse.Failure", Syntax.PROTO_2, null, "squareup/cash/incidentalerts/app/v1/app.proto");
            ADAPTER = subscribeToIncidentResponse$Failure$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(subscribeToIncidentResponse$Failure$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.reason = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.areEqual(unknownFields(), failure.unknownFields()) && Intrinsics.areEqual(this.reason, failure.reason);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.reason;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Favorite.Builder builder = new Favorite.Builder(20);
            builder.favorite_customer_token = this.reason;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.reason;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "reason=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Failure{", "}", 0, null, null, 56);
        }
    }

    public final class Success extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Success> CREATOR;

        static {
            SubscribeToIncidentResponse$Success$Companion$ADAPTER$1 subscribeToIncidentResponse$Success$Companion$ADAPTER$1 = new SubscribeToIncidentResponse$Success$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Success.class), "type.googleapis.com/squareup.cash.incidentalerts.app.v1.SubscribeToIncidentResponse.Success", Syntax.PROTO_2, null, "squareup/cash/incidentalerts/app/v1/app.proto");
            ADAPTER = subscribeToIncidentResponse$Success$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(subscribeToIncidentResponse$Success$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(unknownFields(), ((Success) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.OpenID.Builder builder = new Action.OpenID.Builder(5);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "Success{}";
        }
    }

    static {
        SubscribeToIncidentResponse$Companion$ADAPTER$1 subscribeToIncidentResponse$Companion$ADAPTER$1 = new SubscribeToIncidentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SubscribeToIncidentResponse.class), "type.googleapis.com/squareup.cash.incidentalerts.app.v1.SubscribeToIncidentResponse", Syntax.PROTO_2, null, "squareup/cash/incidentalerts/app/v1/app.proto");
        ADAPTER = subscribeToIncidentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(subscribeToIncidentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribeToIncidentResponse(StringUtils stringUtils, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.result = stringUtils;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubscribeToIncidentResponse)) {
            return false;
        }
        SubscribeToIncidentResponse subscribeToIncidentResponse = (SubscribeToIncidentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), subscribeToIncidentResponse.unknownFields()) && Intrinsics.areEqual(this.result, subscribeToIncidentResponse.result);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        StringUtils stringUtils = this.result;
        int hashCode2 = hashCode + (stringUtils != null ? stringUtils.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(3);
        builder.f1276type = this.result;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StringUtils stringUtils = this.result;
        if (stringUtils != null) {
            arrayList.add("result=" + stringUtils);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubscribeToIncidentResponse{", "}", 0, null, null, 56);
    }
}
