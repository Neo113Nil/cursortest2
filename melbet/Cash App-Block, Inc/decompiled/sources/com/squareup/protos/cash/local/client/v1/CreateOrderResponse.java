package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.core.persistence.SerializerKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.protos.cash.local.client.v1.InputValue;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.UpdateCartResponse;
import com.squareup.protos.cash.money.content.MoneyTab;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/CreateOrderResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/GroupParticipant$Builder;", "Builder", "com/datadog/android/core/persistence/SerializerKt", "InputsNotFulfilled", "UpdatedCartResponse", "Success", "OpenTab", "ErrorResponse", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateOrderResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateOrderResponse> CREATOR;
    public final SerializerKt response;

    public final class ErrorResponse extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ErrorResponse> CREATOR;
        public final List errors;

        public final class Error extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Error> CREATOR;
            public final String message;

            /* renamed from: type, reason: collision with root package name */
            public final LocalErrorResponse.Error.Type f1304type;

            static {
                CreateOrderResponse$ErrorResponse$Error$Companion$ADAPTER$1 createOrderResponse$ErrorResponse$Error$Companion$ADAPTER$1 = new CreateOrderResponse$ErrorResponse$Error$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Error.class), "type.googleapis.com/squareup.cash.local.client.v1.CreateOrderResponse.ErrorResponse.Error", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
                ADAPTER = createOrderResponse$ErrorResponse$Error$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(createOrderResponse$ErrorResponse$Error$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(String str, LocalErrorResponse.Error.Type type2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.message = str;
                this.f1304type = type2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return Intrinsics.areEqual(unknownFields(), error.unknownFields()) && Intrinsics.areEqual(this.message, error.message) && this.f1304type == error.f1304type;
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.message;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                LocalErrorResponse.Error.Type type2 = this.f1304type;
                int hashCode3 = hashCode2 + (type2 != null ? type2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                InputValue.Builder builder = new InputValue.Builder(1);
                builder.input_id = this.message;
                builder.value = this.f1304type;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.message;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message=", arrayList);
                }
                LocalErrorResponse.Error.Type type2 = this.f1304type;
                if (type2 != null) {
                    arrayList.add("type=" + type2);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Error{", "}", 0, null, null, 56);
            }
        }

        static {
            CreateOrderResponse$ErrorResponse$Companion$ADAPTER$1 createOrderResponse$ErrorResponse$Companion$ADAPTER$1 = new CreateOrderResponse$ErrorResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ErrorResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.CreateOrderResponse.ErrorResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = createOrderResponse$ErrorResponse$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(createOrderResponse$ErrorResponse$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorResponse(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.errors = TransactorKt.immutableCopyOf("errors", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ErrorResponse)) {
                return false;
            }
            ErrorResponse errorResponse = (ErrorResponse) obj;
            return Intrinsics.areEqual(unknownFields(), errorResponse.unknownFields()) && Intrinsics.areEqual(this.errors, errorResponse.errors);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.errors.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            MoneyTab.Builder builder = new MoneyTab.Builder(5, false);
            builder.applets = this.errors;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.errors;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("errors=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ErrorResponse{", "}", 0, null, null, 56);
        }
    }

    public final class InputsNotFulfilled extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InputsNotFulfilled> CREATOR;
        public final CreateCartResponse cart_response;
        public final List input_errors;

        public final class InputError extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<InputError> CREATOR;
            public final LocalErrorResponse.Error error;
            public final String input_id;

            static {
                CreateOrderResponse$InputsNotFulfilled$InputError$Companion$ADAPTER$1 createOrderResponse$InputsNotFulfilled$InputError$Companion$ADAPTER$1 = new CreateOrderResponse$InputsNotFulfilled$InputError$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InputError.class), "type.googleapis.com/squareup.cash.local.client.v1.CreateOrderResponse.InputsNotFulfilled.InputError", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
                ADAPTER = createOrderResponse$InputsNotFulfilled$InputError$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(createOrderResponse$InputsNotFulfilled$InputError$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InputError(String str, LocalErrorResponse.Error error, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.input_id = str;
                this.error = error;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof InputError)) {
                    return false;
                }
                InputError inputError = (InputError) obj;
                return Intrinsics.areEqual(unknownFields(), inputError.unknownFields()) && Intrinsics.areEqual(this.input_id, inputError.input_id) && Intrinsics.areEqual(this.error, inputError.error);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.input_id;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                LocalErrorResponse.Error error = this.error;
                int hashCode3 = hashCode2 + (error != null ? error.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                InputValue.Builder builder = new InputValue.Builder(3);
                builder.input_id = this.input_id;
                builder.value = this.error;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.input_id;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "input_id=", arrayList);
                }
                LocalErrorResponse.Error error = this.error;
                if (error != null) {
                    arrayList.add("error=" + error);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "InputError{", "}", 0, null, null, 56);
            }
        }

        static {
            CreateOrderResponse$InputsNotFulfilled$Companion$ADAPTER$1 createOrderResponse$InputsNotFulfilled$Companion$ADAPTER$1 = new CreateOrderResponse$InputsNotFulfilled$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InputsNotFulfilled.class), "type.googleapis.com/squareup.cash.local.client.v1.CreateOrderResponse.InputsNotFulfilled", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = createOrderResponse$InputsNotFulfilled$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(createOrderResponse$InputsNotFulfilled$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InputsNotFulfilled(CreateCartResponse createCartResponse, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.cart_response = createCartResponse;
            this.input_errors = TransactorKt.immutableCopyOf("input_errors", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InputsNotFulfilled)) {
                return false;
            }
            InputsNotFulfilled inputsNotFulfilled = (InputsNotFulfilled) obj;
            return Intrinsics.areEqual(unknownFields(), inputsNotFulfilled.unknownFields()) && Intrinsics.areEqual(this.cart_response, inputsNotFulfilled.cart_response) && Intrinsics.areEqual(this.input_errors, inputsNotFulfilled.input_errors);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CreateCartResponse createCartResponse = this.cart_response;
            int hashCode2 = this.input_errors.hashCode() + ((hashCode + (createCartResponse != null ? createCartResponse.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            InputValue.Builder builder = new InputValue.Builder(2);
            builder.input_id = this.cart_response;
            builder.value = this.input_errors;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            CreateCartResponse createCartResponse = this.cart_response;
            if (createCartResponse != null) {
                arrayList.add("cart_response=" + createCartResponse);
            }
            List list = this.input_errors;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("input_errors=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InputsNotFulfilled{", "}", 0, null, null, 56);
        }
    }

    public final class OpenTab extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OpenTab> CREATOR;
        public final LocalCart active_cart;

        static {
            CreateOrderResponse$OpenTab$Companion$ADAPTER$1 createOrderResponse$OpenTab$Companion$ADAPTER$1 = new CreateOrderResponse$OpenTab$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OpenTab.class), "type.googleapis.com/squareup.cash.local.client.v1.CreateOrderResponse.OpenTab", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = createOrderResponse$OpenTab$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(createOrderResponse$OpenTab$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenTab(LocalCart localCart, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.active_cart = localCart;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OpenTab)) {
                return false;
            }
            OpenTab openTab = (OpenTab) obj;
            return Intrinsics.areEqual(unknownFields(), openTab.unknownFields()) && Intrinsics.areEqual(this.active_cart, openTab.active_cart);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalCart localCart = this.active_cart;
            int hashCode2 = hashCode + (localCart != null ? localCart.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GroupParticipant.Builder builder = new GroupParticipant.Builder(22);
            builder.f1276type = this.active_cart;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalCart localCart = this.active_cart;
            if (localCart != null) {
                arrayList.add("active_cart=" + localCart);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OpenTab{", "}", 0, null, null, 56);
        }
    }

    public final class Success extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Success> CREATOR;
        public final String account_creation_intent_token;
        public final LocalOrder order;

        static {
            CreateOrderResponse$Success$Companion$ADAPTER$1 createOrderResponse$Success$Companion$ADAPTER$1 = new CreateOrderResponse$Success$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Success.class), "type.googleapis.com/squareup.cash.local.client.v1.CreateOrderResponse.Success", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = createOrderResponse$Success$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(createOrderResponse$Success$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(LocalOrder localOrder, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.order = localOrder;
            this.account_creation_intent_token = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(unknownFields(), success.unknownFields()) && Intrinsics.areEqual(this.order, success.order) && Intrinsics.areEqual(this.account_creation_intent_token, success.account_creation_intent_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalOrder localOrder = this.order;
            int hashCode2 = (hashCode + (localOrder != null ? localOrder.hashCode() : 0)) * 37;
            String str = this.account_creation_intent_token;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            InputValue.Builder builder = new InputValue.Builder(4);
            builder.value = this.order;
            builder.input_id = this.account_creation_intent_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalOrder localOrder = this.order;
            if (localOrder != null) {
                arrayList.add("order=" + localOrder);
            }
            String str = this.account_creation_intent_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "account_creation_intent_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Success{", "}", 0, null, null, 56);
        }
    }

    public final class UpdatedCartResponse extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<UpdatedCartResponse> CREATOR;
        public final CreateCartResponse cart_response;
        public final LocalErrorResponse error_responses;

        static {
            CreateOrderResponse$UpdatedCartResponse$Companion$ADAPTER$1 createOrderResponse$UpdatedCartResponse$Companion$ADAPTER$1 = new CreateOrderResponse$UpdatedCartResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpdatedCartResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.CreateOrderResponse.UpdatedCartResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = createOrderResponse$UpdatedCartResponse$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(createOrderResponse$UpdatedCartResponse$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdatedCartResponse(CreateCartResponse createCartResponse, LocalErrorResponse localErrorResponse, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.cart_response = createCartResponse;
            this.error_responses = localErrorResponse;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdatedCartResponse)) {
                return false;
            }
            UpdatedCartResponse updatedCartResponse = (UpdatedCartResponse) obj;
            return Intrinsics.areEqual(unknownFields(), updatedCartResponse.unknownFields()) && Intrinsics.areEqual(this.cart_response, updatedCartResponse.cart_response) && Intrinsics.areEqual(this.error_responses, updatedCartResponse.error_responses);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CreateCartResponse createCartResponse = this.cart_response;
            int hashCode2 = (hashCode + (createCartResponse != null ? createCartResponse.hashCode() : 0)) * 37;
            LocalErrorResponse localErrorResponse = this.error_responses;
            int hashCode3 = hashCode2 + (localErrorResponse != null ? localErrorResponse.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UpdateCartResponse.Error.Builder builder = new UpdateCartResponse.Error.Builder(2);
            builder.current_cart = this.cart_response;
            builder.error_response = this.error_responses;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            CreateCartResponse createCartResponse = this.cart_response;
            if (createCartResponse != null) {
                arrayList.add("cart_response=" + createCartResponse);
            }
            LocalErrorResponse localErrorResponse = this.error_responses;
            if (localErrorResponse != null) {
                arrayList.add("error_responses=" + localErrorResponse);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "UpdatedCartResponse{", "}", 0, null, null, 56);
        }
    }

    static {
        CreateOrderResponse$Companion$ADAPTER$1 createOrderResponse$Companion$ADAPTER$1 = new CreateOrderResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateOrderResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.CreateOrderResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = createOrderResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createOrderResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateOrderResponse(SerializerKt serializerKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = serializerKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateOrderResponse)) {
            return false;
        }
        CreateOrderResponse createOrderResponse = (CreateOrderResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createOrderResponse.unknownFields()) && Intrinsics.areEqual(this.response, createOrderResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SerializerKt serializerKt = this.response;
        int hashCode2 = hashCode + (serializerKt != null ? serializerKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(21);
        builder.f1276type = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SerializerKt serializerKt = this.response;
        if (serializerKt != null) {
            arrayList.add("response=" + serializerKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateOrderResponse{", "}", 0, null, null, 56);
    }
}
