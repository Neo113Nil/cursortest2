package com.squareup.cash.work.service.api.payroll;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/service/api/payroll/PayStubAttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/service/api/payroll/PayStubAttributes;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PayStubAttributesJsonAdapter extends JsonAdapter {
    public final JsonAdapter booleanAdapter;
    public final JsonAdapter nullablePayStubMoneyAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public PayStubAttributesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("pay_date", "period_start", "period_end", "payout_pending", "net_pay");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "payDate");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "payoutPending");
        this.nullablePayStubMoneyAdapter = moshi.adapter(PayStubMoney.class, emptySet, "netPay");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        PayStubMoney payStubMoney = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            Boolean bool2 = bool;
            if (selectName != -1) {
                JsonAdapter jsonAdapter = this.stringAdapter;
                if (selectName == 0) {
                    str = (String) jsonAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("payDate", "pay_date", jsonReader);
                    }
                } else if (selectName == 1) {
                    str2 = (String) jsonAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("periodStart", "period_start", jsonReader);
                    }
                } else if (selectName == 2) {
                    str3 = (String) jsonAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("periodEnd", "period_end", jsonReader);
                    }
                } else if (selectName == 3) {
                    bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("payoutPending", "payout_pending", jsonReader);
                    }
                } else if (selectName == 4) {
                    payStubMoney = (PayStubMoney) this.nullablePayStubMoneyAdapter.fromJson(jsonReader);
                }
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
            bool = bool2;
        }
        Boolean bool3 = bool;
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("payDate", "pay_date", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("periodStart", "period_start", jsonReader);
        }
        if (str3 == null) {
            throw Util.missingProperty("periodEnd", "period_end", jsonReader);
        }
        if (bool3 != null) {
            return new PayStubAttributes(str, str2, str3, bool3.booleanValue(), payStubMoney);
        }
        throw Util.missingProperty("payoutPending", "payout_pending", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        PayStubAttributes payStubAttributes = (PayStubAttributes) obj;
        jsonWriter.getClass();
        if (payStubAttributes == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("pay_date");
        String str = payStubAttributes.payDate;
        JsonAdapter jsonAdapter = this.stringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("period_start");
        jsonAdapter.toJson(jsonWriter, payStubAttributes.periodStart);
        jsonWriter.name("period_end");
        jsonAdapter.toJson(jsonWriter, payStubAttributes.periodEnd);
        jsonWriter.name("payout_pending");
        this.booleanAdapter.toJson(jsonWriter, Boolean.valueOf(payStubAttributes.payoutPending));
        jsonWriter.name("net_pay");
        this.nullablePayStubMoneyAdapter.toJson(jsonWriter, payStubAttributes.netPay);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(39, "GeneratedJsonAdapter(PayStubAttributes)");
    }
}
