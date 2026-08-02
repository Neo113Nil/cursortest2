package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.VerifyPasscodeRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ApproveCashAppPayRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ApproveCashAppPayRequest> CREATOR;
    public final String referrer_flow_token;
    public final String request_auth_flow_triggers_mobile_url;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ApproveCashAppPayRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.ApproveCashAppPayRequest$Companion$ADAPTER$1
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
                        break;
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                RequestContext requestContext = (RequestContext) obj;
                String str = (String) obj2;
                if (str != null) {
                    return new ApproveCashAppPayRequest(requestContext, str, (String) obj3, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj2, "request_auth_flow_triggers_mobile_url");
                throw null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ApproveCashAppPayRequest approveCashAppPayRequest = (ApproveCashAppPayRequest) obj;
                reverseProtoWriter.getClass();
                approveCashAppPayRequest.getClass();
                reverseProtoWriter.writeBytes(approveCashAppPayRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, approveCashAppPayRequest.referrer_flow_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, approveCashAppPayRequest.request_auth_flow_triggers_mobile_url);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, approveCashAppPayRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ApproveCashAppPayRequest approveCashAppPayRequest = (ApproveCashAppPayRequest) obj;
                approveCashAppPayRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, approveCashAppPayRequest.request_context) + approveCashAppPayRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(3, approveCashAppPayRequest.referrer_flow_token) + protoAdapter2.encodedSizeWithTag(2, approveCashAppPayRequest.request_auth_flow_triggers_mobile_url) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ApproveCashAppPayRequest approveCashAppPayRequest = (ApproveCashAppPayRequest) obj;
                approveCashAppPayRequest.getClass();
                RequestContext requestContext = approveCashAppPayRequest.request_context;
                return ApproveCashAppPayRequest.copy$default(approveCashAppPayRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 6);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ApproveCashAppPayRequest approveCashAppPayRequest = (ApproveCashAppPayRequest) obj;
                approveCashAppPayRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, approveCashAppPayRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, approveCashAppPayRequest.request_auth_flow_triggers_mobile_url);
                protoAdapter2.encodeWithTag(protoWriter, 3, approveCashAppPayRequest.referrer_flow_token);
                protoWriter.writeBytes(approveCashAppPayRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApproveCashAppPayRequest(RequestContext requestContext, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.request_auth_flow_triggers_mobile_url = str;
        this.referrer_flow_token = str2;
    }

    public static ApproveCashAppPayRequest copy$default(ApproveCashAppPayRequest approveCashAppPayRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = approveCashAppPayRequest.request_auth_flow_triggers_mobile_url;
        String str2 = approveCashAppPayRequest.referrer_flow_token;
        if ((i & 8) != 0) {
            byteString = approveCashAppPayRequest.unknownFields();
        }
        approveCashAppPayRequest.getClass();
        str.getClass();
        byteString.getClass();
        return new ApproveCashAppPayRequest(requestContext, str, str2, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApproveCashAppPayRequest)) {
            return false;
        }
        ApproveCashAppPayRequest approveCashAppPayRequest = (ApproveCashAppPayRequest) obj;
        return Intrinsics.areEqual(unknownFields(), approveCashAppPayRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, approveCashAppPayRequest.request_context) && Intrinsics.areEqual(this.request_auth_flow_triggers_mobile_url, approveCashAppPayRequest.request_auth_flow_triggers_mobile_url) && Intrinsics.areEqual(this.referrer_flow_token, approveCashAppPayRequest.referrer_flow_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37, 37, this.request_auth_flow_triggers_mobile_url);
        String str = this.referrer_flow_token;
        int hashCode2 = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        VerifyPasscodeRequest.Builder builder = new VerifyPasscodeRequest.Builder(6);
        builder.request_context = this.request_context;
        builder.passcode = this.request_auth_flow_triggers_mobile_url;
        builder.passcode_token = this.referrer_flow_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.request_auth_flow_triggers_mobile_url, "request_auth_flow_triggers_mobile_url=", arrayList);
        String str = this.referrer_flow_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "referrer_flow_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ApproveCashAppPayRequest{", "}", 0, null, null, 56);
    }
}
