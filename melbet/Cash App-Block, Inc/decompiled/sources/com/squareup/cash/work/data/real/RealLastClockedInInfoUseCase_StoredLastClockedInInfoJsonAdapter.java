package com.squareup.cash.work.data.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.work.data.real.RealLastClockedInInfoUseCase;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/data/real/RealLastClockedInInfoUseCase_StoredLastClockedInInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/data/real/RealLastClockedInInfoUseCase$StoredLastClockedInInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RealLastClockedInInfoUseCase_StoredLastClockedInInfoJsonAdapter extends JsonAdapter {
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public RealLastClockedInInfoUseCase_StoredLastClockedInInfoJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("jobToken", "merchantToken", "teamMemberId", "locationToken");
        this.stringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "jobToken");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName != -1) {
                JsonAdapter jsonAdapter = this.stringAdapter;
                if (selectName == 0) {
                    str = (String) jsonAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("jobToken", "jobToken", jsonReader);
                    }
                } else if (selectName == 1) {
                    str2 = (String) jsonAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("merchantToken", "merchantToken", jsonReader);
                    }
                } else if (selectName == 2) {
                    str3 = (String) jsonAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("teamMemberId", "teamMemberId", jsonReader);
                    }
                } else if (selectName == 3 && (str4 = (String) jsonAdapter.fromJson(jsonReader)) == null) {
                    throw Util.unexpectedNull("locationToken", "locationToken", jsonReader);
                }
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("jobToken", "jobToken", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("merchantToken", "merchantToken", jsonReader);
        }
        if (str3 == null) {
            throw Util.missingProperty("teamMemberId", "teamMemberId", jsonReader);
        }
        if (str4 != null) {
            return new RealLastClockedInInfoUseCase.StoredLastClockedInInfo(str, str2, str3, str4);
        }
        throw Util.missingProperty("locationToken", "locationToken", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        RealLastClockedInInfoUseCase.StoredLastClockedInInfo storedLastClockedInInfo = (RealLastClockedInInfoUseCase.StoredLastClockedInInfo) obj;
        jsonWriter.getClass();
        if (storedLastClockedInInfo == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("jobToken");
        String str = storedLastClockedInInfo.jobToken;
        JsonAdapter jsonAdapter = this.stringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("merchantToken");
        jsonAdapter.toJson(jsonWriter, storedLastClockedInInfo.merchantToken);
        jsonWriter.name("teamMemberId");
        jsonAdapter.toJson(jsonWriter, storedLastClockedInInfo.teamMemberId);
        jsonWriter.name("locationToken");
        jsonAdapter.toJson(jsonWriter, storedLastClockedInInfo.locationToken);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(74, "GeneratedJsonAdapter(RealLastClockedInInfoUseCase.StoredLastClockedInInfo)");
    }
}
