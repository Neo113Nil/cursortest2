package com.squareup.cash.work.data.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.protos.payroll.service.GetEmployeePayrollOverviewResponse;
import com.squareup.protos.timecards.GetShiftsOverviewResponse;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PayData {
    public final boolean canUseDirectDeposit;
    public final boolean hasPayrollFeatures;
    public final List pastPayStubs;
    public final GetEmployeePayrollOverviewResponse payrollOverview;
    public final GetShiftsOverviewResponse shiftsOverview;

    public PayData(GetShiftsOverviewResponse getShiftsOverviewResponse, GetEmployeePayrollOverviewResponse getEmployeePayrollOverviewResponse, List list, boolean z, boolean z2) {
        getShiftsOverviewResponse.getClass();
        getEmployeePayrollOverviewResponse.getClass();
        list.getClass();
        this.shiftsOverview = getShiftsOverviewResponse;
        this.payrollOverview = getEmployeePayrollOverviewResponse;
        this.pastPayStubs = list;
        this.canUseDirectDeposit = z;
        this.hasPayrollFeatures = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayData)) {
            return false;
        }
        PayData payData = (PayData) obj;
        return Intrinsics.areEqual(this.shiftsOverview, payData.shiftsOverview) && Intrinsics.areEqual(this.payrollOverview, payData.payrollOverview) && Intrinsics.areEqual(this.pastPayStubs, payData.pastPayStubs) && this.canUseDirectDeposit == payData.canUseDirectDeposit && this.hasPayrollFeatures == payData.hasPayrollFeatures;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.hasPayrollFeatures) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((this.payrollOverview.hashCode() + (this.shiftsOverview.hashCode() * 31)) * 31, 31, this.pastPayStubs), 31, this.canUseDirectDeposit);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PayData(shiftsOverview=");
        sb.append(this.shiftsOverview);
        sb.append(", payrollOverview=");
        sb.append(this.payrollOverview);
        sb.append(", pastPayStubs=");
        sb.append(this.pastPayStubs);
        sb.append(", canUseDirectDeposit=");
        sb.append(this.canUseDirectDeposit);
        sb.append(", hasPayrollFeatures=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.hasPayrollFeatures, ")");
    }
}
