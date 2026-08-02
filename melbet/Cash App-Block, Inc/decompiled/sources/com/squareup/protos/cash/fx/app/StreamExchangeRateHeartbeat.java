package com.squareup.protos.cash.fx.app;

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

/* loaded from: classes7.dex */
public final class StreamExchangeRateHeartbeat extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StreamExchangeRateHeartbeat> CREATOR;
    public final Long timestamp_ms;

    static {
        StreamExchangeRateHeartbeat$Companion$ADAPTER$1 streamExchangeRateHeartbeat$Companion$ADAPTER$1 = new StreamExchangeRateHeartbeat$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StreamExchangeRateHeartbeat.class), "type.googleapis.com/squareup.cash.fx.app.StreamExchangeRateHeartbeat", Syntax.PROTO_2, null, "squareup/cash/fx/app.proto");
        ADAPTER = streamExchangeRateHeartbeat$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(streamExchangeRateHeartbeat$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamExchangeRateHeartbeat(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.timestamp_ms = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamExchangeRateHeartbeat)) {
            return false;
        }
        StreamExchangeRateHeartbeat streamExchangeRateHeartbeat = (StreamExchangeRateHeartbeat) obj;
        return Intrinsics.areEqual(unknownFields(), streamExchangeRateHeartbeat.unknownFields()) && Intrinsics.areEqual(this.timestamp_ms, streamExchangeRateHeartbeat.timestamp_ms);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.timestamp_ms;
        int hashCode2 = hashCode + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cats.Builder builder = new Cats.Builder(3);
        builder.cat_count = this.timestamp_ms;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.timestamp_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("timestamp_ms=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamExchangeRateHeartbeat{", "}", 0, null, null, 56);
    }
}
