package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.GetSceneResponse;
import xyz.block.protos.genie.OpenURL;
import xyz.block.protos.genie.UnaryOp;

/* loaded from: classes10.dex */
public final class CreateSessionResponse extends Message {
    public static final ProtoAdapter ADAPTER = new CreateSessionResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateSessionResponse.class), "type.googleapis.com/xyz.block.genie.v1.CreateSessionResponse", Syntax.PROTO_2, null, "xyz/block/genie/v1/service.proto");
    public final Failure failure;
    public final Success success;

    public final class Failure extends Message {
        public static final ProtoAdapter ADAPTER = new CreateSessionResponse$Failure$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Failure.class), "type.googleapis.com/xyz.block.genie.v1.CreateSessionResponse.Failure", Syntax.PROTO_2, null, "xyz/block/genie/v1/service.proto");
        public final Error error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(Error error, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.error = error;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.areEqual(unknownFields(), failure.unknownFields()) && Intrinsics.areEqual(this.error, failure.error);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Error error = this.error;
            int hashCode2 = hashCode + (error != null ? error.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GetSceneResponse.Failure.Builder builder = new GetSceneResponse.Failure.Builder(1);
            builder.error = this.error;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Error error = this.error;
            if (error != null) {
                arrayList.add("error=" + error);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Failure{", "}", 0, null, null, 56);
        }
    }

    public final class Success extends Message {
        public static final ProtoAdapter ADAPTER = new CreateSessionResponse$Success$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Success.class), "type.googleapis.com/xyz.block.genie.v1.CreateSessionResponse.Success", Syntax.PROTO_2, null, "xyz/block/genie/v1/service.proto");
        public final String session_token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.session_token = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(unknownFields(), success.unknownFields()) && Intrinsics.areEqual(this.session_token, success.session_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.session_token;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            OpenURL.Builder builder = new OpenURL.Builder(9);
            builder.url = this.session_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.session_token != null) {
                arrayList.add("session_token=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Success{", "}", 0, null, null, 56);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSessionResponse(Success success, Failure failure, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.success = success;
        this.failure = failure;
        if (TransactorKt.countNonNull(success, failure) <= 1) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("At most one of success, failure may be non-null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateSessionResponse)) {
            return false;
        }
        CreateSessionResponse createSessionResponse = (CreateSessionResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createSessionResponse.unknownFields()) && Intrinsics.areEqual(this.success, createSessionResponse.success) && Intrinsics.areEqual(this.failure, createSessionResponse.failure);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Success success = this.success;
        int hashCode2 = (hashCode + (success != null ? success.hashCode() : 0)) * 37;
        Failure failure = this.failure;
        int hashCode3 = hashCode2 + (failure != null ? failure.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UnaryOp.Builder builder = new UnaryOp.Builder(3);
        builder.operator_ = this.success;
        builder.operand = this.failure;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Success success = this.success;
        if (success != null) {
            arrayList.add("success=" + success);
        }
        Failure failure = this.failure;
        if (failure != null) {
            arrayList.add("failure=" + failure);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateSessionResponse{", "}", 0, null, null, 56);
    }
}
