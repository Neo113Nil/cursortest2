package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.janus.api.StartAccountRecoveryRequest;
import com.squareup.protos.cash.janus.api.SwitchAccountRequest;
import com.squareup.protos.cash.local.client.app.v1.AbandonPOSCheckInRequest;
import com.squareup.protos.cash.postcard.app.GetCardDetailsRequest;
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
public final class VerifyPasscodeRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VerifyPasscodeRequest> CREATOR;
    public final String passcode;
    public final String passcode_token;
    public final RequestContext request_context;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String passcode;
        public String passcode_token;
        public RequestContext request_context;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new VerifyPasscodeRequest(this.request_context, this.passcode, this.passcode_token, buildUnknownFields());
                case 1:
                    return new StartAccountRecoveryRequest(this.request_context, this.passcode, this.passcode_token, buildUnknownFields());
                case 2:
                    return new SwitchAccountRequest(this.request_context, this.passcode, this.passcode_token, buildUnknownFields());
                case 3:
                    return new AbandonPOSCheckInRequest(this.request_context, this.passcode, this.passcode_token, buildUnknownFields());
                case 4:
                    return new GetCardDetailsRequest(this.request_context, this.passcode, this.passcode_token, buildUnknownFields());
                case 5:
                    return new AddOrUpdateRewardRequest(this.request_context, this.passcode, this.passcode_token, buildUnknownFields());
                case 6:
                    RequestContext requestContext = this.request_context;
                    String str = this.passcode;
                    if (str != null) {
                        return new ApproveCashAppPayRequest(requestContext, str, this.passcode_token, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "request_auth_flow_triggers_mobile_url");
                    throw null;
                case 7:
                    return new GetLinkedAccountsRequest(this.request_context, this.passcode, this.passcode_token, buildUnknownFields());
                default:
                    return new VerifyPasscodeAndExpirationRequest(this.request_context, this.passcode, this.passcode_token, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(VerifyPasscodeRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.VerifyPasscodeRequest$Companion$ADAPTER$1
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
                        return new VerifyPasscodeRequest((RequestContext) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 3) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 5) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 6) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                VerifyPasscodeRequest verifyPasscodeRequest = (VerifyPasscodeRequest) obj;
                reverseProtoWriter.getClass();
                verifyPasscodeRequest.getClass();
                reverseProtoWriter.writeBytes(verifyPasscodeRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, verifyPasscodeRequest.passcode_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, verifyPasscodeRequest.passcode);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 6, verifyPasscodeRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                VerifyPasscodeRequest verifyPasscodeRequest = (VerifyPasscodeRequest) obj;
                verifyPasscodeRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(6, verifyPasscodeRequest.request_context) + verifyPasscodeRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(5, verifyPasscodeRequest.passcode_token) + protoAdapter2.encodedSizeWithTag(3, verifyPasscodeRequest.passcode) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                VerifyPasscodeRequest verifyPasscodeRequest = (VerifyPasscodeRequest) obj;
                verifyPasscodeRequest.getClass();
                RequestContext requestContext = verifyPasscodeRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new VerifyPasscodeRequest(requestContext2, (String) null, (String) null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                VerifyPasscodeRequest verifyPasscodeRequest = (VerifyPasscodeRequest) obj;
                verifyPasscodeRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 6, verifyPasscodeRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 3, verifyPasscodeRequest.passcode);
                protoAdapter2.encodeWithTag(protoWriter, 5, verifyPasscodeRequest.passcode_token);
                protoWriter.writeBytes(verifyPasscodeRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ VerifyPasscodeRequest(RequestContext requestContext, String str, String str2, int i) {
        this(requestContext, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, ByteString.EMPTY);
    }

    public static VerifyPasscodeRequest copy$default(VerifyPasscodeRequest verifyPasscodeRequest, RequestContext requestContext, String str, String str2, int i) {
        if ((i & 1) != 0) {
            requestContext = verifyPasscodeRequest.request_context;
        }
        if ((i & 2) != 0) {
            str = verifyPasscodeRequest.passcode;
        }
        if ((i & 4) != 0) {
            str2 = verifyPasscodeRequest.passcode_token;
        }
        ByteString unknownFields = verifyPasscodeRequest.unknownFields();
        verifyPasscodeRequest.getClass();
        unknownFields.getClass();
        return new VerifyPasscodeRequest(requestContext, str, str2, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyPasscodeRequest)) {
            return false;
        }
        VerifyPasscodeRequest verifyPasscodeRequest = (VerifyPasscodeRequest) obj;
        return Intrinsics.areEqual(unknownFields(), verifyPasscodeRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, verifyPasscodeRequest.request_context) && Intrinsics.areEqual(this.passcode, verifyPasscodeRequest.passcode) && Intrinsics.areEqual(this.passcode_token, verifyPasscodeRequest.passcode_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.passcode;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.passcode_token;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.request_context = this.request_context;
        builder.passcode = this.passcode;
        builder.passcode_token = this.passcode_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.passcode != null) {
            arrayList.add("passcode=██");
        }
        if (this.passcode_token != null) {
            arrayList.add("passcode_token=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VerifyPasscodeRequest{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyPasscodeRequest(RequestContext requestContext, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.passcode = str;
        this.passcode_token = str2;
    }
}
