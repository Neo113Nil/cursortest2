package com.squareup.protos.cash.postcard.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
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
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetCardDetailsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCardDetailsRequest> CREATOR;
    public final String passcode;
    public final String passcode_token;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetCardDetailsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.postcard.app.GetCardDetailsRequest$Companion$ADAPTER$1
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
                        return new GetCardDetailsRequest((RequestContext) obj3, (String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetCardDetailsRequest getCardDetailsRequest = (GetCardDetailsRequest) obj;
                reverseProtoWriter.getClass();
                getCardDetailsRequest.getClass();
                reverseProtoWriter.writeBytes(getCardDetailsRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getCardDetailsRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getCardDetailsRequest.passcode_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getCardDetailsRequest.passcode);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetCardDetailsRequest getCardDetailsRequest = (GetCardDetailsRequest) obj;
                getCardDetailsRequest.getClass();
                int size$okio = getCardDetailsRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return RequestContext.ADAPTER.encodedSizeWithTag(3, getCardDetailsRequest.request_context) + protoAdapter2.encodedSizeWithTag(2, getCardDetailsRequest.passcode_token) + protoAdapter2.encodedSizeWithTag(1, getCardDetailsRequest.passcode) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetCardDetailsRequest getCardDetailsRequest = (GetCardDetailsRequest) obj;
                getCardDetailsRequest.getClass();
                RequestContext requestContext = getCardDetailsRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new GetCardDetailsRequest(requestContext2, null, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetCardDetailsRequest getCardDetailsRequest = (GetCardDetailsRequest) obj;
                getCardDetailsRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getCardDetailsRequest.passcode);
                protoAdapter2.encodeWithTag(protoWriter, 2, getCardDetailsRequest.passcode_token);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 3, getCardDetailsRequest.request_context);
                protoWriter.writeBytes(getCardDetailsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCardDetailsRequest(RequestContext requestContext, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.passcode = str;
        this.passcode_token = str2;
        this.request_context = requestContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCardDetailsRequest)) {
            return false;
        }
        GetCardDetailsRequest getCardDetailsRequest = (GetCardDetailsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getCardDetailsRequest.unknownFields()) && Intrinsics.areEqual(this.passcode, getCardDetailsRequest.passcode) && Intrinsics.areEqual(this.passcode_token, getCardDetailsRequest.passcode_token) && Intrinsics.areEqual(this.request_context, getCardDetailsRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.passcode;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.passcode_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode4 = hashCode3 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        VerifyPasscodeRequest.Builder builder = new VerifyPasscodeRequest.Builder(4);
        builder.passcode = this.passcode;
        builder.passcode_token = this.passcode_token;
        builder.request_context = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.passcode != null) {
            arrayList.add("passcode=██");
        }
        if (this.passcode_token != null) {
            arrayList.add("passcode_token=██");
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCardDetailsRequest{", "}", 0, null, null, 56);
    }
}
