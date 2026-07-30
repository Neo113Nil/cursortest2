package com.airbnb.lottie.parser;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.baidu.platform.comapi.map.MapBundleKey;

/* loaded from: classes.dex */
class e {
    private static final JsonReader.a BLUR_EFFECT_NAMES = JsonReader.a.of("ef");
    private static final JsonReader.a INNER_BLUR_EFFECT_NAMES = JsonReader.a.of(MapBundleKey.MapObjKey.OBJ_TYPE, "v");

    e() {
    }

    @Nullable
    private static com.airbnb.lottie.model.content.a maybeParseInnerEffect(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        jsonReader.beginObject();
        com.airbnb.lottie.model.content.a aVar = null;
        while (true) {
            boolean z7 = false;
            while (jsonReader.hasNext()) {
                int selectName = jsonReader.selectName(INNER_BLUR_EFFECT_NAMES);
                if (selectName != 0) {
                    if (selectName != 1) {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    } else if (z7) {
                        aVar = new com.airbnb.lottie.model.content.a(d.parseFloat(jsonReader, hVar));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (jsonReader.nextInt() == 0) {
                    z7 = true;
                }
            }
            jsonReader.endObject();
            return aVar;
        }
    }

    @Nullable
    static com.airbnb.lottie.model.content.a parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        com.airbnb.lottie.model.content.a aVar = null;
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(BLUR_EFFECT_NAMES) != 0) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.airbnb.lottie.model.content.a maybeParseInnerEffect = maybeParseInnerEffect(jsonReader, hVar);
                    if (maybeParseInnerEffect != null) {
                        aVar = maybeParseInnerEffect;
                    }
                }
                jsonReader.endArray();
            }
        }
        return aVar;
    }
}
