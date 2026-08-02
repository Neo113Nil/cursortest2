package com.withpersona.sdk2.inquiry.network.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class InternalErrorInfo_NetworkErrorInfoJsonAdapter extends JsonAdapter {
    private final JsonAdapter booleanAdapter;
    private volatile Constructor<InternalErrorInfo.NetworkErrorInfo> constructorRef;
    private final JsonAdapter intAdapter;
    private final JsonAdapter nullableErrorAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("code", "message", "isRecoverable", "responseError");

    public InternalErrorInfo_NetworkErrorInfoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.INSTANCE;
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "code");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "message");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isRecoverable");
        this.nullableErrorAdapter = moshi.adapter(ErrorResponse.Error.class, emptySet, "responseError");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public InternalErrorInfo.NetworkErrorInfo fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        Boolean bool = null;
        ErrorResponse.Error error = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("code", "code", jsonReader);
                }
            } else if (selectName == 1) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("isRecoverable", "isRecoverable", jsonReader);
                }
            } else if (selectName == 3) {
                error = (ErrorResponse.Error) this.nullableErrorAdapter.fromJson(jsonReader);
                i = -9;
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            if (num == null) {
                throw Util.missingProperty("code", "code", jsonReader);
            }
            int intValue = num.intValue();
            if (bool != null) {
                return new InternalErrorInfo.NetworkErrorInfo(intValue, str, bool.booleanValue(), error);
            }
            throw Util.missingProperty("isRecoverable", "isRecoverable", jsonReader);
        }
        Constructor<InternalErrorInfo.NetworkErrorInfo> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = InternalErrorInfo.NetworkErrorInfo.class.getDeclaredConstructor(cls2, String.class, Boolean.TYPE, ErrorResponse.Error.class, cls2, cls);
            this.constructorRef = constructor;
        }
        if (num == null) {
            throw Util.missingProperty("code", "code", jsonReader);
        }
        if (bool != null) {
            return constructor.newInstance(num, str, bool, error, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("isRecoverable", "isRecoverable", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
        if (networkErrorInfo == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("code");
        this.intAdapter.toJson(jsonWriter, Integer.valueOf(networkErrorInfo.getCode()));
        jsonWriter.name("message");
        this.nullableStringAdapter.toJson(jsonWriter, networkErrorInfo.getMessage());
        jsonWriter.name("isRecoverable");
        this.booleanAdapter.toJson(jsonWriter, Boolean.valueOf(networkErrorInfo.isRecoverable()));
        jsonWriter.name("responseError");
        this.nullableErrorAdapter.toJson(jsonWriter, networkErrorInfo.getResponseError());
        jsonWriter.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(56, "GeneratedJsonAdapter(InternalErrorInfo.NetworkErrorInfo)");
    }
}
