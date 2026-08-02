package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.disputron.Pagination;
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
public final class ReportAppMessageViewRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ReportAppMessageViewRequest> CREATOR;
    public final String app_message_token;
    public final Long timestamp_in_epoch_millis;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ReportAppMessageViewRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.messagingplatformcommon.app.ReportAppMessageViewRequest$Companion$ADAPTER$1
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
                        return new ReportAppMessageViewRequest((String) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ReportAppMessageViewRequest reportAppMessageViewRequest = (ReportAppMessageViewRequest) obj;
                reverseProtoWriter.getClass();
                reportAppMessageViewRequest.getClass();
                reverseProtoWriter.writeBytes(reportAppMessageViewRequest.unknownFields());
                ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, reportAppMessageViewRequest.timestamp_in_epoch_millis);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, reportAppMessageViewRequest.app_message_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ReportAppMessageViewRequest reportAppMessageViewRequest = (ReportAppMessageViewRequest) obj;
                reportAppMessageViewRequest.getClass();
                return ProtoAdapter.INT64.encodedSizeWithTag(2, reportAppMessageViewRequest.timestamp_in_epoch_millis) + ProtoAdapter.STRING.encodedSizeWithTag(1, reportAppMessageViewRequest.app_message_token) + reportAppMessageViewRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ReportAppMessageViewRequest reportAppMessageViewRequest = (ReportAppMessageViewRequest) obj;
                reportAppMessageViewRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = reportAppMessageViewRequest.app_message_token;
                Long l = reportAppMessageViewRequest.timestamp_in_epoch_millis;
                byteString.getClass();
                return new ReportAppMessageViewRequest(str, l, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ReportAppMessageViewRequest reportAppMessageViewRequest = (ReportAppMessageViewRequest) obj;
                reportAppMessageViewRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, reportAppMessageViewRequest.app_message_token);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, reportAppMessageViewRequest.timestamp_in_epoch_millis);
                protoWriter.writeBytes(reportAppMessageViewRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportAppMessageViewRequest(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.app_message_token = str;
        this.timestamp_in_epoch_millis = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReportAppMessageViewRequest)) {
            return false;
        }
        ReportAppMessageViewRequest reportAppMessageViewRequest = (ReportAppMessageViewRequest) obj;
        return Intrinsics.areEqual(unknownFields(), reportAppMessageViewRequest.unknownFields()) && Intrinsics.areEqual(this.app_message_token, reportAppMessageViewRequest.app_message_token) && Intrinsics.areEqual(this.timestamp_in_epoch_millis, reportAppMessageViewRequest.timestamp_in_epoch_millis);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.app_message_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.timestamp_in_epoch_millis;
        int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Pagination.Builder builder = new Pagination.Builder(6);
        builder.offset = this.app_message_token;
        builder.limit = this.timestamp_in_epoch_millis;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.app_message_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "app_message_token=", arrayList);
        }
        Long l = this.timestamp_in_epoch_millis;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("timestamp_in_epoch_millis=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReportAppMessageViewRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ ReportAppMessageViewRequest(String str) {
        this(str, null, ByteString.EMPTY);
    }
}
