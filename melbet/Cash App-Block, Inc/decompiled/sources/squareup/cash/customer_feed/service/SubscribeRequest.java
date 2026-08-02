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
public final class SubscribeRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubscribeRequest> CREATOR;

    static {
        SubscribeRequest$Companion$ADAPTER$1 subscribeRequest$Companion$ADAPTER$1 = new SubscribeRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SubscribeRequest.class), "type.googleapis.com/squareup.cash.customer_feed.service.SubscribeRequest", Syntax.PROTO_2, null, "squareup/cash/customer-feed/service.proto");
        ADAPTER = subscribeRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(subscribeRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribeRequest(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SubscribeRequest) && Intrinsics.areEqual(unknownFields(), ((SubscribeRequest) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(12);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "SubscribeRequest{}";
    }
}
