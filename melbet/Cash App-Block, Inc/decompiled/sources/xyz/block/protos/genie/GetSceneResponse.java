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
import xyz.block.protos.genie.CreateSessionResponse;
import xyz.block.protos.genie.UnaryOp;

/* loaded from: classes10.dex */
public final class GetSceneResponse extends Message {
    public static final ProtoAdapter ADAPTER = new GetSceneResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetSceneResponse.class), "type.googleapis.com/xyz.block.genie.v1.GetSceneResponse", Syntax.PROTO_2, null, "xyz/block/genie/v1/service.proto");
    public final Failure failure;
    public final Success success;

    public final class Failure extends Message {
        public static final ProtoAdapter ADAPTER = new GetSceneResponse$Failure$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Failure.class), "type.googleapis.com/xyz.block.genie.v1.GetSceneResponse.Failure", Syntax.PROTO_2, null, "xyz/block/genie/v1/service.proto");
        public final Error error;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public Error error;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new Failure(this.error, buildUnknownFields());
                    default:
                        return new CreateSessionResponse.Failure(this.error, buildUnknownFields());
                }
            }
        }

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
            Builder builder = new Builder(0);
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
        public static final ProtoAdapter ADAPTER = new GetSceneResponse$Success$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Success.class), "type.googleapis.com/xyz.block.genie.v1.GetSceneResponse.Success", Syntax.PROTO_2, null, "xyz/block/genie/v1/service.proto");
        public final String scene_session_token;
        public final ViewPlan view_plan;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(ViewPlan viewPlan, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.view_plan = viewPlan;
            this.scene_session_token = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(unknownFields(), success.unknownFields()) && Intrinsics.areEqual(this.view_plan, success.view_plan) && Intrinsics.areEqual(this.scene_session_token, success.scene_session_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ViewPlan viewPlan = this.view_plan;
            int hashCode2 = (hashCode + (viewPlan != null ? viewPlan.hashCode() : 0)) * 37;
            String str = this.scene_session_token;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UnaryOp.Builder builder = new UnaryOp.Builder(5);
            builder.operator_ = this.view_plan;
            builder.operand = this.scene_session_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ViewPlan viewPlan = this.view_plan;
            if (viewPlan != null) {
                arrayList.add("view_plan=" + viewPlan);
            }
            if (this.scene_session_token != null) {
                arrayList.add("scene_session_token=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Success{", "}", 0, null, null, 56);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSceneResponse(Success success, Failure failure, ByteString byteString) {
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
        if (!(obj instanceof GetSceneResponse)) {
            return false;
        }
        GetSceneResponse getSceneResponse = (GetSceneResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getSceneResponse.unknownFields()) && Intrinsics.areEqual(this.success, getSceneResponse.success) && Intrinsics.areEqual(this.failure, getSceneResponse.failure);
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
        UnaryOp.Builder builder = new UnaryOp.Builder(4);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSceneResponse{", "}", 0, null, null, 56);
    }
}
