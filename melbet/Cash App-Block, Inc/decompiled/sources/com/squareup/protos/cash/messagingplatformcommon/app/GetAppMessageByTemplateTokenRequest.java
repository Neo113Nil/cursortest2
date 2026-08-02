package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.timecards.StartTimecardBreakRequest;
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
public final class GetAppMessageByTemplateTokenRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAppMessageByTemplateTokenRequest> CREATOR;
    public final String locale;
    public final String parent_metadata_id;
    public final String template_token;
    public final Long template_version;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetAppMessageByTemplateTokenRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.messagingplatformcommon.app.GetAppMessageByTemplateTokenRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetAppMessageByTemplateTokenRequest((String) obj, (String) obj3, (String) obj4, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetAppMessageByTemplateTokenRequest getAppMessageByTemplateTokenRequest = (GetAppMessageByTemplateTokenRequest) obj;
                reverseProtoWriter.getClass();
                getAppMessageByTemplateTokenRequest.getClass();
                reverseProtoWriter.writeBytes(getAppMessageByTemplateTokenRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, getAppMessageByTemplateTokenRequest.locale);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, getAppMessageByTemplateTokenRequest.parent_metadata_id);
                ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, getAppMessageByTemplateTokenRequest.template_version);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getAppMessageByTemplateTokenRequest.template_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetAppMessageByTemplateTokenRequest getAppMessageByTemplateTokenRequest = (GetAppMessageByTemplateTokenRequest) obj;
                getAppMessageByTemplateTokenRequest.getClass();
                int size$okio = getAppMessageByTemplateTokenRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(4, getAppMessageByTemplateTokenRequest.locale) + protoAdapter2.encodedSizeWithTag(3, getAppMessageByTemplateTokenRequest.parent_metadata_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, getAppMessageByTemplateTokenRequest.template_version) + protoAdapter2.encodedSizeWithTag(1, getAppMessageByTemplateTokenRequest.template_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetAppMessageByTemplateTokenRequest getAppMessageByTemplateTokenRequest = (GetAppMessageByTemplateTokenRequest) obj;
                getAppMessageByTemplateTokenRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getAppMessageByTemplateTokenRequest.template_token;
                Long l = getAppMessageByTemplateTokenRequest.template_version;
                String str2 = getAppMessageByTemplateTokenRequest.parent_metadata_id;
                String str3 = getAppMessageByTemplateTokenRequest.locale;
                byteString.getClass();
                return new GetAppMessageByTemplateTokenRequest(str, str2, str3, l, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetAppMessageByTemplateTokenRequest getAppMessageByTemplateTokenRequest = (GetAppMessageByTemplateTokenRequest) obj;
                getAppMessageByTemplateTokenRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getAppMessageByTemplateTokenRequest.template_token);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getAppMessageByTemplateTokenRequest.template_version);
                protoAdapter2.encodeWithTag(protoWriter, 3, getAppMessageByTemplateTokenRequest.parent_metadata_id);
                protoAdapter2.encodeWithTag(protoWriter, 4, getAppMessageByTemplateTokenRequest.locale);
                protoWriter.writeBytes(getAppMessageByTemplateTokenRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAppMessageByTemplateTokenRequest(String str, String str2, String str3, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.template_token = str;
        this.template_version = l;
        this.parent_metadata_id = str2;
        this.locale = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAppMessageByTemplateTokenRequest)) {
            return false;
        }
        GetAppMessageByTemplateTokenRequest getAppMessageByTemplateTokenRequest = (GetAppMessageByTemplateTokenRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getAppMessageByTemplateTokenRequest.unknownFields()) && Intrinsics.areEqual(this.template_token, getAppMessageByTemplateTokenRequest.template_token) && Intrinsics.areEqual(this.template_version, getAppMessageByTemplateTokenRequest.template_version) && Intrinsics.areEqual(this.parent_metadata_id, getAppMessageByTemplateTokenRequest.parent_metadata_id) && Intrinsics.areEqual(this.locale, getAppMessageByTemplateTokenRequest.locale);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.template_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.template_version;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str2 = this.parent_metadata_id;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.locale;
        int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        StartTimecardBreakRequest.Builder builder = new StartTimecardBreakRequest.Builder(1);
        builder.merchant_token = this.template_token;
        builder.version_number = this.template_version;
        builder.timecard_token = this.parent_metadata_id;
        builder.break_definition_token = this.locale;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.template_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "template_token=", arrayList);
        }
        Long l = this.template_version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("template_version=", l, arrayList);
        }
        String str2 = this.parent_metadata_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "parent_metadata_id=", arrayList);
        }
        String str3 = this.locale;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "locale=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAppMessageByTemplateTokenRequest{", "}", 0, null, null, 56);
    }
}
