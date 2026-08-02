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
public final class SwitchAccountRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SwitchAccountRequest> CREATOR;
    public final RequestContext request_context;
    public final String target_account_id;
    public final String target_switching_identifier;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SwitchAccountRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.janus.api.SwitchAccountRequest$Companion$ADAPTER$1
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
                        return new SwitchAccountRequest((RequestContext) obj2, (String) obj, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj2);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SwitchAccountRequest switchAccountRequest = (SwitchAccountRequest) obj;
                reverseProtoWriter.getClass();
                switchAccountRequest.getClass();
                reverseProtoWriter.writeBytes(switchAccountRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, switchAccountRequest.target_switching_identifier);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, switchAccountRequest.request_context);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, switchAccountRequest.target_account_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SwitchAccountRequest switchAccountRequest = (SwitchAccountRequest) obj;
                switchAccountRequest.getClass();
                int size$okio = switchAccountRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(3, switchAccountRequest.target_switching_identifier) + RequestContext.ADAPTER.encodedSizeWithTag(2, switchAccountRequest.request_context) + protoAdapter2.encodedSizeWithTag(1, switchAccountRequest.target_account_id) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SwitchAccountRequest switchAccountRequest = (SwitchAccountRequest) obj;
                switchAccountRequest.getClass();
                RequestContext requestContext = switchAccountRequest.request_context;
                return SwitchAccountRequest.copy$default(switchAccountRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 5);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SwitchAccountRequest switchAccountRequest = (SwitchAccountRequest) obj;
                switchAccountRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, switchAccountRequest.target_account_id);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, switchAccountRequest.request_context);
                protoAdapter2.encodeWithTag(protoWriter, 3, switchAccountRequest.target_switching_identifier);
                protoWriter.writeBytes(switchAccountRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchAccountRequest(RequestContext requestContext, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.target_account_id = str;
        this.request_context = requestContext;
        this.target_switching_identifier = str2;
    }

    public static SwitchAccountRequest copy$default(SwitchAccountRequest switchAccountRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = switchAccountRequest.target_account_id;
        String str2 = switchAccountRequest.target_switching_identifier;
        if ((i & 8) != 0) {
            byteString = switchAccountRequest.unknownFields();
        }
        switchAccountRequest.getClass();
        byteString.getClass();
        return new SwitchAccountRequest(requestContext, str, str2, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SwitchAccountRequest)) {
            return false;
        }
        SwitchAccountRequest switchAccountRequest = (SwitchAccountRequest) obj;
        return Intrinsics.areEqual(unknownFields(), switchAccountRequest.unknownFields()) && Intrinsics.areEqual(this.target_account_id, switchAccountRequest.target_account_id) && Intrinsics.areEqual(this.request_context, switchAccountRequest.request_context) && Intrinsics.areEqual(this.target_switching_identifier, switchAccountRequest.target_switching_identifier);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.target_account_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode3 = (hashCode2 + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str2 = this.target_switching_identifier;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        VerifyPasscodeRequest.Builder builder = new VerifyPasscodeRequest.Builder(2);
        builder.passcode = this.target_account_id;
        builder.request_context = this.request_context;
        builder.passcode_token = this.target_switching_identifier;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.target_account_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "target_account_id=", arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str2 = this.target_switching_identifier;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "target_switching_identifier=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SwitchAccountRequest{", "}", 0, null, null, 56);
    }
}
