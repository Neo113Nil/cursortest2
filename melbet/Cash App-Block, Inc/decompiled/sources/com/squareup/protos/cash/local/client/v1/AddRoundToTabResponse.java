package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.datadog.android.core.internal.metrics.RemovalReason;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.protos.cash.local.client.v1.UpdateCartResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/AddRoundToTabResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/GroupParticipant$Builder;", "Builder", "com/datadog/android/core/internal/metrics/RemovalReason", "Success", "Error", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AddRoundToTabResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddRoundToTabResponse> CREATOR;
    public final RemovalReason response;

    public final class Error extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Error> CREATOR;
        public final CreateCartResponse current_cart;
        public final LocalErrorResponse error_response;

        static {
            AddRoundToTabResponse$Error$Companion$ADAPTER$1 addRoundToTabResponse$Error$Companion$ADAPTER$1 = new AddRoundToTabResponse$Error$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Error.class), "type.googleapis.com/squareup.cash.local.client.v1.AddRoundToTabResponse.Error", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = addRoundToTabResponse$Error$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(addRoundToTabResponse$Error$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(CreateCartResponse createCartResponse, LocalErrorResponse localErrorResponse, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.error_response = localErrorResponse;
            this.current_cart = createCartResponse;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(unknownFields(), error.unknownFields()) && Intrinsics.areEqual(this.error_response, error.error_response) && Intrinsics.areEqual(this.current_cart, error.current_cart);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalErrorResponse localErrorResponse = this.error_response;
            int hashCode2 = (hashCode + (localErrorResponse != null ? localErrorResponse.hashCode() : 0)) * 37;
            CreateCartResponse createCartResponse = this.current_cart;
            int hashCode3 = hashCode2 + (createCartResponse != null ? createCartResponse.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UpdateCartResponse.Error.Builder builder = new UpdateCartResponse.Error.Builder(1);
            builder.error_response = this.error_response;
            builder.current_cart = this.current_cart;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalErrorResponse localErrorResponse = this.error_response;
            if (localErrorResponse != null) {
                arrayList.add("error_response=" + localErrorResponse);
            }
            CreateCartResponse createCartResponse = this.current_cart;
            if (createCartResponse != null) {
                arrayList.add("current_cart=" + createCartResponse);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Error{", "}", 0, null, null, 56);
        }
    }

    public final class Success extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Success> CREATOR;
        public final CreateCartResponse updated_cart;

        static {
            AddRoundToTabResponse$Success$Companion$ADAPTER$1 addRoundToTabResponse$Success$Companion$ADAPTER$1 = new AddRoundToTabResponse$Success$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Success.class), "type.googleapis.com/squareup.cash.local.client.v1.AddRoundToTabResponse.Success", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = addRoundToTabResponse$Success$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(addRoundToTabResponse$Success$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(CreateCartResponse createCartResponse, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.updated_cart = createCartResponse;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(unknownFields(), success.unknownFields()) && Intrinsics.areEqual(this.updated_cart, success.updated_cart);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CreateCartResponse createCartResponse = this.updated_cart;
            int hashCode2 = hashCode + (createCartResponse != null ? createCartResponse.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UpdateCartResponse.Success.Builder builder = new UpdateCartResponse.Success.Builder(1);
            builder.updated_cart = this.updated_cart;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            CreateCartResponse createCartResponse = this.updated_cart;
            if (createCartResponse != null) {
                arrayList.add("updated_cart=" + createCartResponse);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Success{", "}", 0, null, null, 56);
        }
    }

    static {
        AddRoundToTabResponse$Companion$ADAPTER$1 addRoundToTabResponse$Companion$ADAPTER$1 = new AddRoundToTabResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AddRoundToTabResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.AddRoundToTabResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = addRoundToTabResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(addRoundToTabResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddRoundToTabResponse(RemovalReason removalReason, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = removalReason;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddRoundToTabResponse)) {
            return false;
        }
        AddRoundToTabResponse addRoundToTabResponse = (AddRoundToTabResponse) obj;
        return Intrinsics.areEqual(unknownFields(), addRoundToTabResponse.unknownFields()) && Intrinsics.areEqual(this.response, addRoundToTabResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RemovalReason removalReason = this.response;
        int hashCode2 = hashCode + (removalReason != null ? removalReason.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(14);
        builder.f1276type = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RemovalReason removalReason = this.response;
        if (removalReason != null) {
            arrayList.add("response=" + removalReason);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddRoundToTabResponse{", "}", 0, null, null, 56);
    }
}
