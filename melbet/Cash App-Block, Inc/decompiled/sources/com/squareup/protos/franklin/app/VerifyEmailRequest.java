package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.VerifySmsRequest;
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
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class VerifyEmailRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VerifyEmailRequest> CREATOR;
    public final String account_id;
    public final ClientSecurityContext client_security_context;
    public final String email_address;
    public final List payment_tokens;
    public final RequestContext request_context;
    public final String verification_code;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(VerifyEmailRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.VerifyEmailRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new VerifyEmailRequest((ClientSecurityContext) obj4, (RequestContext) obj, (String) obj2, (String) obj3, (String) obj5, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 3:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            m.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                            break;
                        case 7:
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                        case 8:
                            obj4 = TransactorKt.decodeMessageOrMerge(ClientSecurityContext.ADAPTER, protoReader, obj4);
                            break;
                        case 9:
                            obj5 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                VerifyEmailRequest verifyEmailRequest = (VerifyEmailRequest) obj;
                reverseProtoWriter.getClass();
                verifyEmailRequest.getClass();
                reverseProtoWriter.writeBytes(verifyEmailRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 9, verifyEmailRequest.account_id);
                ClientSecurityContext.ADAPTER.encodeWithTag(reverseProtoWriter, 8, verifyEmailRequest.client_security_context);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 5, verifyEmailRequest.payment_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, verifyEmailRequest.verification_code);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, verifyEmailRequest.email_address);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 6, verifyEmailRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                VerifyEmailRequest verifyEmailRequest = (VerifyEmailRequest) obj;
                verifyEmailRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(6, verifyEmailRequest.request_context) + verifyEmailRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(9, verifyEmailRequest.account_id) + ClientSecurityContext.ADAPTER.encodedSizeWithTag(8, verifyEmailRequest.client_security_context) + protoAdapter2.asRepeated().encodedSizeWithTag(5, verifyEmailRequest.payment_tokens) + protoAdapter2.encodedSizeWithTag(4, verifyEmailRequest.verification_code) + protoAdapter2.encodedSizeWithTag(3, verifyEmailRequest.email_address) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                VerifyEmailRequest verifyEmailRequest = (VerifyEmailRequest) obj;
                verifyEmailRequest.getClass();
                RequestContext requestContext = verifyEmailRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                EmptyList emptyList = EmptyList.INSTANCE;
                ClientSecurityContext clientSecurityContext = verifyEmailRequest.client_security_context;
                ClientSecurityContext clientSecurityContext2 = clientSecurityContext != null ? (ClientSecurityContext) ClientSecurityContext.ADAPTER.redact(clientSecurityContext) : null;
                ByteString byteString = ByteString.EMPTY;
                emptyList.getClass();
                byteString.getClass();
                return new VerifyEmailRequest(clientSecurityContext2, requestContext2, null, null, null, emptyList, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                VerifyEmailRequest verifyEmailRequest = (VerifyEmailRequest) obj;
                verifyEmailRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 6, verifyEmailRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 3, verifyEmailRequest.email_address);
                protoAdapter2.encodeWithTag(protoWriter, 4, verifyEmailRequest.verification_code);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, verifyEmailRequest.payment_tokens);
                ClientSecurityContext.ADAPTER.encodeWithTag(protoWriter, 8, verifyEmailRequest.client_security_context);
                protoAdapter2.encodeWithTag(protoWriter, 9, verifyEmailRequest.account_id);
                protoWriter.writeBytes(verifyEmailRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyEmailRequest(ClientSecurityContext clientSecurityContext, RequestContext requestContext, String str, String str2, String str3, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.email_address = str;
        this.verification_code = str2;
        this.client_security_context = clientSecurityContext;
        this.account_id = str3;
        this.payment_tokens = TransactorKt.immutableCopyOf("payment_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyEmailRequest)) {
            return false;
        }
        VerifyEmailRequest verifyEmailRequest = (VerifyEmailRequest) obj;
        return Intrinsics.areEqual(unknownFields(), verifyEmailRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, verifyEmailRequest.request_context) && Intrinsics.areEqual(this.email_address, verifyEmailRequest.email_address) && Intrinsics.areEqual(this.verification_code, verifyEmailRequest.verification_code) && Intrinsics.areEqual(this.payment_tokens, verifyEmailRequest.payment_tokens) && Intrinsics.areEqual(this.client_security_context, verifyEmailRequest.client_security_context) && Intrinsics.areEqual(this.account_id, verifyEmailRequest.account_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.email_address;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.verification_code;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.payment_tokens);
        ClientSecurityContext clientSecurityContext = this.client_security_context;
        int hashCode4 = (m + (clientSecurityContext != null ? clientSecurityContext.hashCode() : 0)) * 37;
        String str3 = this.account_id;
        int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        VerifySmsRequest.Builder builder = new VerifySmsRequest.Builder(1);
        builder.request_context = this.request_context;
        builder.sms_number = this.email_address;
        builder.sms_verification_code = this.verification_code;
        builder.payment_tokens = this.payment_tokens;
        builder.client_security_context = this.client_security_context;
        builder.account_id = this.account_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.email_address != null) {
            arrayList.add("email_address=██");
        }
        if (this.verification_code != null) {
            arrayList.add("verification_code=██");
        }
        if (!this.payment_tokens.isEmpty()) {
            arrayList.add("payment_tokens=██");
        }
        ClientSecurityContext clientSecurityContext = this.client_security_context;
        if (clientSecurityContext != null) {
            arrayList.add("client_security_context=" + clientSecurityContext);
        }
        if (this.account_id != null) {
            arrayList.add("account_id=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VerifyEmailRequest{", "}", 0, null, null, 56);
    }
}
