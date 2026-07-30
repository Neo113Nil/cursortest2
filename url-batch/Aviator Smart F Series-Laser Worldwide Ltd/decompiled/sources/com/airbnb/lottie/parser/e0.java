package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
class e0 {
    private static final JsonReader.a NAMES = JsonReader.a.of("nm", "c", "o", "tr", "hd");

    private e0() {
    }

    static com.airbnb.lottie.model.content.h parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        String str = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.l lVar = null;
        boolean z7 = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(NAMES);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                bVar = d.parseFloat(jsonReader, hVar, false);
            } else if (selectName == 2) {
                bVar2 = d.parseFloat(jsonReader, hVar, false);
            } else if (selectName == 3) {
                lVar = c.parse(jsonReader, hVar);
            } else if (selectName != 4) {
                jsonReader.skipValue();
            } else {
                z7 = jsonReader.nextBoolean();
            }
        }
        return new com.airbnb.lottie.model.content.h(str, bVar, bVar2, lVar, z7);
    }
}
