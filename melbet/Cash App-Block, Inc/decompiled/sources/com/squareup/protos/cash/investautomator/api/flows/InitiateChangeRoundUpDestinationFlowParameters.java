package com.squareup.protos.cash.investautomator.api.flows;

import android.os.Parcelable;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.plasma.common.CallContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InitiateChangeRoundUpDestinationFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateChangeRoundUpDestinationFlowParameters> CREATOR;
    public final Automation automation;
    public final CallContext call_context;

    static {
        InitiateChangeRoundUpDestinationFlowParameters$Companion$ADAPTER$1 initiateChangeRoundUpDestinationFlowParameters$Companion$ADAPTER$1 = new InitiateChangeRoundUpDestinationFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InitiateChangeRoundUpDestinationFlowParameters.class), "type.googleapis.com/squareup.cash.investautomator.api.flows.InitiateChangeRoundUpDestinationFlowParameters", Syntax.PROTO_2, null, "squareup/cash/investautomator/api/flows/initiateChangeRoundUpDestinationFlow.proto");
        ADAPTER = initiateChangeRoundUpDestinationFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(initiateChangeRoundUpDestinationFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateChangeRoundUpDestinationFlowParameters(CallContext callContext, Automation automation, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.call_context = callContext;
        this.automation = automation;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateChangeRoundUpDestinationFlowParameters)) {
            return false;
        }
        InitiateChangeRoundUpDestinationFlowParameters initiateChangeRoundUpDestinationFlowParameters = (InitiateChangeRoundUpDestinationFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), initiateChangeRoundUpDestinationFlowParameters.unknownFields()) && Intrinsics.areEqual(this.call_context, initiateChangeRoundUpDestinationFlowParameters.call_context) && Intrinsics.areEqual(this.automation, initiateChangeRoundUpDestinationFlowParameters.automation);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CallContext callContext = this.call_context;
        int hashCode2 = (hashCode + (callContext != null ? callContext.hashCode() : 0)) * 37;
        Automation automation = this.automation;
        int hashCode3 = hashCode2 + (automation != null ? automation.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(6);
        builder.card_type = this.call_context;
        builder.card_pii = this.automation;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CallContext callContext = this.call_context;
        if (callContext != null) {
            arrayList.add("call_context=" + callContext);
        }
        Automation automation = this.automation;
        if (automation != null) {
            arrayList.add("automation=" + automation);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiateChangeRoundUpDestinationFlowParameters{", "}", 0, null, null, 56);
    }
}
