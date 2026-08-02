package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.earnings.EarningsYearToDate;

/* loaded from: classes8.dex */
public final class InvestingAutomationExecutionRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvestingAutomationExecutionRenderData> CREATOR;
    public final String cancel_deep_link;
    public final InvestingAutomationFeature feature;
    public final PaycheckAllocationMetadata paycheckAllocation;
    public final Money total_contributed_execution_amount;
    public final List trigger_event_tokens;

    public final class PaycheckAllocationMetadata extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PaycheckAllocationMetadata> CREATOR;
        public final Integer percentage;

        static {
            InvestingAutomationExecutionRenderData$PaycheckAllocationMetadata$Companion$ADAPTER$1 investingAutomationExecutionRenderData$PaycheckAllocationMetadata$Companion$ADAPTER$1 = new InvestingAutomationExecutionRenderData$PaycheckAllocationMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaycheckAllocationMetadata.class), "type.googleapis.com/squareup.franklin.InvestingAutomationExecutionRenderData.PaycheckAllocationMetadata", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = investingAutomationExecutionRenderData$PaycheckAllocationMetadata$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(investingAutomationExecutionRenderData$PaycheckAllocationMetadata$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaycheckAllocationMetadata(Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.percentage = num;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PaycheckAllocationMetadata)) {
                return false;
            }
            PaycheckAllocationMetadata paycheckAllocationMetadata = (PaycheckAllocationMetadata) obj;
            return Intrinsics.areEqual(unknownFields(), paycheckAllocationMetadata.unknownFields()) && Intrinsics.areEqual(this.percentage, paycheckAllocationMetadata.percentage);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.percentage;
            int hashCode2 = hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EarningsYearToDate.Builder builder = new EarningsYearToDate.Builder(6);
            builder.year = this.percentage;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.percentage;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("percentage=", num, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PaycheckAllocationMetadata{", "}", 0, null, null, 56);
        }
    }

    static {
        KeyScope.Companion companion = InvestingAutomationFeature.Companion;
        InvestingAutomationExecutionRenderData$Companion$ADAPTER$1 investingAutomationExecutionRenderData$Companion$ADAPTER$1 = new InvestingAutomationExecutionRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InvestingAutomationExecutionRenderData.class), "type.googleapis.com/squareup.franklin.InvestingAutomationExecutionRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = investingAutomationExecutionRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(investingAutomationExecutionRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingAutomationExecutionRenderData(List list, String str, InvestingAutomationFeature investingAutomationFeature, Money money, PaycheckAllocationMetadata paycheckAllocationMetadata, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.cancel_deep_link = str;
        this.feature = investingAutomationFeature;
        this.total_contributed_execution_amount = money;
        this.paycheckAllocation = paycheckAllocationMetadata;
        this.trigger_event_tokens = TransactorKt.immutableCopyOf("trigger_event_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvestingAutomationExecutionRenderData)) {
            return false;
        }
        InvestingAutomationExecutionRenderData investingAutomationExecutionRenderData = (InvestingAutomationExecutionRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), investingAutomationExecutionRenderData.unknownFields()) && Intrinsics.areEqual(this.trigger_event_tokens, investingAutomationExecutionRenderData.trigger_event_tokens) && Intrinsics.areEqual(this.cancel_deep_link, investingAutomationExecutionRenderData.cancel_deep_link) && this.feature == investingAutomationExecutionRenderData.feature && Intrinsics.areEqual(this.total_contributed_execution_amount, investingAutomationExecutionRenderData.total_contributed_execution_amount) && Intrinsics.areEqual(this.paycheckAllocation, investingAutomationExecutionRenderData.paycheckAllocation);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.trigger_event_tokens);
        String str = this.cancel_deep_link;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        InvestingAutomationFeature investingAutomationFeature = this.feature;
        int hashCode2 = (hashCode + (investingAutomationFeature != null ? investingAutomationFeature.hashCode() : 0)) * 37;
        Money money = this.total_contributed_execution_amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        PaycheckAllocationMetadata paycheckAllocationMetadata = this.paycheckAllocation;
        int hashCode4 = hashCode3 + (paycheckAllocationMetadata != null ? paycheckAllocationMetadata.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileAlias.Builder builder = new ProfileAlias.Builder(7, false);
        builder.alias = this.trigger_event_tokens;
        builder.verified = this.cancel_deep_link;
        builder.expires_at = this.feature;
        builder.version = this.total_contributed_execution_amount;
        builder.display_date = this.paycheckAllocation;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.trigger_event_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("trigger_event_tokens=", arrayList, list);
        }
        String str = this.cancel_deep_link;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cancel_deep_link=", arrayList);
        }
        InvestingAutomationFeature investingAutomationFeature = this.feature;
        if (investingAutomationFeature != null) {
            arrayList.add("feature=" + investingAutomationFeature);
        }
        Money money = this.total_contributed_execution_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_contributed_execution_amount=", money, arrayList);
        }
        PaycheckAllocationMetadata paycheckAllocationMetadata = this.paycheckAllocation;
        if (paycheckAllocationMetadata != null) {
            arrayList.add("paycheckAllocation=" + paycheckAllocationMetadata);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestingAutomationExecutionRenderData{", "}", 0, null, null, 56);
    }
}
