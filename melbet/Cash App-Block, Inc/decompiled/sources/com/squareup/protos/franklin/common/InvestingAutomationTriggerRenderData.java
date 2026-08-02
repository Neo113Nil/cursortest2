package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InvestingAutomationTriggerRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvestingAutomationTriggerRenderData> CREATOR;
    public final Boolean automation_activated;
    public final Money contributed_execution_amount;
    public final ExecutionFailureReason execution_failure_reason;
    public final String execution_token;
    public final InvestingAutomationFeature feature;

    public enum ExecutionFailureReason implements WireEnum {
        GENERIC(1),
        INSUFFICIENT_FUNDS(2);

        public final int value;
        public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
        public static final InvestingAutomationTriggerRenderData$ExecutionFailureReason$Companion$ADAPTER$1 ADAPTER = new InvestingAutomationTriggerRenderData$ExecutionFailureReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ExecutionFailureReason.class), Syntax.PROTO_2, null);

        ExecutionFailureReason(int i) {
            this.value = i;
        }

        public static final ExecutionFailureReason fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return GENERIC;
            }
            if (i != 2) {
                return null;
            }
            return INSUFFICIENT_FUNDS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        KeyScope.Companion companion = InvestingAutomationFeature.Companion;
        InvestingAutomationTriggerRenderData$Companion$ADAPTER$1 investingAutomationTriggerRenderData$Companion$ADAPTER$1 = new InvestingAutomationTriggerRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InvestingAutomationTriggerRenderData.class), "type.googleapis.com/squareup.franklin.InvestingAutomationTriggerRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = investingAutomationTriggerRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(investingAutomationTriggerRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingAutomationTriggerRenderData(String str, Money money, ExecutionFailureReason executionFailureReason, Boolean bool, InvestingAutomationFeature investingAutomationFeature, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.execution_token = str;
        this.contributed_execution_amount = money;
        this.execution_failure_reason = executionFailureReason;
        this.automation_activated = bool;
        this.feature = investingAutomationFeature;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvestingAutomationTriggerRenderData)) {
            return false;
        }
        InvestingAutomationTriggerRenderData investingAutomationTriggerRenderData = (InvestingAutomationTriggerRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), investingAutomationTriggerRenderData.unknownFields()) && Intrinsics.areEqual(this.execution_token, investingAutomationTriggerRenderData.execution_token) && Intrinsics.areEqual(this.contributed_execution_amount, investingAutomationTriggerRenderData.contributed_execution_amount) && this.execution_failure_reason == investingAutomationTriggerRenderData.execution_failure_reason && Intrinsics.areEqual(this.automation_activated, investingAutomationTriggerRenderData.automation_activated) && this.feature == investingAutomationTriggerRenderData.feature;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.execution_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.contributed_execution_amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        ExecutionFailureReason executionFailureReason = this.execution_failure_reason;
        int hashCode4 = (hashCode3 + (executionFailureReason != null ? executionFailureReason.hashCode() : 0)) * 37;
        Boolean bool = this.automation_activated;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        InvestingAutomationFeature investingAutomationFeature = this.feature;
        int hashCode6 = hashCode5 + (investingAutomationFeature != null ? investingAutomationFeature.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileAlias.Builder builder = new ProfileAlias.Builder(8, false);
        builder.alias = this.execution_token;
        builder.expires_at = this.contributed_execution_amount;
        builder.version = this.execution_failure_reason;
        builder.verified = this.automation_activated;
        builder.display_date = this.feature;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.execution_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "execution_token=", arrayList);
        }
        Money money = this.contributed_execution_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("contributed_execution_amount=", money, arrayList);
        }
        ExecutionFailureReason executionFailureReason = this.execution_failure_reason;
        if (executionFailureReason != null) {
            arrayList.add("execution_failure_reason=" + executionFailureReason);
        }
        Boolean bool = this.automation_activated;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("automation_activated=", bool, arrayList);
        }
        InvestingAutomationFeature investingAutomationFeature = this.feature;
        if (investingAutomationFeature != null) {
            arrayList.add("feature=" + investingAutomationFeature);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestingAutomationTriggerRenderData{", "}", 0, null, null, 56);
    }
}
