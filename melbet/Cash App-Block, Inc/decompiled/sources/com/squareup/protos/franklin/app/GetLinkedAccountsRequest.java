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
public final class GetLinkedAccountsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetLinkedAccountsRequest> CREATOR;
    public final String app_token;
    public final String backup_tag;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetLinkedAccountsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.GetLinkedAccountsRequest$Companion$ADAPTER$1
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
                        return new GetLinkedAccountsRequest((RequestContext) obj3, (String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                GetLinkedAccountsRequest getLinkedAccountsRequest = (GetLinkedAccountsRequest) obj;
                reverseProtoWriter.getClass();
                getLinkedAccountsRequest.getClass();
                reverseProtoWriter.writeBytes(getLinkedAccountsRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getLinkedAccountsRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getLinkedAccountsRequest.backup_tag);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getLinkedAccountsRequest.app_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetLinkedAccountsRequest getLinkedAccountsRequest = (GetLinkedAccountsRequest) obj;
                getLinkedAccountsRequest.getClass();
                int size$okio = getLinkedAccountsRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return RequestContext.ADAPTER.encodedSizeWithTag(3, getLinkedAccountsRequest.request_context) + protoAdapter2.encodedSizeWithTag(2, getLinkedAccountsRequest.backup_tag) + protoAdapter2.encodedSizeWithTag(1, getLinkedAccountsRequest.app_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetLinkedAccountsRequest getLinkedAccountsRequest = (GetLinkedAccountsRequest) obj;
                getLinkedAccountsRequest.getClass();
                RequestContext requestContext = getLinkedAccountsRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new GetLinkedAccountsRequest(requestContext2, null, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetLinkedAccountsRequest getLinkedAccountsRequest = (GetLinkedAccountsRequest) obj;
                getLinkedAccountsRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getLinkedAccountsRequest.app_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, getLinkedAccountsRequest.backup_tag);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 3, getLinkedAccountsRequest.request_context);
                protoWriter.writeBytes(getLinkedAccountsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLinkedAccountsRequest(RequestContext requestContext, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.app_token = str;
        this.backup_tag = str2;
        this.request_context = requestContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetLinkedAccountsRequest)) {
            return false;
        }
        GetLinkedAccountsRequest getLinkedAccountsRequest = (GetLinkedAccountsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getLinkedAccountsRequest.unknownFields()) && Intrinsics.areEqual(this.app_token, getLinkedAccountsRequest.app_token) && Intrinsics.areEqual(this.backup_tag, getLinkedAccountsRequest.backup_tag) && Intrinsics.areEqual(this.request_context, getLinkedAccountsRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.app_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.backup_tag;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode4 = hashCode3 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        VerifyPasscodeRequest.Builder builder = new VerifyPasscodeRequest.Builder(7);
        builder.passcode = this.app_token;
        builder.passcode_token = this.backup_tag;
        builder.request_context = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.app_token != null) {
            arrayList.add("app_token=██");
        }
        if (this.backup_tag != null) {
            arrayList.add("backup_tag=██");
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetLinkedAccountsRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ GetLinkedAccountsRequest(String str, String str2) {
        this(null, str, str2, ByteString.EMPTY);
    }
}
