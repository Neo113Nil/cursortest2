package com.squareup.protos.cash.cashfavorites.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashregistrar.Account;
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
public final class AddFavoriteRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddFavoriteRequest> CREATOR;
    public final String favorite_customer_token;
    public final FavoriteOrigin origin;
    public final RequestContext request_context;
    public final Instant timestamp;
    public final String upsell_app_message_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AddFavoriteRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashfavorites.api.v1.AddFavoriteRequest$Companion$ADAPTER$1
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
                Object obj5 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new AddFavoriteRequest((String) obj, (RequestContext) obj2, (Instant) obj3, (FavoriteOrigin) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj2);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj3);
                    } else if (nextTag == 4) {
                        try {
                            obj4 = FavoriteOrigin.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj5 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                AddFavoriteRequest addFavoriteRequest = (AddFavoriteRequest) obj;
                reverseProtoWriter.getClass();
                addFavoriteRequest.getClass();
                reverseProtoWriter.writeBytes(addFavoriteRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, addFavoriteRequest.upsell_app_message_token);
                FavoriteOrigin.ADAPTER.encodeWithTag(reverseProtoWriter, 4, addFavoriteRequest.origin);
                ProtoAdapter.INSTANT.encodeWithTag(reverseProtoWriter, 3, addFavoriteRequest.timestamp);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, addFavoriteRequest.request_context);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, addFavoriteRequest.favorite_customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AddFavoriteRequest addFavoriteRequest = (AddFavoriteRequest) obj;
                addFavoriteRequest.getClass();
                int size$okio = addFavoriteRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(5, addFavoriteRequest.upsell_app_message_token) + FavoriteOrigin.ADAPTER.encodedSizeWithTag(4, addFavoriteRequest.origin) + ProtoAdapter.INSTANT.encodedSizeWithTag(3, addFavoriteRequest.timestamp) + RequestContext.ADAPTER.encodedSizeWithTag(2, addFavoriteRequest.request_context) + protoAdapter2.encodedSizeWithTag(1, addFavoriteRequest.favorite_customer_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AddFavoriteRequest addFavoriteRequest = (AddFavoriteRequest) obj;
                addFavoriteRequest.getClass();
                RequestContext requestContext = addFavoriteRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                Instant instant = addFavoriteRequest.timestamp;
                return AddFavoriteRequest.copy$default(addFavoriteRequest, requestContext2, instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null, ByteString.EMPTY, 25);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AddFavoriteRequest addFavoriteRequest = (AddFavoriteRequest) obj;
                addFavoriteRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, addFavoriteRequest.favorite_customer_token);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, addFavoriteRequest.request_context);
                ProtoAdapter.INSTANT.encodeWithTag(protoWriter, 3, addFavoriteRequest.timestamp);
                FavoriteOrigin.ADAPTER.encodeWithTag(protoWriter, 4, addFavoriteRequest.origin);
                protoAdapter2.encodeWithTag(protoWriter, 5, addFavoriteRequest.upsell_app_message_token);
                protoWriter.writeBytes(addFavoriteRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFavoriteRequest(String str, RequestContext requestContext, Instant instant, FavoriteOrigin favoriteOrigin, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.favorite_customer_token = str;
        this.request_context = requestContext;
        this.timestamp = instant;
        this.origin = favoriteOrigin;
        this.upsell_app_message_token = str2;
    }

    public static AddFavoriteRequest copy$default(AddFavoriteRequest addFavoriteRequest, RequestContext requestContext, Instant instant, ByteString byteString, int i) {
        String str = addFavoriteRequest.favorite_customer_token;
        if ((i & 4) != 0) {
            instant = addFavoriteRequest.timestamp;
        }
        Instant instant2 = instant;
        FavoriteOrigin favoriteOrigin = addFavoriteRequest.origin;
        String str2 = addFavoriteRequest.upsell_app_message_token;
        if ((i & 32) != 0) {
            byteString = addFavoriteRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        addFavoriteRequest.getClass();
        byteString2.getClass();
        return new AddFavoriteRequest(str, requestContext, instant2, favoriteOrigin, str2, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddFavoriteRequest)) {
            return false;
        }
        AddFavoriteRequest addFavoriteRequest = (AddFavoriteRequest) obj;
        return Intrinsics.areEqual(unknownFields(), addFavoriteRequest.unknownFields()) && Intrinsics.areEqual(this.favorite_customer_token, addFavoriteRequest.favorite_customer_token) && Intrinsics.areEqual(this.request_context, addFavoriteRequest.request_context) && Intrinsics.areEqual(this.timestamp, addFavoriteRequest.timestamp) && this.origin == addFavoriteRequest.origin && Intrinsics.areEqual(this.upsell_app_message_token, addFavoriteRequest.upsell_app_message_token);
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
        int hashCode5 = (hashCode4 + (favoriteOrigin != null ? favoriteOrigin.hashCode() : 0)) * 37;
        String str2 = this.upsell_app_message_token;
        int hashCode6 = hashCode5 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(7, false);
        builder.customer_token = this.favorite_customer_token;
        builder.display_name = this.request_context;
        builder.account_type = this.timestamp;
        builder.is_sponsored_account = this.origin;
        builder.account_token = this.upsell_app_message_token;
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
        String str2 = this.upsell_app_message_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "upsell_app_message_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddFavoriteRequest{", "}", 0, null, null, 56);
    }
}
