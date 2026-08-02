package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.scenarios.OAuthConfig;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class OAuthResolveFlowRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OAuthResolveFlowRequest> CREATOR;
    public final OAuthConfig.FlowType flow_type;
    public final RequestContext request_context;
    public final String url_contents;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public OAuthConfig.FlowType flow_type;
        public RequestContext request_context;
        public String url_contents;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new OAuthResolveFlowRequest(this.request_context, this.flow_type, this.url_contents, buildUnknownFields());
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OAuthResolveFlowRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.OAuthResolveFlowRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new OAuthResolveFlowRequest((RequestContext) obj, (OAuthConfig.FlowType) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        try {
                            obj2 = OAuthConfig.FlowType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                OAuthResolveFlowRequest oAuthResolveFlowRequest = (OAuthResolveFlowRequest) obj;
                reverseProtoWriter.getClass();
                oAuthResolveFlowRequest.getClass();
                reverseProtoWriter.writeBytes(oAuthResolveFlowRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, oAuthResolveFlowRequest.url_contents);
                OAuthConfig.FlowType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, oAuthResolveFlowRequest.flow_type);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, oAuthResolveFlowRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                OAuthResolveFlowRequest oAuthResolveFlowRequest = (OAuthResolveFlowRequest) obj;
                oAuthResolveFlowRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(3, oAuthResolveFlowRequest.url_contents) + OAuthConfig.FlowType.ADAPTER.encodedSizeWithTag(2, oAuthResolveFlowRequest.flow_type) + RequestContext.ADAPTER.encodedSizeWithTag(1, oAuthResolveFlowRequest.request_context) + oAuthResolveFlowRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                OAuthResolveFlowRequest oAuthResolveFlowRequest = (OAuthResolveFlowRequest) obj;
                oAuthResolveFlowRequest.getClass();
                RequestContext requestContext = oAuthResolveFlowRequest.request_context;
                return OAuthResolveFlowRequest.copy$default(oAuthResolveFlowRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                OAuthResolveFlowRequest oAuthResolveFlowRequest = (OAuthResolveFlowRequest) obj;
                oAuthResolveFlowRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, oAuthResolveFlowRequest.request_context);
                OAuthConfig.FlowType.ADAPTER.encodeWithTag(protoWriter, 2, oAuthResolveFlowRequest.flow_type);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, oAuthResolveFlowRequest.url_contents);
                protoWriter.writeBytes(oAuthResolveFlowRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OAuthResolveFlowRequest(RequestContext requestContext, OAuthConfig.FlowType flowType, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.flow_type = flowType;
        this.url_contents = str;
    }

    public static OAuthResolveFlowRequest copy$default(OAuthResolveFlowRequest oAuthResolveFlowRequest, RequestContext requestContext, ByteString byteString, int i) {
        OAuthConfig.FlowType flowType = oAuthResolveFlowRequest.flow_type;
        String str = (i & 4) != 0 ? oAuthResolveFlowRequest.url_contents : null;
        if ((i & 8) != 0) {
            byteString = oAuthResolveFlowRequest.unknownFields();
        }
        oAuthResolveFlowRequest.getClass();
        byteString.getClass();
        return new OAuthResolveFlowRequest(requestContext, flowType, str, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OAuthResolveFlowRequest)) {
            return false;
        }
        OAuthResolveFlowRequest oAuthResolveFlowRequest = (OAuthResolveFlowRequest) obj;
        return Intrinsics.areEqual(unknownFields(), oAuthResolveFlowRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, oAuthResolveFlowRequest.request_context) && this.flow_type == oAuthResolveFlowRequest.flow_type && Intrinsics.areEqual(this.url_contents, oAuthResolveFlowRequest.url_contents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        OAuthConfig.FlowType flowType = this.flow_type;
        int hashCode3 = (hashCode2 + (flowType != null ? flowType.hashCode() : 0)) * 37;
        String str = this.url_contents;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.request_context = this.request_context;
        builder.flow_type = this.flow_type;
        builder.url_contents = this.url_contents;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        OAuthConfig.FlowType flowType = this.flow_type;
        if (flowType != null) {
            arrayList.add("flow_type=" + flowType);
        }
        if (this.url_contents != null) {
            arrayList.add("url_contents=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OAuthResolveFlowRequest{", "}", 0, null, null, 56);
    }
}
