package com.squareup.protos.cash.investautomator.api.flows;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.Group;
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
public final class InitiateRoundUpOnboardingFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateRoundUpOnboardingFlowParameters> CREATOR;
    public final Automation automation;
    public final CallContext call_context;
    public final Boolean end_flow;

    static {
        InitiateRoundUpOnboardingFlowParameters$Companion$ADAPTER$1 initiateRoundUpOnboardingFlowParameters$Companion$ADAPTER$1 = new InitiateRoundUpOnboardingFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InitiateRoundUpOnboardingFlowParameters.class), "type.googleapis.com/squareup.cash.investautomator.api.flows.InitiateRoundUpOnboardingFlowParameters", Syntax.PROTO_2, null, "squareup/cash/investautomator/api/flows/initiateRoundUpOnboardingFlow.proto");
        ADAPTER = initiateRoundUpOnboardingFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(initiateRoundUpOnboardingFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateRoundUpOnboardingFlowParameters(CallContext callContext, Automation automation, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.call_context = callContext;
        this.automation = automation;
        this.end_flow = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateRoundUpOnboardingFlowParameters)) {
            return false;
        }
        InitiateRoundUpOnboardingFlowParameters initiateRoundUpOnboardingFlowParameters = (InitiateRoundUpOnboardingFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), initiateRoundUpOnboardingFlowParameters.unknownFields()) && Intrinsics.areEqual(this.call_context, initiateRoundUpOnboardingFlowParameters.call_context) && Intrinsics.areEqual(this.automation, initiateRoundUpOnboardingFlowParameters.automation) && Intrinsics.areEqual(this.end_flow, initiateRoundUpOnboardingFlowParameters.end_flow);
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
        int hashCode3 = (hashCode2 + (automation != null ? automation.hashCode() : 0)) * 37;
        Boolean bool = this.end_flow;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(1);
        builder.name = this.call_context;
        builder.group_image = this.automation;
        builder.participants = this.end_flow;
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
        Boolean bool = this.end_flow;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("end_flow=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiateRoundUpOnboardingFlowParameters{", "}", 0, null, null, 56);
    }
}
