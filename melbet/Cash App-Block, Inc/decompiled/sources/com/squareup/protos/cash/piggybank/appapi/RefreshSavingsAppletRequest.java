package com.squareup.protos.cash.piggybank.appapi;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.FinishTutorialRequest;
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
public final class RefreshSavingsAppletRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RefreshSavingsAppletRequest> CREATOR;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RefreshSavingsAppletRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.piggybank.appapi.RefreshSavingsAppletRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new RefreshSavingsAppletRequest((RequestContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                RefreshSavingsAppletRequest refreshSavingsAppletRequest = (RefreshSavingsAppletRequest) obj;
                reverseProtoWriter.getClass();
                refreshSavingsAppletRequest.getClass();
                reverseProtoWriter.writeBytes(refreshSavingsAppletRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, refreshSavingsAppletRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RefreshSavingsAppletRequest refreshSavingsAppletRequest = (RefreshSavingsAppletRequest) obj;
                refreshSavingsAppletRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(1, refreshSavingsAppletRequest.request_context) + refreshSavingsAppletRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RefreshSavingsAppletRequest refreshSavingsAppletRequest = (RefreshSavingsAppletRequest) obj;
                refreshSavingsAppletRequest.getClass();
                RequestContext requestContext = refreshSavingsAppletRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new RefreshSavingsAppletRequest(requestContext2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RefreshSavingsAppletRequest refreshSavingsAppletRequest = (RefreshSavingsAppletRequest) obj;
                refreshSavingsAppletRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, refreshSavingsAppletRequest.request_context);
                protoWriter.writeBytes(refreshSavingsAppletRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ RefreshSavingsAppletRequest(RequestContext requestContext, int i) {
        this((i & 1) != 0 ? null : requestContext, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RefreshSavingsAppletRequest)) {
            return false;
        }
        RefreshSavingsAppletRequest refreshSavingsAppletRequest = (RefreshSavingsAppletRequest) obj;
        return Intrinsics.areEqual(unknownFields(), refreshSavingsAppletRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, refreshSavingsAppletRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = hashCode + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        FinishTutorialRequest.Builder builder = new FinishTutorialRequest.Builder(16);
        builder.request_context = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RefreshSavingsAppletRequest{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshSavingsAppletRequest(RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
    }
}
