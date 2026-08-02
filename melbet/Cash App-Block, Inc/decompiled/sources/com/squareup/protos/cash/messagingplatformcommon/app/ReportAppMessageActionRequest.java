package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.messagingplatformcommon.app.GetDetailsPageRequest;
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
public final class ReportAppMessageActionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ReportAppMessageActionRequest> CREATOR;
    public final String action_url_opened;
    public final String app_message_token;
    public final Long timestamp_in_epoch_millis;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ReportAppMessageActionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.messagingplatformcommon.app.ReportAppMessageActionRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ReportAppMessageActionRequest((Long) obj3, (String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ReportAppMessageActionRequest reportAppMessageActionRequest = (ReportAppMessageActionRequest) obj;
                reverseProtoWriter.getClass();
                reportAppMessageActionRequest.getClass();
                reverseProtoWriter.writeBytes(reportAppMessageActionRequest.unknownFields());
                ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, reportAppMessageActionRequest.timestamp_in_epoch_millis);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, reportAppMessageActionRequest.action_url_opened);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, reportAppMessageActionRequest.app_message_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ReportAppMessageActionRequest reportAppMessageActionRequest = (ReportAppMessageActionRequest) obj;
                reportAppMessageActionRequest.getClass();
                int size$okio = reportAppMessageActionRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ProtoAdapter.INT64.encodedSizeWithTag(3, reportAppMessageActionRequest.timestamp_in_epoch_millis) + protoAdapter2.encodedSizeWithTag(2, reportAppMessageActionRequest.action_url_opened) + protoAdapter2.encodedSizeWithTag(1, reportAppMessageActionRequest.app_message_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ReportAppMessageActionRequest reportAppMessageActionRequest = (ReportAppMessageActionRequest) obj;
                reportAppMessageActionRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = reportAppMessageActionRequest.app_message_token;
                String str2 = reportAppMessageActionRequest.action_url_opened;
                Long l = reportAppMessageActionRequest.timestamp_in_epoch_millis;
                byteString.getClass();
                return new ReportAppMessageActionRequest(l, str, str2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ReportAppMessageActionRequest reportAppMessageActionRequest = (ReportAppMessageActionRequest) obj;
                reportAppMessageActionRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, reportAppMessageActionRequest.app_message_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, reportAppMessageActionRequest.action_url_opened);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, reportAppMessageActionRequest.timestamp_in_epoch_millis);
                protoWriter.writeBytes(reportAppMessageActionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportAppMessageActionRequest(Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.app_message_token = str;
        this.action_url_opened = str2;
        this.timestamp_in_epoch_millis = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReportAppMessageActionRequest)) {
            return false;
        }
        ReportAppMessageActionRequest reportAppMessageActionRequest = (ReportAppMessageActionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), reportAppMessageActionRequest.unknownFields()) && Intrinsics.areEqual(this.app_message_token, reportAppMessageActionRequest.app_message_token) && Intrinsics.areEqual(this.action_url_opened, reportAppMessageActionRequest.action_url_opened) && Intrinsics.areEqual(this.timestamp_in_epoch_millis, reportAppMessageActionRequest.timestamp_in_epoch_millis);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.app_message_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.action_url_opened;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.timestamp_in_epoch_millis;
        int hashCode4 = hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GetDetailsPageRequest.Builder builder = new GetDetailsPageRequest.Builder(2);
        builder.details_page_token = this.app_message_token;
        builder.template_token = this.action_url_opened;
        builder.template_version = this.timestamp_in_epoch_millis;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.app_message_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "app_message_token=", arrayList);
        }
        String str2 = this.action_url_opened;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "action_url_opened=", arrayList);
        }
        Long l = this.timestamp_in_epoch_millis;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("timestamp_in_epoch_millis=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReportAppMessageActionRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ ReportAppMessageActionRequest(String str, String str2) {
        this(null, str, str2, ByteString.EMPTY);
    }
}
