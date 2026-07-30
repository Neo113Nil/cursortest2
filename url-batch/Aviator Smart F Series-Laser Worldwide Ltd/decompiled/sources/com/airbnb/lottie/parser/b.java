package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
public class b {
    private static final JsonReader.a PROPERTIES_NAMES = JsonReader.a.of("a");
    private static final JsonReader.a ANIMATABLE_PROPERTIES_NAMES = JsonReader.a.of("fc", "sc", "sw", "t");

    private b() {
    }

    public static com.airbnb.lottie.model.animatable.k parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        jsonReader.beginObject();
        com.airbnb.lottie.model.animatable.k kVar = null;
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(PROPERTIES_NAMES) != 0) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                kVar = parseAnimatableTextProperties(jsonReader, hVar);
            }
        }
        jsonReader.endObject();
        return kVar == null ? new com.airbnb.lottie.model.animatable.k(null, null, null, null) : kVar;
    }

    private static com.airbnb.lottie.model.animatable.k parseAnimatableTextProperties(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        jsonReader.beginObject();
        com.airbnb.lottie.model.animatable.a aVar = null;
        com.airbnb.lottie.model.animatable.a aVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(ANIMATABLE_PROPERTIES_NAMES);
            if (selectName == 0) {
                aVar = d.parseColor(jsonReader, hVar);
            } else if (selectName == 1) {
                aVar2 = d.parseColor(jsonReader, hVar);
            } else if (selectName == 2) {
                bVar = d.parseFloat(jsonReader, hVar);
            } else if (selectName != 3) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                bVar2 = d.parseFloat(jsonReader, hVar);
            }
        }
        jsonReader.endObject();
        return new com.airbnb.lottie.model.animatable.k(aVar, aVar2, bVar, bVar2);
    }
}
