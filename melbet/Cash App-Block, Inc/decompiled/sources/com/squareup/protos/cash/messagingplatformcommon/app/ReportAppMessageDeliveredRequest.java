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
public final class ReportAppMessageDeliveredRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ReportAppMessageDeliveredRequest> CREATOR;
    public final String app_message_token;
    public final Long timestamp_in_epoch_millis;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ReportAppMessageDeliveredRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.messagingplatformcommon.app.ReportAppMessageDeliveredRequest$Companion$ADAPTER$1
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
                        return new ReportAppMessageDeliveredRequest((String) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                ReportAppMessageDeliveredRequest reportAppMessageDeliveredRequest = (ReportAppMessageDeliveredRequest) obj;
                reverseProtoWriter.getClass();
                reportAppMessageDeliveredRequest.getClass();
                reverseProtoWriter.writeBytes(reportAppMessageDeliveredRequest.unknownFields());
                ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, reportAppMessageDeliveredRequest.timestamp_in_epoch_millis);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, reportAppMessageDeliveredRequest.app_message_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ReportAppMessageDeliveredRequest reportAppMessageDeliveredRequest = (ReportAppMessageDeliveredRequest) obj;
                reportAppMessageDeliveredRequest.getClass();
                return ProtoAdapter.INT64.encodedSizeWithTag(2, reportAppMessageDeliveredRequest.timestamp_in_epoch_millis) + ProtoAdapter.STRING.encodedSizeWithTag(1, reportAppMessageDeliveredRequest.app_message_token) + reportAppMessageDeliveredRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ReportAppMessageDeliveredRequest reportAppMessageDeliveredRequest = (ReportAppMessageDeliveredRequest) obj;
                reportAppMessageDeliveredRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = reportAppMessageDeliveredRequest.app_message_token;
                Long l = reportAppMessageDeliveredRequest.timestamp_in_epoch_millis;
                byteString.getClass();
                return new ReportAppMessageDeliveredRequest(str, l, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ReportAppMessageDeliveredRequest reportAppMessageDeliveredRequest = (ReportAppMessageDeliveredRequest) obj;
                reportAppMessageDeliveredRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, reportAppMessageDeliveredRequest.app_message_token);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, reportAppMessageDeliveredRequest.timestamp_in_epoch_millis);
                protoWriter.writeBytes(reportAppMessageDeliveredRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportAppMessageDeliveredRequest(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.app_message_token = str;
        this.timestamp_in_epoch_millis = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReportAppMessageDeliveredRequest)) {
            return false;
        }
        ReportAppMessageDeliveredRequest reportAppMessageDeliveredRequest = (ReportAppMessageDeliveredRequest) obj;
        return Intrinsics.areEqual(unknownFields(), reportAppMessageDeliveredRequest.unknownFields()) && Intrinsics.areEqual(this.app_message_token, reportAppMessageDeliveredRequest.app_message_token) && Intrinsics.areEqual(this.timestamp_in_epoch_millis, reportAppMessageDeliveredRequest.timestamp_in_epoch_millis);
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
        Pagination.Builder builder = new Pagination.Builder(5);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReportAppMessageDeliveredRequest{", "}", 0, null, null, 56);
    }
}
