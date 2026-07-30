package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a {
    private static final JsonReader.a NAMES = JsonReader.a.of(com.baidu.ar.k.f2621r, "x", "y");

    private a() {
    }

    public static com.airbnb.lottie.model.animatable.e parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(z.parse(jsonReader, hVar));
            }
            jsonReader.endArray();
            u.setEndFrames(arrayList);
        } else {
            arrayList.add(new com.airbnb.lottie.value.a(s.jsonToPoint(jsonReader, com.airbnb.lottie.utils.j.dpScale())));
        }
        return new com.airbnb.lottie.model.animatable.e(arrayList);
    }

    static com.airbnb.lottie.model.animatable.m parseSplitPath(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        jsonReader.beginObject();
        com.airbnb.lottie.model.animatable.e eVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        boolean z7 = false;
        while (jsonReader.peek() != JsonReader.Token.END_OBJECT) {
            int selectName = jsonReader.selectName(NAMES);
            if (selectName == 0) {
                eVar = parse(jsonReader, hVar);
            } else if (selectName != 1) {
                if (selectName != 2) {
                    jsonReader.skipName();
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonReader.Token.STRING) {
                    jsonReader.skipValue();
                    z7 = true;
                } else {
                    bVar2 = d.parseFloat(jsonReader, hVar);
                }
            } else if (jsonReader.peek() == JsonReader.Token.STRING) {
                jsonReader.skipValue();
                z7 = true;
            } else {
                bVar = d.parseFloat(jsonReader, hVar);
            }
        }
        jsonReader.endObject();
        if (z7) {
            hVar.addWarning("Lottie doesn't support expressions.");
        }
        return eVar != null ? eVar : new com.airbnb.lottie.model.animatable.i(bVar, bVar2);
    }
}
