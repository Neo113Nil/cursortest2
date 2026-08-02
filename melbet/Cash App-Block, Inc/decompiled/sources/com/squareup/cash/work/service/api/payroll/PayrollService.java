package com.squareup.cash.work.service.api.payroll;

import app.cash.api.ApiResult;
import com.squareup.protos.payroll.service.GetEmployeeAccessDetailsRequest;
import com.squareup.protos.payroll.service.GetEmployeeAccessDetailsResponse;
import com.squareup.protos.payroll.service.GetEmployeePayrollOverviewRequest;
import com.squareup.protos.payroll.service.GetEmployeePayrollOverviewResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/squareup/cash/work/service/api/payroll/PayrollService;", "", "getEmployeeAccessDetails", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/payroll/service/GetEmployeeAccessDetailsResponse;", "request", "Lcom/squareup/protos/payroll/service/GetEmployeeAccessDetailsRequest;", "(Lcom/squareup/protos/payroll/service/GetEmployeeAccessDetailsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmployeePayrollOverview", "Lcom/squareup/protos/payroll/service/GetEmployeePayrollOverviewResponse;", "Lcom/squareup/protos/payroll/service/GetEmployeePayrollOverviewRequest;", "(Lcom/squareup/protos/payroll/service/GetEmployeePayrollOverviewRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PayrollService {
    @POST("/proxy/services/squareup.payroll.service.PublicPayrollService/GetEmployeeAccessDetails")
    Object getEmployeeAccessDetails(@Body GetEmployeeAccessDetailsRequest getEmployeeAccessDetailsRequest, Continuation<? super ApiResult<GetEmployeeAccessDetailsResponse>> continuation);

    @POST("/proxy/services/squareup.payroll.service.PublicPayrollService/GetEmployeePayrollOverview")
    Object getEmployeePayrollOverview(@Body GetEmployeePayrollOverviewRequest getEmployeePayrollOverviewRequest, Continuation<? super ApiResult<GetEmployeePayrollOverviewResponse>> continuation);
}
