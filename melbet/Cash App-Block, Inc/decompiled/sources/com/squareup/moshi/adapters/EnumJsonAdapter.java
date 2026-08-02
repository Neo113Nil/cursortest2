package com.squareup.moshi.adapters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes9.dex */
public final class EnumJsonAdapter extends JsonAdapter {
    public final Enum[] constants;
    public final Class enumType;
    public final String[] nameStrings;
    public final JsonReader.Options options;
    public final boolean useFallbackValue;

    public EnumJsonAdapter(Class cls, boolean z) {
        this.enumType = cls;
        this.useFallbackValue = z;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.constants = enumArr;
            this.nameStrings = new String[enumArr.length];
            int i = 0;
            while (true) {
                Enum[] enumArr2 = this.constants;
                if (i >= enumArr2.length) {
                    this.options = JsonReader.Options.of(this.nameStrings);
                    return;
                }
                String name = enumArr2[i].name();
                String[] strArr = this.nameStrings;
                Field field = cls.getField(name);
                Set set = Util.NO_ANNOTATIONS;
                Json json = (Json) field.getAnnotation(Json.class);
                if (json != null) {
                    String name2 = json.name();
                    if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(name2)) {
                        name = name2;
                    }
                }
                strArr[i] = name;
                i++;
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e);
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        int selectString = jsonReader.selectString(this.options);
        if (selectString != -1) {
            return this.constants[selectString];
        }
        String path = jsonReader.getPath();
        if (!this.useFallbackValue) {
            String nextString = jsonReader.nextString();
            StringBuilder sb = new StringBuilder("Expected one of ");
            Recorder$$ExternalSyntheticOutline2.m(" but was ", nextString, " at path ", sb, Arrays.asList(this.nameStrings));
            sb.append(path);
            throw new JsonDataException(sb.toString());
        }
        if (jsonReader.peek() == JsonReader.Token.STRING) {
            jsonReader.skipValue();
            return null;
        }
        throw new JsonDataException("Expected a string but was " + jsonReader.peek() + " at path " + path);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Enum r2 = (Enum) obj;
        if (r2 != null) {
            jsonWriter.value(this.nameStrings[r2.ordinal()]);
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("value was null! Wrap in .nullSafe() to write nullable values.");
        }
    }

    public final String toString() {
        return re$$ExternalSyntheticOutline0.m(this.enumType, new StringBuilder("EnumJsonAdapter("), ")");
    }
}
