package com.airbnb.lottie.parser;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
public class f0 {
    private static final JsonReader.a NAMES = JsonReader.a.of("nm", "r", "hd");

    private f0() {
    }

    @Nullable
    static com.airbnb.lottie.model.content.i parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        boolean z7 = false;
        String str = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(NAMES);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                bVar = d.parseFloat(jsonReader, hVar, true);
            } else if (selectName != 2) {
                jsonReader.skipValue();
            } else {
                z7 = jsonReader.nextBoolean();
            }
        }
        if (z7) {
            return null;
        }
        return new com.airbnb.lottie.model.content.i(str, bVar);
    }
}
