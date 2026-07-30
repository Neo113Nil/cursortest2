package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
class k0 {
    static JsonReader.a NAMES = JsonReader.a.of("nm", "ind", "ks", "hd");

    private k0() {
    }

    static com.airbnb.lottie.model.content.m parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        String str = null;
        com.airbnb.lottie.model.animatable.h hVar2 = null;
        int i8 = 0;
        boolean z7 = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(NAMES);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                i8 = jsonReader.nextInt();
            } else if (selectName == 2) {
                hVar2 = d.parseShapeData(jsonReader, hVar);
            } else if (selectName != 3) {
                jsonReader.skipValue();
            } else {
                z7 = jsonReader.nextBoolean();
            }
        }
        return new com.airbnb.lottie.model.content.m(str, i8, hVar2, z7);
    }
}
