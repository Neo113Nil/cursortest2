package com.squareup.cash.work.service.api.passcode;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/squareup/cash/work/service/api/passcode/GetPasscodeRequest;", "", "", "employeeToken", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/squareup/cash/work/service/api/passcode/GetPasscodeRequest;", "Ljava/lang/String;", "getEmployeeToken", "()Ljava/lang/String;", "getEmployeeToken$annotations", "()V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GetPasscodeRequest {
    public final String employeeToken;

    public GetPasscodeRequest(@Json(name = "employee_token") String str) {
        str.getClass();
        this.employeeToken = str;
    }

    @Json(name = "employee_token")
    public static /* synthetic */ void getEmployeeToken$annotations() {
    }

    public final GetPasscodeRequest copy(@Json(name = "employee_token") String employeeToken) {
        employeeToken.getClass();
        return new GetPasscodeRequest(employeeToken);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPasscodeRequest) && Intrinsics.areEqual(this.employeeToken, ((GetPasscodeRequest) obj).employeeToken);
    }

    public final int hashCode() {
        return this.employeeToken.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GetPasscodeRequest(employeeToken=", this.employeeToken, ")");
    }
}
