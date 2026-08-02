package com.squareup.protos.cash.cashfavorites.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.time.Instant;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class RemoveFavoriteRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RemoveFavoriteRequest> CREATOR;
    public final String favorite_customer_token;
    public final FavoriteOrigin origin;
    public final RequestContext request_context;
    public final Instant timestamp;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RemoveFavoriteRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashfavorites.api.v1.RemoveFavoriteRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new RemoveFavoriteRequest((String) obj, (RequestContext) obj2, (Instant) obj3, (FavoriteOrigin) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj2);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj3);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj4 = FavoriteOrigin.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                RemoveFavoriteRequest removeFavoriteRequest = (RemoveFavoriteRequest) obj;
                reverseProtoWriter.getClass();
                removeFavoriteRequest.getClass();
                reverseProtoWriter.writeBytes(removeFavoriteRequest.unknownFields());
                FavoriteOrigin.ADAPTER.encodeWithTag(reverseProtoWriter, 4, removeFavoriteRequest.origin);
                ProtoAdapter.INSTANT.encodeWithTag(reverseProtoWriter, 3, removeFavoriteRequest.timestamp);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, removeFavoriteRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, removeFavoriteRequest.favorite_customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RemoveFavoriteRequest removeFavoriteRequest = (RemoveFavoriteRequest) obj;
                removeFavoriteRequest.getClass();
                return FavoriteOrigin.ADAPTER.encodedSizeWithTag(4, removeFavoriteRequest.origin) + ProtoAdapter.INSTANT.encodedSizeWithTag(3, removeFavoriteRequest.timestamp) + RequestContext.ADAPTER.encodedSizeWithTag(2, removeFavoriteRequest.request_context) + ProtoAdapter.STRING.encodedSizeWithTag(1, removeFavoriteRequest.favorite_customer_token) + removeFavoriteRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RemoveFavoriteRequest removeFavoriteRequest = (RemoveFavoriteRequest) obj;
                removeFavoriteRequest.getClass();
                RequestContext requestContext = removeFavoriteRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                Instant instant = removeFavoriteRequest.timestamp;
                return RemoveFavoriteRequest.copy$default(removeFavoriteRequest, requestContext2, instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null, ByteString.EMPTY, 9);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RemoveFavoriteRequest removeFavoriteRequest = (RemoveFavoriteRequest) obj;
                removeFavoriteRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, removeFavoriteRequest.favorite_customer_token);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, removeFavoriteRequest.request_context);
                ProtoAdapter.INSTANT.encodeWithTag(protoWriter, 3, removeFavoriteRequest.timestamp);
                FavoriteOrigin.ADAPTER.encodeWithTag(protoWriter, 4, removeFavoriteRequest.origin);
                protoWriter.writeBytes(removeFavoriteRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveFavoriteRequest(String str, RequestContext requestContext, Instant instant, FavoriteOrigin favoriteOrigin, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.favorite_customer_token = str;
        this.request_context = requestContext;
        this.timestamp = instant;
        this.origin = favoriteOrigin;
    }

    public static RemoveFavoriteRequest copy$default(RemoveFavoriteRequest removeFavoriteRequest, RequestContext requestContext, Instant instant, ByteString byteString, int i) {
        String str = removeFavoriteRequest.favorite_customer_token;
        if ((i & 4) != 0) {
            instant = removeFavoriteRequest.timestamp;
        }
        Instant instant2 = instant;
        FavoriteOrigin favoriteOrigin = removeFavoriteRequest.origin;
        if ((i & 16) != 0) {
            byteString = removeFavoriteRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        removeFavoriteRequest.getClass();
        byteString2.getClass();
        return new RemoveFavoriteRequest(str, requestContext, instant2, favoriteOrigin, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemoveFavoriteRequest)) {
            return false;
        }
        RemoveFavoriteRequest removeFavoriteRequest = (RemoveFavoriteRequest) obj;
        return Intrinsics.areEqual(unknownFields(), removeFavoriteRequest.unknownFields()) && Intrinsics.areEqual(this.favorite_customer_token, removeFavoriteRequest.favorite_customer_token) && Intrinsics.areEqual(this.request_context, removeFavoriteRequest.request_context) && Intrinsics.areEqual(this.timestamp, removeFavoriteRequest.timestamp) && this.origin == removeFavoriteRequest.origin;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.favorite_customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode3 = (hashCode2 + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        Instant instant = this.timestamp;
        int hashCode4 = (hashCode3 + (instant != null ? instant.hashCode() : 0)) * 37;
        FavoriteOrigin favoriteOrigin = this.origin;
        int hashCode5 = hashCode4 + (favoriteOrigin != null ? favoriteOrigin.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(8, false);
        builder.title = this.favorite_customer_token;
        builder.icon = this.request_context;
        builder.enabled = this.timestamp;
        builder.id = this.origin;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.favorite_customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "favorite_customer_token=", arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        Instant instant = this.timestamp;
        if (instant != null) {
            Matcher$$ExternalSyntheticOutline0.m("timestamp=", instant, arrayList);
        }
        FavoriteOrigin favoriteOrigin = this.origin;
        if (favoriteOrigin != null) {
            arrayList.add("origin=" + favoriteOrigin);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RemoveFavoriteRequest{", "}", 0, null, null, 56);
    }
}
