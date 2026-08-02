package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.YearlyData;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.common.Money;
import com.squareup.protos.rewardly.ui.AppLinks;
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

/* loaded from: classes8.dex */
public final class UiInvestingAutomation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiInvestingAutomation> CREATOR;
    public final Automation automation;
    public final UiAutomationStatistics statistics;

    public final class UiAutomationStatistics extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<UiAutomationStatistics> CREATOR;
        public final Integer number_of_executions;
        public final Money total_amount_invested;

        static {
            UiInvestingAutomation$UiAutomationStatistics$Companion$ADAPTER$1 uiInvestingAutomation$UiAutomationStatistics$Companion$ADAPTER$1 = new UiInvestingAutomation$UiAutomationStatistics$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiAutomationStatistics.class), "type.googleapis.com/squareup.franklin.ui.UiInvestingAutomation.UiAutomationStatistics", Syntax.PROTO_2, null, "squareup/franklin/ui/investing_automation.proto");
            ADAPTER = uiInvestingAutomation$UiAutomationStatistics$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(uiInvestingAutomation$UiAutomationStatistics$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UiAutomationStatistics(Money money, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.total_amount_invested = money;
            this.number_of_executions = num;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UiAutomationStatistics)) {
                return false;
            }
            UiAutomationStatistics uiAutomationStatistics = (UiAutomationStatistics) obj;
            return Intrinsics.areEqual(unknownFields(), uiAutomationStatistics.unknownFields()) && Intrinsics.areEqual(this.total_amount_invested, uiAutomationStatistics.total_amount_invested) && Intrinsics.areEqual(this.number_of_executions, uiAutomationStatistics.number_of_executions);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.total_amount_invested;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            Integer num = this.number_of_executions;
            int hashCode3 = hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            YearlyData.Builder builder = new YearlyData.Builder(3);
            builder.earnings = this.total_amount_invested;
            builder.year = this.number_of_executions;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.total_amount_invested;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("total_amount_invested=", money, arrayList);
            }
            Integer num = this.number_of_executions;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("number_of_executions=", num, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "UiAutomationStatistics{", "}", 0, null, null, 56);
        }
    }

    static {
        UiInvestingAutomation$Companion$ADAPTER$1 uiInvestingAutomation$Companion$ADAPTER$1 = new UiInvestingAutomation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiInvestingAutomation.class), "type.googleapis.com/squareup.franklin.ui.UiInvestingAutomation", Syntax.PROTO_2, null, "squareup/franklin/ui/investing_automation.proto");
        ADAPTER = uiInvestingAutomation$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiInvestingAutomation$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiInvestingAutomation(Automation automation, UiAutomationStatistics uiAutomationStatistics, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.automation = automation;
        this.statistics = uiAutomationStatistics;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiInvestingAutomation)) {
            return false;
        }
        UiInvestingAutomation uiInvestingAutomation = (UiInvestingAutomation) obj;
        return Intrinsics.areEqual(unknownFields(), uiInvestingAutomation.unknownFields()) && Intrinsics.areEqual(this.automation, uiInvestingAutomation.automation) && Intrinsics.areEqual(this.statistics, uiInvestingAutomation.statistics);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Automation automation = this.automation;
        int hashCode2 = (hashCode + (automation != null ? automation.hashCode() : 0)) * 37;
        UiAutomationStatistics uiAutomationStatistics = this.statistics;
        int hashCode3 = hashCode2 + (uiAutomationStatistics != null ? uiAutomationStatistics.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(3);
        builder.f1411android = this.automation;
        builder.ios = this.statistics;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Automation automation = this.automation;
        if (automation != null) {
            arrayList.add("automation=" + automation);
        }
        UiAutomationStatistics uiAutomationStatistics = this.statistics;
        if (uiAutomationStatistics != null) {
            arrayList.add("statistics=" + uiAutomationStatistics);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiInvestingAutomation{", "}", 0, null, null, 56);
    }
}
