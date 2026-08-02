package com.squareup.protos.franklin.app;

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
public final class OverflowOptionPickerRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OverflowOptionPickerRequest> CREATOR;
    public final RequestContext request_context;
    public final String selected_option_identifier;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OverflowOptionPickerRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.OverflowOptionPickerRequest$Companion$ADAPTER$1
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
                        return new OverflowOptionPickerRequest((RequestContext) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                OverflowOptionPickerRequest overflowOptionPickerRequest = (OverflowOptionPickerRequest) obj;
                reverseProtoWriter.getClass();
                overflowOptionPickerRequest.getClass();
                reverseProtoWriter.writeBytes(overflowOptionPickerRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, overflowOptionPickerRequest.selected_option_identifier);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, overflowOptionPickerRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                OverflowOptionPickerRequest overflowOptionPickerRequest = (OverflowOptionPickerRequest) obj;
                overflowOptionPickerRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(2, overflowOptionPickerRequest.selected_option_identifier) + RequestContext.ADAPTER.encodedSizeWithTag(1, overflowOptionPickerRequest.request_context) + overflowOptionPickerRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                OverflowOptionPickerRequest overflowOptionPickerRequest = (OverflowOptionPickerRequest) obj;
                overflowOptionPickerRequest.getClass();
                RequestContext requestContext = overflowOptionPickerRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = overflowOptionPickerRequest.selected_option_identifier;
                byteString.getClass();
                return new OverflowOptionPickerRequest(requestContext2, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                OverflowOptionPickerRequest overflowOptionPickerRequest = (OverflowOptionPickerRequest) obj;
                overflowOptionPickerRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, overflowOptionPickerRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, overflowOptionPickerRequest.selected_option_identifier);
                protoWriter.writeBytes(overflowOptionPickerRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverflowOptionPickerRequest(RequestContext requestContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.selected_option_identifier = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OverflowOptionPickerRequest)) {
            return false;
        }
        OverflowOptionPickerRequest overflowOptionPickerRequest = (OverflowOptionPickerRequest) obj;
        return Intrinsics.areEqual(unknownFields(), overflowOptionPickerRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, overflowOptionPickerRequest.request_context) && Intrinsics.areEqual(this.selected_option_identifier, overflowOptionPickerRequest.selected_option_identifier);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.selected_option_identifier;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EndFlowRequest.Builder builder = new EndFlowRequest.Builder(16);
        builder.request_context = this.request_context;
        builder.action_id = this.selected_option_identifier;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.selected_option_identifier;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "selected_option_identifier=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OverflowOptionPickerRequest{", "}", 0, null, null, 56);
    }
}
