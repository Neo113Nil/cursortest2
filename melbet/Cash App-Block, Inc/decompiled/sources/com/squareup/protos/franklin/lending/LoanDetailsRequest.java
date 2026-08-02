package com.squareup.protos.franklin.lending;

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
public final class LoanDetailsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LoanDetailsRequest> CREATOR;
    public final String loan_token;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LoanDetailsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.lending.LoanDetailsRequest$Companion$ADAPTER$1
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
                        return new LoanDetailsRequest((RequestContext) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                LoanDetailsRequest loanDetailsRequest = (LoanDetailsRequest) obj;
                reverseProtoWriter.getClass();
                loanDetailsRequest.getClass();
                reverseProtoWriter.writeBytes(loanDetailsRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, loanDetailsRequest.loan_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, loanDetailsRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                LoanDetailsRequest loanDetailsRequest = (LoanDetailsRequest) obj;
                loanDetailsRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(2, loanDetailsRequest.loan_token) + RequestContext.ADAPTER.encodedSizeWithTag(1, loanDetailsRequest.request_context) + loanDetailsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                LoanDetailsRequest loanDetailsRequest = (LoanDetailsRequest) obj;
                loanDetailsRequest.getClass();
                RequestContext requestContext = loanDetailsRequest.request_context;
                return LoanDetailsRequest.copy$default(loanDetailsRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                LoanDetailsRequest loanDetailsRequest = (LoanDetailsRequest) obj;
                loanDetailsRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, loanDetailsRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, loanDetailsRequest.loan_token);
                protoWriter.writeBytes(loanDetailsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanDetailsRequest(RequestContext requestContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.loan_token = str;
    }

    public static LoanDetailsRequest copy$default(LoanDetailsRequest loanDetailsRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = loanDetailsRequest.loan_token;
        if ((i & 4) != 0) {
            byteString = loanDetailsRequest.unknownFields();
        }
        loanDetailsRequest.getClass();
        byteString.getClass();
        return new LoanDetailsRequest(requestContext, str, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoanDetailsRequest)) {
            return false;
        }
        LoanDetailsRequest loanDetailsRequest = (LoanDetailsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), loanDetailsRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, loanDetailsRequest.request_context) && Intrinsics.areEqual(this.loan_token, loanDetailsRequest.loan_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.loan_token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EndFlowRequest.Builder builder = new EndFlowRequest.Builder(26);
        builder.request_context = this.request_context;
        builder.action_id = this.loan_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.loan_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "loan_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LoanDetailsRequest{", "}", 0, null, null, 56);
    }
}
