package squareup.cash.customer_feed.service;

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

/* loaded from: classes3.dex */
public final class Subscription extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Subscription> CREATOR;

    static {
        Subscription$Companion$ADAPTER$1 subscription$Companion$ADAPTER$1 = new Subscription$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Subscription.class), "type.googleapis.com/squareup.cash.customer_feed.service.Subscription", Syntax.PROTO_2, null, "squareup/cash/customer-feed/service.proto");
        ADAPTER = subscription$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(subscription$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Subscription(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Subscription) && Intrinsics.areEqual(unknownFields(), ((Subscription) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(13);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "Subscription{}";
    }
}
