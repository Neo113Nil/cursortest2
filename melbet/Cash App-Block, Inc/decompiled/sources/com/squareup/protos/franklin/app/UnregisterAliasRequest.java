package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.UiAlias;
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
public final class UnregisterAliasRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UnregisterAliasRequest> CREATOR;
    public final UiAlias alias;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UnregisterAliasRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.UnregisterAliasRequest$Companion$ADAPTER$1
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
                        return new UnregisterAliasRequest((RequestContext) obj, (UiAlias) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 3) {
                        obj2 = TransactorKt.decodeMessageOrMerge(UiAlias.ADAPTER, protoReader, obj2);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UnregisterAliasRequest unregisterAliasRequest = (UnregisterAliasRequest) obj;
                reverseProtoWriter.getClass();
                unregisterAliasRequest.getClass();
                reverseProtoWriter.writeBytes(unregisterAliasRequest.unknownFields());
                UiAlias.ADAPTER.encodeWithTag(reverseProtoWriter, 3, unregisterAliasRequest.alias);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, unregisterAliasRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UnregisterAliasRequest unregisterAliasRequest = (UnregisterAliasRequest) obj;
                unregisterAliasRequest.getClass();
                return UiAlias.ADAPTER.encodedSizeWithTag(3, unregisterAliasRequest.alias) + RequestContext.ADAPTER.encodedSizeWithTag(4, unregisterAliasRequest.request_context) + unregisterAliasRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UnregisterAliasRequest unregisterAliasRequest = (UnregisterAliasRequest) obj;
                unregisterAliasRequest.getClass();
                RequestContext requestContext = unregisterAliasRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                UiAlias uiAlias = unregisterAliasRequest.alias;
                UiAlias uiAlias2 = uiAlias != null ? (UiAlias) UiAlias.ADAPTER.redact(uiAlias) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new UnregisterAliasRequest(requestContext2, uiAlias2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UnregisterAliasRequest unregisterAliasRequest = (UnregisterAliasRequest) obj;
                unregisterAliasRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, unregisterAliasRequest.request_context);
                UiAlias.ADAPTER.encodeWithTag(protoWriter, 3, unregisterAliasRequest.alias);
                protoWriter.writeBytes(unregisterAliasRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnregisterAliasRequest(RequestContext requestContext, UiAlias uiAlias, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.alias = uiAlias;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnregisterAliasRequest)) {
            return false;
        }
        UnregisterAliasRequest unregisterAliasRequest = (UnregisterAliasRequest) obj;
        return Intrinsics.areEqual(unknownFields(), unregisterAliasRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, unregisterAliasRequest.request_context) && Intrinsics.areEqual(this.alias, unregisterAliasRequest.alias);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        UiAlias uiAlias = this.alias;
        int hashCode3 = hashCode2 + (uiAlias != null ? uiAlias.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SetAmountRequest.Builder builder = new SetAmountRequest.Builder(23);
        builder.request_context = this.request_context;
        builder.result = this.alias;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        UiAlias uiAlias = this.alias;
        if (uiAlias != null) {
            arrayList.add("alias=" + uiAlias);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UnregisterAliasRequest{", "}", 0, null, null, 56);
    }
}
