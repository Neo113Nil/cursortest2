package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.network.dto.InquiryFieldMap;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_SessionIdRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FallbackModeService_SessionIdRequestJsonAdapter extends JsonAdapter {
    public final JsonAdapter nullableInquiryFieldMapAdapter;
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public FallbackModeService_SessionIdRequestJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("inquiry-template-id", "inquiry-template-version-id", "inquiry-id", "reference-id", "account-id", "environment", "environment-id", "fields", "theme-set-id");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "inquiryTemplateId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "inquiryTemplateVersion");
        this.nullableInquiryFieldMapAdapter = moshi.adapter(InquiryFieldMap.class, emptySet, "fields");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        InquiryFieldMap inquiryFieldMap = null;
        String str8 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            JsonAdapter jsonAdapter = this.nullableStringAdapter;
            switch (selectName) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("inquiryTemplateId", "inquiry-template-id", jsonReader);
                    }
                    break;
                case 1:
                    str2 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str3 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str4 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str5 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str6 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str7 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    inquiryFieldMap = (InquiryFieldMap) this.nullableInquiryFieldMapAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    str8 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new FallbackModeService.SessionIdRequest(str, str2, str3, str4, str5, str6, str7, inquiryFieldMap, str8);
        }
        throw Util.missingProperty("inquiryTemplateId", "inquiry-template-id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        FallbackModeService.SessionIdRequest sessionIdRequest = (FallbackModeService.SessionIdRequest) obj;
        jsonWriter.getClass();
        if (sessionIdRequest == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("inquiry-template-id");
        this.stringAdapter.toJson(jsonWriter, sessionIdRequest.inquiryTemplateId);
        jsonWriter.name("inquiry-template-version-id");
        String str = sessionIdRequest.inquiryTemplateVersion;
        JsonAdapter jsonAdapter = this.nullableStringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("inquiry-id");
        jsonAdapter.toJson(jsonWriter, sessionIdRequest.inquiryId);
        jsonWriter.name("reference-id");
        jsonAdapter.toJson(jsonWriter, sessionIdRequest.referenceId);
        jsonWriter.name("account-id");
        jsonAdapter.toJson(jsonWriter, sessionIdRequest.accountId);
        jsonWriter.name("environment");
        jsonAdapter.toJson(jsonWriter, sessionIdRequest.environment);
        jsonWriter.name("environment-id");
        jsonAdapter.toJson(jsonWriter, sessionIdRequest.environmentId);
        jsonWriter.name("fields");
        this.nullableInquiryFieldMapAdapter.toJson(jsonWriter, sessionIdRequest.fields);
        jsonWriter.name("theme-set-id");
        jsonAdapter.toJson(jsonWriter, sessionIdRequest.themeSetId);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(58, "GeneratedJsonAdapter(FallbackModeService.SessionIdRequest)");
    }
}
