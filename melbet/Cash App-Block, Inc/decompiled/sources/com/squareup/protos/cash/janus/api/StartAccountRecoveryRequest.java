package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
public final class StartAccountRecoveryRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StartAccountRecoveryRequest> CREATOR;
    public final String account_id;
    public final String backup_tag;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(StartAccountRecoveryRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.janus.api.StartAccountRecoveryRequest$Companion$ADAPTER$1
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
                        return new StartAccountRecoveryRequest((RequestContext) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                StartAccountRecoveryRequest startAccountRecoveryRequest = (StartAccountRecoveryRequest) obj;
                reverseProtoWriter.getClass();
                startAccountRecoveryRequest.getClass();
                reverseProtoWriter.writeBytes(startAccountRecoveryRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, startAccountRecoveryRequest.account_id);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, startAccountRecoveryRequest.backup_tag);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, startAccountRecoveryRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                StartAccountRecoveryRequest startAccountRecoveryRequest = (StartAccountRecoveryRequest) obj;
                startAccountRecoveryRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, startAccountRecoveryRequest.request_context) + startAccountRecoveryRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(3, startAccountRecoveryRequest.account_id) + protoAdapter2.encodedSizeWithTag(2, startAccountRecoveryRequest.backup_tag) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                StartAccountRecoveryRequest startAccountRecoveryRequest = (StartAccountRecoveryRequest) obj;
                startAccountRecoveryRequest.getClass();
                RequestContext requestContext = startAccountRecoveryRequest.request_context;
                return StartAccountRecoveryRequest.copy$default(startAccountRecoveryRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 4);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                StartAccountRecoveryRequest startAccountRecoveryRequest = (StartAccountRecoveryRequest) obj;
                startAccountRecoveryRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, startAccountRecoveryRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, startAccountRecoveryRequest.backup_tag);
                protoAdapter2.encodeWithTag(protoWriter, 3, startAccountRecoveryRequest.account_id);
                protoWriter.writeBytes(startAccountRecoveryRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartAccountRecoveryRequest(RequestContext requestContext, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.backup_tag = str;
        this.account_id = str2;
    }

    public static StartAccountRecoveryRequest copy$default(StartAccountRecoveryRequest startAccountRecoveryRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = (i & 2) != 0 ? startAccountRecoveryRequest.backup_tag : null;
        String str2 = startAccountRecoveryRequest.account_id;
        if ((i & 8) != 0) {
            byteString = startAccountRecoveryRequest.unknownFields();
        }
        startAccountRecoveryRequest.getClass();
        byteString.getClass();
        return new StartAccountRecoveryRequest(requestContext, str, str2, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartAccountRecoveryRequest)) {
            return false;
        }
        StartAccountRecoveryRequest startAccountRecoveryRequest = (StartAccountRecoveryRequest) obj;
        return Intrinsics.areEqual(unknownFields(), startAccountRecoveryRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, startAccountRecoveryRequest.request_context) && Intrinsics.areEqual(this.backup_tag, startAccountRecoveryRequest.backup_tag) && Intrinsics.areEqual(this.account_id, startAccountRecoveryRequest.account_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.backup_tag;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.account_id;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        VerifyPasscodeRequest.Builder builder = new VerifyPasscodeRequest.Builder(1);
        builder.request_context = this.request_context;
        builder.passcode = this.backup_tag;
        builder.passcode_token = this.account_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.backup_tag != null) {
            arrayList.add("backup_tag=██");
        }
        String str = this.account_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "account_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StartAccountRecoveryRequest{", "}", 0, null, null, 56);
    }
}
