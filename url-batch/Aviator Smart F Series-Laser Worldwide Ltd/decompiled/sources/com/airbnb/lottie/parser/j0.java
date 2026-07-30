package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;

/* loaded from: classes.dex */
class j0 {
    private static final JsonReader.a NAMES = JsonReader.a.of("nm", "hd", com.moyoung.dafit.module.common.utils.u.LANGUAGE_IT);

    private j0() {
    }

    static com.airbnb.lottie.model.content.l parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z7 = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(NAMES);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                z7 = jsonReader.nextBoolean();
            } else if (selectName != 2) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.airbnb.lottie.model.content.c parse = h.parse(jsonReader, hVar);
                    if (parse != null) {
                        arrayList.add(parse);
                    }
                }
                jsonReader.endArray();
            }
        }
        return new com.airbnb.lottie.model.content.l(str, arrayList, z7);
    }
}
