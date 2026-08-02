package com.squareup.protos.cash.cash3dsauthentication.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.cash3dsauthentication.api.v1.ThreeDsAuthenticationRequest;
import com.squareup.protos.franklin.common.ProfileRow;
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
public final class ThreeDsAuthenticationRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ThreeDsAuthenticationRequest> CREATOR;
    public final RequestContext request_context;
    public final SdkInfo sdk_info;

    /* loaded from: classes7.dex */
    public final class SdkInfo extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SdkInfo> CREATOR;
        public final String sdk_app_id;
        public final String sdk_enc_data;
        public final String sdk_ephemeral_public_key;
        public final String sdk_reference_number;
        public final String sdk_transaction_id;

        static {
            ThreeDsAuthenticationRequest$SdkInfo$Companion$ADAPTER$1 threeDsAuthenticationRequest$SdkInfo$Companion$ADAPTER$1 = new ThreeDsAuthenticationRequest$SdkInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SdkInfo.class), "type.googleapis.com/squareup.cash.cash3dsauthentication.api.v1.ThreeDsAuthenticationRequest.SdkInfo", Syntax.PROTO_2, null, "squareup/cash/cash3dsauthentication/api/v1/three_ds_authenctication_api.proto");
            ADAPTER = threeDsAuthenticationRequest$SdkInfo$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(threeDsAuthenticationRequest$SdkInfo$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SdkInfo(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.sdk_enc_data = str;
            this.sdk_transaction_id = str2;
            this.sdk_app_id = str3;
            this.sdk_reference_number = str4;
            this.sdk_ephemeral_public_key = str5;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SdkInfo)) {
                return false;
            }
            SdkInfo sdkInfo = (SdkInfo) obj;
            return Intrinsics.areEqual(unknownFields(), sdkInfo.unknownFields()) && Intrinsics.areEqual(this.sdk_enc_data, sdkInfo.sdk_enc_data) && Intrinsics.areEqual(this.sdk_transaction_id, sdkInfo.sdk_transaction_id) && Intrinsics.areEqual(this.sdk_app_id, sdkInfo.sdk_app_id) && Intrinsics.areEqual(this.sdk_reference_number, sdkInfo.sdk_reference_number) && Intrinsics.areEqual(this.sdk_ephemeral_public_key, sdkInfo.sdk_ephemeral_public_key);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.sdk_enc_data;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.sdk_transaction_id;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.sdk_app_id;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.sdk_reference_number;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.sdk_ephemeral_public_key;
            int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileRow.Builder builder = new ProfileRow.Builder(2);
            builder.client_route = this.sdk_enc_data;
            builder.icon_id = this.sdk_transaction_id;
            builder.title = this.sdk_app_id;
            builder.subtitle = this.sdk_reference_number;
            builder.call_to_action = this.sdk_ephemeral_public_key;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.sdk_enc_data;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sdk_enc_data=", arrayList);
            }
            String str2 = this.sdk_transaction_id;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "sdk_transaction_id=", arrayList);
            }
            String str3 = this.sdk_app_id;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "sdk_app_id=", arrayList);
            }
            String str4 = this.sdk_reference_number;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "sdk_reference_number=", arrayList);
            }
            String str5 = this.sdk_ephemeral_public_key;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "sdk_ephemeral_public_key=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SdkInfo{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ThreeDsAuthenticationRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cash3dsauthentication.api.v1.ThreeDsAuthenticationRequest$Companion$ADAPTER$1
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
                        return new ThreeDsAuthenticationRequest((ThreeDsAuthenticationRequest.SdkInfo) obj, (RequestContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(ThreeDsAuthenticationRequest.SdkInfo.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ThreeDsAuthenticationRequest threeDsAuthenticationRequest = (ThreeDsAuthenticationRequest) obj;
                reverseProtoWriter.getClass();
                threeDsAuthenticationRequest.getClass();
                reverseProtoWriter.writeBytes(threeDsAuthenticationRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, threeDsAuthenticationRequest.request_context);
                ThreeDsAuthenticationRequest.SdkInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 1, threeDsAuthenticationRequest.sdk_info);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ThreeDsAuthenticationRequest threeDsAuthenticationRequest = (ThreeDsAuthenticationRequest) obj;
                threeDsAuthenticationRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(2, threeDsAuthenticationRequest.request_context) + ThreeDsAuthenticationRequest.SdkInfo.ADAPTER.encodedSizeWithTag(1, threeDsAuthenticationRequest.sdk_info) + threeDsAuthenticationRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ThreeDsAuthenticationRequest threeDsAuthenticationRequest = (ThreeDsAuthenticationRequest) obj;
                threeDsAuthenticationRequest.getClass();
                ThreeDsAuthenticationRequest.SdkInfo sdkInfo = threeDsAuthenticationRequest.sdk_info;
                ThreeDsAuthenticationRequest.SdkInfo sdkInfo2 = sdkInfo != null ? (ThreeDsAuthenticationRequest.SdkInfo) ThreeDsAuthenticationRequest.SdkInfo.ADAPTER.redact(sdkInfo) : null;
                RequestContext requestContext = threeDsAuthenticationRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new ThreeDsAuthenticationRequest(sdkInfo2, requestContext2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ThreeDsAuthenticationRequest threeDsAuthenticationRequest = (ThreeDsAuthenticationRequest) obj;
                threeDsAuthenticationRequest.getClass();
                ThreeDsAuthenticationRequest.SdkInfo.ADAPTER.encodeWithTag(protoWriter, 1, threeDsAuthenticationRequest.sdk_info);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, threeDsAuthenticationRequest.request_context);
                protoWriter.writeBytes(threeDsAuthenticationRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDsAuthenticationRequest(SdkInfo sdkInfo, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.sdk_info = sdkInfo;
        this.request_context = requestContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThreeDsAuthenticationRequest)) {
            return false;
        }
        ThreeDsAuthenticationRequest threeDsAuthenticationRequest = (ThreeDsAuthenticationRequest) obj;
        return Intrinsics.areEqual(unknownFields(), threeDsAuthenticationRequest.unknownFields()) && Intrinsics.areEqual(this.sdk_info, threeDsAuthenticationRequest.sdk_info) && Intrinsics.areEqual(this.request_context, threeDsAuthenticationRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SdkInfo sdkInfo = this.sdk_info;
        int hashCode2 = (hashCode + (sdkInfo != null ? sdkInfo.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode3 = hashCode2 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(8);
        builder.errors = this.sdk_info;
        builder.result = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SdkInfo sdkInfo = this.sdk_info;
        if (sdkInfo != null) {
            arrayList.add("sdk_info=" + sdkInfo);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ThreeDsAuthenticationRequest{", "}", 0, null, null, 56);
    }
}
