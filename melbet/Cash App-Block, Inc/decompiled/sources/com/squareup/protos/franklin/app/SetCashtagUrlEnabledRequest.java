package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.ResolveMergeRequest;
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
public final class SetCashtagUrlEnabledRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetCashtagUrlEnabledRequest> CREATOR;
    public final Boolean enabled;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetCashtagUrlEnabledRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SetCashtagUrlEnabledRequest$Companion$ADAPTER$1
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
                        return new SetCashtagUrlEnabledRequest((RequestContext) obj2, (Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 3) {
                        obj = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetCashtagUrlEnabledRequest setCashtagUrlEnabledRequest = (SetCashtagUrlEnabledRequest) obj;
                reverseProtoWriter.getClass();
                setCashtagUrlEnabledRequest.getClass();
                reverseProtoWriter.writeBytes(setCashtagUrlEnabledRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, setCashtagUrlEnabledRequest.request_context);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, setCashtagUrlEnabledRequest.enabled);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetCashtagUrlEnabledRequest setCashtagUrlEnabledRequest = (SetCashtagUrlEnabledRequest) obj;
                setCashtagUrlEnabledRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(4, setCashtagUrlEnabledRequest.request_context) + ProtoAdapter.BOOL.encodedSizeWithTag(3, setCashtagUrlEnabledRequest.enabled) + setCashtagUrlEnabledRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetCashtagUrlEnabledRequest setCashtagUrlEnabledRequest = (SetCashtagUrlEnabledRequest) obj;
                setCashtagUrlEnabledRequest.getClass();
                RequestContext requestContext = setCashtagUrlEnabledRequest.request_context;
                return SetCashtagUrlEnabledRequest.copy$default(setCashtagUrlEnabledRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 1);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetCashtagUrlEnabledRequest setCashtagUrlEnabledRequest = (SetCashtagUrlEnabledRequest) obj;
                setCashtagUrlEnabledRequest.getClass();
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, setCashtagUrlEnabledRequest.enabled);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, setCashtagUrlEnabledRequest.request_context);
                protoWriter.writeBytes(setCashtagUrlEnabledRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCashtagUrlEnabledRequest(RequestContext requestContext, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.enabled = bool;
        this.request_context = requestContext;
    }

    public static SetCashtagUrlEnabledRequest copy$default(SetCashtagUrlEnabledRequest setCashtagUrlEnabledRequest, RequestContext requestContext, ByteString byteString, int i) {
        Boolean bool = setCashtagUrlEnabledRequest.enabled;
        if ((i & 4) != 0) {
            byteString = setCashtagUrlEnabledRequest.unknownFields();
        }
        setCashtagUrlEnabledRequest.getClass();
        byteString.getClass();
        return new SetCashtagUrlEnabledRequest(requestContext, bool, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetCashtagUrlEnabledRequest)) {
            return false;
        }
        SetCashtagUrlEnabledRequest setCashtagUrlEnabledRequest = (SetCashtagUrlEnabledRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setCashtagUrlEnabledRequest.unknownFields()) && Intrinsics.areEqual(this.enabled, setCashtagUrlEnabledRequest.enabled) && Intrinsics.areEqual(this.request_context, setCashtagUrlEnabledRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.enabled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode3 = hashCode2 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResolveMergeRequest.Builder builder = new ResolveMergeRequest.Builder(3);
        builder.confirm_merge = this.enabled;
        builder.request_context = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetCashtagUrlEnabledRequest{", "}", 0, null, null, 56);
    }
}
