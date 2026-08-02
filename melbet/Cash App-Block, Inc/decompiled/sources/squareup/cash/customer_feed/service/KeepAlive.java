package squareup.cash.customer_feed.service;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cats.Cats;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class KeepAlive extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<KeepAlive> CREATOR;
    public final Long timestamp;

    static {
        KeepAlive$Companion$ADAPTER$1 keepAlive$Companion$ADAPTER$1 = new KeepAlive$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(KeepAlive.class), "type.googleapis.com/squareup.cash.customer_feed.service.KeepAlive", Syntax.PROTO_2, null, "squareup/cash/customer-feed/service.proto");
        ADAPTER = keepAlive$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(keepAlive$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeepAlive(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.timestamp = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KeepAlive)) {
            return false;
        }
        KeepAlive keepAlive = (KeepAlive) obj;
        return Intrinsics.areEqual(unknownFields(), keepAlive.unknownFields()) && Intrinsics.areEqual(this.timestamp, keepAlive.timestamp);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.timestamp;
        int hashCode2 = hashCode + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cats.Builder builder = new Cats.Builder(16);
        builder.cat_count = this.timestamp;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.timestamp;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("timestamp=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "KeepAlive{", "}", 0, null, null, 56);
    }
}
