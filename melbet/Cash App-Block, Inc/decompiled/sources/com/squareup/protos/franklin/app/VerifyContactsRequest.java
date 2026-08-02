package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.InviteContactsRequest;
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
public final class VerifyContactsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VerifyContactsRequest> CREATOR;
    public final List hashed_aliases;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(VerifyContactsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.VerifyContactsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new VerifyContactsRequest((RequestContext) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.add(ProtoAdapter.BYTES.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                VerifyContactsRequest verifyContactsRequest = (VerifyContactsRequest) obj;
                reverseProtoWriter.getClass();
                verifyContactsRequest.getClass();
                reverseProtoWriter.writeBytes(verifyContactsRequest.unknownFields());
                ProtoAdapter.BYTES.asRepeated().encodeWithTag(reverseProtoWriter, 2, verifyContactsRequest.hashed_aliases);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, verifyContactsRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                VerifyContactsRequest verifyContactsRequest = (VerifyContactsRequest) obj;
                verifyContactsRequest.getClass();
                return ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(2, verifyContactsRequest.hashed_aliases) + RequestContext.ADAPTER.encodedSizeWithTag(1, verifyContactsRequest.request_context) + verifyContactsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                VerifyContactsRequest verifyContactsRequest = (VerifyContactsRequest) obj;
                verifyContactsRequest.getClass();
                RequestContext requestContext = verifyContactsRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                EmptyList emptyList = EmptyList.INSTANCE;
                ByteString byteString = ByteString.EMPTY;
                emptyList.getClass();
                byteString.getClass();
                return new VerifyContactsRequest(requestContext2, emptyList, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                VerifyContactsRequest verifyContactsRequest = (VerifyContactsRequest) obj;
                verifyContactsRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, verifyContactsRequest.request_context);
                ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 2, verifyContactsRequest.hashed_aliases);
                protoWriter.writeBytes(verifyContactsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyContactsRequest(RequestContext requestContext, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.hashed_aliases = TransactorKt.immutableCopyOf("hashed_aliases", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyContactsRequest)) {
            return false;
        }
        VerifyContactsRequest verifyContactsRequest = (VerifyContactsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), verifyContactsRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, verifyContactsRequest.request_context) && Intrinsics.areEqual(this.hashed_aliases, verifyContactsRequest.hashed_aliases);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = this.hashed_aliases.hashCode() + ((hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InviteContactsRequest.Builder builder = new InviteContactsRequest.Builder(8);
        builder.request_context = this.request_context;
        builder.email_addresses = this.hashed_aliases;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (!this.hashed_aliases.isEmpty()) {
            arrayList.add("hashed_aliases=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VerifyContactsRequest{", "}", 0, null, null, 56);
    }
}
