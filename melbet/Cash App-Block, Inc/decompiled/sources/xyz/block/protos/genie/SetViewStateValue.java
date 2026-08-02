package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.CollectionMutation;

/* loaded from: classes10.dex */
public final class SetViewStateValue extends Message {
    public static final ProtoAdapter ADAPTER = new SetViewStateValue$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetViewStateValue.class), "type.googleapis.com/xyz.block.genie.v1.SetViewStateValue", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");
    public final KeyPath key_path;
    public final Expression value_;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public KeyPath key_path;
        public Expression value_;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    KeyPath keyPath = this.key_path;
                    if (keyPath == null) {
                        TransactorKt.missingRequiredFields(keyPath, "key_path");
                        throw null;
                    }
                    Expression expression = this.value_;
                    if (expression != null) {
                        return new SetViewStateValue(keyPath, expression, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(expression, "value_");
                    throw null;
                default:
                    KeyPath keyPath2 = this.key_path;
                    if (keyPath2 == null) {
                        TransactorKt.missingRequiredFields(keyPath2, "key_path");
                        throw null;
                    }
                    Expression expression2 = this.value_;
                    if (expression2 != null) {
                        return new CollectionMutation.SetItemField(keyPath2, expression2, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(expression2, "value_");
                    throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetViewStateValue(KeyPath keyPath, Expression expression, ByteString byteString) {
        super(ADAPTER, byteString);
        keyPath.getClass();
        expression.getClass();
        byteString.getClass();
        this.key_path = keyPath;
        this.value_ = expression;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetViewStateValue)) {
            return false;
        }
        SetViewStateValue setViewStateValue = (SetViewStateValue) obj;
        return Intrinsics.areEqual(unknownFields(), setViewStateValue.unknownFields()) && Intrinsics.areEqual(this.key_path, setViewStateValue.key_path) && Intrinsics.areEqual(this.value_, setViewStateValue.value_);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.value_.hashCode() + ((this.key_path.hashCode() + (unknownFields().hashCode() * 37)) * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.key_path = this.key_path;
        builder.value_ = this.value_;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("key_path=" + this.key_path);
        Matcher$$ExternalSyntheticOutline0.m("value_=", this.value_, arrayList);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetViewStateValue{", "}", 0, null, null, 56);
    }
}
