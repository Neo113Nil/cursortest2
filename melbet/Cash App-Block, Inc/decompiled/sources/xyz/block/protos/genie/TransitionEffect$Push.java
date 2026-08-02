package xyz.block.protos.genie;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.ViewStateValueMapping;

/* loaded from: classes10.dex */
public final class TransitionEffect$Push extends Message {
    public static final ProtoAdapter ADAPTER = new TransitionEffect$Push$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TransitionEffect$Push.class), "type.googleapis.com/xyz.block.genie.v1.TransitionEffect.Push", Syntax.PROTO_2, null, "xyz/block/genie/v1/motion.proto");

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new TransitionEffect$Push(buildUnknownFields());
                case 1:
                    return new TransitionEffect$Scale(buildUnknownFields());
                case 2:
                    return new TransitionEffect$Slide(buildUnknownFields());
                default:
                    return new ViewStateValueMapping.SceneInputs(buildUnknownFields());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionEffect$Push(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof TransitionEffect$Push) && Intrinsics.areEqual(unknownFields(), ((TransitionEffect$Push) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "Push{}";
    }
}
