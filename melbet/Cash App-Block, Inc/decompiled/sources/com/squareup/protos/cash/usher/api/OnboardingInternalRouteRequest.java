package com.squareup.protos.cash.usher.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ColoredButton;
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
public final class OnboardingInternalRouteRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OnboardingInternalRouteRequest> CREATOR;
    public final Integer child_flow_type;
    public final String encoded_flow_params;
    public final String flow_token;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OnboardingInternalRouteRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.usher.api.OnboardingInternalRouteRequest$Companion$ADAPTER$1
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
                        return new OnboardingInternalRouteRequest((String) obj, (Integer) obj2, (RequestContext) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj3);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                OnboardingInternalRouteRequest onboardingInternalRouteRequest = (OnboardingInternalRouteRequest) obj;
                reverseProtoWriter.getClass();
                onboardingInternalRouteRequest.getClass();
                reverseProtoWriter.writeBytes(onboardingInternalRouteRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, onboardingInternalRouteRequest.encoded_flow_params);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, onboardingInternalRouteRequest.request_context);
                ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, onboardingInternalRouteRequest.child_flow_type);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, onboardingInternalRouteRequest.flow_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                OnboardingInternalRouteRequest onboardingInternalRouteRequest = (OnboardingInternalRouteRequest) obj;
                onboardingInternalRouteRequest.getClass();
                int size$okio = onboardingInternalRouteRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(4, onboardingInternalRouteRequest.encoded_flow_params) + RequestContext.ADAPTER.encodedSizeWithTag(3, onboardingInternalRouteRequest.request_context) + ProtoAdapter.INT32.encodedSizeWithTag(2, onboardingInternalRouteRequest.child_flow_type) + protoAdapter2.encodedSizeWithTag(1, onboardingInternalRouteRequest.flow_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                OnboardingInternalRouteRequest onboardingInternalRouteRequest = (OnboardingInternalRouteRequest) obj;
                onboardingInternalRouteRequest.getClass();
                RequestContext requestContext = onboardingInternalRouteRequest.request_context;
                return OnboardingInternalRouteRequest.copy$default(onboardingInternalRouteRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 11);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                OnboardingInternalRouteRequest onboardingInternalRouteRequest = (OnboardingInternalRouteRequest) obj;
                onboardingInternalRouteRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, onboardingInternalRouteRequest.flow_token);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, onboardingInternalRouteRequest.child_flow_type);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 3, onboardingInternalRouteRequest.request_context);
                protoAdapter2.encodeWithTag(protoWriter, 4, onboardingInternalRouteRequest.encoded_flow_params);
                protoWriter.writeBytes(onboardingInternalRouteRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingInternalRouteRequest(String str, Integer num, RequestContext requestContext, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.flow_token = str;
        this.child_flow_type = num;
        this.request_context = requestContext;
        this.encoded_flow_params = str2;
    }

    public static OnboardingInternalRouteRequest copy$default(OnboardingInternalRouteRequest onboardingInternalRouteRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = onboardingInternalRouteRequest.flow_token;
        Integer num = onboardingInternalRouteRequest.child_flow_type;
        String str2 = onboardingInternalRouteRequest.encoded_flow_params;
        if ((i & 16) != 0) {
            byteString = onboardingInternalRouteRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        onboardingInternalRouteRequest.getClass();
        byteString2.getClass();
        return new OnboardingInternalRouteRequest(str, num, requestContext, str2, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OnboardingInternalRouteRequest)) {
            return false;
        }
        OnboardingInternalRouteRequest onboardingInternalRouteRequest = (OnboardingInternalRouteRequest) obj;
        return Intrinsics.areEqual(unknownFields(), onboardingInternalRouteRequest.unknownFields()) && Intrinsics.areEqual(this.flow_token, onboardingInternalRouteRequest.flow_token) && Intrinsics.areEqual(this.child_flow_type, onboardingInternalRouteRequest.child_flow_type) && Intrinsics.areEqual(this.request_context, onboardingInternalRouteRequest.request_context) && Intrinsics.areEqual(this.encoded_flow_params, onboardingInternalRouteRequest.encoded_flow_params);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.flow_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.child_flow_type;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode4 = (hashCode3 + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str2 = this.encoded_flow_params;
        int hashCode5 = hashCode4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(5);
        builder.button_color = this.flow_token;
        builder.text_color = this.child_flow_type;
        builder.text = this.request_context;
        builder.action = this.encoded_flow_params;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.flow_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "flow_token=", arrayList);
        }
        Integer num = this.child_flow_type;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("child_flow_type=", num, arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str2 = this.encoded_flow_params;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "encoded_flow_params=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OnboardingInternalRouteRequest{", "}", 0, null, null, 56);
    }
}
