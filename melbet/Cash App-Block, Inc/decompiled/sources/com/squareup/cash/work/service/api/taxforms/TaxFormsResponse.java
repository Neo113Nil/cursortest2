package com.squareup.cash.work.service.api.taxforms;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/work/service/api/taxforms/TaxFormsResponse;", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TaxFormsResponse {
    public final List data;

    public TaxFormsResponse(List list) {
        this.data = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TaxFormsResponse) && this.data.equals(((TaxFormsResponse) obj).data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("TaxFormsResponse(data=", ")", this.data);
    }
}
