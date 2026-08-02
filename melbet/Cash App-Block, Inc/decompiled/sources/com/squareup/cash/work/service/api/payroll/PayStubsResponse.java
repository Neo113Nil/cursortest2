package com.squareup.cash.work.service.api.payroll;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/work/service/api/payroll/PayStubsResponse;", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PayStubsResponse {
    public final List data;

    public PayStubsResponse(List list) {
        this.data = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PayStubsResponse) && this.data.equals(((PayStubsResponse) obj).data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("PayStubsResponse(data=", ")", this.data);
    }
}
