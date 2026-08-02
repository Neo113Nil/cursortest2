package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;
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
public final class SetIncomingRequestPolicyRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetIncomingRequestPolicyRequest> CREATOR;
    public final IncomingRequestPolicy incoming_request_policy;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetIncomingRequestPolicyRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SetIncomingRequestPolicyRequest$Companion$ADAPTER$1
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
                        return new SetIncomingRequestPolicyRequest((RequestContext) obj, (IncomingRequestPolicy) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj2 = IncomingRequestPolicy.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetIncomingRequestPolicyRequest setIncomingRequestPolicyRequest = (SetIncomingRequestPolicyRequest) obj;
                reverseProtoWriter.getClass();
                setIncomingRequestPolicyRequest.getClass();
                reverseProtoWriter.writeBytes(setIncomingRequestPolicyRequest.unknownFields());
                IncomingRequestPolicy.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setIncomingRequestPolicyRequest.incoming_request_policy);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setIncomingRequestPolicyRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetIncomingRequestPolicyRequest setIncomingRequestPolicyRequest = (SetIncomingRequestPolicyRequest) obj;
                setIncomingRequestPolicyRequest.getClass();
                return IncomingRequestPolicy.ADAPTER.encodedSizeWithTag(2, setIncomingRequestPolicyRequest.incoming_request_policy) + RequestContext.ADAPTER.encodedSizeWithTag(1, setIncomingRequestPolicyRequest.request_context) + setIncomingRequestPolicyRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetIncomingRequestPolicyRequest setIncomingRequestPolicyRequest = (SetIncomingRequestPolicyRequest) obj;
                setIncomingRequestPolicyRequest.getClass();
                RequestContext requestContext = setIncomingRequestPolicyRequest.request_context;
                return SetIncomingRequestPolicyRequest.copy$default(setIncomingRequestPolicyRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetIncomingRequestPolicyRequest setIncomingRequestPolicyRequest = (SetIncomingRequestPolicyRequest) obj;
                setIncomingRequestPolicyRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, setIncomingRequestPolicyRequest.request_context);
                IncomingRequestPolicy.ADAPTER.encodeWithTag(protoWriter, 2, setIncomingRequestPolicyRequest.incoming_request_policy);
                protoWriter.writeBytes(setIncomingRequestPolicyRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetIncomingRequestPolicyRequest(RequestContext requestContext, IncomingRequestPolicy incomingRequestPolicy, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.incoming_request_policy = incomingRequestPolicy;
    }

    public static SetIncomingRequestPolicyRequest copy$default(SetIncomingRequestPolicyRequest setIncomingRequestPolicyRequest, RequestContext requestContext, ByteString byteString, int i) {
        IncomingRequestPolicy incomingRequestPolicy = setIncomingRequestPolicyRequest.incoming_request_policy;
        if ((i & 4) != 0) {
            byteString = setIncomingRequestPolicyRequest.unknownFields();
        }
        setIncomingRequestPolicyRequest.getClass();
        byteString.getClass();
        return new SetIncomingRequestPolicyRequest(requestContext, incomingRequestPolicy, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetIncomingRequestPolicyRequest)) {
            return false;
        }
        SetIncomingRequestPolicyRequest setIncomingRequestPolicyRequest = (SetIncomingRequestPolicyRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setIncomingRequestPolicyRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, setIncomingRequestPolicyRequest.request_context) && this.incoming_request_policy == setIncomingRequestPolicyRequest.incoming_request_policy;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        IncomingRequestPolicy incomingRequestPolicy = this.incoming_request_policy;
        int hashCode3 = hashCode2 + (incomingRequestPolicy != null ? incomingRequestPolicy.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SetAmountRequest.Builder builder = new SetAmountRequest.Builder(11);
        builder.request_context = this.request_context;
        builder.result = this.incoming_request_policy;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        IncomingRequestPolicy incomingRequestPolicy = this.incoming_request_policy;
        if (incomingRequestPolicy != null) {
            arrayList.add("incoming_request_policy=" + incomingRequestPolicy);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetIncomingRequestPolicyRequest{", "}", 0, null, null, 56);
    }
}
