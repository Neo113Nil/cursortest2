package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.Blockers;
import com.squareup.protos.franklin.app.SetAmountRequest;
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
public final class SkipBlockerRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SkipBlockerRequest> CREATOR;
    public final Blockers blockers;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SkipBlockerRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SkipBlockerRequest$Companion$ADAPTER$1
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
                        return new SkipBlockerRequest((RequestContext) obj, (Blockers) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj2 = TransactorKt.decodeMessageOrMerge(Blockers.ADAPTER, protoReader, obj2);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SkipBlockerRequest skipBlockerRequest = (SkipBlockerRequest) obj;
                reverseProtoWriter.getClass();
                skipBlockerRequest.getClass();
                reverseProtoWriter.writeBytes(skipBlockerRequest.unknownFields());
                Blockers.ADAPTER.encodeWithTag(reverseProtoWriter, 1, skipBlockerRequest.blockers);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, skipBlockerRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SkipBlockerRequest skipBlockerRequest = (SkipBlockerRequest) obj;
                skipBlockerRequest.getClass();
                return Blockers.ADAPTER.encodedSizeWithTag(1, skipBlockerRequest.blockers) + RequestContext.ADAPTER.encodedSizeWithTag(2, skipBlockerRequest.request_context) + skipBlockerRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SkipBlockerRequest skipBlockerRequest = (SkipBlockerRequest) obj;
                skipBlockerRequest.getClass();
                RequestContext requestContext = skipBlockerRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                Blockers blockers = skipBlockerRequest.blockers;
                Blockers blockers2 = blockers != null ? (Blockers) Blockers.ADAPTER.redact(blockers) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new SkipBlockerRequest(requestContext2, blockers2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SkipBlockerRequest skipBlockerRequest = (SkipBlockerRequest) obj;
                skipBlockerRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, skipBlockerRequest.request_context);
                Blockers.ADAPTER.encodeWithTag(protoWriter, 1, skipBlockerRequest.blockers);
                protoWriter.writeBytes(skipBlockerRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkipBlockerRequest(RequestContext requestContext, Blockers blockers, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.blockers = blockers;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SkipBlockerRequest)) {
            return false;
        }
        SkipBlockerRequest skipBlockerRequest = (SkipBlockerRequest) obj;
        return Intrinsics.areEqual(unknownFields(), skipBlockerRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, skipBlockerRequest.request_context) && Intrinsics.areEqual(this.blockers, skipBlockerRequest.blockers);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        Blockers blockers = this.blockers;
        int hashCode3 = hashCode2 + (blockers != null ? blockers.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SetAmountRequest.Builder builder = new SetAmountRequest.Builder(17);
        builder.request_context = this.request_context;
        builder.result = this.blockers;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        Blockers blockers = this.blockers;
        if (blockers != null) {
            arrayList.add("blockers=" + blockers);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SkipBlockerRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ SkipBlockerRequest(RequestContext requestContext, Blockers blockers, int i) {
        this((i & 1) != 0 ? null : requestContext, blockers, ByteString.EMPTY);
    }
}
