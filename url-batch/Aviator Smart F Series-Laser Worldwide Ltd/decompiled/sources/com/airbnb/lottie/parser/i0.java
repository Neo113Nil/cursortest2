package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.Collections;

/* loaded from: classes.dex */
class i0 {
    private static final JsonReader.a NAMES = JsonReader.a.of("nm", "c", "o", "fillEnabled", "r", "hd");

    private i0() {
    }

    static com.airbnb.lottie.model.content.k parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        com.airbnb.lottie.model.animatable.d dVar = null;
        String str = null;
        com.airbnb.lottie.model.animatable.a aVar = null;
        int i8 = 1;
        boolean z7 = false;
        boolean z8 = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(NAMES);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                aVar = d.parseColor(jsonReader, hVar);
            } else if (selectName == 2) {
                dVar = d.parseInteger(jsonReader, hVar);
            } else if (selectName == 3) {
                z7 = jsonReader.nextBoolean();
            } else if (selectName == 4) {
                i8 = jsonReader.nextInt();
            } else if (selectName != 5) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                z8 = jsonReader.nextBoolean();
            }
        }
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        }
        return new com.airbnb.lottie.model.content.k(str, z7, i8 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar, z8);
    }
}
