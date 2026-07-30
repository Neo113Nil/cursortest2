package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.baidu.ar.lc;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
class l0 {
    private static final JsonReader.a NAMES = JsonReader.a.of("nm", "c", "w", "o", lc.f2723g, "lj", "ml", "hd", "d");
    private static final JsonReader.a DASH_PATTERN_NAMES = JsonReader.a.of("n", "v");

    private l0() {
    }

    static ShapeStroke parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        com.airbnb.lottie.model.animatable.b bVar;
        ArrayList arrayList = new ArrayList();
        String str = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.a aVar = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        float f8 = 0.0f;
        boolean z7 = false;
        com.airbnb.lottie.model.animatable.d dVar = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    aVar = d.parseColor(jsonReader, hVar);
                    break;
                case 2:
                    bVar3 = d.parseFloat(jsonReader, hVar);
                    break;
                case 3:
                    dVar = d.parseInteger(jsonReader, hVar);
                    break;
                case 4:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.nextInt() - 1];
                    break;
                case 5:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.nextInt() - 1];
                    break;
                case 6:
                    f8 = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    z7 = jsonReader.nextBoolean();
                    break;
                case 8:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str2 = null;
                        bVar = null;
                        while (jsonReader.hasNext()) {
                            int selectName = jsonReader.selectName(DASH_PATTERN_NAMES);
                            if (selectName == 0) {
                                str2 = jsonReader.nextString();
                            } else if (selectName != 1) {
                                jsonReader.skipName();
                                jsonReader.skipValue();
                            } else {
                                bVar = d.parseFloat(jsonReader, hVar);
                            }
                        }
                        jsonReader.endObject();
                        str2.hashCode();
                        switch (str2) {
                            case "d":
                            case "g":
                                hVar.setHasDashPattern(true);
                                arrayList.add(bVar);
                                break;
                            case "o":
                                bVar2 = bVar;
                                break;
                        }
                    }
                    jsonReader.endArray();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((com.airbnb.lottie.model.animatable.b) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        }
        return new ShapeStroke(str, bVar2, arrayList, aVar, dVar, bVar3, lineCapType, lineJoinType, f8, z7);
    }
}
