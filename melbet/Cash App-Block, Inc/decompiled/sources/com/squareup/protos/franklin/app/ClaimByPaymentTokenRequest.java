package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.api.UiAlias;
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
public final class ClaimByPaymentTokenRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClaimByPaymentTokenRequest> CREATOR;
    public final InstrumentSelection instrument_selection;
    public final String payment_token;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ClaimByPaymentTokenRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.ClaimByPaymentTokenRequest$Companion$ADAPTER$1
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
                        return new ClaimByPaymentTokenRequest((RequestContext) obj, (String) obj2, (InstrumentSelection) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 3) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(InstrumentSelection.ADAPTER, protoReader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ClaimByPaymentTokenRequest claimByPaymentTokenRequest = (ClaimByPaymentTokenRequest) obj;
                reverseProtoWriter.getClass();
                claimByPaymentTokenRequest.getClass();
                reverseProtoWriter.writeBytes(claimByPaymentTokenRequest.unknownFields());
                InstrumentSelection.ADAPTER.encodeWithTag(reverseProtoWriter, 5, claimByPaymentTokenRequest.instrument_selection);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, claimByPaymentTokenRequest.payment_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, claimByPaymentTokenRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ClaimByPaymentTokenRequest claimByPaymentTokenRequest = (ClaimByPaymentTokenRequest) obj;
                claimByPaymentTokenRequest.getClass();
                return InstrumentSelection.ADAPTER.encodedSizeWithTag(5, claimByPaymentTokenRequest.instrument_selection) + ProtoAdapter.STRING.encodedSizeWithTag(3, claimByPaymentTokenRequest.payment_token) + RequestContext.ADAPTER.encodedSizeWithTag(4, claimByPaymentTokenRequest.request_context) + claimByPaymentTokenRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ClaimByPaymentTokenRequest claimByPaymentTokenRequest = (ClaimByPaymentTokenRequest) obj;
                claimByPaymentTokenRequest.getClass();
                RequestContext requestContext = claimByPaymentTokenRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                InstrumentSelection instrumentSelection = claimByPaymentTokenRequest.instrument_selection;
                InstrumentSelection instrumentSelection2 = instrumentSelection != null ? (InstrumentSelection) InstrumentSelection.ADAPTER.redact(instrumentSelection) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new ClaimByPaymentTokenRequest(requestContext2, null, instrumentSelection2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ClaimByPaymentTokenRequest claimByPaymentTokenRequest = (ClaimByPaymentTokenRequest) obj;
                claimByPaymentTokenRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, claimByPaymentTokenRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, claimByPaymentTokenRequest.payment_token);
                InstrumentSelection.ADAPTER.encodeWithTag(protoWriter, 5, claimByPaymentTokenRequest.instrument_selection);
                protoWriter.writeBytes(claimByPaymentTokenRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClaimByPaymentTokenRequest(RequestContext requestContext, String str, InstrumentSelection instrumentSelection, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.payment_token = str;
        this.instrument_selection = instrumentSelection;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClaimByPaymentTokenRequest)) {
            return false;
        }
        ClaimByPaymentTokenRequest claimByPaymentTokenRequest = (ClaimByPaymentTokenRequest) obj;
        return Intrinsics.areEqual(unknownFields(), claimByPaymentTokenRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, claimByPaymentTokenRequest.request_context) && Intrinsics.areEqual(this.payment_token, claimByPaymentTokenRequest.payment_token) && Intrinsics.areEqual(this.instrument_selection, claimByPaymentTokenRequest.instrument_selection);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.payment_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        InstrumentSelection instrumentSelection = this.instrument_selection;
        int hashCode4 = hashCode3 + (instrumentSelection != null ? instrumentSelection.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(17);
        builder.f1364type = this.request_context;
        builder.canonical_text = this.payment_token;
        builder.formatted = this.instrument_selection;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.payment_token != null) {
            arrayList.add("payment_token=██");
        }
        InstrumentSelection instrumentSelection = this.instrument_selection;
        if (instrumentSelection != null) {
            arrayList.add("instrument_selection=" + instrumentSelection);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClaimByPaymentTokenRequest{", "}", 0, null, null, 56);
    }
}
