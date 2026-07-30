package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
class m0 {
    private static final JsonReader.a NAMES = JsonReader.a.of("s", "e", "o", "nm", "m", "hd");

    private m0() {
    }

    static ShapeTrimPath parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        String str = null;
        ShapeTrimPath.Type type = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        boolean z7 = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(NAMES);
            if (selectName == 0) {
                bVar = d.parseFloat(jsonReader, hVar, false);
            } else if (selectName == 1) {
                bVar2 = d.parseFloat(jsonReader, hVar, false);
            } else if (selectName == 2) {
                bVar3 = d.parseFloat(jsonReader, hVar, false);
            } else if (selectName == 3) {
                str = jsonReader.nextString();
            } else if (selectName == 4) {
                type = ShapeTrimPath.Type.forId(jsonReader.nextInt());
            } else if (selectName != 5) {
                jsonReader.skipValue();
            } else {
                z7 = jsonReader.nextBoolean();
            }
        }
        return new ShapeTrimPath(str, type, bVar, bVar2, bVar3, z7);
    }
}
