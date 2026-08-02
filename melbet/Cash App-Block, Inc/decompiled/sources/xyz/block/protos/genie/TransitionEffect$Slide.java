package xyz.block.protos.genie;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.TransitionEffect$Push;

/* loaded from: classes10.dex */
public final class TransitionEffect$Slide extends Message {
    public static final ProtoAdapter ADAPTER = new TransitionEffect$Slide$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TransitionEffect$Slide.class), "type.googleapis.com/xyz.block.genie.v1.TransitionEffect.Slide", Syntax.PROTO_2, null, "xyz/block/genie/v1/motion.proto");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionEffect$Slide(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof TransitionEffect$Slide) && Intrinsics.areEqual(unknownFields(), ((TransitionEffect$Slide) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        TransitionEffect$Push.Builder builder = new TransitionEffect$Push.Builder(2);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "Slide{}";
    }
}
