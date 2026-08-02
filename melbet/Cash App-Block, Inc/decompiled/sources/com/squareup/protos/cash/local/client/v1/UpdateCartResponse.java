package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.datadog.android.rum.model.ActionEvent;
import com.squareup.protos.cash.local.client.v1.AddRoundToTabResponse;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import com.squareup.protos.cash.local.client.v1.InputValue;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/UpdateCartResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/InputValue$Builder;", "Builder", "Companion", "Success", "Error", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateCartResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateCartResponse> CREATOR;
    public final CreateCartResponse create_cart_response;
    public final ActionEvent.Dd.Companion response;

    public final class Error extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Error> CREATOR;
        public final CreateCartResponse current_cart;
        public final LocalErrorResponse error_response;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public CreateCartResponse current_cart;
            public LocalErrorResponse error_response;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new Error(this.current_cart, this.error_response, buildUnknownFields());
                    case 1:
                        return new AddRoundToTabResponse.Error(this.current_cart, this.error_response, buildUnknownFields());
                    default:
                        return new CreateOrderResponse.UpdatedCartResponse(this.current_cart, this.error_response, buildUnknownFields());
                }
            }
        }

        static {
            UpdateCartResponse$Error$Companion$ADAPTER$1 updateCartResponse$Error$Companion$ADAPTER$1 = new UpdateCartResponse$Error$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Error.class), "type.googleapis.com/squareup.cash.local.client.v1.UpdateCartResponse.Error", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = updateCartResponse$Error$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(updateCartResponse$Error$Companion$ADAPTER$1);
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
            Builder builder = new Builder(0);
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

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public CreateCartResponse updated_cart;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new Success(this.updated_cart, buildUnknownFields());
                    default:
                        return new AddRoundToTabResponse.Success(this.updated_cart, buildUnknownFields());
                }
            }
        }

        static {
            UpdateCartResponse$Success$Companion$ADAPTER$1 updateCartResponse$Success$Companion$ADAPTER$1 = new UpdateCartResponse$Success$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Success.class), "type.googleapis.com/squareup.cash.local.client.v1.UpdateCartResponse.Success", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = updateCartResponse$Success$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(updateCartResponse$Success$Companion$ADAPTER$1);
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
            Builder builder = new Builder(0);
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
        UpdateCartResponse$Companion$ADAPTER$1 updateCartResponse$Companion$ADAPTER$1 = new UpdateCartResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpdateCartResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.UpdateCartResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = updateCartResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(updateCartResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateCartResponse(CreateCartResponse createCartResponse, ActionEvent.Dd.Companion companion, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.create_cart_response = createCartResponse;
        this.response = companion;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateCartResponse)) {
            return false;
        }
        UpdateCartResponse updateCartResponse = (UpdateCartResponse) obj;
        return Intrinsics.areEqual(unknownFields(), updateCartResponse.unknownFields()) && Intrinsics.areEqual(this.create_cart_response, updateCartResponse.create_cart_response) && Intrinsics.areEqual(this.response, updateCartResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CreateCartResponse createCartResponse = this.create_cart_response;
        int hashCode2 = (hashCode + (createCartResponse != null ? createCartResponse.hashCode() : 0)) * 37;
        ActionEvent.Dd.Companion companion = this.response;
        int hashCode3 = hashCode2 + (companion != null ? companion.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InputValue.Builder builder = new InputValue.Builder(21);
        builder.input_id = this.create_cart_response;
        builder.value = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CreateCartResponse createCartResponse = this.create_cart_response;
        if (createCartResponse != null) {
            arrayList.add("create_cart_response=" + createCartResponse);
        }
        ActionEvent.Dd.Companion companion = this.response;
        if (companion != null) {
            arrayList.add("response=" + companion);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateCartResponse{", "}", 0, null, null, 56);
    }
}
