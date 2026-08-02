package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.deviceintegritly.api.PlayIntegrityVerdict;
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
public final class GetDetailsPageRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetDetailsPageRequest> CREATOR;
    public final String details_page_token;
    public final String template_token;
    public final Long template_version;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String details_page_token;
        public String template_token;
        public Long template_version;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GetDetailsPageRequest(this.template_version, this.details_page_token, this.template_token, buildUnknownFields());
                case 1:
                    return new PlayIntegrityVerdict.RequestDetails(this.template_version, this.details_page_token, this.template_token, buildUnknownFields());
                default:
                    return new ReportAppMessageActionRequest(this.template_version, this.details_page_token, this.template_token, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetDetailsPageRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.messagingplatformcommon.app.GetDetailsPageRequest$Companion$ADAPTER$1
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
                        return new GetDetailsPageRequest((Long) obj3, (String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                GetDetailsPageRequest getDetailsPageRequest = (GetDetailsPageRequest) obj;
                reverseProtoWriter.getClass();
                getDetailsPageRequest.getClass();
                reverseProtoWriter.writeBytes(getDetailsPageRequest.unknownFields());
                ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, getDetailsPageRequest.template_version);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getDetailsPageRequest.template_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getDetailsPageRequest.details_page_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetDetailsPageRequest getDetailsPageRequest = (GetDetailsPageRequest) obj;
                getDetailsPageRequest.getClass();
                int size$okio = getDetailsPageRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ProtoAdapter.INT64.encodedSizeWithTag(3, getDetailsPageRequest.template_version) + protoAdapter2.encodedSizeWithTag(2, getDetailsPageRequest.template_token) + protoAdapter2.encodedSizeWithTag(1, getDetailsPageRequest.details_page_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetDetailsPageRequest getDetailsPageRequest = (GetDetailsPageRequest) obj;
                getDetailsPageRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getDetailsPageRequest.details_page_token;
                String str2 = getDetailsPageRequest.template_token;
                Long l = getDetailsPageRequest.template_version;
                byteString.getClass();
                return new GetDetailsPageRequest(l, str, str2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetDetailsPageRequest getDetailsPageRequest = (GetDetailsPageRequest) obj;
                getDetailsPageRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getDetailsPageRequest.details_page_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, getDetailsPageRequest.template_token);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getDetailsPageRequest.template_version);
                protoWriter.writeBytes(getDetailsPageRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ GetDetailsPageRequest(String str, String str2, Long l, int i) {
        this((i & 4) != 0 ? null : l, (i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetDetailsPageRequest)) {
            return false;
        }
        GetDetailsPageRequest getDetailsPageRequest = (GetDetailsPageRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getDetailsPageRequest.unknownFields()) && Intrinsics.areEqual(this.details_page_token, getDetailsPageRequest.details_page_token) && Intrinsics.areEqual(this.template_token, getDetailsPageRequest.template_token) && Intrinsics.areEqual(this.template_version, getDetailsPageRequest.template_version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.details_page_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.template_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.template_version;
        int hashCode4 = hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.details_page_token = this.details_page_token;
        builder.template_token = this.template_token;
        builder.template_version = this.template_version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.details_page_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "details_page_token=", arrayList);
        }
        String str2 = this.template_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "template_token=", arrayList);
        }
        Long l = this.template_version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("template_version=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetDetailsPageRequest{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDetailsPageRequest(Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.details_page_token = str;
        this.template_token = str2;
        this.template_version = l;
    }
}
