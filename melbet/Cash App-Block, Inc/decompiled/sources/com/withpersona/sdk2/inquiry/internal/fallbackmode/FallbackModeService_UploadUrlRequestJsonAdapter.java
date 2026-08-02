package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_UploadUrlRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FallbackModeService_UploadUrlRequestJsonAdapter extends JsonAdapter {
    public final JsonAdapter longAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public FallbackModeService_UploadUrlRequestJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("expected-content-length", "expected-content-type");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "expectedContentLength");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "expectedContentType");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        Long l = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("expectedContentLength", "expected-content-length", jsonReader);
                }
            } else if (selectName == 1 && (str = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("expectedContentType", "expected-content-type", jsonReader);
            }
        }
        jsonReader.endObject();
        if (l == null) {
            throw Util.missingProperty("expectedContentLength", "expected-content-length", jsonReader);
        }
        long longValue = l.longValue();
        if (str != null) {
            return new FallbackModeService.UploadUrlRequest(longValue, str);
        }
        throw Util.missingProperty("expectedContentType", "expected-content-type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        FallbackModeService.UploadUrlRequest uploadUrlRequest = (FallbackModeService.UploadUrlRequest) obj;
        jsonWriter.getClass();
        if (uploadUrlRequest == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("expected-content-length");
        BalanceFeedKt$$ExternalSyntheticOutline0.m(uploadUrlRequest.expectedContentLength, this.longAdapter, jsonWriter, "expected-content-type");
        this.stringAdapter.toJson(jsonWriter, uploadUrlRequest.expectedContentType);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(58, "GeneratedJsonAdapter(FallbackModeService.UploadUrlRequest)");
    }
}
