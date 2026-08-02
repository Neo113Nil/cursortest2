package com.squareup.cash.work.service.api.taxforms;

import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/work/service/api/taxforms/TaxFormJsonData;", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TaxFormJsonData {
    public final TaxFormAttributes attributes;
    public final String id;

    /* renamed from: type, reason: collision with root package name */
    public final String f1220type;

    public TaxFormJsonData(String str, String str2, TaxFormAttributes taxFormAttributes) {
        this.id = str;
        this.f1220type = str2;
        this.attributes = taxFormAttributes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxFormJsonData)) {
            return false;
        }
        TaxFormJsonData taxFormJsonData = (TaxFormJsonData) obj;
        return this.id.equals(taxFormJsonData.id) && this.f1220type.equals(taxFormJsonData.f1220type) && this.attributes.equals(taxFormJsonData.attributes);
    }

    public final int hashCode() {
        return this.attributes.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.f1220type);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TaxFormJsonData(id=", this.id, ", type=", this.f1220type, ", attributes=");
        m.append(this.attributes);
        m.append(")");
        return m.toString();
    }
}
