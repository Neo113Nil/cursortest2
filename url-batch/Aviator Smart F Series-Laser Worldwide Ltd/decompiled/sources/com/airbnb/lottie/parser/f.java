package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
class f {
    private static final JsonReader.a NAMES = JsonReader.a.of("nm", "p", "s", "hd", "d");

    private f() {
    }

    static com.airbnb.lottie.model.content.b parse(JsonReader jsonReader, com.airbnb.lottie.h hVar, int i8) {
        boolean z7 = i8 == 3;
        String str = null;
        com.airbnb.lottie.model.animatable.m mVar = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        boolean z8 = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(NAMES);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                mVar = a.parseSplitPath(jsonReader, hVar);
            } else if (selectName == 2) {
                fVar = d.parsePoint(jsonReader, hVar);
            } else if (selectName == 3) {
                z8 = jsonReader.nextBoolean();
            } else if (selectName != 4) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                z7 = jsonReader.nextInt() == 3;
            }
        }
        return new com.airbnb.lottie.model.content.b(str, mVar, fVar, z7, z8);
    }
}
