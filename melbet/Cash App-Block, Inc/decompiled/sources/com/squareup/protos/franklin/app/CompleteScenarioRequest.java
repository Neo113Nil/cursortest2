package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SetFullNameRequest;
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
public final class CompleteScenarioRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CompleteScenarioRequest> CREATOR;
    public final String backup_tag;
    public final List payment_tokens;
    public final RequestContext request_context;
    public final String transfer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CompleteScenarioRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.CompleteScenarioRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new CompleteScenarioRequest((RequestContext) obj, (String) obj2, (String) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CompleteScenarioRequest completeScenarioRequest = (CompleteScenarioRequest) obj;
                reverseProtoWriter.getClass();
                completeScenarioRequest.getClass();
                reverseProtoWriter.writeBytes(completeScenarioRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, completeScenarioRequest.backup_tag);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, completeScenarioRequest.transfer_token);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 1, completeScenarioRequest.payment_tokens);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, completeScenarioRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CompleteScenarioRequest completeScenarioRequest = (CompleteScenarioRequest) obj;
                completeScenarioRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(3, completeScenarioRequest.request_context) + completeScenarioRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(4, completeScenarioRequest.backup_tag) + protoAdapter2.encodedSizeWithTag(2, completeScenarioRequest.transfer_token) + protoAdapter2.asRepeated().encodedSizeWithTag(1, completeScenarioRequest.payment_tokens) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CompleteScenarioRequest completeScenarioRequest = (CompleteScenarioRequest) obj;
                completeScenarioRequest.getClass();
                RequestContext requestContext = completeScenarioRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                EmptyList emptyList = EmptyList.INSTANCE;
                ByteString byteString = ByteString.EMPTY;
                emptyList.getClass();
                byteString.getClass();
                return new CompleteScenarioRequest(requestContext2, null, null, emptyList, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CompleteScenarioRequest completeScenarioRequest = (CompleteScenarioRequest) obj;
                completeScenarioRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 3, completeScenarioRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 1, completeScenarioRequest.payment_tokens);
                protoAdapter2.encodeWithTag(protoWriter, 2, completeScenarioRequest.transfer_token);
                protoAdapter2.encodeWithTag(protoWriter, 4, completeScenarioRequest.backup_tag);
                protoWriter.writeBytes(completeScenarioRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompleteScenarioRequest(RequestContext requestContext, String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.transfer_token = str;
        this.backup_tag = str2;
        this.payment_tokens = TransactorKt.immutableCopyOf("payment_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CompleteScenarioRequest)) {
            return false;
        }
        CompleteScenarioRequest completeScenarioRequest = (CompleteScenarioRequest) obj;
        return Intrinsics.areEqual(unknownFields(), completeScenarioRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, completeScenarioRequest.request_context) && Intrinsics.areEqual(this.payment_tokens, completeScenarioRequest.payment_tokens) && Intrinsics.areEqual(this.transfer_token, completeScenarioRequest.transfer_token) && Intrinsics.areEqual(this.backup_tag, completeScenarioRequest.backup_tag);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37, 37, this.payment_tokens);
        String str = this.transfer_token;
        int hashCode2 = (m + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.backup_tag;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SetFullNameRequest.Builder builder = new SetFullNameRequest.Builder(3);
        builder.request_context = this.request_context;
        builder.payment_tokens = this.payment_tokens;
        builder.full_name = this.transfer_token;
        builder.transfer_token = this.backup_tag;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (!this.payment_tokens.isEmpty()) {
            arrayList.add("payment_tokens=██");
        }
        if (this.transfer_token != null) {
            arrayList.add("transfer_token=██");
        }
        if (this.backup_tag != null) {
            arrayList.add("backup_tag=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CompleteScenarioRequest{", "}", 0, null, null, 56);
    }

    public CompleteScenarioRequest(int i, RequestContext requestContext, List list) {
        this((i & 1) != 0 ? null : requestContext, null, null, list, ByteString.EMPTY);
    }
}
