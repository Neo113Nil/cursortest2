package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.PushProvisionGooglePayRequest;
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
public final class VerifyInstrumentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VerifyInstrumentRequest> CREATOR;
    public final String account_number;
    public final RequestContext request_context;
    public final String routing_number;
    public final String unencrypted_pan;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String account_number;
        public RequestContext request_context;
        public String routing_number;
        public String unencrypted_pan;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new VerifyInstrumentRequest(this.request_context, this.unencrypted_pan, this.routing_number, this.account_number, buildUnknownFields());
                default:
                    return new PushProvisionGooglePayRequest(this.request_context, this.unencrypted_pan, this.routing_number, this.account_number, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(VerifyInstrumentRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.VerifyInstrumentRequest$Companion$ADAPTER$1
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
                        return new VerifyInstrumentRequest((RequestContext) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                VerifyInstrumentRequest verifyInstrumentRequest = (VerifyInstrumentRequest) obj;
                reverseProtoWriter.getClass();
                verifyInstrumentRequest.getClass();
                reverseProtoWriter.writeBytes(verifyInstrumentRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, verifyInstrumentRequest.account_number);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, verifyInstrumentRequest.routing_number);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, verifyInstrumentRequest.unencrypted_pan);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, verifyInstrumentRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                VerifyInstrumentRequest verifyInstrumentRequest = (VerifyInstrumentRequest) obj;
                verifyInstrumentRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(4, verifyInstrumentRequest.request_context) + verifyInstrumentRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(3, verifyInstrumentRequest.account_number) + protoAdapter2.encodedSizeWithTag(2, verifyInstrumentRequest.routing_number) + protoAdapter2.encodedSizeWithTag(1, verifyInstrumentRequest.unencrypted_pan) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                VerifyInstrumentRequest verifyInstrumentRequest = (VerifyInstrumentRequest) obj;
                verifyInstrumentRequest.getClass();
                RequestContext requestContext = verifyInstrumentRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new VerifyInstrumentRequest(requestContext2, null, null, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                VerifyInstrumentRequest verifyInstrumentRequest = (VerifyInstrumentRequest) obj;
                verifyInstrumentRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, verifyInstrumentRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, verifyInstrumentRequest.unencrypted_pan);
                protoAdapter2.encodeWithTag(protoWriter, 2, verifyInstrumentRequest.routing_number);
                protoAdapter2.encodeWithTag(protoWriter, 3, verifyInstrumentRequest.account_number);
                protoWriter.writeBytes(verifyInstrumentRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyInstrumentRequest(RequestContext requestContext, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.unencrypted_pan = str;
        this.routing_number = str2;
        this.account_number = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyInstrumentRequest)) {
            return false;
        }
        VerifyInstrumentRequest verifyInstrumentRequest = (VerifyInstrumentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), verifyInstrumentRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, verifyInstrumentRequest.request_context) && Intrinsics.areEqual(this.unencrypted_pan, verifyInstrumentRequest.unencrypted_pan) && Intrinsics.areEqual(this.routing_number, verifyInstrumentRequest.routing_number) && Intrinsics.areEqual(this.account_number, verifyInstrumentRequest.account_number);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.unencrypted_pan;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.routing_number;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.account_number;
        int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.request_context = this.request_context;
        builder.unencrypted_pan = this.unencrypted_pan;
        builder.routing_number = this.routing_number;
        builder.account_number = this.account_number;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.unencrypted_pan != null) {
            arrayList.add("unencrypted_pan=██");
        }
        if (this.routing_number != null) {
            arrayList.add("routing_number=██");
        }
        if (this.account_number != null) {
            arrayList.add("account_number=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VerifyInstrumentRequest{", "}", 0, null, null, 56);
    }
}
