package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.cryptonauts.api.SetUsdOverLNPaymentPreferenceRequest;
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
public final class ResolveMergeRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ResolveMergeRequest> CREATOR;
    public final Boolean confirm_merge;
    public final RequestContext request_context;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Boolean confirm_merge;
        public RequestContext request_context;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ResolveMergeRequest(this.request_context, this.confirm_merge, buildUnknownFields());
                case 1:
                    return new SetUsdOverLNPaymentPreferenceRequest(this.request_context, this.confirm_merge, buildUnknownFields());
                case 2:
                    return new FinishCreditMultiStepLoadRequest(this.request_context, this.confirm_merge, buildUnknownFields());
                default:
                    return new SetCashtagUrlEnabledRequest(this.request_context, this.confirm_merge, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ResolveMergeRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.ResolveMergeRequest$Companion$ADAPTER$1
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
                        return new ResolveMergeRequest((RequestContext) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 3) {
                        obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ResolveMergeRequest resolveMergeRequest = (ResolveMergeRequest) obj;
                reverseProtoWriter.getClass();
                resolveMergeRequest.getClass();
                reverseProtoWriter.writeBytes(resolveMergeRequest.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, resolveMergeRequest.confirm_merge);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, resolveMergeRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ResolveMergeRequest resolveMergeRequest = (ResolveMergeRequest) obj;
                resolveMergeRequest.getClass();
                return ProtoAdapter.BOOL.encodedSizeWithTag(3, resolveMergeRequest.confirm_merge) + RequestContext.ADAPTER.encodedSizeWithTag(4, resolveMergeRequest.request_context) + resolveMergeRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ResolveMergeRequest resolveMergeRequest = (ResolveMergeRequest) obj;
                resolveMergeRequest.getClass();
                RequestContext requestContext = resolveMergeRequest.request_context;
                return ResolveMergeRequest.copy$default(resolveMergeRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ResolveMergeRequest resolveMergeRequest = (ResolveMergeRequest) obj;
                resolveMergeRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, resolveMergeRequest.request_context);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, resolveMergeRequest.confirm_merge);
                protoWriter.writeBytes(resolveMergeRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolveMergeRequest(RequestContext requestContext, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.confirm_merge = bool;
    }

    public static ResolveMergeRequest copy$default(ResolveMergeRequest resolveMergeRequest, RequestContext requestContext, ByteString byteString, int i) {
        Boolean bool = resolveMergeRequest.confirm_merge;
        if ((i & 4) != 0) {
            byteString = resolveMergeRequest.unknownFields();
        }
        resolveMergeRequest.getClass();
        byteString.getClass();
        return new ResolveMergeRequest(requestContext, bool, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResolveMergeRequest)) {
            return false;
        }
        ResolveMergeRequest resolveMergeRequest = (ResolveMergeRequest) obj;
        return Intrinsics.areEqual(unknownFields(), resolveMergeRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, resolveMergeRequest.request_context) && Intrinsics.areEqual(this.confirm_merge, resolveMergeRequest.confirm_merge);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        Boolean bool = this.confirm_merge;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.request_context = this.request_context;
        builder.confirm_merge = this.confirm_merge;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        Boolean bool = this.confirm_merge;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("confirm_merge=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ResolveMergeRequest{", "}", 0, null, null, 56);
    }
}
