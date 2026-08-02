package com.squareup.protos.cash.investautomator.api.flows;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.investautomator.model.Automation;
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
public final class UpdateAutomationForFlowRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateAutomationForFlowRequest> CREATOR;
    public final Automation automation;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpdateAutomationForFlowRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.investautomator.api.flows.UpdateAutomationForFlowRequest$Companion$ADAPTER$1
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
                        return new UpdateAutomationForFlowRequest((RequestContext) obj, (Automation) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(Automation.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UpdateAutomationForFlowRequest updateAutomationForFlowRequest = (UpdateAutomationForFlowRequest) obj;
                reverseProtoWriter.getClass();
                updateAutomationForFlowRequest.getClass();
                reverseProtoWriter.writeBytes(updateAutomationForFlowRequest.unknownFields());
                Automation.ADAPTER.encodeWithTag(reverseProtoWriter, 2, updateAutomationForFlowRequest.automation);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateAutomationForFlowRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UpdateAutomationForFlowRequest updateAutomationForFlowRequest = (UpdateAutomationForFlowRequest) obj;
                updateAutomationForFlowRequest.getClass();
                return Automation.ADAPTER.encodedSizeWithTag(2, updateAutomationForFlowRequest.automation) + RequestContext.ADAPTER.encodedSizeWithTag(1, updateAutomationForFlowRequest.request_context) + updateAutomationForFlowRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UpdateAutomationForFlowRequest updateAutomationForFlowRequest = (UpdateAutomationForFlowRequest) obj;
                updateAutomationForFlowRequest.getClass();
                RequestContext requestContext = updateAutomationForFlowRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                Automation automation = updateAutomationForFlowRequest.automation;
                Automation automation2 = automation != null ? (Automation) Automation.ADAPTER.redact(automation) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new UpdateAutomationForFlowRequest(requestContext2, automation2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UpdateAutomationForFlowRequest updateAutomationForFlowRequest = (UpdateAutomationForFlowRequest) obj;
                updateAutomationForFlowRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, updateAutomationForFlowRequest.request_context);
                Automation.ADAPTER.encodeWithTag(protoWriter, 2, updateAutomationForFlowRequest.automation);
                protoWriter.writeBytes(updateAutomationForFlowRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateAutomationForFlowRequest(RequestContext requestContext, Automation automation, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.automation = automation;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateAutomationForFlowRequest)) {
            return false;
        }
        UpdateAutomationForFlowRequest updateAutomationForFlowRequest = (UpdateAutomationForFlowRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateAutomationForFlowRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, updateAutomationForFlowRequest.request_context) && Intrinsics.areEqual(this.automation, updateAutomationForFlowRequest.automation);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        Automation automation = this.automation;
        int hashCode3 = hashCode2 + (automation != null ? automation.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(7);
        builder.card_type = this.request_context;
        builder.card_pii = this.automation;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        Automation automation = this.automation;
        if (automation != null) {
            arrayList.add("automation=" + automation);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateAutomationForFlowRequest{", "}", 0, null, null, 56);
    }
}
