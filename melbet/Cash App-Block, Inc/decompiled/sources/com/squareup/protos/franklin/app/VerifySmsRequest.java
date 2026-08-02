package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
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
public final class VerifySmsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VerifySmsRequest> CREATOR;
    public final String account_id;
    public final ClientSecurityContext client_security_context;
    public final List payment_tokens;
    public final RequestContext request_context;
    public final String sms_number;
    public final String sms_verification_code;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String account_id;
        public ClientSecurityContext client_security_context;
        public List payment_tokens;
        public RequestContext request_context;
        public String sms_number;
        public String sms_verification_code;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    this.payment_tokens = EmptyList.INSTANCE;
                    break;
                default:
                    this.payment_tokens = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    RequestContext requestContext = this.request_context;
                    String str = this.sms_number;
                    String str2 = this.sms_verification_code;
                    List list = this.payment_tokens;
                    return new VerifySmsRequest(this.client_security_context, requestContext, str, str2, this.account_id, list, buildUnknownFields());
                default:
                    return new VerifyEmailRequest(this.client_security_context, this.request_context, this.sms_number, this.sms_verification_code, this.account_id, this.payment_tokens, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(VerifySmsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.VerifySmsRequest$Companion$ADAPTER$1
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
                        return new VerifySmsRequest((ClientSecurityContext) obj5, (RequestContext) obj, (String) obj2, (String) obj3, (String) obj4, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 7) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 8) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 10) {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 11) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj5 = TransactorKt.decodeMessageOrMerge(ClientSecurityContext.ADAPTER, protoReader, obj5);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                VerifySmsRequest verifySmsRequest = (VerifySmsRequest) obj;
                reverseProtoWriter.getClass();
                verifySmsRequest.getClass();
                reverseProtoWriter.writeBytes(verifySmsRequest.unknownFields());
                ClientSecurityContext.ADAPTER.encodeWithTag(reverseProtoWriter, 11, verifySmsRequest.client_security_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 10, verifySmsRequest.account_id);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 7, verifySmsRequest.payment_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, verifySmsRequest.sms_verification_code);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, verifySmsRequest.sms_number);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 8, verifySmsRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                VerifySmsRequest verifySmsRequest = (VerifySmsRequest) obj;
                verifySmsRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(8, verifySmsRequest.request_context) + verifySmsRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ClientSecurityContext.ADAPTER.encodedSizeWithTag(11, verifySmsRequest.client_security_context) + protoAdapter2.encodedSizeWithTag(10, verifySmsRequest.account_id) + protoAdapter2.asRepeated().encodedSizeWithTag(7, verifySmsRequest.payment_tokens) + protoAdapter2.encodedSizeWithTag(3, verifySmsRequest.sms_verification_code) + protoAdapter2.encodedSizeWithTag(2, verifySmsRequest.sms_number) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                VerifySmsRequest verifySmsRequest = (VerifySmsRequest) obj;
                verifySmsRequest.getClass();
                RequestContext requestContext = verifySmsRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                EmptyList emptyList = EmptyList.INSTANCE;
                ClientSecurityContext clientSecurityContext = verifySmsRequest.client_security_context;
                ClientSecurityContext clientSecurityContext2 = clientSecurityContext != null ? (ClientSecurityContext) ClientSecurityContext.ADAPTER.redact(clientSecurityContext) : null;
                ByteString byteString = ByteString.EMPTY;
                emptyList.getClass();
                byteString.getClass();
                return new VerifySmsRequest(clientSecurityContext2, requestContext2, null, null, null, emptyList, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                VerifySmsRequest verifySmsRequest = (VerifySmsRequest) obj;
                verifySmsRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 8, verifySmsRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, verifySmsRequest.sms_number);
                protoAdapter2.encodeWithTag(protoWriter, 3, verifySmsRequest.sms_verification_code);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 7, verifySmsRequest.payment_tokens);
                protoAdapter2.encodeWithTag(protoWriter, 10, verifySmsRequest.account_id);
                ClientSecurityContext.ADAPTER.encodeWithTag(protoWriter, 11, verifySmsRequest.client_security_context);
                protoWriter.writeBytes(verifySmsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifySmsRequest(ClientSecurityContext clientSecurityContext, RequestContext requestContext, String str, String str2, String str3, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.sms_number = str;
        this.sms_verification_code = str2;
        this.account_id = str3;
        this.client_security_context = clientSecurityContext;
        this.payment_tokens = TransactorKt.immutableCopyOf("payment_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifySmsRequest)) {
            return false;
        }
        VerifySmsRequest verifySmsRequest = (VerifySmsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), verifySmsRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, verifySmsRequest.request_context) && Intrinsics.areEqual(this.sms_number, verifySmsRequest.sms_number) && Intrinsics.areEqual(this.sms_verification_code, verifySmsRequest.sms_verification_code) && Intrinsics.areEqual(this.payment_tokens, verifySmsRequest.payment_tokens) && Intrinsics.areEqual(this.account_id, verifySmsRequest.account_id) && Intrinsics.areEqual(this.client_security_context, verifySmsRequest.client_security_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.sms_number;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.sms_verification_code;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.payment_tokens);
        String str3 = this.account_id;
        int hashCode4 = (m + (str3 != null ? str3.hashCode() : 0)) * 37;
        ClientSecurityContext clientSecurityContext = this.client_security_context;
        int hashCode5 = hashCode4 + (clientSecurityContext != null ? clientSecurityContext.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.request_context = this.request_context;
        builder.sms_number = this.sms_number;
        builder.sms_verification_code = this.sms_verification_code;
        builder.payment_tokens = this.payment_tokens;
        builder.account_id = this.account_id;
        builder.client_security_context = this.client_security_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.sms_number != null) {
            arrayList.add("sms_number=██");
        }
        if (this.sms_verification_code != null) {
            arrayList.add("sms_verification_code=██");
        }
        if (!this.payment_tokens.isEmpty()) {
            arrayList.add("payment_tokens=██");
        }
        if (this.account_id != null) {
            arrayList.add("account_id=██");
        }
        ClientSecurityContext clientSecurityContext = this.client_security_context;
        if (clientSecurityContext != null) {
            arrayList.add("client_security_context=" + clientSecurityContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VerifySmsRequest{", "}", 0, null, null, 56);
    }
}
