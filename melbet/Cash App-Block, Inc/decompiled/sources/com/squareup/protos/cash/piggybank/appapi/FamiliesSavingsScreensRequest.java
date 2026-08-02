package com.squareup.protos.cash.piggybank.appapi;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.EndFlowRequest;
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
public final class FamiliesSavingsScreensRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FamiliesSavingsScreensRequest> CREATOR;
    public final String dependent_customer_token;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FamiliesSavingsScreensRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.piggybank.appapi.FamiliesSavingsScreensRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new FamiliesSavingsScreensRequest((RequestContext) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                FamiliesSavingsScreensRequest familiesSavingsScreensRequest = (FamiliesSavingsScreensRequest) obj;
                reverseProtoWriter.getClass();
                familiesSavingsScreensRequest.getClass();
                reverseProtoWriter.writeBytes(familiesSavingsScreensRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, familiesSavingsScreensRequest.dependent_customer_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, familiesSavingsScreensRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                FamiliesSavingsScreensRequest familiesSavingsScreensRequest = (FamiliesSavingsScreensRequest) obj;
                familiesSavingsScreensRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(2, familiesSavingsScreensRequest.dependent_customer_token) + RequestContext.ADAPTER.encodedSizeWithTag(1, familiesSavingsScreensRequest.request_context) + familiesSavingsScreensRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                FamiliesSavingsScreensRequest familiesSavingsScreensRequest = (FamiliesSavingsScreensRequest) obj;
                familiesSavingsScreensRequest.getClass();
                RequestContext requestContext = familiesSavingsScreensRequest.request_context;
                return FamiliesSavingsScreensRequest.copy$default(familiesSavingsScreensRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                FamiliesSavingsScreensRequest familiesSavingsScreensRequest = (FamiliesSavingsScreensRequest) obj;
                familiesSavingsScreensRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, familiesSavingsScreensRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, familiesSavingsScreensRequest.dependent_customer_token);
                protoWriter.writeBytes(familiesSavingsScreensRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamiliesSavingsScreensRequest(RequestContext requestContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.dependent_customer_token = str;
    }

    public static FamiliesSavingsScreensRequest copy$default(FamiliesSavingsScreensRequest familiesSavingsScreensRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = familiesSavingsScreensRequest.dependent_customer_token;
        if ((i & 4) != 0) {
            byteString = familiesSavingsScreensRequest.unknownFields();
        }
        familiesSavingsScreensRequest.getClass();
        byteString.getClass();
        return new FamiliesSavingsScreensRequest(requestContext, str, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FamiliesSavingsScreensRequest)) {
            return false;
        }
        FamiliesSavingsScreensRequest familiesSavingsScreensRequest = (FamiliesSavingsScreensRequest) obj;
        return Intrinsics.areEqual(unknownFields(), familiesSavingsScreensRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, familiesSavingsScreensRequest.request_context) && Intrinsics.areEqual(this.dependent_customer_token, familiesSavingsScreensRequest.dependent_customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.dependent_customer_token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EndFlowRequest.Builder builder = new EndFlowRequest.Builder(11);
        builder.request_context = this.request_context;
        builder.action_id = this.dependent_customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.dependent_customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "dependent_customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FamiliesSavingsScreensRequest{", "}", 0, null, null, 56);
    }
}
