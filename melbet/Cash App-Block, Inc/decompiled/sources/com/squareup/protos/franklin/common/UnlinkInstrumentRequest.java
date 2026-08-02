package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.EndFlowRequest;
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
public final class UnlinkInstrumentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UnlinkInstrumentRequest> CREATOR;
    public final String instrument_token;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UnlinkInstrumentRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.common.UnlinkInstrumentRequest$Companion$ADAPTER$1
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
                        return new UnlinkInstrumentRequest((RequestContext) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UnlinkInstrumentRequest unlinkInstrumentRequest = (UnlinkInstrumentRequest) obj;
                reverseProtoWriter.getClass();
                unlinkInstrumentRequest.getClass();
                reverseProtoWriter.writeBytes(unlinkInstrumentRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, unlinkInstrumentRequest.instrument_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, unlinkInstrumentRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UnlinkInstrumentRequest unlinkInstrumentRequest = (UnlinkInstrumentRequest) obj;
                unlinkInstrumentRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, unlinkInstrumentRequest.instrument_token) + RequestContext.ADAPTER.encodedSizeWithTag(2, unlinkInstrumentRequest.request_context) + unlinkInstrumentRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UnlinkInstrumentRequest unlinkInstrumentRequest = (UnlinkInstrumentRequest) obj;
                unlinkInstrumentRequest.getClass();
                RequestContext requestContext = unlinkInstrumentRequest.request_context;
                return UnlinkInstrumentRequest.copy$default(unlinkInstrumentRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UnlinkInstrumentRequest unlinkInstrumentRequest = (UnlinkInstrumentRequest) obj;
                unlinkInstrumentRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, unlinkInstrumentRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, unlinkInstrumentRequest.instrument_token);
                protoWriter.writeBytes(unlinkInstrumentRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlinkInstrumentRequest(RequestContext requestContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.instrument_token = str;
    }

    public static UnlinkInstrumentRequest copy$default(UnlinkInstrumentRequest unlinkInstrumentRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = unlinkInstrumentRequest.instrument_token;
        if ((i & 4) != 0) {
            byteString = unlinkInstrumentRequest.unknownFields();
        }
        unlinkInstrumentRequest.getClass();
        byteString.getClass();
        return new UnlinkInstrumentRequest(requestContext, str, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnlinkInstrumentRequest)) {
            return false;
        }
        UnlinkInstrumentRequest unlinkInstrumentRequest = (UnlinkInstrumentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), unlinkInstrumentRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, unlinkInstrumentRequest.request_context) && Intrinsics.areEqual(this.instrument_token, unlinkInstrumentRequest.instrument_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.instrument_token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EndFlowRequest.Builder builder = new EndFlowRequest.Builder(22);
        builder.request_context = this.request_context;
        builder.action_id = this.instrument_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UnlinkInstrumentRequest{", "}", 0, null, null, 56);
    }
}
