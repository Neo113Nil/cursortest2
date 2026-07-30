package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.Collections;

/* loaded from: classes.dex */
class p {
    private static final JsonReader.a NAMES = JsonReader.a.of("nm", "g", "o", "t", "s", "e", "r", "hd");
    private static final JsonReader.a GRADIENT_NAMES = JsonReader.a.of("p", com.baidu.ar.k.f2621r);

    private p() {
    }

    static com.airbnb.lottie.model.content.e parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        com.airbnb.lottie.model.animatable.d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        GradientType gradientType = null;
        com.airbnb.lottie.model.animatable.c cVar = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        com.airbnb.lottie.model.animatable.f fVar2 = null;
        boolean z7 = false;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    jsonReader.beginObject();
                    int i8 = -1;
                    while (jsonReader.hasNext()) {
                        int selectName = jsonReader.selectName(GRADIENT_NAMES);
                        if (selectName == 0) {
                            i8 = jsonReader.nextInt();
                        } else if (selectName != 1) {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        } else {
                            cVar = d.parseGradientColor(jsonReader, hVar, i8);
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    dVar = d.parseInteger(jsonReader, hVar);
                    break;
                case 3:
                    gradientType = jsonReader.nextInt() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    fVar = d.parsePoint(jsonReader, hVar);
                    break;
                case 5:
                    fVar2 = d.parsePoint(jsonReader, hVar);
                    break;
                case 6:
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z7 = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.e(str, gradientType, fillType, cVar, dVar == null ? new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100))) : dVar, fVar, fVar2, null, null, z7);
    }
}
