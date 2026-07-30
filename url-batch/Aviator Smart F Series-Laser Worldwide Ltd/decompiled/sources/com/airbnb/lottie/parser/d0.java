package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
class d0 {
    private static final JsonReader.a NAMES = JsonReader.a.of("nm", "p", "s", "r", "hd");

    private d0() {
    }

    static com.airbnb.lottie.model.content.g parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        String str = null;
        com.airbnb.lottie.model.animatable.m mVar = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        boolean z7 = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(NAMES);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                mVar = a.parseSplitPath(jsonReader, hVar);
            } else if (selectName == 2) {
                fVar = d.parsePoint(jsonReader, hVar);
            } else if (selectName == 3) {
                bVar = d.parseFloat(jsonReader, hVar);
            } else if (selectName != 4) {
                jsonReader.skipValue();
            } else {
                z7 = jsonReader.nextBoolean();
            }
        }
        return new com.airbnb.lottie.model.content.g(str, mVar, fVar, bVar, z7);
    }
}
