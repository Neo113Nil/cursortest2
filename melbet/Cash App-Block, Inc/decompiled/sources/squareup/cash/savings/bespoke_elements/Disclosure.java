package squareup.cash.savings.bespoke_elements;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.EasingCurve;

/* loaded from: classes10.dex */
public final class Disclosure extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Disclosure> CREATOR;

    static {
        Disclosure$Companion$ADAPTER$1 disclosure$Companion$ADAPTER$1 = new Disclosure$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Disclosure.class), "type.googleapis.com/squareup.cash.savings.bespoke_elements.Disclosure", Syntax.PROTO_2, null, "squareup/cash/savings/bespoke_elements/Disclosure.proto");
        ADAPTER = disclosure$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(disclosure$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Disclosure(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Disclosure) && Intrinsics.areEqual(unknownFields(), ((Disclosure) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(18);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "Disclosure{}";
    }
}
