package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzji;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/UpdateUserIntentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalBuyer$Builder;", "Builder", "com/google/android/gms/internal/mlkit_vision_common/zzji", "Success", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateUserIntentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateUserIntentResponse> CREATOR;
    public final zzji response;

    public final class Success extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Success> CREATOR;
        public final LocalUserIntent user_intent;

        static {
            UpdateUserIntentResponse$Success$Companion$ADAPTER$1 updateUserIntentResponse$Success$Companion$ADAPTER$1 = new UpdateUserIntentResponse$Success$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Success.class), "type.googleapis.com/squareup.cash.local.client.v1.UpdateUserIntentResponse.Success", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_user_intent.proto");
            ADAPTER = updateUserIntentResponse$Success$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(updateUserIntentResponse$Success$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(LocalUserIntent localUserIntent, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.user_intent = localUserIntent;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(unknownFields(), success.unknownFields()) && Intrinsics.areEqual(this.user_intent, success.user_intent);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalUserIntent localUserIntent = this.user_intent;
            int hashCode2 = hashCode + (localUserIntent != null ? localUserIntent.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            LocalBuyer.Builder builder = new LocalBuyer.Builder(15);
            builder.local_buyer = this.user_intent;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalUserIntent localUserIntent = this.user_intent;
            if (localUserIntent != null) {
                arrayList.add("user_intent=" + localUserIntent);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Success{", "}", 0, null, null, 56);
        }
    }

    static {
        UpdateUserIntentResponse$Companion$ADAPTER$1 updateUserIntentResponse$Companion$ADAPTER$1 = new UpdateUserIntentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpdateUserIntentResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.UpdateUserIntentResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_user_intent.proto");
        ADAPTER = updateUserIntentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(updateUserIntentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateUserIntentResponse(zzji zzjiVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = zzjiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateUserIntentResponse)) {
            return false;
        }
        UpdateUserIntentResponse updateUserIntentResponse = (UpdateUserIntentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), updateUserIntentResponse.unknownFields()) && Intrinsics.areEqual(this.response, updateUserIntentResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzji zzjiVar = this.response;
        int hashCode2 = hashCode + (zzjiVar != null ? zzjiVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(14);
        builder.local_buyer = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzji zzjiVar = this.response;
        if (zzjiVar != null) {
            arrayList.add("response=" + zzjiVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateUserIntentResponse{", "}", 0, null, null, 56);
    }
}
