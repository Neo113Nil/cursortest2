package com.squareup.protos.timecards;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.giftly.app.GiftCardCategory;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.time.DateTimeInterval;
import com.squareup.protos.employeejobs.Job;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.protos.franklin.common.BalanceImpact;
import com.squareup.protos.timecards.scheduling.Shift;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.paychecks.Deduction;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/timecards/OvertimeReportByTimecardForEmployeeResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/giftly/app/GiftCardCategory$Builder;", "Builder", "ByEmployee", "ByTimecard", "BySalary", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OvertimeReportByTimecardForEmployeeResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OvertimeReportByTimecardForEmployeeResponse> CREATOR;
    public final List by_employees;
    public final String cursor;
    public final String next_cursor;

    /* loaded from: classes8.dex */
    public final class ByEmployee extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ByEmployee> CREATOR;
        public final Money average_wage;
        public final List by_salaries;
        public final List by_timecards;
        public final String employee_token;
        public final List labor_calculation_summaries_by_workweek;
        public final PaidBreakOverageConversionSummary paid_break_overage_conversion_summary;
        public final Money total_declared_tips;
        public final Money total_tips;
        public final Money total_transaction_tips;

        static {
            OvertimeReportByTimecardForEmployeeResponse$ByEmployee$Companion$ADAPTER$1 overtimeReportByTimecardForEmployeeResponse$ByEmployee$Companion$ADAPTER$1 = new OvertimeReportByTimecardForEmployeeResponse$ByEmployee$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ByEmployee.class), "type.googleapis.com/squareup.timecards.OvertimeReportByTimecardForEmployeeResponse.ByEmployee", Syntax.PROTO_2, null, "squareup/timecards/service.proto");
            ADAPTER = overtimeReportByTimecardForEmployeeResponse$ByEmployee$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(overtimeReportByTimecardForEmployeeResponse$ByEmployee$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ByEmployee(String str, List list, List list2, PaidBreakOverageConversionSummary paidBreakOverageConversionSummary, Money money, Money money2, Money money3, List list3, Money money4, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
            this.employee_token = str;
            this.paid_break_overage_conversion_summary = paidBreakOverageConversionSummary;
            this.total_tips = money;
            this.total_transaction_tips = money2;
            this.total_declared_tips = money3;
            this.average_wage = money4;
            this.labor_calculation_summaries_by_workweek = TransactorKt.immutableCopyOf("labor_calculation_summaries_by_workweek", list);
            this.by_timecards = TransactorKt.immutableCopyOf("by_timecards", list2);
            this.by_salaries = TransactorKt.immutableCopyOf("by_salaries", list3);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByEmployee)) {
                return false;
            }
            ByEmployee byEmployee = (ByEmployee) obj;
            return Intrinsics.areEqual(unknownFields(), byEmployee.unknownFields()) && Intrinsics.areEqual(this.employee_token, byEmployee.employee_token) && Intrinsics.areEqual(this.labor_calculation_summaries_by_workweek, byEmployee.labor_calculation_summaries_by_workweek) && Intrinsics.areEqual(this.by_timecards, byEmployee.by_timecards) && Intrinsics.areEqual(this.paid_break_overage_conversion_summary, byEmployee.paid_break_overage_conversion_summary) && Intrinsics.areEqual(this.total_tips, byEmployee.total_tips) && Intrinsics.areEqual(this.total_transaction_tips, byEmployee.total_transaction_tips) && Intrinsics.areEqual(this.total_declared_tips, byEmployee.total_declared_tips) && Intrinsics.areEqual(this.by_salaries, byEmployee.by_salaries) && Intrinsics.areEqual(this.average_wage, byEmployee.average_wage);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.employee_token;
            int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.labor_calculation_summaries_by_workweek), 37, this.by_timecards);
            PaidBreakOverageConversionSummary paidBreakOverageConversionSummary = this.paid_break_overage_conversion_summary;
            int hashCode2 = (m + (paidBreakOverageConversionSummary != null ? paidBreakOverageConversionSummary.hashCode() : 0)) * 37;
            Money money = this.total_tips;
            int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.total_transaction_tips;
            int hashCode4 = (hashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
            Money money3 = this.total_declared_tips;
            int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (money3 != null ? money3.hashCode() : 0)) * 37, 37, this.by_salaries);
            Money money4 = this.average_wage;
            int hashCode5 = m2 + (money4 != null ? money4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Transfer.Builder builder = new Transfer.Builder(16, false);
            builder.token = this.employee_token;
            builder.source = this.labor_calculation_summaries_by_workweek;
            builder.target = this.by_timecards;
            builder.state = this.paid_break_overage_conversion_summary;
            builder.amount = this.total_tips;
            builder.push_amount = this.total_transaction_tips;
            builder.created_at = this.total_declared_tips;
            builder.completed_at = this.by_salaries;
            builder.failed_at = this.average_wage;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.employee_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "employee_token=", arrayList);
            }
            List list = this.labor_calculation_summaries_by_workweek;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("labor_calculation_summaries_by_workweek=", arrayList, list);
            }
            List list2 = this.by_timecards;
            if (!list2.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("by_timecards=", arrayList, list2);
            }
            PaidBreakOverageConversionSummary paidBreakOverageConversionSummary = this.paid_break_overage_conversion_summary;
            if (paidBreakOverageConversionSummary != null) {
                arrayList.add("paid_break_overage_conversion_summary=" + paidBreakOverageConversionSummary);
            }
            Money money = this.total_tips;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("total_tips=", money, arrayList);
            }
            Money money2 = this.total_transaction_tips;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("total_transaction_tips=", money2, arrayList);
            }
            Money money3 = this.total_declared_tips;
            if (money3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("total_declared_tips=", money3, arrayList);
            }
            List list3 = this.by_salaries;
            if (!list3.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("by_salaries=", arrayList, list3);
            }
            Money money4 = this.average_wage;
            if (money4 != null) {
                Matcher$$ExternalSyntheticOutline0.m("average_wage=", money4, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ByEmployee{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes8.dex */
    public final class BySalary extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BySalary> CREATOR;
        public final CalculationTotal calculation_total;
        public final EmployeeJobInfo employee_job_info;
        public final LaborCostTotal labor_cost;
        public final Boolean override_timecards;

        static {
            OvertimeReportByTimecardForEmployeeResponse$BySalary$Companion$ADAPTER$1 overtimeReportByTimecardForEmployeeResponse$BySalary$Companion$ADAPTER$1 = new OvertimeReportByTimecardForEmployeeResponse$BySalary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BySalary.class), "type.googleapis.com/squareup.timecards.OvertimeReportByTimecardForEmployeeResponse.BySalary", Syntax.PROTO_2, null, "squareup/timecards/service.proto");
            ADAPTER = overtimeReportByTimecardForEmployeeResponse$BySalary$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(overtimeReportByTimecardForEmployeeResponse$BySalary$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BySalary(CalculationTotal calculationTotal, Boolean bool, LaborCostTotal laborCostTotal, EmployeeJobInfo employeeJobInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.calculation_total = calculationTotal;
            this.override_timecards = bool;
            this.labor_cost = laborCostTotal;
            this.employee_job_info = employeeJobInfo;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BySalary)) {
                return false;
            }
            BySalary bySalary = (BySalary) obj;
            return Intrinsics.areEqual(unknownFields(), bySalary.unknownFields()) && Intrinsics.areEqual(this.calculation_total, bySalary.calculation_total) && Intrinsics.areEqual(this.override_timecards, bySalary.override_timecards) && Intrinsics.areEqual(this.labor_cost, bySalary.labor_cost) && Intrinsics.areEqual(this.employee_job_info, bySalary.employee_job_info);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CalculationTotal calculationTotal = this.calculation_total;
            int hashCode2 = (hashCode + (calculationTotal != null ? calculationTotal.hashCode() : 0)) * 37;
            Boolean bool = this.override_timecards;
            int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            LaborCostTotal laborCostTotal = this.labor_cost;
            int hashCode4 = (hashCode3 + (laborCostTotal != null ? laborCostTotal.hashCode() : 0)) * 37;
            EmployeeJobInfo employeeJobInfo = this.employee_job_info;
            int hashCode5 = hashCode4 + (employeeJobInfo != null ? employeeJobInfo.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Deduction.Builder builder = new Deduction.Builder(4);
            builder.amount = this.calculation_total;
            builder.description = this.override_timecards;
            builder.note = this.labor_cost;
            builder.tint_color = this.employee_job_info;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            CalculationTotal calculationTotal = this.calculation_total;
            if (calculationTotal != null) {
                arrayList.add("calculation_total=" + calculationTotal);
            }
            Boolean bool = this.override_timecards;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("override_timecards=", bool, arrayList);
            }
            LaborCostTotal laborCostTotal = this.labor_cost;
            if (laborCostTotal != null) {
                arrayList.add("labor_cost=" + laborCostTotal);
            }
            EmployeeJobInfo employeeJobInfo = this.employee_job_info;
            if (employeeJobInfo != null) {
                arrayList.add("employee_job_info=" + employeeJobInfo);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BySalary{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes8.dex */
    public final class ByTimecard extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ByTimecard> CREATOR;
        public final DateTimeInterval calculated_zoned_date_time_range;
        public final CalculationTotal calculation_total;
        public final List converted_paid_break_overages;
        public final Money declared_tips;
        public final LaborCostTotal labor_cost;
        public final List overtime_rules;
        public final Shift shift;
        public final Timecard timecard;
        public final List timecard_breaks;
        public final Money tips;
        public final Money transaction_tips;

        public final class ConvertedPaidBreakOverage extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ConvertedPaidBreakOverage> CREATOR;
            public final String break_id;
            public final Money labor_cost_saved;

            static {
                OvertimeReportByTimecardForEmployeeResponse$ByTimecard$ConvertedPaidBreakOverage$Companion$ADAPTER$1 overtimeReportByTimecardForEmployeeResponse$ByTimecard$ConvertedPaidBreakOverage$Companion$ADAPTER$1 = new OvertimeReportByTimecardForEmployeeResponse$ByTimecard$ConvertedPaidBreakOverage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ConvertedPaidBreakOverage.class), "type.googleapis.com/squareup.timecards.OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ConvertedPaidBreakOverage", Syntax.PROTO_2, null, "squareup/timecards/service.proto");
                ADAPTER = overtimeReportByTimecardForEmployeeResponse$ByTimecard$ConvertedPaidBreakOverage$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(overtimeReportByTimecardForEmployeeResponse$ByTimecard$ConvertedPaidBreakOverage$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConvertedPaidBreakOverage(Money money, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.break_id = str;
                this.labor_cost_saved = money;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ConvertedPaidBreakOverage)) {
                    return false;
                }
                ConvertedPaidBreakOverage convertedPaidBreakOverage = (ConvertedPaidBreakOverage) obj;
                return Intrinsics.areEqual(unknownFields(), convertedPaidBreakOverage.unknownFields()) && Intrinsics.areEqual(this.break_id, convertedPaidBreakOverage.break_id) && Intrinsics.areEqual(this.labor_cost_saved, convertedPaidBreakOverage.labor_cost_saved);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.break_id;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Money money = this.labor_cost_saved;
                int hashCode3 = hashCode2 + (money != null ? money.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                BalanceImpact.Builder builder = new BalanceImpact.Builder(7);
                builder.balance_name = this.break_id;
                builder.amount = this.labor_cost_saved;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.break_id;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "break_id=", arrayList);
                }
                Money money = this.labor_cost_saved;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("labor_cost_saved=", money, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ConvertedPaidBreakOverage{", "}", 0, null, null, 56);
            }
        }

        static {
            OvertimeReportByTimecardForEmployeeResponse$ByTimecard$Companion$ADAPTER$1 overtimeReportByTimecardForEmployeeResponse$ByTimecard$Companion$ADAPTER$1 = new OvertimeReportByTimecardForEmployeeResponse$ByTimecard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ByTimecard.class), "type.googleapis.com/squareup.timecards.OvertimeReportByTimecardForEmployeeResponse.ByTimecard", Syntax.PROTO_2, null, "squareup/timecards/service.proto");
            ADAPTER = overtimeReportByTimecardForEmployeeResponse$ByTimecard$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(overtimeReportByTimecardForEmployeeResponse$ByTimecard$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ByTimecard(DateTimeInterval dateTimeInterval, CalculationTotal calculationTotal, Timecard timecard, LaborCostTotal laborCostTotal, List list, List list2, Shift shift, List list3, Money money, Money money2, Money money3, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
            this.calculated_zoned_date_time_range = dateTimeInterval;
            this.calculation_total = calculationTotal;
            this.timecard = timecard;
            this.labor_cost = laborCostTotal;
            this.shift = shift;
            this.tips = money;
            this.declared_tips = money2;
            this.transaction_tips = money3;
            this.overtime_rules = TransactorKt.immutableCopyOf("overtime_rules", list);
            this.timecard_breaks = TransactorKt.immutableCopyOf("timecard_breaks", list2);
            this.converted_paid_break_overages = TransactorKt.immutableCopyOf("converted_paid_break_overages", list3);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByTimecard)) {
                return false;
            }
            ByTimecard byTimecard = (ByTimecard) obj;
            return Intrinsics.areEqual(unknownFields(), byTimecard.unknownFields()) && Intrinsics.areEqual(this.calculated_zoned_date_time_range, byTimecard.calculated_zoned_date_time_range) && Intrinsics.areEqual(this.calculation_total, byTimecard.calculation_total) && Intrinsics.areEqual(this.timecard, byTimecard.timecard) && Intrinsics.areEqual(this.labor_cost, byTimecard.labor_cost) && Intrinsics.areEqual(this.overtime_rules, byTimecard.overtime_rules) && Intrinsics.areEqual(this.timecard_breaks, byTimecard.timecard_breaks) && Intrinsics.areEqual(this.shift, byTimecard.shift) && Intrinsics.areEqual(this.converted_paid_break_overages, byTimecard.converted_paid_break_overages) && Intrinsics.areEqual(this.tips, byTimecard.tips) && Intrinsics.areEqual(this.declared_tips, byTimecard.declared_tips) && Intrinsics.areEqual(this.transaction_tips, byTimecard.transaction_tips);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            DateTimeInterval dateTimeInterval = this.calculated_zoned_date_time_range;
            int hashCode2 = (hashCode + (dateTimeInterval != null ? dateTimeInterval.hashCode() : 0)) * 37;
            CalculationTotal calculationTotal = this.calculation_total;
            int hashCode3 = (hashCode2 + (calculationTotal != null ? calculationTotal.hashCode() : 0)) * 37;
            Timecard timecard = this.timecard;
            int hashCode4 = (hashCode3 + (timecard != null ? timecard.hashCode() : 0)) * 37;
            LaborCostTotal laborCostTotal = this.labor_cost;
            int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (laborCostTotal != null ? laborCostTotal.hashCode() : 0)) * 37, 37, this.overtime_rules), 37, this.timecard_breaks);
            Shift shift = this.shift;
            int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (shift != null ? shift.hashCode() : 0)) * 37, 37, this.converted_paid_break_overages);
            Money money = this.tips;
            int hashCode5 = (m2 + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.declared_tips;
            int hashCode6 = (hashCode5 + (money2 != null ? money2.hashCode() : 0)) * 37;
            Money money3 = this.transaction_tips;
            int hashCode7 = hashCode6 + (money3 != null ? money3.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Job.Builder builder = new Job.Builder(19);
            builder.token = this.calculated_zoned_date_time_range;
            builder.merchant_token = this.calculation_total;
            builder.title = this.timecard;
            builder.default_wage = this.labor_cost;
            builder.created_at_timestamp_ms = this.overtime_rules;
            builder.updated_at_timestamp_ms = this.timecard_breaks;
            builder.deleted_at_timestamp_ms = this.shift;
            builder.team_member_count = this.converted_paid_break_overages;
            builder.version = this.tips;
            builder.tip_eligible = this.declared_tips;
            builder.default_color_scheme = this.transaction_tips;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            DateTimeInterval dateTimeInterval = this.calculated_zoned_date_time_range;
            if (dateTimeInterval != null) {
                arrayList.add("calculated_zoned_date_time_range=" + dateTimeInterval);
            }
            CalculationTotal calculationTotal = this.calculation_total;
            if (calculationTotal != null) {
                arrayList.add("calculation_total=" + calculationTotal);
            }
            Timecard timecard = this.timecard;
            if (timecard != null) {
                arrayList.add("timecard=" + timecard);
            }
            LaborCostTotal laborCostTotal = this.labor_cost;
            if (laborCostTotal != null) {
                arrayList.add("labor_cost=" + laborCostTotal);
            }
            List list = this.overtime_rules;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("overtime_rules=", arrayList, list);
            }
            List list2 = this.timecard_breaks;
            if (!list2.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("timecard_breaks=", arrayList, list2);
            }
            Shift shift = this.shift;
            if (shift != null) {
                arrayList.add("shift=" + shift);
            }
            List list3 = this.converted_paid_break_overages;
            if (!list3.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("converted_paid_break_overages=", arrayList, list3);
            }
            Money money = this.tips;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("tips=", money, arrayList);
            }
            Money money2 = this.declared_tips;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("declared_tips=", money2, arrayList);
            }
            Money money3 = this.transaction_tips;
            if (money3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("transaction_tips=", money3, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ByTimecard{", "}", 0, null, null, 56);
        }
    }

    static {
        OvertimeReportByTimecardForEmployeeResponse$Companion$ADAPTER$1 overtimeReportByTimecardForEmployeeResponse$Companion$ADAPTER$1 = new OvertimeReportByTimecardForEmployeeResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OvertimeReportByTimecardForEmployeeResponse.class), "type.googleapis.com/squareup.timecards.OvertimeReportByTimecardForEmployeeResponse", Syntax.PROTO_2, null, "squareup/timecards/service.proto");
        ADAPTER = overtimeReportByTimecardForEmployeeResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(overtimeReportByTimecardForEmployeeResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OvertimeReportByTimecardForEmployeeResponse(List list, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.next_cursor = str;
        this.cursor = str2;
        this.by_employees = TransactorKt.immutableCopyOf("by_employees", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OvertimeReportByTimecardForEmployeeResponse)) {
            return false;
        }
        OvertimeReportByTimecardForEmployeeResponse overtimeReportByTimecardForEmployeeResponse = (OvertimeReportByTimecardForEmployeeResponse) obj;
        return Intrinsics.areEqual(unknownFields(), overtimeReportByTimecardForEmployeeResponse.unknownFields()) && Intrinsics.areEqual(this.by_employees, overtimeReportByTimecardForEmployeeResponse.by_employees) && Intrinsics.areEqual(this.next_cursor, overtimeReportByTimecardForEmployeeResponse.next_cursor) && Intrinsics.areEqual(this.cursor, overtimeReportByTimecardForEmployeeResponse.cursor);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.by_employees);
        String str = this.next_cursor;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cursor;
        int hashCode2 = hashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCardCategory.Builder builder = new GiftCardCategory.Builder(6, false);
        builder.gift_card_type_tokens = this.by_employees;
        builder.token = this.next_cursor;
        builder.name = this.cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.by_employees;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("by_employees=", arrayList, list);
        }
        String str = this.next_cursor;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "next_cursor=", arrayList);
        }
        String str2 = this.cursor;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "cursor=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OvertimeReportByTimecardForEmployeeResponse{", "}", 0, null, null, 56);
    }
}
