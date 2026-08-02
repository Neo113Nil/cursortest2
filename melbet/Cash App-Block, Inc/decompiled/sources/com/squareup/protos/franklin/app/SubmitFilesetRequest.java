package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SubmitFormRequest;
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
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SubmitFilesetRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitFilesetRequest> CREATOR;
    public final String action_id;
    public final List file_tokens;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SubmitFilesetRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SubmitFilesetRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SubmitFilesetRequest((RequestContext) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SubmitFilesetRequest submitFilesetRequest = (SubmitFilesetRequest) obj;
                reverseProtoWriter.getClass();
                submitFilesetRequest.getClass();
                reverseProtoWriter.writeBytes(submitFilesetRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 3, submitFilesetRequest.file_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, submitFilesetRequest.action_id);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, submitFilesetRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SubmitFilesetRequest submitFilesetRequest = (SubmitFilesetRequest) obj;
                submitFilesetRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, submitFilesetRequest.request_context) + submitFilesetRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.asRepeated().encodedSizeWithTag(3, submitFilesetRequest.file_tokens) + protoAdapter2.encodedSizeWithTag(2, submitFilesetRequest.action_id) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SubmitFilesetRequest submitFilesetRequest = (SubmitFilesetRequest) obj;
                submitFilesetRequest.getClass();
                RequestContext requestContext = submitFilesetRequest.request_context;
                return SubmitFilesetRequest.copy$default(submitFilesetRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 6);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SubmitFilesetRequest submitFilesetRequest = (SubmitFilesetRequest) obj;
                submitFilesetRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, submitFilesetRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, submitFilesetRequest.action_id);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 3, submitFilesetRequest.file_tokens);
                protoWriter.writeBytes(submitFilesetRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitFilesetRequest(RequestContext requestContext, String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.action_id = str;
        this.file_tokens = TransactorKt.immutableCopyOf("file_tokens", list);
    }

    public static SubmitFilesetRequest copy$default(SubmitFilesetRequest submitFilesetRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = submitFilesetRequest.action_id;
        List list = submitFilesetRequest.file_tokens;
        if ((i & 8) != 0) {
            byteString = submitFilesetRequest.unknownFields();
        }
        submitFilesetRequest.getClass();
        list.getClass();
        byteString.getClass();
        return new SubmitFilesetRequest(requestContext, str, list, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitFilesetRequest)) {
            return false;
        }
        SubmitFilesetRequest submitFilesetRequest = (SubmitFilesetRequest) obj;
        return Intrinsics.areEqual(unknownFields(), submitFilesetRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, submitFilesetRequest.request_context) && Intrinsics.areEqual(this.action_id, submitFilesetRequest.action_id) && Intrinsics.areEqual(this.file_tokens, submitFilesetRequest.file_tokens);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.action_id;
        int hashCode3 = this.file_tokens.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubmitFormRequest.Builder builder = new SubmitFormRequest.Builder(1);
        builder.request_context = this.request_context;
        builder.action_id = this.action_id;
        builder.results = this.file_tokens;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.action_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action_id=", arrayList);
        }
        List list = this.file_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("file_tokens=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitFilesetRequest{", "}", 0, null, null, 56);
    }
}
