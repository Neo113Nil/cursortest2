package com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.GetCardBlockedBusinessesUIConfigRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetCardBlockedBusinessesUIConfigRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCardBlockedBusinessesUIConfigRequest> CREATOR;
    public final String blocked_customer_token;
    public final String customer_token;
    public final RequestContext request_context;
    public final RequestSource request_source;
    public final String sponsor_customer_token;

    /* loaded from: classes7.dex */
    public enum RequestSource implements WireEnum {
        REQUEST_SOURCE_UNSPECIFIED(0),
        REQUEST_SOURCE_CARDS_HOME(1),
        REQUEST_SOURCE_FAMILIES_HOME(2);

        public static final GetCardBlockedBusinessesUIConfigRequest$RequestSource$Companion$ADAPTER$1 ADAPTER;
        public static final WorkCookieJar Companion;
        public final int value;

        static {
            RequestSource requestSource = REQUEST_SOURCE_UNSPECIFIED;
            Companion = new WorkCookieJar(18);
            ADAPTER = new GetCardBlockedBusinessesUIConfigRequest$RequestSource$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RequestSource.class), Syntax.PROTO_2, requestSource);
        }

        RequestSource(int i) {
            this.value = i;
        }

        public static final RequestSource fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return REQUEST_SOURCE_UNSPECIFIED;
            }
            if (i == 1) {
                return REQUEST_SOURCE_CARDS_HOME;
            }
            if (i != 2) {
                return null;
            }
            return REQUEST_SOURCE_FAMILIES_HOME;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetCardBlockedBusinessesUIConfigRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.GetCardBlockedBusinessesUIConfigRequest$Companion$ADAPTER$1
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
                        return new GetCardBlockedBusinessesUIConfigRequest((String) obj, (String) obj2, (RequestContext) obj3, (String) obj4, (GetCardBlockedBusinessesUIConfigRequest.RequestSource) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj3);
                    } else if (nextTag == 4) {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj5 = GetCardBlockedBusinessesUIConfigRequest.RequestSource.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetCardBlockedBusinessesUIConfigRequest getCardBlockedBusinessesUIConfigRequest = (GetCardBlockedBusinessesUIConfigRequest) obj;
                reverseProtoWriter.getClass();
                getCardBlockedBusinessesUIConfigRequest.getClass();
                reverseProtoWriter.writeBytes(getCardBlockedBusinessesUIConfigRequest.unknownFields());
                GetCardBlockedBusinessesUIConfigRequest.RequestSource.ADAPTER.encodeWithTag(reverseProtoWriter, 5, getCardBlockedBusinessesUIConfigRequest.request_source);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, getCardBlockedBusinessesUIConfigRequest.blocked_customer_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getCardBlockedBusinessesUIConfigRequest.request_context);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getCardBlockedBusinessesUIConfigRequest.sponsor_customer_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getCardBlockedBusinessesUIConfigRequest.customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetCardBlockedBusinessesUIConfigRequest getCardBlockedBusinessesUIConfigRequest = (GetCardBlockedBusinessesUIConfigRequest) obj;
                getCardBlockedBusinessesUIConfigRequest.getClass();
                int size$okio = getCardBlockedBusinessesUIConfigRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return GetCardBlockedBusinessesUIConfigRequest.RequestSource.ADAPTER.encodedSizeWithTag(5, getCardBlockedBusinessesUIConfigRequest.request_source) + protoAdapter2.encodedSizeWithTag(4, getCardBlockedBusinessesUIConfigRequest.blocked_customer_token) + RequestContext.ADAPTER.encodedSizeWithTag(3, getCardBlockedBusinessesUIConfigRequest.request_context) + protoAdapter2.encodedSizeWithTag(2, getCardBlockedBusinessesUIConfigRequest.sponsor_customer_token) + protoAdapter2.encodedSizeWithTag(1, getCardBlockedBusinessesUIConfigRequest.customer_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetCardBlockedBusinessesUIConfigRequest getCardBlockedBusinessesUIConfigRequest = (GetCardBlockedBusinessesUIConfigRequest) obj;
                getCardBlockedBusinessesUIConfigRequest.getClass();
                RequestContext requestContext = getCardBlockedBusinessesUIConfigRequest.request_context;
                return GetCardBlockedBusinessesUIConfigRequest.copy$default(getCardBlockedBusinessesUIConfigRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 27);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetCardBlockedBusinessesUIConfigRequest getCardBlockedBusinessesUIConfigRequest = (GetCardBlockedBusinessesUIConfigRequest) obj;
                getCardBlockedBusinessesUIConfigRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getCardBlockedBusinessesUIConfigRequest.customer_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, getCardBlockedBusinessesUIConfigRequest.sponsor_customer_token);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 3, getCardBlockedBusinessesUIConfigRequest.request_context);
                protoAdapter2.encodeWithTag(protoWriter, 4, getCardBlockedBusinessesUIConfigRequest.blocked_customer_token);
                GetCardBlockedBusinessesUIConfigRequest.RequestSource.ADAPTER.encodeWithTag(protoWriter, 5, getCardBlockedBusinessesUIConfigRequest.request_source);
                protoWriter.writeBytes(getCardBlockedBusinessesUIConfigRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCardBlockedBusinessesUIConfigRequest(String str, String str2, RequestContext requestContext, String str3, RequestSource requestSource, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.sponsor_customer_token = str2;
        this.request_context = requestContext;
        this.blocked_customer_token = str3;
        this.request_source = requestSource;
    }

    public static GetCardBlockedBusinessesUIConfigRequest copy$default(GetCardBlockedBusinessesUIConfigRequest getCardBlockedBusinessesUIConfigRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = getCardBlockedBusinessesUIConfigRequest.customer_token;
        String str2 = getCardBlockedBusinessesUIConfigRequest.sponsor_customer_token;
        String str3 = getCardBlockedBusinessesUIConfigRequest.blocked_customer_token;
        RequestSource requestSource = getCardBlockedBusinessesUIConfigRequest.request_source;
        if ((i & 32) != 0) {
            byteString = getCardBlockedBusinessesUIConfigRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        getCardBlockedBusinessesUIConfigRequest.getClass();
        byteString2.getClass();
        return new GetCardBlockedBusinessesUIConfigRequest(str, str2, requestContext, str3, requestSource, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCardBlockedBusinessesUIConfigRequest)) {
            return false;
        }
        GetCardBlockedBusinessesUIConfigRequest getCardBlockedBusinessesUIConfigRequest = (GetCardBlockedBusinessesUIConfigRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getCardBlockedBusinessesUIConfigRequest.unknownFields()) && Intrinsics.areEqual(this.customer_token, getCardBlockedBusinessesUIConfigRequest.customer_token) && Intrinsics.areEqual(this.sponsor_customer_token, getCardBlockedBusinessesUIConfigRequest.sponsor_customer_token) && Intrinsics.areEqual(this.request_context, getCardBlockedBusinessesUIConfigRequest.request_context) && Intrinsics.areEqual(this.blocked_customer_token, getCardBlockedBusinessesUIConfigRequest.blocked_customer_token) && this.request_source == getCardBlockedBusinessesUIConfigRequest.request_source;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.sponsor_customer_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode4 = (hashCode3 + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str3 = this.blocked_customer_token;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        RequestSource requestSource = this.request_source;
        int hashCode6 = hashCode5 + (requestSource != null ? requestSource.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Node.Builder builder = new Node.Builder(18);
        builder.for_each = this.customer_token;
        builder.moneybot_scaffold = this.sponsor_customer_token;
        builder.compose_platform = this.request_context;
        builder.is_included = this.blocked_customer_token;
        builder.motion = this.request_source;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        String str2 = this.sponsor_customer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "sponsor_customer_token=", arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str3 = this.blocked_customer_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "blocked_customer_token=", arrayList);
        }
        RequestSource requestSource = this.request_source;
        if (requestSource != null) {
            arrayList.add("request_source=" + requestSource);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCardBlockedBusinessesUIConfigRequest{", "}", 0, null, null, 56);
    }
}
