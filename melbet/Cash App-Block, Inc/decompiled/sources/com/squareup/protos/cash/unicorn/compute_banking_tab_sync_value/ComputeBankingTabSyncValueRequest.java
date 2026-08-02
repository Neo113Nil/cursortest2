package com.squareup.protos.cash.unicorn.compute_banking_tab_sync_value;

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
public final class ComputeBankingTabSyncValueRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ComputeBankingTabSyncValueRequest> CREATOR;
    public final String option_id_interacted_with;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ComputeBankingTabSyncValueRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.unicorn.compute_banking_tab_sync_value.ComputeBankingTabSyncValueRequest$Companion$ADAPTER$1
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
                        return new ComputeBankingTabSyncValueRequest((RequestContext) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                ComputeBankingTabSyncValueRequest computeBankingTabSyncValueRequest = (ComputeBankingTabSyncValueRequest) obj;
                reverseProtoWriter.getClass();
                computeBankingTabSyncValueRequest.getClass();
                reverseProtoWriter.writeBytes(computeBankingTabSyncValueRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, computeBankingTabSyncValueRequest.option_id_interacted_with);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, computeBankingTabSyncValueRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ComputeBankingTabSyncValueRequest computeBankingTabSyncValueRequest = (ComputeBankingTabSyncValueRequest) obj;
                computeBankingTabSyncValueRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(2, computeBankingTabSyncValueRequest.option_id_interacted_with) + RequestContext.ADAPTER.encodedSizeWithTag(1, computeBankingTabSyncValueRequest.request_context) + computeBankingTabSyncValueRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ComputeBankingTabSyncValueRequest computeBankingTabSyncValueRequest = (ComputeBankingTabSyncValueRequest) obj;
                computeBankingTabSyncValueRequest.getClass();
                RequestContext requestContext = computeBankingTabSyncValueRequest.request_context;
                return ComputeBankingTabSyncValueRequest.copy$default(computeBankingTabSyncValueRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ComputeBankingTabSyncValueRequest computeBankingTabSyncValueRequest = (ComputeBankingTabSyncValueRequest) obj;
                computeBankingTabSyncValueRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, computeBankingTabSyncValueRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, computeBankingTabSyncValueRequest.option_id_interacted_with);
                protoWriter.writeBytes(computeBankingTabSyncValueRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComputeBankingTabSyncValueRequest(RequestContext requestContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.option_id_interacted_with = str;
    }

    public static ComputeBankingTabSyncValueRequest copy$default(ComputeBankingTabSyncValueRequest computeBankingTabSyncValueRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = computeBankingTabSyncValueRequest.option_id_interacted_with;
        if ((i & 4) != 0) {
            byteString = computeBankingTabSyncValueRequest.unknownFields();
        }
        computeBankingTabSyncValueRequest.getClass();
        byteString.getClass();
        return new ComputeBankingTabSyncValueRequest(requestContext, str, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComputeBankingTabSyncValueRequest)) {
            return false;
        }
        ComputeBankingTabSyncValueRequest computeBankingTabSyncValueRequest = (ComputeBankingTabSyncValueRequest) obj;
        return Intrinsics.areEqual(unknownFields(), computeBankingTabSyncValueRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, computeBankingTabSyncValueRequest.request_context) && Intrinsics.areEqual(this.option_id_interacted_with, computeBankingTabSyncValueRequest.option_id_interacted_with);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.option_id_interacted_with;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EndFlowRequest.Builder builder = new EndFlowRequest.Builder(13);
        builder.request_context = this.request_context;
        builder.action_id = this.option_id_interacted_with;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.option_id_interacted_with;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "option_id_interacted_with=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ComputeBankingTabSyncValueRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ ComputeBankingTabSyncValueRequest() {
        this(null, null, ByteString.EMPTY);
    }
}
