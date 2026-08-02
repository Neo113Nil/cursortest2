package com.squareup.protos.cash.blockly.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.blockly.common.BlockingContext;
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
public final class ReportAbuseRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ReportAbuseRequest> CREATOR;
    public final Boolean block;
    public final String blocker_override_customer_token;
    public final BlockingContext blocking_context;
    public final String customer_id;
    public final String payment_token;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ReportAbuseRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.blockly.api.ReportAbuseRequest$Companion$ADAPTER$1
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
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ReportAbuseRequest((Boolean) obj, (String) obj2, (String) obj3, (RequestContext) obj4, (String) obj5, (BlockingContext) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        obj4 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj4);
                    } else if (nextTag == 6) {
                        obj5 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 7) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj6 = BlockingContext.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ReportAbuseRequest reportAbuseRequest = (ReportAbuseRequest) obj;
                reverseProtoWriter.getClass();
                reportAbuseRequest.getClass();
                reverseProtoWriter.writeBytes(reportAbuseRequest.unknownFields());
                BlockingContext.ADAPTER.encodeWithTag(reverseProtoWriter, 7, reportAbuseRequest.blocking_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, reportAbuseRequest.blocker_override_customer_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, reportAbuseRequest.request_context);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, reportAbuseRequest.payment_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, reportAbuseRequest.customer_id);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, reportAbuseRequest.block);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ReportAbuseRequest reportAbuseRequest = (ReportAbuseRequest) obj;
                reportAbuseRequest.getClass();
                int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, reportAbuseRequest.block) + reportAbuseRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return BlockingContext.ADAPTER.encodedSizeWithTag(7, reportAbuseRequest.blocking_context) + protoAdapter2.encodedSizeWithTag(6, reportAbuseRequest.blocker_override_customer_token) + RequestContext.ADAPTER.encodedSizeWithTag(4, reportAbuseRequest.request_context) + protoAdapter2.encodedSizeWithTag(3, reportAbuseRequest.payment_token) + protoAdapter2.encodedSizeWithTag(2, reportAbuseRequest.customer_id) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ReportAbuseRequest reportAbuseRequest = (ReportAbuseRequest) obj;
                reportAbuseRequest.getClass();
                RequestContext requestContext = reportAbuseRequest.request_context;
                return ReportAbuseRequest.copy$default(reportAbuseRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 51);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ReportAbuseRequest reportAbuseRequest = (ReportAbuseRequest) obj;
                reportAbuseRequest.getClass();
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, reportAbuseRequest.block);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, reportAbuseRequest.customer_id);
                protoAdapter2.encodeWithTag(protoWriter, 3, reportAbuseRequest.payment_token);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, reportAbuseRequest.request_context);
                protoAdapter2.encodeWithTag(protoWriter, 6, reportAbuseRequest.blocker_override_customer_token);
                BlockingContext.ADAPTER.encodeWithTag(protoWriter, 7, reportAbuseRequest.blocking_context);
                protoWriter.writeBytes(reportAbuseRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportAbuseRequest(Boolean bool, String str, String str2, RequestContext requestContext, String str3, BlockingContext blockingContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.block = bool;
        this.customer_id = str;
        this.payment_token = str2;
        this.request_context = requestContext;
        this.blocker_override_customer_token = str3;
        this.blocking_context = blockingContext;
    }

    public static ReportAbuseRequest copy$default(ReportAbuseRequest reportAbuseRequest, RequestContext requestContext, ByteString byteString, int i) {
        Boolean bool = reportAbuseRequest.block;
        String str = reportAbuseRequest.customer_id;
        String str2 = (i & 4) != 0 ? reportAbuseRequest.payment_token : null;
        String str3 = reportAbuseRequest.blocker_override_customer_token;
        BlockingContext blockingContext = reportAbuseRequest.blocking_context;
        if ((i & 64) != 0) {
            byteString = reportAbuseRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        reportAbuseRequest.getClass();
        byteString2.getClass();
        return new ReportAbuseRequest(bool, str, str2, requestContext, str3, blockingContext, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReportAbuseRequest)) {
            return false;
        }
        ReportAbuseRequest reportAbuseRequest = (ReportAbuseRequest) obj;
        return Intrinsics.areEqual(unknownFields(), reportAbuseRequest.unknownFields()) && Intrinsics.areEqual(this.block, reportAbuseRequest.block) && Intrinsics.areEqual(this.customer_id, reportAbuseRequest.customer_id) && Intrinsics.areEqual(this.payment_token, reportAbuseRequest.payment_token) && Intrinsics.areEqual(this.request_context, reportAbuseRequest.request_context) && Intrinsics.areEqual(this.blocker_override_customer_token, reportAbuseRequest.blocker_override_customer_token) && this.blocking_context == reportAbuseRequest.blocking_context;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.block;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.customer_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.payment_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode5 = (hashCode4 + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str3 = this.blocker_override_customer_token;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        BlockingContext blockingContext = this.blocking_context;
        int hashCode7 = hashCode6 + (blockingContext != null ? blockingContext.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(11, false);
        builder.retryable = this.block;
        builder.description = this.customer_id;
        builder.field = this.payment_token;
        builder.category = this.request_context;
        builder.code = this.blocker_override_customer_token;
        builder.metadata = this.blocking_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.block;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("block=", bool, arrayList);
        }
        String str = this.customer_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_id=", arrayList);
        }
        if (this.payment_token != null) {
            arrayList.add("payment_token=██");
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str2 = this.blocker_override_customer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "blocker_override_customer_token=", arrayList);
        }
        BlockingContext blockingContext = this.blocking_context;
        if (blockingContext != null) {
            arrayList.add("blocking_context=" + blockingContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReportAbuseRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ ReportAbuseRequest(Boolean bool, String str, String str2, RequestContext requestContext) {
        this(bool, str, str2, requestContext, null, null, ByteString.EMPTY);
    }
}
