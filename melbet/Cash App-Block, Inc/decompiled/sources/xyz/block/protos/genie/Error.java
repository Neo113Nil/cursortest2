package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class Error extends Message {
    public static final ProtoAdapter ADAPTER = new Error$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Error.class), "type.googleapis.com/xyz.block.genie.v1.Error", Syntax.PROTO_2, null, "xyz/block/genie/v1/error.proto");
    public final ErrorCode code;
    public final DebugInfo debug_info;
    public final DisplayError display_error;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Serializable code;
        public Serializable debug_info;
        public Serializable display_error;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Error((ErrorCode) this.code, (DebugInfo) this.debug_info, (DisplayError) this.display_error, buildUnknownFields());
                case 1:
                    Expression expression = (Expression) this.code;
                    if (expression == null) {
                        TransactorKt.missingRequiredFields(expression, "collection");
                        throw null;
                    }
                    String str = (String) this.debug_info;
                    if (str == null) {
                        TransactorKt.missingRequiredFields(str, "item_variable");
                        throw null;
                    }
                    Expression expression2 = (Expression) this.display_error;
                    if (expression2 != null) {
                        return new FilterOp(expression, str, expression2, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(expression2, "predicate");
                    throw null;
                default:
                    return new GetSceneRequest((String) this.code, (KeyValueMap) this.debug_info, (ByteString) this.display_error, buildUnknownFields());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Error(ErrorCode errorCode, DebugInfo debugInfo, DisplayError displayError, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.code = errorCode;
        this.debug_info = debugInfo;
        this.display_error = displayError;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Error)) {
            return false;
        }
        Error error = (Error) obj;
        return Intrinsics.areEqual(unknownFields(), error.unknownFields()) && this.code == error.code && Intrinsics.areEqual(this.debug_info, error.debug_info) && Intrinsics.areEqual(this.display_error, error.display_error);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ErrorCode errorCode = this.code;
        int hashCode2 = (hashCode + (errorCode != null ? errorCode.hashCode() : 0)) * 37;
        DebugInfo debugInfo = this.debug_info;
        int hashCode3 = (hashCode2 + (debugInfo != null ? debugInfo.hashCode() : 0)) * 37;
        DisplayError displayError = this.display_error;
        int hashCode4 = hashCode3 + (displayError != null ? displayError.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.code = this.code;
        builder.debug_info = this.debug_info;
        builder.display_error = this.display_error;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ErrorCode errorCode = this.code;
        if (errorCode != null) {
            arrayList.add("code=" + errorCode);
        }
        DebugInfo debugInfo = this.debug_info;
        if (debugInfo != null) {
            arrayList.add("debug_info=" + debugInfo);
        }
        DisplayError displayError = this.display_error;
        if (displayError != null) {
            arrayList.add("display_error=" + displayError);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Error{", "}", 0, null, null, 56);
    }
}
