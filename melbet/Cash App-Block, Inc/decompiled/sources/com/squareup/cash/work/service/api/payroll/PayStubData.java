package com.squareup.cash.work.service.api.payroll;

import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/work/service/api/payroll/PayStubData;", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PayStubData {
    public final PayStubAttributes attributes;
    public final String id;

    /* renamed from: type, reason: collision with root package name */
    public final String f1219type;

    public PayStubData(String str, String str2, PayStubAttributes payStubAttributes) {
        this.id = str;
        this.f1219type = str2;
        this.attributes = payStubAttributes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayStubData)) {
            return false;
        }
        PayStubData payStubData = (PayStubData) obj;
        return this.id.equals(payStubData.id) && this.f1219type.equals(payStubData.f1219type) && this.attributes.equals(payStubData.attributes);
    }

    public final int hashCode() {
        return this.attributes.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.f1219type);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PayStubData(id=", this.id, ", type=", this.f1219type, ", attributes=");
        m.append(this.attributes);
        m.append(")");
        return m.toString();
    }
}
