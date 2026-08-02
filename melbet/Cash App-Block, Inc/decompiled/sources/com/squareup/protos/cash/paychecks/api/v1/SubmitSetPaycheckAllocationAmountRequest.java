package com.squareup.protos.cash.paychecks.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.paychecks.api.blockers.v1.SetPaycheckAllocationAmountInputs;
import com.squareup.protos.cash.postcard.CardModule;
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
public final class SubmitSetPaycheckAllocationAmountRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitSetPaycheckAllocationAmountRequest> CREATOR;
    public final SetPaycheckAllocationAmountInputs blocker_inputs;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SubmitSetPaycheckAllocationAmountRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckAllocationAmountRequest$Companion$ADAPTER$1
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
                        return new SubmitSetPaycheckAllocationAmountRequest((RequestContext) obj, (SetPaycheckAllocationAmountInputs) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(SetPaycheckAllocationAmountInputs.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SubmitSetPaycheckAllocationAmountRequest submitSetPaycheckAllocationAmountRequest = (SubmitSetPaycheckAllocationAmountRequest) obj;
                reverseProtoWriter.getClass();
                submitSetPaycheckAllocationAmountRequest.getClass();
                reverseProtoWriter.writeBytes(submitSetPaycheckAllocationAmountRequest.unknownFields());
                SetPaycheckAllocationAmountInputs.ADAPTER.encodeWithTag(reverseProtoWriter, 5, submitSetPaycheckAllocationAmountRequest.blocker_inputs);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, submitSetPaycheckAllocationAmountRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SubmitSetPaycheckAllocationAmountRequest submitSetPaycheckAllocationAmountRequest = (SubmitSetPaycheckAllocationAmountRequest) obj;
                submitSetPaycheckAllocationAmountRequest.getClass();
                return SetPaycheckAllocationAmountInputs.ADAPTER.encodedSizeWithTag(5, submitSetPaycheckAllocationAmountRequest.blocker_inputs) + RequestContext.ADAPTER.encodedSizeWithTag(1, submitSetPaycheckAllocationAmountRequest.request_context) + submitSetPaycheckAllocationAmountRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SubmitSetPaycheckAllocationAmountRequest submitSetPaycheckAllocationAmountRequest = (SubmitSetPaycheckAllocationAmountRequest) obj;
                submitSetPaycheckAllocationAmountRequest.getClass();
                RequestContext requestContext = submitSetPaycheckAllocationAmountRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                SetPaycheckAllocationAmountInputs setPaycheckAllocationAmountInputs = submitSetPaycheckAllocationAmountRequest.blocker_inputs;
                SetPaycheckAllocationAmountInputs setPaycheckAllocationAmountInputs2 = setPaycheckAllocationAmountInputs != null ? (SetPaycheckAllocationAmountInputs) SetPaycheckAllocationAmountInputs.ADAPTER.redact(setPaycheckAllocationAmountInputs) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new SubmitSetPaycheckAllocationAmountRequest(requestContext2, setPaycheckAllocationAmountInputs2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SubmitSetPaycheckAllocationAmountRequest submitSetPaycheckAllocationAmountRequest = (SubmitSetPaycheckAllocationAmountRequest) obj;
                submitSetPaycheckAllocationAmountRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, submitSetPaycheckAllocationAmountRequest.request_context);
                SetPaycheckAllocationAmountInputs.ADAPTER.encodeWithTag(protoWriter, 5, submitSetPaycheckAllocationAmountRequest.blocker_inputs);
                protoWriter.writeBytes(submitSetPaycheckAllocationAmountRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitSetPaycheckAllocationAmountRequest(RequestContext requestContext, SetPaycheckAllocationAmountInputs setPaycheckAllocationAmountInputs, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.blocker_inputs = setPaycheckAllocationAmountInputs;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitSetPaycheckAllocationAmountRequest)) {
            return false;
        }
        SubmitSetPaycheckAllocationAmountRequest submitSetPaycheckAllocationAmountRequest = (SubmitSetPaycheckAllocationAmountRequest) obj;
        return Intrinsics.areEqual(unknownFields(), submitSetPaycheckAllocationAmountRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, submitSetPaycheckAllocationAmountRequest.request_context) && Intrinsics.areEqual(this.blocker_inputs, submitSetPaycheckAllocationAmountRequest.blocker_inputs);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        SetPaycheckAllocationAmountInputs setPaycheckAllocationAmountInputs = this.blocker_inputs;
        int hashCode3 = hashCode2 + (setPaycheckAllocationAmountInputs != null ? setPaycheckAllocationAmountInputs.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(10);
        builder.f1329type = this.request_context;
        builder.use_case = this.blocker_inputs;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        SetPaycheckAllocationAmountInputs setPaycheckAllocationAmountInputs = this.blocker_inputs;
        if (setPaycheckAllocationAmountInputs != null) {
            arrayList.add("blocker_inputs=" + setPaycheckAllocationAmountInputs);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitSetPaycheckAllocationAmountRequest{", "}", 0, null, null, 56);
    }
}
