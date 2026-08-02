package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
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
public final class GetLoginScenarioPlanRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetLoginScenarioPlanRequest> CREATOR;
    public final String backup_tag;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetLoginScenarioPlanRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.janus.api.GetLoginScenarioPlanRequest$Companion$ADAPTER$1
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
                        return new GetLoginScenarioPlanRequest((RequestContext) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetLoginScenarioPlanRequest getLoginScenarioPlanRequest = (GetLoginScenarioPlanRequest) obj;
                reverseProtoWriter.getClass();
                getLoginScenarioPlanRequest.getClass();
                reverseProtoWriter.writeBytes(getLoginScenarioPlanRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, getLoginScenarioPlanRequest.backup_tag);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getLoginScenarioPlanRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetLoginScenarioPlanRequest getLoginScenarioPlanRequest = (GetLoginScenarioPlanRequest) obj;
                getLoginScenarioPlanRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(2, getLoginScenarioPlanRequest.backup_tag) + RequestContext.ADAPTER.encodedSizeWithTag(1, getLoginScenarioPlanRequest.request_context) + getLoginScenarioPlanRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetLoginScenarioPlanRequest getLoginScenarioPlanRequest = (GetLoginScenarioPlanRequest) obj;
                getLoginScenarioPlanRequest.getClass();
                RequestContext requestContext = getLoginScenarioPlanRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new GetLoginScenarioPlanRequest(requestContext2, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetLoginScenarioPlanRequest getLoginScenarioPlanRequest = (GetLoginScenarioPlanRequest) obj;
                getLoginScenarioPlanRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, getLoginScenarioPlanRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getLoginScenarioPlanRequest.backup_tag);
                protoWriter.writeBytes(getLoginScenarioPlanRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLoginScenarioPlanRequest(RequestContext requestContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.backup_tag = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetLoginScenarioPlanRequest)) {
            return false;
        }
        GetLoginScenarioPlanRequest getLoginScenarioPlanRequest = (GetLoginScenarioPlanRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getLoginScenarioPlanRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, getLoginScenarioPlanRequest.request_context) && Intrinsics.areEqual(this.backup_tag, getLoginScenarioPlanRequest.backup_tag);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.backup_tag;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EndFlowRequest.Builder builder = new EndFlowRequest.Builder(9);
        builder.request_context = this.request_context;
        builder.action_id = this.backup_tag;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.backup_tag != null) {
            arrayList.add("backup_tag=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetLoginScenarioPlanRequest{", "}", 0, null, null, 56);
    }
}
