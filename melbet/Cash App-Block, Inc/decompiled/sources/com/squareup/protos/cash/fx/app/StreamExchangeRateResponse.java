package com.squareup.protos.cash.fx.app;

import android.os.Parcelable;
import coil3.network.CacheNetworkResponse;
import com.squareup.protos.cash.composer.app.Asset;
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
public final class StreamExchangeRateResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StreamExchangeRateResponse> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final CacheNetworkResponse f1263type;

    static {
        StreamExchangeRateResponse$Companion$ADAPTER$1 streamExchangeRateResponse$Companion$ADAPTER$1 = new StreamExchangeRateResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StreamExchangeRateResponse.class), "type.googleapis.com/squareup.cash.fx.app.StreamExchangeRateResponse", Syntax.PROTO_2, null, "squareup/cash/fx/app.proto");
        ADAPTER = streamExchangeRateResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(streamExchangeRateResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamExchangeRateResponse(CacheNetworkResponse cacheNetworkResponse, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1263type = cacheNetworkResponse;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamExchangeRateResponse)) {
            return false;
        }
        StreamExchangeRateResponse streamExchangeRateResponse = (StreamExchangeRateResponse) obj;
        return Intrinsics.areEqual(unknownFields(), streamExchangeRateResponse.unknownFields()) && Intrinsics.areEqual(this.f1263type, streamExchangeRateResponse.f1263type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CacheNetworkResponse cacheNetworkResponse = this.f1263type;
        int hashCode2 = hashCode + (cacheNetworkResponse != null ? cacheNetworkResponse.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Asset.Builder builder = new Asset.Builder(21);
        builder.asset_type = this.f1263type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CacheNetworkResponse cacheNetworkResponse = this.f1263type;
        if (cacheNetworkResponse != null) {
            arrayList.add("type=" + cacheNetworkResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamExchangeRateResponse{", "}", 0, null, null, 56);
    }
}
