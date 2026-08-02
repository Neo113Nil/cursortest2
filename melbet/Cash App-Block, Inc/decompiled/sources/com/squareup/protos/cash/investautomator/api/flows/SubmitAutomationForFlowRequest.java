package com.squareup.protos.cash.investautomator.api.flows;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.Group;
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
public final class SubmitAutomationForFlowRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitAutomationForFlowRequest> CREATOR;
    public final Automation automation;
    public final String blocker_descriptor_id;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SubmitAutomationForFlowRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.investautomator.api.flows.SubmitAutomationForFlowRequest$Companion$ADAPTER$1
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
                        return new SubmitAutomationForFlowRequest((RequestContext) obj, (Automation) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(Automation.ADAPTER, protoReader, obj2);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SubmitAutomationForFlowRequest submitAutomationForFlowRequest = (SubmitAutomationForFlowRequest) obj;
                reverseProtoWriter.getClass();
                submitAutomationForFlowRequest.getClass();
                reverseProtoWriter.writeBytes(submitAutomationForFlowRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, submitAutomationForFlowRequest.blocker_descriptor_id);
                Automation.ADAPTER.encodeWithTag(reverseProtoWriter, 2, submitAutomationForFlowRequest.automation);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, submitAutomationForFlowRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SubmitAutomationForFlowRequest submitAutomationForFlowRequest = (SubmitAutomationForFlowRequest) obj;
                submitAutomationForFlowRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(3, submitAutomationForFlowRequest.blocker_descriptor_id) + Automation.ADAPTER.encodedSizeWithTag(2, submitAutomationForFlowRequest.automation) + RequestContext.ADAPTER.encodedSizeWithTag(1, submitAutomationForFlowRequest.request_context) + submitAutomationForFlowRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SubmitAutomationForFlowRequest submitAutomationForFlowRequest = (SubmitAutomationForFlowRequest) obj;
                submitAutomationForFlowRequest.getClass();
                RequestContext requestContext = submitAutomationForFlowRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                Automation automation = submitAutomationForFlowRequest.automation;
                Automation automation2 = automation != null ? (Automation) Automation.ADAPTER.redact(automation) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = submitAutomationForFlowRequest.blocker_descriptor_id;
                byteString.getClass();
                return new SubmitAutomationForFlowRequest(requestContext2, automation2, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SubmitAutomationForFlowRequest submitAutomationForFlowRequest = (SubmitAutomationForFlowRequest) obj;
                submitAutomationForFlowRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, submitAutomationForFlowRequest.request_context);
                Automation.ADAPTER.encodeWithTag(protoWriter, 2, submitAutomationForFlowRequest.automation);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, submitAutomationForFlowRequest.blocker_descriptor_id);
                protoWriter.writeBytes(submitAutomationForFlowRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitAutomationForFlowRequest(RequestContext requestContext, Automation automation, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.automation = automation;
        this.blocker_descriptor_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitAutomationForFlowRequest)) {
            return false;
        }
        SubmitAutomationForFlowRequest submitAutomationForFlowRequest = (SubmitAutomationForFlowRequest) obj;
        return Intrinsics.areEqual(unknownFields(), submitAutomationForFlowRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, submitAutomationForFlowRequest.request_context) && Intrinsics.areEqual(this.automation, submitAutomationForFlowRequest.automation) && Intrinsics.areEqual(this.blocker_descriptor_id, submitAutomationForFlowRequest.blocker_descriptor_id);
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
        int hashCode3 = (hashCode2 + (automation != null ? automation.hashCode() : 0)) * 37;
        String str = this.blocker_descriptor_id;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(2);
        builder.group_image = this.request_context;
        builder.participants = this.automation;
        builder.name = this.blocker_descriptor_id;
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
        String str = this.blocker_descriptor_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "blocker_descriptor_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitAutomationForFlowRequest{", "}", 0, null, null, 56);
    }
}
