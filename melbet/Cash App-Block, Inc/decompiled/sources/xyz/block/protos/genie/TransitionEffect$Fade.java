package xyz.block.protos.genie;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.EasingCurve;

/* loaded from: classes10.dex */
public final class TransitionEffect$Fade extends Message {
    public static final ProtoAdapter ADAPTER = new TransitionEffect$Fade$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TransitionEffect$Fade.class), "type.googleapis.com/xyz.block.genie.v1.TransitionEffect.Fade", Syntax.PROTO_2, null, "xyz/block/genie/v1/motion.proto");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionEffect$Fade(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof TransitionEffect$Fade) && Intrinsics.areEqual(unknownFields(), ((TransitionEffect$Fade) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(27);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "Fade{}";
    }
}
