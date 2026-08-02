package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.EndFlowRequest;
import com.squareup.protos.franklin.common.RequestContext;
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
public final class RegisterProspectTokenRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RegisterProspectTokenRequest> CREATOR;
    public final String prospect_token;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RegisterProspectTokenRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.janus.api.RegisterProspectTokenRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new RegisterProspectTokenRequest((RequestContext) obj2, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                RegisterProspectTokenRequest registerProspectTokenRequest = (RegisterProspectTokenRequest) obj;
                reverseProtoWriter.getClass();
                registerProspectTokenRequest.getClass();
                reverseProtoWriter.writeBytes(registerProspectTokenRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, registerProspectTokenRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, registerProspectTokenRequest.prospect_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RegisterProspectTokenRequest registerProspectTokenRequest = (RegisterProspectTokenRequest) obj;
                registerProspectTokenRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(2, registerProspectTokenRequest.request_context) + ProtoAdapter.STRING.encodedSizeWithTag(1, registerProspectTokenRequest.prospect_token) + registerProspectTokenRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RegisterProspectTokenRequest registerProspectTokenRequest = (RegisterProspectTokenRequest) obj;
                registerProspectTokenRequest.getClass();
                RequestContext requestContext = registerProspectTokenRequest.request_context;
                return RegisterProspectTokenRequest.copy$default(registerProspectTokenRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 1);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RegisterProspectTokenRequest registerProspectTokenRequest = (RegisterProspectTokenRequest) obj;
                registerProspectTokenRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, registerProspectTokenRequest.prospect_token);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, registerProspectTokenRequest.request_context);
                protoWriter.writeBytes(registerProspectTokenRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterProspectTokenRequest(RequestContext requestContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.prospect_token = str;
        this.request_context = requestContext;
    }

    public static RegisterProspectTokenRequest copy$default(RegisterProspectTokenRequest registerProspectTokenRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = registerProspectTokenRequest.prospect_token;
        if ((i & 4) != 0) {
            byteString = registerProspectTokenRequest.unknownFields();
        }
        registerProspectTokenRequest.getClass();
        byteString.getClass();
        return new RegisterProspectTokenRequest(requestContext, str, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegisterProspectTokenRequest)) {
            return false;
        }
        RegisterProspectTokenRequest registerProspectTokenRequest = (RegisterProspectTokenRequest) obj;
        return Intrinsics.areEqual(unknownFields(), registerProspectTokenRequest.unknownFields()) && Intrinsics.areEqual(this.prospect_token, registerProspectTokenRequest.prospect_token) && Intrinsics.areEqual(this.request_context, registerProspectTokenRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.prospect_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode3 = hashCode2 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EndFlowRequest.Builder builder = new EndFlowRequest.Builder(10);
        builder.action_id = this.prospect_token;
        builder.request_context = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.prospect_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "prospect_token=", arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RegisterProspectTokenRequest{", "}", 0, null, null, 56);
    }
}
