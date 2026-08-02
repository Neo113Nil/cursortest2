package com.squareup.protos.franklin.app;

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
public final class VerifyPasscodeAndExpirationRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VerifyPasscodeAndExpirationRequest> CREATOR;
    public final String expiration_date;
    public final String passcode;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(VerifyPasscodeAndExpirationRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.VerifyPasscodeAndExpirationRequest$Companion$ADAPTER$1
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
                        return new VerifyPasscodeAndExpirationRequest((RequestContext) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                VerifyPasscodeAndExpirationRequest verifyPasscodeAndExpirationRequest = (VerifyPasscodeAndExpirationRequest) obj;
                reverseProtoWriter.getClass();
                verifyPasscodeAndExpirationRequest.getClass();
                reverseProtoWriter.writeBytes(verifyPasscodeAndExpirationRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, verifyPasscodeAndExpirationRequest.expiration_date);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, verifyPasscodeAndExpirationRequest.passcode);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, verifyPasscodeAndExpirationRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                VerifyPasscodeAndExpirationRequest verifyPasscodeAndExpirationRequest = (VerifyPasscodeAndExpirationRequest) obj;
                verifyPasscodeAndExpirationRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(3, verifyPasscodeAndExpirationRequest.request_context) + verifyPasscodeAndExpirationRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(2, verifyPasscodeAndExpirationRequest.expiration_date) + protoAdapter2.encodedSizeWithTag(1, verifyPasscodeAndExpirationRequest.passcode) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                VerifyPasscodeAndExpirationRequest verifyPasscodeAndExpirationRequest = (VerifyPasscodeAndExpirationRequest) obj;
                verifyPasscodeAndExpirationRequest.getClass();
                RequestContext requestContext = verifyPasscodeAndExpirationRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new VerifyPasscodeAndExpirationRequest(requestContext2, null, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                VerifyPasscodeAndExpirationRequest verifyPasscodeAndExpirationRequest = (VerifyPasscodeAndExpirationRequest) obj;
                verifyPasscodeAndExpirationRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 3, verifyPasscodeAndExpirationRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, verifyPasscodeAndExpirationRequest.passcode);
                protoAdapter2.encodeWithTag(protoWriter, 2, verifyPasscodeAndExpirationRequest.expiration_date);
                protoWriter.writeBytes(verifyPasscodeAndExpirationRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyPasscodeAndExpirationRequest(RequestContext requestContext, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.passcode = str;
        this.expiration_date = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyPasscodeAndExpirationRequest)) {
            return false;
        }
        VerifyPasscodeAndExpirationRequest verifyPasscodeAndExpirationRequest = (VerifyPasscodeAndExpirationRequest) obj;
        return Intrinsics.areEqual(unknownFields(), verifyPasscodeAndExpirationRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, verifyPasscodeAndExpirationRequest.request_context) && Intrinsics.areEqual(this.passcode, verifyPasscodeAndExpirationRequest.passcode) && Intrinsics.areEqual(this.expiration_date, verifyPasscodeAndExpirationRequest.expiration_date);
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
        String str2 = this.expiration_date;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        VerifyPasscodeRequest.Builder builder = new VerifyPasscodeRequest.Builder(8);
        builder.request_context = this.request_context;
        builder.passcode = this.passcode;
        builder.passcode_token = this.expiration_date;
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
        if (this.expiration_date != null) {
            arrayList.add("expiration_date=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VerifyPasscodeAndExpirationRequest{", "}", 0, null, null, 56);
    }
}
