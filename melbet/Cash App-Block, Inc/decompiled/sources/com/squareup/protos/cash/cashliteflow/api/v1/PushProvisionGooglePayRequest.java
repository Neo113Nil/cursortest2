package com.squareup.protos.cash.cashliteflow.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.VerifyInstrumentRequest;
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
public final class PushProvisionGooglePayRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PushProvisionGooglePayRequest> CREATOR;
    public final String card_token;
    public final String device_id;
    public final RequestContext request_context;
    public final String wallet_id;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PushProvisionGooglePayRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashliteflow.api.v1.PushProvisionGooglePayRequest$Companion$ADAPTER$1
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
                        return new PushProvisionGooglePayRequest((RequestContext) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                PushProvisionGooglePayRequest pushProvisionGooglePayRequest = (PushProvisionGooglePayRequest) obj;
                reverseProtoWriter.getClass();
                pushProvisionGooglePayRequest.getClass();
                reverseProtoWriter.writeBytes(pushProvisionGooglePayRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, pushProvisionGooglePayRequest.wallet_id);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, pushProvisionGooglePayRequest.device_id);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, pushProvisionGooglePayRequest.card_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, pushProvisionGooglePayRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                PushProvisionGooglePayRequest pushProvisionGooglePayRequest = (PushProvisionGooglePayRequest) obj;
                pushProvisionGooglePayRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, pushProvisionGooglePayRequest.request_context) + pushProvisionGooglePayRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(4, pushProvisionGooglePayRequest.wallet_id) + protoAdapter2.encodedSizeWithTag(3, pushProvisionGooglePayRequest.device_id) + protoAdapter2.encodedSizeWithTag(2, pushProvisionGooglePayRequest.card_token) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                PushProvisionGooglePayRequest pushProvisionGooglePayRequest = (PushProvisionGooglePayRequest) obj;
                pushProvisionGooglePayRequest.getClass();
                RequestContext requestContext = pushProvisionGooglePayRequest.request_context;
                return PushProvisionGooglePayRequest.copy$default(pushProvisionGooglePayRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                PushProvisionGooglePayRequest pushProvisionGooglePayRequest = (PushProvisionGooglePayRequest) obj;
                pushProvisionGooglePayRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, pushProvisionGooglePayRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, pushProvisionGooglePayRequest.card_token);
                protoAdapter2.encodeWithTag(protoWriter, 3, pushProvisionGooglePayRequest.device_id);
                protoAdapter2.encodeWithTag(protoWriter, 4, pushProvisionGooglePayRequest.wallet_id);
                protoWriter.writeBytes(pushProvisionGooglePayRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushProvisionGooglePayRequest(RequestContext requestContext, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.card_token = str;
        this.device_id = str2;
        this.wallet_id = str3;
    }

    public static PushProvisionGooglePayRequest copy$default(PushProvisionGooglePayRequest pushProvisionGooglePayRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = pushProvisionGooglePayRequest.card_token;
        String str2 = (i & 4) != 0 ? pushProvisionGooglePayRequest.device_id : null;
        String str3 = (i & 8) != 0 ? pushProvisionGooglePayRequest.wallet_id : null;
        if ((i & 16) != 0) {
            byteString = pushProvisionGooglePayRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        pushProvisionGooglePayRequest.getClass();
        byteString2.getClass();
        return new PushProvisionGooglePayRequest(requestContext, str, str2, str3, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PushProvisionGooglePayRequest)) {
            return false;
        }
        PushProvisionGooglePayRequest pushProvisionGooglePayRequest = (PushProvisionGooglePayRequest) obj;
        return Intrinsics.areEqual(unknownFields(), pushProvisionGooglePayRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, pushProvisionGooglePayRequest.request_context) && Intrinsics.areEqual(this.card_token, pushProvisionGooglePayRequest.card_token) && Intrinsics.areEqual(this.device_id, pushProvisionGooglePayRequest.device_id) && Intrinsics.areEqual(this.wallet_id, pushProvisionGooglePayRequest.wallet_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.card_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.device_id;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.wallet_id;
        int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        VerifyInstrumentRequest.Builder builder = new VerifyInstrumentRequest.Builder(1);
        builder.request_context = this.request_context;
        builder.unencrypted_pan = this.card_token;
        builder.routing_number = this.device_id;
        builder.account_number = this.wallet_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.card_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "card_token=", arrayList);
        }
        if (this.device_id != null) {
            arrayList.add("device_id=██");
        }
        if (this.wallet_id != null) {
            arrayList.add("wallet_id=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PushProvisionGooglePayRequest{", "}", 0, null, null, 56);
    }
}
