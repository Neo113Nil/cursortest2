package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.local.client.v1.GetShortlinkRequest;
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
public final class GetAppShortlinkRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAppShortlinkRequest> CREATOR;
    public final GetShortlinkRequest request;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetAppShortlinkRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.app.v1.GetAppShortlinkRequest$Companion$ADAPTER$1
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
                        return new GetAppShortlinkRequest((RequestContext) obj, (GetShortlinkRequest) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(GetShortlinkRequest.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetAppShortlinkRequest getAppShortlinkRequest = (GetAppShortlinkRequest) obj;
                reverseProtoWriter.getClass();
                getAppShortlinkRequest.getClass();
                reverseProtoWriter.writeBytes(getAppShortlinkRequest.unknownFields());
                GetShortlinkRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getAppShortlinkRequest.request);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getAppShortlinkRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetAppShortlinkRequest getAppShortlinkRequest = (GetAppShortlinkRequest) obj;
                getAppShortlinkRequest.getClass();
                return GetShortlinkRequest.ADAPTER.encodedSizeWithTag(2, getAppShortlinkRequest.request) + RequestContext.ADAPTER.encodedSizeWithTag(1, getAppShortlinkRequest.request_context) + getAppShortlinkRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetAppShortlinkRequest getAppShortlinkRequest = (GetAppShortlinkRequest) obj;
                getAppShortlinkRequest.getClass();
                RequestContext requestContext = getAppShortlinkRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                GetShortlinkRequest getShortlinkRequest = getAppShortlinkRequest.request;
                GetShortlinkRequest getShortlinkRequest2 = getShortlinkRequest != null ? (GetShortlinkRequest) GetShortlinkRequest.ADAPTER.redact(getShortlinkRequest) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new GetAppShortlinkRequest(requestContext2, getShortlinkRequest2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetAppShortlinkRequest getAppShortlinkRequest = (GetAppShortlinkRequest) obj;
                getAppShortlinkRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, getAppShortlinkRequest.request_context);
                GetShortlinkRequest.ADAPTER.encodeWithTag(protoWriter, 2, getAppShortlinkRequest.request);
                protoWriter.writeBytes(getAppShortlinkRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAppShortlinkRequest(RequestContext requestContext, GetShortlinkRequest getShortlinkRequest, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.request = getShortlinkRequest;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAppShortlinkRequest)) {
            return false;
        }
        GetAppShortlinkRequest getAppShortlinkRequest = (GetAppShortlinkRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getAppShortlinkRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, getAppShortlinkRequest.request_context) && Intrinsics.areEqual(this.request, getAppShortlinkRequest.request);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        GetShortlinkRequest getShortlinkRequest = this.request;
        int hashCode3 = hashCode2 + (getShortlinkRequest != null ? getShortlinkRequest.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(23);
        builder.card_type = this.request_context;
        builder.card_pii = this.request;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        GetShortlinkRequest getShortlinkRequest = this.request;
        if (getShortlinkRequest != null) {
            arrayList.add("request=" + getShortlinkRequest);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAppShortlinkRequest{", "}", 0, null, null, 56);
    }
}
