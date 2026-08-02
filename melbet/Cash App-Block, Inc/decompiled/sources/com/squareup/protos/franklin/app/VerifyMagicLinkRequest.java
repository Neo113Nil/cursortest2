package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SetDateRequest;
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
public final class VerifyMagicLinkRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VerifyMagicLinkRequest> CREATOR;
    public final Boolean customer_requested_deny_attempt;
    public final RequestContext request_context;
    public final String verification_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(VerifyMagicLinkRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.VerifyMagicLinkRequest$Companion$ADAPTER$1
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
                        return new VerifyMagicLinkRequest((RequestContext) obj, (Boolean) obj3, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                VerifyMagicLinkRequest verifyMagicLinkRequest = (VerifyMagicLinkRequest) obj;
                reverseProtoWriter.getClass();
                verifyMagicLinkRequest.getClass();
                reverseProtoWriter.writeBytes(verifyMagicLinkRequest.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, verifyMagicLinkRequest.customer_requested_deny_attempt);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, verifyMagicLinkRequest.verification_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, verifyMagicLinkRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                VerifyMagicLinkRequest verifyMagicLinkRequest = (VerifyMagicLinkRequest) obj;
                verifyMagicLinkRequest.getClass();
                return ProtoAdapter.BOOL.encodedSizeWithTag(3, verifyMagicLinkRequest.customer_requested_deny_attempt) + ProtoAdapter.STRING.encodedSizeWithTag(2, verifyMagicLinkRequest.verification_token) + RequestContext.ADAPTER.encodedSizeWithTag(1, verifyMagicLinkRequest.request_context) + verifyMagicLinkRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                VerifyMagicLinkRequest verifyMagicLinkRequest = (VerifyMagicLinkRequest) obj;
                verifyMagicLinkRequest.getClass();
                RequestContext requestContext = verifyMagicLinkRequest.request_context;
                return VerifyMagicLinkRequest.copy$default(verifyMagicLinkRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 6);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                VerifyMagicLinkRequest verifyMagicLinkRequest = (VerifyMagicLinkRequest) obj;
                verifyMagicLinkRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, verifyMagicLinkRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, verifyMagicLinkRequest.verification_token);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, verifyMagicLinkRequest.customer_requested_deny_attempt);
                protoWriter.writeBytes(verifyMagicLinkRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMagicLinkRequest(RequestContext requestContext, Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.verification_token = str;
        this.customer_requested_deny_attempt = bool;
    }

    public static VerifyMagicLinkRequest copy$default(VerifyMagicLinkRequest verifyMagicLinkRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = verifyMagicLinkRequest.verification_token;
        Boolean bool = verifyMagicLinkRequest.customer_requested_deny_attempt;
        if ((i & 8) != 0) {
            byteString = verifyMagicLinkRequest.unknownFields();
        }
        verifyMagicLinkRequest.getClass();
        byteString.getClass();
        return new VerifyMagicLinkRequest(requestContext, bool, str, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyMagicLinkRequest)) {
            return false;
        }
        VerifyMagicLinkRequest verifyMagicLinkRequest = (VerifyMagicLinkRequest) obj;
        return Intrinsics.areEqual(unknownFields(), verifyMagicLinkRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, verifyMagicLinkRequest.request_context) && Intrinsics.areEqual(this.verification_token, verifyMagicLinkRequest.verification_token) && Intrinsics.areEqual(this.customer_requested_deny_attempt, verifyMagicLinkRequest.customer_requested_deny_attempt);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.verification_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.customer_requested_deny_attempt;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SetDateRequest.Builder builder = new SetDateRequest.Builder(3);
        builder.request_context = this.request_context;
        builder.date = this.verification_token;
        builder.disabling_toggle_enabled = this.customer_requested_deny_attempt;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.verification_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "verification_token=", arrayList);
        }
        Boolean bool = this.customer_requested_deny_attempt;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("customer_requested_deny_attempt=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VerifyMagicLinkRequest{", "}", 0, null, null, 56);
    }
}
