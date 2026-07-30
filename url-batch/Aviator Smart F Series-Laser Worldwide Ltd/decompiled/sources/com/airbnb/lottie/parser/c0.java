package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
class c0 {
    private static final JsonReader.a NAMES = JsonReader.a.of("nm", "sy", com.moyoung.dafit.module.common.utils.u.LANGUAGE_PT, "p", "r", "or", "os", "ir", "is", "hd", "d");

    private c0() {
    }

    static PolystarShape parse(JsonReader jsonReader, com.airbnb.lottie.h hVar, int i8) {
        boolean z7 = i8 == 3;
        String str = null;
        PolystarShape.Type type = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.m mVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        com.airbnb.lottie.model.animatable.b bVar4 = null;
        com.airbnb.lottie.model.animatable.b bVar5 = null;
        com.airbnb.lottie.model.animatable.b bVar6 = null;
        boolean z8 = false;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    type = PolystarShape.Type.forValue(jsonReader.nextInt());
                    break;
                case 2:
                    bVar = d.parseFloat(jsonReader, hVar, false);
                    break;
                case 3:
                    mVar = a.parseSplitPath(jsonReader, hVar);
                    break;
                case 4:
                    bVar2 = d.parseFloat(jsonReader, hVar, false);
                    break;
                case 5:
                    bVar4 = d.parseFloat(jsonReader, hVar);
                    break;
                case 6:
                    bVar6 = d.parseFloat(jsonReader, hVar, false);
                    break;
                case 7:
                    bVar3 = d.parseFloat(jsonReader, hVar);
                    break;
                case 8:
                    bVar5 = d.parseFloat(jsonReader, hVar, false);
                    break;
                case 9:
                    z8 = jsonReader.nextBoolean();
                    break;
                case 10:
                    if (jsonReader.nextInt() != 3) {
                        z7 = false;
                        break;
                    } else {
                        z7 = true;
                        break;
                    }
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        return new PolystarShape(str, type, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z8, z7);
    }
}
