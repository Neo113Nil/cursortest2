package com.squareup.protos.payroll.service;

import com.squareup.protos.payroll.service.GetEmployeePayrollOverviewRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class GetEmployeePayrollOverviewRequest$APIVersion$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetEmployeePayrollOverviewRequest.APIVersion.Companion.getClass();
        if (i == 1) {
            return GetEmployeePayrollOverviewRequest.APIVersion.V1;
        }
        if (i != 2) {
            return null;
        }
        return GetEmployeePayrollOverviewRequest.APIVersion.V2;
    }
}
