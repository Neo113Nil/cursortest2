package com.squareup.protos.cash.local.client.app.v1;

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
public final class AbandonPOSCheckInRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AbandonPOSCheckInRequest> CREATOR;
    public final String check_in_token;
    public final String location_token;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AbandonPOSCheckInRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.app.v1.AbandonPOSCheckInRequest$Companion$ADAPTER$1
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
                        return new AbandonPOSCheckInRequest((RequestContext) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                AbandonPOSCheckInRequest abandonPOSCheckInRequest = (AbandonPOSCheckInRequest) obj;
                reverseProtoWriter.getClass();
                abandonPOSCheckInRequest.getClass();
                reverseProtoWriter.writeBytes(abandonPOSCheckInRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, abandonPOSCheckInRequest.location_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, abandonPOSCheckInRequest.check_in_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, abandonPOSCheckInRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AbandonPOSCheckInRequest abandonPOSCheckInRequest = (AbandonPOSCheckInRequest) obj;
                abandonPOSCheckInRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, abandonPOSCheckInRequest.request_context) + abandonPOSCheckInRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(3, abandonPOSCheckInRequest.location_token) + protoAdapter2.encodedSizeWithTag(2, abandonPOSCheckInRequest.check_in_token) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AbandonPOSCheckInRequest abandonPOSCheckInRequest = (AbandonPOSCheckInRequest) obj;
                abandonPOSCheckInRequest.getClass();
                RequestContext requestContext = abandonPOSCheckInRequest.request_context;
                return AbandonPOSCheckInRequest.copy$default(abandonPOSCheckInRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 6);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AbandonPOSCheckInRequest abandonPOSCheckInRequest = (AbandonPOSCheckInRequest) obj;
                abandonPOSCheckInRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, abandonPOSCheckInRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, abandonPOSCheckInRequest.check_in_token);
                protoAdapter2.encodeWithTag(protoWriter, 3, abandonPOSCheckInRequest.location_token);
                protoWriter.writeBytes(abandonPOSCheckInRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbandonPOSCheckInRequest(RequestContext requestContext, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.check_in_token = str;
        this.location_token = str2;
    }

    public static AbandonPOSCheckInRequest copy$default(AbandonPOSCheckInRequest abandonPOSCheckInRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = abandonPOSCheckInRequest.check_in_token;
        String str2 = abandonPOSCheckInRequest.location_token;
        if ((i & 8) != 0) {
            byteString = abandonPOSCheckInRequest.unknownFields();
        }
        abandonPOSCheckInRequest.getClass();
        byteString.getClass();
        return new AbandonPOSCheckInRequest(requestContext, str, str2, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbandonPOSCheckInRequest)) {
            return false;
        }
        AbandonPOSCheckInRequest abandonPOSCheckInRequest = (AbandonPOSCheckInRequest) obj;
        return Intrinsics.areEqual(unknownFields(), abandonPOSCheckInRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, abandonPOSCheckInRequest.request_context) && Intrinsics.areEqual(this.check_in_token, abandonPOSCheckInRequest.check_in_token) && Intrinsics.areEqual(this.location_token, abandonPOSCheckInRequest.location_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.check_in_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.location_token;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        VerifyPasscodeRequest.Builder builder = new VerifyPasscodeRequest.Builder(3);
        builder.request_context = this.request_context;
        builder.passcode = this.check_in_token;
        builder.passcode_token = this.location_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.check_in_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "check_in_token=", arrayList);
        }
        String str2 = this.location_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "location_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AbandonPOSCheckInRequest{", "}", 0, null, null, 56);
    }
}
