package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
class n {
    private static final JsonReader.a NAMES = JsonReader.a.of("fFamily", "fName", "fStyle", "ascent");

    private n() {
    }

    static com.airbnb.lottie.model.b parse(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f8 = 0.0f;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(NAMES);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                str2 = jsonReader.nextString();
            } else if (selectName == 2) {
                str3 = jsonReader.nextString();
            } else if (selectName != 3) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                f8 = (float) jsonReader.nextDouble();
            }
        }
        jsonReader.endObject();
        return new com.airbnb.lottie.model.b(str, str2, str3, f8);
    }
}
