package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.baidu.ar.lc;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
class q {
    private static final JsonReader.a NAMES = JsonReader.a.of("nm", "g", "o", "t", "s", "e", "w", lc.f2723g, "lj", "ml", "hd", "d");
    private static final JsonReader.a GRADIENT_NAMES = JsonReader.a.of("p", com.baidu.ar.k.f2621r);
    private static final JsonReader.a DASH_PATTERN_NAMES = JsonReader.a.of("n", "v");

    private q() {
    }

    static com.airbnb.lottie.model.content.f parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        String str;
        com.airbnb.lottie.model.animatable.c cVar;
        ArrayList arrayList = new ArrayList();
        String str2 = null;
        GradientType gradientType = null;
        com.airbnb.lottie.model.animatable.c cVar2 = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        com.airbnb.lottie.model.animatable.f fVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        float f8 = 0.0f;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        boolean z7 = false;
        com.airbnb.lottie.model.animatable.d dVar = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    str2 = jsonReader.nextString();
                    continue;
                case 1:
                    str = str2;
                    jsonReader.beginObject();
                    int i8 = -1;
                    while (jsonReader.hasNext()) {
                        int selectName = jsonReader.selectName(GRADIENT_NAMES);
                        if (selectName != 0) {
                            cVar = cVar2;
                            if (selectName != 1) {
                                jsonReader.skipName();
                                jsonReader.skipValue();
                            } else {
                                cVar2 = d.parseGradientColor(jsonReader, hVar, i8);
                            }
                        } else {
                            cVar = cVar2;
                            i8 = jsonReader.nextInt();
                        }
                        cVar2 = cVar;
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    dVar = d.parseInteger(jsonReader, hVar);
                    continue;
                case 3:
                    str = str2;
                    gradientType = jsonReader.nextInt() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    fVar = d.parsePoint(jsonReader, hVar);
                    continue;
                case 5:
                    fVar2 = d.parsePoint(jsonReader, hVar);
                    continue;
                case 6:
                    bVar = d.parseFloat(jsonReader, hVar);
                    continue;
                case 7:
                    str = str2;
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.nextInt() - 1];
                    break;
                case 8:
                    str = str2;
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.nextInt() - 1];
                    break;
                case 9:
                    str = str2;
                    f8 = (float) jsonReader.nextDouble();
                    break;
                case 10:
                    z7 = jsonReader.nextBoolean();
                    continue;
                case 11:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str3 = null;
                        com.airbnb.lottie.model.animatable.b bVar3 = null;
                        while (jsonReader.hasNext()) {
                            int selectName2 = jsonReader.selectName(DASH_PATTERN_NAMES);
                            if (selectName2 != 0) {
                                com.airbnb.lottie.model.animatable.b bVar4 = bVar2;
                                if (selectName2 != 1) {
                                    jsonReader.skipName();
                                    jsonReader.skipValue();
                                } else {
                                    bVar3 = d.parseFloat(jsonReader, hVar);
                                }
                                bVar2 = bVar4;
                            } else {
                                str3 = jsonReader.nextString();
                            }
                        }
                        com.airbnb.lottie.model.animatable.b bVar5 = bVar2;
                        jsonReader.endObject();
                        if (str3.equals("o")) {
                            bVar2 = bVar3;
                        } else {
                            if (str3.equals("d") || str3.equals("g")) {
                                hVar.setHasDashPattern(true);
                                arrayList.add(bVar3);
                            }
                            bVar2 = bVar5;
                        }
                    }
                    com.airbnb.lottie.model.animatable.b bVar6 = bVar2;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add((com.airbnb.lottie.model.animatable.b) arrayList.get(0));
                    }
                    bVar2 = bVar6;
                    continue;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    continue;
            }
            str2 = str;
        }
        String str4 = str2;
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        }
        return new com.airbnb.lottie.model.content.f(str4, gradientType, cVar2, dVar, fVar, fVar2, bVar, lineCapType, lineJoinType, f8, arrayList, bVar2, z7);
    }
}
