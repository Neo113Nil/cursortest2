package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
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
public final class FinishWebAuthnAuthenticationRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FinishWebAuthnAuthenticationRequest> CREATOR;
    public final ByteString authenticator_data;
    public final ByteString client_data_json;
    public final String credential;
    public final ByteString key_handle;
    public final String login_entity_token;
    public final RequestContext request_context;
    public final String request_id;
    public final ByteString signature;
    public final ByteString user_handle;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FinishWebAuthnAuthenticationRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.janus.api.FinishWebAuthnAuthenticationRequest$Companion$ADAPTER$1
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
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new FinishWebAuthnAuthenticationRequest((String) obj, (String) obj2, (String) obj3, (RequestContext) obj4, (ByteString) obj5, (ByteString) obj6, (ByteString) obj7, (ByteString) obj8, (ByteString) obj9, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            obj4 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj4);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 7:
                            obj7 = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 8:
                            obj8 = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 9:
                            obj9 = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                FinishWebAuthnAuthenticationRequest finishWebAuthnAuthenticationRequest = (FinishWebAuthnAuthenticationRequest) obj;
                reverseProtoWriter.getClass();
                finishWebAuthnAuthenticationRequest.getClass();
                reverseProtoWriter.writeBytes(finishWebAuthnAuthenticationRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 9, finishWebAuthnAuthenticationRequest.signature);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 8, finishWebAuthnAuthenticationRequest.client_data_json);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 7, finishWebAuthnAuthenticationRequest.authenticator_data);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, finishWebAuthnAuthenticationRequest.user_handle);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, finishWebAuthnAuthenticationRequest.key_handle);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, finishWebAuthnAuthenticationRequest.request_context);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 3, finishWebAuthnAuthenticationRequest.login_entity_token);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 2, finishWebAuthnAuthenticationRequest.credential);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 1, finishWebAuthnAuthenticationRequest.request_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                FinishWebAuthnAuthenticationRequest finishWebAuthnAuthenticationRequest = (FinishWebAuthnAuthenticationRequest) obj;
                finishWebAuthnAuthenticationRequest.getClass();
                int size$okio = finishWebAuthnAuthenticationRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(4, finishWebAuthnAuthenticationRequest.request_context) + protoAdapter2.encodedSizeWithTag(3, finishWebAuthnAuthenticationRequest.login_entity_token) + protoAdapter2.encodedSizeWithTag(2, finishWebAuthnAuthenticationRequest.credential) + protoAdapter2.encodedSizeWithTag(1, finishWebAuthnAuthenticationRequest.request_id) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.BYTES;
                return protoAdapter3.encodedSizeWithTag(9, finishWebAuthnAuthenticationRequest.signature) + protoAdapter3.encodedSizeWithTag(8, finishWebAuthnAuthenticationRequest.client_data_json) + protoAdapter3.encodedSizeWithTag(7, finishWebAuthnAuthenticationRequest.authenticator_data) + protoAdapter3.encodedSizeWithTag(6, finishWebAuthnAuthenticationRequest.user_handle) + protoAdapter3.encodedSizeWithTag(5, finishWebAuthnAuthenticationRequest.key_handle) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                FinishWebAuthnAuthenticationRequest finishWebAuthnAuthenticationRequest = (FinishWebAuthnAuthenticationRequest) obj;
                finishWebAuthnAuthenticationRequest.getClass();
                RequestContext requestContext = finishWebAuthnAuthenticationRequest.request_context;
                return FinishWebAuthnAuthenticationRequest.copy$default(finishWebAuthnAuthenticationRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 503);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                FinishWebAuthnAuthenticationRequest finishWebAuthnAuthenticationRequest = (FinishWebAuthnAuthenticationRequest) obj;
                finishWebAuthnAuthenticationRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, finishWebAuthnAuthenticationRequest.request_id);
                protoAdapter2.encodeWithTag(protoWriter, 2, finishWebAuthnAuthenticationRequest.credential);
                protoAdapter2.encodeWithTag(protoWriter, 3, finishWebAuthnAuthenticationRequest.login_entity_token);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, finishWebAuthnAuthenticationRequest.request_context);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BYTES;
                protoAdapter3.encodeWithTag(protoWriter, 5, finishWebAuthnAuthenticationRequest.key_handle);
                protoAdapter3.encodeWithTag(protoWriter, 6, finishWebAuthnAuthenticationRequest.user_handle);
                protoAdapter3.encodeWithTag(protoWriter, 7, finishWebAuthnAuthenticationRequest.authenticator_data);
                protoAdapter3.encodeWithTag(protoWriter, 8, finishWebAuthnAuthenticationRequest.client_data_json);
                protoAdapter3.encodeWithTag(protoWriter, 9, finishWebAuthnAuthenticationRequest.signature);
                protoWriter.writeBytes(finishWebAuthnAuthenticationRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinishWebAuthnAuthenticationRequest(String str, String str2, String str3, RequestContext requestContext, ByteString byteString, ByteString byteString2, ByteString byteString3, ByteString byteString4, ByteString byteString5, ByteString byteString6) {
        super(ADAPTER, byteString6);
        byteString6.getClass();
        this.request_id = str;
        this.credential = str2;
        this.login_entity_token = str3;
        this.request_context = requestContext;
        this.key_handle = byteString;
        this.user_handle = byteString2;
        this.authenticator_data = byteString3;
        this.client_data_json = byteString4;
        this.signature = byteString5;
    }

    public static FinishWebAuthnAuthenticationRequest copy$default(FinishWebAuthnAuthenticationRequest finishWebAuthnAuthenticationRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = finishWebAuthnAuthenticationRequest.request_id;
        String str2 = finishWebAuthnAuthenticationRequest.credential;
        String str3 = finishWebAuthnAuthenticationRequest.login_entity_token;
        ByteString byteString2 = finishWebAuthnAuthenticationRequest.key_handle;
        ByteString byteString3 = finishWebAuthnAuthenticationRequest.user_handle;
        ByteString byteString4 = finishWebAuthnAuthenticationRequest.authenticator_data;
        ByteString byteString5 = finishWebAuthnAuthenticationRequest.client_data_json;
        ByteString byteString6 = finishWebAuthnAuthenticationRequest.signature;
        if ((i & 512) != 0) {
            byteString = finishWebAuthnAuthenticationRequest.unknownFields();
        }
        ByteString byteString7 = byteString;
        finishWebAuthnAuthenticationRequest.getClass();
        byteString7.getClass();
        return new FinishWebAuthnAuthenticationRequest(str, str2, str3, requestContext, byteString2, byteString3, byteString4, byteString5, byteString6, byteString7);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FinishWebAuthnAuthenticationRequest)) {
            return false;
        }
        FinishWebAuthnAuthenticationRequest finishWebAuthnAuthenticationRequest = (FinishWebAuthnAuthenticationRequest) obj;
        return Intrinsics.areEqual(unknownFields(), finishWebAuthnAuthenticationRequest.unknownFields()) && Intrinsics.areEqual(this.request_id, finishWebAuthnAuthenticationRequest.request_id) && Intrinsics.areEqual(this.credential, finishWebAuthnAuthenticationRequest.credential) && Intrinsics.areEqual(this.login_entity_token, finishWebAuthnAuthenticationRequest.login_entity_token) && Intrinsics.areEqual(this.request_context, finishWebAuthnAuthenticationRequest.request_context) && Intrinsics.areEqual(this.key_handle, finishWebAuthnAuthenticationRequest.key_handle) && Intrinsics.areEqual(this.user_handle, finishWebAuthnAuthenticationRequest.user_handle) && Intrinsics.areEqual(this.authenticator_data, finishWebAuthnAuthenticationRequest.authenticator_data) && Intrinsics.areEqual(this.client_data_json, finishWebAuthnAuthenticationRequest.client_data_json) && Intrinsics.areEqual(this.signature, finishWebAuthnAuthenticationRequest.signature);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.request_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.credential;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.login_entity_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode5 = (hashCode4 + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        ByteString byteString = this.key_handle;
        int hashCode6 = (hashCode5 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        ByteString byteString2 = this.user_handle;
        int hashCode7 = (hashCode6 + (byteString2 != null ? byteString2.hashCode() : 0)) * 37;
        ByteString byteString3 = this.authenticator_data;
        int hashCode8 = (hashCode7 + (byteString3 != null ? byteString3.hashCode() : 0)) * 37;
        ByteString byteString4 = this.client_data_json;
        int hashCode9 = (hashCode8 + (byteString4 != null ? byteString4.hashCode() : 0)) * 37;
        ByteString byteString5 = this.signature;
        int hashCode10 = hashCode9 + (byteString5 != null ? byteString5.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(21, false);
        builder.locale = this.request_id;
        builder.title = this.credential;
        builder.info_rows_header = this.login_entity_token;
        builder.footer_text = this.request_context;
        builder.loadable_subtitle = this.key_handle;
        builder.info_rows = this.user_handle;
        builder.primary_footer_button_state = this.authenticator_data;
        builder.secondary_footer_button_state = this.client_data_json;
        builder.payment_plans_data = this.signature;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.request_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "request_id=", arrayList);
        }
        String str2 = this.credential;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "credential=", arrayList);
        }
        String str3 = this.login_entity_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "login_entity_token=", arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        ByteString byteString = this.key_handle;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("key_handle=", byteString, arrayList);
        }
        ByteString byteString2 = this.user_handle;
        if (byteString2 != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("user_handle=", byteString2, arrayList);
        }
        ByteString byteString3 = this.authenticator_data;
        if (byteString3 != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("authenticator_data=", byteString3, arrayList);
        }
        ByteString byteString4 = this.client_data_json;
        if (byteString4 != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("client_data_json=", byteString4, arrayList);
        }
        ByteString byteString5 = this.signature;
        if (byteString5 != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("signature=", byteString5, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FinishWebAuthnAuthenticationRequest{", "}", 0, null, null, 56);
    }
}
