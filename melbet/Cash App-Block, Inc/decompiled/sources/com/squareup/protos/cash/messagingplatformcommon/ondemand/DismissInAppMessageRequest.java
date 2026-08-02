package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
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
public final class DismissInAppMessageRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DismissInAppMessageRequest> CREATOR;
    public final String campaign_token;

    /* renamed from: format, reason: collision with root package name */
    public final String f1318format;
    public final Long occurred_at;
    public final String template_token;
    public final Long template_version;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DismissInAppMessageRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.messagingplatformcommon.ondemand.DismissInAppMessageRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new DismissInAppMessageRequest((String) obj, (Long) obj2, (String) obj3, (String) obj4, (Long) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj5 = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                DismissInAppMessageRequest dismissInAppMessageRequest = (DismissInAppMessageRequest) obj;
                reverseProtoWriter.getClass();
                dismissInAppMessageRequest.getClass();
                reverseProtoWriter.writeBytes(dismissInAppMessageRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, dismissInAppMessageRequest.template_version);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 4, dismissInAppMessageRequest.template_token);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 3, dismissInAppMessageRequest.f1318format);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, dismissInAppMessageRequest.occurred_at);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 1, dismissInAppMessageRequest.campaign_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                DismissInAppMessageRequest dismissInAppMessageRequest = (DismissInAppMessageRequest) obj;
                dismissInAppMessageRequest.getClass();
                int size$okio = dismissInAppMessageRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, dismissInAppMessageRequest.campaign_token) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                return protoAdapter3.encodedSizeWithTag(5, dismissInAppMessageRequest.template_version) + protoAdapter2.encodedSizeWithTag(4, dismissInAppMessageRequest.template_token) + protoAdapter2.encodedSizeWithTag(3, dismissInAppMessageRequest.f1318format) + protoAdapter3.encodedSizeWithTag(2, dismissInAppMessageRequest.occurred_at) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                DismissInAppMessageRequest dismissInAppMessageRequest = (DismissInAppMessageRequest) obj;
                dismissInAppMessageRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = dismissInAppMessageRequest.campaign_token;
                Long l = dismissInAppMessageRequest.occurred_at;
                String str2 = dismissInAppMessageRequest.f1318format;
                String str3 = dismissInAppMessageRequest.template_token;
                Long l2 = dismissInAppMessageRequest.template_version;
                byteString.getClass();
                return new DismissInAppMessageRequest(str, l, str2, str3, l2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                DismissInAppMessageRequest dismissInAppMessageRequest = (DismissInAppMessageRequest) obj;
                dismissInAppMessageRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, dismissInAppMessageRequest.campaign_token);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                protoAdapter3.encodeWithTag(protoWriter, 2, dismissInAppMessageRequest.occurred_at);
                protoAdapter2.encodeWithTag(protoWriter, 3, dismissInAppMessageRequest.f1318format);
                protoAdapter2.encodeWithTag(protoWriter, 4, dismissInAppMessageRequest.template_token);
                protoAdapter3.encodeWithTag(protoWriter, 5, dismissInAppMessageRequest.template_version);
                protoWriter.writeBytes(dismissInAppMessageRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DismissInAppMessageRequest(String str, Long l, String str2, String str3, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.campaign_token = str;
        this.occurred_at = l;
        this.f1318format = str2;
        this.template_token = str3;
        this.template_version = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DismissInAppMessageRequest)) {
            return false;
        }
        DismissInAppMessageRequest dismissInAppMessageRequest = (DismissInAppMessageRequest) obj;
        return Intrinsics.areEqual(unknownFields(), dismissInAppMessageRequest.unknownFields()) && Intrinsics.areEqual(this.campaign_token, dismissInAppMessageRequest.campaign_token) && Intrinsics.areEqual(this.occurred_at, dismissInAppMessageRequest.occurred_at) && Intrinsics.areEqual(this.f1318format, dismissInAppMessageRequest.f1318format) && Intrinsics.areEqual(this.template_token, dismissInAppMessageRequest.template_token) && Intrinsics.areEqual(this.template_version, dismissInAppMessageRequest.template_version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.campaign_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.occurred_at;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str2 = this.f1318format;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.template_token;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l2 = this.template_version;
        int hashCode6 = hashCode5 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(24);
        builder.icon = this.campaign_token;
        builder.title = this.occurred_at;
        builder.subtitle = this.f1318format;
        builder.action = this.template_token;
        builder.icon_background_color = this.template_version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.campaign_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "campaign_token=", arrayList);
        }
        Long l = this.occurred_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("occurred_at=", l, arrayList);
        }
        String str2 = this.f1318format;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "format=", arrayList);
        }
        String str3 = this.template_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "template_token=", arrayList);
        }
        Long l2 = this.template_version;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("template_version=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DismissInAppMessageRequest{", "}", 0, null, null, 56);
    }
}
