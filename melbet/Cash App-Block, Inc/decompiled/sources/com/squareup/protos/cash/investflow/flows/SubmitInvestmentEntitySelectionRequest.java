package com.squareup.protos.cash.investflow.flows;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzbs;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.grantly.api.SandboxMetadata;
import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SubmitInvestmentEntitySelectionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitInvestmentEntitySelectionRequest> CREATOR;
    public final zzbs action;
    public final RequestContext request_context;

    /* loaded from: classes7.dex */
    public final class CancelWithDisableIntent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CancelWithDisableIntent> CREATOR;

        static {
            SubmitInvestmentEntitySelectionRequest$CancelWithDisableIntent$Companion$ADAPTER$1 submitInvestmentEntitySelectionRequest$CancelWithDisableIntent$Companion$ADAPTER$1 = new SubmitInvestmentEntitySelectionRequest$CancelWithDisableIntent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CancelWithDisableIntent.class), "type.googleapis.com/squareup.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent", Syntax.PROTO_2, null, "squareup/cash/investflow/flows/actions.proto");
            ADAPTER = submitInvestmentEntitySelectionRequest$CancelWithDisableIntent$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(submitInvestmentEntitySelectionRequest$CancelWithDisableIntent$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelWithDisableIntent(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof CancelWithDisableIntent) && Intrinsics.areEqual(unknownFields(), ((CancelWithDisableIntent) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.OpenID.Builder builder = new Action.OpenID.Builder(8);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "CancelWithDisableIntent{}";
        }
    }

    /* loaded from: classes7.dex */
    public final class SelectionAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SelectionAction> CREATOR;
        public final List investment_entity_tokens;

        static {
            SubmitInvestmentEntitySelectionRequest$SelectionAction$Companion$ADAPTER$1 submitInvestmentEntitySelectionRequest$SelectionAction$Companion$ADAPTER$1 = new SubmitInvestmentEntitySelectionRequest$SelectionAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SelectionAction.class), "type.googleapis.com/squareup.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest.SelectionAction", Syntax.PROTO_2, null, "squareup/cash/investflow/flows/actions.proto");
            ADAPTER = submitInvestmentEntitySelectionRequest$SelectionAction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(submitInvestmentEntitySelectionRequest$SelectionAction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectionAction(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.investment_entity_tokens = TransactorKt.immutableCopyOf("investment_entity_tokens", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SelectionAction)) {
                return false;
            }
            SelectionAction selectionAction = (SelectionAction) obj;
            return Intrinsics.areEqual(unknownFields(), selectionAction.unknownFields()) && Intrinsics.areEqual(this.investment_entity_tokens, selectionAction.investment_entity_tokens);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.investment_entity_tokens.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SandboxMetadata.Builder builder = new SandboxMetadata.Builder(19, false);
            builder.scenarios = this.investment_entity_tokens;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.investment_entity_tokens;
            if (!list.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("investment_entity_tokens=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SelectionAction{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SubmitInvestmentEntitySelectionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                zzbs zzbsVar = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SubmitInvestmentEntitySelectionRequest((RequestContext) obj, zzbsVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 3) {
                        zzbsVar = new SubmitInvestmentEntitySelectionRequest$Action$InvestmentEntityToken((String) ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 4) {
                        zzbsVar = new SubmitInvestmentEntitySelectionRequest$Action$Cancel((SubmitInvestmentEntitySelectionRequest.CancelAction) SubmitInvestmentEntitySelectionRequest.CancelAction.ADAPTER.decode(protoReader));
                    } else if (nextTag == 5) {
                        zzbsVar = new SubmitInvestmentEntitySelectionRequest$Action$Selection((SubmitInvestmentEntitySelectionRequest.SelectionAction) SubmitInvestmentEntitySelectionRequest.SelectionAction.ADAPTER.decode(protoReader));
                    } else if (nextTag != 6) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        zzbsVar = new SubmitInvestmentEntitySelectionRequest$Action$CancelWithDisableIntent((SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent) SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SubmitInvestmentEntitySelectionRequest submitInvestmentEntitySelectionRequest = (SubmitInvestmentEntitySelectionRequest) obj;
                reverseProtoWriter.getClass();
                submitInvestmentEntitySelectionRequest.getClass();
                reverseProtoWriter.writeBytes(submitInvestmentEntitySelectionRequest.unknownFields());
                zzbs zzbsVar = submitInvestmentEntitySelectionRequest.action;
                if (zzbsVar instanceof SubmitInvestmentEntitySelectionRequest$Action$InvestmentEntityToken) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, ((SubmitInvestmentEntitySelectionRequest$Action$InvestmentEntityToken) zzbsVar).value);
                } else if (zzbsVar instanceof SubmitInvestmentEntitySelectionRequest$Action$Cancel) {
                    SubmitInvestmentEntitySelectionRequest.CancelAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((SubmitInvestmentEntitySelectionRequest$Action$Cancel) zzbsVar).value);
                } else if (zzbsVar instanceof SubmitInvestmentEntitySelectionRequest$Action$Selection) {
                    SubmitInvestmentEntitySelectionRequest.SelectionAction.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((SubmitInvestmentEntitySelectionRequest$Action$Selection) zzbsVar).value);
                } else if (zzbsVar instanceof SubmitInvestmentEntitySelectionRequest$Action$CancelWithDisableIntent) {
                    SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((SubmitInvestmentEntitySelectionRequest$Action$CancelWithDisableIntent) zzbsVar).value);
                } else if (zzbsVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, submitInvestmentEntitySelectionRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SubmitInvestmentEntitySelectionRequest submitInvestmentEntitySelectionRequest = (SubmitInvestmentEntitySelectionRequest) obj;
                submitInvestmentEntitySelectionRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, submitInvestmentEntitySelectionRequest.request_context) + submitInvestmentEntitySelectionRequest.unknownFields().getSize$okio();
                zzbs zzbsVar = submitInvestmentEntitySelectionRequest.action;
                if (zzbsVar instanceof SubmitInvestmentEntitySelectionRequest$Action$InvestmentEntityToken) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(3, ((SubmitInvestmentEntitySelectionRequest$Action$InvestmentEntityToken) zzbsVar).value) + encodedSizeWithTag;
                }
                if (zzbsVar instanceof SubmitInvestmentEntitySelectionRequest$Action$Cancel) {
                    return SubmitInvestmentEntitySelectionRequest.CancelAction.ADAPTER.encodedSizeWithTag(4, ((SubmitInvestmentEntitySelectionRequest$Action$Cancel) zzbsVar).value) + encodedSizeWithTag;
                }
                if (zzbsVar instanceof SubmitInvestmentEntitySelectionRequest$Action$Selection) {
                    return SubmitInvestmentEntitySelectionRequest.SelectionAction.ADAPTER.encodedSizeWithTag(5, ((SubmitInvestmentEntitySelectionRequest$Action$Selection) zzbsVar).value) + encodedSizeWithTag;
                }
                if (zzbsVar instanceof SubmitInvestmentEntitySelectionRequest$Action$CancelWithDisableIntent) {
                    return SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent.ADAPTER.encodedSizeWithTag(6, ((SubmitInvestmentEntitySelectionRequest$Action$CancelWithDisableIntent) zzbsVar).value) + encodedSizeWithTag;
                }
                if (zzbsVar == null) {
                    return encodedSizeWithTag;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SubmitInvestmentEntitySelectionRequest submitInvestmentEntitySelectionRequest = (SubmitInvestmentEntitySelectionRequest) obj;
                submitInvestmentEntitySelectionRequest.getClass();
                RequestContext requestContext = submitInvestmentEntitySelectionRequest.request_context;
                return SubmitInvestmentEntitySelectionRequest.copy$default(submitInvestmentEntitySelectionRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SubmitInvestmentEntitySelectionRequest submitInvestmentEntitySelectionRequest = (SubmitInvestmentEntitySelectionRequest) obj;
                submitInvestmentEntitySelectionRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, submitInvestmentEntitySelectionRequest.request_context);
                zzbs zzbsVar = submitInvestmentEntitySelectionRequest.action;
                if (zzbsVar instanceof SubmitInvestmentEntitySelectionRequest$Action$InvestmentEntityToken) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, ((SubmitInvestmentEntitySelectionRequest$Action$InvestmentEntityToken) zzbsVar).value);
                } else if (zzbsVar instanceof SubmitInvestmentEntitySelectionRequest$Action$Cancel) {
                    SubmitInvestmentEntitySelectionRequest.CancelAction.ADAPTER.encodeWithTag(protoWriter, 4, ((SubmitInvestmentEntitySelectionRequest$Action$Cancel) zzbsVar).value);
                } else if (zzbsVar instanceof SubmitInvestmentEntitySelectionRequest$Action$Selection) {
                    SubmitInvestmentEntitySelectionRequest.SelectionAction.ADAPTER.encodeWithTag(protoWriter, 5, ((SubmitInvestmentEntitySelectionRequest$Action$Selection) zzbsVar).value);
                } else if (zzbsVar instanceof SubmitInvestmentEntitySelectionRequest$Action$CancelWithDisableIntent) {
                    SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent.ADAPTER.encodeWithTag(protoWriter, 6, ((SubmitInvestmentEntitySelectionRequest$Action$CancelWithDisableIntent) zzbsVar).value);
                } else if (zzbsVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(submitInvestmentEntitySelectionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitInvestmentEntitySelectionRequest(RequestContext requestContext, zzbs zzbsVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.action = zzbsVar;
    }

    public static SubmitInvestmentEntitySelectionRequest copy$default(SubmitInvestmentEntitySelectionRequest submitInvestmentEntitySelectionRequest, RequestContext requestContext, ByteString byteString, int i) {
        zzbs zzbsVar = submitInvestmentEntitySelectionRequest.action;
        if ((i & 4) != 0) {
            byteString = submitInvestmentEntitySelectionRequest.unknownFields();
        }
        submitInvestmentEntitySelectionRequest.getClass();
        byteString.getClass();
        return new SubmitInvestmentEntitySelectionRequest(requestContext, zzbsVar, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitInvestmentEntitySelectionRequest)) {
            return false;
        }
        SubmitInvestmentEntitySelectionRequest submitInvestmentEntitySelectionRequest = (SubmitInvestmentEntitySelectionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), submitInvestmentEntitySelectionRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, submitInvestmentEntitySelectionRequest.request_context) && Intrinsics.areEqual(this.action, submitInvestmentEntitySelectionRequest.action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        zzbs zzbsVar = this.action;
        int hashCode3 = hashCode2 + (zzbsVar != null ? zzbsVar.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(11);
        builder.card_type = this.request_context;
        builder.card_pii = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        zzbs zzbsVar = this.action;
        if (zzbsVar != null) {
            arrayList.add("action=" + zzbsVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitInvestmentEntitySelectionRequest{", "}", 0, null, null, 56);
    }

    /* loaded from: classes7.dex */
    public final class CancelAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CancelAction> CREATOR;

        static {
            SubmitInvestmentEntitySelectionRequest$CancelAction$Companion$ADAPTER$1 submitInvestmentEntitySelectionRequest$CancelAction$Companion$ADAPTER$1 = new SubmitInvestmentEntitySelectionRequest$CancelAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CancelAction.class), "type.googleapis.com/squareup.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest.CancelAction", Syntax.PROTO_2, null, "squareup/cash/investflow/flows/actions.proto");
            ADAPTER = submitInvestmentEntitySelectionRequest$CancelAction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(submitInvestmentEntitySelectionRequest$CancelAction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelAction(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof CancelAction) && Intrinsics.areEqual(unknownFields(), ((CancelAction) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.OpenID.Builder builder = new Action.OpenID.Builder(7);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "CancelAction{}";
        }

        public /* synthetic */ CancelAction() {
            this(ByteString.EMPTY);
        }
    }

    public /* synthetic */ SubmitInvestmentEntitySelectionRequest(RequestContext requestContext, zzbs zzbsVar) {
        this(requestContext, zzbsVar, ByteString.EMPTY);
    }
}
