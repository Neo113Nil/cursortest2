package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.badging.api.Badge;
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
public final class FinishWebAuthnRegistrationRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FinishWebAuthnRegistrationRequest> CREATOR;
    public final ByteString attestation_object;
    public final ByteString client_json;
    public final String credential;
    public final String description;
    public final ByteString forwarding_payload;
    public final ByteString raw_id;
    public final RequestContext request_context;
    public final String request_id;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FinishWebAuthnRegistrationRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.janus.api.FinishWebAuthnRegistrationRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new FinishWebAuthnRegistrationRequest((String) obj, (String) obj2, (String) obj3, (ByteString) obj4, (ByteString) obj5, (ByteString) obj6, (RequestContext) obj7, (ByteString) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                            obj4 = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 7:
                            obj7 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj7);
                            break;
                        case 8:
                            obj8 = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                FinishWebAuthnRegistrationRequest finishWebAuthnRegistrationRequest = (FinishWebAuthnRegistrationRequest) obj;
                reverseProtoWriter.getClass();
                finishWebAuthnRegistrationRequest.getClass();
                reverseProtoWriter.writeBytes(finishWebAuthnRegistrationRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 8, finishWebAuthnRegistrationRequest.forwarding_payload);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 7, finishWebAuthnRegistrationRequest.request_context);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, finishWebAuthnRegistrationRequest.client_json);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, finishWebAuthnRegistrationRequest.attestation_object);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, finishWebAuthnRegistrationRequest.raw_id);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 3, finishWebAuthnRegistrationRequest.credential);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 2, finishWebAuthnRegistrationRequest.description);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 1, finishWebAuthnRegistrationRequest.request_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                FinishWebAuthnRegistrationRequest finishWebAuthnRegistrationRequest = (FinishWebAuthnRegistrationRequest) obj;
                finishWebAuthnRegistrationRequest.getClass();
                int size$okio = finishWebAuthnRegistrationRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(3, finishWebAuthnRegistrationRequest.credential) + protoAdapter2.encodedSizeWithTag(2, finishWebAuthnRegistrationRequest.description) + protoAdapter2.encodedSizeWithTag(1, finishWebAuthnRegistrationRequest.request_id) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.BYTES;
                return protoAdapter3.encodedSizeWithTag(8, finishWebAuthnRegistrationRequest.forwarding_payload) + RequestContext.ADAPTER.encodedSizeWithTag(7, finishWebAuthnRegistrationRequest.request_context) + protoAdapter3.encodedSizeWithTag(6, finishWebAuthnRegistrationRequest.client_json) + protoAdapter3.encodedSizeWithTag(5, finishWebAuthnRegistrationRequest.attestation_object) + protoAdapter3.encodedSizeWithTag(4, finishWebAuthnRegistrationRequest.raw_id) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                FinishWebAuthnRegistrationRequest finishWebAuthnRegistrationRequest = (FinishWebAuthnRegistrationRequest) obj;
                finishWebAuthnRegistrationRequest.getClass();
                RequestContext requestContext = finishWebAuthnRegistrationRequest.request_context;
                return FinishWebAuthnRegistrationRequest.copy$default(finishWebAuthnRegistrationRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 63);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                FinishWebAuthnRegistrationRequest finishWebAuthnRegistrationRequest = (FinishWebAuthnRegistrationRequest) obj;
                finishWebAuthnRegistrationRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, finishWebAuthnRegistrationRequest.request_id);
                protoAdapter2.encodeWithTag(protoWriter, 2, finishWebAuthnRegistrationRequest.description);
                protoAdapter2.encodeWithTag(protoWriter, 3, finishWebAuthnRegistrationRequest.credential);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BYTES;
                protoAdapter3.encodeWithTag(protoWriter, 4, finishWebAuthnRegistrationRequest.raw_id);
                protoAdapter3.encodeWithTag(protoWriter, 5, finishWebAuthnRegistrationRequest.attestation_object);
                protoAdapter3.encodeWithTag(protoWriter, 6, finishWebAuthnRegistrationRequest.client_json);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 7, finishWebAuthnRegistrationRequest.request_context);
                protoAdapter3.encodeWithTag(protoWriter, 8, finishWebAuthnRegistrationRequest.forwarding_payload);
                protoWriter.writeBytes(finishWebAuthnRegistrationRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinishWebAuthnRegistrationRequest(String str, String str2, String str3, ByteString byteString, ByteString byteString2, ByteString byteString3, RequestContext requestContext, ByteString byteString4, ByteString byteString5) {
        super(ADAPTER, byteString5);
        byteString5.getClass();
        this.request_id = str;
        this.description = str2;
        this.credential = str3;
        this.raw_id = byteString;
        this.attestation_object = byteString2;
        this.client_json = byteString3;
        this.request_context = requestContext;
        this.forwarding_payload = byteString4;
    }

    public static FinishWebAuthnRegistrationRequest copy$default(FinishWebAuthnRegistrationRequest finishWebAuthnRegistrationRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = finishWebAuthnRegistrationRequest.request_id;
        String str2 = finishWebAuthnRegistrationRequest.description;
        String str3 = finishWebAuthnRegistrationRequest.credential;
        ByteString byteString2 = finishWebAuthnRegistrationRequest.raw_id;
        ByteString byteString3 = finishWebAuthnRegistrationRequest.attestation_object;
        ByteString byteString4 = finishWebAuthnRegistrationRequest.client_json;
        ByteString byteString5 = (i & 128) != 0 ? finishWebAuthnRegistrationRequest.forwarding_payload : null;
        if ((i & 256) != 0) {
            byteString = finishWebAuthnRegistrationRequest.unknownFields();
        }
        ByteString byteString6 = byteString;
        finishWebAuthnRegistrationRequest.getClass();
        byteString6.getClass();
        return new FinishWebAuthnRegistrationRequest(str, str2, str3, byteString2, byteString3, byteString4, requestContext, byteString5, byteString6);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FinishWebAuthnRegistrationRequest)) {
            return false;
        }
        FinishWebAuthnRegistrationRequest finishWebAuthnRegistrationRequest = (FinishWebAuthnRegistrationRequest) obj;
        return Intrinsics.areEqual(unknownFields(), finishWebAuthnRegistrationRequest.unknownFields()) && Intrinsics.areEqual(this.request_id, finishWebAuthnRegistrationRequest.request_id) && Intrinsics.areEqual(this.description, finishWebAuthnRegistrationRequest.description) && Intrinsics.areEqual(this.credential, finishWebAuthnRegistrationRequest.credential) && Intrinsics.areEqual(this.raw_id, finishWebAuthnRegistrationRequest.raw_id) && Intrinsics.areEqual(this.attestation_object, finishWebAuthnRegistrationRequest.attestation_object) && Intrinsics.areEqual(this.client_json, finishWebAuthnRegistrationRequest.client_json) && Intrinsics.areEqual(this.request_context, finishWebAuthnRegistrationRequest.request_context) && Intrinsics.areEqual(this.forwarding_payload, finishWebAuthnRegistrationRequest.forwarding_payload);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.request_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.credential;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        ByteString byteString = this.raw_id;
        int hashCode5 = (hashCode4 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        ByteString byteString2 = this.attestation_object;
        int hashCode6 = (hashCode5 + (byteString2 != null ? byteString2.hashCode() : 0)) * 37;
        ByteString byteString3 = this.client_json;
        int hashCode7 = (hashCode6 + (byteString3 != null ? byteString3.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode8 = (hashCode7 + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        ByteString byteString4 = this.forwarding_payload;
        int hashCode9 = hashCode8 + (byteString4 != null ? byteString4.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(29, false);
        builder.external_token = this.request_id;
        builder.customer_token = this.description;
        builder.external_version = this.credential;
        builder.updated_at = this.raw_id;
        builder.created_at = this.attestation_object;
        builder.is_badged = this.client_json;
        builder.item_type = this.request_context;
        builder.count_groups = this.forwarding_payload;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.request_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "request_id=", arrayList);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        String str3 = this.credential;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "credential=", arrayList);
        }
        ByteString byteString = this.raw_id;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("raw_id=", byteString, arrayList);
        }
        ByteString byteString2 = this.attestation_object;
        if (byteString2 != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("attestation_object=", byteString2, arrayList);
        }
        ByteString byteString3 = this.client_json;
        if (byteString3 != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("client_json=", byteString3, arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.forwarding_payload != null) {
            arrayList.add("forwarding_payload=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FinishWebAuthnRegistrationRequest{", "}", 0, null, null, 56);
    }
}
